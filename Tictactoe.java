import java.util.ArrayList;
import java.util.Scanner;

public class Tictactoe {
    
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Character>box = new ArrayList<>();
    static String winner = " ";
    
    static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    static void createBox(){
            for(int i=0; i<9; i++){
                box.add(' ');
            }
            
    }
    static void showMap(){
        System.out.println("-------------");
        System.out.println("| " + box.get(0) + " | " + box.get(1) + " | " + box.get(2) + " | ");
        System.out.println("-------------");
        System.out.println("| " + box.get(3) + " | " + box.get(4) + " | " + box.get(5) + " | ");
        System.out.println("-------------");
        System.out.println("| " + box.get(6) + " | " + box.get(7) + " | " + box.get(8) + " | ");
        System.out.println("-------------");
    }
    static void playerMove(){
        System.out.print("Enter Your Move: ");
        
        int playerMove = scanner.nextInt() - 1;
            if(box.get(playerMove) != ' '){
                playerMove();
            } else {
                box.set(playerMove, 'X');
            }
       

    }
    static void computerMove(){
        if(box.get(0) != ' ' && box.get(1) != ' ' && box.get(2) != ' ' && box.get(3) != ' ' && box.get(4) != ' ' &&box.get(5) != ' ' && box.get(6) != ' ' && box.get(7) != ' ' && box.get(8) != ' '){
            return;
        }
        int computerNumber = (int)(Math.random() * 9);
        // System.out.println(computerNumber);
            switch(computerNumber){
                case 0:
                    if(box.get(0) == ' '){
                        box.set(computerNumber, 'O');
                    } else {
                        computerMove();
                    } break;
                case 1:
                    if(box.get(1) == ' '){
                        box.set(computerNumber, 'O');
                    } else {
                        computerMove();
                    } break;
                case 2:
                    if(box.get(2) == ' '){
                        box.set(computerNumber, 'O');
                    } else {
                        computerMove();
                    } break;
                case 3:
                    if(box.get(3) == ' '){
                        box.set(computerNumber, 'O');
                    } else {
                        computerMove();
                    } break;
                case 4:
                    if(box.get(4) == ' '){
                        box.set(computerNumber, 'O');
                    } else {
                        computerMove();
                    } break;
                case 5:
                    if(box.get(5) == ' '){
                        box.set(computerNumber, 'O');
                    } else {
                        computerMove();
                    } break;
                case 6:
                    if(box.get(6) == ' '){
                        box.set(computerNumber, 'O');
                    } else {
                        computerMove();
                    } break;
                case 7:
                    if(box.get(7) == ' '){
                        box.set(computerNumber, 'O');
                    } else {
                        computerMove();
                    } break;
                case 8:
                    if(box.get(8) == ' '){
                        box.set(computerNumber, 'O');
                    } else {
                        computerMove();
                    } break;
                
            }
    

    }
    static void decideWinner(){
        
        if(box.get(0) == 'X' && box.get(1) == 'X' && box.get(2) == 'X'){ // first row player
            winner = "Player";
        }
        if(box.get(3) == 'X' && box.get(4) == 'X' && box.get(5) == 'X'){ // second row player
            winner = "Player";
        }
        if(box.get(6) == 'X' && box.get(7) == 'X' && box.get(8) == 'X'){ // third row player
            winner = "Player";
        }
        if(box.get(0) == 'X' && box.get(3) == 'X' && box.get(6) == 'X'){ // first vertical player
            winner = "Player";
        }
        if(box.get(1) == 'X' && box.get(4) == 'X' && box.get(7) == 'X'){ // second vertical player
            winner = "Player";
        }
        if(box.get(2) == 'X' && box.get(5) == 'X' && box.get(8) == 'X'){ // third vertical player
            winner = "Player";
        }
        // computer 

        if(box.get(0) == 'O' && box.get(1) == 'O' && box.get(2) == 'O'){ // first row computer
            winner = "Computer";
        }
        if(box.get(3) == 'O' && box.get(4) == 'O' && box.get(5) == 'O'){ // second row computer
            winner = "Computer";
        }
        if(box.get(6) == 'O' && box.get(7) == 'O' && box.get(8) == 'O'){ // thirt row coomputer
            winner = "Computer";
        }
        if(box.get(0) == 'O' && box.get(3) == 'O' && box.get(6) == 'O'){ // first vertical player
            winner = "Computer";
        }
        if(box.get(1) == 'O' && box.get(4) == 'O' && box.get(7) == 'O'){ // second vertical player
            winner = "Computer";
        }
        if(box.get(2) == 'O' && box.get(5) == 'O' && box.get(8) == 'O'){ // left diagonal player
            winner = "Computer";
        }
        if(winner == "Player"){
            System.out.println("PLayer Won!");
            return;
        } if(winner == "Computer"){
            System.out.println("Computer Won!");
            return;
        } if(box.get(0) != ' ' && box.get(1) != ' ' && box.get(2) != ' ' && box.get(3) != ' ' && box.get(4) != ' ' &&box.get(5) != ' ' && box.get(6) != ' ' && box.get(7) != ' ' && box.get(8) != ' '){
            if(winner == "Player"){
                System.out.println("PLayer Won!");
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