package decoratorpattern.notification;

public class EmailNotifier implements Notifier {

    private Notifier notifier;

    public EmailNotifier() {

    }

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
        System.out.println("이메일 알림");
    }
}