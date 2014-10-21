import java.util.Random;
public class Mage extends basechar 
{
    Random randomNumber = new Random();
    public Mage() 
    {     
	setStrength(40 + randomNumber.nextInt(20));
	setHealth(90 + randomNumber.nextInt(20));
	setSpeed(40 + randomNumber.nextInt(20));
	setMana(90 + randomNumber.nextInt(20));

    }
    public void fireSpell(basechar other) 
    {
	this.setAttackStrength(this.getMana()/10 + randomNumber.nextInt(20)); 
	System.out.println(this.getName()+" shoots FIRE at "+other.getName());
	other.setDefending(true)
    }
    public void heal (basechar other)
    {
	other.assignDamage(this)
	this.increaseHealth(this.getMana()/9 + randomNumber.nextInt(20))
}
			   
