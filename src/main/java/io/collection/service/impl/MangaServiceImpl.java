package io.collection.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import io.collection.domain.model.Manga;
import io.collection.domain.repository.MangaRepository;
import io.collection.service.MangaService;

//camada de negócio/serviço
@Service
public class MangaServiceImpl implements MangaService {

    private final MangaRepository mangaRepository;

    public MangaServiceImpl(MangaRepository mangaRepository) {
        this.mangaRepository = mangaRepository;
    }

    @Override
    public Manga findById(Long id) {
        return mangaRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Manga create(Manga mangaToCreate) {
        if (mangaToCreate.getId() != null && mangaRepository.existsById(mangaToCreate.getId())) {
            throw new IllegalArgumentException("This manga ID already exists.");
        }
        return mangaRepository.save(mangaToCreate);
    }
    
}
