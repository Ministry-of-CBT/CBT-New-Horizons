#loader gregtech
#priority 999

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

var voralite = MaterialBuilder(13000, "voralite")
    .ingot()
    .colorAverage()
    .blastTemp(20000)
    .cableProperties(8388608, 2, 4, false) // add cables
    .components([<material:susanium>*4, <material:trinium>*3, <material:naquadasson>*2, <material:jadynomium>*5, <material:supractinium>*1])
    .ore()
    .build();

var scallite = MaterialBuilder(13001, "scallite")
    .ingot()
    .colorAverage()
    .blastTemp(20000)
    .cableProperties(8388608, 2, 4, false) // add cables
    .components([<material:euronium>*6, <material:yrattasium>*2, <material:runevaline>*3, <material:dithermonium>*4])
    .ore()
    .washedIn(<material:schrabidium>, 1024)
    .addOreByproducts(<material:dylantrum>)
    .separatedInto(<material:euronium>, <material:dithermonium>)
    .build();

var dinatite = MaterialBuilder(13002, "dinatite")
    .ingot()
    .colorAverage()
    .blastTemp(20000)
    .cableProperties(8388608, 2, 4, false) // add cables
    .components([<material:dithermonium>*4, <material:krassium>*4, <material:prassoppurium>*4, <material:quintessium>*4, <material:chronotite>*4])
    .ore()
    .washedIn(<material:schrabidium>, 1024)
    .addOreByproducts(<material:aetherium>)
    .separatedInto(<material:quasarium>, <material:lunarium>)
    .build();