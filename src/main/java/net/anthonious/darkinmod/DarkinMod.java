package net.anthonious.darkinmod;

import net.anthonious.darkinmod.block.ModBlocks;
import net.anthonious.darkinmod.block.entity.ModBlockEntities;
import net.anthonious.darkinmod.item.ModItemGroups;
import net.anthonious.darkinmod.item.ModItems;
import net.anthonious.darkinmod.screen.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DarkinMod implements ModInitializer {
	public static final String MOD_ID = "darkinmod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModScreenHandlers.registerScreenHandlers();
		ModBlockEntities.registerBlockEntities();
	}
}