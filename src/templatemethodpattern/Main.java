package templatemethodpattern;

import templatemethodpattern.teacher.JavaTeacher;
import templatemethodpattern.teacher.PythonTeacher;
import templatemethodpattern.teacher.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher jt = new JavaTeacher();
        jt.수업하기();

        Teacher pt = new PythonTeacher();
        pt.수업하기();
    }
}
