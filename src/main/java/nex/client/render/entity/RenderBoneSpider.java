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

package nex.client.render.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import nex.client.model.entity.ModelBoneSpider;
import nex.client.model.entity.ModelBoneSpiderHead;
import nex.client.render.entity.layers.LayerBoneSpiderEyes;
import nex.entity.monster.EntityBoneSpider;
import nex.init.NetherExTextures;

@SideOnly(Side.CLIENT)
public class RenderBoneSpider extends RenderLiving<EntityBoneSpider>
{
    private final ModelBase spiderHead = new ModelBoneSpiderHead();

    public RenderBoneSpider(RenderManager manager)
    {
        super(manager, new ModelBoneSpider(), 0.5F);

        addLayer(new LayerBoneSpiderEyes(this));
    }

    @Override
    protected float getDeathMaxRotation(EntityBoneSpider boneSpider)
    {
        return 180.0F;
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityBoneSpider boneSpider)
    {
        return NetherExTextures.ENTITY_BONE_SPIDER;
    }

    public ModelBase getSpiderHead()
    {
        return spiderHead;
    }
}
