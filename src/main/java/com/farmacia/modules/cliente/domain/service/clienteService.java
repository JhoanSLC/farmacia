package com.farmacia.modules.cliente.domain.service;

import java.util.List;
import java.util.Optional;

import com.farmacia.modules.cliente.domain.entity.Cliente;


public interface clienteService {
    
    public Optional<Cliente> findbyid(String id);
    public List<Cliente> findAll();
    public void add(Cliente cliente);
    public void delete(String id);
    public void update(Cliente cliente);
}
