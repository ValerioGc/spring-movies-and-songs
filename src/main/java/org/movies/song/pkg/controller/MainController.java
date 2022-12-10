package org.movies.song.pkg.controller;

import org.movies.song.pkg.pojo.Movie;
import org.movies.song.pkg.pojo.Song;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
		
// Routes
	
	@GetMapping("/")
	public String getHome(Model model)  {
		String name = "Valerio";
		model.addAttribute("name", name);
		return "home";
	}
	
	@GetMapping("/movies")
	public String getMovies(Model model)  {
		
		List <Movie> movies = new ArrayList<>();
		
		movies.add(new Movie(1, "Movie 2"));
		movies.add(new Movie(2, "Movie 3"));
		movies.add(new Movie(3, "Movie 4"));
		movies.add(new Movie(4, "Movie 5"));
		
		model.addAttribute("obj", movies);
		model.addAttribute("model", "movies");

		return "movies-songs";
	}
	
	@GetMapping("/movies/{id}")
	public String getMovieDetails(@PathVariable("id") int id, Model model) {
	
		model.addAttribute("list", model);
		
		return "details";
	}
	
	
	@GetMapping("/songs")
	public String getSongs(Model model)  {
		
		List <Song> songs = new ArrayList<>();
		
		songs.add(new Song(1, "Song 1"));
		songs.add(new Song(2, "Song 2"));
		songs.add(new Song(3, "Song 3"));
		songs.add(new Song(4, "Song 4"));
		
		model.addAttribute("obj", songs);
		model.addAttribute("model", "songs");
		
		return "movies-songs";
	}
	
	
	@GetMapping("/songs/{id}")
	public String getSongDetails(@PathVariable("id") int id, Model model) {		

		model.addAttribute("list", model);

		return "details";
	}
}
