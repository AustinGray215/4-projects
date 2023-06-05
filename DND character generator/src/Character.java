//imports the full java library
import java.util.*;
//the class itself
public class Character {
    public static void main(String[] args) {
        //scanner for the code to create characters
        Scanner sc = new Scanner(System.in);
        int i=0;

        //while loop that you can set to however many people you have in the party
        while (i <= 4) {
            //the equation to get the stats
            double strength = Math.round((Math.random() * (18 - 1 + 1)) + 1);
            if(strength == 2.0){
                strength+=1;
            }
            else if(strength==1.0){
                strength +=2;
            }
            double dexterity = Math.round((Math.random() * (18 - 1 + 1)) + 1);
            if(dexterity == 2.0){
                dexterity+=1;
            }
            else if(dexterity==1.0){
                dexterity +=2;
            }
            double constitution = Math.round((Math.random() * (18 - 1 + 1)) + 1);
            if(constitution == 2.0){
                constitution+=1;
            }
            else if(constitution==1.0){
                constitution +=2;
            }
            double intelligence = Math.round((Math.random() * (18 - 1 + 1)) + 1);
            if(intelligence == 2.0){
                intelligence+=1;
            }
            else if(intelligence==1.0){
                intelligence +=2;
            }
            double wisdom = Math.round((Math.random() * (18 - 1 + 1)) + 1);
            if(wisdom == 2.0){
                wisdom+=1;
            }
            else if(wisdom==1.0){
                wisdom +=2;
            }
            double charisma = Math.round((Math.random() * (18 - 1 + 1)) + 1);
            if(charisma == 2.0){
                charisma+=1;
            }
            else if(charisma==1.0){
                charisma +=2;
            }
            //calculates the modifiers
            double strengthModifier=Math.round(((strength-10)/2)-0.5);
            if(strengthModifier == -4.0){
                strengthModifier+=1;
            }
            double dexterityModifier=Math.round(((dexterity-10)/2)-0.5);
            if(dexterityModifier == -4.0){
                dexterityModifier+=1;
            }
            double constitutionModifier=Math.round(((constitution-10)/2)-0.5);
            if(constitutionModifier == -4.0){
                constitutionModifier+=1;
            }
            double intelligenceModifier=Math.round(((intelligence-10)/2)-0.5);
            if(intelligenceModifier == -4.0){
                intelligenceModifier+=1;
            }
            double wisdomModifier=Math.round(((wisdom-10)/2)-0.5);
            if(wisdomModifier == -4.0){
                wisdomModifier+=1;
            }
            double charismaModifier=Math.round(((charisma-10)/2)-0.5);
            if(charismaModifier == -4.0){
                charismaModifier+=1;
            }
            //calculates health
            double d6Health=Math.round(((Math.random() * (6 - 1 + 1)) + 1) + constitutionModifier);
            if(d6Health<=0){
                d6Health=1.0;
            }
            double d8Health=Math.round(((Math.random() * (8 - 1 + 1)) + 1) + constitutionModifier);
            if(d8Health<=0){
                d8Health=1.0;
            }
            double d10Health=Math.round(((Math.random() * (10 - 1 + 1)) + 1) + constitutionModifier);
            if(d10Health<=0){
                d10Health=1.0;
            }
            double d12Health=Math.round(((Math.random() * (12 - 1 + 1)) + 1) + constitutionModifier);
            if(d12Health<=0){
                d12Health=1.0;
            }
            //the main code that you see run through the console
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
                System.out.println(" ");
            System.out.println("modifiers:");
                System.out.println("Strength modifier is " + strengthModifier);
                System.out.println("Dexterity modifier is " + dexterityModifier);
                System.out.println("Constitution modifier is " + constitutionModifier);
                System.out.println("intelligence modifier is " + intelligenceModifier);
                System.out.println("Wisdom modifier is " + wisdomModifier);
                System.out.println("Charisma modifier is " + charismaModifier);
            System.out.println(" ");
            //gives you the health of the character by checking your selected class and your constitution modifier

            System.out.println("Health:");
            if((String2.equals("Sorcerer")||(String2.equals("Wizard")))){
                System.out.println(d6Health);
            }
            if(String2.equals("Rouge")||String2.equals("Bard")||String2.equals("Cleric")||
                    String2.equals("Druid")||String2.equals("Artificer")||
                    String2.equals("Warlock")||String2.equals("Monk")){
                System.out.println(d8Health);
            }
            if(String2.equals("Paladin")||String2.equals("Fighter")||String2.equals("Ranger")){
                System.out.println(d10Health);
            }
            if(String2.equals("Barbarian")){
                System.out.println(d12Health);
            }
            if((String2.equals("sorcerer")||(String2.equals("wizard")))){
                System.out.println(d6Health);
            }
            if(String2.equals("rouge")||String2.equals("bard")||String2.equals("cleric")||
                    String2.equals("druid")||String2.equals("artificer")||
                    String2.equals("warlock")||String2.equals("monk")){
                System.out.println(d8Health);
            }
            if(String2.equals("paladin")||String2.equals("fighter")||String2.equals("ranger")){
                System.out.println(d10Health);
            }
            if(String2.equals("barbarian")){
                System.out.println(d12Health);
            }
            System.out.println(" ");
            System.out.println("feats:");
            System.out.println("The level one feats are As follows:");
            System.out.println("Alert, crafter, healer, lightly armoured, lucky, magic initiate,musician," +
                    " savage attacker, skilled, tavern brawler, and tough.");
            i++;
        }
        System.out.println("Thank you guys for using my code for the characters");
    }
}