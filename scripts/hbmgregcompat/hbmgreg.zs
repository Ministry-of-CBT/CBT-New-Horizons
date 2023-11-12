#loader gregtech
#priority 100

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

var schrabidium_trisulfide = MaterialBuilder(28201, "schrabidium_trisulfide")
    .ingot()
    .fluid()
    .colorAverage()
    .components([<material:schrabidium>*1, <material:sulfur>*3])
    .build();

var schrabidate = MaterialBuilder(28202, "schrabidate")
    .ingot()
    .colorAverage()
    .components([<material:schrabidium>*1, <material:iron>*1])
    .build();

var schraranium = MaterialBuilder(28203, "schraranium")
    .ingot()
    .colorAverage()
    .components([<material:schrabidium>*1, <material:uranium>*1])
    .build();

var red_phosphorus = MaterialBuilder(28204, "red_phosphorus")
    .ingot()
    .colorAverage()
    .components([<material:phosphorus>*4])
    .build();

var dura_steel = MaterialBuilder(28205, "dura_steel")
    .ingot()
    .colorAverage()
    .components([<material:iron>*1, <material:cobalt>*1])
    .build();

var meteorite = MaterialBuilder(28206, "meteorite")
    .dust()
    .colorAverage()
    .components([<material:iron>*1, <material:copper>*1, <material:lithium>*1, <material:tungsten>*1, <material:uranium>*1])
    .build();

var saturnite = MaterialBuilder(28207, "saturnite")
    .ingot()
    .colorAverage()
    .components([<material:dura_steel>*1, <material:red_phosphorus>*1])
    .build();

var starmetal = MaterialBuilder(28208, "starmetal")
    .ingot()
    .colorAverage()
    .components([<material:meteorite>*1, <material:saturnite>*1])
    .build();