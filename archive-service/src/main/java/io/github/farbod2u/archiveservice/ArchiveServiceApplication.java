package io.github.farbod2u.archiveservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "io.github.farbod2u",
        "io.github.farbod2u.archiveservice",
        "io.github.farbod2u.exception.handler"
})
@EntityScan("io.github.farbod2u.*")
@SpringBootApplication
public class ArchiveServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchiveServiceApplication.class, args);
    }

}
