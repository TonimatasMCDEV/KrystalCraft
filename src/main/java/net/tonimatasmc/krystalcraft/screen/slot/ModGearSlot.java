package net.tonimatasmc.krystalcraft.screen.slot;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.tonimatasmc.krystalcraft.item.ModItems;
import org.jetbrains.annotations.NotNull;

public class ModGearSlot extends SlotItemHandler {
    public ModGearSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(@NotNull ItemStack stack) {
        return stack.getItem() == ModItems.GRINDING_GEAR.get();
    }
}
