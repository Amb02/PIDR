### Compilation avec ANTLR4

#### Sous Linux :

##### Setup antlr and your environment : 

1. Download the jar [here](http://www.antlr.org/download/antlr-4.7.1-complete.jar) and save it in a [folder].

2. Add at the end of the bashrc :
	```
	export CLASSPATH = ".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
	alias antlr4='java -Xmx500M -cp "[folder]/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
	alias grun='java org.antlr.v4.gui.TestRig'
	```

3. Restart your shell.

##### Use Antlr

###### Compile the grammar

Move to the folder which contains the grammar ("Proverif.g4").

```
$ antlr4 Proverif.g4
$ javac Proverif.java
```

###### Test a programm

```
// grun is the testing tool, Chat is the name of the grammar, chat the rule that we want to parse
$ grun Proverif proverif
> process
> hello
>
// CTRL+D on Linux (CTRL+Z on Windows)
```

###### What does it happen ?

```
$ grun Proverif proverif -tokens
> process
> hello
>
// CTRL+D on Linux (CTRL+Z on Windows)
```
##### Further informations

Cf. [here](https://tomassetti.me/antlr-mega-tutorial/)
