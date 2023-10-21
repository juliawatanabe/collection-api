package io.collection.service;

import io.collection.domain.model.Manga;

//encapsulamento - pilares de poo

public interface MangaService {
    
    Manga findById(Long id);

    Manga create(Manga mangaToCreate);
}
