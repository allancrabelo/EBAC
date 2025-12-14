# Design Patterns

Design Patterns are reusable solutions to recurring problems in software design. They are not copy paste code, but conceptual models that help organize responsibilities, reduce coupling, and improve maintainability. They became popular after the book *Design Patterns: Elements of Reusable Object-Oriented Software*, written by the famous Gang of Four, and since then developers have been using them to sound smarter during architecture discussions.

Classic design patterns are usually divided into three main categories: creational, structural, and behavioral. Creational patterns focus on how objects are created, aiming to make this process more flexible and decoupled. Examples include Singleton, which ensures only one instance of a class exists, Factory Method, which delegates object creation to subclasses, and Builder, which allows complex objects to be constructed step by step without turning constructors into unreadable monsters.

Structural patterns deal with how classes and objects are composed to form larger structures while keeping the system flexible. Patterns like Adapter allow incompatible interfaces to work together, Decorator adds new behavior without modifying existing code, and Facade provides a simplified interface to complex subsystems, so you do not have to understand everything just to use it.

## Singleton

The Singleton pattern ensures that a class has only one instance during the entire lifecycle of an application and provides a global access point to it. It is commonly used for configurations, loggers, or shared resources, where having multiple instances would cause inconsistencies and unnecessary chaos.

A simple example of Singleton is a configuration object that must be shared across the entire system.

```c
// Conceptual example in C (simulating a Singleton)

typedef struct {
    int debug;
} Config;

Config *get_config(void)
{
    static Config instance; // the one and only
    return &instance;
}
```

In this example, the instance variable is created only once. Every call to get_config returns the same instance, ensuring that the whole program shares the same configuration.

## Builder

The Builder pattern is used to construct complex objects step by step, separating the construction process from the final representation. It is useful when an object has many parts or configurations, avoiding huge constructors that nobody wants to maintain. With Builder, the same construction process can create different variations of an object in a clean and readable way.

```c
// Product
typedef struct {
    int cheese;
    int bacon;
    int salad;
} Burger;

// Builder function
Burger build_burger(int cheese, int bacon, int salad)
{
    Burger burger;
    burger.cheese = cheese;
    burger.bacon = bacon;
    burger.salad = salad;
    return burger;
}

```
Here, the object is built by explicitly defining its parts, making the creation process clear and flexible.

## Abstract Factory

The Abstract Factory pattern provides an interface for creating families of related objects without specifying their concrete classes. It is useful when a system must remain independent from how its objects are created and when it is important that objects used together are compatible with each other. This pattern is common in systems that support multiple themes, platforms, or environments, such as different UI styles for different operating systems.

```c
// Abstract interfaces (conceptual)

typedef struct {
    void (*draw)(void);
} Button;

typedef struct {
    Button (*create_button)(void);
} UIFactory;

```

```c
// Windows implementation

void draw_windows_button(void)
{
    // Draw button in Windows style
}

Button create_windows_button(void)
{
    Button btn;
    btn.draw = draw_windows_button;
    return btn;
}

```

```c
// Mac implementation

void draw_mac_button(void)
{
    // Draw button in Mac style
}

Button create_mac_button(void)
{
    Button btn;
    btn.draw = draw_mac_button;
    return btn;
}

```
With Abstract Factory, the client code does not care whether it is creating Windows or Mac components. It simply asks the factory, and everything stays consistent. Architecture magic, but with rules.