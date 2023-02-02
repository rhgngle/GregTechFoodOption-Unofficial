package gregtechfoodoption.machines;

import gregtech.api.GTValues;
import gregtech.api.capability.IEnergyContainer;
import gregtech.api.capability.impl.RecipeLogicEnergy;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.stack.MaterialStack;
import gregtech.client.renderer.ICubeRenderer;
import gregtechfoodoption.client.GTFOClientHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;

import java.util.function.Supplier;

public class MetaTileEntityIncubator extends SimpleMachineMetaTileEntity {
    public MetaTileEntityIncubator(ResourceLocation metaTileEntityId, RecipeMap<?> recipeMap, ICubeRenderer renderer, int tier) {
        super(metaTileEntityId, recipeMap, renderer, tier, true);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityIncubator(this.metaTileEntityId, this.workable.getRecipeMap(), this.renderer, this.getTier());
    }

    @Override
    public void update() {
        if (this.energyContainer.getEnergyStored() > GTValues.V[this.getTier()]) {

        }
        super.update();
    }

    public class RecipeLogicIncubator extends RecipeLogicEnergy {
        public RecipeLogicIncubator(MetaTileEntity tileEntity, RecipeMap<?> recipeMap, Supplier<IEnergyContainer> energyContainer) {
            super(tileEntity, recipeMap, energyContainer);
        }


        @Override
        protected void trySearchNewRecipe() {
            super.trySearchNewRecipe();
            if (wasActiveAndNeedsUpdate) {
                getWorld().playSound(null, getPos().getX() + 0.5, getPos().getY() + 0.5, getPos().getZ() + 0.5,
                        GTFOClientHandler.MICROWAVE_FINISH, SoundCategory.BLOCKS, 1.0f, 1.0f);
            }
        }

    }
}