package today.qwq.netheroverworlddistancechanger.mixins;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.util.Identifier;
import net.minecraft.world.dimension.DimensionType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import today.qwq.netheroverworlddistancechanger.NetherOverworldDistanceChanger;

import java.util.Objects;

@Mixin(DimensionType.class)
public class MixinDimensionType {
    @Shadow @Final private Identifier effects;

    @ModifyReturnValue(method = "coordinateScale", at = @At("TAIL"))
    private double modifyWorldScale(double scale) {
        if (Objects.equals(this.effects.toString(), "minecraft:the_nether")) {
            NetherOverworldDistanceChanger.logger.info("1");
            return NetherOverworldDistanceChanger.CONFIG.distance();
        }
        return scale;
    }
}
