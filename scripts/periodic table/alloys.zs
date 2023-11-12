#loader gregtech
#priority 1000

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

var tetrisarium = MaterialBuilder(16000, "tetrisarium")
    .ingot()
    .colorAverage()
    .blastTemp(40000)
    .cableProperties(8388608, 2, 4, false) // add cables
    .components([<material:schrabidium>*4, <material:quasarium>*6, <material:technetium>*3, <material:trinium>*2])
    .build();

var schrabaquadium = MaterialBuilder(16001, "schrabaquadium")
    .ingot()
    .colorAverage()
    .blastTemp(30000)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "no_smelting", "generate_foil", "generate_fine_wire", "disable_decomposition"])
    .cableProperties(4194304, 4, 6, false) // add cables
    .components([<material:schrabidium>*4, <material:naquadah>*3])
    .build();

var scalloissine = MaterialBuilder(16002, "scalloissine")
    .ingot()
    .colorAverage()
    .blastTemp(46000)
    .components([<material:tetrisarium>*4, <material:schrabaquadium>*9, <material:polytetrafluoroethylene>*3])
    .build();

var euroschranium = MaterialBuilder(16003, "euroschranium")
    .ingot()
    .colorAverage()
    .blastTemp(34000)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "no_smelting", "generate_foil", "generate_fine_wire", "disable_decomposition"])
    .cableProperties(8388608, 4, 8, false) // add cables
    .components([<material:europium>*1, <material:schrabidium>*1])
    .build();

var stantium = MaterialBuilder(16004, "stantium")
    .ingot()
    .colorAverage()
    .blastTemp(24000)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "no_smelting", "generate_foil", "generate_fine_wire"])
    .cableProperties(6291456, 6, 24, false) // add cables
    .components([<material:xenynium>*4, <material:neptupitrium>*3, <material:aetherium>*6, <material:pyranium>*2, <material:laranium>*4])
    .build();

var superactinuranium = MaterialBuilder(16005, "superactinuranium")
    .ingot()
    .colorAverage()
    .cableProperties(8388608, 2, 4, false) // add cables
    .flags(["explosive"])
    .components([<material:uranium>*4, <material:supractinium>*5])
    .build();

var high_performance_chronotite_lunarium_quasarium_solimonium = MaterialBuilder(16006, "high_performance_chronotite_lunarium_quasarium_solimonium")
    .ingot()
    .colorAverage()
    .blastTemp(40000)
    .cableProperties(8388608, 2, 4, false) // add cables
    .components([<material:chronotite>*1, <material:lunarium>*3, <material:quasarium>*4, <material:solimonium>*2])
    .build();

var zachary = MaterialBuilder(16007, "zachary")
    .ingot()
    .colorAverage()
    .blastTemp(20000)
    .components([<material:susanium>*1, <material:etherium>*3, <material:veridium>*4, <material:ruslyium>*2, <material:laranium>*4, <material:ryneurassium>*4])
    .build();

var lignite = MaterialBuilder(16008, "lignite")
    .gem(1, 300)
    .color(0x472913)
    .components([<material:carbon>*180, <material:hydrogen>*145, <material:oxygen>*31, <material:nitrogen>*5, <material:sulfur>*1])
    .build();

var uranium_lignite = MaterialBuilder(16009, "uranium_lignite")
    .ingot()
    .colorAverage()
    .blastTemp(20000)
    .components([<material:uranium>*1, <material:lignite>*1])
    .build();

var sodium_hypochlorite = MaterialBuilder(16010, "sodium_hypochlorite")
    .fluid()
    .colorAverage()
    .components([<material:sodium>*1, <material:chlorine>*1, <material:oxygen>*1])
    .build();