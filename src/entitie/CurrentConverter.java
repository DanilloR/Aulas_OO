package entitie;


public class CurrentConverter {
	
	
	public static final double rate = 0.06;
	public double price;
	public double quantity;
	
	public double reais () {
		return (((price*quantity)*rate)+(price*quantity));
	}
	
	public String toString() {
		return "Amount to be paid in reais: "+ String.format("%.2f", reais());
	}

}
