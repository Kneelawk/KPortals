package org.kneelawk.kportals.rule;

import org.spongepowered.api.entity.Entity;

public abstract class Rule {
	protected String name;

	public Rule(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract boolean accept(Entity e);
}
