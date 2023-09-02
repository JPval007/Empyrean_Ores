package net.caballerosupreme.empyrean_ores.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;

public class GlowOre extends Block {
    //Create LIT property
    public static final BooleanProperty LIT = BooleanProperty.create("lit");

    //Block Properties definition
    public GlowOre(Properties properties) {
        super(properties);
        //Block default state (off)
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
    }


    //What happens when you attack it
    @Override
    public void attack(BlockState state, Level level, BlockPos blockPos, Player player) {
        interact(state, level, blockPos); //Run interact function
        super.attack(state, level, blockPos, player);
    }

    //What happens when you step on it
    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        //Run interact function if any entity isn't stepping carefully
        if (!entity.isSteppingCarefully()) {
            interact(blockState, level, blockPos);
        }
        super.stepOn(level, blockPos, blockState, entity);
    }

    //What happens when you use it with your hand (left click):
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos blockPos,
                                 Player player, InteractionHand hand, BlockHitResult result) {
        //Detect if you interact with it
        if (!level.isClientSide()) {
            interact(state, level, blockPos);
        }
        //Detect if you interact using the main hand
        if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            level.setBlock(blockPos, state.cycle(LIT), 3);
            //Cycle means that LIT value toggles when you left click the block
        }

        return super.use(state, level, blockPos, player, hand, result); //default return of this function, better to leave it
    }

    //Interact function (what happens when you interact with it)
    private static void interact(BlockState blockState, Level level, BlockPos blockPos) {
        //Put function to spawn particles and make the particle type a class property (configurable)
        if (!blockState.getValue(LIT)) {
            level.setBlock(blockPos, blockState.setValue(LIT, Boolean.valueOf(true)),3);
            //Basically, when interacted with, LIT becomes true
        }

    }

    //This makes the ore go off randomly?

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return state.getValue(LIT);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos blockPos, RandomSource randomSource) {
        if (state.getValue(LIT)) {
            level.setBlock(blockPos, state.setValue(LIT, Boolean.valueOf(false)),3);
        }

    }

    //Add the xp drop because it's an ore duhhh (Lol why am I even writing this?)


    @Override
    public int getExpDrop(BlockState state, LevelReader world, RandomSource randomSource, BlockPos pos, int fortuneLevel, int Silktouch) {
        //If it doesn't have silktouch it drops xp between 1 and 7 but if it
        return Silktouch == 0 ? 1 + randomSource.nextInt(7) : 0;
    }

    //In Here we add the property LIT that we just created to this class (Very important or it won't work)
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }
}

