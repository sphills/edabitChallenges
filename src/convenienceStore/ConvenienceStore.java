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
		 
		 if (pocketChangeTotal >= convertedCost) {
		 	return true;
		 } else {
		 	return false;
	 	}
	 }
}