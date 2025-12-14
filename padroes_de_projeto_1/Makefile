JAVAC = javac

SRC = Car.java CarFactory.java PopularCar.java LuxuryCar.java PopularFactory.java LuxuryFactory.java Main.java

CLASSES = $(SRC:.java=.class)

all: $(CLASSES)

%.class: %.java
	$(JAVAC) $<

clean:
	rm -f *.class

run: all
	java Main
