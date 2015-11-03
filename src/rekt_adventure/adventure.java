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

	System.out.println("Welcome to Rekt Adventure, created by Brendan Sileo and Nick Orr");
	System.out.print("You begin your journey as you approach a dreary cave. Bats fly out ");
	System.out.print("right as you approach the mouth of the cave. Do you enter? (y/n)");
	//TODO Allow user to not enter
	
	
		
		
		
	}

}
