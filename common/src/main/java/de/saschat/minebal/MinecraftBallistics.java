package de.saschat.minebal;

import com.google.common.base.Suppliers;
import de.saschat.minebal.client.render.GunRenderer;
import de.saschat.minebal.item.GunItem;
import de.saschat.minebal.client.render.RenderRegistry;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registries;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public class MinecraftBallistics {
    public static final String MOD_ID = "minebal";
    // We can use this if we don't want to use DeferredRegister
    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    // Registering a new creative tab
    public static final ItemGroup EXAMPLE_TAB = CreativeTabRegistry.create(new Identifier(MOD_ID, "example_tab"), () ->
            new ItemStack(MinecraftBallistics.EXAMPLE_ITEM.get()));

    public static final Item GUN_ITEM = GunItem.newInstance(new Item.Settings().group(MinecraftBallistics.EXAMPLE_TAB));

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("testgun", () ->
            GUN_ITEM);

    
    public static void init() {
        ITEMS.register();
        RenderRegistry.register(GUN_ITEM, new GunRenderer());
    }
}
