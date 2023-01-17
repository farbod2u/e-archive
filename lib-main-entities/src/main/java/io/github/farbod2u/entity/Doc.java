package io.github.farbod2u.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.sql.Timestamp;

/***
 * @author Saeed Safaeian
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doc {

    @Id
    private String _id;
    private Timestamp docDate;
    private String fileName;

    @DocumentReference(lookup = "{ 'folderCode' : ?#{#traget} }")
    private Folder folder;
}
