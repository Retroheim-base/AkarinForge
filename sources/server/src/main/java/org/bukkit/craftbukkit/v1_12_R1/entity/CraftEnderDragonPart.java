package org.bukkit.craftbukkit.v1_12_R1.entity;

import net.minecraft.entity.MultiPartEntityPart;

import org.bukkit.craftbukkit.v1_12_R1.CraftServer;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.EnderDragonPart;
import org.bukkit.entity.Entity;

public class CraftEnderDragonPart extends CraftComplexPart implements EnderDragonPart {
    public CraftEnderDragonPart(CraftServer server, MultiPartEntityPart entity) {
        super(server, entity);
    }

    @Override
    public EnderDragon getParent() {
        return (EnderDragon) super.getParent();
    }

    @Override
    public MultiPartEntityPart getHandle() {
        return (MultiPartEntityPart) entity;
    }

    @Override
    public String toString() {
        return "CraftEnderDragonPart";
    }

    public void damage(double amount) {
        getParent().damage(amount);
    }

    public void damage(double amount, Entity source) {
        getParent().damage(amount, source);
    }

    public double getHealth() {
        return getParent().getHealth();
    }

    public void setHealth(double health) {
        getParent().setHealth(health);
    }

    public double getMaxHealth() {
        return getParent().getMaxHealth();
    }

    public void setMaxHealth(double health) {
        getParent().setMaxHealth(health);
    }

    public void resetMaxHealth() {
        getParent().resetMaxHealth();
    }
}
