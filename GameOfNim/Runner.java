/*
Game of Nim Project
Author: Austin Ring
Date: 17/2/2022
Course: APCSA
Description: Simulates a "Nim" type game where each turn, players choose a number thats less than 
half of the total, and the last player to take a turn loses.
Precondition(s): User must input a number that is less than half of the randomly determined total.
Postcondition(s): A game will be played using print statements and the Scanner class.
**************************************************************************************/

public class Runner {
    public static void main(String[] args) 
  {
    Nim game = new Nim(); 
    game.play();
  }
}
