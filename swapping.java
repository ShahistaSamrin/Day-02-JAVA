import java.util.*;
public class swapping{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        int g=s.nextInt();
        int c=b;
        b=g;
        g=c;
        String res=String.format("after swapping\nboy=%d\ngirl=%d",b,g);
        System.out.println(res);
    }
}