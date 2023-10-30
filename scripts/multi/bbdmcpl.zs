// No special #loader, just use the default crafttweaker one.

import mods.gregtech.multiblock.Builder;
import mods.gregtech.multiblock.FactoryBlockPattern;
import mods.gregtech.multiblock.RelativeDirection;
import mods.gregtech.multiblock.IBlockMatcher;
import mods.gregtech.multiblock.MultiblockAbility;
import mods.gregtech.multiblock.FactoryMultiblockShapeInfo;
import mods.gregtech.multiblock.IBlockInfo;

import mods.gregtech.MetaTileEntities;
import mods.gregtech.recipe.FactoryRecipeMap;
import mods.gregtech.recipe.RecipeMap;
import mods.gregtech.render.GuiTextures;
import mods.gregtech.render.MoveType;

import crafttweaker.world.IFacing;
import crafttweaker.text.ITextComponent;

var loc = "breaking_bad_dual_meth_cocaine_production_line";
var meta = 2000; // Choose something that won't conflict. You'll get a warning in the crafttweaker logs if something goes wrong.

var multiblock = Builder.start(loc, meta)
    .withPattern(
        FactoryBlockPattern.start(RelativeDirection.FRONT, RelativeDirection.UP, RelativeDirection.LEFT)
            .aisle(
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "AAAAAA",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "AAAAAA",
                "      "
            .aisle(
                " BBBB ",
                " BBBB ",
                " BBBB ",
                "      ",
                "A    A",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "A    A",
                "      "
            .aisle(
                " B  B ",
                " B    ",
                " B    ",
                " BBBB ",
                "A    A",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "A    A",
                "      "
            .aisle(
                " B  B ",
                " B    ",
                " B    ",
                " BBBB ",
                "A    A",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "A    A",
                "      "
            .aisle(
                " B  B ",
                " B    ",
                " B    ",
                " BBBB ",
                "A    A",
                "A     ",
                "A     ",
                "A     ",
                "A     ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "A    A",
                "      "
            .aisle(
                " BBBB ",
                " BBBB ",
                " BBBB ",
                "  B   ",
                "A B  A",
                "     A",
                "     A",
                "     A",
                "A    A",
                "AAAAAA",
                "     A",
                "      ",
                "      ",
                "      ",
                "     A",
                "A    A",
                "      "
            .aisle(
                "      ",
                "      ",
                "      ",
                "      ",
                "ABBB A",
                " BBB  ",
                " BBB  ",
                " BBB  ",
                " BBB  ",
                "ABBB  ",
                " BBB  ",
                " BBB A",
                " BBB  ",
                " BBB A",
                " BBB  ",
                "ABBB A",
                " BBB  "
            .aisle(
                "@     ",
                "A     ",
                "A     ",
                "A     ",
                "ABBB A",
                "ABBB  ",
                "ABBB  ",
                " BBB  ",
                " BBB  ",
                "ABBB  ",
                "ABBB  ",
                "ABBB  ",
                "ABBBAA",
                "ABBB  ",
                "ABBB  ",
                "ABBB A",
                " BBB  "
            .aisle(
                "      ",
                "      ",
                "      ",
                "      ",
                "ABBB A",
                " BBB  ",
                " BBB  ",
                " BBB  ",
                " BBB  ",
                "ABBB  ",
                " BBB  ",
                " BBB A",
                " BBB  ",
                " BBB A",
                " BBB  ",
                "ABBB A",
                " BBB  "
            .aisle(
                " BBBB ",
                " BBBB ",
                " BBBB ",
                "  B   ",
                "A B  A",
                "     A",
                "     A",
                "     A",
                "A    A",
                "AAAAAA",
                "     A",
                "      ",
                "      ",
                "      ",
                "     A",
                "A    A",
                "      "
            .aisle(
                " B  B ",
                " B    ",
                " B    ",
                " BBBB ",
                "A    A",
                "A     ",
                "A     ",
                "A     ",
                "A     ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "A    A",
                "      "
            .aisle(
                " B  B ",
                " B    ",
                " B    ",
                " BBBB ",
                "A    A",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "A    A",
                "      "
            .aisle(
                " B  B ",
                " B    ",
                " B    ",
                " BBBB ",
                "A    A",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "A    A",
                "      "
            .aisle(
                " BBBB ",
                " BBBB ",
                " BBBB ",
                "      ",
                "A    A",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "A    A",
                "      "
            .aisle(
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "AAAAAA",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "A    A",
                "AAAAAA",
                "      "
            .where("A", <metastate:gregtech:meta_block_frame_937:15>)
            .where("B", <metastate:cbt:schrabidium_casing:0>)
            .where("@", IBlockMatcher.controller(loc))
            .where(" ", IBlockMatcher.ANY)
            .build())
    .withPartTooltip(<gregtech:metal_casing:2>, ITextComponent.fromString("Example") as ITextComponent)
    .withRecipeMap(
        FactoryRecipeMap.start(loc)
    		    .minInputs(1)
    		    .maxInputs(12)
    		    .minOutputs(1)
    		    .maxOutputs(2)
    		    .setSlotOverlay(false, false, GuiTextures.FURNACE_OVERLAY)
                .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, MoveType.HORIZONTAL)
    		    .build())
    .buildAndRegister();
multiblock.recipeMap.copyAll(RecipeMap.getByName("breaking_bad_dual_meth_cocaine_production_line")); 

// These are best specified in .lang files, since these may not work properly.
game.setLocalization(
    "multiblocktweaker.machine.breaking_bad_dual_meth_cocaine_production_line.name",
    "Breaking Bad's Dual Meth and Cocaine Production Line!"
);
game.setLocalization(
    "multiblocktweaker.multiblock.breaking_bad_dual_meth_cocaine_production_line.description",
    "BBDMCPL is a new multiblock designed to enrich the illegal drug making expe- (FBI OPEN UP!)"
);

// Don't forget to add a recipe!
recipes.addShaped(
    <gregtech:machine:2000>,
    [
        [<gregtech:cable:71>,         <gregtech:meta_item_2:32487>,         <gregtech:cable:71>],
        [<gregtech:meta_item_2:32487>, <gregtech:metal_casing:2>,  <gregtech:meta_item_2:32487>],
        [<gregtech:cable:71>,         <gregtech:meta_item_2:32487>,         <gregtech:cable:71>]
    ]
);