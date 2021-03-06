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

package nex.item;

import com.google.common.base.CaseFormat;
import net.minecraft.item.ItemStack;
import nex.block.BlockNetherrack;
import nex.init.NetherExBlocks;

@SuppressWarnings("ConstantConditions")
public class ItemBlockQuartzOre extends ItemBlockNetherEx
{
    public ItemBlockQuartzOre()
    {
        super(NetherExBlocks.ORE_QUARTZ);

        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return super.getUnlocalizedName() + "." + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, BlockNetherrack.EnumType.fromMeta(stack.getItemDamage()).getName());
    }
}
