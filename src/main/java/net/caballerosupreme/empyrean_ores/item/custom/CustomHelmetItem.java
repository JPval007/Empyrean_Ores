package net.caballerosupreme.empyrean_ores.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CustomHelmetItem extends Item {
    public CustomHelmetItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            //Output a random number
            outputRandomNumber(player);
            //Set a cool down (20 is the number of ticks it lasts)
            player.getCooldowns().addCooldown(this, 20);

        }


        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {

        if (Screen.hasShiftDown()) {
            components.add(Component.literal("Right click to get random number").withStyle(ChatFormatting.AQUA));
            components.add(Component.literal("Low carbon steel (0-0.3%) is great for structures").withStyle(ChatFormatting.BLUE));
            components.add(Component.literal("Mid carbon steel (0.3-0.6%) is great for machine pieces or armor").withStyle(ChatFormatting.BLUE));
            components.add(Component.literal("High carbon steel (+0.6%) is the hardest substance manufactured").withStyle(ChatFormatting.BLUE));
            components.add(Component.literal("Use it for diamond quality tools").withStyle(ChatFormatting.WHITE));
        } else {
            components.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.YELLOW));
        }

        super.appendHoverText(itemStack, level, components, tooltipFlag);
    }

    private void outputRandomNumber(Player player) {
        player.sendSystemMessage(Component.literal("Your number is " + getRandomnumber()));
    }
    private int getRandomnumber() {
        return RandomSource.createNewThreadLocalInstance().nextInt(10);
    }

}


//Ideas for mandalorian helmet
/*
Make piglins neutral when using it (LOTR ring of power)
Shine like enchantment
Color change texture
Negate fall damage
Summon lighting bolt when atacking without damaging player
 */