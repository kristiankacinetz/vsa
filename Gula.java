/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kristián Kačinetz
 */
 
 //velmi dobre ,velmi spravne..
public class Gula extends AbstractUtvar {
    
    //tu som zmenil teraz najneskor11
    
    private int x;
    private int y;
    private int z;
    private int polomer;
    
    public Gula(int x, int y, int z, int polomer)
    {
        super( x, y, z);
        this.polomer = polomer;
    }

  
 
    
    @Override
    public double getObjem() {
       return  (4.0/3.0)*Math.PI*polomer*polomer*polomer;
    }
    
    
}
