package io.collection.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.collection.domain.model.Manga;

@Repository
public interface MangaRepository extends JpaRepository<Manga, Long> {
    
}
