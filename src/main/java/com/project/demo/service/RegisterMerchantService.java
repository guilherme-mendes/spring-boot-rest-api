package com.project.demo.service;

import com.project.demo.model.entity.Merchant;
import com.project.demo.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterMerchantService {

    @Autowired
    private MerchantRepository merchantRepository;

    public Optional<List<Merchant>> getMerchants() {
        return Optional.of(merchantRepository.findAll());
    }
}
