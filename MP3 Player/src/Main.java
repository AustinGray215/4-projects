import java.util.*;
public class Main {
    public static void main(String[] args) {
        //new scanner to take in user input.
        Scanner sc = new Scanner(System.in);
        int musicChoice;
        System.out.println("welcome to the Intellij MP3 player. please choose from the selection of songs we have.");
        System.out.println("the songs to chose from are 1. (Bury the Light, by Casey Edwards) 2. (Devil Trigger, by Casey Edwards)  ");

        System.out.println("What are you going to listen to?");
        musicChoice = sc.nextInt();
         while(musicChoice>0){
             if(musicChoice==1){
                 //return buryTheLight.mp3();

             }
             else if(musicChoice==2){
                 //return devilTrigger.mp3();

             }
         }


    }
}