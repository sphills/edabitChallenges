package hallMonitor;

public class HallMonitorDriver {

	public static void main(String[] args) {
		HallMonitor testMonitor = new HallMonitor();
		
		System.out.println(testMonitor.possiblePath(new Object[] {1, 2, "H"}));
	}
}
