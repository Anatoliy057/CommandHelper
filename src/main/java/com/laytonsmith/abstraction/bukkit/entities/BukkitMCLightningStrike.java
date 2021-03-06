package com.laytonsmith.abstraction.bukkit.entities;

import com.laytonsmith.abstraction.entities.MCLightningStrike;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LightningStrike;

public class BukkitMCLightningStrike extends BukkitMCEntity implements MCLightningStrike {

	LightningStrike ls;

	public BukkitMCLightningStrike(Entity ls) {
		super(ls);
		this.ls = (LightningStrike) ls;
	}

	@Override
	public boolean isEffect() {
		return ls.isEffect();
	}
}
