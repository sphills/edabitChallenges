package convenienceStore;

public class ConvenienceStoreTestDriver {

	public static void main(String[] args) {
		ConvenienceStore testStore = new ConvenienceStore();
		
		testStore.changeEnough(new int[]{7, 2, 0, 4}, 1.99f);
		testStore.changeEnough(new int[]{20, 200, 21, 47}, 35.99f);
		testStore.changeEnough(new int[]{25, 200, 21, 47}, 25.99f);
	}
}
