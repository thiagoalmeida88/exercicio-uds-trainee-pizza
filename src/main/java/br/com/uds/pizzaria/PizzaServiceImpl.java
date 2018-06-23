package br.com.uds.pizzaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaServiceImpl implements PizzaService {


    @Autowired
    private PizzaRepository repository;

    @Override
    public Pizza criar(Pizza pizza) {
        return this.repository.save(pizza);
    }

}
