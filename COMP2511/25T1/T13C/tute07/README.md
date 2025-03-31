# Tutorial 07
## A. Composite Pattern
Inside `src/calculator`, use the Composite Pattern to write a simple calculator that evaluates an expression. Your calculator should be able to:

- Add two expressions
- Subtract two expressions
- Multiply two expressions
- Divide two expressions

There should be a `Calculator` class as well which can have an expression passed in, and calculate that expression.

Design a solution, create stubs, write failing unit tests, then implement the functions.

## B. Factory Pattern
Inside `src/characters`, there is some code to model a simple game with three types of characters: Swordsmen, Archers and Tanks. Each character has attack, defence, speed and range statistics, and these are determined randomly (except range).

- Swordsmen have an attack stat between 1-3, a defence stat between 1-3, a speed stat between 1-3 and a fixed range of 1.
- Archers have an attack stat between 2-4, a defence stat between 1-2, a speed stat between 1-3 and a fixed range of 2.
- Tanks have an attack stat between 1-2, a defence stat between 3-5, a speed stat between 1-2 and a fixed range of 1.

We won't concern ourselves with any logic of the game in this exercise per se, but instead the creation of objects.

Consider the current creation logic in `Game.java`.
1. How does the Factory Pattern (AKA Factory Method) allow us to abstract construction of objects, and how will it improve our design with this new requirement?
2. Use the Factory Pattern to create a series of object factories for each of the character types, and change the `main` method of `Game.java` to use these factories.

## C. Abstract Factory Pattern
This exercise continues on from Exercise B.

Suppose that new 'super' types of each character are introduced, so alongside the Swordsmen, Archers and Tanks defined in Exercise B (now termed as Standard), we also have Super Swordsmen, Archers and Tanks.

The statistics of super characters are determined randomly (except range) in the following way:
- Super Swordsmen have an attack stat between 11-13, a defence stat between 11-13, a speed stat between 1-3 and a fixed range of 2.
- Super Archers have an attack stat between 15-20, a defence stat between 3-5, a speed stat between 2-4 and a fixed range of 4.
- Super Tanks have an attack stat between 5-10, a defence stat between 20-30, a speed stat between 1-2 and a fixed range of 1.

Use the Abstract Factory Pattern to realise these new requirements in `src/characters2`.
