package string;

public class Practice20 {
	public static void main(String[] args) {
		
	
	StringBuffer sb = new StringBuffer("Programming");
    sb.delete(sb.length() - 3, sb.length());
    System.out.println(sb);
}
}
