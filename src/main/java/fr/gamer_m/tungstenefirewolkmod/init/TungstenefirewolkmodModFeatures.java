
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.gamer_m.tungstenefirewolkmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import fr.gamer_m.tungstenefirewolkmod.world.features.ores.TungsteneoreFeature;
import fr.gamer_m.tungstenefirewolkmod.world.features.ores.AluminiumOreFeature;
import fr.gamer_m.tungstenefirewolkmod.world.features.SwallDangonFeature;
import fr.gamer_m.tungstenefirewolkmod.world.features.InfectedCastelFeature;
import fr.gamer_m.tungstenefirewolkmod.TungstenefirewolkmodMod;

@Mod.EventBusSubscriber
public class TungstenefirewolkmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TungstenefirewolkmodMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> TUNGSTENEORE = register("tungsteneore", TungsteneoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TungsteneoreFeature.GENERATE_BIOMES, TungsteneoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ALUMINIUM_ORE = register("aluminium_ore", AluminiumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AluminiumOreFeature.GENERATE_BIOMES, AluminiumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SWALL_DANGON = register("swall_dangon", SwallDangonFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SwallDangonFeature.GENERATE_BIOMES, SwallDangonFeature::placedFeature));
	public static final RegistryObject<Feature<?>> INFECTED_CASTEL = register("infected_castel", InfectedCastelFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, InfectedCastelFeature.GENERATE_BIOMES, InfectedCastelFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
