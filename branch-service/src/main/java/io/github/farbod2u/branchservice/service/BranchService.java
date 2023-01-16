package io.github.farbod2u.branchservice.service;

import io.github.farbod2u.branchservice.repository.BranchRepository;
import io.github.farbod2u.entity.Branch;
import io.github.farbod2u.exception.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * @author Saeed Safaeian
 */
@Service
@RequiredArgsConstructor
public class BranchService {

    private final BranchRepository branchRepository;

    public List<Branch> getAll(){
        return branchRepository.findAll();
    }

    public Branch getByCode(String code){
        return branchRepository.findById(code)
                .orElseThrow(EntityNotFoundException::new);
    }
}
