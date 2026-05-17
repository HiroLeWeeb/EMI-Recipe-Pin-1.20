package dev.kdevy.emirecipepins.pin;

import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.runtime.EmiDrawContext;
import dev.emi.emi.runtime.EmiFavorite;
import net.minecraft.client.gui.GuiGraphics;

public class RecipeCardFavorite extends EmiFavorite {
    public RecipeCardFavorite(EmiIngredient stack, EmiRecipe recipe) {
        super(stack, recipe);
    }

    public RecipeCardFavorite(EmiFavorite favorite) {
        super(favorite.getStack(), favorite.getRecipe());
    }

    @Override
    public EmiIngredient copy() {
        return new RecipeCardFavorite(getStack(), getRecipe());
    }

    @Override
    public void render(GuiGraphics raw, int x, int y, float delta, int flags) {
        if (getRecipe() != null) {
            PinnedRecipeRenderer.renderDraggedRecipe(EmiDrawContext.wrap(raw), this, x + 8, y + 8, delta);
        } else {
            super.render(raw, x, y, delta, flags);
        }
    }
}
