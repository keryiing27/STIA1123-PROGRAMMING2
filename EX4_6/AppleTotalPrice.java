package EX4_6;

//total price of apple
class AppleTotalPrice implements PriceOfFruits{
	
	double ap = 1.99; // ap -->for the price of apple, quantity >5 && <=100
	double aap = 1.25; //aap -->for the price of apple, quantity >100
	
	public double totalPrice(double q) {
		return ap * q;
	}
	public double totalPrice(double disc, double q) {
		return (aap * q)*(1-disc);
	}
}

//total price of fuji apple
class FujiTotalPrice implements PriceOfFruits{
	
	double fj = 1.99; //fj-> price of fuji, quantity > 5 && <=100
	double fjp = 1.6; // fjp -> price of fuji, quantity >100
	
	public double totalPrice(double q) {
		return fj * q;
	}
	public double totalPrice(double disc, double q) {
		return (fjp * q)*(1-disc);
	}
}

//total price of granny smith apple
class GrannySmithTotalPrice implements PriceOfFruits{
	
	double gs = 2.00; //gs-> price of granny smith, quantity > 5 && <=100
	double gsp = 1.85; // gsp -> price of granny smith, quantity >100
	
	public double totalPrice(double q) {
		return gs * q;
	}
	public double totalPrice(double disc, double q) {
		return (gsp * q)*(1-disc);
	}
}

//total price of grape
class GrapeTotalPrice implements PriceOfFruits{
	
	double g = 12.50; //g-> price of grape, quantity > 5 && <=100
	double gp = 11.99; // gp -> price of grape, quantity >100
	
	public double totalPrice(double q) {
		return g * q;
	}
	public double totalPrice(double disc, double q) {
		return (gp * q)*(1-disc);
	}
}

//total price of kiwi
class KiwiTotalPrice implements PriceOfFruits{
	
	double k = 12.50; //k-> price of kiwi, quantity > 5 && <=100
	double kp = 11.99; // kp -> price of kiwi, quantity >100
	
	public double totalPrice(double q) {
		return k * q;
	}
	public double totalPrice(double disc, double q) {
		return (kp * q)*(1-disc);
	}
}