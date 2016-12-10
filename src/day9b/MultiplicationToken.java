package day9b;

public class MultiplicationToken extends Token {

	private int len;
	private int count;
	
	public MultiplicationToken(int fragmentLength, int count) {
		this.len = fragmentLength;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "(" + len + "x" + count + ")";
	}
	
	@Override
	public Multiplier getMultiplier() {
		return new Multiplier(len, count);
	}
	
	@Override
	public int getCodeLength() {
		return 0;
	}
	
}
