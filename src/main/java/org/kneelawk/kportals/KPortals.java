package org.kneelawk.kportals;

import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;

import org.kneelawk.kportals.cfg.KPConfig;
import org.kneelawk.kportals.log.KPLog;
import org.slf4j.Logger;
import org.spongepowered.api.config.DefaultConfig;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GameStoppingEvent;
import org.spongepowered.api.plugin.Plugin;

import com.google.inject.Inject;

@Plugin(id = "org.kneelawk.kportals", name = "KPortals", version = "0.0.1-SNAPSHOT", description = "A sponge plugin for survival based teleportation")
public class KPortals {
	private static KPortals instance;

	@Inject
	@DefaultConfig(sharedRoot = true)
	private ConfigurationLoader<CommentedConfigurationNode> loader;

	public KPortals() {
		instance = this;
	}

	@Inject
	private void setLogger(Logger log) {
		KPLog.init(log);
		KPConfig.init(loader);
	}

	@Listener
	public void init(GameInitializationEvent event) {
		KPLog.info("Init KPortals");
	}

	@Listener
	public void stop(GameStoppingEvent event) {
		KPLog.info("Stopping KPortals");
		KPConfig.save();
	}

	public static KPortals getInstance() {
		return instance;
	}
}
