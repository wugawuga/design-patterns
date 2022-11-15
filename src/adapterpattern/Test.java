package adapterpattern;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        DoorMan man = new DoorMan();
        man.쫓아내(cat);
        man.쫓아내(dog);

        // 로봇호랑이가 왔을 때도 내보내고 싶다.
        // Animal 타입이 아니기 때문에 에러발생
        RobotTiger robotTiger = new RobotTiger();
        man.쫓아내(robotTiger);
    }
}
