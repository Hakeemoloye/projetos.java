package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    //Atributos Triangulo
    public double base, altura, lado2, lado3, area, perimetro;
    Scanner scanner = new Scanner(System.in);
    public boolean cadastrarTriangulo(){
        System.out.println("/****************************************/");
        System.out.println("cadastrando triangulo");
        System.out.println("/****************************************/");
        System.out.println("Informe a base:");

        base = scanner.nextDouble();
        System.out.println("Informe o lado 2");
        lado2 = scanner.nextDouble();
        System.out.println("Informe o lado 3");
        lado3 = scanner.nextDouble();
        System.out.println("informe a altura");
        altura = scanner.nextDouble();
        System.out.println("/****************************************/");

        return true;
    }



    // Calcula area do Triangulo

    public void calcularArea() {
        System.out.println("/****************************************/");
        System.out.println("/*  Calculando area  */");
        System.out.println("/****************************************/");

        area = (base * altura) / 2;
        System.out.println("A area é: " + area);
        System.out.println("/****************************************/");
    }

    public void calcularPerimetro (){
        System.out.println("/****************************************/");
        System.out.println("*/ Calculando Perimetro /*");
        System.out.println("/****************************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("O perímetro é: " + perimetro);
        System.out.println("/****************************************/");
    }

    //Define o tipo do triangulo

    // Equilatero - Escaleno - Isosceles

    public void definirTipo (){
        System.out.println("/****************************************/");
        System.out.println("Definindo Tipo Triângulo");
        System.out.println("/****************************************/");


        if(base == lado2 && base == lado3) {
            System.out.println("Esse triângulo é um Equilátero...");
        } else if (base != lado2 && base != lado3 && lado3 !=lado2) {
            System.out.println("Esse triângulo é um Escaleno...");
        } else if (base * base + lado2 * lado2 == lado3 * lado3 || base * base + lado3 * lado3 == lado2 * lado2
            || lado2 * lado2 + lado3 * lado3 == base * base) {
            System.out.println("Esse triangulo é retangulo...");
        } else {
            System.out.println("Esse triângulo é um Isosceles...");
        }

    }

    /** essa função verifica se um n° é multiplo do outro */
    public boolean identificadormult(double numero, double divisor) {
        return numero % divisor == 0;
    }

    /** funçao que classifica se o triangulo é o 345 */
    public void triangulo345() {
        System.out.println("/************************************/");
        System.out.println("/* verificando se o triangulo é 345 */");
        System.out.println("/************************************/");

        double[] lados = {base, lado2, lado3};
        java.util.Arrays.sort(lados);

        //puxamos a funçao que verifica os numero multiplos dos lados do triangulo (3,4 e 5) //
        if (identificadormult(lados[0], 3) && identificadormult(lados[1], 4)
                && identificadormult(lados[2], 5 )) {
            if (Math.pow(lados[0], 2) + Math.pow(lados[1], 2) == Math.pow(lados[2], 2)) {
                System.out.println("È um triangulo 345!!");
                return;
            }
        }
        else {
            System.out.println("Este não é um triangulo 345");
        }
    }

}
