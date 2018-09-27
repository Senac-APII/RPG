package local.model;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Personagem x = new Guerreiro("Lula");
    Personagem y = new Guerreiro("Bolsonaro");
    Personagem z = new Guerreiro("Pincelada");
    //Personagem r = new Personagem();

        List<Personagem> personagens = Arrays.asList(x,y,z);

        for(Personagem person : personagens){
            if(person instanceof Guerreiro){
                System.out.println("Warrior");

            }
        }

    }
}
