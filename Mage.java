public class Mage extends basechar {
    public Mage(String n) {
	setName(n);
	setStrength(50);
	setHealth(100);
	setSpeed(75);
	setManna(20);
    }
    public void attack(basechar other) {
	other.setHealth(other.getHealth-manna);
	System.out.println(this.getName()+" casts CRASH on "+other.getName()+" for "+manna+" damage!");
    }
}
			   
