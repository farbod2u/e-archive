package io.github.farbod2u.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

/***
 * @author Saeed Safaeian
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Folder {

    @Id
    private String folderCode;
    private String branchCode;

    @DocumentReference(lazy = true)
    @ReadOnlyProperty
    private List<Doc> docs;
}
