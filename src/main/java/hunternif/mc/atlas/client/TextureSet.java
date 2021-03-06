package hunternif.mc.atlas.client;

import static hunternif.mc.atlas.client.Textures.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import net.minecraft.util.ResourceLocation;

public class TextureSet {
	public static final TextureSet TEST			= standard("TEST", TILE_TEST);
	public static final TextureSet ICE			= standard("ICE", TILE_ICE_NOBORDER);
	public static final TextureSet SHORE		= new TextureSetShore("SHORE", TILE_SHORE, TILE_SHORE2, TILE_SHORE3);
	public static final TextureSet ROCK_SHORE	= new TextureSetShore("ROCK_SHORE", TILE_ROCK_SHORE);
	public static final TextureSet DESERT			= standard("DESERT", TILE_SAND, TILE_SAND, TILE_SAND2, TILE_SAND2,
			TILE_SAND3, TILE_SAND3, TILE_CACTI, TILE_SAND_BUSHES, TILE_SAND_BUSHES);
	public static final TextureSet PLAINS		= standard("PLAINS", TILE_GRASS, TILE_GRASS2, TILE_GRASS3, TILE_GRASS4);
	public static final TextureSet SUNFLOWERS	= standard("SUNFLOWERS", TILE_SUNFLOWERS, TILE_SUNFLOWERS2, TILE_GRASS3, TILE_GRASS4);
	
	// Snowy stuff
	public static final TextureSet ICE_SPIKES	= standard("ICE_SPIKES", TILE_ICE_SPIKES, TILE_ICE_SPIKES2);
	public static final TextureSet SNOW_PINES	= standard("SNOW_PINES", TILE_SNOW_PINES, TILE_SNOW_PINES2, TILE_SNOW_PINES3);
	public static final TextureSet SNOW_PINES_HILLS = standard("SNOW_PINES_HILLS", TILE_SNOW_PINES_HILLS, TILE_SNOW_PINES_HILLS2, TILE_SNOW_PINES_HILLS3);
	public static final TextureSet SNOW_HILLS	= standard("SNOW_HILLS", TILE_SNOW_HILLS, TILE_SNOW_HILLS2);
	public static final TextureSet SNOW			= standard("SNOW", TILE_SNOW, TILE_SNOW, TILE_SNOW, TILE_SNOW, TILE_SNOW,
			TILE_SNOW1, TILE_SNOW1, TILE_SNOW1, TILE_SNOW2, TILE_SNOW2, TILE_SNOW2, TILE_SNOW3, TILE_SNOW4, TILE_SNOW5, TILE_SNOW6);
	
	// Mountain stuff
	public static final TextureSet MOUNTAINS_NAKED = standard("MOUNTAINS_NAKED", TILE_MOUNTAINS, TILE_MOUNTAINS2);
	/** Has a few trees on. */
	public static final TextureSet MOUNTAINS = standard("MOUNTAINS", TILE_MOUNTAINS, TILE_MOUNTAINS,
			TILE_MOUNTAINS2, TILE_MOUNTAINS2, TILE_MOUNTAINS3, TILE_MOUNTAINS4);
	public static final TextureSet MOUNTAINS_SNOW_CAPS = standard("MOUNTAINS_SNOW_CAPS", TILE_MOUNTAINS, TILE_SNOW_CAPS);
	/** Has naked mountains, a few trees, and snow caps. */
	public static final TextureSet MOUNTAINS_ALL = standard("MOUNTAINS_ALL", TILE_MOUNTAINS, TILE_MOUNTAINS2,
			TILE_MOUNTAINS3, TILE_MOUNTAINS4, TILE_SNOW_CAPS, TILE_SNOW_CAPS);
	
	public static final TextureSet HILLS		= standard("HILLS", TILE_HILLS);
	public static final TextureSet DESERT_HILLS	= standard("DESERT_HILLS", TILE_HILLS, TILE_HILLS, TILE_HILLS, TILE_HILLS_BUSHES, TILE_HILLS_CACTI);
	public static final TextureSet FOREST		= standard("FOREST", TILE_FOREST, TILE_FOREST2, TILE_FOREST3);
	public static final TextureSet FOREST_HILLS	= standard("FOREST_HILLS", TILE_FOREST_HILLS, TILE_FOREST_HILLS2, TILE_FOREST_HILLS3);
	public static final TextureSet FOREST_FLOWERS	= standard("FOREST_FLOWERS", TILE_FOREST_FLOWERS, TILE_FOREST_FLOWERS2, TILE_FOREST_FLOWERS3);
	public static final TextureSet DENSE_FOREST		= standard("DENSE_FOREST", TILE_DENSE_FOREST, TILE_DENSE_FOREST2);
	public static final TextureSet DENSE_FOREST_HILLS	= standard("DENSE_FOREST_HILLS", TILE_DENSE_FOREST_HILLS, TILE_DENSE_FOREST_HILLS2);
	public static final TextureSet BIRCH		= standard("BIRCH", TILE_BIRCH, TILE_BIRCH2);
	public static final TextureSet BIRCH_HILLS	= standard("BIRCH_HILLS", TILE_BIRCH_HILLS, TILE_BIRCH_HILLS2);
	public static final TextureSet TALL_BIRCH		= standard("TALL_BIRCH", TILE_TALL_BIRCH, TILE_TALL_BIRCH2);
	public static final TextureSet TALL_BIRCH_HILLS	= standard("TALL_BIRCH_HILLS", TILE_TALL_BIRCH_HILLS, TILE_TALL_BIRCH_HILLS2);
	public static final TextureSet DENSE_BIRCH	= standard("DENSE_BIRCH", TILE_DENSE_BIRCH);
	public static final TextureSet JUNGLE		= standard("JUNGLE", TILE_JUNGLE, TILE_JUNGLE2);
	public static final TextureSet JUNGLE_HILLS = standard("JUNGLE_HILLS", TILE_JUNGLE_HILLS, TILE_JUNGLE_HILLS2);
	public static final TextureSet JUNGLE_CLIFFS = standard("JUNGLE_CLIFFS", TILE_BUSHES_CLIFFS, TILE_JUNGLE_CLIFFS, TILE_JUNGLE_CLIFFS2);
	public static final TextureSet JUNGLE_EDGE	= standard("JUNGLE_EDGE", TILE_GRASS2, TILE_GRASS3, TILE_GRASS4,
			TILE_JUNGLE_EDGE, TILE_JUNGLE_EDGE2, TILE_JUNGLE_EDGE3);
	public static final TextureSet JUNGLE_EDGE_HILLS = standard("JUNGLE_EDGE_HILLS", TILE_HILLS_GRASS, TILE_HILLS_GRASS,
			TILE_JUNGLE_EDGE_HILLS, TILE_JUNGLE_EDGE_HILLS2, TILE_JUNGLE_EDGE_HILLS3);
	public static final TextureSet PINES		= standard("PINES", TILE_PINES, TILE_PINES2, TILE_PINES3);
	public static final TextureSet PINES_HILLS	= standard("PINES_HILLS", TILE_PINES_HILLS, TILE_PINES_HILLS2, TILE_PINES_HILLS3);
	public static final TextureSet SAVANNA		= standard("SAVANNA", TILE_GRASS, TILE_GRASS2, TILE_GRASS2,
			TILE_GRASS3, TILE_GRASS3, TILE_GRASS4, TILE_GRASS4, TILE_SAVANNA, TILE_SAVANNA2, TILE_SAVANNA3);
	public static final TextureSet SAVANNA_CLIFFS = standard("SAVANNA_CLIFFS", TILE_CLIFFS,
			TILE_SAVANNA_CLIFFS, TILE_SAVANNA_CLIFFS2, TILE_SAVANNA_CLIFFS3);
	public static final TextureSet MESA			= standard("MESA", TILE_MESA, TILE_MESA2, TILE_MESA3, TILE_MESA4, TILE_SAND_BUSHES);
	public static final TextureSet BRYCE		= standard("BRYCE", TILE_BRYCE, TILE_BRYCE2, TILE_BRYCE3, TILE_BRYCE4);
	public static final TextureSet PLATEAU_MESA	= standard("PLATEAU_MESA", TILE_PLATEAU_MESA, TILE_PLATEAU_MESA2);
	public static final TextureSet PLATEAU_MESA_LOW = standard("PLATEAU_MESA_LOW", TILE_PLATEAU_MESA_LOW, TILE_PLATEAU_MESA_LOW2);
	public static final TextureSet PLATEAU_MESA_TREES = standard("PLATEAU_MESA_TREES", TILE_PLATEAU_MESA, TILE_PLATEAU_MESA2, TILE_PLATEAU_TREES);
	public static final TextureSet PLATEAU_MESA_TREES_LOW = standard("PLATEAU_MESA_TREES_LOW", TILE_PLATEAU_MESA_LOW, TILE_PLATEAU_MESA_LOW2, TILE_PLATEAU_TREES_LOW);
	public static final TextureSet PLATEAU_SAVANNA = standard("PLATEAU_SAVANNA", TILE_PLATEAU_GRASS, TILE_PLATEAU_GRASS,
			TILE_PLATEAU_GRASS2, TILE_PLATEAU_GRASS2, TILE_PLATEAU_GRASS3, TILE_PLATEAU_GRASS3,
			TILE_PLATEAU_SAVANNA, TILE_PLATEAU_SAVANNA2, TILE_PLATEAU_SAVANNA3);
	public static final TextureSet PLATEAU_SAVANNA_M = standard("PLATEAU_SAVANNA_M",
			TILE_PLATEAU_GRASS, TILE_PLATEAU_GRASS2, TILE_PLATEAU_GRASS3, TILE_PLATEAU_SAVANNA2, TILE_PLATEAU_SAVANNA3,
			TILE_CLIFFS_CLOUDS, TILE_SAVANNA_CLIFFS_CLOUDS, TILE_SAVANNA_CLIFFS_CLOUDS2, TILE_SAVANNA_CLIFFS_CLOUDS3);
	
	public static final TextureSet MEGA_SPRUCE	= standard("MEGA_SPRUCE", TILE_MEGA_SPRUCE, TILE_MEGA_SPRUCE2);
	public static final TextureSet MEGA_SPRUCE_HILLS = standard("MEGA_SPRUCE_HILLS", TILE_MEGA_SPRUCE_HILLS, TILE_MEGA_SPRUCE_HILLS2);
	public static final TextureSet MEGA_TAIGA	= standard("MEGA_TAIGA", TILE_MEGA_TAIGA, TILE_MEGA_TAIGA2);
	public static final TextureSet MEGA_TAIGA_HILLS = standard("MEGA_TAIGA_HILLS", TILE_MEGA_TAIGA_HILLS, TILE_MEGA_TAIGA_HILLS2);
	
	public static final TextureSet SWAMP		= standard("SWAMP", TILE_SWAMP, TILE_SWAMP, TILE_SWAMP, TILE_SWAMP2, TILE_SWAMP3, TILE_SWAMP4, TILE_SWAMP5, TILE_SWAMP6);
	public static final TextureSet SWAMP_HILLS	= standard("SWAMP_HILLS", TILE_SWAMP_HILLS, TILE_SWAMP_HILLS2, TILE_SWAMP_HILLS3, TILE_SWAMP_HILLS4, TILE_SWAMP_HILLS5);
	public static final TextureSet MUSHROOM		= standard("MUSHROOM", TILE_MUSHROOM, TILE_MUSHROOM2);
	public static final TextureSet WATER		= standard("WATER", TILE_WATER, TILE_WATER2);
	public static final TextureSet HOUSE		= standard("HOUSE", TILE_HOUSE);
	public static final TextureSet FENCE		= standard("FENCE", TILE_FENCE).stitchTo(HOUSE);
	
	// Sophisticated stitching stuff:
	static {
		stitchMutually(PLAINS, SUNFLOWERS);
		WATER.stitchTo(SHORE, ROCK_SHORE, SWAMP);
		SWAMP.stitchTo(SWAMP_HILLS);
		SNOW.stitchTo(SNOW_PINES, SNOW_HILLS, ICE_SPIKES, SNOW_PINES_HILLS);
		SNOW_PINES.stitchTo(SNOW, SNOW_HILLS, ICE_SPIKES, SNOW_PINES_HILLS);
		stitchMutually(MOUNTAINS, MOUNTAINS_NAKED, MOUNTAINS_SNOW_CAPS, MOUNTAINS_ALL);
		DESERT.stitchTo(MESA, BRYCE);
		stitchMutually(PLATEAU_MESA, PLATEAU_MESA_TREES, PLATEAU_SAVANNA, PLATEAU_SAVANNA_M);
		stitchMutually(PLATEAU_MESA_LOW, PLATEAU_MESA_TREES_LOW);
	}
	
	/** Name of the texture pack to write in the config file. */
	public final String name; 
	
	/** The actual textures in this set. */
	public final ResourceLocation[] textures;
	
	/** Texture sets that a tile rendered with this set can be stitched to,
	 * excluding itself. */
	private final Set<TextureSet> stitchTo = new HashSet<TextureSet>();
	
	/** Whether the texture set is part of the standard pack. Only true for
	 * static constants in this class. */
	final boolean isStandard;
	
	private static TextureSet standard(String name, ResourceLocation ... textures) {
		return new TextureSet(true, name, textures);
	}
	
	private TextureSet(boolean isStandard, String name, ResourceLocation ... textures) {
		this.isStandard = isStandard;
		this.name = name;
		this.textures = textures;
	}
	
	public TextureSet(String name, ResourceLocation ... textures) {
		this(false, name, textures);
	}
	
	/** Add other texture sets that this texture set will be stitched to
	 * (but the opposite may be false, in case of asymmetric stitching.) */
	public TextureSet stitchTo(TextureSet ... textureSets) {
		for (TextureSet textureSet : textureSets) {
			stitchTo.add(textureSet);
		}
		return this;
	}
	/** Same as {@link #stitchTo()}, but symmetrical. */
	public TextureSet stitchToMutual(TextureSet ... textureSets) {
		for (TextureSet textureSet : textureSets) {
			stitchTo.add(textureSet);
			textureSet.stitchTo.add(this);
		}
		return this;
	}
	
	/** Whether this texture set should be stitched to the other specified set. */
	public boolean shouldStichTo(TextureSet otherSet) {
		return otherSet == this || stitchTo.contains(otherSet);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof TextureSet)) {
			return false;
		}
		TextureSet set = (TextureSet) obj;
		return this.name.equals(set.name) && Arrays.equals(this.textures, set.textures);
	}
	
	/** A special texture set that is stitched to everything except water. */
	private static class TextureSetShore extends TextureSet {
		public TextureSetShore(String name, ResourceLocation ... textures) {
			super(true, name, textures);
		}
		@Override
		public boolean shouldStichTo(TextureSet otherSet) {
			return otherSet == this || !WATER.shouldStichTo(otherSet);
		}
	}
	
	/** Stitch provided texture sets mutually between each other. */
	public static final void stitchMutually(TextureSet ... sets) {
		for (TextureSet set1 : sets) {
			for (TextureSet set2 : sets) {
				if (set1 != set2) set1.stitchTo.add(set2);
			}
		}
	}
}
