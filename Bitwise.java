public class Bitwise {
    public static void main(String args[]){
        int a=3,b=4;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(a>>b);
        System.out.println(a<<b);
        //find a number is odd or even using bitwise operator
        if((a&1)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }

    }
}
