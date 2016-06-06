package duck.model;

public class MallardDuck extends Duck{
	public MallardDuck() {  
	    flyBehavior=new FlyWithWings();  
	    quackBehavior=new Quack();  
	  }
	public void display() {  
	    System.out.println("I'm a mallardduck and I have green head.");  
	  }
}
