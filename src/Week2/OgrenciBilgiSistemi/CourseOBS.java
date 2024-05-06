package Week2.OgrenciBilgiSistemi;

public class CourseOBS {
    TeacherOBS teacher;
    String name;
    String code;
    String prefix;
    int performance;
    int note;

    CourseOBS(String name, String code, String prefix, TeacherOBS teacher) {
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        this.performance=0;
        int note=0;
    }

    void addTeacher(TeacherOBS teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve Ders Bölümleri eşleşmiyor.");
        }
    }

    void printTeacherInfo() {
        this.teacher.print();
    }
}
