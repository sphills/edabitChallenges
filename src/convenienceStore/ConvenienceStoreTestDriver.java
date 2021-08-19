package convenienceStore;

public class ConvenienceStoreTestDriver {

	public static void main(String[] args) {
		ConvenienceStore testStore = new ConvenienceStore();
		
		System.out.println(testStore.changeEnough(new int[]{7, 2, 0, 3}, 1.99f));
	}
}
