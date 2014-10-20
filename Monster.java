public class monster extends basechar { 
    public void monster() { 
	setHealth(60);
	setStrength(60);
	setSpeed(60);
	setManna(60);
	int exp = 100;
	int weapon = 60;
	setName("Orc");
    }
    // private String item;
    //item = "potion,elixir,ether,1-up";
    //    String delims = ",";
    //    String[] tokens = item.split(delims);
   
	
    public void evilAttack(basechar other) {
	int damage = this.getStrength()+weapon - other.getDefense();
	other.setHealth(other.getHealth() - damage);
	System.out.println(this + "evilAtacked"+other);
	System.out.println(other +"lost"+damage+"damage!!");
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
    }
    public void deathSequence(basechar other) {
        public int reward = exp
	exp =0;
	//drop items
	//String drop = tokens[0];
    }
	
	
}
