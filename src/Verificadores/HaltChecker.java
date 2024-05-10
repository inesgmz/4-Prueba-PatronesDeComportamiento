package Verificadores;

import Excepciones.InputInvalido;
import Modelo.*;
import Modelo.Proceso;

public class HaltChecker {
    private static HaltChecker instance;
    public static HaltChecker getInstance() {
        if(instance == null) {
            instance = new HaltChecker();
        }
        return instance;
    }

    public boolean willHalt(Proceso proceso,Proceso input) throws InputInvalido {
        if (proceso instanceof CuentaInfinita && input instanceof CuentaInfinita){
            return true;
        } else if (proceso instanceof CuentaAtras && input instanceof CuentaInfinita){
            throw new InputInvalido("No se puede hacer un CuentaAtras con un CuentaInfinita");
        } else if (proceso instanceof CuentaInfinita && input instanceof CuentaAtras){
            return true;
        } else if (proceso instanceof CuentaAtras && input instanceof CuentaAtras){
            return true;
        } else {
            throw new InputInvalido("No se puede hacer un CuentaInfinita con un CuentaAtras");
        }
    }

    public boolean willHalt(String programCode) {
        return false;
    }
}
