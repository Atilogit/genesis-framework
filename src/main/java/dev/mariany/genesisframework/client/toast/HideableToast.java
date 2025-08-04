package dev.mariany.genesisframework.client.toast;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.toast.Toast;

@Environment(EnvType.CLIENT)
public interface HideableToast extends Toast {
    void hide();
}
