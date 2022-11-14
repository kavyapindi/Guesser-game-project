import java.util.Scanner;

class UserName{
	
	String username;
	
	// code for registering username
	public void userName(){
		
	    System.out.println("To participate in the Guesser game please register");
	    
	       Scanner scan= new Scanner(System.in);
	       
	       System.out.println("To create username enter your mailId/phoneNumber "); 
	       
	        username=scan.nextLine();
	       
	         }
	}

class PassWord{
	
	String password;
	
	// code for registering password
	 public  void passWord() {
		 
	    	  Scanner scan= new Scanner(System.in);
	    	  
	    	  System.out.println("Create password");
	    	  
	    	   password=scan.nextLine();
	    	  
	   
   }
	
	
}

 class InfoFromPlayers{
	 
	String enterUsername;
	String enterPassword;
	String regUsername;
	String regPassword;
	   
	
	//code for login to play the game 
 public	void  loginUN() {
		   UserName u=new UserName();
		   
		    u.userName();
		    
		    PassWord p=new PassWord();
		    
		      p.passWord();
		      
	System.out.println("Thankyou! you have succesfully registered for the game");
	
		   Scanner scan= new Scanner(System.in);
		   
		   System.out.println("please enter the login details to play the game");
		   
		   System.out.println("Enter username");
		   
		  enterUsername=scan.nextLine(); 
		  
		   regUsername=u.username;	
		   
		  if(regUsername.equalsIgnoreCase(enterUsername))
		  {
			  System.out.println("enter password");
			  
		 }else {
			  System.out.println("username is incorrect please try again");
		               
		 }
		       enterPassword=scan.nextLine(); 
		       
			     regPassword=p.password; 
			   
	   }
	   
	public	boolean Check() {
			 
			 if(regUsername.equalsIgnoreCase(enterUsername) && enterPassword.equals(regPassword)) {
           	  
				 return true; 
           	  
             }  else 
            	
            	
            	 return false; 
			
           	   }
		 
 }

class Guesser{
	
	int guessNum;
	
	public int guessNum() {
		
		System.out.println("_______________________");
		
		System.out.println("Rules of the game");
		
		System.out.println("guessing numbers should be less than 10");
		
		System.out.println("_______________________");
		
	Scanner input=new Scanner(System.in);	
	
	 System.out.println("Guesser guess the number");
	 
	     guessNum =input.nextInt();
	     
	    return guessNum;
	    
	}
	
	  
}

class Players{
	
	int guessNum;
	
	public int guessNum() {
		
		Scanner input=new Scanner(System.in);	
		
		 System.out.println("Player guess the number");
		 
		     guessNum =input.nextInt();
		     
		    return guessNum;
		}
}
class Umpire{

		int numFromGuesser;
		int numFromPlayer1;
		int numFromPlayer2;
		int numFromPlayer3;
		
	public boolean collectNumFromGuesser() {
		
			Guesser g=new Guesser();
			
			numFromGuesser=g.guessNum();
			
			return true;
	}	
	
	 public boolean guessNumcheck() {  
			 
			  if(numFromGuesser>10) {
			     	
			    	return false;
			     }else
			    	 
			    return true;
			    
			    }
		  
		
	     
	public	boolean collectNumFromPlayers() {	
		
			Players p1=new Players();
			Players p2=new Players();
			Players p3=new Players();
			
			numFromPlayer1 =p1.guessNum();
			numFromPlayer2 =p2.guessNum();
			numFromPlayer3 =p3.guessNum();
			
			return true;
			
		}
	
       public  void compare(){
    	   
	    if(numFromGuesser==numFromPlayer1){
	    	
	    	if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
	    		
	    		System.out.println("All Participants won the game");
	    		  
	    	}else if(numFromGuesser==numFromPlayer2) {
	    		
	    		System.out.println("Player 1 & Player 2 won the game");
	    		
	    	}else if(numFromGuesser==numFromPlayer3) {
	    		
	    		System.out.println("Player 1 & Player 3 won the game");
	    		
	    	}else {
	    		
	    		System.out.println("Player 1 won the game");
	    	
	    	}
	  } 
	    if(numFromGuesser==numFromPlayer2 && numFromGuesser!=numFromPlayer1  ){
	    
	    if(numFromGuesser==numFromPlayer2 || numFromGuesser==numFromPlayer3) {
	    	
	         System.out.println("Player2 & Player3 won the game");
	         
	    	}else {
	    		
	    	 System.out.println("Player2  won the game");
		  }
	    }
	    
	       if(numFromGuesser==numFromPlayer3 && numFromGuesser!=numFromPlayer2 &&  numFromGuesser!=numFromPlayer1 ) {
	    	
	    	System.out.println("Player 3 won the game");
	   
	       }else if(numFromGuesser!=numFromPlayer1 && numFromGuesser!=numFromPlayer2 && numFromGuesser!=numFromPlayer3 )
	       {
	    	System.out.println("All Participants loss the game.Please try again!");
	    }
}      
}      
  
public class GuesserGame {
	
	public static void main(String[] args) {
		
		InfoFromPlayers i=new InfoFromPlayers(); 
		
        i.loginUN();
        
        i.Check();
       

        Umpire u= new  Umpire();
        
       
    // checking login credentials   
         boolean res= i.Check();
        
        
        if(res==true) {
        	
        	u.collectNumFromGuesser();
        	
        }else 
        		System.out.println("credentials are wrong please try again");
		
	
      // checking guesser number is below 10 
        boolean input=  u.guessNumcheck();
        
            if(input==true && res==true) {
           
            	u.collectNumFromPlayers();
            	
            	u.compare();
           	    
           }  else if(input!=true && res==true ) {
        	   
            	System.out.println("guesser please guess numbers from 1 to 10");
               
           
            }  
         	   
          
          
        
	}

}
