package io.github.farbod2u.branchservice.controller;

import io.github.farbod2u.branchservice.service.BranchService;
import io.github.farbod2u.entity.Branch;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/***
 * @author Saeed Safaeian
 */
@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/branch")
public class BranchController {

    private final BranchService branchService;

    @GetMapping
    public ResponseEntity<List<Branch>> getall(){
        return new ResponseEntity<>(branchService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{code}")
    public ResponseEntity<Branch> getByCode(@PathVariable("code") String code){
        return new ResponseEntity<>(branchService.getByCode(code), HttpStatus.OK);
    }

}
