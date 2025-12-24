package keywords;

public class This_Ex {
	    String name;
	    int age;

	    This_Ex() {
	        this("Unknown", 0);  
	    }

	    This_Ex(String name, int age) {
	        this.name = name;     
	        this.age = age;
	    }

	    void show() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    This_Ex updateAge(int age) {
	        this.age = age;
	        return this;          
	    }


	    public static void main(String[] args) {
	    	This_Ex p = new This_Ex();
	        p.updateAge(20).show();
	    }
	}

