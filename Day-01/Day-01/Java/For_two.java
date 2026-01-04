import java.util.*;
public class For_two {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //sum of digits
        int num=sc.nextInt();
        int sum=0,rem;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println(sum);
        //to find gcd of two numbers
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=1;
        for(int i=1;i<=a && i<b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD:" + gcd);
        //lcm of two numbers
        int lcm=(a*b)/gcd;
        System.out.println("LCM:"+ lcm);
        sc.close();

    }
    
}
