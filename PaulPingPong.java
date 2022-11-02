import java.util.Scanner;

/*
* made by Phi Dinh Van Toan
* Problem: https://open.kattis.com/contests/ggi5da/problems/pauleigon
* date: 1.11.2022
* */
public class PaulPingPong {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int Q = scanner.nextInt();
        if( ((P+Q) / N)%2 == 0) System.out.println("paul");
        else System.out.print("opponent");
    }
}
