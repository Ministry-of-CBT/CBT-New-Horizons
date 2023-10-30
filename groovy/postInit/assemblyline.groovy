import gregtech.recipes.builders.*

def assembly_line = mods.gregtech.assembly_line

// World Accelerator HV
mods.gregtech.assembly_line.recipeBuilder()
    .inputs(metaitem('hull.luv'), metaitem('field.generator.luv') * 64, metaitem('field.generator.luv') * 16, metaitem('sensor.luv') * 20, metaitem('emitter.luv') * 20, ore('circuitLuv') * 16, metaitem('plateDoubleIridium') * 4, metaitem('plateDenseDraconium') * 2)
    .fluidInputs(fluid('soldering_alloy') * 1152, fluid('enderium') * 1152)
    .outputs(metaitem('world_accelerator.hv'))
    .stationResearch(b -> b.researchStack(item('minecraft:clock')).CWUt(4))
    .duration(6000).EUt(30720)
    .buildAndRegister()