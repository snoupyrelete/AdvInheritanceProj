package adv.model;



public class Mustang extends Car
{
	public Mustang ()
	{
		super("Mustang", 160);
		flammability = 0;
	}
	
	@Override
	public boolean isFlammable()
	{
		return false;
	}
	
	@Override
	public boolean isFlameRetardant()
	{
		return true;
	}
	
	@Override
	public boolean isDrenchedInLighterFluid()
	{
		return true;
	}
	
	@Override
	public void setFlammabilityLevel(int level)
	{
		this.flammability = level;
	}
	
	@Override
	public int getFlammabilityLevel()
	{
		return flammability;
	}
}
