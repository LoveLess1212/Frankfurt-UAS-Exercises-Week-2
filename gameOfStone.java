import java.util.Scanner;

public class gameOfStone {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() % 2 == 1) System.out.print("Alice");
        else System.out.print("Bob");
    }
}
