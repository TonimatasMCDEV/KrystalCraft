package net.tonimatasmc.krystalcraft.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tonimatasmc.krystalcraft.KrystalCraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KrystalCraft.MOD_ID);
    
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));
    
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", () ->
        new SwordItem(ModItemTier.SILVER, 4, -2.4F, (
                new Item.Properties()).tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () ->
            new PickaxeItem(ModItemTier.SILVER, 3, -2.8F, (
                    new Item.Properties()).tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe", () ->
            new AxeItem(ModItemTier.SILVER, 8, -3.1F, (
                    new Item.Properties()).tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel", () ->
            new ShovelItem(ModItemTier.SILVER, 4, -3.0F, (
                    new Item.Properties()).tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe", () ->
            new HoeItem(ModItemTier.SILVER, 0, -1.0F, (
                    new Item.Properties()).tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",() ->
            new ArmorItem(ModArmorTier.SILVER, EquipmentSlot.HEAD,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",() ->
            new ArmorItem(ModArmorTier.SILVER, EquipmentSlot.CHEST,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",() ->
            new ArmorItem(ModArmorTier.SILVER, EquipmentSlot.LEGS,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",() ->
            new ArmorItem(ModArmorTier.SILVER, EquipmentSlot.FEET,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

//------------------------------------------------------------------------------------------------------------------Jade

    public static final RegistryObject<Item> JADE = ITEMS.register("jade",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> JADE_DUST = ITEMS.register("jade_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RAW_JADE = ITEMS.register("raw_jade",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> JADE_SWORD = ITEMS.register("jade_sword",() ->
            new SwordItem(ModItemTier.JADE, 4, -2.4f,
                    new SwordItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> JADE_PICKAXE = ITEMS.register("jade_pickaxe",() ->
            new PickaxeItem(ModItemTier.JADE, 3, -2.8f,
                    new PickaxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> JADE_AXE = ITEMS.register("jade_axe",() ->
            new AxeItem(ModItemTier.JADE, 6, -3.1f,
                    new AxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> JADE_SHOVEL = ITEMS.register("jade_shovel",() ->
            new ShovelItem(ModItemTier.JADE, 1, -3.4f,
                    new ShovelItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> JADE_HOE = ITEMS.register("jade_hoe",() ->
            new HoeItem(ModItemTier.JADE, -1, -1f,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> JADE_HORSE_ARMOR = ITEMS.register("jade_horse_armor",() ->
            new HorseArmorItem(9, "jade",
                    new HorseArmorItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT).stacksTo(1)));

    public static final RegistryObject<Item> JADE_HELMET = ITEMS.register("jade_helmet",() ->
            new ArmorItem(ModArmorTier.JADE, EquipmentSlot.HEAD,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> JADE_CHESTPLATE = ITEMS.register("jade_chestplate",() ->
            new ArmorItem(ModArmorTier.JADE, EquipmentSlot.CHEST,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> JADE_LEGGINGS = ITEMS.register("jade_leggings",() ->
            new ArmorItem(ModArmorTier.JADE, EquipmentSlot.LEGS,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> JADE_BOOTS = ITEMS.register("jade_boots",() ->
            new ArmorItem(ModArmorTier.JADE, EquipmentSlot.FEET,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

//-----------------------------------------------------------------------------------------------------------------Topaz

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TOPAZ_DUST = ITEMS.register("topaz_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RAW_TOPAZ = ITEMS.register("raw_topaz",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TOPAZ_HELMET = ITEMS.register("topaz_helmet",() ->
            new ArmorItem(ModArmorTier.TOPAZ, EquipmentSlot.HEAD,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate",() ->
            new ArmorItem(ModArmorTier.TOPAZ, EquipmentSlot.CHEST,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings",() ->
            new ArmorItem(ModArmorTier.TOPAZ, EquipmentSlot.LEGS,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TOPAZ_BOOTS = ITEMS.register("topaz_boots",() ->
            new ArmorItem(ModArmorTier.TOPAZ, EquipmentSlot.FEET,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword",() ->
            new SwordItem(ModItemTier.TOPAZ, 3, -2.4f,
                    new SwordItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe",() ->
            new PickaxeItem(ModItemTier.TOPAZ, 2, -2.8f,
                    new PickaxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TOPAZ_AXE = ITEMS.register("topaz_axe",() ->
            new AxeItem(ModItemTier.TOPAZ, 5, -3.1f,
                    new AxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel",() ->
            new ShovelItem(ModItemTier.TOPAZ, 0, -3.4f,
                    new ShovelItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TOPAZ_HOE = ITEMS.register("topaz_hoe",() ->
            new HoeItem(ModItemTier.TOPAZ, -1, -1f,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

//------------------------------------------------------------------------------------------------------------------Lead

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> LEAD_HELMET = ITEMS.register("lead_helmet",() ->
            new ArmorItem(ModArmorTier.LEAD, EquipmentSlot.HEAD,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> LEAD_CHESTPLATE = ITEMS.register("lead_chestplate",() ->
            new ArmorItem(ModArmorTier.LEAD, EquipmentSlot.CHEST,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> LEAD_LEGGINGS = ITEMS.register("lead_leggings",() ->
            new ArmorItem(ModArmorTier.LEAD, EquipmentSlot.LEGS,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> LEAD_BOOTS = ITEMS.register("lead_boots",() ->
            new ArmorItem(ModArmorTier.LEAD, EquipmentSlot.FEET,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> LEAD_SWORD = ITEMS.register("lead_sword",() ->
            new SwordItem(ModItemTier.LEAD, 6, -2.4f,
                    new SwordItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> LEAD_PICKAXE = ITEMS.register("lead_pickaxe",() ->
            new PickaxeItem(ModItemTier.LEAD, 3, -2.8f,
                    new PickaxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> LEAD_AXE = ITEMS.register("lead_axe",() ->
            new AxeItem(ModItemTier.LEAD, 8, -3.1f,
                    new AxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> LEAD_SHOVEL = ITEMS.register("lead_shovel",() ->
            new ShovelItem(ModItemTier.LEAD, 4, -3.0f,
                    new ShovelItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> LEAD_HOE = ITEMS.register("lead_hoe",() ->
            new HoeItem(ModItemTier.LEAD, 0, -1f,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

//-------------------------------------------------------------------------------------------------------------------Tin

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet",() ->
            new ArmorItem(ModArmorTier.TIN, EquipmentSlot.HEAD,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate",() ->
            new ArmorItem(ModArmorTier.TIN, EquipmentSlot.CHEST,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings",() ->
            new ArmorItem(ModArmorTier.TIN, EquipmentSlot.LEGS,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots",() ->
            new ArmorItem(ModArmorTier.TIN, EquipmentSlot.FEET,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword",() ->
            new SwordItem(ModItemTier.TIN, 3, -2.4f,
                    new SwordItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe",() ->
            new PickaxeItem(ModItemTier.TIN, 2, -2.8f,
                    new PickaxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe",() ->
            new AxeItem(ModItemTier.TIN, 8.0F, -3.2f,
                    new AxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel",() ->
            new ShovelItem(ModItemTier.TIN, 3.0F, -3.0f,
                    new ShovelItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe",() ->
            new HoeItem(ModItemTier.TIN, 0, -2.0F,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

//----------------------------------------------------------------------------------------------------------------Copper

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",() ->
            new ArmorItem(ModArmorTier.COPPER, EquipmentSlot.HEAD,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",() ->
            new ArmorItem(ModArmorTier.COPPER, EquipmentSlot.CHEST,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",() ->
            new ArmorItem(ModArmorTier.COPPER, EquipmentSlot.LEGS,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",() ->
            new ArmorItem(ModArmorTier.COPPER, EquipmentSlot.FEET,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",() ->
            new SwordItem(ModItemTier.COPPER, 4, -2.4f,
                    new SwordItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",() ->
            new PickaxeItem(ModItemTier.COPPER, 2, -2.8f,
                    new PickaxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",() ->
            new AxeItem(ModItemTier.COPPER, 8.0F, -3.2f,
                    new AxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",() ->
            new ShovelItem(ModItemTier.COPPER, 3.0F, -3.0f,
                    new ShovelItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",() ->
            new HoeItem(ModItemTier.COPPER, 0, -2.0F,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

//--------------------------------------------------------------------------------------------------------------Platinum

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet",() ->
            new ArmorItem(ModArmorTier.PLATINUM, EquipmentSlot.HEAD,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",() ->
            new ArmorItem(ModArmorTier.PLATINUM, EquipmentSlot.CHEST,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",() ->
            new ArmorItem(ModArmorTier.PLATINUM, EquipmentSlot.LEGS,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots",() ->
            new ArmorItem(ModArmorTier.PLATINUM, EquipmentSlot.FEET,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword",() ->
            new SwordItem(ModItemTier.PLATINUM, 7, -2.4f,
                    new SwordItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",() ->
            new PickaxeItem(ModItemTier.PLATINUM, 2, -2.8f,
                    new PickaxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe",() ->
            new AxeItem(ModItemTier.PLATINUM, 8.0F, -3.0f,
                    new AxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",() ->
            new ShovelItem(ModItemTier.PLATINUM, 5.0F, -3.0f,
                    new ShovelItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe",() ->
            new HoeItem(ModItemTier.PLATINUM, 0, 0.0F,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

//--------------------------------------------------------------------------------------------------------------Sapphire

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SAPPHIRE_DUST = ITEMS.register("sapphire_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",() ->
            new ArmorItem(ModArmorTier.SAPPHIRE, EquipmentSlot.HEAD,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",() ->
            new ArmorItem(ModArmorTier.SAPPHIRE, EquipmentSlot.CHEST,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",() ->
            new ArmorItem(ModArmorTier.SAPPHIRE, EquipmentSlot.LEGS,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",() ->
            new ArmorItem(ModArmorTier.SAPPHIRE, EquipmentSlot.FEET,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",() ->
            new SwordItem(ModItemTier.SAPPHIRE, 3, -2.4f,
                    new SwordItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",() ->
            new PickaxeItem(ModItemTier.SAPPHIRE, 2, -2.8f,
                    new PickaxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",() ->
            new AxeItem(ModItemTier.SAPPHIRE, 5, -3.1f,
                    new AxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",() ->
            new ShovelItem(ModItemTier.SAPPHIRE, 0, -3.4f,
                    new ShovelItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",() ->
            new HoeItem(ModItemTier.SAPPHIRE, -1, -1f,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

//--------------------------------------------------------------------------------------------------------------Sapphire

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RUBY_DUST = ITEMS.register("ruby_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",() ->
            new ArmorItem(ModArmorTier.RUBY, EquipmentSlot.HEAD,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",() ->
            new ArmorItem(ModArmorTier.RUBY, EquipmentSlot.CHEST,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",() ->
            new ArmorItem(ModArmorTier.RUBY, EquipmentSlot.LEGS,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",() ->
            new ArmorItem(ModArmorTier.RUBY, EquipmentSlot.FEET,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",() ->
            new SwordItem(ModItemTier.RUBY, 3, -2.6f,
                    new SwordItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",() ->
            new PickaxeItem(ModItemTier.RUBY, 2, -3.0f,
                    new PickaxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",() ->
            new AxeItem(ModItemTier.RUBY, 5, -3.3f,
                    new AxeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",() ->
            new ShovelItem(ModItemTier.RUBY, 0, -3.6f,
                    new ShovelItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",() ->
            new HoeItem(ModItemTier.RUBY, -1, -1f,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

//----------------------------------------------------------------------------------------------------------------Bronze

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () ->
            new SwordItem(ModItemTier.BRONZE, 4, -2.4F, (
                    new Item.Properties()).tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () ->
            new PickaxeItem(ModItemTier.BRONZE, 3, -2.8F, (
                    new Item.Properties()).tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () ->
            new AxeItem(ModItemTier.BRONZE, 8, -3.1F, (
                    new Item.Properties()).tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () ->
            new ShovelItem(ModItemTier.BRONZE, 4, -3.0F, (
                    new Item.Properties()).tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () ->
            new HoeItem(ModItemTier.BRONZE, 0, -1.0F, (
                    new Item.Properties()).tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet",() ->
            new ArmorItem(ModArmorTier.BRONZE, EquipmentSlot.HEAD,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate",() ->
            new ArmorItem(ModArmorTier.BRONZE, EquipmentSlot.CHEST,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings",() ->
            new ArmorItem(ModArmorTier.BRONZE, EquipmentSlot.LEGS,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots",() ->
            new ArmorItem(ModArmorTier.BRONZE, EquipmentSlot.FEET,
                    new HoeItem.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

//-----------------------------------------------------------------------------------------------------------------Items

    public static final RegistryObject<Item> RAW_DIAMOND = ITEMS.register("raw_diamond",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RAW_EMERALD = ITEMS.register("raw_emerald",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> EMERALD_DUST = ITEMS.register("emerald_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RAW_LAPIS = ITEMS.register("raw_lapis",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> LAPIS_DUST = ITEMS.register("lapis_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> RAW_REDSTONE = ITEMS.register("raw_redstone",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT)));

    public static final RegistryObject<Item> GEM_CUTTER_TOOL = ITEMS.register("gem_cutter_tool",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT).durability(128)));

    public static final RegistryObject<Item> SET_WATER_BOTTLES = ITEMS.register("set_water_bottles",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT).durability(64)));

    public static final RegistryObject<Item> GRINDING_GEAR = ITEMS.register("grinding_gear",() ->
            new Item(new Item.Properties().tab(KrystalCraftTab.KRYSTALCRAFT).durability(512)));

    public static void register(IEventBus iEventBus) {
            ITEMS.register(iEventBus);
    }
}
