# Tutorial 09

## A. Finding Patterns

In groups, determine a possible pattern that could be used to solve each of the following problems:

- Sorting collections of records in different orders.
    > Strategy pattern. Each of the different types of orderings are the different strategies.
- Listing the contents of a file system.
    > Composite pattern. Files and directories should be able to be treated as the same object (i.e. implementing a common interface), with the files being the leaf nodes and the directories being the composite nodes.
- Traversing through a linked list without knowing the underlying representation.
    > Iterator pattern. Iterating through a collection without knowing the underlying representation is something you see in a lot of modern languages, as it decouples specific algorithms (like sorting, searching, etc.) from the concrete types of the containers.
- Updating a UI component when the state of a program changes.
    > Observer pattern. Just because it says 'state' doesn't mean it's the state pattern!
- Allowing users to remap their movement controls to different buttons on a game controller.
    > Command pattern. The buttons (e.g. an up arrow) should map to specific commands rather than dealing with the concrete logic itself, so that those commands can be remapped to other commands (e.g. remapping the up arrow to a down command).
- Creating a skeleton implementation for a payment processing algorithm that varies in logic based on the type (e.g. credit card, PayPal)
    > Template pattern. The template contains the common steps for each of the algorithms, and concrete classes will implement those steps.
- A frozen yogurt shop model which alters the cost and weight of a bowl of frozen yogurt based on the toppings that customers choose to add before checkout.
    > Decorator pattern. The base object is the bowl of frozen yoghurt without any toppings, and the toppings are the decorators.

Then pick one and start to think about potential entities and draw up a rough UML diagram.

## B. Code and Design Smells

In groups, discuss the following examples. Identify the code smells and any underlying design problems associated with them.

a)

> Mark, Bill and Jeff are working on a PetShop application. The PetShop has functionality to feed, clean and exercise different types of animals. Mark notices that each time he adds a new species of animal to his system, he also has to rewrite all the methods in the PetShop so it can take care of the new animal.

> Code Smell: Divergent Change\
> Design Problem: Open-closed principle, high coupling

b)

```java
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String streetAddress;
    private String suburb;
    private String city;
    private String country;
    private int postcode;

    public Person(String firstName, String lastName, int age, int birthDay, int birthMonth, int birthYear,
            String streetAddress, String suburb, String city, String country, int postcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.streetAddress = streetAddress;
        this.suburb = suburb;
        this.city = city;
        this.country = country;
        this.postcode = postcode;
    }
    // Some various methods below
    // ....
}
```

> Code Smells: Data Clumps, Long Parameter List\
> Refactor by making more classes for birthday and address ("Extract Class"/ "Introduce Parameter Object"). Note that this could potentially add a new code smell to your codebase, Data Class!\
> Design Problem: DRY and KISS

c)

```java
public class MathLibrary {
    List<Book> books;

    int sumTitles {
        int total = 0
        for (Book b : books) {
            total += b.title.titleLength;
        }
        return total;
    }
}

public class Book {
    Title title; // Our system just models books as titles (content doesn't matter)
}

public class Title {
    int titleLength;

    int getTitleLength() {
        return titleLength;
    }

    void setTitleLength(int tL) {
        titleLength = tL;
    }
}
```

> Code Smells: Inappropriate Intimacy, Message Chains (Law of Demeter), Data Classes/Lazy Classes
> Refactor by making fields private, and just representing the title as a string (opposite problem as previous).\
> Design Problem: High coupling, as data is not encapsulated.

Now discuss as a class:

- How do these code smells cause problems when developing code?
    > How easy would it be to extend and maintain the code in the above examples?

- Is a code smell always emblematic of a design problem?
    > No! Code smells are *indicators* of design problems, but do not guarantee the existence of such. Even the solution that is most agreed to by many people may inevitably contain some things that can be considered code smells (e.g. comments, switch statements).

## C. Visitor Pattern

In this scenario we have `Computer`s, `Keyboard`s and `Mouse`s which all are of type `ComputerComponent`. We want to be able to 'visit' different types of Computer components by logging the following messages:

```
Looking at computer Corelli with memory 500 GB.
Looking at keyboard Mechanical keyboard which has 36 keys.
Looking at mouse Bluetooth mouse.
```

In particular though, anyone which is visiting a `Computer` must be **validated** prior to being able to visit.

Extend/modify the starter code to use the Visitor Pattern to allow different computer components to be visited.

## D. Revision Exercises

Complete some of the Theory Revision questions [here](https://cgi.cse.unsw.edu.au/~cs2511/redirect/?path=COMP2511/24T3/students/_/revision-exercises).
