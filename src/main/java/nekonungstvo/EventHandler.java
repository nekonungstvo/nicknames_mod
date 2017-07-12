package nekonungstvo;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderLivingEvent;

public class EventHandler {
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void nickname_draw(RenderLivingEvent.Specials.Pre event) {
        if (event.entity instanceof EntityPlayer) {
            EntityPlayer current_player = Minecraft.getMinecraft().thePlayer;
            EntityPlayer player = (EntityPlayer) event.entity;
            boolean hide_name = !player.canEntityBeSeen(current_player);
            if (event.isCancelable() && hide_name) {
                event.setCanceled(true);
            }
        }
    }
}
