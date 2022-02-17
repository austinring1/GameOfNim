import java.util.Scanner;

public class Nim{
    
    private Player player1;

    private Player player2;

    private Board game;

    public String replay = "";
    
    Scanner scanner = new Scanner(System.in);
    
    public Nim(){
        player1 = new Player();
        player2 = new Player();
        game = new Board();
        game.playAgain = true;
    }

    public void play(){
      while(game.playAgain == true){  
        
        if(game.playAgain == true){
            game.playAgain = false;
            game.setNumPieces();
        }
        
        // determines which player goes first.
        int currentPlayer = (1 + (int)(Math.random() * ((2 - 1) + 1)));

        
        while(game.getNumPieces() > 0){
        
        System.out.println("There are " + game.getNumPieces() + " pieces on the board.");
        
        if(currentPlayer == 1){
       
            System.out.print(player1.getName() + ", how many pieces would you like to take?: ");
            game.takePieces(scanner.nextInt());
       
        }else{
            System.out.print(player2.getName() + ", how many pieces would you like to take?: ");
            game.takePieces(scanner.nextInt());
        }
    // executes when the game is over, and shows the players their scores and asks them if they want to play again.
    if(currentPlayer == 1){
        if(game.getNumPieces() <= 0){
            player2.increaseScore();
            System.out.println(player2.getName() + " won this round.");
            System.out.println(player2.getName() + " has " + player2.getScore() + " points");
            System.out.println(player1.getName() + " has " + player1.getScore() + " points");


            System.out.print("Would you like to play again? (Y/N): ");
            scanner.nextLine();
            String replay = scanner.nextLine();
            
            if(replay.equalsIgnoreCase("y")){
                game.playAgain = true;
                System.out.println("New game!");
            }else{
                System.out.println("The final score was " + player2.getScore() + " to " + player1.getScore() + ", so " + player2.getName() + " wins!");
            }
        }
        
    }else{
        if(game.getNumPieces() <= 0){
            player1.increaseScore();
            System.out.println(player1.getName() + " won this round.");
            System.out.println(player1.getName() + " has " + player1.getScore() + " points");
            System.out.println(player2.getName() + " has " + player2.getScore() + " points");

            System.out.print("Would you like to play again? (Y/N): ");
            scanner.nextLine();
            String replay = scanner.nextLine();

            if(replay.equalsIgnoreCase("y")){
                game.playAgain = true;
                System.out.println("New game!");
            }else{
                System.out.println("The final score was " + player1.getScore() + " to " + player2.getScore() + ", so " + player1.getName() + " wins!");
            }
    }

    }

    // switches the player if the game isn't over.
    if(currentPlayer == 1){
        currentPlayer = 2;

    }else if(currentPlayer == 2){
        currentPlayer = 1;
    }
  
         } 
    

        }   
    }
}