import java.util.*;
class calculaterfunc
   {
    public static int add(int a,int b){
     return a+b;
    }

    public static int sub(int a,int b){
        return a-b;
       }

       public static int mul(int a,int b){
        return a*b;
       }

       public static int div(int a,int b){
        return a/b;
       }
    

    public static void main(String[] args) 
    
    {
      
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number");
        int a=s.nextInt();
        System.out.println("enter the second number");
        int b=s.nextInt();
        System.out.println("sumof two number:=" );
        System.out.println(add(a, b));
        System.out.println(sub(a, b));
        System.out.println("subtraction of two number:=" );
        System.out.println(mul(a, b));
        System.out.println("multiplicationof two number:=" );
        System.out.println(div(a, b));
        System.out.println("divison of two number:=" );
    }
}