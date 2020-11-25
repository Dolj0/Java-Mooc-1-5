/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Toy {
    private String identifier;
    private String name;
    
    public Toy(String identifier, String name){
        this.identifier=identifier;
        this.name=name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.identifier+": "+this.name;
    }
}
