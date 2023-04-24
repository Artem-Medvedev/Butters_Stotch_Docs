package com.example.db_docs_module.consoleTest;

import com.example.db_docs_module.repository.DocumentRepository;
import org.springframework.boot.CommandLineRunner;

public class TestDB implements CommandLineRunner {

    private final DocumentRepository documentRepository;

    public TestDB( DocumentRepository documentRepository){
        this.documentRepository = documentRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        
    }
}
