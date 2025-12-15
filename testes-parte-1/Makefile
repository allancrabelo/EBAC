JC = javac
JAVA = java
JUNIT_JAR = libs/junit-platform-console-standalone-1.10.0.jar
MAIN = FilterWomen

compile:
	$(JC) -cp $(JUNIT_JAR) FilterWomen.java FilterWomenTest.java

run: compile
	$(JAVA) $(MAIN)

test: compile
	$(JAVA) -jar $(JUNIT_JAR) --class-path . --scan-class-path

clean:
	rm -f *.class
