import java.util.Random;
public class rogue extends basechar
{
	Random randomNumber = new Random();
    public rogue()
    {
	setStrength(65 + randomNumber.nextInt(20));
	setHealth(65 + randomNumber.nextInt(20));
	setSpeed(140 + randomNumber.nextInt(20));
    }
    public void slash(basechar other)
    {

	this.setAttackStrength(this.getSpeed()/10 + randomNumber.nextInt(20)); 
	System.out.println(this.getName() + " SLASHES " +other);
	other.setDefending(true);
    }
    public void dodge(basechar other)
    {
	boolean success = new Random().nextInt(20) <= this.getSpeed();
	if (success)
	    {
		other.setAttackStrength(0);
	    }

    }
    






}
