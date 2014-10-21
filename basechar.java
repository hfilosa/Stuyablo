public abstract class basechar {
    private int health;
    private int strength;
    private int defense;
    private int speed;
    private int manna;      
    private boolean defending
    private String name;

    public String toString(){
	return name;
    }
    public void setDefending (boolean b){
	defending = b;
    }
    public void setSpeed (int s){
	speed = s;
    }
	
    public void setHealth(int h){
	health=h;
    }
    public int getHealth(){
	return health;
    }
    public void setStrength(int s){
	strength=s;
    }
    public int getStrength(){
	return strength;
    }
    public void setManna(int s){
	manna=s;
    }
    public int getManna(){
	return manna;
    }
    public void setName(String n){
	name = n;
    }
    public String getName(){
	return name;
    }
    
    public abstract void attack(basechar other);

    public void pause(int t){
	try {
	    Thread.sleep(t);
	} catch (Exception e) {}
    }
}
