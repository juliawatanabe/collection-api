package io.collection.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.collection.domain.model.Manga;
import io.collection.service.MangaService;

@RestController
@RequestMapping("/manga")
public class MangaController {
    
    private final MangaService mangaService; 

    public MangaController(MangaService mangaService) {
        this.mangaService = mangaService;
    }

    //método GET
    //resposta para o metódo que mostra o tipo de retorno desejado
    @GetMapping("/{id}")//especifica o path parameter
    public ResponseEntity<Manga> findById(@PathVariable Long id) {
        var manga = mangaService.findById(id);
        return ResponseEntity.ok(manga);
    }

    //método POST
    public ResponseEntity<Manga> create(@RequestBody Manga mangaToCreate) {
        var mangaCreated = mangaService.create(mangaToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(mangaCreated.getId())
            .toUri();
        return ResponseEntity.created(location).body(mangaCreated);
    }
}
