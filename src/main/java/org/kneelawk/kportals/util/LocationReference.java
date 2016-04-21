package org.kneelawk.kportals.util;

import java.util.Optional;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

public class LocationReference {
	private int x, y, z;
	private String world;

	public LocationReference(int x, int y, int z, String world) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.world = world;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public String getWorld() {
		return world;
	}

	public void setWorld(String world) {
		this.world = world;
	}

	public Optional<Location<World>> toLocation() {
		return Sponge.getServer().getWorld(world)
				.map(w -> new Location<World>(w, x, y, z));
	}

	public static LocationReference fromLocation(Location<World> loc) {
		return new LocationReference(loc.getBlockX(), loc.getBlockY(),
				loc.getBlockZ(), loc.getExtent().getName());
	}
}
