package com.project.demo.service;

import com.project.demo.model.entity.Merchant;
import com.project.demo.repository.MerchantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterMerchantService {

    final MerchantRepository merchantRepository;

    public RegisterMerchantService(MerchantRepository merchantRepository) {
        this.merchantRepository = merchantRepository;
    }

    public List<Merchant> getMerchants() {
        return merchantRepository.findAll();
    }
}
