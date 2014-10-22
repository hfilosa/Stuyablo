import java.util.*;
public class Driver {
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	String character;
	String newname;
	
	System.out.println();
	System.out.println("Welcome to Stuyablo!");
	System.out.println();
	System.out.println("What class do you want to be?");
	System.out.println("-> Warrior");
	System.out.println("-> Mage");
	System.out.println("-> Rogue");
	character = scanner.nextLine();
	System.out.println();
	System.out.println("Please choose a name for yourself:");
        newname = scanner.nextLine();
	System.out.println();
	System.out.println("You are a "+character.toLowerCase()+" named "+newname.toUpperCase()+".");
	if (character.equals("warrior")) {
	    warrior p1 = new warrior(newname);
	} else if (character.equals("mage")) {
	    mage p1 = new mage(newname);
	} else if (character.equals("rogue")) {
	    rogue p1 = new rogue(newname);
	}


	    

    }
}
