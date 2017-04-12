package adv.model;

import javax.swing.JOptionPane;

public class Arcanine extends Dog {

	public Arcanine() {
		super("Arcanine", 342);
		flammability = 100;
	}

	@Override
	public boolean isFlammable() {
		return true;
	}

	@Override
	public boolean isFlameRetardant() {
		return false;
	}

	@Override
	public boolean isDrenchedInLighterFluid() {
		return true;
	}

	@Override
	public void setFlammabilityLevel(int level) {
		this.flammability = level;
		JOptionPane.showMessageDialog(null, "Flammability level set to " + level);
	}

	@Override
	public int getFlammabilityLevel() {
		return flammability;
	}
}
