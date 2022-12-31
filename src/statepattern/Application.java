package statepattern;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player player = new Player();
        String command = "";
        while (!command.equals("5")) {
            System.out.println("플레이어의 상태 : " + player.getState().getDescription());
            System.out.println("속도 : " + player.getSpeed());
            System.out.println("1. 제자리 서기 2. 앉기 3. 걷기 4. 뛰기 5. 종료");

            command = sc.nextLine();
            System.out.println();

            if (command.equals("1")) {
                player.getState().standUp();
            } else if (command.equals("2")) {
                player.getState().sitDown();
            } else if (command.equals("3")) {
                player.getState().walk();
            } else if (command.equals("4")) {
                player.getState().run();
            }
        }
    }
}
