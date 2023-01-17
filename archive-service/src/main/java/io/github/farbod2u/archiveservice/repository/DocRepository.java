package io.github.farbod2u.archiveservice.repository;

import io.github.farbod2u.entity.Doc;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/***
 * @author Saeed Safaeian
 */
@Repository
public interface DocRepository extends MongoRepository<Doc, String> {
}
