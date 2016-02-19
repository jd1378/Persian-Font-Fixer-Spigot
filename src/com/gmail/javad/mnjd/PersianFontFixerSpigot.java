package com.gmail.javad.mnjd;

import org.bukkit.plugin.java.JavaPlugin;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.ListenerPriority;

public final class PersianFontFixerSpigot extends JavaPlugin{
	private static ProtocolManager protocolManager;
	
	
	public static ProtocolManager getProtocolManager() {
		return protocolManager;
	}
	
	@Override
	public void onEnable() {
		protocolManager = ProtocolLibrary.getProtocolManager();
		protocolManager.getAsynchronousManager().registerAsyncHandler(new PlayerChatListener(this, ListenerPriority.LOW)).syncStart();
		//getServer().getPluginManager().registerEvents(new PlayerChatListener() ,this);
		getLogger().info(this.getName() + " Enabled Successfully !");
	}

	@Override
	public void onDisable() {
		getLogger().info(this.getName() + " Disabled Successfully !");
	}
	
}
