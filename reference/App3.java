package reference;

public class App3 {

    public static void main(String[] args) {

        Media m; 

        m = new Audio();
        m.play("Music Track");
        m.stop(5);

        m = new Video();
        m.play("Movie Clip");
        m.stop(20);

    }
}










