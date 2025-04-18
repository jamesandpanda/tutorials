# Tutorial 8

## A. Generic Programming

### Part 1 - Implementation

Inside `src/stack`, there are a series of stubs for a `Stack` class which takes in a generic type. There are a series of tests inside `StackTest.java` which currently fail.

Implement the methods so that the tests pass, using an `ArrayList` to store the internal data structure. Answer the following questions:

1. What is `E`?
2. What is the `Iterable` interface? Why does it have an `E` as well? What methods does it force us to implement?
3. When completing `toArrayList`, why do we need to make a copy rather than just returning our internal ArrayList?
4. What does the `.iterator()` method allow us to do? Discuss the test inside `StackTest.java`.

### Part 2 - Utility Functions & Iterators

Inside `Stack.java`, add the following static utility functions:

```java
public static Integer sumStack(Stack<? extends Integer> stack);
```

5. What does the `<? extends Type>` and `<? super Type>` mean?
6. How could we change our class definition to restrict the parameterisation?

```java
public static void prettyPrint(Stack<?> stack);
```

Having pushed the words "hello", "how", "are", "you", "today" on, the following should be printed:

```
[today you are how hello]
```

7. What is the difference between `?` and `E`?
8. We need to go through the stack and print out each element with a space, except for the last one (which doesn't have a space). There are a couple of ways to do this, but create an `Iterator` and use the `.next()` method to traverse the stack.

## B. Singleton Pattern & Concurrency

Consider the Bank Account class from Lab 04. What if multiple people try to access the bank account at the same time? Inside `src/unsw/heist` are three classes:

* `BankAccount`, from Lab 04.
* `BankAccountAccessor`. Objects of this type are an instance of an access to a bank account to withdraw money a given number of times by given amounts.
* `BankAccountThreadedAccessor`, which `extends Thread`, and overrides the method `run` to create a new instance of `BankAccountAccessor` and access the bank.

Currently when you run the code, you will find that each thread accesses the bank at the same time (which doesn't make sense). Most of the time this just means that each accessor tries to make as many transactions as they can before the bank runs out of money:

```
The balance is: $100
Rio is accessing the bank.
Denver is accessing the bank.
Tokyo is accessing the bank.
Tokyo successfully withdrew $6
Denver successfully withdrew $49
Rio successfully withdrew $20
Tokyo successfully withdrew $6
Denver failed to withdraw $49.
Rio failed to withdraw $20.
Tokyo successfully withdrew $6
Rio failed to withdraw $20.
Denver is leaving the bank, the balance is $13
Tokyo successfully withdrew $6
Rio failed to withdraw $20.
Tokyo successfully withdrew $6
Rio failed to withdraw $20.
Tokyo failed to withdraw $6.
Rio is leaving the bank, the balance is $1
Tokyo is leaving the bank, the balance is $1
```

In some cases though, some strange behaviour is produced by this **race condition**:

```
Denver is accessing the bank.
Tokyo is accessing the bank.
The final balance is: $100
Rio is accessing the bank.
Rio successfully withdrew $20
Tokyo successfully withdrew $6
Denver successfully withdrew $49
Tokyo successfully withdrew $6
Denver failed to withdraw $49.
Rio successfully withdrew $20
Rio failed to withdraw $20.
Denver is leaving the bank, the balance is -1
Tokyo failed to withdraw $6.
Rio failed to withdraw $20.
Tokyo failed to withdraw $6.
Rio failed to withdraw $20.
Tokyo failed to withdraw $6.
Tokyo failed to withdraw $6.
Rio is leaving the bank, the balance is -1
Tokyo is leaving the bank, the balance is -1
```

Use the Singleton Pattern to ensure that only one person can access the bank at a time. You can assume for simplicity's sake that only one access to *any* bank account can ever be made at a given time.

## C. Decorator Pattern

Imagine you are running a milk tea store, where customers can order a regular milk tea ($6.00) and optionally add the following toppings on top:
- Pearls, costing $0.80
- Lychee Jelly, costing $0.90
- Milk Foam, costing $1.00

Creating concrete classes for each different type of combination like `MilkTeaWithPearls`, `MilkTeaWithPearlsAndLycheeJelly`, `MilkTeaWithLycheeJellyAndMilkFoam` would certainly get out of hand very quickly! Not to mention, customers should be able to order as many toppings as they would like, so there are actually infinite possibilities for the toppings a customer could want (ignoring how many would actually fit inside the cup!). Design a system in `src/milktea` that uses the Decorator Pattern to fulfill these requirements.

## D. Visitor Pattern

In `src/computer` we have `Computer`s, `Keyboard`s and `Mouse`s which all are of type `ComputerComponent`. We want to be able to 'visit' different types of Computer components by logging the following messages:

```
Looking at computer Corelli with memory 500 GB.
Looking at keyboard Mechanical keyboard which has 36 keys.
Looking at mouse Bluetooth mouse.
```

In particular though, anyone which is visiting a `Computer` must be **validated** prior to being able to visit.

Extend/modify the starter code to use the Visitor Pattern to allow different computer components to be visited.
