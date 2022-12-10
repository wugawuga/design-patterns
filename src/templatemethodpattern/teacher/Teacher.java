package templatemethodpattern.teacher;

public abstract class Teacher {
    public void 수업하기() {
        입장하기();
        출석부르기();
        강의하기();
        퇴장하기();
    }

    abstract void 강의하기();

    private void 입장하기() {
        System.out.println("입장하기");
    }

    private void 출석부르기() {
        System.out.println("출석부르기");
    }

    private void 퇴장하기() {
        System.out.println("퇴장하기");
    }
}
