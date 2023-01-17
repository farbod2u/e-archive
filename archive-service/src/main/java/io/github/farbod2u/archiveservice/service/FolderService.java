package io.github.farbod2u.archiveservice.service;

import io.github.farbod2u.archiveservice.repository.FolderRepository;
import io.github.farbod2u.entity.Folder;
import io.github.farbod2u.exception.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/***
 * @author Saeed Safaeian
 */
@Service
@RequiredArgsConstructor
public class FolderService {

    private final FolderRepository folderRepository;

    public Folder getById(String id){
        return folderRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    public Folder save(Folder entity){
        return folderRepository.save(entity);
    }

}
