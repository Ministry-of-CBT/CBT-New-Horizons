#loader gregtech
#priority 2000

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

//New Elements

var element_susanium = MaterialBuilder(11002, "susanium").element("Susanium-306")
    .fluid("fluid", false)
    .plasma()
    .ingot(6)
    .iconSet("metallic") // iconset 
    .color(0x60D82A)
    .build();

var element_dylantrum = MaterialBuilder(11003, "dylantrum").element("Dylantrum-309")
    .fluid("fluid", false)
    .plasma()
    .ingot(6)
    .iconSet("metallic") // iconset 
    .color(0xE54D4D)
    .cableProperties(1572864, 1, 16, false) // add cables
    .flags(["generate_plate", "generate_rod", "generate_frame"])
    .build();

var element_agrastium = MaterialBuilder(11004, "agrastium").element("Agrastium-313")
    .fluid("fluid", false)
    .plasma()
    .ingot(6)
    .iconSet("metallic") // iconset 
    .color(0xCA2245)
    .flags(["generate_plate"])
    .build();

var element_ruslyium = MaterialBuilder(11005, "ruslyium").element("Ruslyium-318")
    .fluid("fluid", false)
    .plasma()
    .ingot(6)
    .iconSet("metallic") // iconset 
    .color(0x407DB0)
    .flags(["generate_plate", "generate_frame", "generate_foil", "generate_fine_wire"])
    .itemPipeProperties(1, 32)
    .build();

var element_schrabidium = MaterialBuilder(11007, "schrabidium").element("Schrabidium-326")
    .fluid("fluid", false)
    .plasma()
    .ingot(7)
    .iconSet("shiny") // iconset 
    .color(0x64C2B9)
    .toolStats(10, 3, 256, 21) // temporary stat
    .rotorStats(10, 2, 1000)
    .fluidTemp(50000)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire", "generate_round", "generate_dense", "generate_rotor", "generate_ring", "generate_small_gear", "generate_spring", "generate_spring_small"])
    .cableProperties(2097152, 16, 0, true) // add cables
    .build();

var element_solinium = MaterialBuilder(11008, "solinium").element("Solinium-327")
    .ingot(6)
    .iconSet("dull") // iconset 
    .color(0x64C2B9)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire"])
    .build();

var element_veridium = MaterialBuilder(11009, "veridium").element("Veridium-328")
    .ingot(6)
    .iconSet("quartz") // iconset 
    .color(0xB1F430)
    .fluidPipeProperties(20000, 200, true, true, true, true)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire", "generate_round", "generate_dense", "generate_rotor", "generate_ring", "generate_small_gear", "generate_spring", "generate_spring_small"])
    .build();

var element_lunarium = MaterialBuilder(11010, "lunarium").element("Lunarium-331")
    .ingot(6)
    .iconSet("certus") // iconset 
    .color(0x3283A8)
    .flags(["generate_plate", "generate_rod"])
    .build();

var element_etherium = MaterialBuilder(11011, "etherium").element("Etherium-335")
    .ingot(6)
    .iconSet("bright") // iconset 
    .color(0xA7453A)
    .flags(["generate_plate"])
    .build();

var element_xenynium = MaterialBuilder(11012, "xenynium").element("Xenynium-339")
    .ingot(6)
    .iconSet("bright") // iconset 
    .flags(["generate_plate", "generate_frame", "generate_foil", "generate_fine_wire"])
    .color(0xC7B142)
    .fluidPipeProperties(21000, 200, true, true, true, true)
    .build();

var element_neptupitrium = MaterialBuilder(11013, "neptupitrium").element("Neptupitrium-342")
    .ingot(6)
    .iconSet("gem_horizontal") // iconset 
    .color(0x54BBC2)
    .cableProperties(1572864, 4, 16, false) // add cables
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire"])
    .build();

var element_solimonium = MaterialBuilder(11014, "solimonium").element("Solimonium-346")
    .ingot(6)
    .iconSet("rough") // iconset 
    .color(0x62697B)
    .flags(["generate_gear", "generate_frame", "generate_rod", "generate_small_gear", "generate_long_rod", "generate_spring", "generate_spring_small"])
    .toolStats(20, 11, 2044, 6)
    .build();

var element_aetherium = MaterialBuilder(11015, "aetherium").element("Aetherium-350")
    .ingot(6)
    .iconSet("opal") // iconset 
    .color(0xA18BC3)
    .toolStats(20, 14, 2532, 4)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire", "generate_round", "generate_dense"])
    .build();

var element_quasarium = MaterialBuilder(11016, "quasarium").element("Quasarium-354")
    .ingot()
    .iconSet("netherstar") // iconset 
    .color(0xFFDD03)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire", "generate_round", "generate_dense"])
    .build();

var element_laranium = MaterialBuilder(11017, "laranium").element("Laranium-358")
    .ingot()
    .iconSet("certus") // iconset 
    .color(0x9CB3A4)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire", "generate_round", "generate_dense"])
    .build();

var element_polinium = MaterialBuilder(11018, "pyranium").element("Pyranium-362")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0xACBCDC)
    .flags(["generate_plate", "generate_dense", "generate_frame"])
    .build();

var element_silisimmunium = MaterialBuilder(11019, "silisimmunium").element("Silisimmunium-365")
    .ingot()
    .iconSet("metallic") // iconset 
    .color(0xD2CA64)
    .flags(["generate_plate", "generate_dense", "generate_frame"])
    .build();

var element_ryneurassium = MaterialBuilder(11020, "ryneurassium").element("Ryneurassium-369")
    .ingot()
    .iconSet("bright") // iconset 
    .color(0xCA84B3)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire", "generate_round", "generate_dense"])
    .build();

var element_supractinium = MaterialBuilder(11021, "supractinium").element("Supractinium-374")
    .ingot()
    .iconSet("dull") // iconset 
    .color(0x2AC6B4)
    .flags(["explosive"])
    .build();

var element_puthanium = MaterialBuilder(11022, "puthanium").element("Puthanium-378")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0x5CA444)
    .build();

var element_coslynium = MaterialBuilder(11023, "coslynium").element("Coslynium-382")
    .ingot()
    .iconSet("metallic") // iconset 
    .color(0x23A9C1)
    .build();

var element_yrattasium = MaterialBuilder(11024, "yrattasium").element("Yrattasium-386")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0xF0A322)
    .build();

var element_runevaline = MaterialBuilder(11025, "runevaline").element("Runevaline-390")
    .ingot()
    .iconSet("fine") // iconset 
    .color(0xCA3BAA)
    .build();

var element_neovaline = MaterialBuilder(11026, "neoveline").element("Neoveline-394")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0x44ACA8)
    .flags(["generate_plate", "generate_dense", "generate_frame"])
    .build();

var element_cesarnium = MaterialBuilder(11027, "cesarium").element("Cesarium-399")
    .ingot()
    .iconSet("lignite") // iconset 
    .color(0x4D3AC2)
    .flags(["generate_plate", "generate_dense", "generate_frame"])
    .build();

var element_quannasarium = MaterialBuilder(11028, "quannasarium").element("Quannasarium-403")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0xAC1111)
    .build();

var element_jadynomium = MaterialBuilder(11029, "jadynomium").element("Jadynomium-407")
    .ingot()
    .iconSet("gem_vertical") // iconset 
    .color(0xA4D305)
    .build();

var element_jaumium = MaterialBuilder(11030, "jaumium").element("Jaumium-412")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0x04D0A3)
    .build();

var element_euronium = MaterialBuilder(11031, "euronium").element("Euronium-416")
    .ingot()
    .iconSet("dull") // iconset 
    .color(0xAC2201)
    .build();

var element_dimosonium = MaterialBuilder(11032, "dimosonium").element("Dimosonium-421")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0x04D0A3)
    .build();

var element_krassium = MaterialBuilder(11033, "krassium").element("krassium-425")
    .ingot()
    .iconSet("metallic") // iconset 
    .color(0xC2A943)
    .build();

var element_dithermonium = MaterialBuilder(11034, "dithermonium").element("Dithermonium-430")
    .ingot()
    .iconSet("gem_vertical") // iconset 
    .color(0x944C3A)
    .build();

var element_prassoppurium = MaterialBuilder(11035, "prassoppurium").element("Prassoppurium-435")
    .ingot()
    .iconSet("gem_horizontal") // iconset 
    .color(0x7CBBA3)
    .build();

var element_sunatrium = MaterialBuilder(11036, "sunatrium").element("Sunatrium-439")
    .ingot()
    .iconSet("lignite") // iconset 
    .color(0xAC3300)
    .build();

var element_bralyium = MaterialBuilder(11037, "bralyium").element("Bralyium-444")
    .ingot()
    .iconSet("metallic") // iconset 
    .color(0xC21190)
    .build();

var element_quintessium = MaterialBuilder(11038, "quintessium").element("Quintessium-449")
    .ingot()
    .iconSet("metallic") // iconset 
    .color(0x74C833)
    .build();

var element_zephyrion = MaterialBuilder(11039, "zephyrion").element("Zephyrion-454")
    .ingot()
    .iconSet("shiny") // iconset 
    .color(0x68CA73)
    .build();

var element_chronotite = MaterialBuilder(11040, "chronotite").element("Chronotite-459")
    .ingot()
    .iconSet("shiny") // iconset 
    .color(0xACD023)
    .build();

var element_luminarite = MaterialBuilder(11041, "luminarite").element("Luminarite-463")
    .ingot()
    .iconSet("shiny") // iconset 
    .color(0xDCAA40)
    .build();

var element_pyrocore = MaterialBuilder(11042, "pyrocore").element("Pyrocore-468")
    .ingot()
    .iconSet("shiny") // iconset 
    .color(0xFA8624)
    .build();

var element_spectresium = MaterialBuilder(11043, "spectresium").element("Spectresium-474")
    .ingot()
    .iconSet("bright") // iconset 
    .color(0xAC399C)
    .build();

var element_aquamimite = MaterialBuilder(11044, "aquamimite").element("Aquamimite-479")
    .ingot()
    .iconSet("opal") // iconset 
    .color(0xACD953)
    .build();

var element_terravium = MaterialBuilder(11045, "terravium").element("Terravium-484")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0x04D0A3)
    .build();

var element_psilunarite = MaterialBuilder(11046, "psilunarite").element("Psilunarite-489")
    .ingot()
    .iconSet("metallic") // iconset 
    .color(0x5BC0A3)
    .build();

var element_nebulium = MaterialBuilder(11047, "nebulium").element("Nebulium-495")
    .ingot()
    .iconSet("metallic") // iconset 
    .color(0x666B4C)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_foil", "generate_fine_wire", "generate_round", "generate_dense", "generate_rotor", "generate_ring"])
    .build();

var element_scytronium = MaterialBuilder(11048, "scytronium").element("Scytronium-500")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0xB7C03A)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire"])
    .build();

var element_modulatum = MaterialBuilder(11049, "modulatum").element("Modulatum-505")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0xAC9333)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire", "generate_round", "generate_dense", "generate_rotor", "generate_ring", "generate_small_gear", "generate_spring", "generate_spring_small"])
    .build();

var element_etharosium = MaterialBuilder(11050, "etharosium").element("Etharosium-510")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0xAC0444)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire", "generate_round", "generate_dense", "generate_rotor", "generate_ring", "generate_small_gear", "generate_spring", "generate_spring_small"])
    .build();

var element_echotium = MaterialBuilder(11051, "echotium").element("Echotium-516")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0x99A4BC)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire", "generate_round", "generate_dense", "generate_rotor", "generate_ring", "generate_small_gear", "generate_spring", "generate_spring_small"])
    .cableProperties(2097152, 2, 4, false) // add cables
    .build();

var element_naquadasson = MaterialBuilder(11052, "naquadasson").element("Naquadasson-520")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0xE3A94B)
    .build();


