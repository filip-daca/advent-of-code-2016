package day10b;

public class Bot {

	private Integer low = null, hi = null, output = null;
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
		} else {
			lowBot.setOutput(low);
		}
		
		if (!hiOutput) {
			hiBot.take(hi);
		} else {
			hiBot.setOutput(hi);
		}
		
		low = null;
		hi = null;
		
		return true;
	}
	
	public boolean canTake() {
		return low == null || hi == null;
	}
	
	public void setOutput(Integer output) {
		this.output = output;
	}
	
	public Integer getOutput() {
		return output;
	}
}
