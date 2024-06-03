package com.grupo5.monolitoclean.controllers.aplicativos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servcad/aplicativos")
public class AplicativoController {

    @Autowired
    public AplicativoController() {
    }
}
