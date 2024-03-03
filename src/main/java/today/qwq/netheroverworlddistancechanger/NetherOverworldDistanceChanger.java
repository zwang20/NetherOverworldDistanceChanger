package today.qwq.netheroverworlddistancechanger;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetherOverworldDistanceChanger implements ModInitializer {
    public static Logger logger = LoggerFactory.getLogger("NetherOverworldDistanceChanger");

    public static final today.qwq.netheroverworlddistancechanger.NODCConfig CONFIG = today.qwq.netheroverworlddistancechanger.NODCConfig.createAndLoad();

    @Override
    public void onInitialize() {
        logger.info("Initializing the mod....");

        logger.info("{}", CONFIG.distance());
    }
}
