package ucr.ac.cr.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication @ComponentScan({ "ucr.ac.cr.controller","ucr.ac.cr.repository", "ucr.ac.cr.service" } )
@EnableJpaRepositories("ucr.ac.cr.repository")
public class ProjectSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectSpringApplication.class, args);
    }

}
