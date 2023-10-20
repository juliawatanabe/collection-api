package io.collection.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String originalLang;
    private String translationLang;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalLang() {
        return originalLang;
    }
        
    public void setOriginalLang(String originalLang) {
        this.originalLang = originalLang;
    }
        
    public String getTranslationLang() {
        return translationLang;
    }
        
    public void setTranslationLang(String translationLang) {
        this.translationLang = translationLang;
    }

}
