import java.util.Scanner;

public class Player {
    
    Scanner scanner = new Scanner(System.in);
    
    private int score;

    private String name;


    // code executes when a player is created.    
    public Player(){
        System.out.print("Enter player name: ");
        name = scanner.nextLine();
        System.out.println("Welcome, " + name);
        score = 0;
    }

    // getter which returns the player's name.
    public String getName(){
        return name;
    }
    // getter which returns the player's score.
    public int getScore(){
        return score;
    }
    // setter which increases the player's score by one.
    public void increaseScore(){
        score++;
    }


}
