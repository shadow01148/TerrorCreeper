package org.allahuakbar;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TerrorCreeper extends JavaPlugin implements Listener {

    @EventHandler
    public void CreatureSpawn(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.CREEPER) {
            Creeper creeper = (Creeper) event.getEntity();
            creeper.setPowered(false);
            creeper.setMaxFuseTicks(25);
            creeper.customName(Component.text("Terrorist"));
        }
    }
}