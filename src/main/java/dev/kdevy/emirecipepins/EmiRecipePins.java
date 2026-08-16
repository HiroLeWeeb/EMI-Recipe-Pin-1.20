package dev.kdevy.emirecipepins;

import net.minecraftforge.fml.common.Mod;

@Mod(value = EmiRecipePins.MOD_ID)
public final class EmiRecipePins {
    public static final String MOD_ID = "emi_recipe_pins";

    public EmiRecipePins() {
        RecipePinsConfig.load();
    }
}
