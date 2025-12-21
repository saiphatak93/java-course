import java.util.Scanner;

public class valid2 {

    String userName;
    private int password;

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        valid2 v = new valid2();
       
        System.out.println("Enter user name:");
        v.userName=sc.nextLine();    


        System.out.println("Enter password:");
        int uN=sc.nextInt();
        v.setPassword(uN);  

        System.out.println("Username: " + v.userName);
        System.out.println("Password: " + v.getPassword());
    }
}
