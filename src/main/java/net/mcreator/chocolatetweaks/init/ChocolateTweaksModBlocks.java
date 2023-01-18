
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chocolatetweaks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.chocolatetweaks.block.CompressedStoneBlock;
import net.mcreator.chocolatetweaks.ChocolateTweaksMod;

public class ChocolateTweaksModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChocolateTweaksMod.MODID);
	public static final RegistryObject<Block> COMPRESSED_STONE = REGISTRY.register("compressed_stone", () -> new CompressedStoneBlock());
}
