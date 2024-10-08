package winlyps.craftBoost

import org.bukkit.plugin.java.JavaPlugin

class CraftBoost : JavaPlugin() {

    override fun onEnable() {
        // Register the CraftListener
        server.pluginManager.registerEvents(CraftListener(this), this)
        logger.info("CraftBoost plugin has been enabled!")
    }

    override fun onDisable() {
        logger.info("CraftBoost plugin has been disabled!")
    }
}