package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SongRepository {
	public SongRepository() {
		super();
		Song s1 = new Song(1, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "1975");
		Song s2 = new Song(2, "Imagine", "John Lennon", "Imagine", "1971");
		this.list.add(s1);
		this.list.add(s2);
	}

	private List<Song> list = new ArrayList<Song>();

	public List<Song> getAllSongs() {
		return list;
	}

	public Song getSongById(Integer id) {
		return list.stream().filter((p) -> p.getId().equals(id)).findAny().orElse(null);
	}

	public void addSong(Song s) {
		this.list.add(s);
	}

	public void updateSong(Song s) {
		int index = list.indexOf(s);
		if (index >= 0) {
			list.set(index, s);
		}

	}

	public void removeSong(Song s) {
		int index = list.indexOf(s);
		if (index >= 0) {
			list.remove(index);
		}
	}
}
