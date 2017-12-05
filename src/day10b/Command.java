package day10b;

public abstract class Command {

	protected int botId;
	
	public abstract boolean execute(Bots bots);
	
}
