package net.anthonious.darkinmod.item.darkin;

import net.anthonious.darkinmod.DarkinMod;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class KaynArmorModel extends GeoModel<KaynArmorItem> {
    @Override
    public Identifier getModelResource(KaynArmorItem animatable) {
        return new Identifier(DarkinMod.MOD_ID, "geo/kayn_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(KaynArmorItem animatable) {
        return new Identifier(DarkinMod.MOD_ID, "textures/armor/kayn_armor.png");
    }

    @Override
    public Identifier getAnimationResource(KaynArmorItem animatable) {
        return new Identifier(DarkinMod.MOD_ID, "animations/kayn_armor.animation.json");
    }
}
