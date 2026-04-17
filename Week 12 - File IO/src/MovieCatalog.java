//Name: Saran Jompachoke
//ID: 6887056
//Section: 2

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MovieCatalog {
	
	private List<Movie> movies = null;
	
	MovieCatalog()
	{
		movies = new ArrayList<Movie>();
	}
	
	public List<Movie> getAllMovies()
	{
		return movies;
	}
	
	public void loadMovies(String filename)
	{
		//********************* YOUR CODE HERE **************************//
		try {
			FileReader reader = new FileReader(filename);
			CSVParser parser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader);
			
			for (CSVRecord record : parser) {
				String title = record.get("Movie Title");
				String genre = record.get("Genre");
				String leadStudio = record.get("Lead Studio");
				double audienceScore = Double.parseDouble(record.get("Audience Score %").trim());
				double profitability = Double.parseDouble(record.get("Profitability").trim());
				double rottenTomatoes = Double.parseDouble(record.get("Rotten Tomatoes %").trim());
				
				double worldwideGross = Double.parseDouble(record.get("Worldwide Gross").replace('$', ' ').trim());
				int year = Integer.parseInt(record.get("Year").trim());
				
				Movie movie = new Movie(title, genre, leadStudio, audienceScore, profitability, rottenTomatoes, worldwideGross, year);
				movies.add(movie);
			}
			
			parser.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//**************************************************************//
	}
	
	public List<Movie> searchByTitle(String keyword)
	{
		//********************* YOUR CODE HERE **************************//
		List<Movie> result = new ArrayList<Movie>();
		for (Movie movie : movies) {
			if (movie.getTitle().contains(keyword)) {
				result.add(movie);
			}
		}
		return result;
		//**************************************************************//
	}
	
	public List<Movie> searchByRottenTomatoesScores(double lowScore , double highScore)
	{
		//********************* YOUR CODE HERE **************************//
		List<Movie> result = new ArrayList<Movie>();
		
		for (Movie movie : movies) {
			double score = movie.getRottenTomatoesScore();
			
			if (score >= lowScore && score <= highScore) {
				result.add(movie);
			}
		}
		
		return result;
		//**************************************************************//
	}
	
	public static void saveMoviesJSON(List<Movie> movieList, String outFilename)
	{
		//********************* YOUR CODE HERE **************************//
		try {
			// GsonBuilder + setPrettyPrinting() Challenge
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(outFilename));
			writer.write(gson.toJson(movieList));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//**************************************************************//
	}
}
