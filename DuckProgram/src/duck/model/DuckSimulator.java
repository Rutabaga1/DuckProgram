package duck.model;

public class DuckSimulator {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		System.out.println("------");
		duck.display();
		duck.performQuack();
		duck.performFly();
		duck.setQuackBehavior(new Squeak());
		System.out.print("I can change my way to quack:   ");
		duck.performQuack();
		System.out.println("------");

	      
	}
}
