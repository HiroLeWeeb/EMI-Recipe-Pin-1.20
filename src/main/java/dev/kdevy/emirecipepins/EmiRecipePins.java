package dev.kdevy.emirecipepins;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = EmiRecipePins.MOD_ID, dist = Dist.CLIENT)
public final class EmiRecipePins {
    public static final String MOD_ID = "emi_recipe_pins";

    public EmiRecipePins() {
        RecipePinsConfig.load();
    }
}
