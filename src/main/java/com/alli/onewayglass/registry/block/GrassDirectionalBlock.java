package com.alli.onewayglass.registry.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

import java.util.Optional;

public class GrassDirectionalBlock extends FacingBlock {
    protected GrassDirectionalBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        return stateFrom.isOf(this) ? true : super.isSideInvisible(state, stateFrom, direction);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.FACING);
    }


    @Override
    public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return world.getMaxLightLevel();
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(Properties.FACING, ctx.getPlayerLookDirection().getOpposite());
    }
    /**
    public Optional<Integer> getGrassColor() {
        return this.grassColor;
    }
     **/
}
