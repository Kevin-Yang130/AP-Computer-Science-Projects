/*
author: Kevin Yang-Li
version: 12/10/2020
Purpose: A pet shop had a program to keep track of the current pets being offered for adoption.
 */


public class Pets {
    private int age = 0;
    private String name = "";
    private String breed = "";
    public Pets (String name, String breed, int age){

    }

    public String getName (){
        return name;
    }

    public String getBreed (){
        return breed;
    }

    public int getAge (){
        return age;
    }


    public void setName (String pname){
        name = pname;
    }

    public void setBreed (String pbreed){
        name = pbreed;
    }

    public void setAge (int age){
        age = age;
    }

}

