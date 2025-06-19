

public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // delegate to the wrapped notifier
        sendSMS(message);    // add SMS feature
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

