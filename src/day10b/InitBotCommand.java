package day10b;

public class InitBotCommand extends Command {

	int value;
	
	public InitBotCommand(int value, int botId) {
		this.botId = botId;
		this.value = value;
	}
	
	@Override
	public boolean execute(Bots bots) {
		if (bots.get(botId).canTake()) {
			System.out.println("[" + botId + "] <- " + value);
			bots.get(botId).take(value);
			return true;
		} else {
			return false;
		}
	}

}
