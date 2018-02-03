package com.blogspot.jabelarminecraft.examplemod.blocks;

import com.blogspot.jabelarminecraft.examplemod.init.ModMaterials;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author jabelar
 *
 */
public class BlockCloud extends Block
{

    public BlockCloud()
    {
        super(ModMaterials.CLOUD);
        
        // DEBUG
        System.out.println("BlockCloud constructor");
        
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        blockSoundType = SoundType.SNOW;
        blockParticleGravity = 1.0F;
        slipperiness = 0.6F;
        lightOpacity = 20; // cast a light shadow
        setTickRandomly(false);
        setLightLevel(0.5F); // redstone light has light value of 1.0F
        useNeighborBrightness = false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
}