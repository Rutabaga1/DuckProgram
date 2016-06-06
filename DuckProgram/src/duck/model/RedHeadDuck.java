package duck.model;

public class RedHeadDuck extends Duck{
	public RedHeadDuck() {  
	    flyBehavior=new FlyWithRocket();  
	    quackBehavior=new MuteQuack();  
	  }
	public void display() {  
	    System.out.println("I'm a redheadduck and I have red head.");  
	  }
}
