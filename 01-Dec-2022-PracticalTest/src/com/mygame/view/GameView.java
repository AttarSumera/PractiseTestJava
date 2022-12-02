package com.mygame.view;
import com.mygame.Service.*;

public class GameView {
	
	GameService s = new GameService();
	
	
	public String[] displayCityNamesWithBlanks()
	{
		GameView v = new GameView();
		String[] c = s.getCityNamesService();
		
		
		for(int i = 0 ; i < c.length; i++)
		{
			int num = c[i].length();
			int k = 0;
			// int randomArray[]= null;
			char arr[]= c[i].toCharArray();
			
			while(k != 3)
			{
				int val = v.generateRandomnumber(num);
				
				for(int j=0; j < arr.length;j++)
				{
					if( i == val)
					{
						arr[i] = ' ';
					}		
				}
				
				k++;
			}
			c[i] = String.valueOf(arr);
		}
		return c;
	}
	
	
	
	
}