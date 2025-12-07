class mobile{
    String name="Readmi";
    int model=122400;
}

class features extends mobile{
    String processors="Snapdragon7,gen4";
}

class customer extends features{
    public static void main(String[] args) {
        customer c=new customer();

        System.out.println("Mobile name = "+c.name+"\n"+"Model name = "+c.model+"\n"+"Processor = "+c.processors);
    }
}