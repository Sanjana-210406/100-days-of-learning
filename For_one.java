import java.util.*;
public class For_one {
    public static void main(String args[]){
           Scanner sc= new Scanner(System.in);
           //multiplication table
           int num=sc.nextInt();
           System.out.println("Multiplication table");
           for(int i=1;i<=10;i++){
            System.out.println(num + "*" + i + "=" + (num*i));
           }
           //sum of odd numbers
           int n=sc.nextInt();
           int sum_odd=0;
           for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum_odd =sum_odd+i;
            }
        }
            System.out.println("SUM OF ODD:" + sum_odd);
           
           //factorial
           int fact=1;
           for(int i=1;i<=num;i++){
            fact=fact*i;
           }
           System.out.println("FACTORIAL:" + fact);
           sc.close();

    }
}
