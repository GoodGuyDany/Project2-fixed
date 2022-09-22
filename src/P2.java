import java.io.PrintStream;
import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Part 1
        // 1. Declaring variables
        int numbert = 5;
        int numbert2 = 13;
        double doublet = 4.5f;
        float floatt = 0.5f;
        char charactert = 'A';
        boolean boolt = true;
        String stringt = "String";
        String stringt1 = "This is a ";

        // 2. Demonstrating operations with numbers
        System.out.println("Addition: " + (numbert + numbert2));
        System.out.println("Substraction: " + (numbert2 - numbert));
        System.out.println("Multiplication: " + (numbert * numbert2));
        System.out.println("Division: " + (doublet / floatt));

        // 3. Demonstrating String operations
        System.out.println(stringt1 + stringt);
        System.out.println(stringt.charAt(3));

        // 4. Demonstrating Input/Output operations
        System.out.println("Please give me a String:");
        String userstring = sc.nextLine();
        System.out.println("Here's your string: " + userstring);
        System.out.println("Now give Integer #1:");
        int userint1 = sc.nextInt();
        System.out.println("Now give me Integer #2:");
        int userint2 = sc.nextInt();
        System.out.println("Here's a sum of your integers: " + (userint1 + userint2));

        sc.nextLine();

        // 5. Demonstrating use of different comment types
        // Hello, this is the comment type that only comments lines!
        /* And this is the comment type that comments until you stop it like this: */

// Part 2
        System.out.println("Hello, User! What's your name?");
        String name = sc.nextLine();
        System.out.println("Nice to meet you, " + name + ". Mind telling me how old you are?");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Thanks! And what's your lastname, " + name + "?");
        String lastname = sc.nextLine();
        System.out.println(name + " " + lastname + " then! What's your favorite thing to do, " + name + "?");
        String thingtodo = sc.nextLine();
        System.out.println("Oh, " + thingtodo + " is cool! And how tall are you? (input a float)");
        float height = sc.nextFloat();
        sc.nextLine();
        System.out.println("That's quite tall! What's your eye color?");
        String eyecolor = sc.nextLine();
        System.out.println(eyecolor + " is a beautiful color! What's your hair color?");
        String haircolor = sc.nextLine();
        System.out.println("Just three more questions! Is your family big or small?");
        String family = sc.nextLine();
        System.out.println("How much do you weigh?");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.println("And the last question - how active of a person are you?");
        String active = sc.nextLine();
        System.out.println("Now let me sum it up for you!");
        System.out.println("Your name is " + name + ". Your surname is " + lastname + ".");
        System.out.println("Your family is " + family + ".");
        System.out.println("You're " + age + " years old.");
        System.out.println("You're this tall: " + height + "m.");
        System.out.println("You weigh this much: " + weight + "kg.");
        System.out.println("You're " + active + ".");
        System.out.println("Your favorite thing to do is " + thingtodo + ".");
        System.out.println("Your haircolor is " + haircolor + ".");
        System.out.println("Your eyecolor is " + eyecolor + ".");
        System.out.println("And that sums it up! Bye now!");
    }
}
