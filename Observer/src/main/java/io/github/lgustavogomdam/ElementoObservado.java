package io.github.lgustavogomdam;

public class ElementoObservado extends LocalizacaoObjtObserver {
    public ElementoObservado(LocalizacaoObjtSubject coords) {
        super(coords);
    }
    @Override
    public void update() {
        
        System.out.println("------|Visão Observado|------\n");
        
        System.out.println("Coordenadas Pessoa 1 (Observado):\n"
                + "Valor X: " + coords.getState().coordenadasObservado[0] + 
                "\nValor Y: " + coords.getState().coordenadasObservado[1] + "\n");
        
        System.out.println("Coordenadas Pessoa 2 (Observador):\n"
                + "Valor X: " + coords.getState().coordenadasObservador[0] + 
                "\nValor Y: " + coords.getState().coordenadasObservador[1] + "\n\n");
    }
}

