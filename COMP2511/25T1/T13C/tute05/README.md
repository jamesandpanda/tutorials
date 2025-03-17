# Tutorial 05
## A. Strategy Pattern
Inside `src/restaurant` is a solution for a restaurant payment system with the following requirements:

- The restaurant has a menu, stored in a JSON file. Each meal on the menu has a name and price
- The system displays all of the standard meal names and their prices to the user so they can make their order
- The user can enter their order as a series of meals, and the system returns their cost
- The prices on meals often vary in different circumstances. The restaurant has three different price settings (so far):
    - Standard - normal rates
    - Holiday - 15% surcharge on all items for all customers
    - Happy Hour - where registered members get a 40% discount, while standard customers get 30%
- The prices displayed on the menu are the ones for standard customers in all settings

Currently, the code uses switch statements to handle each of the different four cases.
- How does the code violate the open/closed principle?
- How does this make the code brittle?

 i) Refactor the code to use the Strategy Pattern to handle the three settings.

Here is the strategy interface to get you started:

```java
public interface ChargingStrategy {
    /**
     * The cost of a meal.
     */
    public double cost(List<Meal> order, boolean payeeIsMember);

    /**
     * Modifying factor of charges for standard customers.
     */
    public double standardChargeModifier();
}
```

 ii) Extend the system to add the following pricing strategy:
  - Prize Draw: A special promotion where every *100th* customer (since the start of the promotion) gets their meal for free!

## B. Observer Pattern
In `src/youtube`, create a model for the following requirements of a Youtube-like video creating and watching service using the Observer Pattern:
- A Producer has a name, a series of subscribers and videos
- When a producer posts a new video, all of the subscribers are notified that a new video was posted
- A User has a name, and can subscribe to any producer
- A video has a name and producer

Write a simple test with print statements inside `YoutubeTest.java`.

Once this is done, think about what if we want to be able to produce videos and subscribe to videos as well (the way youtube actually works). In groups, draw a UML diagram refactoring the code so that the `Producer` and `User` classes are merged, whilst still using the Observer Pattern.

## C. State Pattern
Consider the `Video` class in `src/video`. A video has a name and duration (in seconds), and can either be playing, paused or finished. Depending on this state, the `play()` and `pause()` methods function differently.

The actions and state transitions are as follows:

| State      | Play        | Pause  |
| -----      | -------       | -------       |
| Playing    | Play 1 second of the video. <br> If the end of the video has been reached, switch to Finished. <br> Otherwise, output the remaining number of seconds until completion. | Switch to Paused. |
| Paused     | Switch to Playing. | Error: Already paused. |
| Finished   | Restart the video and switch to Playing. | Error: Cannot pause a finished video. |

The current implementation implements the state transitions through an enum. Refactor this code using the State Pattern, and ensure that the correct functionality in `VideoTest.java` still remains.
