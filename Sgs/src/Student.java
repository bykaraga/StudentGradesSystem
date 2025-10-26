public class Student {
    String name;
    String albumNumber;
    Classes math;
    Classes chemistry;
    Classes physics;
    double avrg;
    boolean isPass;

    // Constructor
    Student(String name, String albumNumber) {
        this.name = name;
        this.albumNumber = albumNumber;

        // Dersleri başlatıyoruz
        this.math = new Classes("Math");
        this.chemistry = new Classes("Chemistry");
        this.physics = new Classes("Physics");
    }

    // Not ekleme
    void addGrade(int mathGrade, int chemistryGrade, int physicsGrade) {
        this.math.addGrade(mathGrade);
        this.chemistry.addGrade(chemistryGrade);
        this.physics.addGrade(physicsGrade);
    }

    // Ortalama hesaplama
    void avrgCalculate() {
        this.avrg = (math.grade + chemistry.grade + physics.grade) / 3.0;
        this.isPass = avrg >= 50;
    }

    // Bilgi yazdırma
    void printInfo() {
        System.out.println("Student: " + name + " (" + albumNumber + ")");
        System.out.println("Math Grade: " + math.grade);
        System.out.println("Chemistry Grade: " + chemistry.grade);
        System.out.println("Physics Grade: " + physics.grade);
        System.out.println("Average: " + avrg);
        if (isPass) {
            System.out.println("Student passed the semester ✅");
        } else {
            System.out.println("Student did not pass the semester ❌");
        }
        System.out.println("-----------------------------");
    }
}
