package com.telepathicgrunt.the_bumblezone.configs;

import com.telepathicgrunt.the_bumblezone.utils.ConfigHelper;
import com.telepathicgrunt.the_bumblezone.utils.ConfigHelper.ConfigValueListener;
import net.minecraftforge.common.ForgeConfigSpec;

public class BzModCompatibilityConfigs
{
	public static class BzModCompatibilityConfigValues
	{
		public ConfigValueListener<Boolean> allowBottledBeesCompat;
		public ConfigValueListener<Boolean> allowHoneyWandCompat;
		public ConfigValueListener<Boolean> crystallizedHoneyWorldgen;
		public ConfigValueListener<Boolean> allowRegularCandlesBeeDungeon;
		public ConfigValueListener<Boolean> allowScentedCandlesBeeDungeon;
		public ConfigValueListener<Boolean> allowScentedCandlesSpiderBeeDungeon;
		public ConfigValueListener<Integer> powerfulCandlesRarityBeeDungeon;
		public ConfigValueListener<Integer> powerfulCandlesRaritySpiderBeeDungeon;

	    public ConfigValueListener<Boolean> allowPotionOfBeesCompat;
	    public ConfigValueListener<Boolean> allowSplashPotionOfBeesCompat;

		public ConfigValueListener<Boolean> spawnResourcefulBeesBeesMob;
		public ConfigValueListener<Boolean> useSpawnInWorldConfigFromRB;
		public ConfigValueListener<Boolean> spawnResourcefulBeesHoneycombVariants;
		public ConfigValueListener<Integer> RBGreatHoneycombRarityBeeDungeon;
		public ConfigValueListener<Double> RBOreHoneycombSpawnRateBeeDungeon;
		public ConfigValueListener<Integer> RBGreatHoneycombRaritySpiderBeeDungeon;
		public ConfigValueListener<Double> RBOreHoneycombSpawnRateSpiderBeeDungeon;
		public ConfigValueListener<Boolean> RBBeesWaxWorldgen;
		public ConfigValueListener<String> RBBlacklistedBees;

	    public ConfigValueListener<Boolean> spawnProductiveBeesBeesMob;
		public ConfigValueListener<Boolean> allowHoneyTreatCompat;
	    public ConfigValueListener<Boolean> spawnProductiveBeesHoneycombVariants;
	    public ConfigValueListener<Integer> PBGreatHoneycombRarityBeeDungeon;
	    public ConfigValueListener<Double> PBOreHoneycombSpawnRateBeeDungeon;
	    public ConfigValueListener<Integer> PBGreatHoneycombRaritySpiderBeeDungeon;
	    public ConfigValueListener<Double> PBOreHoneycombSpawnRateSpiderBeeDungeon;
		public ConfigValueListener<String> PBBlacklistedBees;

		public ConfigValueListener<Boolean> spawnPokecubeBeePokemon;

		public ConfigValueListener<Boolean> allowCCandlesBeeDungeon;
		public ConfigValueListener<Boolean> allowCCandlesSpiderBeeDungeon;

	    public BzModCompatibilityConfigValues(ForgeConfigSpec.Builder builder, ConfigHelper.Subscriber subscriber) {

	        builder.push("Mod Compatibility Options");

					builder.push("Charm Options");

					allowCCandlesBeeDungeon = subscriber.subscribe(builder
							.comment(" \r\n-----------------------------------------------------\r\n\r\n"
									+" Spawn Charm Candles in Bee Dungeons.\r\n")
							.translation("the_bumblezone.config.modcompat.charm.allowccandlesbeedungeon")
							.define("allowCCandlesBeeDungeon", true));

					allowCCandlesSpiderBeeDungeon = subscriber.subscribe(builder
							.comment(" \r\n-----------------------------------------------------\r\n\r\n"
									+" Spawn Charm Candles in Spider Infested Bee Dungeons.\r\n")
							.translation("the_bumblezone.config.modcompat.charm.allowccandlesspiderbeedungeon")
							.define("allowCCandlesSpiderBeeDungeon", true));

					builder.pop();

					builder.push("Pokecube Options");

					spawnPokecubeBeePokemon = subscriber.subscribe(builder
							.comment(" \r\n-----------------------------------------------------\r\n\r\n"
									+" Spawn Pokecube's bee-like pokemon in The Bumblezone and from Honey Brood Blocks.\r\n")
							.translation("the_bumblezone.config.modcompat.pokecube.spawnpokecubebeepokemon")
							.define("spawnPokecubeBeePokemon", true));

					builder.pop();

					builder.push("Resourceful Bees Options");

					spawnResourcefulBeesBeesMob = subscriber.subscribe(builder
							.comment(" \r\n-----------------------------------------------------\r\n\r\n"
									+" Spawn Resourceful Bees in The Bumblezone and from Honey Brood Blocks\r\n"
									+" alongside regular bees at a 1/15th chance when spawning regular bees.\r\n")
							.translation("the_bumblezone.config.modcompat.resourcefulbees.spawnresourcefulbeesbeesmob")
							.define("spawnResourcefulBeesBeesMob", true));

					spawnResourcefulBeesHoneycombVariants = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" Spawn Resourceful Bees's various honeycomb variants in The Bumblezone\r\n"
								+" at all kinds of heights and height bands. Start exploring to find \r\n"
								+" where they spawn!\r\n"
								+" \r\n"
								+" NOTE: Will require a restart of the world to take effect. \r\n")
						.translation("the_bumblezone.config.modcompat.resourcefulbees.spawnproductivebeeshoneycombvariants")
						.define("spawnResourcefulBeesHoneycombVariants", true));

					RBBeesWaxWorldgen = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" Spawn Resourceful Bees's Wax Block as part of The Bumblezone's worldgen.\r\n")
						.translation("the_bumblezone.config.modcompat.resourcefulbees.rbbeeswaxworldgen")
						.define("RBBeesWaxWorldgen", true));

					useSpawnInWorldConfigFromRB = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" Use Resourceful Bees's canSpawnInWorld config on their bee data\r\n"
								+" to know what bees to spawn in Bumblezone. This will stack with\r\n"
								+" RBBlacklistedBees config entry that Bumblezone uses.\r\n"
								+" Bees blacklisted from either will not spawn and their combs will not spawn either.\r\n"
								+" \r\n"
								+" NOTE: Will require a restart of the world to take effect. \r\n")
						.translation("the_bumblezone.config.modcompat.resourcefulbees.usespawninworldconfigfromrb")
						.define("useSpawnInWorldConfigFromRB", false));

					RBBlacklistedBees = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" Blacklist what Resourceful Bees bees should not spawn in Bumblezone. \r\n"
								+" Separate each entry with a comma. Example: \"resourcefulbees:iron,resourcefulbees:coal\"\r\n"
								+" \r\n"
								+" Note: Blacklisted bees will automatically blacklist their respective combs from worldgen too.")
						.translation("the_bumblezone.config.resourcefulbees.RBBlacklistedBees")
						.define("RBBlacklistedBees", ""));

					RBOreHoneycombSpawnRateBeeDungeon = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" How much of Bee Dungeons is made of ore-based honeycombs.\r\n"
								+" 0 is no or honeycombs, 1 is max ore honeycombs, and default is 0.3D\r\n")
						.translation("the_bumblezone.config.resourcefulbees.RBorehoneycombspawnratebeedungeon")
						.defineInRange("RBOreHoneycombSpawnRateBeeDungeon", 0.3D, 0D, 1D));

					RBGreatHoneycombRarityBeeDungeon = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" How rare good ore-based Honeycombs (diamonds, ender, emerald, etc) are \r\n"
								+" in Bee Dungeons. \r\n"
								+" Higher numbers means more rare. Default rate is 3.\r\n")
						.translation("the_bumblezone.config.resourcefulbees.RBgreathoneycombraritybeedungeon")
						.defineInRange("RBGreatHoneycombRarityBeeDungeon", 2, 1, 1001));

					RBOreHoneycombSpawnRateSpiderBeeDungeon = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" How much of Spider Infested Bee Dungeons is made of ore-based honeycombs.\r\n"
								+" 0 is no or honeycombs, 1 is max ore honeycombs, and default is 0.1D\r\n")
						.translation("the_bumblezone.config.resourcefulbees.RBorehoneycombspawnratespiderbeedungeon")
						.defineInRange("RBOreHoneycombSpawnRateSpiderBeeDungeon", 0.1D, 0D, 1D));

					RBGreatHoneycombRaritySpiderBeeDungeon = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" How rare good ore-based Honeycombs (diamonds, ender, emerald, etc) are \r\n"
								+" in Spider Infested Bee Dungeons. \r\n"
								+" Higher numbers means more rare. Default rate is 2.\r\n")
						.translation("the_bumblezone.config.resourcefulbees.RBgreathoneycombrarityspiderbeedungeon")
						.defineInRange("RBGreatHoneycombRaritySpiderBeeDungeon", 2, 1, 1001));

				builder.pop();

				builder.push("Productive Bees Options");

					spawnProductiveBeesBeesMob = subscriber.subscribe(builder
		                    .comment(" \r\n-----------------------------------------------------\r\n\r\n"
		                    		+" Spawn Productive Bees in The Bumblezone and from Honey Brood Blocks\r\n"
		                    		+" alongside regular bees at a 1/15th chance when spawning regular bees.\r\n")
		                    .translation("the_bumblezone.config.modcompat.productivebees.spawnproductivebeesbeesmob")
		                    .define("spawnProductiveBeesBeesMob", true));

					spawnProductiveBeesHoneycombVariants = subscriber.subscribe(builder
		                    .comment(" \r\n-----------------------------------------------------\r\n\r\n"
		                    		+" Spawn Productive Bees's various honeycomb variants in The Bumblezone\r\n"
		                    		+" at all kinds of heights and height bands. Start exploring to find \r\n"
		                    		+" where they spawn!"
		                    		+" \r\n"
		                    		+" NOTE: Will require a restart of the world to take effect. \r\n")
		                    .translation("the_bumblezone.config.modcompat.productivebees.spawnproductivebeeshoneycombvariants")
		                    .define("spawnProductiveBeesHoneycombVariants", true));

					allowHoneyTreatCompat = subscriber.subscribe(builder
							.comment(" \r\n-----------------------------------------------------\r\n\r\n"
									+" Allow Honey Treat to be able to feed bees and Honeycomb Brood Blocks.\r\n")
							.translation("the_bumblezone.config.modcompat.productivebees.allowhoneytreatcompat")
							.define("allowHoneyTreatCompat", true));


	        		PBOreHoneycombSpawnRateBeeDungeon = subscriber.subscribe(builder
	    		            .comment(" \r\n-----------------------------------------------------\r\n\r\n"
	    		            		+" How much of Bee Dungeons is made of ore-based honeycombs.\r\n"
	    		            		+" 0 is no or honeycombs, 1 is max ore honeycombs, and default is 0.3D\r\n")
	    		            .translation("the_bumblezone.config.productivebees.pborehoneycombspawnratebeedungeon")
	    		            .defineInRange("PBOreHoneycombSpawnRateBeeDungeon", 0.3D, 0D, 1D));

	        		PBGreatHoneycombRarityBeeDungeon = subscriber.subscribe(builder
	    		            .comment(" \r\n-----------------------------------------------------\r\n\r\n"
	    		            		+" How rare good ore-based Honeycombs (diamonds, ender, emerald, etc) are \r\n"
	    		            		+" in Bee Dungeons. \r\n"
	    		            		+" Higher numbers means more rare. Default rate is 3.\r\n")
	    		            .translation("the_bumblezone.config.productivebees.pbgreathoneycombraritybeedungeon")
	    		            .defineInRange("PBGreatHoneycombRarityBeeDungeon", 2, 1, 1001));

	        		PBOreHoneycombSpawnRateSpiderBeeDungeon = subscriber.subscribe(builder
	    		            .comment(" \r\n-----------------------------------------------------\r\n\r\n"
	    		            		+" How much of Spider Infested Bee Dungeons is made of ore-based honeycombs.\r\n"
	    		            		+" 0 is no or honeycombs, 1 is max ore honeycombs, and default is 0.1D\r\n")
	    		            .translation("the_bumblezone.config.productivebees.pborehoneycombspawnratespiderbeedungeon")
	    		            .defineInRange("PBOreHoneycombSpawnRateSpiderBeeDungeon", 0.1D, 0D, 1D));

	        		PBGreatHoneycombRaritySpiderBeeDungeon = subscriber.subscribe(builder
	    		            .comment(" \r\n-----------------------------------------------------\r\n\r\n"
	    		            		+" How rare good ore-based Honeycombs (diamonds, ender, emerald, etc) are \r\n"
	    		            		+" in Spider Infested Bee Dungeons. \r\n"
	    		            		+" Higher numbers means more rare. Default rate is 2.\r\n")
	    		            .translation("the_bumblezone.config.productivebees.pbgreathoneycombrarityspiderbeedungeon")
	    		            .defineInRange("PBGreatHoneycombRaritySpiderBeeDungeon", 2, 1, 1001));


					PBBlacklistedBees = subscriber.subscribe(builder
							.comment(" \r\n-----------------------------------------------------\r\n\r\n"
									+" Blacklist what Productive Bees bees should not spawn in Bumblezone. \r\n"
									+" Separate each entry with a comma. Example: \"productivebees:iron,productivebees:coal\"\r\n"
									+" \r\n"
									+" Note: this is only for the entities. To blacklist blocks as well,\r\n"
									+" use a datapack to add blacklisted blocks to this tag:\r\n"
									+" data/the_bumblezone/tags/blocks/blacklisted_productive_bees_combs.json\r\n")
							.translation("the_bumblezone.config.productivebees.pbblacklistedbees")
							.define("PBBlacklistedBees", ""));

	            builder.pop();


	            builder.push("Potion of Bees Options");

	            		allowPotionOfBeesCompat = subscriber.subscribe(builder
		                    .comment(" \r\n-----------------------------------------------------\r\n\r\n"
		                    		+" Allow Potion of Bees item to turn Empty Honeycomb Brood blocks \r\n"
			                    	+" back into Honeycomb Brood Blocks with a larva in it. (affects Dispenser too)\r\n")
		                    .translation("the_bumblezone.config.modcompat.potionofbees.allowpotionofbeescompat")
		                    .define("allowPotionOfBeesCompat", true));

	            		allowSplashPotionOfBeesCompat = subscriber.subscribe(builder
			            .comment(" \r\n-----------------------------------------------------\r\n\r\n"
			                    	+" Allow Splash Potion of Bees item to turn Empty Honeycomb Brood \r\n"
				                +" blocks back into Honeycomb Brood Blocks with a larva in it when \r\n"
				                +" the potion is thrown and splashed near the block. (affects Dispenser too)\r\n")
			            .translation("the_bumblezone.config.modcompat.productivebees.allowsplashpotionofbeescompat")
			            .define("allowSplashPotionOfBeesCompat", true));

	            builder.pop();


			builder.push("Buzzier Bees Options");

				allowBottledBeesCompat = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" Allow Bottles Bees item to turn Empty Honeycomb Brood blocks \r\n"
								+" back into Honeycomb Brood Blocks with a larva in it. (affects Dispenser too)\r\n")
						.translation("the_bumblezone.config.modcompat.buzzierbees.allowbottledbeescompat")
						.define("allowBottledBeesCompat", true));

				allowHoneyWandCompat = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" Allow Honey Wand to take honey from Filled Porous Honeycomb Block \r\n"
								+" and put honey into Porous Honeycomb Block without angering bees.\r\n")
						.translation("the_bumblezone.config.modcompat.buzzierbees.allowhoneywandcompat")
						.define("allowHoneyWandCompat", true));

				crystallizedHoneyWorldgen = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" Place Buzzier Bees's Crystallized Honey Blocks on the /r/n"
								+" surface of land around sea level and above.\r\n")
						.translation("the_bumblezone.config.modcompat.buzzierbees.crystallizedhoneyworldgen")
						.define("crystallizedHoneyWorldgen", true));

				allowRegularCandlesBeeDungeon = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" Allow Bee Dungeons to have normal unscented candles./r/n")
						.translation("the_bumblezone.config.modcompat.buzzierbees.allowregularcandlesbeedungeon")
						.define("allowRegularCandlesBeeDungeon", true));

				allowScentedCandlesBeeDungeon = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" Allow Bee Dungeons to have scented candles that gives status effects./r/n")
						.translation("the_bumblezone.config.modcompat.buzzierbees.allowscentedcandlesbeedungeon")
						.define("allowScentedCandlesBeeDungeon", true));

				allowScentedCandlesSpiderBeeDungeon = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" Allow Spider Infested Bee Dungeons to have scented candles that gives status effects./r/n")
						.translation("the_bumblezone.config.modcompat.buzzierbees.allowscentedcandlesspiderbeedungeon")
						.define("allowScentedCandlesSpiderBeeDungeon", true));

				powerfulCandlesRarityBeeDungeon = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" How rare are powerful candles in Bee Dungeons. \r\n"
								+" Higher numbers means more rare.\r\n"
								+" Default rate is 2.\r\n")
						.translation("the_bumblezone.config.dungeons.powerfulcandlesraritybeedungeon")
						.defineInRange("powerfulCandlesRarityBeeDungeon", 2, 0, 10));

				powerfulCandlesRaritySpiderBeeDungeon = subscriber.subscribe(builder
						.comment(" \r\n-----------------------------------------------------\r\n\r\n"
								+" How rare are powerful candles in Spider Infested Bee Dungeons. \r\n"
								+" Higher numbers means more rare.\r\n"
								+" Default rate is 2.\r\n")
						.translation("the_bumblezone.config.dungeons.powerfulcandlesrarityspiderbeedungeon")
						.defineInRange("powerfulCandlesRaritySpiderBeeDungeon", 0, 0, 10));

			builder.pop();


			builder.pop();
	    }
	}
}
