public class Main {

    public static void main(String[] args){
Classes math = new Classes("Math");
Classes physicist = new Classes("physicist");
Classes chemistry = new Classes("chemistry");

Student student1 = new Student("Jack Jackson " , "258" );

student1.addGrade(70,80,30);

student1.avrgCalculate();
student1.printInfo();
    }

}
