//imports the full java library
import java.util.*;
//the class itself
public class Character {
    public static void main(String[] args) {
        //scanner for the code to create characters
        Scanner sc = new Scanner(System.in);
        int i=0;
        //the equation to get the stats
        double strength = (Math.random() * (18 - 1 + 1)) + 1;
        double dexterity = (Math.random() * (18 - 1 + 1)) + 1;
        double constitution = (Math.random() * (18 - 1 + 1)) + 1;
        double intelligence = (Math.random() * (18 - 1 + 1)) + 1;
        double wisdom = (Math.random() * (18 - 1 + 1)) + 1;
        double charisma = (Math.random() * (18 - 1 + 1)) + 1;
        //while loop that you can set to however many people you have in the party
        while (i <= 4) {
            System.out.println("Name your character.");
            Object String = sc.nextLine();
            System.out.println("Choose your class.");
            Object String2 = sc.nextLine();
            System.out.println("character name is " + String);
            System.out.println("character class is " + String2);
            System.out.println("Strength is " + strength);
            System.out.println("Dexterity is " + dexterity);
            System.out.println("Constitution is " + constitution);
            System.out.println("intelligence is " + intelligence);
            System.out.println("Wisdom is " + wisdom);
            System.out.println("Charisma is " + charisma);
            //little heads up and helpful tip.
            System.out.println("Please ignore the decimal values");
            System.out.println("Modifiers are the value of the roll minus ten divided by two(round down)");
            i++;
        }
    }
}