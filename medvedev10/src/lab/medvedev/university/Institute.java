package lab.medvedev.university;

import java.util.*;

public class Institute {

	private String name;
	private String address;
	private Collection<ResearchAssociate> employees;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Collection<ResearchAssociate> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Collection<ResearchAssociate> employees) {
		this.employees = employees;
	}

	/**
	 * 
	 * @param name
	 * @param address
	 */
	public Institute(String name, String address) {
		this.address = address;
		this.name = name;
		this.employees = new ArrayList<>();
	}

	/**
	 * 
	 * @param employee
	 */
	public void hire(ResearchAssociate employee) {
		System.out.println("Hire " + employee);
		this.employees.add(employee);
	}

	/**
	 * 
	 * @param employee
	 */
	public void fire(ResearchAssociate employee) {
		System.out.println("Fire " + employee);
		this.employees.remove(employee);
	}

}