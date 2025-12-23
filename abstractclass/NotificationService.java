package abstractclass;

public class NotificationService {

    public static void main(String[] args) {

        Notification n;  

        n = new EmailNotification();
        n.send("Your order is confirmed");
        n.log();

        n = new SmsNotification();
        n.send("OTP is 456789");
        n.log();
    }
}

