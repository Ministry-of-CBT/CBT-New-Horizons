import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.*;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.util.text.TextFormatting;
import gregtech.common.items.behaviors.TooltipBehavior;

// Project CBT - MetaItems General

log.infoMC("Project CBT: Atomic Science Init")

log.infoMC("Project CBT: Atomic Science --- Loading Single Atoms")

StandardMetaItem atoms = new StandardMetaItem((short)2);
atoms.setRegistryName("atoms_single")

atoms.addItem(0, "error");
atoms.addItem(1, "atom_hydrogen");
atoms.addItem(2, "atom_helium");
atoms.addItem(3, "atom_lithium");
atoms.addItem(4, "atom_beryllium");
atoms.addItem(5, "atom_boron");
atoms.addItem(6, "atom_carbon");
atoms.addItem(7, "atom_nitrogen");
atoms.addItem(8, "atom_oxygen");
atoms.addItem(9, "atom_fluorine");
atoms.addItem(10, "atom_neon");
atoms.addItem(11, "atom_sodium");
atoms.addItem(12, "atom_magnesium");
atoms.addItem(13, "atom_aluminium");
atoms.addItem(14, "atom_silicon");
atoms.addItem(15, "atom_phosphorus");
atoms.addItem(16, "atom_sulfur");
atoms.addItem(17, "atom_chlorine");
atoms.addItem(18, "atom_argon");
atoms.addItem(19, "atom_potassium");
atoms.addItem(20, "atom_calcium");
atoms.addItem(21, "atom_scandium");
atoms.addItem(22, "atom_titanium");
atoms.addItem(23, "atom_vanadium");
atoms.addItem(24, "atom_chrome");
atoms.addItem(25, "atom_manganese");
atoms.addItem(26, "atom_iron");
atoms.addItem(27, "atom_cobalt");
atoms.addItem(28, "atom_nickel");
atoms.addItem(29, "atom_copper");
atoms.addItem(30, "atom_zinc");
atoms.addItem(31, "atom_gallium");
atoms.addItem(32, "atom_germanium");
atoms.addItem(33, "atom_arsenic");
atoms.addItem(34, "atom_selenium");
atoms.addItem(35, "atom_bromine");
atoms.addItem(36, "atom_krypton");
atoms.addItem(37, "atom_rubidium");
atoms.addItem(38, "atom_strontium");
atoms.addItem(39, "atom_yttrium");
atoms.addItem(40, "atom_zirconium");
atoms.addItem(41, "atom_niobium");
atoms.addItem(42, "atom_molybdenum");
atoms.addItem(43, "atom_technetium");
atoms.addItem(44, "atom_ruthenium");
atoms.addItem(45, "atom_ruthenium");
atoms.addItem(46, "atom_palladium");
atoms.addItem(47, "atom_silver");
atoms.addItem(48, "atom_cadmium");
atoms.addItem(49, "atom_indium");
atoms.addItem(50, "atom_tin");
atoms.addItem(51, "atom_antimony");
atoms.addItem(52, "atom_tellurium");
atoms.addItem(53, "atom_iodine");
atoms.addItem(54, "atom_xenon");
atoms.addItem(55, "atom_caesium");
atoms.addItem(56, "atom_barium");
atoms.addItem(57, "atom_lanthanum");
atoms.addItem(58, "atom_cerium");
atoms.addItem(59, "atom_praseodymium");
atoms.addItem(60, "atom_neodymium");
atoms.addItem(61, "atom_promethium");
atoms.addItem(62, "atom_samarium");
atoms.addItem(63, "atom_europium");
atoms.addItem(64, "atom_gadolinium");
atoms.addItem(65, "atom_terbium");
atoms.addItem(66, "atom_dysprosium");
atoms.addItem(67, "atom_holmium");
atoms.addItem(68, "atom_erbium");
atoms.addItem(69, "atom_thulium");
atoms.addItem(70, "atom_ytterbium");
atoms.addItem(71, "atom_lutetium");
atoms.addItem(72, "atom_hafnium");
atoms.addItem(73, "atom_tantalum");
atoms.addItem(74, "atom_tungsten");
atoms.addItem(75, "atom_rhenium");
atoms.addItem(76, "atom_osmium");
atoms.addItem(77, "atom_iridium");
atoms.addItem(78, "atom_platinum");
atoms.addItem(79, "atom_gold");
atoms.addItem(80, "atom_mercury");

log.infoMC("Project CBT: Atomic Science --- Loading Isotopes")

log.infoMC("Project CBT: Atomic Science --- Loading Elementary Particles")

StandardMetaItem elementary = new StandardMetaItem((short)2);
elementary.setRegistryName("elementary_particles")

elementary.addItem(1, "proton");
elementary.addItem(2, "neutron");
elementary.addItem(3, "gluon");
elementary.addItem(4, "antiproton");
elementary.addItem(5, "antineutron");
elementary.addItem(6, "antielectron");
elementary.addItem(7, "photons");
elementary.addItem(8, "higgs");
elementary.addItem(9, "up_quark");
elementary.addItem(10, "down_quark");
elementary.addItem(11, "charm_quark");
elementary.addItem(12, "strange_quark");
elementary.addItem(13, "top_quark");
elementary.addItem(14, "bottom_quark");
elementary.addItem(15, "electron");
elementary.addItem(16, "electron_neutrino");
elementary.addItem(17, "muon");
elementary.addItem(18, "muon_neutrino");
elementary.addItem(19, "tau");
elementary.addItem(20, "tau_neutrino");
elementary.addItem(21, "z_boson");
elementary.addItem(22, "w_boson");

log.infoMC("Project CBT: Finished Atomic Science")

