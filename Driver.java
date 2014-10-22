import java.util.*;
public class Driver {
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	String character;
	String newname;
	basechar p1 = null;
	System.out.println();
	System.out.println("Welcome to Stuyablo!");
	System.out.println();
	System.out.println("What class do you want to be?");
	System.out.println("If left blank, you will be defaulted to Warrior.");
	System.out.println("-> Warrior");
	System.out.println("-> Mage");
	System.out.println("-> Rogue");
	character = scanner.nextLine();
	System.out.println();
	System.out.println("What is your name?");
	System.out.println("If left blank, you will be defaulted to Joe.");
        newname = scanner.nextLine();
	if (newname.equals("")) {
	    newname = "JOE";
	}
	if (character.equals("")){
	    character = "warrior";
	}
	System.out.println();
	
	character = character.toLowerCase();
	newname = newname.toUpperCase();

	if (character.equals("warrior")) {
	    p1 = new warrior(newname);
	    
	} else if (character.equals("mage")) {
	    p1 = new mage(newname);
	    
	} else if (character.equals("rogue")) {
	    p1 = new rogue(newname);
	   
	} else {
	    p1 = new warrior(newname);
	}

	String parsing[] = { "...", "...","Your game is being created ... ", "...", "..." };
	try {
	    for (int i=0;i<parsing.length;i++){
	    Thread.sleep(500);
	    System.out.println(parsing[i]);
	    }
	    Thread.sleep(1000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}

	monster enemy = new monster();
	System.out.println();
	System.out.println("You are a "+character.toLowerCase()+" named "+newname.toUpperCase()+".");
	System.out.println(enemy.getName());
	
	    

    }
}
