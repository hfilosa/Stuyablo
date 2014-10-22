public class warrior extends basechar
{
    public void warrior()
    {
	setStrength(90 + Random.nextInt(20));
	setHealth(140 + Random.nextInt(20));
	setSpeed(40 + Random.nextInt(20));
    }
    public int Bash()
    {
	int attackStrength = this.getStrength()/10 + Random.nextInt(20); 
	System.out.println(this.name + " BASHES " +other);
	other.setHealth(attackStrength);
	if (attackStrength > 25)
	    {
		System.out.println("It's a CRITICAL ATTACK");
	    }
	if (attackStrength < 15)
	    {
		System.out.println("The attack didn't work very well...");
	    }
	    
    } 
}
