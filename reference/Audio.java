package reference;

public class Audio extends Media {

    void play(String name) {
        System.out.println("Playing Audio: " + name);
    }

    void stop(int duration) {
        System.out.println("Audio stopped after " + duration + " minutes");
    }
}
