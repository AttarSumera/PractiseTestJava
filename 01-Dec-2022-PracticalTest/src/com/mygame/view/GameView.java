package com.mygame.view;

public class GameView {
	
	public void displayCityNameBlanks(){
		
		for(int i=0;i<CityName.length;i++) {
			
			int length =cityName[i].length();
			char cityNameCharArr[]=new char[length];
			generateRandomNumber(length);
			for(int j=0;j<length;j++) {
				cityNameCharArr[j]=cityName[i].charAt(j);
				for(int k=0;k<randomNumberArr.length;k++) {	
					if(j==randomNumberArr[k])
					cityNameCharArr[j]='-';		
				}
			
			}
			String newCityName=new String(cityNameCharArr);
			cityNameWithBlanks[i]=newCityName;
			System.out.println(cityNameWithBlanks[i]);
		}
	}
		
		
	}

}
