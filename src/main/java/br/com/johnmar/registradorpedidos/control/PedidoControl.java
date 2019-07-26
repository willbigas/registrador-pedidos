package br.com.johnmar.registradorpedidos.control;

import br.com.johnmar.registradorpedidos.dao.PedidoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PedidoControl {

    @Autowired
    PedidoDao pedidoDao;

    @GetMapping("/pedido")
    public ModelAndView inicio() {
        ModelAndView modelAndView = new ModelAndView("paginas/pedido");
        modelAndView.addObject("pedidos" , pedidoDao.findAll());
        return modelAndView;
    }

}
