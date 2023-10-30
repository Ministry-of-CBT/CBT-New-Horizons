#loader gregtech
#priority 900

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

var polymultischrabaquadallastantarium = MaterialBuilder(24000, "polymultischrabaquadallastantarium")
    .ingot()
    .colorAverage()
    .blastTemp(34000)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "no_smelting", "generate_foil", "generate_fine_wire"])
    .cableProperties(16777216, 16, 0, true) // add cables
    .components([<material:trinaquadalloy>*1, <material:euroschranium>*3, <material:quasarium>*2, <material:stantium>*1])
    .build();