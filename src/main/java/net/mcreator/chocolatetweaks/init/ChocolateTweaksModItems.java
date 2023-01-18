
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chocolatetweaks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.chocolatetweaks.item.StrawMeshItem;
import net.mcreator.chocolatetweaks.item.StoneHammerItem;
import net.mcreator.chocolatetweaks.item.SledgehammerItem;
import net.mcreator.chocolatetweaks.item.NetheriteHammerItem;
import net.mcreator.chocolatetweaks.item.IronHammerItem;
import net.mcreator.chocolatetweaks.item.IronDustItem;
import net.mcreator.chocolatetweaks.item.DiamondHammerItem;
import net.mcreator.chocolatetweaks.ChocolateTweaksMod;

public class ChocolateTweaksModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChocolateTweaksMod.MODID);
	public static final RegistryObject<Item> STONE_HAMMER = REGISTRY.register("stone_hammer", () -> new StoneHammerItem());
	public static final RegistryObject<Item> COMPRESSED_STONE = block(ChocolateTweaksModBlocks.COMPRESSED_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> IRON_DUST = REGISTRY.register("iron_dust", () -> new IronDustItem());
	public static final RegistryObject<Item> IRON_HAMMER = REGISTRY.register("iron_hammer", () -> new IronHammerItem());
	public static final RegistryObject<Item> DIAMOND_HAMMER = REGISTRY.register("diamond_hammer", () -> new DiamondHammerItem());
	public static final RegistryObject<Item> NETHERITE_HAMMER = REGISTRY.register("netherite_hammer", () -> new NetheriteHammerItem());
	public static final RegistryObject<Item> STRAW_MESH = REGISTRY.register("straw_mesh", () -> new StrawMeshItem());
	public static final RegistryObject<Item> SLEDGEHAMMER = REGISTRY.register("sledgehammer", () -> new SledgehammerItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
