package com.mygame.Service;

import com.mygame.dao.GameDAO;

public class GameService {
	public String[] getCityNamesService()
	{
		GameDAO g = new GameDAO();
		String s[] = g.getCityNames();
		
		return s;
	}

	public String[] GameService() {
		// TODO Auto-generated method stub
		return null;
	}
}