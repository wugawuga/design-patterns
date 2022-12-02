package templatemethodpattern;

import java.util.Scanner;

public class Test {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("숫자를 입력");
        ExceptionTemplate template = Test::makeInt;
        int checkInt = (int) template.check();
        System.out.println("checkInt = " + checkInt);

        System.out.println("0 ~ 99 만 입력");
        ExceptionTemplate template1 = () -> {
            int finalInt = Integer.parseInt(sc.nextLine());
            validate(finalInt);
            return finalInt;
        };

        int finalCheck = (int) template1.check();
        System.out.println("finalCheck = " + finalCheck);
    }

    private static void validate(int checkInt) {
        if (checkInt < 0 || checkInt > 99) {
            throw new IllegalArgumentException("[ERROR] 0 ~ 99 만 입력가능합니다");
        }
    }

    private static int makeInt() {
        try {
            String str = sc.nextLine();
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자를 입력해주세요");
        }
    }
}
