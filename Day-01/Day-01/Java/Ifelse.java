import java.util.*;
public class Ifelse {
    public static void main(String args[]){
        //determine number is positive,negative or zero
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        //determine number is odd or even
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        //determine greatest of three numbers
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is greatest");
        }
        else if(b>a && b>c){
            System.out.println("b is greatest");
        }
        else{
            System.out.println("c is greatest");
        }
        //detremine grades based on marks
        if(num>90){
            System.out.println("A grade");
        }
        else if(num>=75){
            System.out.println("B grade");
        }
        else if(num>=60){
            System.out.println("C grade");
        }
        else if(num>=30){
            System.out.println("D grade");
        }
        else{
            System.out.println("F grade");
        }
        //categorise based on age
        int age=sc.nextInt();
        if(age>60){
            System.out.println("senior");
        }
        else if(20<age && age<60){
            System.out.println("Adult");
        }
        else if(13<age && age<20){
            System.out.println("Teen");
        }
        else{
            System.out.println("Child");
        }
        sc.close();
    }
}
