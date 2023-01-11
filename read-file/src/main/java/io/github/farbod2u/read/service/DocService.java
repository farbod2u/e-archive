package io.github.farbod2u.read.service;

import io.github.farbod2u.entity.Doc;
import io.github.farbod2u.exception.EntityNotFoundException;
import io.github.farbod2u.read.repository.DocRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/***
 * @author Saeed Safaeian
 */

@Service
@RequiredArgsConstructor
public class DocService {

    private final DocRepository docRepository;

    public Doc getById(Long id) {
        return docRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
