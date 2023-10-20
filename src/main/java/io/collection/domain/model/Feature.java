package io.collection.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_feature")
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String coverImage;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoverImage() {
        return coverImage;
    }
        
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }
        
    public String getDescription() {
        return description;
    }
        
    public void setDescription(String description) {
        this.description = description;
    }

}
