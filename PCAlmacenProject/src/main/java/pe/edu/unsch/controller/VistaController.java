package pe.edu.unsch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.unsch.service.ProductoServicioImpl;

@Controller
@RequestMapping("/view")
public class VistaController {

	@Autowired
	private ProductoServicioImpl prdService;
	
    @GetMapping("/productos")
    public String lista(Model model) {
    	
    	model.addAttribute("productos", prdService.listarPorProducto());
    	
    	return "/index";
    }
}
