import java.util.Scanner;

public class CokTailNoAlcohol {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        short[] A = new short[3];
        A[0] = scanner.nextShort();
        A[1] = scanner.nextShort();
        A[2] = scanner.nextShort();
        byte[] a = new byte[3];
        a[0] = scanner.nextByte();
        a[1] = scanner.nextByte();
        a[2] = scanner.nextByte();
        float min = Float.MAX_VALUE-1;
        for (int i = 0 ; i < 3 ; i++){
            if (((float)A[i] / (float)a[i]) <= min) min = (float)A[i] / (float)a[i];
        }
        System.out.printf("%.6f %.6f %.6f",A[0]-(a[0]*min),A[1]-(a[1]*min),A[2]-(a[2]*min));
    }
}
