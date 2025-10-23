import java.util.ArrayList;

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
    public static void main(String[] args){
        createBox();
        showMap();
        
    }
}