package br.com.questao1;

public class Vip extends Ingresso {

    private double ValorAdicional;

    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        ValorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return ValorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        ValorAdicional = valorAdicional;
    }
        public void imprimeIngresso(){
            System.out.println("Ingresso VIP - Valor: " +(getValorIngresso() +getValorAdicional()));

        }
    }



