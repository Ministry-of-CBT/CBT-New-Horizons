import gregtech.api.unification.material.event.MaterialEvent;
import gregtech.api.unification.material.Material;

event_manager.listen { MaterialEvent event -> 
    def dendrimer21 = new  Material.Builder(32000, resource("cbtnh", "dendrimer_twenty_one"))
            .dust()
            .color(0x141414)
            .build();

}
