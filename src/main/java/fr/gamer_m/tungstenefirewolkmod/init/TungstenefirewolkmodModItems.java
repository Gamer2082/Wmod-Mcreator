
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.gamer_m.tungstenefirewolkmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import fr.gamer_m.tungstenefirewolkmod.item.Vanadium_ToolsSwordItem;
import fr.gamer_m.tungstenefirewolkmod.item.Vanadium_ToolsShovelItem;
import fr.gamer_m.tungstenefirewolkmod.item.Vanadium_ToolsPickaxeItem;
import fr.gamer_m.tungstenefirewolkmod.item.Vanadium_ToolsHoeItem;
import fr.gamer_m.tungstenefirewolkmod.item.Vanadium_ToolsAxeItem;
import fr.gamer_m.tungstenefirewolkmod.item.Vanadium_ArmorArmorItem;
import fr.gamer_m.tungstenefirewolkmod.item.VanadiumItem;
import fr.gamer_m.tungstenefirewolkmod.item.TungstenehammerItem;
import fr.gamer_m.tungstenefirewolkmod.item.Tungstene_toolsSwordItem;
import fr.gamer_m.tungstenefirewolkmod.item.Tungstene_toolsShovelItem;
import fr.gamer_m.tungstenefirewolkmod.item.Tungstene_toolsPickaxeItem;
import fr.gamer_m.tungstenefirewolkmod.item.Tungstene_toolsHoeItem;
import fr.gamer_m.tungstenefirewolkmod.item.Tungstene_toolsAxeItem;
import fr.gamer_m.tungstenefirewolkmod.item.Tungstene_armorArmorItem;
import fr.gamer_m.tungstenefirewolkmod.item.TungsteneItem;
import fr.gamer_m.tungstenefirewolkmod.item.RichSToneItem;
import fr.gamer_m.tungstenefirewolkmod.item.PowerstoneItem;
import fr.gamer_m.tungstenefirewolkmod.item.PepiteDeVanadiumItem;
import fr.gamer_m.tungstenefirewolkmod.item.HealStoneItem;
import fr.gamer_m.tungstenefirewolkmod.item.DefaultStoneItem;
import fr.gamer_m.tungstenefirewolkmod.item.CoinItem;
import fr.gamer_m.tungstenefirewolkmod.item.AluminiumSwordItem;
import fr.gamer_m.tungstenefirewolkmod.item.AluminiumShovelItem;
import fr.gamer_m.tungstenefirewolkmod.item.AluminiumPickaxeItem;
import fr.gamer_m.tungstenefirewolkmod.item.AluminiumIngotItem;
import fr.gamer_m.tungstenefirewolkmod.item.AluminiumHoeItem;
import fr.gamer_m.tungstenefirewolkmod.item.AluminiumAxeItem;
import fr.gamer_m.tungstenefirewolkmod.item.AluminiumArmorItem;
import fr.gamer_m.tungstenefirewolkmod.item.AlluminiumhammerItem;
import fr.gamer_m.tungstenefirewolkmod.item.AdminSwordItem;
import fr.gamer_m.tungstenefirewolkmod.TungstenefirewolkmodMod;

public class TungstenefirewolkmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TungstenefirewolkmodMod.MODID);
	public static final RegistryObject<Item> TUNGSTENEBLOXC = block(TungstenefirewolkmodModBlocks.TUNGSTENEBLOXC, TungstenefirewolkmodModTabs.TAB_TUNGSTENEDECO);
	public static final RegistryObject<Item> TUNGSTENEORE = block(TungstenefirewolkmodModBlocks.TUNGSTENEORE, TungstenefirewolkmodModTabs.TAB_TUNGSTENEDECO);
	public static final RegistryObject<Item> TUNGSTENE = REGISTRY.register("tungstene", () -> new TungsteneItem());
	public static final RegistryObject<Item> TUNGSTENE_ARMOR_ARMOR_HELMET = REGISTRY.register("tungstene_armor_armor_helmet", () -> new Tungstene_armorArmorItem.Helmet());
	public static final RegistryObject<Item> TUNGSTENE_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("tungstene_armor_armor_chestplate", () -> new Tungstene_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> TUNGSTENE_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("tungstene_armor_armor_leggings", () -> new Tungstene_armorArmorItem.Leggings());
	public static final RegistryObject<Item> TUNGSTENE_ARMOR_ARMOR_BOOTS = REGISTRY.register("tungstene_armor_armor_boots", () -> new Tungstene_armorArmorItem.Boots());
	public static final RegistryObject<Item> TUNGSTENE_TOOLS_PICKAXE = REGISTRY.register("tungstene_tools_pickaxe", () -> new Tungstene_toolsPickaxeItem());
	public static final RegistryObject<Item> TUNGSTENE_TOOLS_AXE = REGISTRY.register("tungstene_tools_axe", () -> new Tungstene_toolsAxeItem());
	public static final RegistryObject<Item> TUNGSTENE_TOOLS_SWORD = REGISTRY.register("tungstene_tools_sword", () -> new Tungstene_toolsSwordItem());
	public static final RegistryObject<Item> TUNGSTENE_TOOLS_SHOVEL = REGISTRY.register("tungstene_tools_shovel", () -> new Tungstene_toolsShovelItem());
	public static final RegistryObject<Item> TUNGSTENE_TOOLS_HOE = REGISTRY.register("tungstene_tools_hoe", () -> new Tungstene_toolsHoeItem());
	public static final RegistryObject<Item> TUNGSTENEHAMMER = REGISTRY.register("tungstenehammer", () -> new TungstenehammerItem());
	public static final RegistryObject<Item> ALUMINIUM_INGOT = REGISTRY.register("aluminium_ingot", () -> new AluminiumIngotItem());
	public static final RegistryObject<Item> ALUMINIUM_ORE = block(TungstenefirewolkmodModBlocks.ALUMINIUM_ORE, TungstenefirewolkmodModTabs.TAB_TUNGSTENEDECO);
	public static final RegistryObject<Item> ALUMINIUM_BLOCK = block(TungstenefirewolkmodModBlocks.ALUMINIUM_BLOCK, TungstenefirewolkmodModTabs.TAB_TUNGSTENEDECO);
	public static final RegistryObject<Item> ALUMINIUM_PICKAXE = REGISTRY.register("aluminium_pickaxe", () -> new AluminiumPickaxeItem());
	public static final RegistryObject<Item> ALUMINIUM_AXE = REGISTRY.register("aluminium_axe", () -> new AluminiumAxeItem());
	public static final RegistryObject<Item> ALUMINIUM_SWORD = REGISTRY.register("aluminium_sword", () -> new AluminiumSwordItem());
	public static final RegistryObject<Item> ALUMINIUM_SHOVEL = REGISTRY.register("aluminium_shovel", () -> new AluminiumShovelItem());
	public static final RegistryObject<Item> ALUMINIUM_HOE = REGISTRY.register("aluminium_hoe", () -> new AluminiumHoeItem());
	public static final RegistryObject<Item> ALUMINIUM_ARMOR_HELMET = REGISTRY.register("aluminium_armor_helmet", () -> new AluminiumArmorItem.Helmet());
	public static final RegistryObject<Item> ALUMINIUM_ARMOR_CHESTPLATE = REGISTRY.register("aluminium_armor_chestplate", () -> new AluminiumArmorItem.Chestplate());
	public static final RegistryObject<Item> ALUMINIUM_ARMOR_LEGGINGS = REGISTRY.register("aluminium_armor_leggings", () -> new AluminiumArmorItem.Leggings());
	public static final RegistryObject<Item> ALUMINIUM_ARMOR_BOOTS = REGISTRY.register("aluminium_armor_boots", () -> new AluminiumArmorItem.Boots());
	public static final RegistryObject<Item> ALLUMINIUMHAMMER = REGISTRY.register("alluminiumhammer", () -> new AlluminiumhammerItem());
	public static final RegistryObject<Item> NEONBLOC = block(TungstenefirewolkmodModBlocks.NEONBLOC, TungstenefirewolkmodModTabs.TAB_TUNGSTENEDECO);
	public static final RegistryObject<Item> POWERSTONE = REGISTRY.register("powerstone", () -> new PowerstoneItem());
	public static final RegistryObject<Item> ALUMINIUMCOLOREROUGE = block(TungstenefirewolkmodModBlocks.ALUMINIUMCOLOREROUGE, TungstenefirewolkmodModTabs.TAB_TUNGSTENEDECO);
	public static final RegistryObject<Item> ALUGRIS = block(TungstenefirewolkmodModBlocks.ALUGRIS, TungstenefirewolkmodModTabs.TAB_TUNGSTENEDECO);
	public static final RegistryObject<Item> COIN = REGISTRY.register("coin", () -> new CoinItem());
	public static final RegistryObject<Item> FIRESKELETONBOSSFLEAU_SPAWN_EGG = REGISTRY.register("fireskeletonbossfleau_spawn_egg",
			() -> new ForgeSpawnEggItem(TungstenefirewolkmodModEntities.FIRESKELETONBOSSFLEAU, -13421773, -1, new Item.Properties().tab(TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD)));
	public static final RegistryObject<Item> HEAL_STONE = REGISTRY.register("heal_stone", () -> new HealStoneItem());
	public static final RegistryObject<Item> RICH_S_TONE = REGISTRY.register("rich_s_tone", () -> new RichSToneItem());
	public static final RegistryObject<Item> DEFAULT_STONE = REGISTRY.register("default_stone", () -> new DefaultStoneItem());
	public static final RegistryObject<Item> AIRSOLID = block(TungstenefirewolkmodModBlocks.AIRSOLID, TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD);
	public static final RegistryObject<Item> SOLID_AIRBLOCK = block(TungstenefirewolkmodModBlocks.SOLID_AIRBLOCK, TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD);
	public static final RegistryObject<Item> VANADIUM_BLOCK = block(TungstenefirewolkmodModBlocks.VANADIUM_BLOCK, TungstenefirewolkmodModTabs.TAB_TUNGSTENEDECO);
	public static final RegistryObject<Item> VANADIUM = REGISTRY.register("vanadium", () -> new VanadiumItem());
	public static final RegistryObject<Item> PEPITE_DE_VANADIUM = REGISTRY.register("pepite_de_vanadium", () -> new PepiteDeVanadiumItem());
	public static final RegistryObject<Item> VANADIUM_ARMOR_ARMOR_HELMET = REGISTRY.register("vanadium_armor_armor_helmet", () -> new Vanadium_ArmorArmorItem.Helmet());
	public static final RegistryObject<Item> VANADIUM_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("vanadium_armor_armor_chestplate", () -> new Vanadium_ArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> VANADIUM_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("vanadium_armor_armor_leggings", () -> new Vanadium_ArmorArmorItem.Leggings());
	public static final RegistryObject<Item> VANADIUM_ARMOR_ARMOR_BOOTS = REGISTRY.register("vanadium_armor_armor_boots", () -> new Vanadium_ArmorArmorItem.Boots());
	public static final RegistryObject<Item> VANADIUM_TOOLS_PICKAXE = REGISTRY.register("vanadium_tools_pickaxe", () -> new Vanadium_ToolsPickaxeItem());
	public static final RegistryObject<Item> VANADIUM_TOOLS_AXE = REGISTRY.register("vanadium_tools_axe", () -> new Vanadium_ToolsAxeItem());
	public static final RegistryObject<Item> VANADIUM_TOOLS_SWORD = REGISTRY.register("vanadium_tools_sword", () -> new Vanadium_ToolsSwordItem());
	public static final RegistryObject<Item> VANADIUM_TOOLS_SHOVEL = REGISTRY.register("vanadium_tools_shovel", () -> new Vanadium_ToolsShovelItem());
	public static final RegistryObject<Item> VANADIUM_TOOLS_HOE = REGISTRY.register("vanadium_tools_hoe", () -> new Vanadium_ToolsHoeItem());
	public static final RegistryObject<Item> NEON_BARRE = block(TungstenefirewolkmodModBlocks.NEON_BARRE, TungstenefirewolkmodModTabs.TAB_TUNGSTENEDECO);
	public static final RegistryObject<Item> AUTHER_SPAWN_EGG = REGISTRY.register("auther_spawn_egg", () -> new ForgeSpawnEggItem(TungstenefirewolkmodModEntities.AUTHER, -16777216, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ADMIN_SWORD = REGISTRY.register("admin_sword", () -> new AdminSwordItem());
	public static final RegistryObject<Item> FRIEND_SPAWN_EGG = REGISTRY.register("friend_spawn_egg", () -> new ForgeSpawnEggItem(TungstenefirewolkmodModEntities.FRIEND, -1, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
