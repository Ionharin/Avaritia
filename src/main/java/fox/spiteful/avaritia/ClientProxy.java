package fox.spiteful.avaritia;

import fox.spiteful.avaritia.blocks.LudicrousBlocks;
import net.minecraft.block.BlockRedstoneComparator;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

	@Override
	public void stupidJsonBullshit() {
        setCustomModelResourceLocation(Avaritia.matrixIngot, 0, "crystal_matrix_ingot");
        setCustomModelResourceLocation(Item.getItemFromBlock(LudicrousBlocks.double_craft), 0, "double_craft");
        setCustomModelResourceLocation(Item.getItemFromBlock(LudicrousBlocks.triple_craft), 0, "triple_craft");
        setCustomModelResourceLocation(Item.getItemFromBlock(LudicrousBlocks.dire_crafting), 0, "dire_table");
	}

	public void setCustomModelResourceLocation(Item item, int meta, String name){
		if(item == null)
			return;
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation("avaritia:" + name, "inventory"));
	}
}
