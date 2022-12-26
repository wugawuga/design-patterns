package decoratorpattern.notification;

public class Application {
    public static void main(String[] args) {
        Notifier notifier = new BasicNotifier();
        notifier.send();
        System.out.println("--end--");

        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send();
        System.out.println("--end--");

        // 이메일 알림과 기본 알림을 동시에 진행하고 싶다
    }
}
