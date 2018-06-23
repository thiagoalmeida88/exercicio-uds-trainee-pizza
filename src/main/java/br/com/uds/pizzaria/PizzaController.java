package br.com.uds.pizzaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pizzas")
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @PostMapping
    public ResponseEntity criar(@RequestBody Pizza pizza){
        Pizza pizzaCriada = this.pizzaService.criar(pizza);
        return new ResponseEntity(pizzaCriada.toString(),HttpStatus.CREATED);
    }
}
