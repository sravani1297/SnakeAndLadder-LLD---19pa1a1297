import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*********_______Welcome to Snake and Ladder game_______********* ");
        System.out.println("Enter No of players :");
        int n = sc.nextInt();
        Queue<Player> allPlayers = new LinkedList<>();
        Map<String,Integer> playersCurrPos = new HashMap<>();
        for(int i=1;i<=n;i++){
              System.out.println("Enter Player "+i+" Name : ");
              Player p1 = new  Player(sc.next(),i);
              String names=p1.getName();
              allPlayers.offer(p1);
              playersCurrPos.put(names,0);
        }
        System.out.println("Enter no of dices :");
        Dice dice = new Dice(sc.nextInt());
        System.out.println("Enter the Board Size");
        int a= sc.nextInt();
        List<Snake> snakes = new ArrayList<>();
        System.out.println("Enter No of Snakes :");
        int ns = sc.nextInt();
        System.out.println("Enter Snakes head and tail positions");
        for(int i=0;i<ns;i++)
        {
            Snake snake1 = new Snake(sc.nextInt(),sc.nextInt());
            snakes.add(snake1);
        }
        List<Ladder> ladders = new ArrayList<>();
        System.out.println("Enter No of Ladders :");
        int nl = sc.nextInt();
        System.out.println("Enter Ladders start and end positions");
        for(int i=0;i<nl;i++)
        {
          Ladder ladder1 = new Ladder(sc.nextInt(),sc.nextInt());
          ladders.add(ladder1);
        }
        Gameboard gb=new Gameboard(dice,allPlayers,snakes,ladders,playersCurrPos,a);
        gb.startGame();   
    }  
}