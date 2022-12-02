package org.movies.song.pkg.pojo;

public class Song {
	private static int id;
	private static String name;
	
	public Song(int id, String name) {
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
