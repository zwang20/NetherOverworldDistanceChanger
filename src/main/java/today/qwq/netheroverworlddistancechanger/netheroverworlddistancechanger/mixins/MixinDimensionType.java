package today.qwq.netheroverworlddistancechanger.netheroverworlddistancechanger.mixins;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.world.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import today.qwq.netheroverworlddistancechanger.netheroverworlddistancechanger.NetherOverworldDistanceChanger;

@Mixin(DimensionType.class)
public class MixinDimensionType {
    @ModifyReturnValue(method = "coordinateScale", at = @At("TAIL"))
    private static double modifyWorldScale(double scale) {
        if (scale == 8) {
            return NetherOverworldDistanceChanger.CONFIG.distance();
        }
        return scale;
    }
}
