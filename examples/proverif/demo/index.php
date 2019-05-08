<?php
// <!-- --------------  START HEADER ------------------->

echo "
<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">
<html lang=\"en\">
<head>
 <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">
 <base href=\"http://proverif16.paris.inria.fr/\">
 <title> Online demo for ProVerif</title>
</head>

<body bgcolor=#ffffcc>
 <table align=center width=1000 cellpadding=10>
 <tr><td align=center bgcolor=$0000ff><font color=white size=6><strong> Welcome to Online Demo for 
	ProVerif</strong> </font></td>
 </tr>
 <tr>
	<td align=center><font><b>Proverif in OCaml by Bruno Blanchet, Vincent Cheval and Marc Sylvestre<br>
Web interface by Sreekanth Malladi and Bruno Blanchet</b> </td>
 </tr> 
 </table> 

<form action=\"".$_SERVER['PHP_SELF']."\" method=\"post\">
";

// <!-- -------------  END HEADER -------------------------->

// ---------------    INITIALIZE VARIABLES ----------------

// delete old files if there is less than 200MB left
global $CLEANUP_SPACE; $CLEANUP_SPACE = 200000000; 

// don't run an analysis if there is less than 100MB left
// we must have $REQUIRED_SPACE <= $CLEANUP_SPACE
global $REQUIRED_SPACE; $REQUIRED_SPACE = 100000000; 

// delay during which the files are guaranteed to be kept, in seconds.
global $DELAY; $DELAY = 1800; 

$protocol = $_POST['inpProtTA'];
$protSelected = $_POST['protSel'];
$loadProtPressed = $_POST['loadProtBtn'];
$analPressed = $_POST['analBtn'];

$protocol = stripslashes( $protocol );

if( $protSelected != "" ) // user made a selection
{
	// Open the selected file in ./protocols folder
	$inpFHand = fopen("./examples/".$protSelected, "r");
	
	// Update $input variable
	$protocol = "";
	while( !feof($inpFHand) )
		$protocol = $protocol.fgets( $inpFHand );
	fclose( $inpFHand );

}

// ------------- END INITIALIZE VARIABLES ----------------


// -------------- START FIRST ROW OF TABLE ----------------

print "<table align=center>";

print "<tr>";  // Print first row (protocol list, load button, input TA).
print <<<HERE
<td valign=top>
<b>Input: Select protocol  </b>
<P>
<select size=15 name=protSel>
       <option value = "secr-auth/NeedhamSchroederPK.pv">Needham-Schroeder public key</option>
       <option value = "secr-auth/NeedhamSchroederPK-corr.pv">Needham-Schroeder-Lowe</option>
       <option value = "secr-auth/WooLamSK-GJ01.pv">Woo-Lam shared key (variant by Gordon and Jeffrey)</option>
       <option value = "secr-auth/WooLamSK-corr-GJ01.pv">Woo-Lam shared key corrected</option>
       <option value = "secr-auth/SimplerYahalom.pv">Simpler Yahalom bidirectional</option>
       <option value = "secr-auth/ssh-transport.pv">SSH Transport</option>
       <option value = "noninterf/OtwayRees.pv">Otway-Rees (strong secrecy)</option>
       <option value = "weaksecr/vote.pv">naive voting protocol (guessing attack)</option>
       <option value = "weaksecr/EKE.pv">EKE (no guessing attack)</option>
       <option value = "weaksecr/AugmentedEKE2.pv">Augmented EKE (no guessing attack)</option>
       <option value = "weaksecr/SignedAugmentedEKE1.pv">Signed augmented EKE (no guessing attack)</option>
       <option value = "choice/macs.pv">Comparison of MAC schemes</option>
       <option value = "choice/proba-pk.pv">Probabilistic public-key encryption</option>
       <option value = "ffgg/ffgg10.pv">ffgg 10</option>
</select>
<P>
<input type="submit" name="loadProtBtn" value="Load Protocol">
</td>
HERE;

print "<td valign=top><b>or enter your protocol below:</b>
<P>
<textarea name=\"inpProtTA\" rows=\"18\" 
cols=\"75\">".$protocol."</textarea></td>";

print "</tr>";


// -------------  END FIRST ROW; START SECOND ROW ------------------


//  ----------  END SECOND ROW, START THIRD ROW  --------------

print "<tr>";

print "<td align=center colspan=2><input type=\"submit\" name=\"analBtn\"
value=\"Verify\">";

print "</tr>";

// ------------  END THIRD ROW, START FOURTH ROW  -------------

if( $analPressed == "Verify" )
{
	analyze( $protocol );
}


// ------------  END FOURTH ROW, START FOOTER   ---------------
echo "
</table>
</form>
There is no security mechanism to protect the confidentiality of
your data, so you should not enter confidential data in this form.
If you want to verify a confidential protocol, please download and install
your own copy of ProVerif.
</body>
</html>";

// ----------       END FOOTER       -------------------------

 // The main function to analyze protocols (first save input protocol, 
 // then prepare input.pl and
 // finally execute expression pl < input.pl 
 function analyze( $protocol )
 {
        global $REQUIRED_SPACE, $CLEANUP_SPACE, $DELAY;

	if($protocol == "")
	{
		print "<font size=18 color=red><b>Warning:</b> Select or 
		enter a protocol!</font>";
		return;
	}


   // determine the session number

   if (disk_free_space(".") < $CLEANUP_SPACE) {
     // not too much free space, do some cleanup
     $dir = scandir("./tmpfiles");
     $size = sizeof($dir);
     $current_time = time();		
     for ($i = 0; $i < $size; ++$i)
     {
        $cur_dir = $dir[$i];
        if (is_numeric($cur_dir)) {
           if (filemtime("./tmpfiles/".$cur_dir) < $current_time - $DELAY) {
             // session too old, delete it
             exec("rm -rf ./tmpfiles/".$cur_dir);
           }
        }
     }

     if (disk_free_space(".") < $REQUIRED_SPACE) {
         print "Error: too many analyses started recently, no more free space to store your files. Please come back later. (Files can get deleted after 30 min.)</form></body></html>";
     }
   }

   $SESSION_NUM = mt_rand(0, 99999999);
   $SESSION_STRING = str_pad($SESSION_NUM, 8, "0", STR_PAD_LEFT);
   $iter = 0;
   while (file_exists("./tmpfiles/".$SESSION_STRING) && ($iter < 10)) {
     $SESSION_NUM = mt_rand(0, 99999999);
     $SESSION_STRING = str_pad($SESSION_NUM, 8, "0", STR_PAD_LEFT);
     $iter++;
   }
   if (file_exists("./tmpfiles/".$SESSION_STRING)) {
         print "Error: I don't manage to find a directory name that is not used, strange!</form></body></html>";
   }

	// WRITE PROTOCOL ENTERED IN INPPROT TEXT AREA
	// TO A FILE, ./tmpfiles/$SESSION_STRING/inpProt

        if (!mkdir("./tmpfiles/".$SESSION_STRING)) 
	   echo "Error: Directory creation failed, strange!</form></body></html>";
	$inpFHand = fopen("./tmpfiles/".$SESSION_STRING."/inpProt.pv", "w");
	fputs( $inpFHand, $protocol );
	fclose( $inpFHand );

	$output = array();
	mkdir("./tmpfiles/".$SESSION_STRING."/html");
	exec("cp cssproverif.css ./tmpfiles/".$SESSION_STRING."/html");

        print "<tr><td colspan=2><A HREF=\"tmpfiles/".$SESSION_STRING."/html/index.html\"><b>ProVerif HTML output</b></A>
<P>
The HTML output is kept for at least 30 minutes. It is kept much longer if there is enough free space. You can obviously save the web pages if you want to keep them.
</td></tr>";
        print "<tr><td colspan=2><b>ProVerif text output: 
	        <P>
                <textarea
                name=\"opTA\" value=\"ProVerif output here\" rows=\"20\"
                cols=\"125\">";

        system("ulimit -t 1000; ulimit -f 50000; ulimit -m 1000000; ./bin/proverif -html ./tmpfiles/".$SESSION_STRING."/html ./tmpfiles/".$SESSION_STRING."/inpProt.pv", $status);

        print "</textarea></td></tr>";
 }
?>
