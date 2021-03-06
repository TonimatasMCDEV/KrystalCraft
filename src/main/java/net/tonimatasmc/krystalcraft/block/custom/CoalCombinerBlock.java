package net.tonimatasmc.krystalcraft.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;
import net.tonimatasmc.krystalcraft.block.entity.ModBlockEntities;
import net.tonimatasmc.krystalcraft.block.entity.custom.CoalCombinerBlockEntity;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Objects;

@SuppressWarnings("deprecation")
public class CoalCombinerBlock extends BaseEntityBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public CoalCombinerBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @Nonnull VoxelShape getShape(@Nullable BlockState pState, @Nullable BlockGetter pLevel, @Nullable BlockPos pPos, @Nullable CollisionContext pContext) {
        return Block.box(0, 0, 0, 16, 18, 16);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    public @Nonnull BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public @Nonnull BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

    @Override
    public @Nonnull RenderShape getRenderShape(@Nullable BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState pState, @Nullable Level pLevel, @Nullable BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (pState.getBlock() != pNewState.getBlock()) {
            BlockEntity blockEntity = Objects.requireNonNull(pLevel).getBlockEntity(Objects.requireNonNull(pPos));

            if (blockEntity instanceof CoalCombinerBlockEntity) {
                ((CoalCombinerBlockEntity) blockEntity).drops();
            }
        }

        super.onRemove(pState, Objects.requireNonNull(pLevel), Objects.requireNonNull(pPos), pNewState, pIsMoving);
    }

    @Override
    public @Nonnull InteractionResult use(@Nullable BlockState pState, Level pLevel, @Nullable BlockPos pPos, @Nullable Player pPlayer, @Nullable InteractionHand pHand, @Nullable BlockHitResult pHit) {
        if (!pLevel.isClientSide()) {
            BlockEntity entity = pLevel.getBlockEntity(Objects.requireNonNull(pPos));

            if(entity instanceof CoalCombinerBlockEntity) {
                NetworkHooks.openScreen(((ServerPlayer) Objects.requireNonNull(pPlayer)), (CoalCombinerBlockEntity) entity, pPos);
            } else {
                throw new IllegalStateException("Our Container provider is missing!");
            }
        }

        return InteractionResult.sidedSuccess(pLevel.isClientSide());
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(@Nullable BlockPos pPos, @Nullable BlockState pState) {
        return new CoalCombinerBlockEntity(pPos, pState);
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(@Nullable Level pLevel, @Nullable BlockState pState, @Nullable BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, ModBlockEntities.COAL_COMBINER_BLOCK_ENTITY.get(),
                CoalCombinerBlockEntity::tick);
    }
}