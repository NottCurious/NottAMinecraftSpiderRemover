package nottaminecraftspiderremover;

import net.minecraft.entity.EntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("nottaminecraftspiderremover")
public class NottAMinecraftSpiderRemover {
    public NottAMinecraftSpiderRemover() {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void denySpawns(LivingSpawnEvent event) {
        if(event.getEntity().getType().equals(EntityType.SPIDER) || event.getEntity().getType().equals(EntityType.CAVE_SPIDER))
            if(event.isCancelable()) {
                event.setCanceled(true);
                System.out.println("Spider/Cave Spider Spawn Canceled");
            }
            else if(event.hasResult()) {
                event.setResult(Event.Result.DENY);
                System.out.println("Spider/Cave Spider Spawn Denied");
            }
    }
}