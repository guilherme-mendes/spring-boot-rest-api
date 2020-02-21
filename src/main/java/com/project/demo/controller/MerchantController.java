package com.project.demo.controller;

import com.project.demo.model.entity.Merchant;
import com.project.demo.service.RegisterMerchantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class MerchantController {

    private final RegisterMerchantService registerMerchantService;

    public MerchantController(RegisterMerchantService registerMerchantService) {
        this.registerMerchantService = registerMerchantService;
    }

    @GetMapping(path = "/merchants")
    public List<Merchant> getAllMerchants() {
        return registerMerchantService.getMerchants();
    }

}
