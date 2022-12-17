package br.com.banco.model.enums;

public enum Tipo {

    DEPOSITO(0),
    SAQUE(1),
    TRANSFERENCIA(2);
    

    private int value;

    Tipo(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    
}
