package keqing.gtqtcore.common;

import gregtech.api.unification.material.event.MaterialEvent;
import keqing.gtqtcore.api.unification.GCYSMaterials;
import keqing.gtqtcore.api.unification.GTQTMaterials;
import keqing.gtqtcore.api.unification.OrePrefixAdditions;
import keqing.gtqtcore.api.unification.TJMaterials;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import java.util.Objects;

import static keqing.gtqtcore.GTQTCore.PACK;
import static keqing.gtqtcore.GTQTCore.VERSION;
import static net.minecraft.util.text.TextFormatting.*;


@Mod.EventBusSubscriber(
        modid = "gtqtcore"
)

public class GTQTEventHandler {

    public GTQTEventHandler() {
    }

    @SubscribeEvent(
            priority = EventPriority.HIGH
    )
    public static void registerMaterials(MaterialEvent event) {
        TJMaterials.register();
        GCYSMaterials.init();
        GTQTMaterials.register();
        OrePrefixAdditions.init();
    }

    public static class PlayerLoginEventHandler {

        private static final String[] lines = {
                GOLD + "============================================",
                BOLD + "欢迎来到格雷:量子跃迁 " + GREEN + PACK + LIGHT_PURPLE + "-" + VERSION,
                GRAY + "当前游戏为" + RED + "非官方版本",
                GRAY + "请勿向官方渠道反馈遇到的问题！",
                GRAY + "问题反馈渠道：" + GREEN + "https://github.com/huzpsb/GTQTcore/issues",
                GOLD + "============================================"
        };

        @SubscribeEvent(priority = EventPriority.HIGHEST)
        public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
            Objects.requireNonNull(event.player);
            for (String line : lines) {
                event.player.sendMessage(new TextComponentString(line));
            }
        }
    }

}
