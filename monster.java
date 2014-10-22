import java.util.*;
import java.io.*;

public class monster extends basechar { 
    Random r = new Random(); 

    public void monster() { 
	setHealth(160) + r.nextInt(20);
	setStrength(90) + r.nextInt(20);
	setSpeed(450) + r.nextInt(20);
	setManna(90) + r.nextInt(20);
        
	setName("Orc");
    }
    public void monster(String n ) {
	setHealth(160) + r.nextInt(20);
	setStrength(90) + r.nextInt(20);
	setSpeed(450) + r.nextInt(20);
	setManna(90) + r.nextInt(20);

	setName(n);
    }
   
	
    public void evilAttack(basechar other) {
	int damage = this.getStrength()*2/10- other.getDefense();
	other.setHealth(other.getHealth() - damage);
	System.out.println(this + "evilAtacked"+other);
	System.out.println(other +"lost"+damage+"damage!!");
	other.setDefending(true);
    } 
    public void darkMagic(basechar other) {
	int damage = this.getManna() - other.getDefense();
	this.setManna(this.getManna() / 2);
	other.setHealth(other.getHealth() - damage);
	System.out.println(this + "used DARKMAGIC on"+other);
	System.out.println(other +"lost"+damage+"damage!!");
	
    }
    public void protect(basechar other) {
	this.setDefense(this.getDefense + 5);
   
	System.out.println(this.getName() + " PROTECTS AGAINST " + other + "'s attack");
	other.lowerAttackStrength(this.getStrength()/9 + r.nextInt(20));
	if (other.getAttackStrength() < 15) {
		System.out.println(this + "'was well protected!");
	    }
	if (other.getAttackStrength() > 25) {
		System.out.println(this + "is still vulnerable....");
	    }
	other.assignDamage(this);
	
    }
	
	
}
