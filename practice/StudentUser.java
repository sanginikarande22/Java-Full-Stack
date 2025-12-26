package practice;

class StudentUser extends User implements  LibraryActions , Display {
 
	StudentUser(int userid, String username) {
		super(userid, username);
		

	}
       public void issueBook() {
    	   System.out.println(" Username:" +username+" Has Issuded  the book" ) ;
	    
	}
       public void returnBook() {
    	   System.out.println(" Username:" +username+" Has returned the book" ) ;
    	   System.out.println("Late fee (if any): " + LATE_FEE);
    	   
       }
	   @Override
	   public void showDetails() {
	
			    System.out.println("UserID: " + userid + ", Username: " + username);
			}
		
	   }
	
	
