/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kristián Kačinetz
 */
public class Ihlan extends AbstractUtvar{
    //koment dasdasd
    private int rozmerStrany;
    private int vyska;
    
    public Ihlan(int x, int y, int z, int rozmerStrany, int vyska)
    {
        super( x, y, z);
        
        this.rozmerStrany = rozmerStrany;
        this.vyska = vyska;
    }

   
    public int getStrana()
    {
        return this.rozmerStrany;
    }
    
    public int getVyska(){
        return this.vyska;
    }

    
    
     @Override
    public double getObjem() {
       return  (1.0/3.0)*rozmerStrany*rozmerStrany*vyska;
    }
}
