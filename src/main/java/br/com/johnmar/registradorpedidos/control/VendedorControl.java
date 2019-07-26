package br.com.johnmar.registradorpedidos.control;

import br.com.johnmar.registradorpedidos.dao.VendedorDao;
import br.com.johnmar.registradorpedidos.model.Vendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VendedorControl {

    @Autowired
    VendedorDao vendedorDao;

    @GetMapping("/vendedor")
    public ModelAndView inicio() {
        ModelAndView modelAndView = new ModelAndView("/paginas/vendedor");
        modelAndView.addObject("vendedores", vendedorDao.findAll());
        return modelAndView;
    }

    @PostMapping(path = "/salvarvendedor")
    public ModelAndView cadastrar(Vendedor vendedor) {
        ModelAndView modelAndView = new ModelAndView("/paginas/vendedor");
        vendedorDao.save(vendedor);
        modelAndView.addObject("vendedores", vendedorDao.findAll());
        return modelAndView;
    }



    @GetMapping(path = "/editarvendedor/{idvendedor}")
    public ModelAndView editar(@PathVariable("idvendedor") Integer idVendedor) {

        ModelAndView modelAndView = new ModelAndView("/paginas/vendedor-edit");
        modelAndView.addObject("vendedor", vendedorDao.findById(idVendedor).get());
        return modelAndView;
    }

    @GetMapping(path = "/removervendedor/{idvendedor}")
    public ModelAndView excluir(@PathVariable("idvendedor") Integer idVendedor) {

        vendedorDao.deleteById(idVendedor);
        ModelAndView modelAndView = new ModelAndView("/paginas/vendedor");
        modelAndView.addObject("vendedores", vendedorDao.findAll());
        return modelAndView;
    }
}
