package hiding;

/* This program demonstrates 'method hiding'.
 * Please treat this as extra material!
 *
 * Remember that static methods cannot be overridden (why?), but interestingly, they can be inherited...
 * You should basically never run into this, because static methods should only be accessed via.
 * the class, like UniStudent.speak(), rather than a concrete instance of the class. You should see
 * warnings on your IDE when you are mis-using static methods like this.
 * 
 * The main take-away:
 *      - method overriding: re-defining the implementation of inherited *non-static* methods
 *      - method hiding:     re-defining the implementation of inherited *static* methods
 */
public class Main {
    public static void main(String[] args) {
        UNSWStudent a = new UNSWStudent();
        a.speak();
        UniStudent b = a;
        b.speak();
        b = new UniStudent();
        b.speak();
        a.speak();
    }
}

class UniStudent {
    public static void speak() {
        System.out.println("I love semesters!");
    }
}

class UNSWStudent extends UniStudent {
    public static void speak() {
        System.out.println("I love trimesters!");
    }
}
