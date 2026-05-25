import java.util.*;
public class Input {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
        String name=sc.next();
        System.out.println(name);
        sc.nextLine();
        String big =sc.nextLine();
        System.out.println(big);
        sc.close();
    }
}
