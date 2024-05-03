package Week2;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        TeacherOBS t1=new TeacherOBS("Erdem Hoca",  "Matematik", "050550");
        TeacherOBS t2=new TeacherOBS("Yeliz Hoca", "Fizik", "060660");
        TeacherOBS t3=new TeacherOBS("Ayşe Hoca", "Tarih","070770");

        CourseOBS matematik =new CourseOBS("Matematik","mat101", "Matematik", t1);
        matematik.addTeacher(t1);

        CourseOBS fizik=new CourseOBS("Fizik","fzk101","Fizik",t2);
        fizik.addTeacher(t2);

        CourseOBS tarih=new CourseOBS("Tarih","trh101", "Tarih",t3);
        tarih.addTeacher(t3);

        StudentOBS s1=new StudentOBS("Ali","521","10",matematik,fizik,tarih);
        s1.printName();
        s1.addBulkExamNote(80,60,90);
        s1.performance(85,90,90);
        s1.isPass();

        StudentOBS s2=new StudentOBS("Veli","530","10",matematik,fizik,tarih);
        s2.printName();
        s2.addBulkExamNote(50,34,66);
        s2.performance(50,75,80);
        s2.isPass();

        StudentOBS s3=new StudentOBS("Beyza","542","10",matematik,fizik,tarih);
        s3.printName();
        s3.addBulkExamNote(20,55,77);
        s3.performance(70,90,85);
        s3.isPass();

    }
}
