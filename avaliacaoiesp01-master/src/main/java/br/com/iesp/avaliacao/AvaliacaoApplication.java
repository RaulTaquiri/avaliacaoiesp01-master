package br.com.iesp.avaliacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AvaliacaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvaliacaoApplication.class, args);
    }

}
