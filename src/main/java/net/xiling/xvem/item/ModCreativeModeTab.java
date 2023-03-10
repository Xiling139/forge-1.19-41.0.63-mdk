package net.xiling.xvem.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MATERIAL_TAB = new CreativeModeTab("materialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };

    public static final CreativeModeTab INDUSTRY_TAB = new CreativeModeTab("industrytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.POWER_CORE.get());
        }
    };


}
