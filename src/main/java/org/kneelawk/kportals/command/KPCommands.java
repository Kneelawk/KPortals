package org.kneelawk.kportals.command;

import org.kneelawk.kportals.KPortals;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.text.Text;

public class KPCommands {
	public static void init() {
		CommandSpec rules = CommandSpec.builder().description(Text.of("Opens a test gui"))
				.permission("kportals.command.rules").executor(new RulesCommandExecutor()).build();

		CommandSpec kportals = CommandSpec.builder().description(Text.of("KPortals control command"))
				.child(rules, "rules").build();

		Sponge.getCommandManager().register(KPortals.getInstance(), kportals, "kportals", "kportal", "kp");
	}
}
