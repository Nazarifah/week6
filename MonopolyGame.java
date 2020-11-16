public class MonopolyGame{
	public static void main(String[] args) {
		Token wheelbarrow = new Token("wheelbarrow", "red");
		wheelbarrow.updatePosition(5);
		System.out.println(wheelbarrow);
		
		Player p1 = new Player("nazarifah", wheelbarrow);
		System.out.println(p1);

		Token hat = new Token("hat", "blue");

		PropertyOwner pr1 = new PropertyOwner("nazarifah", hat);
		pr1.buyProperty("Mydin Sdn. Bhd. ");
		System.out.println(pr1);

		Token car = new Token();

	}
}