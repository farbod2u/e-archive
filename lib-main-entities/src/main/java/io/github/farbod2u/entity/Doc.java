package io.github.farbod2u.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
    private String folderId;
    private Timestamp docDate;
    private String fileName;
}
