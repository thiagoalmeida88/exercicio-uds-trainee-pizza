package br.com.uds.pizzaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class PizzaServiceImpl implements PizzaService {


    @Autowired
    private PizzaRepository repository;

    @Override
    public Pizza criar(Pizza pizza) {
        return this.repository.save(pizza);
    }

    @Override
    public Set<Pizza> listar() {
        return this.repository.findAll();
    }

    @Override
    public Pizza obter(UUID id) {
        return this.repository.findOne(id);
    }

    @Override
    public void remover(UUID id) {
        this.repository.delete(id);
    }

}
