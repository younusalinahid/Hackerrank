import java.io.*;
import java.util.*;

public class StdInAndStdOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        scanner.close();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}
