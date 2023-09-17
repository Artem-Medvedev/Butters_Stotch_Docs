package com.example.db_docs_module.controllers;

import com.example.db_docs_module.enity.Document;
import com.example.db_docs_module.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/documents", produces = "application/json")
public class DocumentController {

    private final DocumentRepository documentRepository;

    @Autowired
    public DocumentController(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @GetMapping("/{id}")
    public Document getDocument(@PathVariable("id") Long id) {
        Optional<Document> document = documentRepository.findById(id);
        return document.orElseGet(Document::new);
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Document saveDocument(@RequestBody Document document) {
        return documentRepository.save(document);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteDocument(@PathVariable("id") Long id) {
        documentRepository.deleteById(id);
    }

    @GetMapping
    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }
}
