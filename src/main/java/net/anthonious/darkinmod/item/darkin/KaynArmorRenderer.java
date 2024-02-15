package net.anthonious.darkinmod.item.darkin;

import software.bernie.example.item.GeckoArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class KaynArmorRenderer extends GeoArmorRenderer<KaynArmorItem> {

    public KaynArmorRenderer() {
        super(new KaynArmorModel());
    }
}