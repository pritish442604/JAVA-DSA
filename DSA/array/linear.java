public  class linear {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n = 5;
        int result = 6;
        for(int i=0;i<n;i++){
            if (result==arr[i]) {
                System.out.println("element found");
                
            } else {
                System.out.println("element not found");
            }
        }
    }

    
}
