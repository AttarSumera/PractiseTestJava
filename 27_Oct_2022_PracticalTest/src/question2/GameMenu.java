package question2;

public class GameMenu {

	public void startGame() {
		System.out.println("Start the Game");
	}
	public void displayGameInstruction()
	{
		System.out.println("display game instruction");
	}
	public void Exit()
	{
		System.out.println("Exit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameMenu obj=new GameMenu();
		int menuChoice=3;
		switch (menuChoice) {
	      case 1:
	    	  obj.startGame();
	        
	        break;
	      case 2:
	    	  obj.displayGameInstruction();
	       
	        break;
	      case 3:
	        obj.Exit();
	        break;

	}
}
}