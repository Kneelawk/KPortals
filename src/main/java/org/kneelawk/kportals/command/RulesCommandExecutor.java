package org.kneelawk.kportals.command;

import org.kneelawk.kportals.KPortals;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.item.inventory.Inventory;
import org.spongepowered.api.text.Text;

public class RulesCommandExecutor implements CommandExecutor {

	@Override
	public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
		if (src instanceof Player) {
			Player player = (Player) src;
			Inventory test = Inventory.builder().build(KPortals.getInstance());
		} else {
			src.sendMessage(Text.of("You must be a player to use the rulse gui"));
			return CommandResult.empty();
		}
		return null;
	}
}
