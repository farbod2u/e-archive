package io.github.farbod2u.archiveservice.repository;

import io.github.farbod2u.entity.Folder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/***
 * @author Saeed Safaeian
 */
@Repository
public interface FolderRepository extends MongoRepository<Folder, String> {
}
