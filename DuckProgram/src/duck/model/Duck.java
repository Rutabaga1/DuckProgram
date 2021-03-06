package duck.model;

public abstract class Duck {
	FlyBehavior flyBehavior;  
	QuackBehavior quackBehavior;
	
	public void swim() {  
	    System.out.println("All ducks float, even decoys.");    
	}  
	    
	public abstract void display(); 
	  
	public void performFly() {  
		    //不自行处理fly()行为，而是委拖给引用flyBehavior所指向的行为对象  
		    flyBehavior.fly();  
	}  
		  
	public void performQuack() {  
		    quackBehavior.quack();  
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {  
			    this.flyBehavior=flyBehavior;  
	}  
			    
	public void setQuackBehavior(QuackBehavior quackBehavior) {  
			    this.quackBehavior=quackBehavior;  
	}
}
