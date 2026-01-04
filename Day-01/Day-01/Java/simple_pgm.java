public class simple_pgm {
    public static void main(String[] args){
        //perimeter of rectangle
        int a=2,b=3,c=4,d=5;
        System.out.println("Perimeter of rectangle:" + (a+b+c+d));
        //area of triangle
        float breadth= 4,height=4;
        float area= (breadth * height)/2;
        System.out.println("Area of Triangle"+" "+ area);
        //simple interest
        int p=10000,t=2,r=1;
        int si=(p*t*r)/100;
        System.out.println(si);
        int ci=p*(1+(r/100))*t;
        System.out.println(ci);
        //convert fahrenheit to celsius
        float f=150;
        float celsius = (f-32)* 5/9;
        System.out.println(celsius);
    }
    
}