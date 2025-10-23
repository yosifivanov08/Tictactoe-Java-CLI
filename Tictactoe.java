import java.util.ArrayList;
import java.util.Scanner;

public class Tictactoe {
    
    static Scanner scanner = new Scanner(System.in);  // Declaring input 
    static ArrayList<Character>box = new ArrayList<>(); // Declaring array for map
    static String winner = " "; // Declaring a global string to use in deciding the winner
    
    // Clears the terminal
    static void clearScreen(){ 
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    // Creates the map
    static void createBox(){  
            for(int i=0; i<9; i++){
                box.add(' ');
            }
            
    }
    // Shows the current map
    static void showMap(){ 
        System.out.println("-------------");
        System.out.println("| " + box.get(0) + " | " + box.get(1) + " | " + box.get(2) + " | ");
        System.out.println("-------------");
        System.out.println("| " + box.get(3) + " | " + box.get(4) + " | " + box.get(5) + " | ");
        System.out.println("-------------");
        System.out.println("| " + box.get(6) + " | " + box.get(7) + " | " + box.get(8) + " | ");
        System.out.println("-------------");
    }
    // Player inputs his move
    static void playerMove(){
        System.out.print("Enter Your Move: ");
        
        int playerMove = scanner.nextInt() - 1;
            if(box.get(playerMove) != ' '){
                playerMove();
            } else {
                box.set(playerMove, 'X');
            }
       

    }
    // Computer inputs his move
    static void computerMove(){
        if(box.get(0) != ' ' && box.get(1) != ' ' && box.get(2) != ' ' && box.get(3) != ' ' && box.get(4) != ' ' &&box.get(5) != ' ' && box.get(6) != ' ' && box.get(7) != ' ' && box.get(8) != ' '){
            return;
        }
        int computerNumber = (int)(Math.random() * 9);
        
            if(box.get(computerNumber) != ' '){
                computerMove();
            } else{
                box.set(computerNumber, 'O');
            }
    

    }
    // Deciding winner
    static void decideWinner(){
        // Situations where the winner is player
        if(box.get(0) == 'X' && box.get(1) == 'X' && box.get(2) == 'X'){ // first row 
            winner = "Player";
        }
        if(box.get(3) == 'X' && box.get(4) == 'X' && box.get(5) == 'X'){ // second row 
            winner = "Player";
        }
        if(box.get(6) == 'X' && box.get(7) == 'X' && box.get(8) == 'X'){ // third row 
            winner = "Player";
        }
        if(box.get(0) == 'X' && box.get(3) == 'X' && box.get(6) == 'X'){ // first vertical 
            winner = "Player";
        }
        if(box.get(1) == 'X' && box.get(4) == 'X' && box.get(7) == 'X'){ // second vertical 
            winner = "Player";
        }
        if(box.get(2) == 'X' && box.get(5) == 'X' && box.get(8) == 'X'){ // third vertical 
            winner = "Player";
        }
        // Situations where the winner is computer 

        if(box.get(0) == 'O' && box.get(1) == 'O' && box.get(2) == 'O'){ // first row 
            winner = "Computer";
        }
        if(box.get(3) == 'O' && box.get(4) == 'O' && box.get(5) == 'O'){ // second row 
            winner = "Computer";
        }
        if(box.get(6) == 'O' && box.get(7) == 'O' && box.get(8) == 'O'){ // thirt row coompute
            winner = "Computer";
        }
        if(box.get(0) == 'O' && box.get(3) == 'O' && box.get(6) == 'O'){ // first vertical 
            winner = "Computer";
        }
        if(box.get(1) == 'O' && box.get(4) == 'O' && box.get(7) == 'O'){ // second verticalplayer
            winner = "Computer";
        }
        if(box.get(2) == 'O' && box.get(5) == 'O' && box.get(8) == 'O'){ // left diagonal 
            winner = "Computer";
        }

        if(winner == "Player"){
            System.out.println("Player Won!");
            return;
        } if(winner == "Computer"){
            System.out.println("Computer Won!");
            return;
        } 
        // If all the boxes are filled
        if(box.get(0) != ' ' && box.get(1) != ' ' && box.get(2) != ' ' && box.get(3) != ' ' && box.get(4) != ' ' &&box.get(5) != ' ' && box.get(6) != ' ' && box.get(7) != ' ' && box.get(8) != ' '){
            if(winner == "Player"){
                System.out.println("Player Won!");
                return;
            } else if(winner == "Computer"){

            } else {
                winner = "Draw";
                System.out.println("Draw!");
                return;
            }
        }
    }
    
    public static void main(String[] args){
        createBox();
        while(winner == " "){
            showMap();
            playerMove();
            showMap();
            computerMove();
            showMap();
            clearScreen();
            decideWinner();
        }
        clearScreen();
        showMap();
        decideWinner();
        
        
         scanner.close();
    }
}