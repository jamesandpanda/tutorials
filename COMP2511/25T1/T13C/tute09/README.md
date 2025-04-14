# Tutorial 09
## A. Visitor Pattern
Before doing this exercise, run the example in `src/visitor` - what does the main program in `Visitor.java`, and why?

In this scenario, we have `Computer`s, `Keyboard`s and `Mouse`s. We want to be able to convert each of these computer-related objects into JSON objects containing each of their respective fields, and create a corresponding `.json` file.

One approach is to implement all of this logic in each of the respective computer component classes. However,
- These methods would be fairly disconnected from the rest of the class methods that have to do with the actual functionality of the objects
- While extending a system, we would like to modify as little as possible to prevent introducing bugs to existing code.

Extend/modify the starter code to use the Visitor Pattern to provide this implementation separate from each of the component classes.

Below is the implementation to create a `.json` file representing a `Computer`.

```java
JSONObject j = new JSONObject();
j.put("type", "computer");
j.put("name", c.getName());
j.put("storage", c.getStorage());
j.put("ram", c.getRam());

try {
    FileWriter f = new FileWriter("src/computer/output/computer.json");
    f.write(j.toString(2));
    f.close();
} catch (Exception e) {
    System.err.println(e);
}
```

## B. Builder Pattern

In our system, we have trains which contain many engines and/or wagons. As in a normal train, these engines/wagons are ordered sequentially from the front of the train to the back.

Engines provide a certain amount of power and wagons require a certain amount of power to pull. At each point along the train, taking into account preceeding engines/wagons, the sum of the engine power must be greater than the sum of the wagon's required power. Otherwise, the rest of the train will be left behind!

There are three types of wagons:

> - Passenger wagons which require 500 engine power each
>
> - Cargo wagons which require 1,000 engine power each
>
> - Engines which **provide** power. They can be created at any power. For our system, we will create them at two variants. A "high powered" engine (2,000 power) and a "normal" engine (1,000) power.

Create a **train builder** that constructs a train in order, wagon by wagon with the above constraint. If the above constraint is violated at any point, throw an `IllegalStateException`.

Write a simple test in main that calls the builder directly to construct a train.

Question: How could you extend this solution to add `ToyTrains` and a `ToyTrainBuilder` to the system?

## C. Finding Patterns
In groups, determine a possible pattern that could be used to solve each of the following problems:

- Sorting collections of records in different orders.
- Listing the contents of a file system.
- Traversing through a linked list without knowing the underlying representation.
- Updating a UI component when the state of a program changes.
- A frozen yogurt shop model which alters the cost and weight of a bowl of frozen yogurt based on the toppings that customers choose to add before checkout.
- [!] Allowing users to remap their movement controls to different buttons on a game controller.
- [!] Creating a skeleton implementation for a payment processing algorithm that varies in logic based on the type (e.g. credit card, PayPal)

## D. Code and Design Smells
In groups, discuss the following examples. Identify the code smells and any underlying design problems associated with them.

a)

> Mark, Bill and Jeff are working on a PetShop application. The PetShop has functionality to feed, clean and exercise different types of animals. Mark notices that each time he adds a new species of animal to his system, he also has to rewrite all the methods in the PetShop so it can take care of the new animal.

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

c)

```java
public class MathLibrary {
    List<Book> books;

    int sumTitles() {
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

Now discuss as a class:

- How do these code smells cause problems when developing code?

- Is a code smell always emblematic of a design problem?
