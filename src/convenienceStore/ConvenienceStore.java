package convenienceStore;

public class ConvenienceStore {

	public boolean changeEnough(int[] pocketChange, float inputCost) {
		int convertedCost = (int)(inputCost * 100);
		int pocketChangeTotal = 0;
		
		 for (int i = 0; i < pocketChange.length; i++) {
		 	int coinValue = 0;
		 	
		 	switch (i) {
		 		case 0:
	 				coinValue = 25;
		 			break;
	 			case 1:
	 				coinValue = 10;
	 				break;
 				case 2:
 					coinValue = 5;
 					break;
				case 3:
					coinValue = 1;
					break;
			}
				
			pocketChangeTotal += (pocketChange[i] * coinValue);
		 }
		 
		 if (pocketChangeTotal > convertedCost) {
			customerChangeBack(pocketChangeTotal, convertedCost);
			System.out.println("Here's your item. Thanks for your patronage!");
		 	return true;
		 } else if (pocketChangeTotal == convertedCost) {
			System.out.println("Whaddya know, perfect change. Here's your item!");
			return true;
	 	} else {
	 		moreChangeRequired(pocketChangeTotal, convertedCost);
			return false;
	 	}
	 }
	 
	 private void moreChangeRequired(int inputChangeTotal, int inputCost) {
	 	double changeRemaining = ((inputCost - inputChangeTotal) * .01);
	 	System.out.println("Sorry, you still need $" + changeRemaining + " to purchase this item.");
	 }
	 
	 private void customerChangeBack(int inputChangeTotal, int inputCost) {
	 	double customerChange = ((inputChangeTotal - inputCost) * .01);
	 	System.out.print("You overpaid, so here's $" + customerChange + " in change. ");
	 }
}