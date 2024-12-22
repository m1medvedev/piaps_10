package lab.medvedev.university;

import java.util.*;

public class ResearchAssociate extends Employee {

	protected String fieldOfStudy;
	protected Collection<ScientificPaper> scientificPapers;

	/**
	 *
	 * @param name
	 * @param fieldOfStudy
	 */
	public ResearchAssociate(String name, String fieldOfStudy) {
		this.name = name;
		this.fieldOfStudy = fieldOfStudy;
		this.scientificPapers = new ArrayList<>();
	}

	public ResearchAssociate() {
		this.scientificPapers = new ArrayList<>();
	}

	public String getFieldOfStudy() {
		return this.fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public Collection<ScientificPaper> getScientificPapers() {
		return this.scientificPapers;
	}

	public void setScientificPapers(Collection<ScientificPaper> scientificPapers) {
		this.scientificPapers = scientificPapers;
	}

	/**
	 * 
	 * @param scientificPaper
	 */
	public void write(ScientificPaper scientificPaper) {
		scientificPaper.setStart(new Date());
		scientificPapers.add(scientificPaper);
		System.out.println("Writing scientific paper... " + scientificPaper);
	}

	/**
	 * 
	 * @param scientificPaper
	 */
	public void publishResults(ScientificPaper scientificPaper) {
		scientificPaper.setEnd(new Date());
		System.out.println("Publishing scientific paper... " + scientificPaper);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ResearchAssociate that = (ResearchAssociate) o;
		return Objects.equals(fieldOfStudy, that.fieldOfStudy) && Objects.equals(
				scientificPapers, that.scientificPapers);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fieldOfStudy, scientificPapers);
	}

	@Override
	public String toString() {
		return "ResearchAssociate{" +
				"fieldOfStudy='" + fieldOfStudy + '\'' +
				", scientificPapers=" + scientificPapers +
				'}';
	}
}