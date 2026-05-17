# EMI Recipe Pins

NeoForge 1.21.1 client addon for EMI that renders recipe favorites as REI-style pinned recipe cards.

## Features

- Recipe favorites are kept above regular favorites.
- EMI's Favorites sidebar renders the first configured recipe favorites as full-width recipe cards.
- Extra recipe favorites stay above regular favorites as compact icons.
- The visible recipe-card limit is configurable from EMI's config screen.
- Recipes can be dragged from EMI's recipe screen into the Favorites panel.
- Pinned recipes can be reordered by dragging them inside the Favorites panel.

## Build

```powershell
.\gradlew.bat --no-daemon build
```

The built jar is written to `build/libs/emi_recipe_pins-1.0.0.jar`.
