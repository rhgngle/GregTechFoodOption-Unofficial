package gregtechfoodoption.capability.toxin.entity;

import javax.annotation.*;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.*;

public class EntityToxinProvider implements ICapabilitySerializable<NBTBase>{
    private final IEntityToxin entityToxin;

    public EntityToxinProvider() {
        entityToxin = new PlayerToxin();
    }
    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == IEntityToxin.CAPABILITY_ENTITY_TOXINCONCENTRATION;
    }

    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        if (capability == IEntityToxin.CAPABILITY_ENTITY_TOXINCONCENTRATION) {
            return IEntityToxin.CAPABILITY_ENTITY_TOXINCONCENTRATION.cast(entityToxin);
        }
        return null;
    }

    @Override
    public NBTBase serializeNBT() {
        return IEntityToxin.CAPABILITY_ENTITY_TOXINCONCENTRATION.writeNBT(entityToxin, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {
        IEntityToxin.CAPABILITY_ENTITY_TOXINCONCENTRATION.readNBT(entityToxin, null, nbt);
    }

}
