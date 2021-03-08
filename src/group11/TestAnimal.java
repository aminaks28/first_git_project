/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group11;
// Name :- Akshat Prafulbhai Amin
// Student ID :- 991620543

/**
 *
 * @author bhavesh
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        Dog [] dog = new Dog[4];
	
	dog[0]= new Dog("Rottweiler", 20);
        dog[1]= new Dog("Bulldog", 18);
	dog[2]= new Dog("Poodle", 12);
	dog[3]= new Dog("Dobermann", 10);
        
        System.out.print(dog[0]);
        System.out.print(dog[1]);
        System.out.print(dog[2]);
        System.out.println(dog[3]);
        
        int com = dog[0].compareTo(dog[1]);
        switch(com){    
            case -1 ->  {
                System.out.println("The " + dog[1].getName() + " is older!");
            }
            case 1 ->  {
                System.out.println("The " + dog[0].getName() + " is older!");
            }
            default -> System.out.println("The two dogs are of the same age!");
        }
        
        Lizard c = new Lizard("Chihuahua");
        System.out.println("Lizard's name: " + c.getName());
        Lizard cClone = c.clone();
        System.out.println("Lizard's clone name: " + cClone.getName());
    }
}
