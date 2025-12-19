package reference;

	public class Video extends Media {

	    void play(String name) {
	        System.out.println("Playing Video: " + name);
	    }

	    void stop(int duration) {
	        System.out.println("Video stopped after " + duration + " minutes");
	    }
	}