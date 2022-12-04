package com.learning;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public void imprimirSaludo(){
        System.out.println("Hola mundo desde java Spring con beans generados a partir de anotaciones.");
    }
}
