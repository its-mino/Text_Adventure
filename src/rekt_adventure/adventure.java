package rekt_adventure;

class skeleton
{
	static String name = "skeleton";
	static int health = 2;
	static int attack = 2;
}

class zombie
{
	static String name = "zombie";
	static int health = 3;
	static int attack = 1;
}

class imp
{
	static String name = "imp";
	static int health = 1;
	static int attack = 4;
}

class boss
{
	static String name = "dragon";
	static int health = 5;
	static int attack = 5;
}


public class adventure {


	public static String chooseMonster()
	{
		int monster = (int)((Math.random()) * (3));
		
		if(monster == 1)
		{
			return "skeleton";
		}
		
		else if(monster == 2)
		{
			return "zombie";
		}
		
		else 
		{
			return "imp";
		}
		
	}
	
	public static boolean combat()
	{
		String monster = chooseMonster();
		
		String name;
		int health;
	    int attack;
		
		if(monster.equals("skeleton"))
		{
			name = skeleton.name;
			health = skeleton.health;
			attack = skeleton.attack;
		}
		
		if(monster.equals("zombie"))
		{
			name = zombie.name;
			health = zombie.health;
			attack = zombie.attack;
		}
		
		if(monster.equals("imp"))
		{
			name = imp.name;
			health = imp.health;
			attack = imp.attack;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println("Welcome to Rekt Adventure, created by Brendan Sileo and Nick Orr.");
	System.out.println("");
	System.out.println("Welcome to Rekt Adventure, created by Brendan Sileo and Nick Orr");
 	System.out.print("You begin your journey as you approach a dreary cave. Bats fly out ");
	System.out.println("as you stand at the mouth of the cave, giving an ominous effect. ");
	System.out.println("Do you enter? (y/n)");
	System.out.println();
	System.out.print("right as you approach the mouth of the cave. Do you enter? (y/n)");
 	//TODO Allow user to not enter
 	
	System.out.println("As you enter the cave, you take inventory of what you have...");
	System.out.println();
	System.out.println("A sword, a gun, four bullets and a rope. (view this again by typing 'inventory')");
	//TODO Add inventory system
	System.out.println();
	System.out.print("You enter a split in the cave. You hear screams from the left and see a distant light to the right.");
	System.out.print("Which way do you want to go?  (L/R)");
	//TODO Add left or right choice
	
	System.out.println("As you walk to the left, the screams become much louder.");
	System.out.println();
	
	System.out.print("You enter a room, and see a human figured strung up. Blood is pouring from ");
	System.out.print("their body, and is creating a pool of blood on the ground. ");
	System.out.println();
	
	System.out.print("You see something move in your peripheral vision. An imp jumps in front of you ");
	System.out.println("His appearance is mennacing, but he looks weak.");
	System.out.print("Do you attack or run? (a/r)");
	//TODO If user chooses run, kill screen
	
	System.out.println("You begin to run. The screams are petrifying as you further yourself from them. You think you have gotten away");
	System.out.println(" but you hear a slicing sound and look down to see a sword in your abdomen.");
	System.out.println();
	System.out.print("~~~~GAME OVER~~~~");

	
	//System.out.print("as you walk to the right, the light becomes dimmer.");
	
	
		
		
		
	}

}
