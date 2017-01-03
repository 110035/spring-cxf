package com.smartmi.ws;

import com.smartmi.model.Player;

import java.util.List;

import javax.jws.WebService;

/**
 * 
 * @author danielme.com
 *
 */
@WebService
public interface ITeamService 
{	
	List<Player> getTeam();
	
	List<Player> getPlayers(int... numbers);
	
	boolean updatePlayerByNumber(int number, Player player);
	
	boolean deletePlayer(int number);
	
	void foo();

	String sayHello(String username);
}
