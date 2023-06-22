package com.example.interfaces;

import com.example.Coche;
import com.example.CocheElectrico;
import com.example.interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche Clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche Clasico");
    }
}
