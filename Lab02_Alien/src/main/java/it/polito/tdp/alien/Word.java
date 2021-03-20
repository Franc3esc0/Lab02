package it.polito.tdp.alien;

public class Word {

	private String alienWorld;
	private String translation;
	
	
	public Word(String alienWorld, String translation) {
		
		this.alienWorld = alienWorld;
		this.translation = translation;
	}

	public String getAlienWorld() {
		return alienWorld;
	}

	public void setAlienWorld(String alienWorld) {
		this.alienWorld = alienWorld;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWorld == null) ? 0 : alienWorld.hashCode());
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
		Word other = (Word) obj;
		if (alienWorld == null) {
			if (other.alienWorld != null)
				return false;
		} else if (!alienWorld.equals(other.alienWorld))
			return false;
		return true;
	}
	
}
