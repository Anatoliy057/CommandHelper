package com.laytonsmith.abstraction.entities;

import com.laytonsmith.abstraction.MCLivingEntity;

public interface MCZombie extends MCLivingEntity {

	boolean isBaby();

	void setBaby(boolean isBaby);

	boolean canBreakDoors();

	void setCanBreakDoors(boolean canBreakDoors);
}
