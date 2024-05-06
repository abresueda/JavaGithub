package Week2.OgrenciBilgiSistemi;

public class StudentOBS {
    CourseOBS c1;
    CourseOBS c2;
    CourseOBS c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    StudentOBS(String name, String stuNo, String classes,CourseOBS c1, CourseOBS c2, CourseOBS c3) {
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=avarage;
        this.isPass=false;
    }

    void printName() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Adı: " + this.name);
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void performance(int performance1, int performance2, int performance3) {
        if (performance1 >= 0 && performance1 <= 100) {
            this.c1.performance = performance1;
        }
        if (performance2 >= 0 && performance2 <= 100) {
            this.c2.performance = performance2;
        }
        if (performance3 >= 0 && performance3 <= 100) {
            this.c3.performance = performance3;
        }
    }

    void isPass() {
        this.avarage = ((this.c1.note*0.80) + (this.c1.performance*0.20) + (this.c2.note*0.80) + (this.c2.performance*0.20)  + (this.c3.note*0.80) + (this.c3.performance*0.20)) / 3;
        if (this.avarage > 55) {
            System.out.println("Sınıfı başarılı şekilde geçtiniz.");
            this.isPass=true;
        }else{
            System.out.println("Sınıfı geçemediniz.");
            this.isPass=false;

        } printNote();
    }

    void printNote(){
        System.out.println(c1.name + " Notu: " + this.c1.note);
        System.out.println(c1.name + " Sözlü Notu: " + this.c1.performance);
        System.out.println(c2.name + " Notu: " + this.c2.note);
        System.out.println(c2.name + " Sözlü Notu: " + this.c2.performance);
        System.out.println(c3.name + " Notu: " + this.c3.note);
        System.out.println(c3.name + " Sözlü Notu: " + this.c3.performance);
        System.out.println("Ortalamanız: " + this.avarage);
    }



}
