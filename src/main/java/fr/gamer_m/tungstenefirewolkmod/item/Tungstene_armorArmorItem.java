
package fr.gamer_m.tungstenefirewolkmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import fr.gamer_m.tungstenefirewolkmod.init.TungstenefirewolkmodModTabs;
import fr.gamer_m.tungstenefirewolkmod.init.TungstenefirewolkmodModItems;

public abstract class Tungstene_armorArmorItem extends ArmorItem {
	public Tungstene_armorArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 75;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{10, 30, 25, 10}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 45;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TungstenefirewolkmodModItems.TUNGSTENE.get()));
			}

			@Override
			public String getName() {
				return "tungstene_armor_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends Tungstene_armorArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tungstenefirewolkmod:textures/models/armor/tunsteneoarmor_layer_1.png";
		}
	}

	public static class Chestplate extends Tungstene_armorArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tungstenefirewolkmod:textures/models/armor/tunsteneoarmor_layer_1.png";
		}
	}

	public static class Leggings extends Tungstene_armorArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tungstenefirewolkmod:textures/models/armor/tunsteneoarmor_layer_2.png";
		}
	}

	public static class Boots extends Tungstene_armorArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(TungstenefirewolkmodModTabs.TAB_TUNGSTENEMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tungstenefirewolkmod:textures/models/armor/tunsteneoarmor_layer_1.png";
		}
	}
}