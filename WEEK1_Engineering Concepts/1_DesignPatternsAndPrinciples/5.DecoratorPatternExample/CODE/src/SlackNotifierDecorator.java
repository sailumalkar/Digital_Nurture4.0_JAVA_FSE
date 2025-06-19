public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);  // delegate
        sendSlack(message);   // additional Slack logic
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack Message: " + message);
    }
}

