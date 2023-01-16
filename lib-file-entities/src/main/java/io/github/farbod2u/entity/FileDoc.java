package io.github.farbod2u.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;


/***
 * @author Saeed Safaeian
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileDoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Lob
    private Blob content;

}
