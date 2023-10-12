package Program;

public class Main {

	public static void main(String[] args) {
		Fighter muhammedAli = new Fighter("Muhammed Ali", 30, 100, 100, 20, 50);
		Fighter mikeTyson = new Fighter("Mike Tyson", 25, 95, 100, 40, 50);
		
		Match match = new Match(muhammedAli, mikeTyson, 90, 100);
		match.run();
		
		

	}

}
