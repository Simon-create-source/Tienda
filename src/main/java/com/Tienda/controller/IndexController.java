
package com.Tienda.controller;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Ahora se usa arquitectura MVC");
        
       /* String mensaje = "estamos en la semana 4, saludos";
        model.addAttribute(mensaje);
        
        Cliente cliente = new Cliente("Simon", "osorio", "simonosorio@gmail.com", "6969-6969");
        model.addAttribute("cliente", cliente);
        
        Cliente cliente2 = new Cliente("juen", "lopez", "juenlopez@gmail.com", "6959-6969");
        var clientes = Arrays.asList(cliente, cliente2);*/
       
       var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        
        return "index";
    }
}
