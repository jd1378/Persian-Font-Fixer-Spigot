package com.gmail.javad.mnjd;

import org.bukkit.plugin.java.JavaPlugin;

public class PersianFontFixerSpigot extends JavaPlugin{
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PlayerChatListener() ,this);
		getLogger().info(this.getName() + " Enabled Successfully !");
	}

	@Override
	public void onDisable() {
		getLogger().info(this.getName() + " Disabled Successfully !");
	}
	
}
