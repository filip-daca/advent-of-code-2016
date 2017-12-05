package day10b;

public class GiveCommand extends Command {

	int lowBotId, hiBotId;
	boolean lowOutput, hiOutput;
	
	public GiveCommand(int botId, boolean lowOutput, int lowBotId, boolean hiOutput, int hiBotId) {
		this.botId = botId;
		this.lowOutput = lowOutput;
		this.lowBotId = lowBotId;
		this.hiOutput = hiOutput;
		this.hiBotId = hiBotId;
	}

	@Override
	public boolean execute(Bots bots) {
		System.out.println("[" + botId + "] L -> " + (lowOutput?"O":"") + lowBotId + " H -> " + (hiOutput?"O":"") + hiBotId);
		return bots.get(botId).give(lowOutput, hiOutput, bots.get(lowBotId), bots.get(hiBotId));
	}

}
