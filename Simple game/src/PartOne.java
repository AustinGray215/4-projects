import java.util.*;
public class PartOne extends Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int choice2;
        int choice3;
        int choice4;
        int choice5;

        System.out.println("you awaken in an abandoned city, ruble surrounds you. All you know is you need to escape.");
        System.out.println("you find a case on the ground with a weapon in it. you open your hand and retrieve...");
        System.out.println("1.a rifle with ammunition, 2. a katana with an intricate design, or 3. a watch of unique design. "
                + "you can only choose one.");
        choice = sc.nextInt();
        if(choice > 3){
            System.out.println("you can only choose one. start again.");
        }
        else if(choice == 3){
            System.out.println("the watch morphs onto your wrist and you can't tke it off, some how you know how to use it.");
            System.out.println("you hear monsters approaching and have two options, fight or run.");
            System.out.println("what do you choose?");
            choice2 = sc.nextInt();
            if(choice2 > 2){
                System.out.println("there is no other option besides death now");
            }
            else if(choice2 == 2){
                System.out.println("you choose to run and escape to a clearing with a lumbering beast.");
                System.out.println("It wants the watch, you can only fight and the watch knows this.");
                System.out.println("A selection dial appears, you finally remember why you know how to use it. It's the omnitrx from ben 10.");
                System.out.println("Slamming down on the dial after stopping on an alien. you managed to get big chill. you could just freeze this guy or go ultimate.");
                System.out.println("1. make this quick, or 2. go ultimate just in case.");
                choice3 = sc.nextInt();
                if(choice3 > 2){
                    System.out.println("there is no other option besides death now");
                }
                else if(choice3 == 2){
                    System.out.println("Ultimate big chill!"+"You slam this guy to the ground with a punch and freeze him in place and escape.");
                    System.out.println("Congrats you've finished the story game, there are other options to take so try them all. Thanks for playing.");
                }
                else{
                    System.out.println("You decide to make this quick and freeze the opponent in place.");
                    System.out.println("One problem is that the beast can heat itself up to the same temperature as lava.");
                    System.out.println("You remember that big chill's species can phase through things and freeze them from the inside. Do you try it?");
                    System.out.println("you can 1. try freezing this beast internally, or 2. try another alien");
                    choice4 = sc.nextInt();
                    if(choice4 > 2){
                        System.out.println("there is no other option");
                    }
                    else if(choice4 == 2){
                        System.out.println("Ghost Freak! You possess the beast and use it to escape the city");
                        System.out.println("Congrats you've finished the story game, there are other options to take so try them all. Thanks for playing.");
                    }
                    else{
                        System.out.println("You go with the phasing plan and this time it works and you destroy the beast.");
                        System.out.println("Congrats you've finished the story game, there are other options to take so try them all. Thanks for playing.");
                    }
                }
            }
            else{
                System.out.println("You decide to fight and a selection dial appears, you finally remember why you know how to use it. It's the omnitrx from ben 10.");
                System.out.println("You fight your way out switching between aliens seamlessly and escape the city. thanks for playing and try to get all paths.");
            }
        }
        else if(choice == 2){
          System.out.println("You grab the katana and feel a sudden rush of power. you hear music start playing and swell to louder volumes.");
          System.out.println("as the music start having lyrics monsters appear");
          System.out.println("You know what the blade is, the devil sword Yamato. the monsters show and you are ready to fight.");
          System.out.println("You have two options, 1. open a portal and escape. 2. stay and show them your motivation");
          choice5 = sc.nextInt();
          if(choice5> 2){
              System.out.println("there is no other option");
          }
          else if(choice5==2){
              System.out.println("You clearly had the strength to win and escape. well done");
          }
          else{
              System.out.println("You open a portal with the blade by cutting time and space to escape. well done.");
          }
        }
        else{
            System.out.println("You grab the rifle and check it. you hear music start playing and swell to louder volumes.");
            System.out.println("as the music begins to kick in monsters appear");
            System.out.println("You choose the path of perpetual torment, and those who face your hatred have dubbed you the slayer");
            System.out.println("Well done, thanks for playing. There are more choices that might be more satisfying. Be sure to play again.");
        }
    }
}