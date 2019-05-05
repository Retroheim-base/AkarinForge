/*
 * Akarin Forge
 */
package org.bukkit.craftbukkit.v1_12_R1.entity;

import org.bukkit.craftbukkit.v1_12_R1.CraftServer;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftMonster;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Giant;

public class CraftGiant
extends CraftMonster
implements Giant {
    public CraftGiant(CraftServer server, acz entity) {
        super(server, entity);
    }

    @Override
    public acz getHandle() {
        return (acz)this.entity;
    }

    @Override
    public String toString() {
        return "CraftGiant";
    }

    @Override
    public EntityType getType() {
        return EntityType.GIANT;
    }
}
