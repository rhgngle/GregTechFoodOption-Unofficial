package gregtechfoodoption.capability.toxin.entity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.MathHelper;

public class PlayerToxin implements IEntityToxin{
    protected double maxToxinConcentration = 0D;
    protected double totalToxinConcentration = 0D;
    protected double toxinConcentration = 0D;

    public PlayerToxin() {
        maxToxinConcentration = 1000D;
    }

    @Override
    public NBTTagCompound writeNBT(IEntityToxin instance, EnumFacing side, NBTTagCompound nbt) {
        nbt.setDouble("totalToxinConcentration", totalToxinConcentration);
        return nbt;
    }

    @Override
    public void readNBT(IEntityToxin instance, EnumFacing side, NBTTagCompound nbt) {
        totalToxinConcentration = nbt.getDouble("totalToxinConcentration");
        toxinConcentration = nbt.getDouble("toxinLevel");
    }

    @Override
    public double getTotalToxinConcentration() {
        return totalToxinConcentration;
    }

    @Override
    public void setTotalToxinConcentration(double newTotalToxinConcentration) {
            totalToxinConcentration = MathHelper.clamp(newTotalToxinConcentration, 0D, maxToxinConcentration);
    }

    @Override
    public double getMaxToxinConcentration() {
        return maxToxinConcentration;
    }

    @Override
    public double getToxinConcentration() {
        return toxinConcentration;
    }

    @Override
    public void setToxinConcentration(double newToxinConcentration) {
        toxinConcentration = Math.max(newToxinConcentration, 0D);
    }

}
