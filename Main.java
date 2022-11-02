import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (Objects.equals(a, "OCT 31") || Objects.equals(a, "DEC 25")) System.out.print("yup");
        else System.out.print("nope");
    }
}