package com.example.db_docs_module.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Document {

    @Id
    private final long id;
    private final String documentName;
    private final String documentExtension;
    private final byte[] document;
}
