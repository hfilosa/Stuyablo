import java.util.Random;
public class warrior extends basechar
{
    Random randomNumber = new Random();
    public warrior()
    {
	setStrength(90 + randomNumber.nextInt(20));
	setHealth(140 + randomNumber.nextInt(20));
	setSpeed(40 + randomNumber.nextInt(20));
    }
    public void Bash(basechar other)
    {
	this.setAttackStrength(this.getStrength()/10 + randomNumber.nextInt(20)); 
	System.out.println(this.getName() + " BASHES " +other);
	other.setDefending(true);
    }
    /* 
     Bash sets the attack strength, which is one tenth of the strength + a random integer from 0 to 20.
     After it sets the attack strength, it sets the opponent's defending variable to true. This will trigger the opponent to defend.
     When the opponent attacks, a similar thing happens. The defending variable is set to true, thus triggering the option of using your shield. 
     Maybe we should add more defense methods? The defense method then reduces the attack strength by a certain amount. I put it as strength/9 + random int from 0 to 20.
     Finally, the damage is given 
    */
    public void Shield(basechar other)
    {
	other.lowerAttackStrength(this.getStrength()/9 + randomNumber.nextInt(20));
	this.setDefending(false);
	other.assignDamage(this);
    }
}
