package winlyps.craftBoost

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.CraftItemEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class CraftListener(private val plugin: CraftBoost) : Listener {

    @EventHandler
    fun onCraftItem(event: CraftItemEvent) {
        val player = event.whoClicked
        player.addPotionEffect(PotionEffect(PotionEffectType.REGENERATION, 100, 0))
    }
}