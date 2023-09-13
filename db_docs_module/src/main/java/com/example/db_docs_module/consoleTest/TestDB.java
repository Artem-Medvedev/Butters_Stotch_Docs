package com.example.db_docs_module.consoleTest;

import com.example.db_docs_module.enity.Document;
import com.example.db_docs_module.repository.DocumentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Service
@Slf4j
public class TestDB implements CommandLineRunner {
/*
Don't forget to connect to database
 */
    private final DocumentRepository documentRepository;

    public TestDB( DocumentRepository documentRepository){
        this.documentRepository = documentRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Path path = Paths.get("C:\\Users\\Artem\\IdeaProjects\\Butters_Stotch_Docs\\db_docs_module\\resume_version2.0.pdf");
        byte[] pdfData = Files.readAllBytes(path);

        Document doc = new Document(1L,"bruh", ".pdf", pdfData,"");
        documentRepository.save(doc);

        Document document = documentRepository.findAll().get(0);


        try (FileOutputStream fos = new FileOutputStream(document.getDocumentName() + document.getDocumentExtension())) {
            fos.write(document.getDocument()); // Write the byte array to the file
            System.out.println("PDF file saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
