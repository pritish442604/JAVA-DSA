
import java.util.Scanner;

public class evenandodd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number=sc.nextInt();
            if(number % 2==0){
                System.out.println("EVEN");
            }else{
                System.out.println("ODD");
            }
        }
    }
}
