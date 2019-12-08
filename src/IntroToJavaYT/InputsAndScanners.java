package IntroToJavaYT;
import java.util.Scanner;

public class InputsAndScanners {

    public static void main(String[] args) {
//        int x = 56 % 5;//11 r1
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        int x = Integer.parseInt(scanned);


        System.out.println(x);
    }
}
