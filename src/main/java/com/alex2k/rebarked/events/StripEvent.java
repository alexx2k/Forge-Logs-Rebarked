package com.alex2k.rebarked.events;

import com.alex2k.rebarked.item.ModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber()
public class StripEvent {

    @SubscribeEvent
    public static void onAxeStrippingLog(BlockEvent.BlockToolModificationEvent event) {
        if (ToolActions.AXE_STRIP.equals(event.getToolAction())) {
            if (BlockState.NAME_TAG == "oak_log") {// block is oak log
                Block.popResource(event.getPlayer().level(), event.getPos(), new ItemStack(ModItems.OAK_BARK.get()));
            }
            else if(BlockState.NAME_TAG == "oak_log") { // block is birch log
                Block.popResource(event.getPlayer().level(), event.getPos(), new ItemStack(ModItems.BIRCH_BARK.get()));
            }
            else if(BlockState.NAME_TAG == "oak_log") {// block is spruce log
            Block.popResource(event.getPlayer().level(), event.getPos(), new ItemStack(ModItems.SPRUCE_BARK.get()));
            }
            else if(BlockState.NAME_TAG == "oak_log") {// block is jungle log
                Block.popResource(event.getPlayer().level(), event.getPos(), new ItemStack(ModItems.JUNGLE_BARK.get()));
            }
            else if ( BlockState.NAME_TAG == "oak_log") {// block is dark oak log
                Block.popResource(event.getPlayer().level(), event.getPos(), new ItemStack(ModItems.DARK_OAK_BARK.get()));
            }
            else if ( BlockState.NAME_TAG == "oak_log") {// block is mangrove log
                Block.popResource(event.getPlayer().level(), event.getPos(), new ItemStack(ModItems.MANGROVE_BARK.get()));
            }
            else if ( BlockState.NAME_TAG == "oak_log") {// block is cherry log
                Block.popResource(event.getPlayer().level(), event.getPos(), new ItemStack(ModItems.CHERRY_BARK.get()));
            }
            else if ( BlockState.NAME_TAG == "oak_log") {// block is crimson stem
                Block.popResource(event.getPlayer().level(), event.getPos(), new ItemStack(ModItems.CRIMSON_BARK.get()));
            }
            else if ( BlockState.NAME_TAG == "oak_log") {// block is warped stem
                Block.popResource(event.getPlayer().level(), event.getPos(), new ItemStack(ModItems.WARPED_BARK.get()));
            }
        }
    }
}