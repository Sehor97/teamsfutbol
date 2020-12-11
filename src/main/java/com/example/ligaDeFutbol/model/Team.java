package com.example.ligaDeFutbol.model;

import lombok.Data;

@Data
public class Team {
    private String nombre;
    private String posicion;
    private String puntaje;
    private String ganado;
    private String empate;
    private String perdido;
    private String golesFavor;
    private String golesContra;
}
