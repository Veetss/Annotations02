package it.develhope.annotations;

public class Greetings {

    @DevAnnotation(DevName = "Jhon", DevSurname = "Walker")
    public void sayWelcome(){
        System.out.println("Welcome!");
    }

    @DevAnnotation(DevName = "Mark", DevSurname = "Brown")
    public void sayGoodBye(){
        System.out.println("GoodBye!");
    }
}
