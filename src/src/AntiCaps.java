package src;

import org.bukkit.plugin.java.JavaPlugin;

public class AntiCaps extends JavaPlugin
{
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(new AntiCapsEvent(), this);
		System.out.println("AntiCaps enabled.");
	}
		 
	public void onDisable()
	{
		System.out.println("AntiCaps disabled.");
	}
}
