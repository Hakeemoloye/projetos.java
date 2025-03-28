package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner (System.in);

    public void executarMenu() {

        boolean exit = false;

        while (!exit) {

            System.out.println("/*************************************/");
            System.out.println("*/     Geometria     */");
            System.out.println("/*************************************/");
            System.out.println("/* 1 - Círculo          */");
            System.out.println("/* 2 - Retângulo          */");
            System.out.println("/* 3 - Triângulo          */");
            System.out.println("/* 4 - Sair          */");
            System.out.println("/*************************************/");
            System.out.print("Informe a opção desejada: ");

            int optionUser = scanner.nextInt();

            switch (optionUser) {
                case 1:

                    boolean exitCirculo = false;
                    boolean validaCadastro = false;
                    Circulo circulo = new Circulo();
                    while (!exitCirculo) {

                        System.out.println("/****************************************/");
                        System.out.println("*/     Circulo     */");
                        System.out.println("1 - cadastrar circulo");
                        System.out.println("2 - Calcular area ");
                        System.out.println("3 - Calcular perímetro ");
                        System.out.println("4 - sair");
                        System.out.println("/****************************************/");

                        System.out.print("Escolha uma Opção");

                        int optionCirculo = scanner.nextInt();


                        switch (optionCirculo) {
                            case 1:
                                System.out.println("Cadastrando círculo...");
                                validaCadastro = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastro) {
                                    System.out.println("Calculando area...");
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um círculo...");
                                }
                                break;
                            case 3:
                                if (validaCadastro) {
                                    System.out.println("Calculando Perímetro...");
                                    circulo.calcularPerimetro();
                                }
                                break;
                            case 4:
                                System.out.println("Voltando para Menu...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    }
                    break;
                case 2:

                    boolean exitRetangulo = false;
                    // Esse comando cria um objeto
                    Retangulo retangulo = new Retangulo();
                    boolean validaRetangulo = false;

                    while (!exitRetangulo) {

                        System.out.println("/****************************************/");
                        System.out.println("*/     Retângulo    */");
                        System.out.println("1 - cadastrar Retângulo");
                        System.out.println("2 - Calcular Area ");
                        System.out.println("3 - Calcular perímetro ");
                        System.out.println("4 - Definir Quadrado");
                        System.out.println("5 - sair");
                        System.out.println("/****************************************/");

                        System.out.print("Escolha uma Opção");

                        int optionRetangulo = scanner.nextInt();

                        switch (optionRetangulo) {
                            case 1:
                                System.out.println("/****************************************/");
                                System.out.println("*/  Cadastrando Retângulo  /*");
                                System.out.println("/****************************************/");
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                System.out.println("/****************************************/");
                                break;
                            case 2:
                                if (validaRetangulo) {
                                    System.out.println("Calculando area...");
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um retângulo...");
                                }
                                break;
                            case 3:
                                if (validaRetangulo) {
                                    System.out.println("Calculando Perímetro...");
                                    retangulo.calcularPerimetro();
                                }
                                break;
                            case 4:
                                System.out.println("Definindo quadrado");
                                if (validaRetangulo) {
                                    retangulo.verificarQuadrado();
                                }

                                break;
                            case 5:
                                System.out.println("Saindo...");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida...");

                        }


                    }
                    break;
//aqui começei com o menu novo//
                case 3:

                    boolean exitTriangulo = false;
                    // Esse comando cria um objeto
                    Triangulo Triangulo = new Triangulo();
                    boolean validaTriangulo = false;

                    while (!exitTriangulo) {

                        System.out.println("/****************************************/");
                        System.out.println("*/     triângulo    */");
                        System.out.println("1 - cadastrar triângulo");
                        System.out.println("2 - Calcular Area ");
                        System.out.println("3 - Calcular perímetro ");
                        System.out.println("4 - Definir triangulo");
                        System.out.println("5 - Definir 345");
                        System.out.println("6 - sair");
                        System.out.println("/****************************************/");

                        System.out.print("Escolha uma Opção");

                        int optionTriangulo = scanner.nextInt();

                        switch (optionTriangulo) {
                            case 1:
                                System.out.println("/****************************************/");
                                System.out.println("*/  Cadastrando Triângulo  /*");
                                System.out.println("/****************************************/");
                                validaTriangulo = Triangulo.cadastrarTriangulo();
                                System.out.println("/****************************************/");

                                break;
                            case 2:
                                if (validaTriangulo) {
                                    System.out.println("Calculando area...");
                                    Triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um triângulo...");
                                }
                                break;
                            case 3:
                                if (validaTriangulo) {
                                    System.out.println("Calculando Perímetro...");
                                    Triangulo.calcularPerimetro();
                                }
                                break;
                            case 4:
                                System.out.println("Definindo Triangulo");
                                if (validaTriangulo) {
                                    Triangulo.definirTipo();
                                }
                                break;
                            case 5:
                                System.out.println("definindo 345");
                                if (validaTriangulo) {
                                    Triangulo.triangulo345();
                                }
                                break;
                            case 6:
                                System.out.println("saindo");
                                exitTriangulo = true;
                                break;

                            default:
                                System.out.println("Escolha uma opção valida");
                                break;
                        }
                    }
            }
        }

    }
    }