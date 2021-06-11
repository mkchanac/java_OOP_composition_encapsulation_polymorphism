
public class DeluxeBurger extends Hamburger{

	public DeluxeBurger() {
		super("Deluxe","Sausage & Bacon",14.54,"White");
		addHamburgerAddition1("",0);
		addHamburgerAddition2("",0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addHamburgerAddition1(String addition1Name, double addition1Price) {
		addition1Name = "Chips";
		addition1Price = 2.75;
		super.addHamburgerAddition1(addition1Name, addition1Price);
	}

	@Override
	public void addHamburgerAddition2(String addition2Name, double addition2Price) {
		addition2Name = "Drink";
		addition2Price = 1.81;
		super.addHamburgerAddition2(addition2Name, addition2Price);
	}

	@Override
	public void addHamburgerAddition3(String addition3Name, double addition3Price) {
		System.out.println("Cannot not add additional items to deluxe burger");
	}

	@Override
	public void addHamburgerAddition4(String addition4Name, double addition4Price) {
		System.out.println("Cannot not add additional items to deluxe burger");
	}
	
	
	
	

}
