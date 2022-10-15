package Ex1;

public class StudentApp {

    public static void main(String[] args) {

        Student studentArray[] = new Student[5];

        studentArray[0] = new Student("Kamal", "IT", "077333564");
        studentArray[0].print();

        studentArray[1] = new Student("Sunil", "SE", "076435782");
        studentArray[1].print();

        studentArray[2] = new Student();
        studentArray[2].setName("Amal");
        studentArray[2].setDegree("DS");
        studentArray[2].setMobile("07855342");
        studentArray[2].print();

    }

}
