package lab.medvedev.university;

public class ScientificPaper {

	private String name;
	private java.util.Date start;
	private java.util.Date end;

	public ScientificPaper(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.Date getStart() {
		return this.start;
	}

	public void setStart(java.util.Date start) {
		this.start = start;
	}

	public java.util.Date getEnd() {
		return this.end;
	}

	public void setEnd(java.util.Date end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "ScientificPaper{" +
				"name='" + name + '\'' +
				", start=" + start +
				", end=" + end +
				'}';
	}
}