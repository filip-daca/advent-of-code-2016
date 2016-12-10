package day9b;

public class StringToken extends Token {
	
	private String s;
	
	public StringToken(String s) {
		this.s = s;
	}
	
	@Override
	public String toString() {
		return s;
	}

	@Override
	public Multiplier getMultiplier() {
		return new Multiplier(0, 0);
	}
	
	@Override
	public int getCodeLength() {
		return getTokenLength();
	}
	
}
