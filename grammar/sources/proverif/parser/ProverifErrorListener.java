package proverif.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.ArrayList;
import java.util.List;


public class ProverifErrorListener extends BaseErrorListener {
    int count = 0;

    public boolean hasNoError () {
      return count == 0;
    }

    @Override
    public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
      count = count + 1;
      System.out.print("line " + line + ":" + charPositionInLine + " " + msg + " ");
    }
}
