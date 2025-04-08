# Tutorial 08
## A. Generic Programming
### Part 1 - Implementation
Inside `src/list`, there is code for a homebrew linked list that stores values of type `int` and allows you to add values, evaluate the size of the list and print out all of the values in one line. The current implementation doesn't allow a user to store any types inside of the linked list outside of integers. Would making a new class, copy-pasting all of the code in `MyLinkedList.java` and simply switching the type used be a feasible approach?

Using generics, modify the code in `MyLinkedList.java` so that the list can store values of any given type.

### Part 2 - Iterators
Implement an iterator for the `MyLinkedList` class which allows users to traverse through all of the elements inside of the list without exposing its internal representation.

### Part 3 - Generic Type Bounds
Inside `MySortedLinkedList.java`, there is a code for a subclass of the (original) version of `MyLinkedList` that maintains a sorted linked list by making sure that any new elements in the list are placed in order.

- To enforce that your generic type `T` is either a class `A` or any **sub**classes of `A`, you can use the syntax `<T extends A>` (this also applies if `A` is an interface and you want some generic type that implements that interface).

Modify the code using an appropriate generic type bound so that the list can store values of any type that has a **well-defined ordering of its elements**.

## B. Singleton Pattern & Concurrency

Consider the Bank Account class from Lab 04. What if multiple people try to access the bank account at the same time? Inside `src/heist` are three classes:

- `BankAccount`, from Lab 04.
- `BankAccountAccessor`. Objects of this type are an instance of an access to a bank account to withdraw money a given number of times by given amounts.
- `BankAccountThreadedAccessor`, which `extends Thread`, and overrides the method `run` to create a new instance of `BankAccountAccessor` and access the bank.

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

Imagine you are running a cafe, where customers can order a regular milk tea ($6.00) and optionally add the following toppings on top for an extra cost:
- Pearls, costing $0.80
- Lychee Jelly, costing $0.90
- Milk Foam, costing $1.00

After a customer makes their order, a receipt should be printed out detailing what exactly the customer ordered, and the total cost of their order.

Creating concrete classes for each different type of combination like `MilkTeaWithPearls`, `MilkTeaWithPearlsAndLycheeJelly`, `MilkTeaWithLycheeJellyAndMilkFoam` would certainly get out of hand very quickly. Not to mention, customers should be able to order as many toppings as they would like, so there are actually infinite possibilities for the toppings a customer could want (ignoring how many would actually fit inside the cup!). Design a system in `src/milktea` that uses the Decorator Pattern to fulfill these requirements.
