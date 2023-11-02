package net.matsulen.lkartifacts.util;

import net.matsulen.lkartifacts.LKArtifacts;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(LKArtifacts.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> IRON_SICKLE_TAG = tag("iron_sickle");
        public static final TagKey<Item> NORMAL_ITEM_TAG = tag("normal_item");
        public static final TagKey<Item> IRON_BLADE_TAG = tag("iron_blade");
        public static final TagKey<Item> BAYSWORD_TAG = tag("baysword");
        public static final TagKey<Item> SPARE_TAG = tag("spare");
        public static final TagKey<Item> CAMP_FIRE_SWORD_TAG = tag("camp_fire_sword");
        public static final TagKey<Item> DRAGON_TEAR_TAG = tag("dragon_tear");
        public static final TagKey<Item> SOUL_FIRE_TAG = tag("soul_fire");
        public static final TagKey<Item> MEAT_KNIFE_TAG = tag("meat_knife");
        public static final TagKey<Item> HORN_OF_GOAT_TAG = tag("horn_of_goat");
        public static final TagKey<Item> EFFECTED_SWORD_TAG = tag("effected_sword");
        public static final TagKey<Item> KNIGHT_HORNOR_TAG = tag("knight_hornor");
        public static final TagKey<Item> SAMON_SWORD_TAG = tag("samon_sword");
        public static final TagKey<Item> TOTEM_SWORD_TAG = tag("totem_sword");
        public static final TagKey<Item> ROUND_SWORD_TAG = tag("round_sword");
        public static final TagKey<Item> SHAPED_AMETHYST_TAG = tag("shaped_amethyst");
        public static final TagKey<Item> FLINT_HAND_TAG = tag("flint_hand");
        public static final TagKey<Item> LAVA_SWORD_TAG = tag("lava_sword");
        public static final TagKey<Item> WITHER_SWORD_TAG = tag("wither_sword");
        public static final TagKey<Item> KING_AXE_TAG = tag("king_axe");
        public static final TagKey<Item> STORM_AXE_TAG = tag("storm_axe");
        public static final TagKey<Item> BIG_FIRED_CHICKEN_TAG = tag("big_fired_chicken");
        public static final TagKey<Item> GOLDEN_SPEAR_TAG = tag("golden_spear");
        public static final TagKey<Item> BAMBOO_SWORD_TAG = tag("bamboo_sword");
        public static final TagKey<Item> LANTERN_SWORD_TAG = tag("lantern_sword");



        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(LKArtifacts.MOD_ID, name));
        }
    }
}