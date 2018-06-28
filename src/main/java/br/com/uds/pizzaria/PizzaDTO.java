package br.com.uds.pizzaria;

public class PizzaDTO {


    private String massa;
    private String queijo;
    private String molho;
    private String sabor;

    private int tempoDePreparo;


    public Pizza objectPizza(){
        return new Pizza(massa, queijo, molho, sabor, tempoDePreparo);
    }
}
