package br.com.johnmar.registradorpedidos.dao;

import br.com.johnmar.registradorpedidos.model.Pedido;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PedidoDao extends PagingAndSortingRepository<Pedido , Integer> {

}
