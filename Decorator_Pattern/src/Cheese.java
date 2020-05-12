
public class Cheese extends ToppingDecorator {
	Pizza pizza;
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}
	public String getDesription() {
		return pizza.getDesription() + ", Cheese";
	}
	
	public double cost() {
		return pizza.cost() + 2.0;
	}

}
