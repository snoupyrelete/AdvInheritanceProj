package adv.model;
/**
 * @author Dylan Robson
 * @author Kaden Martinsen
 * @author Jacob Nazborne
 * @author Braeden Moffat
 */
public interface Flammable {
	public boolean isFlammable();
	public boolean isFlameRetardant();
	public boolean isDrenchedInLighterFluid();
	
	public int flammability = 0;
	public void setFlammabilityLevel(int level);
	public int getFlammabilityLevel();
}
