public class Classes {
    String name;
    int grade;


    Classes(String name){
        this.name=name;
        this.grade=0;
    }
    void addGrade(int grade){
        if(grade >=0 && grade <=100){
            this.grade=grade;
        }else System.out.println("Wrong grade input "+name);
    }

}
