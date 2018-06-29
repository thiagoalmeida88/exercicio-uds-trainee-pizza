package br.com.uds.pizzaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/api/pizzas")
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @PostMapping
    public ResponseEntity<Pizza> criar(@RequestBody PizzaDTO pizza) {
        Pizza pizzaCriada = this.pizzaService.criar(pizza.objectPizza());
        return new ResponseEntity(pizzaCriada.toString(), HttpStatus.CREATED);
    }

    @GetMapping()
    public Set<Pizza> listar() {
        return this.pizzaService.listar();
    }
    @GetMapping("/findBy")
    public Pizza obter(@RequestParam("id")UUID id){return this.pizzaService.obter(id);}

    @DeleteMapping
    public ResponseEntity remover(@RequestParam("id")UUID id){
        this.pizzaService.remover(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @PutMapping
    public ResponseEntity editar(@RequestParam("id")UUID id,@RequestBody Pizza pizza){
        this.pizzaService.editar(id,pizza);
        return new ResponseEntity("Editado com Sucesso!",HttpStatus.OK);
    }
}
