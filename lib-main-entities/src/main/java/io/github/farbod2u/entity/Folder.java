package io.github.farbod2u.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/***
 * @author Saeed Safaeian
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Folder {

    @Id
    private String _id;
    private String folderCode;
    private String branchCode;
}
