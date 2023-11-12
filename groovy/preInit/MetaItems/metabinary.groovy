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
binary.setRegistryName("gregtech:binary")

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
binary2.setRegistryName("gregtech:binary_machine_strings")

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

log.infoMC("Project CBT: Adding Manual Byte Values - Binary and Hex")

StandardMetaItem binaryvalue = new StandardMetaItem((short)2);
binaryvalue.setRegistryName("gregtech:binary_value");

binaryvalue.addItem(1, "00000000");
binaryvalue.addItem(2, "00000001");
binaryvalue.addItem(3, "00000010");
binaryvalue.addItem(4, "00000011");
binaryvalue.addItem(5, "00000100");
binaryvalue.addItem(6, "00000101");
binaryvalue.addItem(7, "00000110");
binaryvalue.addItem(8, "00000111");
binaryvalue.addItem(9, "00001000");
binaryvalue.addItem(10, "00001001");
binaryvalue.addItem(11, "00001010");
binaryvalue.addItem(12, "00001011");
binaryvalue.addItem(13, "00001100");
binaryvalue.addItem(14, "00001101");
binaryvalue.addItem(15, "00001110");
binaryvalue.addItem(16, "00001111");
binaryvalue.addItem(17, "00010000");
binaryvalue.addItem(18, "00010001");
binaryvalue.addItem(19, "00010010");
binaryvalue.addItem(20, "00010011");
binaryvalue.addItem(21, "00010100");
binaryvalue.addItem(22, "00010101");
binaryvalue.addItem(23, "00010110");
binaryvalue.addItem(24, "00010111");
binaryvalue.addItem(25, "00011000");
binaryvalue.addItem(26, "00011001");
binaryvalue.addItem(27, "00011010");
binaryvalue.addItem(28, "00011011");
binaryvalue.addItem(29, "00011100");
binaryvalue.addItem(30, "00011101");
binaryvalue.addItem(31, "00011110");
binaryvalue.addItem(32, "00011111");
binaryvalue.addItem(33, "00100000");
binaryvalue.addItem(34, "00100001");
binaryvalue.addItem(35, "00100010");
binaryvalue.addItem(36, "00100011");
binaryvalue.addItem(37, "00100100");
binaryvalue.addItem(38, "00100101");
binaryvalue.addItem(39, "00100110");
binaryvalue.addItem(40, "00100111");
binaryvalue.addItem(41, "00101000");
binaryvalue.addItem(42, "00101001");
binaryvalue.addItem(43, "00101010");
binaryvalue.addItem(44, "00101011");
binaryvalue.addItem(45, "00101100");
binaryvalue.addItem(46, "00101101");
binaryvalue.addItem(47, "00101110");
binaryvalue.addItem(48, "00101111");
binaryvalue.addItem(49, "00110000");
binaryvalue.addItem(50, "00110001");
binaryvalue.addItem(51, "00110010");
binaryvalue.addItem(52, "00110011");
binaryvalue.addItem(53, "00110100");
binaryvalue.addItem(54, "00110101");
binaryvalue.addItem(55, "00110110");
binaryvalue.addItem(56, "00110111");
binaryvalue.addItem(57, "00111000");
binaryvalue.addItem(58, "00111001");
binaryvalue.addItem(59, "00111010");
binaryvalue.addItem(60, "00111011");
binaryvalue.addItem(61, "00111100");
binaryvalue.addItem(62, "00111101");
binaryvalue.addItem(63, "00111110");
binaryvalue.addItem(64, "00111111");
binaryvalue.addItem(65, "01000000");
binaryvalue.addItem(66, "01000001");
binaryvalue.addItem(67, "01000010");
binaryvalue.addItem(68, "01000011");
binaryvalue.addItem(69, "01000100");
binaryvalue.addItem(70, "01000101");
binaryvalue.addItem(71, "01000110");
binaryvalue.addItem(72, "01000111");
binaryvalue.addItem(73, "01001000");
binaryvalue.addItem(74, "01001001");
binaryvalue.addItem(75, "01001010");
binaryvalue.addItem(76, "01001011");
binaryvalue.addItem(77, "01001100");
binaryvalue.addItem(78, "01001101");
binaryvalue.addItem(79, "01001110");
binaryvalue.addItem(80, "01001111");
binaryvalue.addItem(81, "01010000");
binaryvalue.addItem(82, "01010001");
binaryvalue.addItem(83, "01010010");
binaryvalue.addItem(84, "01010011");
binaryvalue.addItem(85, "01010100");
binaryvalue.addItem(86, "01010101");
binaryvalue.addItem(87, "01010110");
binaryvalue.addItem(88, "01010111");
binaryvalue.addItem(89, "01011000");
binaryvalue.addItem(90, "01011001");
binaryvalue.addItem(91, "01011010");
binaryvalue.addItem(92, "01011011");
binaryvalue.addItem(93, "01011100");
binaryvalue.addItem(94, "01011101");
binaryvalue.addItem(95, "01011110");
binaryvalue.addItem(96, "01011111");
binaryvalue.addItem(97, "01100000");
binaryvalue.addItem(98, "01100001");
binaryvalue.addItem(99, "01100010");
binaryvalue.addItem(100, "01100011");
binaryvalue.addItem(101, "01100100");
binaryvalue.addItem(102, "01100101");
binaryvalue.addItem(103, "01100110");
binaryvalue.addItem(104, "01100111");
binaryvalue.addItem(105, "01101000");
binaryvalue.addItem(106, "01101001");
binaryvalue.addItem(107, "01101010");
binaryvalue.addItem(108, "01101011");
binaryvalue.addItem(109, "01101100");
binaryvalue.addItem(110, "01101101");
binaryvalue.addItem(111, "01101110");
binaryvalue.addItem(112, "01101111");
binaryvalue.addItem(113, "01110000");
binaryvalue.addItem(114, "01110001");
binaryvalue.addItem(115, "01110010");
binaryvalue.addItem(116, "01110011");
binaryvalue.addItem(117, "01110100");
binaryvalue.addItem(118, "01110101");
binaryvalue.addItem(119, "01110110");
binaryvalue.addItem(120, "01110111");
binaryvalue.addItem(121, "01111000");
binaryvalue.addItem(122, "01111001");
binaryvalue.addItem(123, "01111010");
binaryvalue.addItem(124, "01111011");
binaryvalue.addItem(125, "01111100");
binaryvalue.addItem(126, "01111101");
binaryvalue.addItem(127, "01111110");
binaryvalue.addItem(128, "01111111");
binaryvalue.addItem(129, "10000000");
binaryvalue.addItem(130, "10000001");
binaryvalue.addItem(131, "10000010");
binaryvalue.addItem(132, "10000011");
binaryvalue.addItem(133, "10000100");
binaryvalue.addItem(134, "10000101");
binaryvalue.addItem(135, "10000110");
binaryvalue.addItem(136, "10000111");
binaryvalue.addItem(137, "10001000");
binaryvalue.addItem(138, "10001001");
binaryvalue.addItem(139, "10001010");
binaryvalue.addItem(140, "10001011");
binaryvalue.addItem(141, "10001100");
binaryvalue.addItem(142, "10001101");
binaryvalue.addItem(143, "10001110");
binaryvalue.addItem(144, "10001111");
binaryvalue.addItem(145, "10010000");
binaryvalue.addItem(146, "10010001");
binaryvalue.addItem(147, "10010010");
binaryvalue.addItem(148, "10010011");
binaryvalue.addItem(149, "10010100");
binaryvalue.addItem(150, "10010101");
binaryvalue.addItem(151, "10010110");
binaryvalue.addItem(152, "10010111");
binaryvalue.addItem(153, "10011000");
binaryvalue.addItem(154, "10011001");
binaryvalue.addItem(155, "10011010");
binaryvalue.addItem(156, "10011011");
binaryvalue.addItem(157, "10011100");
binaryvalue.addItem(158, "10011101");
binaryvalue.addItem(159, "10011110");
binaryvalue.addItem(160, "10011111");
binaryvalue.addItem(161, "10100000");
binaryvalue.addItem(162, "10100001");
binaryvalue.addItem(163, "10100010");
binaryvalue.addItem(164, "10100011");
binaryvalue.addItem(165, "10100100");
binaryvalue.addItem(166, "10100101");
binaryvalue.addItem(167, "10100110");
binaryvalue.addItem(168, "10100111");
binaryvalue.addItem(169, "10101000");
binaryvalue.addItem(170, "10101001");
binaryvalue.addItem(171, "10101010");
binaryvalue.addItem(172, "10101011");
binaryvalue.addItem(173, "10101100");
binaryvalue.addItem(174, "10101101");
binaryvalue.addItem(175, "10101110");
binaryvalue.addItem(176, "10101111");
binaryvalue.addItem(177, "10110000");
binaryvalue.addItem(178, "10110001");
binaryvalue.addItem(179, "10110010");
binaryvalue.addItem(180, "10110011");
binaryvalue.addItem(181, "10110100");
binaryvalue.addItem(182, "10110101");
binaryvalue.addItem(183, "10110110");
binaryvalue.addItem(184, "10110111");
binaryvalue.addItem(185, "10111000");
binaryvalue.addItem(186, "10111001");
binaryvalue.addItem(187, "10111010");
binaryvalue.addItem(188, "10111011");
binaryvalue.addItem(189, "10111100");
binaryvalue.addItem(190, "10111101");
binaryvalue.addItem(191, "10111110");
binaryvalue.addItem(192, "10111111");
binaryvalue.addItem(193, "11000000");
binaryvalue.addItem(194, "11000001");
binaryvalue.addItem(195, "11000010");
binaryvalue.addItem(196, "11000011");
binaryvalue.addItem(197, "11000100");
binaryvalue.addItem(198, "11000101");
binaryvalue.addItem(199, "11000110");
binaryvalue.addItem(200, "11000111");
binaryvalue.addItem(201, "11001000");
binaryvalue.addItem(202, "11001001");
binaryvalue.addItem(203, "11001010");
binaryvalue.addItem(204, "11001011");
binaryvalue.addItem(205, "11001100");
binaryvalue.addItem(206, "11001101");
binaryvalue.addItem(207, "11001110");
binaryvalue.addItem(208, "11001111");
binaryvalue.addItem(209, "11010000");
binaryvalue.addItem(210, "11010001");
binaryvalue.addItem(211, "11010010");
binaryvalue.addItem(212, "11010011");
binaryvalue.addItem(213, "11010100");
binaryvalue.addItem(214, "11010101");
binaryvalue.addItem(215, "11010110");
binaryvalue.addItem(216, "11010111");
binaryvalue.addItem(217, "11011000");
binaryvalue.addItem(218, "11011001");
binaryvalue.addItem(219, "11011010");
binaryvalue.addItem(220, "11011011");
binaryvalue.addItem(221, "11011100");
binaryvalue.addItem(222, "11011101");
binaryvalue.addItem(223, "11011110");
binaryvalue.addItem(224, "11011111");
binaryvalue.addItem(225, "11100000");
binaryvalue.addItem(226, "11100001");
binaryvalue.addItem(227, "11100010");
binaryvalue.addItem(228, "11100011");
binaryvalue.addItem(229, "11100100");
binaryvalue.addItem(230, "11100101");
binaryvalue.addItem(231, "11100110");
binaryvalue.addItem(232, "11100111");
binaryvalue.addItem(233, "11101000");
binaryvalue.addItem(234, "11101001");
binaryvalue.addItem(235, "11101010");
binaryvalue.addItem(236, "11101011");
binaryvalue.addItem(237, "11101100");
binaryvalue.addItem(238, "11101101");
binaryvalue.addItem(239, "11101110");
binaryvalue.addItem(240, "11101111");
binaryvalue.addItem(241, "11110000");
binaryvalue.addItem(242, "11110001");
binaryvalue.addItem(243, "11110010");
binaryvalue.addItem(244, "11110011");
binaryvalue.addItem(245, "11110100");
binaryvalue.addItem(246, "11110101");
binaryvalue.addItem(247, "11110110");
binaryvalue.addItem(248, "11110111");
binaryvalue.addItem(249, "11111000");
binaryvalue.addItem(250, "11111001");
binaryvalue.addItem(251, "11111010");
binaryvalue.addItem(252, "11111011");
binaryvalue.addItem(253, "11111100");
binaryvalue.addItem(254, "11111101");
binaryvalue.addItem(255, "11111110");
binaryvalue.addItem(256, "11111111");

StandardMetaItem hexvalue = new StandardMetaItem((short)2);
hexvalue.setRegistryName("cbt:hexvalue");

hexvalue.addItem(1, "00");
hexvalue.addItem(2, "01");
hexvalue.addItem(3, "02");
hexvalue.addItem(4, "03");
hexvalue.addItem(5, "04");
hexvalue.addItem(6, "05");
hexvalue.addItem(7, "06");
hexvalue.addItem(8, "07");
hexvalue.addItem(9, "08");
hexvalue.addItem(10, "09");
hexvalue.addItem(11, "0A");
hexvalue.addItem(12, "0B");
hexvalue.addItem(13, "0C");
hexvalue.addItem(14, "0D");
hexvalue.addItem(15, "0E");
hexvalue.addItem(16, "0F");
hexvalue.addItem(17, "10");
hexvalue.addItem(18, "11");
hexvalue.addItem(19, "12");
hexvalue.addItem(20, "13");
hexvalue.addItem(21, "14");
hexvalue.addItem(22, "15");
hexvalue.addItem(23, "16");
hexvalue.addItem(24, "17");
hexvalue.addItem(25, "18");
hexvalue.addItem(26, "19");
hexvalue.addItem(27, "1A");
hexvalue.addItem(28, "1B");
hexvalue.addItem(29, "1C");
hexvalue.addItem(30, "1D");
hexvalue.addItem(31, "1E");
hexvalue.addItem(32, "1F");
hexvalue.addItem(33, "20");
hexvalue.addItem(34, "21");
hexvalue.addItem(35, "22");
hexvalue.addItem(36, "23");
hexvalue.addItem(37, "24");
hexvalue.addItem(38, "25");
hexvalue.addItem(39, "26");
hexvalue.addItem(40, "27");
hexvalue.addItem(41, "28");
hexvalue.addItem(42, "29");
hexvalue.addItem(43, "2A");
hexvalue.addItem(44, "2B");
hexvalue.addItem(45, "2C");
hexvalue.addItem(46, "2D");
hexvalue.addItem(47, "2E");
hexvalue.addItem(48, "2F");
hexvalue.addItem(49, "30");
hexvalue.addItem(50, "31");
hexvalue.addItem(51, "32");
hexvalue.addItem(52, "33");
hexvalue.addItem(53, "34");
hexvalue.addItem(54, "35");
hexvalue.addItem(55, "36");
hexvalue.addItem(56, "37");
hexvalue.addItem(57, "38");
hexvalue.addItem(58, "39");
hexvalue.addItem(59, "3A");
hexvalue.addItem(60, "3B");
hexvalue.addItem(61, "3C");
hexvalue.addItem(62, "3D");
hexvalue.addItem(63, "3E");
hexvalue.addItem(64, "3F");
hexvalue.addItem(65, "40");
hexvalue.addItem(66, "41");
hexvalue.addItem(67, "42");
hexvalue.addItem(68, "43");
hexvalue.addItem(69, "44");
hexvalue.addItem(70, "45");
hexvalue.addItem(71, "46");
hexvalue.addItem(72, "47");
hexvalue.addItem(73, "48");
hexvalue.addItem(74, "49");
hexvalue.addItem(75, "4A");
hexvalue.addItem(76, "4B");
hexvalue.addItem(77, "4C");
hexvalue.addItem(78, "4D");
hexvalue.addItem(79, "4E");
hexvalue.addItem(80, "4F");
hexvalue.addItem(81, "50");
hexvalue.addItem(82, "51");
hexvalue.addItem(83, "52");
hexvalue.addItem(84, "53");
hexvalue.addItem(85, "54");
hexvalue.addItem(86, "55");
hexvalue.addItem(87, "56");
hexvalue.addItem(88, "57");
hexvalue.addItem(89, "58");
hexvalue.addItem(90, "59");
hexvalue.addItem(91, "5A");
hexvalue.addItem(92, "5B");
hexvalue.addItem(93, "5C");
hexvalue.addItem(94, "5D");
hexvalue.addItem(95, "5E");
hexvalue.addItem(96, "5F");
hexvalue.addItem(97, "60");
hexvalue.addItem(98, "61");
hexvalue.addItem(99, "62");
hexvalue.addItem(100, "63");
hexvalue.addItem(101, "64");
hexvalue.addItem(102, "65");
hexvalue.addItem(103, "66");
hexvalue.addItem(104, "67");
hexvalue.addItem(105, "68");
hexvalue.addItem(106, "69");
hexvalue.addItem(107, "6A");
hexvalue.addItem(108, "6B");
hexvalue.addItem(109, "6C");
hexvalue.addItem(110, "6D");
hexvalue.addItem(111, "6E");
hexvalue.addItem(112, "6F");
hexvalue.addItem(113, "70");
hexvalue.addItem(114, "71");
hexvalue.addItem(115, "72");
hexvalue.addItem(116, "73");
hexvalue.addItem(117, "74");
hexvalue.addItem(118, "75");
hexvalue.addItem(119, "76");
hexvalue.addItem(120, "77");
hexvalue.addItem(121, "78");
hexvalue.addItem(122, "79");
hexvalue.addItem(123, "7A");
hexvalue.addItem(124, "7B");
hexvalue.addItem(125, "7C");
hexvalue.addItem(126, "7D");
hexvalue.addItem(127, "7E");
hexvalue.addItem(128, "7F");
hexvalue.addItem(129, "80");
hexvalue.addItem(130, "81");
hexvalue.addItem(131, "82");
hexvalue.addItem(132, "83");
hexvalue.addItem(133, "84");
hexvalue.addItem(134, "85");
hexvalue.addItem(135, "86");
hexvalue.addItem(136, "87");
hexvalue.addItem(137, "88");
hexvalue.addItem(138, "89");
hexvalue.addItem(139, "8A");
hexvalue.addItem(140, "8B");
hexvalue.addItem(141, "8C");
hexvalue.addItem(142, "8D");
hexvalue.addItem(143, "8E");
hexvalue.addItem(144, "8F");
hexvalue.addItem(145, "90");
hexvalue.addItem(146, "91");
hexvalue.addItem(147, "92");
hexvalue.addItem(148, "93");
hexvalue.addItem(149, "94");
hexvalue.addItem(150, "95");
hexvalue.addItem(151, "96");
hexvalue.addItem(152, "97");
hexvalue.addItem(153, "98");
hexvalue.addItem(154, "99");
hexvalue.addItem(155, "9A");
hexvalue.addItem(156, "9B");
hexvalue.addItem(157, "9C");
hexvalue.addItem(158, "9D");
hexvalue.addItem(159, "9E");
hexvalue.addItem(160, "9F");
hexvalue.addItem(161, "A0");
hexvalue.addItem(162, "A1");
hexvalue.addItem(163, "A2");
hexvalue.addItem(164, "A3");
hexvalue.addItem(165, "A4");
hexvalue.addItem(166, "A5");
hexvalue.addItem(167, "A6");
hexvalue.addItem(168, "A7");
hexvalue.addItem(169, "A8");
hexvalue.addItem(170, "A9");
hexvalue.addItem(171, "AA");
hexvalue.addItem(172, "AB");
hexvalue.addItem(173, "AC");
hexvalue.addItem(174, "AD");
hexvalue.addItem(175, "AE");
hexvalue.addItem(176, "AF");
hexvalue.addItem(177, "B0");
hexvalue.addItem(178, "B1");
hexvalue.addItem(179, "B2");
hexvalue.addItem(180, "B3");
hexvalue.addItem(181, "B4");
hexvalue.addItem(182, "B5");
hexvalue.addItem(183, "B6");
hexvalue.addItem(184, "B7");
hexvalue.addItem(185, "B8");
hexvalue.addItem(186, "B9");
hexvalue.addItem(187, "BA");
hexvalue.addItem(188, "BB");
hexvalue.addItem(189, "BC");
hexvalue.addItem(190, "BD");
hexvalue.addItem(191, "BE");
hexvalue.addItem(192, "BF");
hexvalue.addItem(193, "C0");
hexvalue.addItem(194, "C1");
hexvalue.addItem(195, "C2");
hexvalue.addItem(196, "C3");
hexvalue.addItem(197, "C4");
hexvalue.addItem(198, "C5");
hexvalue.addItem(199, "C6");
hexvalue.addItem(200, "C7");
hexvalue.addItem(201, "C8");
hexvalue.addItem(202, "C9");
hexvalue.addItem(203, "CA");
hexvalue.addItem(204, "CB");
hexvalue.addItem(205, "CC");
hexvalue.addItem(206, "CD");
hexvalue.addItem(207, "CE");
hexvalue.addItem(208, "CF");
hexvalue.addItem(209, "D0");
hexvalue.addItem(210, "D1");
hexvalue.addItem(211, "D2");
hexvalue.addItem(212, "D3");
hexvalue.addItem(213, "D4");
hexvalue.addItem(214, "D5");
hexvalue.addItem(215, "D6");
hexvalue.addItem(216, "D7");
hexvalue.addItem(217, "D8");
hexvalue.addItem(218, "D9");
hexvalue.addItem(219, "DA");
hexvalue.addItem(220, "DB");
hexvalue.addItem(221, "DC");
hexvalue.addItem(222, "DD");
hexvalue.addItem(223, "DE");
hexvalue.addItem(224, "DF");
hexvalue.addItem(225, "E0");
hexvalue.addItem(226, "E1");
hexvalue.addItem(227, "E2");
hexvalue.addItem(228, "E3");
hexvalue.addItem(229, "E4");
hexvalue.addItem(230, "E5");
hexvalue.addItem(231, "E6");
hexvalue.addItem(232, "E7");
hexvalue.addItem(233, "E8");
hexvalue.addItem(234, "E9");
hexvalue.addItem(235, "EA");
hexvalue.addItem(236, "EB");
hexvalue.addItem(237, "EC");
hexvalue.addItem(238, "ED");
hexvalue.addItem(239, "EE");
hexvalue.addItem(240, "EF");
hexvalue.addItem(241, "F0");
hexvalue.addItem(242, "F1");
hexvalue.addItem(243, "F2");
hexvalue.addItem(244, "F3");
hexvalue.addItem(245, "F4");
hexvalue.addItem(246, "F5");
hexvalue.addItem(247, "F6");
hexvalue.addItem(248, "F7");
hexvalue.addItem(249, "F8");
hexvalue.addItem(250, "F9");
hexvalue.addItem(251, "FA");
hexvalue.addItem(252, "FB");
hexvalue.addItem(253, "FC");
hexvalue.addItem(254, "FD");
hexvalue.addItem(255, "FE");
hexvalue.addItem(256, "FF");
