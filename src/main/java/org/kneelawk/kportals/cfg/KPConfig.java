package org.kneelawk.kportals.cfg;

import java.io.IOException;

import org.kneelawk.kportals.log.KPLog;

import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;

public class KPConfig {
	private static ConfigurationLoader<CommentedConfigurationNode> loader;
	private static CommentedConfigurationNode root;

	public static void init(
			ConfigurationLoader<CommentedConfigurationNode> loader) {
		KPConfig.loader = loader;
		try {
			root = loader.load();
		} catch (IOException e) {
			KPLog.error("Error loading config!", e);
		}
	}

	public static void save() {
		try {
			loader.save(root);
		} catch (IOException e) {
			KPLog.error("Error saving config!", e);
		}
	}
}
