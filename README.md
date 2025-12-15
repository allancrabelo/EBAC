# Reflections in Java:

Reflection is a feature that allows a program to inspect and modify classes, objects, methods, and fields at runtime, even if they are private. With Reflection, you can dynamically create class instances, invoke methods, access or modify fields, and retrieve information about annotations, interfaces, and inheritance. It is widely used in frameworks, testing libraries, and ORMs like Spring and Hibernate for flexibility and automation.

## Main Uses:

- Retrieve information about classes, methods, and fields (Class<?>, Method, Field).
- Invoke methods dynamically (method.invoke(obj, args)).
- Create instances at runtime (clazz.newInstance() or clazz.getDeclaredConstructor().newInstance()).
- Access or modify private fields (field.setAccessible(true)).

## Caution:
Reflection can affect performance and should be used carefully, as it can break encapsulation.