package com.example.db_docs_module.controllers;

import com.example.db_docs_module.enity.Document;
import com.example.db_docs_module.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/documents", produces = "application/json")
public class DocumentController {

    private DocumentRepository documentRepository;
    @Autowired
    public DocumentController(DocumentRepository documentRepository){
        this.documentRepository = documentRepository;
    }

    public Document getDocument(){
        return new Document();
    }

    public void saveDocument(){

    }

    public void deleteDocument(){

    }

    public List<Document> getAllDocuments(){
        return null;
    }
}
