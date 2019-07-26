package br.com.johnmar.registradorpedidos.dao;

import br.com.johnmar.registradorpedidos.model.Vendedor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface VendedorDao extends PagingAndSortingRepository<Vendedor, Integer> {


}
