package nekonungstvo;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Nicknames.MODID, version = Nicknames.VERSION)
public class Nicknames {
    public static final String MODID = "nicknames";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void onModInit(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new nekonungstvo.EventHandler());
    }


}
