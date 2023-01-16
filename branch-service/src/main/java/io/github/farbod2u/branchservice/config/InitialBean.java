package io.github.farbod2u.branchservice.config;

import io.github.farbod2u.branchservice.repository.BranchRepository;
import io.github.farbod2u.entity.Branch;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * @author Saeed Safaeian
 */
@Configuration
@RequiredArgsConstructor
public class InitialBean {

    private final BranchRepository branchRepository;

    @Bean
    void initData() {
        if (branchRepository.findById("0010").isEmpty())
            branchRepository.save(new Branch("0010", "Branch One"));

        if (branchRepository.findById("0020").isEmpty())
            branchRepository.save(new Branch("0020", "Branch Two"));

        if (branchRepository.findById("0030").isEmpty())
            branchRepository.save(new Branch("0030", "Branch Three"));

        if (branchRepository.findById("0040").isEmpty())
            branchRepository.save(new Branch("0040", "Branch Four"));
    }
}
