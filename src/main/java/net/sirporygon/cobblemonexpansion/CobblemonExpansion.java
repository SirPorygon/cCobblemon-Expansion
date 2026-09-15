package net.sirporygon.cobblemonexpansion;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import net.sirporygon.cobblemonexpansion.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CobblemonExpansion implements ModInitializer {
	public static final String MOD_ID = "cobblemonexpansion";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
	 ModItems.registerModItems();
	}
	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
}
