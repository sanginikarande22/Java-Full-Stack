package reference;

public class Media {

    void play(String name) {
        System.out.println("Playing media: " + name);
    }

    void stop(int duration) {
        System.out.println("Stopped after " + duration + " minutes");
    }
}
