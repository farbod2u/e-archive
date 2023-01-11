package io.github.farbod2u.write.controller;

import io.github.farbod2u.entity.Doc;
import io.github.farbod2u.write.service.DocService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/***
 * @author Saeed Safaeian
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/doc-db/write")
public class DocController {

    private final DocService docService;

    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> save(@RequestParam("file") MultipartFile file) {
        Doc entity = docService.save(file);
        return ResponseEntity.ok()
                .body("{'id' : '" + entity.getId().toString() + "'}");
    }

    @SneakyThrows
    @GetMapping(value = "/{id}")
    public ResponseEntity<InputStreamResource> getById(@PathVariable("id") Long id) {
        Doc entity = docService.getById(id);

        return ResponseEntity.ok()
                .contentLength(entity.getContent().length())
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(new InputStreamResource(entity.getContent().getBinaryStream()));
    }

}
