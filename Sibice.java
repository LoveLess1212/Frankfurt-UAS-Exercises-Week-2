import java.util.Scanner;
/*
 * made by Phi Dinh Van Toan
 * Problem: https://open.kattis.com/contests/ggi5da/problems/pauleigon
 * date: 1.11.2022
 * */
public class Sibice {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        byte N = scanner.nextByte();
        byte W = scanner.nextByte();
        byte H = scanner.nextByte();
        // calculate the diagonal of the box bcs the dia is the longest line, rounded down
        short diagonal = (short)Math.floor(Math.sqrt(Math.pow(W,2) + Math.pow(H,2)));
        for (int i = 0; i < N; i++) {
            if(scanner.nextInt() <= diagonal) System.out.println("DA");
            else System.out.println("NE");
        }
    }
}
