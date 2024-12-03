import java.util.*;
public class Assignment{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        a+=b;
        b*=a;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println(a-=34);
        System.out.println(a/=3);
    }
}