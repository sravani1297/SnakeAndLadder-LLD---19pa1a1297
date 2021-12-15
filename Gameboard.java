import java.util.*;
public class Gameboard {
    public int boardSize;
    private Dice dice;
    private Queue<Player> nextTurn;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private Map<String,Integer > position ;
    public Gameboard(Dice d, Queue<Player> nxtTurn,  List<Snake> s, List<Ladder> l,Map<String,Integer> playerpos,int brdSize) {
        dice = d;
        nextTurn = nxtTurn;
        snakes = s;
        ladders = l;
        position = playerpos;
        boardSize = brdSize;
    }
    void startGame(){
        while(nextTurn.size()>1) {
            Player player = nextTurn.poll();
            int currentPosition = position.get(player.getName());
            int diceValue = dice.roll();
            int nextCell = currentPosition + diceValue;
            if (nextCell > boardSize) 
                nextTurn.offer(player);
            else if (nextCell == boardSize) 
            {
                System.out.println( player.getName() + " won the game");
            }
            else
            {
                int[] nextPosition= new int[1];
                boolean[] b =new boolean[1];
                nextPosition[0]= nextCell;
                snakes.forEach(v->
                {   if(v.getHead()==nextCell) {nextPosition[0] = v.getTail();} });
                
                if(nextPosition[0] != nextCell) 
                    System.out.println(player.getName() + " Bitten by snake at cell  : "+ nextCell);
                ladders.forEach(v->
                {   if(v.getStart()==nextCell){ nextPosition[0] = v.getEnd();b[0]=true;} } );
                
                if(nextPosition[0] != nextCell && b[0]) 
                    System.out.println(player.getName() + " Got ladder at cell : "+ nextCell);
                if(nextPosition[0] == boardSize)
                {
                    System.out.println(player.getName() + " won the game");
                }
                else{
                    position.put(player.getName(),nextPosition[0]);
                    System.out.println(player.getName()+" rolled a "+diceValue+ " moved from "+currentPosition+" to "+nextPosition[0]);
                    nextTurn.offer(player);
                }
            }
        }
    }
}