/**
 * 
 */
package com.aku.springdemo;
import java.util.Random;
/**
 * @author akash
 *
 */
public class HappyFortuneService implements FortuneService {
	
	
	private String[] fortune = {
			"Beware of Injuries",
			"Extra efforts will lead fruitful results",
			"Will become the hero of the game"
	};
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(fortune.length);
		
		return fortune[index];
	}

}
