/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group11;

/**
 *
 * @author bhavesh
 */
class Lizard implements INameable,Cloneable {
    private String name;
    public Lizard(String name) {
        this.name = name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }

    /**
     *
     * @return
     */
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public Lizard clone() throws CloneNotSupportedException {
        return (Lizard) super.clone();
    }
}
