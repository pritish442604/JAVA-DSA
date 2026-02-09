
import java.util.Scanner;

public class continuee {
    public static void main(String[] args) {
        // for(int i=1 ; i<=10 ;i++){
            // if(i==7){
                // continue;
            // }
            // System.out.println(i);
      
            try (// }
            Scanner sc = new Scanner(System.in)) {
                do{
                    System.out.println("enter the number: ");
                    int n = sc.nextInt(); 
                    if(n%10==0){
                        continue;
                    } 
                    System.out.println("number was:" + n);
                }while(true);
            }
    }
}
