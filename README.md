# Generics in Java

Generics allow you to write code that works with different data types without duplicating classes or methods for each type. They provide compile-time type safety.

## Key Concepts:

```
Basic Syntax:

List<String> stringList = new ArrayList<>();
```

String is the generic type.

The compiler ensures only Strings can be added to the list.

## Generic Classes:

```
public class Box<T> {
    private T item;

    public void set(T item) { this.item = item; }
    public T get() { return item; }
}
```

T is a generic type.

Example of usage: Box<Integer> intBox = new Box<>();

## Generic Methods:

```
public <T> void printItem(T item) {
    System.out.println(item);
}

```
Can accept any type as argument.

## Bounded Types:

```
public <T extends Number> void showNumber(T number) {
    System.out.println(number);
}
```

Here, T must be a subclass of Number.

## Advantages:

 - Type safety (avoids ClassCastException at runtime).
 - More reusable and readable code.
 - Less unnecessary casting.

Wildcard (?):
```
List<?> list = new ArrayList<String>();
```


Represents any type.
```
Can be bounded: List<? extends Number> or List<? super Integer>.
```
