import java.util.*;
public class Arithmetic_op {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //product of two floating numbers
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        System.out.println(c*d);
        sc.close();
    }
}
