package Package1;

import Package2.AnimalesDomesticos;
import Package2.AnimalesSalvajes;

public class Main {
    public static void main(String[] args) {
        Plantas plantas = new Plantas("Azul", 7.2F);

        AnimalesDomesticos animalesDomesticos = new AnimalesDomesticos("Bailey");
        AnimalesSalvajes animalesSalvajes = new AnimalesSalvajes("Coco");

        System.out.println(plantas);
        System.out.println(animalesDomesticos);
        System.out.println(animalesSalvajes);
    }
}