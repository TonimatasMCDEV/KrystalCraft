package net.tonimatasmc.krystalcraft.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.tonimatasmc.krystalcraft.KrystalCraft;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Objects;

public class GemCuttingStationRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;

    public GemCuttingStationRecipe(ResourceLocation id, ItemStack output, NonNullList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }

    @Override
    public boolean matches(@NotNull SimpleContainer pContainer, @Nullable Level pLevel) {
        if (pLevel != null && pLevel.isClientSide()) {
            return false;
        }

        return recipeItems.get(0).test(pContainer.getItem(1));
    }

    @Override
    @Nonnull
    public NonNullList<Ingredient> getIngredients() {
        return recipeItems;
    }

    @Override
    @Nonnull
    public ItemStack assemble(@Nullable SimpleContainer pContainer) {
        return output;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    @Nonnull
    public ItemStack getResultItem() {
        return output.copy();
    }

    @Override
    @Nonnull
    public ResourceLocation getId() {
        return id;
    }

    @Override
    @Nonnull
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    @Nonnull
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    @SuppressWarnings("unused")
    public static class Type implements RecipeType<GemCuttingStationRecipe> {
        private Type() {
        }

        public static final Type INSTANCE = new Type();
        public static final String ID = "gem_cutting";
    }

    @SuppressWarnings("unused")
    public static class Serializer implements RecipeSerializer<GemCuttingStationRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(KrystalCraft.MOD_ID, "gem_cutting");

        @Override
        @Nonnull
        public GemCuttingStationRecipe fromJson(@Nullable ResourceLocation id, @Nullable JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(Objects.requireNonNull(json), "output"));
            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(1, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new GemCuttingStationRecipe(id, output, inputs);
        }

        @Override
        public GemCuttingStationRecipe fromNetwork(@Nullable ResourceLocation id, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);
            inputs.replaceAll(ignored -> Ingredient.fromNetwork(buf));
            ItemStack output = buf.readItem();
            return new GemCuttingStationRecipe(id, output, inputs);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, GemCuttingStationRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());

            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }

            buf.writeItemStack(recipe.getResultItem(), false);
        }

        @SuppressWarnings({"unchecked", "SameParameterValue"})
        private static <G> Class<G> castClass(Class<?> cls) {
            return (Class<G>) cls;
        }
    }
}