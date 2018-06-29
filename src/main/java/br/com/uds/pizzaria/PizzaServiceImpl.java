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

    @Override
    public void editar(UUID id, Pizza pizza) {
        Pizza pizzaRecuperada = this.obter(id);
        remover(id);
        pizzaRecuperada.setMassa(pizza.getMassa());
        pizzaRecuperada.setMolho(pizza.getMolho());
        pizzaRecuperada.setQueijo(pizza.getQueijo());
        pizzaRecuperada.setSabor(pizza.getSabor());
        pizzaRecuperada.setTempoDePreparo(pizza.getTempoDePreparo());
        this.repository.save(pizzaRecuperada);
    }

}
