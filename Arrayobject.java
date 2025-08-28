class Student{
    int rollNO;
    String name;
    int marks;
}
public class Arrayobject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNO=1;
        s1.name="ram";
        s1.marks=96;

        Student s2 = new Student();
        s2.rollNO=2;
        s2.name="Shyam";
        s2.marks=86;

        Student s3 = new Student();
        s3.rollNO=3;
        s3.name="Somya";
        s3.marks=76;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        System.out.println("name"+" "+"rollNO"+" "+"Marks");


        // for(int i=0; i<students.length;i++){
        //     // System.out.println(students[i]);//Give output as 3 address of s1,s2 and s3;
            
        //     System.out.println(students[i].name+" : "+students[i].rollNO+" : "+students[i].marks);
        // }


        //you can apply also enhance for loop(foreach loop)
        for(Student stud :students){
            System.out.println(stud.name+" : "+stud.rollNO+" : "+stud.marks);
        }
        
    }
}
