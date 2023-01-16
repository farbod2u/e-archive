package io.github.farbod2u.write.repository;

import io.github.farbod2u.entity.FileDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/***
 * @author Saeed Safaeian
 */
@Repository
public interface DocRepository extends JpaRepository<FileDoc, Long> {
}
