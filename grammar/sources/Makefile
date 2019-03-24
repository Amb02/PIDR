build:
	java -jar antlr-4.7.1-complete.jar proverif/parser/Proverif.g4 -visitor
	javac proverif/*.java

run:
	java proverif.Main $$path

clean:
	find . -name "*.class" -exec rm {} \;
	find . -name "*.interp" -exec rm {} \;
	find . -name "*.tokens" -exec rm {} \;
	find . -name "ProverifLexer*" -exec rm {} \;
	find . -name "ProverifParser*" -exec rm {} \;
	find . -name "ProverifBase*" -exec rm {} \;
	find . -name "ProverifListener*" -exec rm {} \;
	find . -name "ProverifVisitor.java" -exec rm {} \;
	rm -r logs/*
