package dev.kdevy.emirecipepins.mixin;

import com.google.gson.JsonArray;
import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.runtime.EmiFavorites;
import dev.kdevy.emirecipepins.pin.FavoriteOrganizer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = EmiFavorites.class, remap = false)
public abstract class EmiFavoritesMixin {
    @Inject(method = "load", at = @At("TAIL"), remap = false)
    private static void emiRecipePins$normalizeLoadedFavorites(JsonArray arr, CallbackInfo ci) {
        FavoriteOrganizer.normalizeLoadedFavorites();
    }

    @Inject(method = "addFavorite(Ldev/emi/emi/api/stack/EmiIngredient;Ldev/emi/emi/api/recipe/EmiRecipe;)V", at = @At("TAIL"), remap = false)
    private static void emiRecipePins$normalizeAddedFavorite(EmiIngredient stack, EmiRecipe context, CallbackInfo ci) {
        FavoriteOrganizer.normalize();
    }

    @Inject(method = "addFavoriteAt", at = @At("TAIL"), remap = false)
    private static void emiRecipePins$normalizeDraggedFavorite(EmiIngredient stack, int offset, CallbackInfo ci) {
        FavoriteOrganizer.normalize();
    }
}
