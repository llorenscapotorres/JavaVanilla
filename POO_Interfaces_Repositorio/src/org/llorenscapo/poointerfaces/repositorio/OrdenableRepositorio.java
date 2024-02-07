package org.llorenscapo.poointerfaces.repositorio;

import org.llorenscapo.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);

}
