import java.util.*;
public class swapping1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        String res=String.format("Atfer swapping\nboy=%d\ngirl=%d",a,b);
        System.out.println(res);
    }
}