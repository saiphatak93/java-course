class vehical{
    String name="MM";
    int model=1234;

}

class car extends vehical{
    String Owner_Name="Sai";
    public static void main(String[] args) {
        car mycar = new car();

        System.out.println(mycar.name+" "+mycar.model+" "+mycar.Owner_Name);
    }
}