package default;

public enum ContaEnum {

    CONTA_CORRENTE,
    CONTA_SALARIO;

    String value; 

    ContaEnum(String tipo){
        value = tipo;
    }
    
}
