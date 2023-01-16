package io.github.farbod2u.branchservice.repository;

import io.github.farbod2u.entity.Branch;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/***
 * @author Saeed Safaeian
 */
@Repository
public interface BranchRepository extends MongoRepository<Branch, String> {
}
