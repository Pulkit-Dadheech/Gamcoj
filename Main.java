import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Game Choice");
        System.out.println("1. Sudoku");
        System.out.println("2. Random Number Generator");
        System.out.println("3. TicTacToe");
        System.out.println("4. Rock Paper Scissor");
        int choice=sc.nextInt();
        if(choice==1) {
            sudoku s=new sudoku();
            s.sudosol();
        }

        else if(choice==2) {
            NumGame num=new NumGame();
            num.NumberGame();
        }
        else if(choice==3) {

            ticTacToe t=new ticTacToe();
            t.board();
        }
        else if(choice==4) {

            RockPaperScissor r=new RockPaperScissor();
            r.RPS();
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}