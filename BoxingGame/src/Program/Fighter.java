package Program;

public class Fighter {
	
	String name;
	int damage;
	int health;
	int weight;
	double dodge;
	double firstDamage;
	
	public Fighter(String name, int damage, int health, int weight, double dodge, double firstDamage) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		this.dodge = dodge;
		this.firstDamage = firstDamage;
	}
	
	public int hit(Fighter rival) {
		System.out.println(this.name + " => " + rival.name + " " + this.damage + " damaged!");
		if(rival.isDodge()) {
			System.out.println(rival.name + " blocked!");
			return rival.health;
		}
		if(rival.health - this.damage < 0) {
			return 0;
		}
		return rival.health - this.damage;
	}
	
	public boolean isDodge() {
		double randomValue = Math.random() * 100;
		return randomValue <= this.dodge;
	}
	
	public boolean isFirstDamage() {
		double randomValue = Math.random() * 100;
		return randomValue <= this.firstDamage;
	}
	
}
