import java.util.Scanner;

/*
made by: Toan :V
question: https://open.kattis.com/contests/ggi5da/problems/jewelrybox
31.10.2022
* */
class degreeEq{
    private int a,b,c;
    degreeEq(int a,int b,int c){
        this.a =a;
        this.b =b;
        this.c =c;
    }

    public double delta(){
        //System.out.printf("delta is: %f\n" ,Math.pow(b,2) -4 *a*c);
        return Math.pow(b,2) -4 *a*c;
    }
    public double smallerRoot(){
        //System.out.printf("((double)(-b-Math.sqrt(delta()))/(double)(2*a))is: %f\n",((double)(-b-Math.sqrt(delta()))/(double)(2*a)));
        return ((double)(-b-Math.sqrt(delta()))/(double)(2*a));
    }
}
public class giftNightmare {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        short N = scanner.nextShort();
        byte[] x = new byte[N];
        byte[] y = new byte[N];

        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextByte();
            y[i] = scanner.nextByte();

        }
        for (int i = 0; i < N; i++) {
            degreeEq data = new degreeEq(12,-4*(x[i]+y[i]),x[i]*y[i]);
            System.out.printf("%.11f\n",
                    x[i]*y[i]*data.smallerRoot()
                            -
                            2 *(x[i]+y[i])*Math.pow(data.smallerRoot(),2)
                            +
                            4*Math.pow(data.smallerRoot(), 3)
            );
        }

    }
}
