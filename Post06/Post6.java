class Post6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//player random cp
		int player1 = (int)(((Math.random()*10)+15)*100);
		int player2 = (int)(((Math.random()*10)+15)*100);
		int player3 = (int)(((Math.random()*10)+15)*100);
		System.out.println("Hero 1 CP : "+player1);
		System.out.println("Hero 2 CP : "+player2);
		System.out.println("Hero 3 CP : "+player3);
		//bot random cp
		int bot1 = (int)(((Math.random()*10)+15)*100);
		int bot2 = (int)(((Math.random()*10)+15)*100);
		int bot3 = (int)(((Math.random()*10)+15)*100);

		//For Check PowerUp
		int checkPow;

		//Round1
		System.out.println("----Round1----");
		System.out.println("Power Up? (1/0)");

		//Check PowerUp Round1
		int pow1 = sc.nextInt();
		if (pow1==1){
			checkPow=1;
			player1+=250;
		}
		else
			checkPow=0;
		//Player1 VS Bot1
		if(player1>bot1)
			System.out.println("You Win! \nYour Hero1 : "+player1+" and Bot : " + bot1);
		else
			System.out.println("You Lose! \nYour Hero1 : "+player1+" and Bot : " + bot1);


		//Round2
		System.out.println("----Round2----");
		System.out.println("Power Up? (1/0)");
		int pow2 = sc.nextInt();
		//Check PowerUp Round2
		if (pow2==1){
			if(checkPow==0){
				checkPow=1;
				player2+=250;
			}
			else
				System.out.println("You can't Power Up.");
		}
		else if(pow2==0){
			if(checkPow==1){
				checkPow=1;
			}
			else
				checkPow=0;
		}
		//Player2 VS Bot2
		if(player2>bot2)
			System.out.println("You Win! \nYour Hero2 : "+player2+" and Bot : " + bot2);
		else
			System.out.println("You Lose! \nYour Hero2 : "+player2+" and Bot : " + bot2);


		//Round3
		System.out.println("----Round3----");
		System.out.println("Power Up? (1/0)");
		//Check PowerUp Round3
		int pow3 = sc.nextInt();
		if (pow3==1){
			if(checkPow==0){
				checkPow=1;
				player3+=250;
			}
			else
				System.out.println("You can't Power Up.");
		}
		else if(pow3==0){
			if(checkPow==1){
				checkPow=1;
			}
			else
				checkPow=0;
		}
		//Player3 VS Bot3
		if(player3>bot3)
			System.out.println("You Win! \nYour Hero3 : "+player3+" and Bot : " + bot3);
		else
			System.out.println("You Lose! \nYour Hero3 : "+player3+" and Bot : " + bot3);


	}
}
