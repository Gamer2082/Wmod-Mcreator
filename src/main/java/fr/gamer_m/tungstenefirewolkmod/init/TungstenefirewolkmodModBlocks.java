
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.gamer_m.tungstenefirewolkmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import fr.gamer_m.tungstenefirewolkmod.block.VanadiumBlockBlock;
import fr.gamer_m.tungstenefirewolkmod.block.TungsteneoreBlock;
import fr.gamer_m.tungstenefirewolkmod.block.TungstenebloxcBlock;
import fr.gamer_m.tungstenefirewolkmod.block.SolidAirblockBlock;
import fr.gamer_m.tungstenefirewolkmod.block.NeonblocBlock;
import fr.gamer_m.tungstenefirewolkmod.block.NeonBarreBlock;
import fr.gamer_m.tungstenefirewolkmod.block.AluminiumcolorerougeBlock;
import fr.gamer_m.tungstenefirewolkmod.block.AluminiumOreBlock;
import fr.gamer_m.tungstenefirewolkmod.block.AluminiumBlockBlock;
import fr.gamer_m.tungstenefirewolkmod.block.AlugrisBlock;
import fr.gamer_m.tungstenefirewolkmod.block.AirsolidBlock;
import fr.gamer_m.tungstenefirewolkmod.TungstenefirewolkmodMod;

public class TungstenefirewolkmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TungstenefirewolkmodMod.MODID);
	public static final RegistryObject<Block> TUNGSTENEBLOXC = REGISTRY.register("tungstenebloxc", () -> new TungstenebloxcBlock());
	public static final RegistryObject<Block> TUNGSTENEORE = REGISTRY.register("tungsteneore", () -> new TungsteneoreBlock());
	public static final RegistryObject<Block> ALUMINIUM_ORE = REGISTRY.register("aluminium_ore", () -> new AluminiumOreBlock());
	public static final RegistryObject<Block> ALUMINIUM_BLOCK = REGISTRY.register("aluminium_block", () -> new AluminiumBlockBlock());
	public static final RegistryObject<Block> NEONBLOC = REGISTRY.register("neonbloc", () -> new NeonblocBlock());
	public static final RegistryObject<Block> ALUMINIUMCOLOREROUGE = REGISTRY.register("aluminiumcolorerouge", () -> new AluminiumcolorerougeBlock());
	public static final RegistryObject<Block> ALUGRIS = REGISTRY.register("alugris", () -> new AlugrisBlock());
	public static final RegistryObject<Block> AIRSOLID = REGISTRY.register("airsolid", () -> new AirsolidBlock());
	public static final RegistryObject<Block> SOLID_AIRBLOCK = REGISTRY.register("solid_airblock", () -> new SolidAirblockBlock());
	public static final RegistryObject<Block> VANADIUM_BLOCK = REGISTRY.register("vanadium_block", () -> new VanadiumBlockBlock());
	public static final RegistryObject<Block> NEON_BARRE = REGISTRY.register("neon_barre", () -> new NeonBarreBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			NeonBarreBlock.registerRenderLayer();
		}
	}
}
