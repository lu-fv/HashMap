import Enum.*;
import java.util.Random;
import java.util.UUID;

// Se utiliza el import para poder utilizar el enum genere adentro de package Enum
//import package.name.ClassName;   // To import a certain class only
//import package.name.*   // To import the whole package
public class Person {

    private String name = "";
    private Integer age = 0;
    private float height = 0;
    private float weight = 0;
    private  Integer DNI;
    private Genere genere = Genere.H;

    public Person() {
    }

    public Person(String name, Integer age, Genere genere) {
        this.name = name;
        this.age = age;
        this.genere = genere;
    }

    public Person(String name, Integer age, float height, float weight, Genere genere) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.genere = genere;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public Integer calcularMC() {

        Float IdealWeight = (weight) / (height * height);
        if (IdealWeight < 20) {
            return -1;
        }
        if (IdealWeight >= 20 && IdealWeight <= 25) {
            return 0;
        } else if (IdealWeight > 25) {
            return 1;
        }
        return null;
    }

    public Integer esMayorDeEdad(){
        if (this.age > 18){
            return 0;
        }
        return 1;
    }
    public String generarDni (){

        UUID uuid = UUID.randomUUID ();

        return uuid.toString().substring(0, 8);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", genere=" + genere +
                '}';
    }
}
