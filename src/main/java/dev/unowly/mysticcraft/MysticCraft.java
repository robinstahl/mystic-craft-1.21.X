package dev.unowly.mysticcraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysticCraft implements ModInitializer {
	public static final String MOD_ID = "mystic-craft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("MysticCraft is initializing...");
	}
}