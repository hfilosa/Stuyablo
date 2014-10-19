public class monster extends basechar { 
    public void monster() { 
	setHealth(60);
	setStrength(60);
	setSpeed(60);
	int exp = 100;
	int weapon = 60
    }
    private String item;
    item = "potion,elixir,ether,1-up";
    String delims = ",";
    String[] tokens = item.split(delims);
   
	
    public void evilAttack(basechar other) {
	int damage = this.getHealth()+weapon - other.getDefense();
	other.setHealth(other.getHealth() - damage);
	System.out.println(this + "evilAtacked"+other);
	System.out.println(other +"lost"+damage+"damage!!");
    } 
    public void deathSequence(basechar other) {
        int reward = exp
	exp =0;
	//drop items
	String drop = tokens[0];
    }
	
	
}
