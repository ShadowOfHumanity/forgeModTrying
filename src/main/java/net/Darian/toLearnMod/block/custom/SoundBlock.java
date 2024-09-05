package net.Darian.toLearnMod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class SoundBlock extends Block {


    public SoundBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
        List<SoundEvent> sounds = new ArrayList<>(ForgeRegistries.SOUND_EVENTS.getValues());
        Random random = new Random();
        int randomIndex = random.nextInt(sounds.size()-1);


        pLevel.playSound(pPlayer, pPos,sounds.get(randomIndex), SoundSource.BLOCKS, 1f, 1f);

        return InteractionResult.SUCCESS;
    }
}

