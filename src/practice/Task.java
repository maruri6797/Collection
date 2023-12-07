package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
	private LocalDate date;
	private String content;
	
	public Task(LocalDate date, String content) {
		this.date = date;
		this.content = content;
	}

	public String getContent() {
		return content;
	}


	public LocalDate getDate() {
		return date;
	}
	
	
	@Override
    public int compareTo(Task other) {
        return this.date.compareTo(other.date);
    }

}
