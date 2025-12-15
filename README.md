# Streams in Java:

Streams are data flows that allow processing collections in a declarative and functional way without modifying the original data. Introduced in Java 8, they make operations like filtering, mapping, reducing, and sorting concise and readable. Streams can be sequential (processed one by one) or parallel (processed simultaneously using multiple threads).

## Main Operations:

- Intermediate operations (return another stream): filter(), map(), sorted().
- Terminal operations (produce a result or side effect): collect(), forEach(), reduce().

## Advantages:

- Cleaner and more readable code.
- Supports parallel processing.
- Avoids explicit loops and mutations of the original collections.