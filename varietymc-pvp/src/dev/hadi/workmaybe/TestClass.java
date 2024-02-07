package dev.hadi.workmaybe;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import dev.hadi.Registerable;

public class TestClass implements Listener, Registerable{
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		
		event.getPlayer().sendMessage("Welcome to the server friend.");
	}

	@Override
	public void execute() {		
	}
}
