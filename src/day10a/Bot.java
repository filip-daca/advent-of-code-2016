package day10a;

public class Bot {

	private Integer low = null, hi = null;
	int id;
	
	public Bot(int id) {
		this.id = id;
	}
	
	public void take(int chip) {
		if (low == null) {
			low = chip;
		} else {
			if (low > chip) {
				hi = low;
				low = chip;
			} else {
				hi = chip;
			}
			
			if (low == 17 && hi == 61) {
				System.out.println("FOUND BOT: " + id);
			}
		}
	}

	public boolean give(boolean lowOutput, boolean hiOutput, Bot lowBot, Bot hiBot) {
		if (low == null || hi == null) {
			return false;
		}
		
		if (!lowOutput && !lowBot.canTake()) {
			return false;
		}
		
		if (!hiOutput && !hiBot.canTake()) {
			return false;
		}
		
		if (!lowOutput) {
			lowBot.take(low);
		}
		
		if (!hiOutput) {
			hiBot.take(hi);
		}
		
		low = null;
		hi = null;
		
		return true;
	}
	
	public boolean canTake() {
		return low == null || hi == null;
	}
}
