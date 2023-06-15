package overwhelmed.overwhelmed;

import com.google.common.base.Suppliers;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.Level;
import overwhelmed.overwhelmed.client.renderer.entity.SnailRenderer;
import overwhelmed.overwhelmed.world.entity.animal.SnailEntity;

import java.util.function.Supplier;

public class Overwhelmed
{
	public static final String MOD_ID = "overwhelmed";

	public static final Supplier<RegistrarManager> MANAGER = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));
	public static Registrar<EntityType<?>> entityTypes;
	public static RegistrySupplier<EntityType<SnailEntity>> gardenSnailEntityType;
	public static RegistrySupplier<EntityType<SnailEntity>> garySnailEntityType;
	public static RegistrySupplier<EntityType<SnailEntity>> limestoneSnailEntityType;
	public static RegistrySupplier<EntityType<SnailEntity>> romanSnailEntityType;

	public static void init() {
		entityTypes = MANAGER.get().get(Registries.ENTITY_TYPE);

		gardenSnailEntityType = entityTypes.register(new ResourceLocation(MOD_ID, "snail"), () ->
				EntityType.Builder.of((EntityType<SnailEntity> entityType, Level level) ->
								new SnailEntity(entityType, level, SnailEntity.Variant.GARDEN), MobCategory.CREATURE)
						.sized(0.6f, 0.4f)
						.clientTrackingRange(8)
						.build("garden_snail"));
		garySnailEntityType = entityTypes.register(new ResourceLocation(MOD_ID, "snail"), () ->
				EntityType.Builder.of((EntityType<SnailEntity> entityType, Level level) ->
								new SnailEntity(entityType, level, SnailEntity.Variant.GARY), MobCategory.CREATURE)
						.sized(0.6f, 0.4f)
						.clientTrackingRange(8)
						.build("gary_snail"));
		limestoneSnailEntityType = entityTypes.register(new ResourceLocation(MOD_ID, "snail"), () ->
				EntityType.Builder.of((EntityType<SnailEntity> entityType, Level level) ->
								new SnailEntity(entityType, level, SnailEntity.Variant.LIMESTONE), MobCategory.CREATURE)
						.sized(0.6f, 0.4f)
						.clientTrackingRange(8)
						.build("limestone_snail"));
		romanSnailEntityType = entityTypes.register(new ResourceLocation(MOD_ID, "snail"), () ->
				EntityType.Builder.of((EntityType<SnailEntity> entityType, Level level) ->
								new SnailEntity(entityType, level, SnailEntity.Variant.GARDEN), MobCategory.CREATURE)
						.sized(0.6f, 0.4f)
						.clientTrackingRange(8)
						.build("roman_snail"));

		EntityAttributeRegistry.register(gardenSnailEntityType, SnailEntity::createAttributes);
		EntityRendererRegistry.register(gardenSnailEntityType, SnailRenderer::new);
		EntityAttributeRegistry.register(garySnailEntityType, SnailEntity::createAttributes);
		EntityRendererRegistry.register(garySnailEntityType, SnailRenderer::new);
		EntityAttributeRegistry.register(limestoneSnailEntityType, SnailEntity::createAttributes);
		EntityRendererRegistry.register(limestoneSnailEntityType, SnailRenderer::new);
		EntityAttributeRegistry.register(romanSnailEntityType, SnailEntity::createAttributes);
		EntityRendererRegistry.register(romanSnailEntityType, SnailRenderer::new);
	}
}