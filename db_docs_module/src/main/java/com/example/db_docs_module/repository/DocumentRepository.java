package com.example.db_docs_module.repository;

import com.example.db_docs_module.enity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
