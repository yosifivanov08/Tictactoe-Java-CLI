import java.util.ArrayList;
import java.util.Scanner;

public class Tictactoe {
    
    static ArrayList<Character>box = new ArrayList<>();
    
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
        System.out.print("Enter Your Move(1-9): ");
        Scanner scanner = new Scanner(System.in);
        int playerMove = scanner.nextInt() - 1; 
            switch(playerMove){
                default:
                    System.out.print("Please Enter A Valid Choice(1-9): ");
                    playerMove = scanner.nextInt() - 1;
                    break;
                case 0:
                    if(box.get(0) == ' '){
                        box.set(playerMove, 'X');
                    } else{
                        System.out.print("Please Enter A Valid Choice(1-9): ");
                        playerMove = scanner.nextInt() - 1;
                        break;
                    }
                case 1:
                    if(box.get(1) == ' '){
                        box.set(playerMove, 'X');
                    } else{
                        System.out.print("Please Enter A Valid Choice(1-9): ");
                        playerMove = scanner.nextInt() - 1;
                        break;
                    }
                case 2:
                    if(box.get(2) == ' '){
                        box.set(playerMove, 'X');
                    } else{
                        System.out.print("Please Enter A Valid Choice(1-9): ");
                        playerMove = scanner.nextInt() - 1;
                        break;
                    }
                case 3:
                    if(box.get(3) == ' '){
                        box.set(playerMove, 'X');
                    } else{
                        System.out.print("Please Enter A Valid Choice(1-9): ");
                        playerMove = scanner.nextInt() - 1;
                        break;
                    }
                case 4:
                    if(box.get(4) == ' '){
                        box.set(playerMove, 'X');
                    } else{
                        System.out.print("Please Enter A Valid Choice(1-9): ");
                        playerMove = scanner.nextInt() - 1;
                        break;
                    }
                case 5:
                    if(box.get(5) == ' '){
                        box.set(playerMove, 'X');
                    } else{
                        System.out.print("Please Enter A Valid Choice(1-9): ");
                        playerMove = scanner.nextInt() - 1;
                        break;
                    }
                case 6:
                    if(box.get(6) == ' '){
                        box.set(playerMove, 'X');
                    } else{
                        System.out.print("Please Enter A Valid Choice(1-9): ");
                        playerMove = scanner.nextInt() - 1;
                        break;
                    }
                case 7:
                    if(box.get(7) == ' '){
                        box.set(playerMove, 'X');
                    } else{
                        System.out.print("Please Enter A Valid Choice(1-9): ");
                        playerMove = scanner.nextInt() - 1;
                        break;
                    }
                case 8:
                    if(box.get(8) == ' '){
                        box.set(playerMove, 'X');
                    } else{
                        System.out.print("Please Enter A Valid Choice(1-9): ");
                        playerMove = scanner.nextInt() - 1;
                        break;
                    }
                
            }
        
    }
    static void computerMove(){
        int computerNumber = (int)(Math.random() * 9);
        System.out.println(computerNumber);
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
    
    public static void main(String[] args){
        createBox();
        showMap();
        playerMove();
        showMap();
        computerMove();
        showMap();

        
    }
}