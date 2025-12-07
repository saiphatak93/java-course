public class building{
    String name;
    int floors;
    String colors;


    building(String name,int floors,String colors){
        this.name = name;
        this.floors = floors;
        this.colors = colors;
    }

    void print_Details(){
        System.out.println(name);
        System.out.println(floors);
        System.out.println(colors);

    }

    public static void main(String[] args) {
        int n=13;
        int v=78;
        building b1 ;
        b1 = new building("Marathon",19,"red");
        
        building b2;
        b2= new building("Runwal",15,"Gray");

        b1.print_Details();
        b2.print_Details();

        calculator c=new calculator();
        int a=c.add(n, v);
        System.out.println("addition is "+ a);


    }
}