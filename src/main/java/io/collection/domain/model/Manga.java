package io.collection.domain.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "tb_manga")
public class Manga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String author;
    private String art;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Feature> features;

    private String volume;
    private String publisher;
    private String edition;
    private String datePublication;
    private String demographic;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Language> languages;

    private List<String> genres;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
        
    public void setName(String name) {
        this.name = name;
    }
        
    public String getAuthor() {
        return author;
    }
        
    public void setAuthor(String author) {
        this.author = author;
    }
        
    public String getArt() {
        return art;
    }
        
    public void setArt(String art) {
        this.art = art;
    }
        
    public List<Feature> getFeatures() {
        return features;
    }
        
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
        
    public String getVolume() {
        return volume;
    }
        
    public void setVolume(String volume) {
        this.volume = volume;
    }
        
    public String getPublisher() {
        return publisher;
    }
        
     public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
        
    public String getEdition() {
        return edition;
    }
        
    public void setEdition(String edition) {
        this.edition = edition;
    }
        
    public String getDatePublication() {
        return datePublication;
    }
        
    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }
        
    public List<Language> getLanguages() {
        return languages;
    }
        
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }
        
    public String getDemographic() {
        return demographic;
    }
        
    public void setDemographic(String demographic) {
        this.demographic = demographic;
    }
        
    public List<String> getGenres() {
        return genres;
    }
        
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }
        
}
