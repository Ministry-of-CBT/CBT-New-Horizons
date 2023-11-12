#loader crafttweaker

import crafttweaker.recipes.ICraftingRecipe;
import crafttweaker.item.IItemStack;
import crafttweaker.liquid.ILiquidStack;

import mods.firmalife.Oven;

import mods.terrafirmacraft.ItemRegistry;
import mods.terrafirmacraft.Welding;
import mods.terrafirmacraft.Anvil;
import mods.terrafirmacraft.Quern;
import mods.terrafirmacraft.Heating;
import mods.terrafirmacraft.ClayKnapping;
import mods.terrafirmacraft.Barrel;
import mods.terrafirmacraft.LeatherKnapping;
import mods.terrafirmacraft.StoneKnapping;

StoneKnapping.addRecipe("testrecipe", [<cbt:stone_crafting_table_template>], [all], "XXXXX", "X   X", "X   X", "X   X", "XXXXX");