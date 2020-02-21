package com.project.demo;

import com.project.demo.model.entity.Merchant;
import com.project.demo.repository.MerchantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final MerchantRepository merchantRepository;

    DemoApplication(MerchantRepository merchantRepository) {
        this.merchantRepository = merchantRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Merchant guilherme = new Merchant(null, "Guilherme", "04590615185", "Rua 10");
        Merchant filipe = new Merchant(null, "Filipe", "0459061578", "Rua 12");

        merchantRepository.saveAll(Arrays.asList(guilherme, filipe));
    }
}
