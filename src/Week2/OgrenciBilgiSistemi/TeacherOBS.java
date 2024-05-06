package Week2.OgrenciBilgiSistemi;

public class TeacherOBS {
    String name;
    String branch;
    String mobileNo;

    TeacherOBS(String name,String branch,String mobileNo) {
        this.name=name;
        this.branch=branch;
        this.mobileNo=mobileNo;
    }

    void print() {
        System.out.println("Adı: " + this.name);
        System.out.println("Bölümü: "+ this.branch);
        System.out.println("Telefon Numarası: "+ this.mobileNo);
    }
}
