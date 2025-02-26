class Student{
    int rollNo;
    String name;
    int marks;
}

public class Array_Objects{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Navin";
        s1.marks = 80;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Harsh";
        s2.marks = 66;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Kiran";
        s3.marks = 96;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student s:students){
            System.out.println(s.name+" : "+s.marks);
        }
    }
}

