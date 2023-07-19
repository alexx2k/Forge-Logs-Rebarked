package com.alex2k.rebarked.util;

import com.alex2k.rebarked.Rebarked;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public static class Items {
        public static final TagKey<Item> BARK
                = tag("bark");


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Rebarked.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}