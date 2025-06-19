public class Main {
    public static void main(String[] args) {
        // Basic notifier
        Notifier notifier = new EmailNotifier();

        // Add SMS feature
        notifier = new SMSNotifierDecorator(notifier);

        // Add Slack feature
        notifier = new SlackNotifierDecorator(notifier);

        // Final: sends Email + SMS + Slack
        notifier.send("Server is down!");
    }
}

