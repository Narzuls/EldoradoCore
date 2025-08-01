
package net.mcreator.eldoradocore.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class EldoradoSandstoneBrickPressurePlateBlock extends PressurePlateBlock {
	public EldoradoSandstoneBrickPressurePlateBlock() {
		super(Sensitivity.MOBS, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape().forceSolidOn(),
				BlockSetType.IRON);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
