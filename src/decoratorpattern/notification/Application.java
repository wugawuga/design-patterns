package decoratorpattern.notification;

public class Application {
    public static void main(String[] args) {
//        Notifier notifier = new BasicNotifier();
//        notifier.send();
//        System.out.println("--end--");

        // 이메일 알림과 기본 알림을 동시에 진행하고 싶다
        Notifier emailNotifier = new EmailNotifier(new BasicNotifier());
        emailNotifier.send();
        System.out.println("--end--");

        Notifier smsNotifier = new SmsNotifier(new BasicNotifier());
        smsNotifier.send();
        System.out.println("--end--");

        // 1. 기본 알림 -> 이메일 알림 -> 문자 알림
        Notifier allNotifier = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        allNotifier.send();
        System.out.println("--end--");

        // 2. 기본 알림 -> 문자 알림 -> 이메일 알림
        Notifier allNotifier2 = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
        allNotifier2.send();
        System.out.println("--end--");

        // 3. 전체 알림 (기본 알림 -> ~~~~)
        Notifier allNotifier3 = new SmsNotifier(new EmailNotifier(new EmailNotifier(new BasicNotifier())));
        allNotifier3.send();
        System.out.println("--end--");

        // 4. 기본 알림
        Notifier basicNotifier = new BasicNotifier();
        basicNotifier.send();
        System.out.println("--end--");

        // 5. 기본 알림 + 문자 알림
        Notifier smsNotifier2 = new SmsNotifier(new BasicNotifier());
        smsNotifier2.send();
        System.out.println("--end--");

        // 6. 기본 알림 + 이메일 알림
        Notifier emailNotifier2 = new EmailNotifier(new BasicNotifier());
        emailNotifier2.send();
        System.out.println("--end--");

        // 7. 이메일 알림만 하고싶다
        Notifier onlyEmailNotifier = new EmailNotifier();
        // NPE 발생
        onlyEmailNotifier.send();
    }
}
