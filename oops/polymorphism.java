public class polymorphism{

    static void area(int a){
        System.out.println("Area of square "+a*a);
    }
    static void area(int a,int b){
        System.out.println("Area of triangle :"+0.5*a*b);
    }

    static void area(int a,int b,int c){
        System.out.println("Area of rectangle :"+a*b*c);
    }

    static void area(int a,int b,int c,int d){
        System.out.println("Area of hexagone : "+(6 * (a * b)) / (4 * Math.tan(Math.PI / 6)));
    }

    static void area(int a,int b,int c,int d,int e){
        int pent=a+b+c+d+e;
        System.out.println("Perimeter of Pentagone :"+pent);
    }

    public static void main(String[] args) {
        area(5);
        area(5,6);
        area(5,7,6);
        area(5,5,6,4);
        area(5,5,6,4,8);
    }

}