package io.github.farbod2u.archiveservice.controller;

import io.github.farbod2u.archiveservice.service.FolderService;
import io.github.farbod2u.entity.Folder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author Saeed Safaeian
 */
@RestController
@RequestMapping("/api/v1/folder")
@RequiredArgsConstructor
public class FolderController {

    private final FolderService folderService;

    @GetMapping("/{foldercode}")
    public ResponseEntity<Folder> getById(@PathVariable("foldercode") String foldercode){
        return new ResponseEntity<>(folderService.getById(foldercode), HttpStatus.OK);
    }
}
