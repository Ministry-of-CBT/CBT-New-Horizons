import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.*;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.util.text.TextFormatting;
import gregtech.common.items.behaviors.TooltipBehavior;

// Project CBT - MetaItems General

log.infoMC("Project CBT: Adding Chemistry Book Torture in the game. Please be patient.")

StandardMetaItem atoms = new StandardMetaItem((short)2);
atoms.setRegistryName("projectcbt_atoms_single")

atoms.addItem(1, "hydrogen");
atoms.addItem(2, "deuterium");
atoms.addItem(3, "tritium");

log.infoMC("Project CBT: Finished Task: Project CBT Related MetaItems")

