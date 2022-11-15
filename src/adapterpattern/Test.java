package adapterpattern;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        DoorMan man = new DoorMan();
        man.쫓아내(cat);
        man.쫓아내(dog);
    }
}
