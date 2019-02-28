import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        proverifLexer lex = new proverifLexer(new ANTLRFileStream("C:\\Users\\ambro\\Documents\\Studies 2018-2019\\TNCY\\PIDR\\PIDR\\grammar\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        proverifParser g = new proverifParser(tokens, 49100, null);
        try {
            g.programme();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}