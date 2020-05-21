package Section7Problem1;

/** This class is a utility class.  */
public class DiscountRate {

	/**
	 * These static variables are constant. All variables and methods are static
	 * as it is part of the instruction. Static fields and methods are represented
	 * by underscore.  
	 */
	private static double serviceDiscountPremium = 0.2; 
	private static double serviceDiscountGold = 0.15; 
	private static double serviceDiscountSilver = 0.1;
	private static double productDiscountPremium = 0.1; 
	private static double productDiscountGold = 0.1; 
	private static double productDiscountSilver = 0.1;  
	
	/** If member type input is invalid, it will return 0% discount.  */
	public static double getServiceDiscountRate(String rMemberType) {
		if (rMemberType.equalsIgnoreCase("premium")) {
			return serviceDiscountPremium; 
		}
		else if (rMemberType.equalsIgnoreCase("gold")) {
			return serviceDiscountGold; 
		}
		else if (rMemberType.equalsIgnoreCase("silver")) {
			return serviceDiscountSilver; 
		}
		else {
			return 0;
		}
	}
	
	public static double getProductDiscountRate(String rMemberType) {
		if (rMemberType.equalsIgnoreCase("premium")) {
			return productDiscountPremium; 
		}
		else if (rMemberType.equalsIgnoreCase("gold")) {
			return productDiscountGold; 
		}
		else if (rMemberType.equalsIgnoreCase("silver")) {
			return productDiscountSilver; 
		}
		else {
			return 0;
		}
	}
	
}
