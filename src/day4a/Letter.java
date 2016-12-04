package day4a;

public class Letter implements Comparable<Letter> {

	private char character;
	private int occurances;
	
	public Letter(char character) {
		this.character = character;
		this.occurances = 1;
	}
	
	@Override
	public String toString() {
		return String.valueOf(character);
	}

	@Override
	public int compareTo(Letter o) {
		if (occurances == o.occurances) {
			return Character.compare(character, o.character);
		} else {
			return Integer.compare(o.occurances, occurances);
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + character;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Letter other = (Letter) obj;
		if (character != other.character)
			return false;
		return true;
	}

	public void increment() {
		occurances++;
	}
}
