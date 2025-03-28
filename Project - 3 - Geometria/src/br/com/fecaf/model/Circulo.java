package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {
    // Isso é um atributo
    public double raio, area, perimetro, diametro;

    /** Instancia o objeto Scanner */
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarCirculo (){
        System.out.println("/***************************************/");
        System.out.println("/*   Cadastro Círculo   */");
        System.out.println("/***************************************/");
        System.out.println("Informe o raio: ");
        raio = scanner.nextDouble();
        System.out.println("Círculo cadastrado com sucesso...");
        System.out.println("/***************************************/");

        return true;
    }

    public void exibirCirculo (){
        System.out.println("/***************************************/");
        System.out.println("O raio do círculo é: " + raio);
        System.out.println("A área do círculo é: " + area);
        System.out.println("O perímetro do círculo é: " + perimetro);
        System.out.println("O diâmetro do círculo é: " + diametro);
        System.out.println("/***************************************/");
    }

    public void calcularArea(){
        System.out.println("*/ Calculando Área */");
        // Cálculo de Área
        // area = 3.14159 * (raio * raio);
        // area = Math.PI * (raio * raio);
        area = Math.PI * Math.pow(raio, 2);

    }

    public void calcularPerimetro(){
        System.out.println("/*  Calculando Perímetro  */");

        perimetro = 2* Math.PI * raio;

    }






}
