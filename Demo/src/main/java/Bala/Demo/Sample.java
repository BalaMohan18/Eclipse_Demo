package Bala.Demo;

import java.util.Arrays;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game football =new Game()
				{
			public void play() {
				System.out.println("football");
			}
				};
				football.play();
				
				Game cricket =new Game()
				{
			public void play() {
				System.out.println("cricket");
			}
				};
				cricket.play();
				
			Game footballLambda = () -> System.out.println("i am a playing foot ball");	
			
			Series odiseries = (type) -> System.out.println("it is a "+type+"series");	
			footballLambda.play();
			odiseries.play("Test");
	}

	interface Game {
		void play();
		
	}
	
	interface Series
	{
	  void play(String type);	
	}
	
	
	
}
