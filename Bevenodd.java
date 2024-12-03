import java.util.*;
public class Bevenodd{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if((n&1)==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}