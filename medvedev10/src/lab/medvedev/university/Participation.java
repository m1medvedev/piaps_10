package lab.medvedev.university;

public class Participation {

	private int hours;
	private ResearchAssociate researchAssociate;
	private ScientificPaper scientificPaper;

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public ResearchAssociate getResearchAssociate() {
		return this.researchAssociate;
	}

	public void setResearchAssociate(ResearchAssociate researchAssociate) {
		this.researchAssociate = researchAssociate;
	}

	public ScientificPaper getScientificPaper() {
		return this.scientificPaper;
	}

	public void setScientificPaper(ScientificPaper scientificPaper) {
		this.scientificPaper = scientificPaper;
	}

}