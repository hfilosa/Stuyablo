public class Mage extends basechar {
    public void Mage() {
	setStrength(50);
	setHealth(100);
	setSpeed(75);
	setManna(20);
    }
    public void mageAttack(basechar other) {
	other.setHealth(health-manna);
	System.out.println(this.getName()+" attacks "+this.getName()+" for "+manna+" damage!");
    }
}
			   
