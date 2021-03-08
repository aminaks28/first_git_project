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
public class Dog extends Mammal implements INameable,Comparable_1{
      private String breed;
      public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    /**
     *
     * @param breed
     */
    @Override
      public void setName(String breed){
          this.breed = breed;
      }

    /**
     *
     * @return
     */
    @Override
      public String getName(){
          return this.breed;
      }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Object o) {
        Dog per = (Dog)o;
        if(this.age == per.age)
            return 0;
        else
            return this.age > per.age ? 1 : -1;
    }
    
      
      @Override
       public String toString(){
          return "\nBreed Name = " + breed + "\tAge = " + age;
 }
}
