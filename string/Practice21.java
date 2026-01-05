package string;

public class Practice21 {
	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I love India");
        sb.replace(7, 12, "Bharat");
        System.out.println(sb);
    }
}
