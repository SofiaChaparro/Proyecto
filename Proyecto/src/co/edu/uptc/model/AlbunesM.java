package co.edu.uptc.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class AlbunesM {
String name;
String cover;
String description;
LocalDate releaseDate;
String genre;
String recordLabel;

public String getName() {
	return name;
}

public AlbunesM(String name, String cover, String description, LocalDate releaseDate, String genre,
		String recordLabel) {
	
	this.name = name;
	this.cover = cover;
	this.description = description;
	this.releaseDate = releaseDate;
	this.genre = genre;
	this.recordLabel = recordLabel;
}


public void setName(String name) {
	this.name = name;
}
public String getCover() {
	return cover;
}
public void setCover(String cover) {
	this.cover = cover;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public LocalDate getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate(LocalDate releaseDate) {
	this.releaseDate = releaseDate;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getRecordLabel() {
	return recordLabel;
}
public void setRecordLabel(String recordLabel) {
	this.recordLabel = recordLabel;
}
@Override
public String toString() {
	return "AlbunesM [name=" + name + ", cover=" + cover + ", description=" + description + ", releaseDate="
			+ releaseDate + ", genre=" + genre + ", recordLabel=" + recordLabel + "]";
}

}
