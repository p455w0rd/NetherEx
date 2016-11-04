/*
 * Copyright (C) 2016.  LogicTechCorp
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

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nex.NetherEx;
import nex.block.*;
import nex.item.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("ConstantConditions")
@GameRegistry.ObjectHolder(NetherEx.MOD_ID)
public class NetherExBlocks
{
    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":vanilla_stone_slab")
    public static final BlockVanillaStoneSlab VANILLA_STONE_SLAB = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":vanilla_stone_slab_double")
    public static final BlockVanillaStoneSlab VANILLA_STONE_SLAB_DOUBLE = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":vanilla_stone_stairs_nether_brick_red")
    public static final BlockNetherExStairs RED_NETHER_BRICK_STAIRS = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":vanilla_stone_wall")
    public static final BlockVanillaStoneWall VANILLA_STONE_WALL = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":vanilla_stone_fence")
    public static final BlockVanillaStoneFence VANILLA_STONE_FENCE = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":vanilla_stone_fence_gate_quartz")
    public static final BlockNetherExFenceGate QUARTZ_FENCE_GATE = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":vanilla_stone_fence_gate_nether_brick")
    public static final BlockNetherExFenceGate NETHER_BRICK_FENCE_GATE = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":vanilla_stone_fence_gate_nether_brick_red")
    public static final BlockNetherExFenceGate RED_NETHER_BRICK_FENCE_GATE = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":stone")
    public static final BlockNetherExStone STONE = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":stone_slab")
    public static final BlockNetherExStoneSlab STONE_SLAB = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":stone_slab_double")
    public static final BlockNetherExStoneSlab STONE_SLAB_DOUBLE = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":stone_stairs_basalt")
    public static final BlockNetherExStairs BASALT_STAIRS = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":stone_stairs_basalt_smooth")
    public static final BlockNetherExStairs SMOOTH_BASALT_STAIRS = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":stone_stairs_basalt_brick")
    public static final BlockNetherExStairs BASALT_BRICK_STAIRS = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":stone_wall")
    public static final BlockNetherExStoneWall STONE_WALL = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":stone_fence")
    public static final BlockNetherExStoneFence STONE_FENCE = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":stone_fence_gate_basalt")
    public static final BlockNetherExFenceGate BASALT_FENCE_GATE = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":stone_fence_gate_basalt_smooth")
    public static final BlockNetherExFenceGate SMOOTH_BASALT_FENCE_GATE = null;

    @GameRegistry.ObjectHolder(NetherEx.MOD_ID + ":stone_fence_gate_basalt_brick")
    public static final BlockNetherExFenceGate BASALT_BRICK_FENCE_GATE = null;

    private static final Logger LOGGER = LogManager.getLogger("NetherEx|NetherExBlocks");

    @Mod.EventBusSubscriber
    public static class EventHandler
    {
        @SubscribeEvent
        public static void onRegisterBlocks(RegistryEvent.Register<Block> event)
        {
            NetherExFluids.runStaticInit();

            event.getRegistry().registerAll(
                    new BlockVanillaStoneSlab(false),
                    new BlockVanillaStoneSlab(true),
                    new BlockNetherExStairs("vanilla_stone_stairs_nether_brick_red", 2, Blocks.RED_NETHER_BRICK.getDefaultState()),
                    new BlockVanillaStoneWall(),
                    new BlockVanillaStoneFence(),
                    new BlockNetherExFenceGate("vanilla_stone_fence_gate_quartz", 3, Material.ROCK),
                    new BlockNetherExFenceGate("vanilla_stone_fence_gate_nether_brick", 3, Material.ROCK),
                    new BlockNetherExFenceGate("vanilla_stone_fence_gate_nether_brick_red", 3, Material.ROCK),
                    new BlockNetherExStone(),
                    new BlockNetherExStoneSlab(false),
                    new BlockNetherExStoneSlab(true),
                    new BlockNetherExStairs("stone_stairs_basalt", 1, Blocks.STONE.getDefaultState()),
                    new BlockNetherExStairs("stone_stairs_basalt_smooth", 1, Blocks.STONE.getDefaultState()),
                    new BlockNetherExStairs("stone_stairs_basalt_brick", 1, Blocks.STONE.getDefaultState()),
                    new BlockNetherExStoneWall(),
                    new BlockNetherExStoneFence(),
                    new BlockNetherExFenceGate("stone_fence_gate_basalt", 2, Material.ROCK),
                    new BlockNetherExFenceGate("stone_fence_gate_basalt_smooth", 2, Material.ROCK),
                    new BlockNetherExFenceGate("stone_fence_gate_basalt_brick", 2, Material.ROCK)
            );

            LOGGER.info("Block registration has been completed.");
        }

        @SubscribeEvent
        public static void onRegisterItems(RegistryEvent.Register<Item> event)
        {
            event.getRegistry().registerAll(
                    new ItemBlockVanillaStoneSlab(false),
                    new ItemBlockVanillaStoneSlab(true),
                    new ItemBlockNetherEx(RED_NETHER_BRICK_STAIRS),
                    new ItemBlockVanillaStoneWall(),
                    new ItemBlockVanillaStoneFence(),
                    new ItemBlockNetherEx(QUARTZ_FENCE_GATE),
                    new ItemBlockNetherEx(NETHER_BRICK_FENCE_GATE),
                    new ItemBlockNetherEx(RED_NETHER_BRICK_FENCE_GATE),
                    new ItemBlockNetherExStone(),
                    new ItemBlockNetherExStoneSlab(false),
                    new ItemBlockNetherExStoneSlab(true),
                    new ItemBlockNetherEx(BASALT_STAIRS),
                    new ItemBlockNetherEx(SMOOTH_BASALT_STAIRS),
                    new ItemBlockNetherEx(BASALT_BRICK_STAIRS),
                    new ItemBlockNetherExStoneWall(),
                    new ItemBlockNetherExStoneFence(),
                    new ItemBlockNetherEx(BASALT_FENCE_GATE),
                    new ItemBlockNetherEx(SMOOTH_BASALT_FENCE_GATE),
                    new ItemBlockNetherEx(BASALT_BRICK_FENCE_GATE)
            );

            LOGGER.info("ItemBlock registration has been completed.");
        }
    }
}