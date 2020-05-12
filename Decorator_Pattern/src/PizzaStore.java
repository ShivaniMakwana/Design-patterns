
public class PizzaStore {

	public static void main(String[] args) {
		Pizza pizza = new ThinCrustPizza();
		Pizza cheesePizza = new Cheese(pizza);
		Pizza cheeseOlivePizza = new Olives(cheesePizza);
		
		System.out.println(cheeseOlivePizza.getDesription() + " $ " + cheeseOlivePizza.cost());

	}

}
