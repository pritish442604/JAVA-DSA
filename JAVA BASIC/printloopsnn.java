
import java.util.Scanner;

public class printloopsnn {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int range = sc.nextInt();
            int counter = 1;
            while(counter<=range){
                System.out.println(counter+ "");
                counter++;
            }
        }

    }
}
