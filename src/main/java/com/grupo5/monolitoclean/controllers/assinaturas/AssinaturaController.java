package com.grupo5.monolitoclean.controllers.assinaturas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servcad/assinaturas")
public class AssinaturaController {

    @Autowired
    public AssinaturaController() {
    }
}
