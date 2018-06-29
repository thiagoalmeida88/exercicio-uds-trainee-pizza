package br.com.uds.pizzaria;

public class PizzaDTO {

    private String massa;
    private String queijo;
    private String molho;
    private String sabor;

    private int tempoDePreparo;

    public Pizza transformaParaObjeto(){
        return new Pizza(massa,queijo,molho,sabor,tempoDePreparo);
    }

    public String getMassa() {
        return massa;
    }

    public String getQueijo() {
        return queijo;
    }

    public String getMolho() {
        return molho;
    }

    public String getSabor() {
        return sabor;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }
}
