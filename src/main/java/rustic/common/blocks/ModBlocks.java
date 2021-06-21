package rustic.common.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rustic.common.Config;
import rustic.common.blocks.crops.BlockAppleSeeds;
import rustic.common.blocks.crops.BlockBerryBush;
import rustic.common.blocks.crops.BlockCropStake;
import rustic.common.blocks.crops.BlockGrapeLeaves;
import rustic.common.blocks.crops.BlockGrapeStem;
import rustic.common.blocks.crops.BlockLeavesApple;
import rustic.common.blocks.crops.BlockSaplingApple;
import rustic.common.blocks.crops.BlockStakeCrop;
import rustic.common.blocks.crops.BlockStakeTied;
import rustic.common.blocks.crops.Herbs;
import rustic.common.blocks.slab.BlockDoubleSlabBase;
import rustic.common.blocks.slab.BlockSlabBase;
import rustic.common.blocks.slab.ItemBlockSlabBase;
import rustic.common.items.ModItems;
import rustic.common.tileentity.TileEntityApiary;
import rustic.common.tileentity.TileEntityBarrel;
import rustic.common.tileentity.TileEntityBrewingBarrel;
import rustic.common.tileentity.TileEntityCabinet;
import rustic.common.tileentity.TileEntityCondenser;
import rustic.common.tileentity.TileEntityCondenserAdvancedBottom;
import rustic.common.tileentity.TileEntityCondenserAdvancedTop;
import rustic.common.tileentity.TileEntityCrushingTub;
import rustic.common.tileentity.TileEntityEvaporatingBasin;
import rustic.common.tileentity.TileEntityLiquidBarrel;
import rustic.common.tileentity.TileEntityVase;
import rustic.core.Rustic;

public class ModBlocks {

	public static BlockPillar STONE_PILLAR;
	public static BlockPillar ANDESITE_PILLAR;
	public static BlockPillar DIORITE_PILLAR;
	public static BlockPillar GRANITE_PILLAR;
	public static BlockPillar SLATE_PILLAR;
	public static BlockBase SLATE;
	public static BlockBase SLATE_ROOF;
	public static BlockBase SLATE_TILE;
	public static BlockBase SLATE_BRICK;
	public static BlockBase SLATE_CHISELED;
	public static BlockStairsBase SLATE_ROOF_STAIRS;
	public static BlockDoubleSlabBase SLATE_ROOF_DOUBLESLAB;
	public static BlockSlabBase SLATE_ROOF_SLAB;
	public static ItemBlockSlabBase SLATE_ROOF_SLAB_ITEM;
	public static BlockBase CLAY_WALL;
	public static BlockBase CLAY_WALL_CROSS;
	public static BlockClayWallDiag CLAY_WALL_DIAG;
	public static BlockChain CHAIN;
	public static BlockCandle CANDLE;
	public static BlockCandle CANDLE_LEVER;
	public static BlockChandelier CHANDELIER;
	public static BlockChain CHAIN_GOLD;
	public static BlockCandle CANDLE_GOLD;
	public static BlockCandle CANDLE_LEVER_GOLD;
	public static BlockChandelier CHANDELIER_GOLD;
	public static BlockChain CHAIN_SILVER;
	public static BlockCandle CANDLE_SILVER;
	public static BlockCandle CANDLE_LEVER_SILVER;
	public static BlockChandelier CHANDELIER_SILVER;
	public static BlockBeehive BEEHIVE;
	public static BlockApiary APIARY;
	public static BlockChair ACACIA_CHAIR;
	public static BlockChair BLACKWOOD_CHAIR;
	public static BlockChair KAPOK_CHAIR;
	public static BlockChair PINE_CHAIR;
	public static BlockChair SYCAMORE_CHAIR;
	public static BlockChair ASH_CHAIR;
	public static BlockChair CHESTNUT_CHAIR;
	public static BlockChair MAPLE_CHAIR;
	public static BlockChair ROSEWOOD_CHAIR;
	public static BlockChair WHITE_CEDAR_CHAIR;
	public static BlockChair ASPEN_CHAIR;
	public static BlockChair DOUGLAS_FIR_CHAIR;
	public static BlockChair OAK_CHAIR;
	public static BlockChair SEQUOIA_CHAIR;
	public static BlockChair WHITE_ELM_CHAIR;
	public static BlockChair BIRCH_CHAIR;
	public static BlockChair HICKORY_CHAIR;
	public static BlockChair PALM_CHAIR;
	public static BlockChair SPRUCE_CHAIR;
	public static BlockChair WILLOW_CHAIR;
	public static BlockTable TABLE_OAK;
	public static BlockTable TABLE_BIG_OAK;
	public static BlockTable TABLE_BIRCH;
	public static BlockTable TABLE_SPRUCE;
	public static BlockTable TABLE_ACACIA;
	public static BlockTable TABLE_JUNGLE;
	public static BlockVase VASE;
	public static BlockBarrel BARREL;
	public static BlockLattice IRON_LATTICE;
	public static BlockLantern IRON_LANTERN;
	public static BlockLantern GOLDEN_LANTERN;
	public static BlockLantern SILVER_LANTERN;
	public static BlockBase PAINTED_WOOD_WHITE;
	public static BlockBase PAINTED_WOOD_ORANGE;
	public static BlockBase PAINTED_WOOD_MAGENTA;
	public static BlockBase PAINTED_WOOD_LIGHT_BLUE;
	public static BlockBase PAINTED_WOOD_YELLOW;
	public static BlockBase PAINTED_WOOD_LIME;
	public static BlockBase PAINTED_WOOD_PINK;
	public static BlockBase PAINTED_WOOD_GRAY;
	public static BlockBase PAINTED_WOOD_SILVER;
	public static BlockBase PAINTED_WOOD_CYAN;
	public static BlockBase PAINTED_WOOD_PURPLE;
	public static BlockBase PAINTED_WOOD_BLUE;
	public static BlockBase PAINTED_WOOD_BROWN;
	public static BlockBase PAINTED_WOOD_GREEN;
	public static BlockBase PAINTED_WOOD_RED;
	public static BlockBase PAINTED_WOOD_BLACK;
	public static BlockDoubleSlabBase SLATE_BRICK_DOUBLESLAB;
	public static BlockSlabBase SLATE_BRICK_SLAB;
	public static ItemBlockSlabBase SLATE_BRICK_SLAB_ITEM;
	public static BlockStairsBase SLATE_BRICK_STAIRS;
	public static BlockGargoyle GARGOYLE;
	public static BlockCabinet CABINET;
	public static BlockLiquidBarrel LIQUID_BARREL;
	public static BlockFertileSoil FERTILE_SOIL;
	public static BlockPlanksRustic PLANKS;
	public static BlockLogRustic LOG;
	public static BlockLeavesRustic LEAVES;
	public static BlockSaplingRustic SAPLING;
	public static BlockCrushingTub CRUSHING_TUB;
	public static BlockEvaporatingBasin EVAPORATING_BASIN;
	public static BlockFenceRustic OLIVE_FENCE;
	public static BlockFenceRustic IRONWOOD_FENCE;
	public static BlockFenceGateRustic OLIVE_FENCE_GATE;
	public static BlockFenceGateRustic IRONWOOD_FENCE_GATE;
	public static BlockDoubleSlabBase OLIVE_DOUBLESLAB;
	public static BlockSlabBase OLIVE_SLAB;
	public static ItemBlockSlabBase OLIVE_SLAB_ITEM;
	public static BlockDoubleSlabBase IRONWOOD_DOUBLESLAB;
	public static BlockSlabBase IRONWOOD_SLAB;
	public static ItemBlockSlabBase IRONWOOD_SLAB_ITEM;
	public static BlockStairsBase OLIVE_STAIRS;
	public static BlockStairsBase IRONWOOD_STAIRS;
	public static BlockChair CHAIR_OLIVE;
	public static BlockChair CHAIR_IRONWOOD;
	public static BlockTable TABLE_OLIVE;
	public static BlockTable TABLE_IRONWOOD;
	public static BlockCondenser CONDENSER;
	public static BlockRetort RETORT;
	public static BlockCondenserAdvanced CONDENSER_ADVANCED;
	public static BlockRetort RETORT_ADVANCED;
	public static BlockCropStake CROP_STAKE;
	public static BlockStakeCrop TOMATO_CROP;
	public static BlockStakeCrop CHILI_CROP;
	public static BlockBerryBush WILDBERRY_BUSH;
	public static BlockRope ROPE;
	public static BlockStakeTied STAKE_TIED;
	public static BlockGrapeStem GRAPE_STEM;
	public static BlockGrapeLeaves GRAPE_LEAVES;
	public static BlockBrewingBarrel BREWING_BARREL;
	public static BlockAppleSeeds APPLE_SEEDS;
	public static BlockSaplingApple APPLE_SAPLING;
	public static BlockLeavesApple APPLE_LEAVES;
	public static BlockDoorRustic DOOR_OLIVE;
	public static BlockDoorRustic DOOR_IRONWOOD;
	public static BlockWoodLantern LANTERN_WOOD;

	public static void init() {
		if (Config.ENABLE_PILLARS) {
			STONE_PILLAR = new BlockPillar("stone");
			ANDESITE_PILLAR = new BlockPillar("andesite");
			DIORITE_PILLAR = new BlockPillar("diorite");
			GRANITE_PILLAR = new BlockPillar("granite");
			if (Config.ENABLE_SLATE) {
				SLATE_PILLAR = new BlockPillar("slate");
			}
		}
		CHAIN = new BlockChain();
		CANDLE = new BlockCandle();
		CANDLE_LEVER = new BlockCandleLever();
		CHANDELIER = new BlockChandelier();
		CHAIN_GOLD = new BlockChain("chain_gold");
		CANDLE_GOLD = new BlockCandle("candle_gold");
		CANDLE_LEVER_GOLD = new BlockCandleLever("candle_lever_gold");
		CHANDELIER_GOLD = new BlockChandelier("chandelier_gold");
		if (Config.ENABLE_SILVER_DECOR) {
			CHAIN_SILVER = new BlockChain("chain_silver");
			CANDLE_SILVER = new BlockCandle("candle_silver");
			CANDLE_LEVER_SILVER = new BlockCandleLever("candle_lever_silver");
			CHANDELIER_SILVER = new BlockChandelier("chandelier_silver");
		}
		BEEHIVE = new BlockBeehive();
		APIARY = new BlockApiary();
		if (Config.ENABLE_SLATE) {
			SLATE = (BlockBase) new BlockBase(Material.ROCK, "slate").setHardness(2.0F);
			SLATE_ROOF = (BlockBase) new BlockBase(Material.ROCK, "slate_roof").setHardness(2.0F);
			SLATE_TILE = (BlockBase) new BlockBase(Material.ROCK, "slate_tile").setHardness(2.0F);
			SLATE_BRICK = (BlockBase) new BlockBase(Material.ROCK, "slate_brick").setHardness(2.0F);
			SLATE_CHISELED = (BlockBase) new BlockBase(Material.ROCK, "slate_chiseled").setHardness(2.0F);
			SLATE_ROOF_STAIRS = new BlockStairsBase(SLATE_ROOF.getDefaultState(), "stairs_slate_roof");
			SLATE_ROOF_DOUBLESLAB = new BlockDoubleSlabBase(Material.ROCK, "slate_roof_doubleslab");
			SLATE_ROOF_SLAB = new BlockSlabBase(Material.ROCK, "slate_roof_slab", SLATE_ROOF_DOUBLESLAB);
			SLATE_ROOF_DOUBLESLAB.setSlab(SLATE_ROOF_SLAB);
			SLATE_ROOF_SLAB_ITEM = new ItemBlockSlabBase(SLATE_ROOF_SLAB, SLATE_ROOF_DOUBLESLAB);
			SLATE_BRICK_STAIRS = new BlockStairsBase(SLATE_BRICK.getDefaultState(), "stairs_slate_brick");
			SLATE_BRICK_DOUBLESLAB = new BlockDoubleSlabBase(Material.ROCK, "slate_brick_doubleslab");
			SLATE_BRICK_SLAB = new BlockSlabBase(Material.ROCK, "slate_brick_slab", SLATE_BRICK_DOUBLESLAB);
			SLATE_BRICK_DOUBLESLAB.setSlab(SLATE_BRICK_SLAB);
			SLATE_BRICK_SLAB_ITEM = new ItemBlockSlabBase(SLATE_BRICK_SLAB, SLATE_BRICK_DOUBLESLAB);
		}
		if (Config.ENABLE_CLAY_WALLS) {
			CLAY_WALL = ((BlockBase) new BlockBase(Material.CLAY, "clay_wall").setHardness(1F))
					.setBlockSoundType(SoundType.GROUND);
			CLAY_WALL_CROSS = ((BlockBase) new BlockBase(Material.CLAY, "clay_wall_cross").setHardness(1F))
					.setBlockSoundType(SoundType.GROUND);
			CLAY_WALL_DIAG = (BlockClayWallDiag) new BlockClayWallDiag().setHardness(1F);
		}
		if (Config.ENABLE_CHAIRS) {
			ACACIA_CHAIR = new BlockChair("ACACIA");
			BLACKWOOD_CHAIR = new BlockChair("BLACKWOOD");
			KAPOK_CHAIR = new BlockChair("KAPOK");
			PINE_CHAIR = new BlockChair("PINE");
			SYCAMORE_CHAIR = new BlockChair("SYCAMORE");
			ASH_CHAIR = new BlockChair("ASH");
			CHESTNUT_CHAIR = new BlockChair("CHESTNUT");
			MAPLE_CHAIR = new BlockChair("MAPLE");
			ROSEWOOD_CHAIR = new BlockChair("ROSEWOOD");
			WHITE_CEDAR_CHAIR = new BlockChair("WHITE_CEDAR");
			ASPEN_CHAIR = new BlockChair("ASPEN");
			DOUGLAS_FIR_CHAIR = new BlockChair("DOUGLAS_FIR");
			OAK_CHAIR = new BlockChair("OAK");
			SEQUOIA_CHAIR = new BlockChair("SEQUOIA");
			WHITE_ELM_CHAIR = new BlockChair("WHITE_ELM");
			BIRCH_CHAIR = new BlockChair("BIRCH");
			HICKORY_CHAIR = new BlockChair("HICKORY");
			PALM_CHAIR = new BlockChair("PALM");
			SPRUCE_CHAIR = new BlockChair("SPRUCE");
			WILLOW_CHAIR = new BlockChair("WILLOW");
		}
		if (Config.ENABLE_TABLES) {
			TABLE_OAK = new BlockTable("oak");
			TABLE_BIG_OAK = new BlockTable("big_oak");
			TABLE_BIRCH = new BlockTable("birch");
			TABLE_SPRUCE = new BlockTable("spruce");
			TABLE_ACACIA = new BlockTable("acacia");
			TABLE_JUNGLE = new BlockTable("jungle");
			TABLE_OLIVE = new BlockTable("olive");
			TABLE_IRONWOOD = new BlockTable("ironwood");
		}
		VASE = new BlockVase();
		BARREL = new BlockBarrel();
		if (Config.ENABLE_LATTICE) {
			IRON_LATTICE = new BlockLattice(Material.IRON, "iron_lattice");
		}
		IRON_LANTERN = new BlockLantern(Material.IRON, "iron_lantern");
		GOLDEN_LANTERN = new BlockLantern(Material.IRON, "golden_lantern");
		if (Config.ENABLE_SILVER_DECOR) {
			SILVER_LANTERN = new BlockLantern(Material.IRON, "silver_lantern");
		}
		if (Config.ENABLE_PAINTED_WOOD) {
			PAINTED_WOOD_WHITE = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_white").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_ORANGE = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_orange").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_MAGENTA = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_magenta").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_LIGHT_BLUE = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_light_blue")
					.setHardness(2.0F)).setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_YELLOW = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_yellow").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_LIME = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_lime").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_PINK = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_pink").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_GRAY = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_gray").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_SILVER = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_silver").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_CYAN = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_cyan").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_PURPLE = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_purple").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_BLUE = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_blue").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_BROWN = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_brown").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_GREEN = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_green").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_RED = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_red").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			PAINTED_WOOD_BLACK = ((BlockBase) new BlockBase(Material.WOOD, "painted_wood_black").setHardness(2.0F))
					.setBlockSoundType(SoundType.WOOD);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_WHITE, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_ORANGE, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_MAGENTA, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_LIGHT_BLUE, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_YELLOW, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_LIME, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_PINK, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_GRAY, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_SILVER, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_CYAN, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_PURPLE, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_BLUE, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_BROWN, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_GREEN, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_RED, 5, 20);
			Blocks.FIRE.setFireInfo(PAINTED_WOOD_BLACK, 5, 20);
		}
		GARGOYLE = new BlockGargoyle();
		CABINET = new BlockCabinet();
		LIQUID_BARREL = new BlockLiquidBarrel();
		FERTILE_SOIL = new BlockFertileSoil();
		PLANKS = new BlockPlanksRustic();
		LOG = new BlockLogRustic();
		LEAVES = new BlockLeavesRustic();
		SAPLING = new BlockSaplingRustic();
		CRUSHING_TUB = new BlockCrushingTub();
		EVAPORATING_BASIN = new BlockEvaporatingBasin();
		OLIVE_FENCE = new BlockFenceRustic(
				PLANKS.getDefaultState().withProperty(BlockPlanksRustic.VARIANT, BlockPlanksRustic.EnumType.OLIVE),
				"fence_olive");
		IRONWOOD_FENCE = new BlockFenceRustic(
				PLANKS.getDefaultState().withProperty(BlockPlanksRustic.VARIANT, BlockPlanksRustic.EnumType.IRONWOOD),
				"fence_ironwood");
		OLIVE_FENCE_GATE = new BlockFenceGateRustic(
				PLANKS.getDefaultState().withProperty(BlockPlanksRustic.VARIANT, BlockPlanksRustic.EnumType.OLIVE),
				"fence_gate_olive");
		IRONWOOD_FENCE_GATE = new BlockFenceGateRustic(
				PLANKS.getDefaultState().withProperty(BlockPlanksRustic.VARIANT, BlockPlanksRustic.EnumType.IRONWOOD),
				"fence_gate_ironwood");
		OLIVE_DOUBLESLAB = new BlockDoubleSlabBase(Material.WOOD, "olive_doubleslab", SoundType.WOOD);
		OLIVE_SLAB = new BlockSlabBase(Material.WOOD, "olive_slab", OLIVE_DOUBLESLAB, SoundType.WOOD);
		OLIVE_DOUBLESLAB.setSlab(OLIVE_SLAB);
		OLIVE_SLAB_ITEM = new ItemBlockSlabBase(OLIVE_SLAB, OLIVE_DOUBLESLAB);
		Blocks.FIRE.setFireInfo(OLIVE_DOUBLESLAB, 5, 20);
		Blocks.FIRE.setFireInfo(OLIVE_SLAB, 5, 20);
		IRONWOOD_DOUBLESLAB = new BlockDoubleSlabBase(Material.WOOD, "ironwood_doubleslab", SoundType.WOOD);
		IRONWOOD_SLAB = new BlockSlabBase(Material.WOOD, "ironwood_slab", IRONWOOD_DOUBLESLAB, SoundType.WOOD);
		IRONWOOD_DOUBLESLAB.setSlab(IRONWOOD_SLAB);
		IRONWOOD_SLAB_ITEM = new ItemBlockSlabBase(IRONWOOD_SLAB, IRONWOOD_DOUBLESLAB);
		Blocks.FIRE.setFireInfo(IRONWOOD_DOUBLESLAB, 5, 20);
		Blocks.FIRE.setFireInfo(IRONWOOD_SLAB, 5, 20);
		OLIVE_STAIRS = new BlockStairsBase(
				PLANKS.getDefaultState().withProperty(BlockPlanksRustic.VARIANT, BlockPlanksRustic.EnumType.OLIVE),
				"stairs_olive");
		Blocks.FIRE.setFireInfo(OLIVE_STAIRS, 5, 20);
		IRONWOOD_STAIRS = new BlockStairsBase(
				PLANKS.getDefaultState().withProperty(BlockPlanksRustic.VARIANT, BlockPlanksRustic.EnumType.IRONWOOD),
				"stairs_ironwood");
		Blocks.FIRE.setFireInfo(IRONWOOD_STAIRS, 5, 20);
		CONDENSER = new BlockCondenser();
		RETORT = new BlockRetort("retort");
		CONDENSER_ADVANCED = new BlockCondenserAdvanced();
		RETORT_ADVANCED = new BlockRetort("retort_advanced");
		CROP_STAKE = new BlockCropStake();
		TOMATO_CROP = new BlockStakeCrop("tomato_crop") {
			@Override
			public Item getCrop() {
				return ModItems.TOMATO;
			}

			@Override
			public Item getSeed() {
				return ModItems.TOMATO_SEEDS;
			}
		};
		CHILI_CROP = new BlockStakeCrop("chili_crop") {
			@Override
			public Item getCrop() {
				return ModItems.CHILI_PEPPER;
			}

			@Override
			public Item getSeed() {
				return ModItems.CHILI_PEPPER_SEEDS;
			}

			@Override
			public int getMaxHeight() {
				return 2;
			}
		};
		WILDBERRY_BUSH = new BlockBerryBush("wildberry_bush") {
			@Override
			public Item getBerries() {
				return ModItems.WILDBERRIES;
			}
		};
		ROPE = new BlockRope("rope");
		STAKE_TIED = new BlockStakeTied();
		GRAPE_STEM = new BlockGrapeStem();
		GRAPE_LEAVES = new BlockGrapeLeaves();
		BREWING_BARREL = new BlockBrewingBarrel();
		APPLE_SEEDS = new BlockAppleSeeds();
		APPLE_SAPLING = new BlockSaplingApple();
		APPLE_LEAVES = new BlockLeavesApple();
		DOOR_OLIVE = new BlockDoorRustic(Material.WOOD, "olive_door");
		DOOR_IRONWOOD = new BlockDoorRustic(Material.WOOD, "ironwood_door");
		LANTERN_WOOD = new BlockWoodLantern();

		Herbs.init();
		
		GameRegistry.registerTileEntity(TileEntityApiary.class, new ResourceLocation(Rustic.MODID , "tileEntityApiary"));
		GameRegistry.registerTileEntity(TileEntityVase.class, new ResourceLocation(Rustic.MODID,  "tileEntityVase"));
		GameRegistry.registerTileEntity(TileEntityBarrel.class, new ResourceLocation(Rustic.MODID, "tileEntityBarrel"));
		GameRegistry.registerTileEntity(TileEntityCabinet.class, new ResourceLocation(Rustic.MODID, "tileEntityCabinet"));
		GameRegistry.registerTileEntity(TileEntityLiquidBarrel.class, new ResourceLocation(Rustic.MODID, "tileEntityLiquidBarrel"));
		GameRegistry.registerTileEntity(TileEntityCrushingTub.class, new ResourceLocation(Rustic.MODID, "tileEntityCrushingTub"));
		GameRegistry.registerTileEntity(TileEntityEvaporatingBasin.class, new ResourceLocation(Rustic.MODID, "tileEntityEvaporatingBasin"));
		GameRegistry.registerTileEntity(TileEntityCondenser.class, new ResourceLocation(Rustic.MODID, "tileEntityCondenser"));
		GameRegistry.registerTileEntity(TileEntityCondenserAdvancedBottom.class, new ResourceLocation(Rustic.MODID, "tileEntityCondenserAdvanced"));
		GameRegistry.registerTileEntity(TileEntityCondenserAdvancedTop.class, new ResourceLocation(Rustic.MODID, "tileEntityCondenserAdvancedProxy"));
		GameRegistry.registerTileEntity(TileEntityBrewingBarrel.class, new ResourceLocation(Rustic.MODID, "tileEntityBrewingBarrel"));
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		if (Config.ENABLE_PILLARS) {
			STONE_PILLAR.initModel();
			ANDESITE_PILLAR.initModel();
			DIORITE_PILLAR.initModel();
			GRANITE_PILLAR.initModel();
			if (Config.ENABLE_SLATE) {
				SLATE_PILLAR.initModel();
			}
		}
		CHAIN.initModel();
		CANDLE.initModel();
		CANDLE_LEVER.initModel();
		CHANDELIER.initModel();
		CHAIN_GOLD.initModel();
		CANDLE_GOLD.initModel();
		CANDLE_LEVER_GOLD.initModel();
		CHANDELIER_GOLD.initModel();
		if (Config.ENABLE_SILVER_DECOR) {
			CHAIN_SILVER.initModel();
			CANDLE_SILVER.initModel();
			CANDLE_LEVER_SILVER.initModel();
			CHANDELIER_SILVER.initModel();
		}
		BEEHIVE.initModel();
		APIARY.initModel();
		if (Config.ENABLE_SLATE) {
			SLATE.initModel();
			SLATE_ROOF.initModel();
			SLATE_TILE.initModel();
			SLATE_BRICK.initModel();
			SLATE_CHISELED.initModel();
			SLATE_ROOF_STAIRS.initModel();
			SLATE_ROOF_DOUBLESLAB.initModel();
			SLATE_ROOF_SLAB.initModel();
			SLATE_ROOF_SLAB_ITEM.initModel();
			SLATE_BRICK_DOUBLESLAB.initModel();
			SLATE_BRICK_SLAB.initModel();
			SLATE_BRICK_SLAB_ITEM.initModel();
			SLATE_BRICK_STAIRS.initModel();
		}
		if (Config.ENABLE_CLAY_WALLS) {
			CLAY_WALL.initModel();
			CLAY_WALL_CROSS.initModel();
			CLAY_WALL_DIAG.initModel();
		}
		if (Config.ENABLE_CHAIRS) {
			ACACIA_CHAIR.initModel();
			BLACKWOOD_CHAIR.initModel();
			KAPOK_CHAIR.initModel();
			PINE_CHAIR.initModel();
			SYCAMORE_CHAIR.initModel();
			ASH_CHAIR.initModel();
			CHESTNUT_CHAIR.initModel();
			MAPLE_CHAIR.initModel();
			ROSEWOOD_CHAIR.initModel();
			WHITE_CEDAR_CHAIR.initModel();
			ASPEN_CHAIR.initModel();
			DOUGLAS_FIR_CHAIR.initModel();
			OAK_CHAIR.initModel();
			SEQUOIA_CHAIR.initModel();
			WHITE_ELM_CHAIR.initModel();
			BIRCH_CHAIR.initModel();
			HICKORY_CHAIR.initModel();
			PALM_CHAIR.initModel();
			SPRUCE_CHAIR.initModel();
			WILLOW_CHAIR.initModel();
		}
		if (Config.ENABLE_TABLES) {
			TABLE_OAK.initModel();
			TABLE_BIG_OAK.initModel();
			TABLE_BIRCH.initModel();
			TABLE_SPRUCE.initModel();
			TABLE_ACACIA.initModel();
			TABLE_JUNGLE.initModel();
			TABLE_OLIVE.initModel();
			TABLE_IRONWOOD.initModel();
		}
		VASE.initModel();
		BARREL.initModel();
		if (Config.ENABLE_LATTICE) {
			IRON_LATTICE.initModel();
		}
		IRON_LANTERN.initModel();
		GOLDEN_LANTERN.initModel();
		if (Config.ENABLE_SILVER_DECOR) {
			SILVER_LANTERN.initModel();
		}
		if (Config.ENABLE_PAINTED_WOOD) {
			PAINTED_WOOD_WHITE.initModel();
			PAINTED_WOOD_ORANGE.initModel();
			PAINTED_WOOD_MAGENTA.initModel();
			PAINTED_WOOD_LIGHT_BLUE.initModel();
			PAINTED_WOOD_YELLOW.initModel();
			PAINTED_WOOD_LIME.initModel();
			PAINTED_WOOD_PINK.initModel();
			PAINTED_WOOD_GRAY.initModel();
			PAINTED_WOOD_SILVER.initModel();
			PAINTED_WOOD_CYAN.initModel();
			PAINTED_WOOD_PURPLE.initModel();
			PAINTED_WOOD_BLUE.initModel();
			PAINTED_WOOD_BROWN.initModel();
			PAINTED_WOOD_GREEN.initModel();
			PAINTED_WOOD_RED.initModel();
			PAINTED_WOOD_BLACK.initModel();
		}
		GARGOYLE.initModel();
		CABINET.initModel();
		LIQUID_BARREL.initModel();
		FERTILE_SOIL.initModel();
		PLANKS.initModel();
		LOG.initModel();
		LEAVES.initModel();
		SAPLING.initModel();
		CRUSHING_TUB.initModel();
		EVAPORATING_BASIN.initModel();
		OLIVE_FENCE.initModel();
		IRONWOOD_FENCE.initModel();
		OLIVE_FENCE_GATE.initModel();
		IRONWOOD_FENCE_GATE.initModel();
		OLIVE_DOUBLESLAB.initModel();
		OLIVE_SLAB.initModel();
		OLIVE_SLAB_ITEM.initModel();
		IRONWOOD_DOUBLESLAB.initModel();
		IRONWOOD_SLAB.initModel();
		IRONWOOD_SLAB_ITEM.initModel();
		OLIVE_STAIRS.initModel();
		IRONWOOD_STAIRS.initModel();
		CONDENSER.initModel();
		RETORT.initModel();
		CONDENSER_ADVANCED.initModel();
		RETORT_ADVANCED.initModel();
		CROP_STAKE.initModel();
		WILDBERRY_BUSH.initModel();
		ROPE.initModel();
		GRAPE_STEM.initModel();
		GRAPE_LEAVES.initModel();
		BREWING_BARREL.initModel();
		APPLE_SEEDS.initModel();
		APPLE_SAPLING.initModel();
		APPLE_LEAVES.initModel();
		DOOR_OLIVE.initModel();
		DOOR_IRONWOOD.initModel();
		LANTERN_WOOD.initModel();

		Herbs.initModels();
	}

}
