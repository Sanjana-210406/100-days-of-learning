import java.util.*;
public class For_three {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //to check a number is prime or not
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a prime");
        }
        //to reverse digits of an integer
        
        int rev=0,digit;
        int N=sc.nextInt();
        while(N!=0){
            digit=N%10;
            rev=rev*10+digit;
            N=N/10;
        }
        System.out.println("Reverse of number:"+ rev);
        //fibonacci sequence
        int n=5; //number of terms
        int a=0,b=1; // first two numbers
        for(int i=0;i<=n;i++){
            System.out.print(a +" ");
            int c = a+b;
            a=b;
            b=c;
        }
        sc.close();
    }
    
}
