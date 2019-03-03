build:
	java -jar antlr-4.7.1-complete.jar Proverif.g4 -visitor
	javac *.java

run:
	java Test $$path

clean:
	rm *.class
	rm *.tokens
	rm *.interp
	rm ProverifLexer*
	rm ProverifParser*
	rm ProverifBase*
	rm ProverifListener*
