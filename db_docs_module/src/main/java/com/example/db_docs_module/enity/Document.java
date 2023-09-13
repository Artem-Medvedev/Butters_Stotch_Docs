package com.example.db_docs_module.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@Table(name = "documents")
@NoArgsConstructor(force = true)
public class Document {
    @Id
    @Column(name = "document_id")
    private final long id;
    @Column(name = "document_name")
    private final String documentName;
    @Column(name = "document_extension")
    private final String documentExtension;
    @Column(name = "document_data")
    private final byte[] document;
    @Column(name = "document_version")
    private final String documentVersion;
}
