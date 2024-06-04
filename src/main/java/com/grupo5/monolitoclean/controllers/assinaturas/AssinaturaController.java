package com.grupo5.monolitoclean.controllers.assinaturas;

import com.grupo5.monolitoclean.application.dtos.AssinaturaDTO;
import com.grupo5.monolitoclean.application.usecase.assinatura.*;
import com.grupo5.monolitoclean.domain.repository.StatusAssinatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servcad")
public class AssinaturaController {

    private CadastraAssinaturaUC cadastraAssinatura;
    private AssinaturasPorStatusUC assinaturasPorStatus;
    private ListarAssinaturasDoClienteUC listarAssinaturasDoCliente;
    private ListarAssinaturasDoAppUC listarAssinaturasDoApp;
    private VerificaAssinaturaUC verificaAssinatura;

    @Autowired
    public AssinaturaController(CadastraAssinaturaUC cadastraAssinatura,
                                AssinaturasPorStatusUC assinaturasPorStatus,
                                ListarAssinaturasDoClienteUC listarAssinaturasDoCliente,
                                ListarAssinaturasDoAppUC listarAssinaturasDoApp,
                                VerificaAssinaturaUC verificaAssinatura) {
        this.cadastraAssinatura = cadastraAssinatura;
        this.assinaturasPorStatus = assinaturasPorStatus;
        this.listarAssinaturasDoCliente = listarAssinaturasDoCliente;
        this.listarAssinaturasDoApp = listarAssinaturasDoApp;
        this.verificaAssinatura = verificaAssinatura;
    }

    @PostMapping("/assinaturas")
    public AssinaturaDTO cadastraAssinatura(@RequestBody long codCliente, @RequestBody long codApp){
        return cadastraAssinatura.run(codCliente, codApp);
    }

    @GetMapping("/assinaturas/{tipo}")
    public List<AssinaturaDTO> assinaturasPorStatus(@PathVariable StatusAssinatura statusAssinatura){
        return assinaturasPorStatus.run(statusAssinatura);
    }

    @GetMapping("/asscliente/{codcli}")
    public List<AssinaturaDTO> listarAssinaturasDoCliente(@PathVariable long codCliente){
        return listarAssinaturasDoCliente.run(codCliente);
    }

    @GetMapping("/assapp/{codapp}")
    public List<AssinaturaDTO> listarAssinaturasDoApp(@PathVariable long codApp){
        return listarAssinaturasDoApp.run(codApp);
    }

    @GetMapping("/assinvalida/{codass}")
    public boolean verificaAssinatura(@PathVariable long codAssinatura){
        return verificaAssinatura.run(codAssinatura);
    }
}
