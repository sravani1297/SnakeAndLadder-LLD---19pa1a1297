# SnakeAndLadder - Low Level Design
## Problem Statement
Create a snake and ladder application. The application should take as input (from the command line or a file):
- Number of snakes (s) followed by s lines each containing 2 numbers denoting the head and tail positions of the snake.
- Number of ladders (l) followed by l lines each containing 2 numbers denoting the start and end positions of the ladder.
- Number of players (p) followed by p lines each containing a name.
After taking these inputs, you should print all the moves in the form of the current player name followed by a random number between 1 to 6 denoting the die roll and the initial and final position based on the move.
<br/>Format: <player_name> rolled a <dice_value> and moved from <initial_position> to <final_position>
## Solution
- This is the low level design for the snake and ladder game using java.
- This code contains 6 classes : 
  - Snake
  - Ladder
  - Dice
  - Player
  - Gameboard
  - Main
- The following are the inputs takes from the user.
  - Number of Players
  - Names of Players
  - Number of Dices
  - Board Size
  - Number of Snakes and head and tail positions
  - Number of Ladders and start and end positions.
 ## FlowChart
![Flow Chart](https://user-images.githubusercontent.com/72606270/146191233-b54bab95-1b35-4f6a-b6ad-904e7a48e291.PNG)
## OutPut
![output1](https://user-images.githubusercontent.com/72606270/146193486-5a6f73ed-3f5d-47f6-897b-ca4b4cdae4ac.PNG)
![output 3](https://user-images.githubusercontent.com/72606270/146193822-2230b009-2c67-4219-bbd3-c0f92a626062.PNG)
