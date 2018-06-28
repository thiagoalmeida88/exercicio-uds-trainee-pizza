package br.com.uds.pizzaria;

import java.util.Set;
import java.util.UUID;

public interface PizzaRepository {

    Pizza save(Pizza pizza);

    Set<Pizza> findAll();

    Pizza findOne(UUID id);

    void delete(UUID id);

}
