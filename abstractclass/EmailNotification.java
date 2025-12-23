package abstractclass;

class EmailNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("Sending EMAIL notification: " + message);
    }
}
