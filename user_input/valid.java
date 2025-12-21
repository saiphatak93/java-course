import java.util.Scanner;
public class valid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter user Name");
        String name=sc.nextLine();

        System.out.println("Enter Password");
        int Password=sc.nextInt();
    
        System.out.println("Username : "+name);
        System.out.println("Password : "+Password);
    }
}