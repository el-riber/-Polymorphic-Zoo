# Polymorphic Zoo (Java)

A small Java program demonstrating **polymorphism** and **method overloading** using a zoo scenario.

## Features
- `Animal` (abstract) in package `zoo` with:
  - `protected String name`
  - abstract `makeSound()`
  - overloaded concrete `makeSound(int times)` (repeats the polymorphic sound)
  - concrete `getName()`
- Subclasses: `Lion`, `Elephant`, `Monkey` each `override makeSound()`.
- `ZooDemo` main:
  - Instantiates animals
  - Stores them in `List<Animal>`
  - Calls both `makeSound()` and `makeSound(int)`

## Build & Run
```bash
javac -d out $(find src -name "*.java")
java -cp out zoo.ZooDemo
