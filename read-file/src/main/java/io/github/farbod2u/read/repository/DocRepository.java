package io.github.farbod2u.read.repository;

import io.github.farbod2u.entity.Doc;
import org.springframework.data.jpa.repository.JpaRepository;

/***
 * @author Saeed Safaeian
 */
public interface DocRepository extends JpaRepository<Doc, Long> {
}
