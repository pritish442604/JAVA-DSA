public class largestnumber {
   public static int getLargest(int numbers[]){
    int largest=Integer.MIN_VALUE;
    int Smallest=Integer.MAX_VALUE;
    for (int i=0; i<numbers.length;i++){
        if(largest < numbers[i]){
            largest= numbers[i];
        }
        if(Smallest>numbers[i]) {
        Smallest = numbers[i] ;  

        }
    
    }
        System.out.println("Smallest value is :"+ Smallest);
    return largest;
   
   } 
   public static void main(String[] args) {
       int numbers[]={1,2,6,3,5};
        System.out.println("largest value is: "+ getLargest(numbers));
    
      
   }
}
                                                                                   