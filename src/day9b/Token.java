package day9b;

public abstract class Token {
	
	public int getTokenLength() {
		return toString().length();
	}

	public Token getPart(int scope) {
		if (scope <= getTokenLength()) {
			return new StringToken(toString().substring(0, scope));
		} else {
			return this;
		}
	}
	
	public Token getRemains(int scope) {
		return new StringToken(toString().substring(scope));
	}

	public abstract Multiplier getMultiplier();
	
	public abstract int getCodeLength();

	
	
}
