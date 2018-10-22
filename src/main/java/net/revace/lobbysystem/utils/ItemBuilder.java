package net.revace.lobbysystem.utils;

// Plugin by qRyze³ \\
//
//  Minecraft Server: MineRed.eu \\
//
// Datum: 21.10.2018 \\

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;

public class ItemBuilder {

    private ItemStack is;
    private ItemMeta meta;
    private SkullMeta skullmeta;

    public ItemBuilder(Material material, int amount, byte shortId) {
        this.is = new ItemStack(material, amount, shortId);
        this.meta = is.getItemMeta();
        this.skullmeta = (SkullMeta) is.getItemMeta();
    }

    public ItemBuilder setDisplayname(String name) {
        this.meta.setDisplayName(name);
        this.skullmeta.setDisplayName(name);
        return this;
    }

    public ItemBuilder setLore(String ...name) {
        this.meta.setLore(Arrays.asList(name));
        this.skullmeta.setLore(Arrays.asList(name));
        return this;
    }

    public ItemBuilder setOwner(String name){
        this.skullmeta.setOwner(name);
        return this;
    }

    public ItemStack build() {
        if(this.skullmeta.getOwner() == null) {
            this.is.setItemMeta(skullmeta);
        } else {
            this.is.setItemMeta(this.meta);
        }
        return this.is;
    }

}
