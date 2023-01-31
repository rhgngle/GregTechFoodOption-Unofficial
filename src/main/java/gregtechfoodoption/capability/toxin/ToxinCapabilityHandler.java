package gregtechfoodoption.capability.toxin;

import gregtechfoodoption.capability.toxin.entity.*;
import net.minecraft.client.util.RecipeItemHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ToxinCapabilityHandler {
    @SubscribeEvent
    public void attachEntityToxinCapability(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof EntityPlayer) {
            event.addCapability(IEntityToxin.CAPABILITY_ENTITY_TOXINCONCENTRATION_NAME, new EntityToxinProvider());
        }
    }
}
