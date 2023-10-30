import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.*;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.util.text.TextFormatting;
import gregtech.common.items.behaviors.TooltipBehavior;

// Data encoding in project cbt because

log.infoMC("Project CBT: Adding Data Science Torture")

StandardMetaItem binary = new StandardMetaItem((short)2);
binary.setRegistryName("cbt:binary")

binary.addItem(0, "ERROR");
binary.addItem(1, "0.bit");
binary.addItem(2, "1.bit");
binary.addItem(3, "Byte");
binary.addItem(4, "Short");
binary.addItem(5, "Int");
binary.addItem(6, "Long")
binary.addItem(7, "Str");
binary.addItem(8, "Boolean");
binary.addItem(9, "Float");

StandardMetaItem binary2 = new StandardMetaItem((short)2);
binary2.setRegistryName("cbt:binary_machine_strings")

log.infoMC("Project CBT: Admit LV Circuits: Stage Machine-Specific Circuits")

binary2.addItem(0, "encoded.binary.string.motherboard_plating");
binary2.addItem(1, "encoded.binary.string.alloy_smelter");
binary2.addItem(2, "encoded.binary.string.arc_furnace");
binary2.addItem(3, "encoded.binary.string.assembly_machine");
binary2.addItem(4, "encoded.binary.string.assembly_line");
binary2.addItem(5, "encoded.binary.string.autoclave");
binary2.addItem(6, "encoded.binary.string.blender");
binary2.addItem(7, "encoded.binary.string.brewery");
binary2.addItem(8, "encoded.binary.string.canner");
binary2.addItem(9, "encoded.binary.string.centrifuge");
binary2.addItem(10, "encoded.binary.string.chemical_bath");
binary2.addItem(11, "encoded.binary.string.chemical_reactor");
binary2.addItem(12, "encoded.binary.string.encoded_assembler");
binary2.addItem(13, "encoded.binary.string.coke_oven");
binary2.addItem(14, "encoded.binary.string.compressor");
binary2.addItem(15, "encoded.binary.string.cracking_unit");
binary2.addItem(16, "encoded.binary.string.distillation_tower");
binary2.addItem(17, "encoded.binary.string.distillery");
binary2.addItem(18, "encoded.binary.string.electric_blast_furnace");
binary2.addItem(19, "encoded.binary.string.electric_furnace");
binary2.addItem(20, "encoded.binary.string.electrolyzer");
binary2.addItem(21, "encoded.binary.string.electromagnetic_separator");
binary2.addItem(22, "encoded.binary.string.extractor");
binary2.addItem(23, "encoded.binary.string.extruder");
binary2.addItem(24, "encoded.binary.string.fermenter");
binary2.addItem(25, "encoded.binary.string.fluid_heater");
binary2.addItem(26, "encoded.binary.string.fluid_solidifier");
binary2.addItem(27, "encoded.binary.string.forge_hammer");
binary2.addItem(28, "encoded.binary.string.forming_press");
binary2.addItem(29, "encoded.binary.string.fusion_reactor");
binary2.addItem(30, "encoded.binary.string.gas_collector");
binary2.addItem(31, "encoded.binary.string.implosion_compressor");
binary2.addItem(32, "encoded.binary.string.large_chemical_reactor");
binary2.addItem(33, "encoded.binary.string.laser_engraver");
binary2.addItem(34, "encoded.binary.string.lathe");
binary2.addItem(35, "encoded.binary.string.macerator");
binary2.addItem(36, "encoded.binary.string.mass_fabricator");
binary2.addItem(37, "encoded.binary.string.mixer");
binary2.addItem(38, "encoded.binary.string.ore_washing_plant");
binary2.addItem(39, "encoded.binary.string.package");
binary2.addItem(40, "encoded.binary.string.polarizer");
binary2.addItem(41, "encoded.binary.string.primitive_blast_furnace");
binary2.addItem(42, "encoded.binary.string.pyrolose_oven");
binary2.addItem(43, "encoded.binary.string.replicator");
binary2.addItem(44, "encoded.binary.string.rock_breaker");
binary2.addItem(45, "encoded.binary.string.scanner");
binary2.addItem(46, "encoded.binary.string.sifting_machine");
binary2.addItem(47, "encoded.binary.string.thermal_centrifuge");
binary2.addItem(48, "encoded.binary.string.vacuum_freezer");
binary2.addItem(49, "encoded.binary.string.wiremill");
binary2.addItem(50, "encoded.binary.string.eg_combustion_generator");
binary2.addItem(51, "encoded.binary.string.eg_gas_turbine");
binary2.addItem(52, "encoded.binary.string.eg_plasma_generator");
binary2.addItem(53, "encoded.binary.string.eg_semi_fluid_generator");
binary2.addItem(54, "encoded.binary.string.eg_steam_turbine");

log.infoMC("Project CBT: Finished with Data Science Torture")

// 256 values of binary in item form because you need to do data science in Project CBT

log.infoMC("Project CBT: Adding Manual Byte Values")

StandardMetaItem binaryvalue = new StandardMetaItem((short)2);
binaryvalue.setRegistryName("cbt:binary_value")

binaryvalue.addItem(0, "00000000");
binaryvalue.addItem(1, "00000001");
binaryvalue.addItem(2, "00000010");
binaryvalue.addItem(3, "00000011");
binaryvalue.addItem(4, "00000100");
binaryvalue.addItem(5, "00000101");
binaryvalue.addItem(6, "00000110");
binaryvalue.addItem(7, "00000111");
binaryvalue.addItem(8, "00001000");
binaryvalue.addItem(9, "00001001");
binaryvalue.addItem(10, "00001010");
binaryvalue.addItem(11, "00001011");
binaryvalue.addItem(12, "00001100");
binaryvalue.addItem(13, "00001101");
binaryvalue.addItem(14, "00001110");
binaryvalue.addItem(15, "00001111");
binaryvalue.addItem(16, "00010000");
binaryvalue.addItem(17, "00010001");
binaryvalue.addItem(18, "00010010");
binaryvalue.addItem(19, "00010011");
binaryvalue.addItem(20, "00010100");
binaryvalue.addItem(21, "00010101");
binaryvalue.addItem(22, "00010110");
binaryvalue.addItem(23, "00010111");
binaryvalue.addItem(24, "00011000");
binaryvalue.addItem(25, "00011001");
binaryvalue.addItem(26, "00011010");
binaryvalue.addItem(27, "00011011");
binaryvalue.addItem(28, "00011100");
binaryvalue.addItem(29, "00011101");
binaryvalue.addItem(30, "00011110");
binaryvalue.addItem(31, "00011111");
binaryvalue.addItem(32, "00100000");
binaryvalue.addItem(33, "00100001");
binaryvalue.addItem(34, "00100010");
binaryvalue.addItem(35, "00100011");
binaryvalue.addItem(36, "00100100");
binaryvalue.addItem(37, "00100101");
binaryvalue.addItem(38, "00100110");
binaryvalue.addItem(39, "00100111");
binaryvalue.addItem(40, "00101000");
binaryvalue.addItem(41, "00101001");
binaryvalue.addItem(42, "00101010");
binaryvalue.addItem(43, "00101011");
binaryvalue.addItem(44, "00101100");
binaryvalue.addItem(45, "00101101");
binaryvalue.addItem(46, "00101110");
binaryvalue.addItem(47, "00101111");
binaryvalue.addItem(48, "00110000");
binaryvalue.addItem(49, "00110001");
binaryvalue.addItem(50, "00110010");
binaryvalue.addItem(51, "00110011");
binaryvalue.addItem(52, "00110100");
binaryvalue.addItem(53, "00110101");
binaryvalue.addItem(54, "00110110");
binaryvalue.addItem(55, "00110111");
binaryvalue.addItem(56, "00111000");
binaryvalue.addItem(57, "00111001");
binaryvalue.addItem(58, "00111010");
binaryvalue.addItem(59, "00111011");
binaryvalue.addItem(60, "00111100");
binaryvalue.addItem(61, "00111101");
binaryvalue.addItem(62, "00111110");
binaryvalue.addItem(63, "00111111");
binaryvalue.addItem(64, "01000000");
binaryvalue.addItem(65, "01000001");
binaryvalue.addItem(66, "01000010");
binaryvalue.addItem(67, "01000011");
binaryvalue.addItem(68, "01000100");
binaryvalue.addItem(69, "01000101");
binaryvalue.addItem(70, "01000110");
binaryvalue.addItem(71, "01000111");
binaryvalue.addItem(72, "01001000");
binaryvalue.addItem(73, "01001001");
binaryvalue.addItem(74, "01001010");
binaryvalue.addItem(75, "01001011");
binaryvalue.addItem(76, "01001100");
binaryvalue.addItem(77, "01001101");
binaryvalue.addItem(78, "01001110");
binaryvalue.addItem(79, "01001111");
binaryvalue.addItem(80, "01010000");
binaryvalue.addItem(81, "01010001");
binaryvalue.addItem(82, "01010010");
binaryvalue.addItem(83, "01010011");
binaryvalue.addItem(84, "01010100");
binaryvalue.addItem(85, "01010101");
binaryvalue.addItem(86, "01010110");
binaryvalue.addItem(87, "01010111");
binaryvalue.addItem(88, "01011000");
binaryvalue.addItem(89, "01011001");
binaryvalue.addItem(90, "01011010");
binaryvalue.addItem(91, "01011011");
binaryvalue.addItem(92, "01011100");
binaryvalue.addItem(93, "01011101");
binaryvalue.addItem(94, "01011110");
binaryvalue.addItem(95, "01011111");
binaryvalue.addItem(96, "01100000");
binaryvalue.addItem(97, "01100001");
binaryvalue.addItem(98, "01100010");
binaryvalue.addItem(99, "01100011");
binaryvalue.addItem(100, "01100100");
binaryvalue.addItem(101, "01100101");
binaryvalue.addItem(102, "01100110");
binaryvalue.addItem(103, "01100111");
binaryvalue.addItem(104, "01101000");
binaryvalue.addItem(105, "01101001");
binaryvalue.addItem(106, "01101010");
binaryvalue.addItem(107, "01101011");
binaryvalue.addItem(108, "01101100");
binaryvalue.addItem(109, "01101101");
binaryvalue.addItem(110, "01101110");
binaryvalue.addItem(111, "01101111");
binaryvalue.addItem(112, "01110000");
binaryvalue.addItem(113, "01110001");
binaryvalue.addItem(114, "01110010");
binaryvalue.addItem(115, "01110011");
binaryvalue.addItem(116, "01110100");
binaryvalue.addItem(117, "01110101");
binaryvalue.addItem(118, "01110110");
binaryvalue.addItem(119, "01110111");
binaryvalue.addItem(120, "01111000");
binaryvalue.addItem(121, "01111001");
binaryvalue.addItem(122, "01111010");
binaryvalue.addItem(123, "01111011");
binaryvalue.addItem(124, "01111100");
binaryvalue.addItem(125, "01111101");
binaryvalue.addItem(126, "01111110");
binaryvalue.addItem(127, "01111111");
binaryvalue.addItem(128, "10000000");