package mod.mcreator;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.util.EnumHelper;

import net.minecraft.world.World;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;

import java.util.Set;
import java.util.Random;
import java.util.HashMap;

public class mcreator_sugarCaneSword {

	public mcreator_sugarCaneSword() {
	}

	public static Item block;
	public static Object instance;

	public void load(FMLInitializationEvent event) {
		ItemStack stack = new ItemStack(block, 1);
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(block, 0, new ModelResourceLocation("TestEnvironmentMod:SugarCaneSword", "inventory"));

		GameRegistry.addRecipe(stack,
				new Object[]{"X12", "345", "67X", Character.valueOf('1'), Items.REEDS, Character.valueOf('2'), Items.REEDS, Character.valueOf('3'),
						Items.REEDS, Character.valueOf('4'), Items.DIAMOND_SWORD, Character.valueOf('5'), Items.REEDS, Character.valueOf('6'),
						Items.STICK, Character.valueOf('7'), Items.REEDS,});
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {
	}

	public void registerRenderers() {
	}

	static {
		Item.ToolMaterial enumt = EnumHelper.addToolMaterial("SUGARCANESWORD", 4, 4000, 30F, 7, 20);
		block = (Item) (new ItemSword(enumt) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("sword", 4);
				return ret.keySet();
			}
		}).setUnlocalizedName("SugarCaneSword");
		GameRegistry.registerItem(block, "SugarCaneSword");
		block.setCreativeTab(CreativeTabs.COMBAT);

	}

}
