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
public class Branch {

    @Id
    private String branchCode;
    private String branchName;

}
