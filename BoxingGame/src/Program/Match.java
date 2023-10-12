package Program;

public class Match {
	
	Fighter fighter1;
	Fighter fighter2;
	int minWeight;
	int maxWeight;
	
	
	public Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
		this.fighter1 = fighter1;
		this.fighter2 = fighter2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
	
	public void run() {
		if(isCheckWeight()) {
			while(this.fighter1.health > 0 && this.fighter2.health > 0) {
				System.out.println("---------NEW ROUND---------");
				if(fighter1.isFirstDamage()) {
					this.fighter2.health = this.fighter1.hit(fighter2);
					if(isWin())
						break;
				}
				if(fighter2.isFirstDamage()) {
					this.fighter1.health = this.fighter2.hit(fighter1);
					if(isWin())
						break;
				}
				printScore();
			}
		}else {
			System.out.println("These Fighters have not macthed their weight!");
		}
	}
	
	public boolean isCheckWeight() {
		return (this.fighter1.weight >= this.minWeight && this.fighter1.weight <= this.maxWeight && this.fighter2.weight >= this.minWeight && this.fighter2.weight <= this.maxWeight);
	}
	
	public void printScore() {
		System.out.println("-----------");
		System.out.println(this.fighter1.name + "'s Health: " + this.fighter1.health);
		System.out.println(this.fighter2.name + "'s Health: " + this.fighter2.health);
	}
	
	public boolean isWin() {
		if(this.fighter1.health == 0) {
			System.out.println("Winner: " + this.fighter2.name);
			return true;
		}else if(this.fighter2.health == 0){
			System.out.println("Winner: " + this.fighter1.name);
			return true;
		}
		return false;
	}

}
