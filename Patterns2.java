import java.util.*;
public class Patterns2 {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int N;
      N=sc.nextInt();
      for(int i=0;i<N;i++){
         for(int j=0;j<N-i;j++){
            System.out.print("* ");
         }
         System.out.print("\n");
      }
      //printing character pattern
      char ch='A';
      for(int i=0;i<N;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(ch);
            ch++;
        }
        System.out.print("\n");
      }
    }
    
}
