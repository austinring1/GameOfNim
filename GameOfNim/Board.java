import java.util.Random;
import java.util.Scanner;

public class Board{

private int numPieces;

public boolean playAgain;

Random random = new Random();

Scanner scanner = new Scanner(System.in);


// removes the number of pieces the user will "take" from the int numPieces.
public void takePieces(int num){
    if(num <= ((int) ((getNumPieces() + 1) / 2)) && num > 0)
    {
        numPieces = numPieces - num;
    }else if((num > ((int) (getNumPieces() / 2)) + 1))
    {
        System.out.println("You can't take more than half of the pieces on the board!");
    }else if(num <= 0){
        System.out.println("You can't take 0 or fewer pieces!");
    }

}   

// a getter which returns the private int numPieces.
public int getNumPieces(){
    return numPieces;
}

// a setter which sets the private int.
public void setNumPieces(){
    numPieces = (10 + (int)(Math.random() * ((50 - 10) + 1)));
}

}