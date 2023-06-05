
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.gamer_m.tungstenefirewolkmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import fr.gamer_m.tungstenefirewolkmod.entity.FireskeletonbossfleauEntity;
import fr.gamer_m.tungstenefirewolkmod.entity.FRIENDEntity;
import fr.gamer_m.tungstenefirewolkmod.entity.AutherEntity;
import fr.gamer_m.tungstenefirewolkmod.TungstenefirewolkmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TungstenefirewolkmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, TungstenefirewolkmodMod.MODID);
	public static final RegistryObject<EntityType<FireskeletonbossfleauEntity>> FIRESKELETONBOSSFLEAU = register("fireskeletonbossfleau", EntityType.Builder.<FireskeletonbossfleauEntity>of(FireskeletonbossfleauEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireskeletonbossfleauEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<AutherEntity>> AUTHER = register("auther",
			EntityType.Builder.<AutherEntity>of(AutherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AutherEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FRIENDEntity>> FRIEND = register("friend",
			EntityType.Builder.<FRIENDEntity>of(FRIENDEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FRIENDEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FireskeletonbossfleauEntity.init();
			AutherEntity.init();
			FRIENDEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FIRESKELETONBOSSFLEAU.get(), FireskeletonbossfleauEntity.createAttributes().build());
		event.put(AUTHER.get(), AutherEntity.createAttributes().build());
		event.put(FRIEND.get(), FRIENDEntity.createAttributes().build());
	}
}
