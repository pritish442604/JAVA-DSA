public class linearsearch2{
    public static int linearsearch(String[] menu,String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args ) {

        String menu[]={"dosa","chole bhature","samosa"};
        String key ="dosa";
        int index =linearsearch(menu, key);
        if (index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key is at index: " + index);
        }
            
        }
}
       


 