package io.github.farbod2u.read.controller;

import io.github.farbod2u.entity.FileDoc;
import io.github.farbod2u.read.service.DocService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author Saeed Safaeian
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/doc-db/read")
public class DocController {

    private final DocService docService;

    @SneakyThrows
    @GetMapping(value = "/{id}")
    public ResponseEntity<InputStreamResource> getById(@PathVariable("id") Long id) {
        FileDoc entity = docService.getById(id);

        return ResponseEntity.ok()
                .contentLength(entity.getContent().length())
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(new InputStreamResource(entity.getContent().getBinaryStream()));
    }

}
