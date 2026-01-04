import java.util.*;
public class For_four {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //to check a number is armstrong
        int sum=0;
        int rem;
        int temp=num;
        while(num!=0){
            rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }
        if(temp==sum)
           System.out.println("Armstrong");
        else
           System.out.println("Not armstrong");
        //to check if a number is palindome
        num=temp;
        int rev=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10 +rem;
            num=num/10;
        }
        if(temp==rev)
            System.out.println("Palindrome");
        else 
            System.out.println("Not Palindrome");
        sc.close();
    } 
}
