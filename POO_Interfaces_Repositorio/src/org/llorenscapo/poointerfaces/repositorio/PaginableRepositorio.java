package org.llorenscapo.poointerfaces.repositorio;

import org.llorenscapo.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {

    List<Cliente> listar(int desde, int hasta);

}
