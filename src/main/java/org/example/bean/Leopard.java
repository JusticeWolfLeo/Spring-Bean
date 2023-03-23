package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Leopard { //через поле, вроде как я понял
    @Autowired
    private Leopard leopard;

    @Override
    public String toString() {
        return "леопард живёт - поживает!";
    }
}
