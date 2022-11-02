/*
* Made by: Phi Dinh Van Toan
* Problem: https://open.kattis.com/contests/ggi5da/problems/hissingmicrophone
* date: 1.11.2022
* */

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        char[] data = scanner.next().toCharArray();
        for (int i = 0; i < data.length-1; i++) {
            if (data[i] == 's' && data[i+1] == 's') {
                System.out.print("hiss");
                return;
            }
        }
        System.out.print("no hiss");
    }
}
