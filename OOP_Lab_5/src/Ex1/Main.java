package Ex1;

public class Main {
    public static void main(String[] args) {

//        Animal animal1 = new Animal("test"); //cannot create object for abstract class
//        animal1.display();

        Cat mycat = new Cat("Micky");
        mycat.display();

        Dog mydog = new Dog("Rover");
        mydog.display();

        ToyCat mytoy = new ToyCat("kittie","Toysrus");
        mytoy.display();

        ToyCat mytoy1 = new ToyCat();

//        Dog dog = new Dog();

    }
}
