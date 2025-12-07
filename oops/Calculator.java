package oops;
import java.util.Scanner;

 public class Calculator{

    
    public int add(int a,int b){
        return a+b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int divd(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator c=new Calculator();

        System.out.print(" Insert a :");
        int a=sc.nextInt();

        System.out.print(" Insert b :");
        int b=sc.nextInt();


        System.out.println("Addition is "+c.add(a,b));
        System.out.println("Addition is "+c.sub(a,b));
        System.out.println("Addition is "+c.mul(a,b));
        System.out.println("Addition is "+c.divd(a,b));
    }
}