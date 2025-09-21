public class student{
    String studentName;
    int studentId;
    String subject;
    float marks;
    String address;

    student(String studentName,int studentId,String subject,float marks,String address){
        this.studentName = studentName;
        this.studentId = studentId;
        this.subject = subject;
        this.marks = marks;
        this.address = address;
    }

    void get_details(){
        System.out.println(studentName+"\t"+studentId+"\t"+subject+"\t\t"+marks+"\t\t"+address);
    }


    public static void main(String[] args) {
        student s1;
        s1=new student("Pranay",1,"Commerce",70.56f,"Mumbai");
        
        student s2;
        s2=new student("Urvashi",2,"Commerce",50.1f,"Gujrat");
        
        student s3;
        s3=new student("Jayesh",5,"Science",70.36f,"Mumbai");
        
        student s4;
        s4=new student("Priti",6,"Science",70.22f,"Mumbai");

        s1.get_details();
        s2.get_details();
        s3.get_details();
        s4.get_details();
    }
}