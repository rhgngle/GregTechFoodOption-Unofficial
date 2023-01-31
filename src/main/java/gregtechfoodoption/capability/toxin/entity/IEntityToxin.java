package gregtechfoodoption.capability.toxin.entity;

import gregtechfoodoption.GTFOValues;
import gregtechfoodoption.capability.ICapability;
import gregtechfoodoption.capability.toxin.IToxin;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

public interface IEntityToxin extends IToxin, ICapability<IEntityToxin> {

    @CapabilityInject(IEntityToxin.class)
    public static Capability<IEntityToxin> CAPABILITY_ENTITY_TOXINCONCENTRATION = null;

    public static final ResourceLocation CAPABILITY_ENTITY_TOXINCONCENTRATION_NAME = new ResourceLocation(GTFOValues.MODID, "capability_entity_toxin_concentration");

    public double getTotalToxinConcentration();

    public void setTotalToxinConcentration(double newTotalToxinConcentration);

    public default boolean isTotalToxinConcentration() {
        return getTotalToxinConcentration() <= 750D;
    }

    public double getMaxToxinConcentration();

    public default double getToxinConcentrationPercentage() {
        return Math.min(100D, 100D * getTotalToxinConcentration() / getMaxToxinConcentration());
    }

    public default boolean isFatal() {
        return getTotalToxinConcentration() >= 900D;
    }

    //public boolean getConsumedMedicine();
    //public void setConsumedMedicine(boolean consumed);

}
