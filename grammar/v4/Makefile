build:
	java -jar antlr-4.7.1-complete.jar Proverif.g4
	javac Proverif*.java

run:
	java org.antlr.v4.gui.TestRig Proverif proverif $$path

clean:
	rm *.class
	rm *.tokens
	rm *.interp
	rm ProverifLexer*
	rm ProverifParser*
	rm ProverifBase*
	rm ProverifListener*
	
	