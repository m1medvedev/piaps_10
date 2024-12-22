package lab.medvedev.university;

import java.util.*;

public class Lecturer extends ResearchAssociate {

	private Collection<Course> courses;

	/**
	 * 
	 * @param name
	 * @param fieldOfStudy
	 */
	public Lecturer(String name, String fieldOfStudy) {
		super(name, fieldOfStudy);
		this.courses = new ArrayList<>();
	}

	/**
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		this.courses.add(course);
	}

	/**
	 * 
	 * @param course
	 */
	public void removeCourse(Course course) {
		this.courses.remove(course);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}
		Lecturer lecturer = (Lecturer) o;
		return Objects.equals(courses, lecturer.courses);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), courses);
	}

	@Override
	public String toString() {
		return "Lecturer{" +
				"courses=" + courses +
				'}';
	}
}