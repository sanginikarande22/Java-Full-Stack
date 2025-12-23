package abstractclass;

class SmsNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
