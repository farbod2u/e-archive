package io.github.farbod2u.write.service;

import io.github.farbod2u.entity.Doc;
import io.github.farbod2u.exception.EntityNotFoundException;
import io.github.farbod2u.exception.RequestException;
import io.github.farbod2u.write.repository.DocRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.engine.jdbc.BlobProxy;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/***
 * @author Saeed Safaeian
 */

@Service
@RequiredArgsConstructor
public class DocService {

    private final DocRepository docRepository;

    public Doc save(MultipartFile file) {
        Doc entity = new Doc();
        try {
            entity.setContent(BlobProxy.generateProxy(file.getInputStream(), file.getSize()));
        } catch (Exception e) {
            throw new RequestException(e.getMessage());
        }
        return docRepository.save(entity);
    }

    public Doc getById(Long id) {
        return docRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
