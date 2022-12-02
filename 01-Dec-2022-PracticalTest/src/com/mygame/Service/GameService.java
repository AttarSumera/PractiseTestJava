package com.mygame.Service;
import com.mygame.dao.*;
public class GameService {
	GameDAO gamedao;
     
	public String getCityNameService() {
		return CityName;
		
	}
	public CityName[] getCityName() {
		CityName gamedao[]=GameDao.getCityName();
		return CityName;
	}
}
