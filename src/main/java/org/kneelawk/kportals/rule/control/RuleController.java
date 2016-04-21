package org.kneelawk.kportals.rule.control;

import org.kneelawk.kportals.rule.Rule;
import org.spongepowered.api.data.DataView;

public interface RuleController<R extends Rule> {
	public abstract R constructRule(DataView data); // TODO add constructor
													// arguments

	public abstract void editRule(R rule, String operation, DataView data); // TODO
																			// add
																			// editor
																			// arguments
}
