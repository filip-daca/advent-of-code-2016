package day10a;

public abstract class Command {

	protected int botId;
	
	public abstract boolean execute(Bots bots);
	
}
