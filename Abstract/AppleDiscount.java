package Abstract;

class AppleDiscount implements Discount{
	
	// similar to inherit which use extends	
	public float percentOfDiscount() {  //percentage of discount for apple
		return 0.9f;
	}
}

class FujiDiscount implements Discount{
	
	public float percentOfDiscount() { // percentage of discount for Fuji Apple
		return 0.8f;
	}
}

class GrannyDiscount implements Discount{
	public float percentOfDiscount() {  //percentage of discount for Granny Smith Apple 
		return 0.7f;   
	}
}