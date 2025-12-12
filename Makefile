SRC = $(wildcard *.java)
MAIN = Main

all:
	javac $(SRC)

run: all
	java $(MAIN)

clean:
	rm -f *.class
