# 4-projects
Simple text game for a project, (the project runs on if and else-if statements and has two un-used inheritor classes, it is simplistic in nature and lacks a loop that can be used to make it to where you don't need to run the code again unless you reach an end. there is also an issue where if the value selected is less than one the first option will still play because the code checks only for values greater than the max. the way this is run is by using the green play button near the top right conner of the screen in Intellij through the console.)

the mp3 player attempt was an attempt to make an mp3 player in java but I had spent to much time trying to find a way to convert a music video from YouTube to an mp3 file that I had run out of time for this project, when I had found a solution I needed to have had the file downloaded and in order to do that I need to pay for YouTube premium. The project does run through the green button near the top right corner of the screen and via the console. the project would use a while loop and if else statements.

The DND character generator project is a way for the people who play DND without worrying about the loss of dice while rolling character stats and save time regardless of group size. The code is contained in one while loop that for the purpose of my group size of five players and one dungeon master use an interger called i start at zero and while the value for i is less than or equal to 4 the code will loop. using a math.random statement encased in a math.round statement to remove decimals and get the stats. The modifiers are calculated by using a similar equation to the stats but replace the math.random with the stat the modifier belongs to. An error occured in the code was that if the stat was the lowest you can score, 3, then the modifier instead of being -3 would be -4. This error was due to math.round rounding -3.5 to -4 where in DND the decimal is rounded down, meaning the lowest modifier you can obtain is a -3. The code runs in the console after you press the run button wherever it is located depending on the software used. The health for the character is calculated by adding the constitution modifier of the character to whatever the assigned hit dice roll is for the characters class. I have if statemen for each hit die value for both scentence case, and all lowercase. There is also an if statement for if when adding the constitution modifer to the hit die where the HP value is less than one the HP value is set two one. Finally there is a  println statement that gives you the available level one feats.
