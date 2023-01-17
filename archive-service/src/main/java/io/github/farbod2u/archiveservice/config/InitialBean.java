package io.github.farbod2u.archiveservice.config;

import io.github.farbod2u.archiveservice.repository.FolderRepository;
import io.github.farbod2u.entity.Folder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * @author Saeed Safaeian
 */
@Configuration
@RequiredArgsConstructor
public class InitialBean {

    private final FolderRepository folderRepository;

    @Bean
    void initData(){
        if(!folderRepository.existsById("1170650635"))
            folderRepository.save(new Folder("1170650635", "0010", null));
    }
}
