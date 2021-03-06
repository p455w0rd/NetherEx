/*
 * NetherEx
 * Copyright (c) 2016-2017 by LogicTechCorp
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package nex.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import nex.block.BlockNetherrack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.minecraft.init.Blocks.SOUL_SAND;
import static net.minecraft.init.Items.MAGMA_CREAM;
import static net.minecraft.init.PotionTypes.AWKWARD;
import static nex.init.NetherExBlocks.BLOCK_GLASS_SOUL;
import static nex.init.NetherExBlocks.BLOCK_NETHERRACK;
import static nex.init.NetherExEffectTypes.*;
import static nex.init.NetherExItems.*;

@SuppressWarnings("ConstantConditions")
public class NetherExRecipes
{
    private static final Logger LOGGER = LogManager.getLogger("NetherEx|NetherExRecipes");

    public static void init()
    {
        LOGGER.info("Recipe registration started.");

        for(BlockNetherrack.EnumType type : BlockNetherrack.EnumType.values())
        {
            addSmelting(new ItemStack(ITEM_BRICK_NETHER, 1, type.ordinal()), new ItemStack(BLOCK_NETHERRACK, 1, type.ordinal()), 0.5F);
        }

        addSmelting(new ItemStack(BLOCK_GLASS_SOUL, 1, 0), new ItemStack(SOUL_SAND, 1, 0), 0.5F);
        addSmelting(new ItemStack(FOOD_MEAT_GHAST_COOKED, 1, 0), new ItemStack(FOOD_MEAT_GHAST_RAW, 1, 0), 0.5F);
        addSmelting(new ItemStack(FOOD_MAGMA_CREAM_CONGEALED, 1, 0), new ItemStack(MAGMA_CREAM, 1, 0), 0.5F);

        addBrewing(AWKWARD, ITEM_CRYSTAL_RIME, NORMAL_FREEZE);
        addBrewing(AWKWARD, ITEM_FANG_SPIDER_BONE, NORMAL_FROSTBITE);
        addBrewing(AWKWARD, ITEM_SPORE, NORMAL_SPORE);
        addBrewing(AWKWARD, FOOD_MEAT_GHAST_RAW, NORMAL_LOST);

        LOGGER.info("Recipe registration completed.");
    }

    private static void addSmelting(ItemStack output, ItemStack input, float xp)
    {
        FurnaceRecipes.instance().addSmeltingRecipe(input, output, xp);
    }

    private static void addBrewing(PotionType input, Item reagent, PotionType output)
    {
        PotionHelper.addMix(input, reagent, output);
    }
}
