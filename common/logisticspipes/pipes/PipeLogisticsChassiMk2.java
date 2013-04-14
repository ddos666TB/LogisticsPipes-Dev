package logisticspipes.pipes;

import net.minecraftforge.common.ForgeDirection;
import buildcraft.api.core.IIconProvider;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import logisticspipes.textures.Textures;
import logisticspipes.textures.Textures.TextureType;

public class PipeLogisticsChassiMk2 extends PipeLogisticsChassi{

	public PipeLogisticsChassiMk2(int itemID) {
		super(itemID);
	}

	@Override
	public TextureType getCenterTexture() {
		return Textures.LOGISTICSPIPE_CHASSI2_TEXTURE;
	}

	@Override
	public int getChassiSize() {
		return 2;
	}


	@Override
	public int getIconIndex(ForgeDirection direction) {
		// TODO Auto-generated method stub
		return 0;
	}
}
