package templatemethodpattern;

import templatemethodpattern.teacher.JavaTeacher;
import templatemethodpattern.teacher.PythonTeacher;

public class Main {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
        jt.수업하기();

        PythonTeacher pt = new PythonTeacher();
        pt.수업하기();
    }
}
