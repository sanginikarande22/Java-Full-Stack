package abstraction;

public class Server {
	public void log() {
        System.out.println("Logging server activity");
    }

    public void monitor() {
        System.out.println("Monitoring server performance");
    }

    public static void main(String[] args) {
        Server s = new Server();
        s.log();
        s.monitor();
    }
}

