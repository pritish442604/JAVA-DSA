
public class builders {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
          //sb.append(ch);
          sb.append(ch).append(" ");
        }
        System.out.println(sb);
    
    }

}


