/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 *
 * @author Alex
 */
public class Laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String playAgain = "y";
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        
        while("y".equals(playAgain)){
            GuessingGame();
            System.out.println("Would you like to play another game (y/n):");
            playAgain = lectura.next();
        }
    }
    public static void GuessingGame(){
        int answer = (int) Math.floor((Math.random()*100)+1);
        int guess = 0;
        int numGuesses = 1;
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        
        while(numGuesses<=7 || guess!=answer){
            System.out.println("Guess a number");
            guess = lectura.nextInt();
            if(guess < answer){
               System.out.println("Higher..."); 
            } else if(guess > answer){
                System.out.println("Lower...");
            } else {
                System.out.println("You Win...");
            }
            numGuesses++;
            } 
        if(numGuesses>7){
               System.out.println("You loser");
        }  
    }
}
