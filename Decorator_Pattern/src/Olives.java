
public class Olives extends ToppingDecorator{
	Pizza pizza;
	public Olives(Pizza pizza) {
		this.pizza = pizza;
	}
	public String getDesription() {
		return pizza.getDesription() + ", Olives";
	}
	public double cost() {
		return pizza.cost() + 1.90;
	}

}
