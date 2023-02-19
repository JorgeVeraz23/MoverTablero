/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author USER
 */
public class MovimientoObjeto {
    private int x;
    private int y;
    
    public MovimientoObjeto(){
        this.x = 0;
        this.x = 0;
    }
    
    public void moverArriba(){
        this.x++;
        System.out.println("Objeto movido hacia arriba. Nueva pocision: ("+x+", "+y+")");
    }
    public void moverAbajo(){
        this.x--;
        System.out.println("Objeto movido hacia abajo. Nueva pocision: ("+x+", "+y+")");
    }
    
    
    public void moverDerecha(){
        this.y++;
        System.out.println("Objeto movido hacia la derecha. Nueva pocision: ("+x+", "+y+")");
    }
    public void moverIzquierda(){
        this.y--;
        System.out.println("Objeto movido hacia la izquierda. Nueva pocision: ("+x+", "+y+")");
    }
    
    
    }

    
    
    
    
