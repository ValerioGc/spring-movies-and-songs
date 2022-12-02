package org.movies.song.pkg.pojo;

public class Movie {
	private static int id;
	private static String name;
	
	public Movie(int id, String name) {
		setId(id);
		setName(name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
