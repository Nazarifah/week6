//derive or sub or child class
public class PropertyOwner extends Player{
	// private String name;
	// private double totalCashInHand;
	// private Token selectedToken;
	private String nameOwnedProperty; //extra

	public PropertyOwner() {}

	public PropertyOwner(String name, Token selectedToken){
		// this.name = name;
		// this.selectedToken = selectedToken;
		// totalCashInHand = 500_000;
		super(name, selectedToken);
		nameOwnedProperty = "No property yet"; //extra
	}

	public void buyProperty(String nameOwnedProperty){
		this.nameOwnedProperty = nameOwnedProperty;
	}
	
	@Override
	public void updatetotalCashInHand(double totalCashInHand){
		// super.updatetotalCashInHand(totalCashInHand);
		super.totalCashInHand += totalCashInHand;
		// this.totalCashInHand += totalCashInHand;
	}

	public String toString(){
		// return "Player name " + name
		// + " with token " + selectedToken
		// + " has RM " + totalCashInHand

		return super.toString()
		+ " and has " + nameOwnedProperty; //extra
	}
}