package lab.medvedev.university;

import java.util.*;

public class Faculty {

	private String name;
	private Collection<Institute> institutes;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Institute> getInstitutes() {
		return this.institutes;
	}

	public void setInstitutes(Collection<Institute> institutes) {
		this.institutes = institutes;
	}

	/**
	 * 
	 * @param name
	 */
	public Faculty(String name) {
		this.name = name;
		this.institutes = new ArrayList<>();
	}

	/**
	 * 
	 * @param institute
	 */
	public void addInstitute(Institute institute) {
		this.institutes.add(institute);
	}

	/**
	 * 
	 * @param institute
	 */
	public void removeInstitute(Institute institute) {
		this.institutes.remove(institute);
	}

}