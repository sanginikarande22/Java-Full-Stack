package abstractclass;

abstract class Notification {

    abstract void send(String message);

    void log() {
        System.out.println("Notification logged in system");
    }
}