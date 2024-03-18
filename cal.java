import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        String nome;
        int figuraEscolhida = 0;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Bem-vindo, " + nome + "!\n");

        do {
            System.out.println("\n");
            System.out.println("Menu Principal:");
            System.out.println("1 - Figuras Planas");
            System.out.println("2 - Figuras Espaciais");
            System.out.println("3 - Sair \n");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 selecionada: Figuras Planas");
                    System.out.println("Escolha uma figura plana: \n");
                    System.out.println("1 - Quadrado");
                    System.out.println("2 - Retângulo");
                    System.out.println("3 - Triângulo Equilátero");
                    System.out.println("4 - Círculo");
                    System.out.println("5 - Hexágono Regular");
                    System.out.println("Digite o número desejado: ");

                    int usuarioEscolhaPlana = sc.nextInt();


                    figuraEscolhida = usuarioEscolhaPlana;

                    processarEscolhaFigurasPlanas(usuarioEscolhaPlana, sc);
                    break;

                case 2:
                    System.out.println("Opção 2 selecionada: Figuras Espaciais \n");
                    System.out.println("6- Cubo");
                    System.out.println("7 - Paralelepípedo");
                    System.out.println("8 - Esfera");
                    System.out.println("9 - Pirâmide de Base Quadrada");
                    System.out.println("10 - Cilindro");
                    System.out.println("11- Cone");
                    System.out.println("Digite o número desejado:");

                    int usuarioEscolhaEspacial = sc.nextInt();

                    figuraEscolhida = usuarioEscolhaEspacial;

                    processarEscolhaFigurasEspaciais(usuarioEscolhaEspacial, sc);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        } while (opcao != 3);

        sc.close();
    }

    private static void processarEscolhaFigurasPlanas(int escolha, Scanner sc) {
        switch (escolha) {
            case 1:
                System.out.println("Você escolheu Quadrado. \n");
                System.out.println("Você quer calcular: \n");
                System.out.println("1 - Perímetro");
                System.out.println("2 - Área");
                System.out.println("3 - Os dois?");
                System.out.println("Digite o número desejado: ");
                int opcaoQuadrado = sc.nextInt();
                switch(opcaoQuadrado) {
                    case 1:
                        System.out.println("Você escolheu calcular o perímetro do quadrado.");
                        System.out.println("Digite o lado do quadrado: \n");
                        double ladoQuadrado = sc.nextDouble();
                        Quadrado quadrado = new Quadrado(ladoQuadrado);
                        System.out.printf("O perímetro do quadrado é: %.2f \n", (quadrado.calcularPerimetro()));
                        break;
                    case 2:
                        System.out.println("Você escolheu calcular a área do quadrado.");
                        System.out.println("Digite o lado do quadrado:");
                        double ladoQuadrado2 = sc.nextDouble();
                        Quadrado quadrado2 = new Quadrado(ladoQuadrado2);
                        System.out.printf("A área do quadrado é: %.2f \n", (quadrado2.calcularArea()));
                        break;
                    case 3:
                        System.out.println("Você escolheu calcular os dois");
                        System.out.println("Digite o lado do quadrado:");
                        double ladoQuadrado3 = sc.nextDouble();
                        Quadrado quadrado3 = new Quadrado(ladoQuadrado3);
                        double perimetroQuadrado = quadrado3.calcularPerimetro();
                        double areaQuadrado = quadrado3.calcularArea();
                        System.out.printf("O perímetro do quadrado é: %.2f", (perimetroQuadrado));
                        System.out.printf("A área do quadrado é: %.2f \n ", (areaQuadrado));
                        break;
                    default:
                        System.out.println("Opção inválida para o quadrado.");
                        break;
                }
                break;
            case 2:
                System.out.println("Você escolheu Retângulo.");
                System.out.println("Você quer calcular: \n");
                System.out.println("1 - Perímetro");
                System.out.println("2 - Área");
                System.out.println("3 - Os dois?");
                System.out.println("Digite o número desejado: \n");
                int opcaoRetangulo = sc.nextInt();
                switch(opcaoRetangulo) {
                    case 1:
                        System.out.println("Você escolheu calcular o perímetro do retângulo.");
                        System.out.println("Digite a base do retângulo:");
                        double baseRetangulo = sc.nextDouble();
                        System.out.println("Digite a altura do retângulo:");
                        double alturaRetangulo = sc.nextDouble();
                        Retangulo retangulo = new Retangulo(baseRetangulo, alturaRetangulo);
                        System.out.printf("O perímetro do retângulo é: %.2f ", (retangulo.calcularPerimetro()));
                        break;
                    case 2:
                        System.out.println("Você escolheu calcular a área do retângulo.");
                        System.out.println("Digite a base do retângulo:");
                        double baseRetangulo2 = sc.nextDouble();
                        System.out.println("Digite a altura do retângulo:");
                        double alturaRetangulo2 = sc.nextDouble();
                        Retangulo retangulo2 = new Retangulo(baseRetangulo2, alturaRetangulo2);
                        System.out.printf("A área do retângulo é: %.2f",(retangulo2.calcularArea()));
                        break;
                    case 3:
                        System.out.println("Você escolheu calcular os dois");
                        System.out.println("Digite a base do retângulo:");
                        double baseRetangulo3 = sc.nextDouble();
                        System.out.println("Digite a altura do retângulo:");
                        double alturaRetangulo3 = sc.nextDouble();
                        Retangulo retangulo3 = new Retangulo(baseRetangulo3, alturaRetangulo3);
                        double perimetroRetangulo = retangulo3.calcularPerimetro();
                        double areaRetangulo = retangulo3.calcularArea();
                        System.out.printf("O perímetro do retângulo é: %.2f", (perimetroRetangulo));
                        System.out.printf("A área do retângulo é: %.2f", (areaRetangulo));
                        break;
                    default:
                        System.out.println("Opção inválida para o retângulo.");
                        break;
                }
                break;
            case 3:
                System.out.println("Você escolheu Triângulo Equilátero.");
                System.out.println("Você quer calcular: \n");
                System.out.println("1 - Perímetro");
                System.out.println("2 - Área");
                System.out.println("3 - Os dois?");
                System.out.println("Digite o número desejado: ");
                int opcaoTriangulo = sc.nextInt();
                switch(opcaoTriangulo) {
                    case 1:
                        System.out.println("Você escolheu calcular o perímetro do triângulo.");
                        System.out.println("Digite o lado do triângulo:");
                        double ladoTriangulo = sc.nextDouble();
                        TrianguloEquilatero triangulo = new TrianguloEquilatero(ladoTriangulo);
                        System.out.printf("O perímetro do triângulo é: %.2f", (triangulo.calcularPerimetro()));
                        break;
                    case 2:
                        System.out.println("Você escolheu calcular a área do triângulo.");
                        System.out.println("Digite o lado do triângulo:");
                        double ladoTriangulo2 = sc.nextDouble();
                        TrianguloEquilatero triangulo2 = new TrianguloEquilatero(ladoTriangulo2);
                        System.out.printf("A área do triângulo é: %.2f", (triangulo2.calcularArea()));
                        break;
                    case 3:
                        System.out.println("Você escolheu calcular os dois");
                        System.out.println("Digite o lado do triângulo:");
                        double ladoTriangulo3 = sc.nextDouble();
                        TrianguloEquilatero triangulo3 = new TrianguloEquilatero(ladoTriangulo3);
                        double perimetroTriangulo = triangulo3.calcularPerimetro();
                        double areaTriangulo = triangulo3.calcularArea();
                        System.out.printf("O perímetro do triângulo é: %.2f", (perimetroTriangulo));
                        System.out.printf("A área do triângulo é: %.2f", (areaTriangulo));
                        break;
                    default:
                        System.out.println("Opção inválida para o triângulo.");
                        break;
                }
                break;
            case 4:
                System.out.println("Você escolheu Círculo.");
                System.out.println("Você quer calcular: \n");
                System.out.println("1 - Perímetro");
                System.out.println("2 - Área");
                System.out.println("3 - Os dois?");
                System.out.println("Digite o número desejado: ");
                int opcaoCirculo = sc.nextInt();
                switch(opcaoCirculo) {
                    case 1:
                        System.out.println("Você escolheu calcular o perímetro do círculo.");
                        System.out.println("Digite o raio do círculo:");
                        double raioCirculo = sc.nextDouble();
                        Circulo circulo = new Circulo(raioCirculo);
                        System.out.printf("O perímetro do círculo é: %.2f",(circulo.calcularPerimetro()));
                        break;
                    case 2:
                        System.out.println("Você escolheu calcular a área do círculo.");
                        System.out.println("Digite o raio do círculo:");
                        double raioCirculo2 = sc.nextDouble();
                        Circulo circulo2 = new Circulo(raioCirculo2);
                        System.out.printf("A área do círculo é: %.2f",(circulo2.calcularArea()));
                        break;
                    case 3:
                        System.out.println("Você escolheu calcular os dois");
                        System.out.println("Digite o raio do círculo:");
                        double raioCirculo3 = sc.nextDouble();
                        Circulo circulo3 = new Circulo(raioCirculo3);
                        double perimetroCirculo = circulo3.calcularPerimetro();
                        double areaCirculo = circulo3.calcularArea();
                        System.out.printf("O perímetro do círculo é: %.2f", (perimetroCirculo));
                        System.out.printf("A área do círculo é: %.2f", (areaCirculo));
                        break;
                    default:
                        System.out.println("Opção inválida para o círculo.");
                        break;
                }
                break;
            case 5:
                System.out.println("Você escolheu Hexágono Regular.");
                System.out.println("Você quer calcular: \n");
                System.out.println("1 - Perímetro");
                System.out.println("2 - Área");
                System.out.println("3 - Os dois?");
                System.out.println("Digite o número desejado: ");
                int opcaoHexagono = sc.nextInt();
                switch(opcaoHexagono) {
                    case 1:
                        System.out.println("Você escolheu calcular o perímetro do hexágono.");
                        System.out.println("Digite o lado do hexágono:");
                        double ladoHexagono = sc.nextDouble();
                        HexagonoRegular hexagono = new HexagonoRegular(ladoHexagono);
                        System.out.printf("O perímetro do hexágono é: %.2f",(hexagono.calcularPerimetro()));
                        break;
                    case 2:
                        System.out.println("Você escolheu calcular a área do hexágono.");
                        System.out.println("Digite o lado do hexágono:");
                        double ladoHexagono2 = sc.nextDouble();
                        HexagonoRegular hexagono2 = new HexagonoRegular(ladoHexagono2);
                        System.out.printf("A área do hexágono é: %.2f",(hexagono2.calcularArea()));
                        break;
                    case 3:
                        System.out.println("Você escolheu calcular os dois");
                        System.out.println("Digite o lado do hexágono:");
                        double ladoHexagono3 = sc.nextDouble();
                        HexagonoRegular hexagono3 = new HexagonoRegular(ladoHexagono3);
                        double perimetroHexagono = hexagono3.calcularPerimetro();
                        double areaHexagono = hexagono3.calcularArea();
                        System.out.printf("O perímetro do hexágono é: %.2f", (perimetroHexagono));
                        System.out.printf("A área do hexágono é: %.2f", (areaHexagono));
                        break;
                    default:
                        System.out.println("Opção inválida para o hexágono.");
                        break;
                }
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        

        }
    }

    private static void processarEscolhaFigurasEspaciais(int escolha, Scanner sc){
            switch (escolha) {
                case 6:
                    System.out.println("Você escolheu Cubo.");
                    System.out.println("Você quer calcular: \n");
                    System.out.println("1 - Volume");
                    System.out.println("2 - Área Superficial");
                    System.out.println("3 - Os dois?");
                    System.out.println("Digite o número desejado: ");
                   int opcaoCubo = sc.nextInt();
                   switch (opcaoCubo) {
                       case 1:
                           System.out.println("Você escolheu calcular o volume do cubo.");
                           System.out.println("Digite o lado do cubo:");
                           double ladoCubo = sc.nextDouble();
                           Cubo cubo = new Cubo(ladoCubo);
                           System.out.println("O volume do cubo é: " + cubo.calcularVolume());
                           break;
                       case 2:
                           System.out.println("Você escolheu calcular a área superficial do cubo.");
                           System.out.println("Digite o lado do cubo:");
                           double ladoCubo2 = sc.nextDouble();
                           Cubo cubo2 = new Cubo(ladoCubo2);
                           System.out.println("A área superficial do cubo é: " + cubo2.calcularAreaSuperficial());
                           break;
                       case 3:
                           System.out.println("Você escolheu calcular os dois");
                           System.out.println("Digite o lado do cubo:");
                           double ladoCubo3 = sc.nextDouble();
                           Cubo cubo3 = new Cubo(ladoCubo3);
                           double volumeCubo = cubo3.calcularVolume();
                           double areaSuperficialCubo = cubo3.calcularAreaSuperficial();
                           System.out.println("O volume do cubo é: " + volumeCubo);
                           System.out.println("A área superficial do cubo é: " + areaSuperficialCubo);
                           break;
                       default:
                           System.out.println("Opção inválida para o cubo.");
                           break;
                   }
                   break;
                case 7:
                    System.out.println("Você escolheu Paralelepípedo.");
                    System.out.println("Você quer calcular: \n");
                    System.out.println("1 - Volume");
                    System.out.println("2 - Área Superficial");
                    System.out.println("3 - Os dois?");
                    System.out.println("Digite o número desejado: ");
                   int opcaoParalelepipedo = sc.nextInt();
                   switch (opcaoParalelepipedo) {
                       case 1:
                           System.out.println("Você escolheu calcular o volume do paralelepípedo.");
                           System.out.println("Digite o comprimento do paralelepípedo:");
                           double comprimentoParalelepipedo = sc.nextDouble();
                           System.out.println("Digite a largura do paralelepípedo:");
                           double larguraParalelepipedo = sc.nextDouble();
                           System.out.println("Digite a altura do paralelepípedo:");
                           double alturaParalelepipedo = sc.nextDouble();
                           Paralelepipedo paralelepipedo = new Paralelepipedo(comprimentoParalelepipedo, larguraParalelepipedo, alturaParalelepipedo);
                           System.out.println("O volume do paralelepípedo é: " + paralelepipedo.calcularVolume());
                           break;
                       case 2:
                           System.out.println("Você escolheu calcular a área superficial do paralelepípedo.");
                           System.out.println("Digite o comprimento do paralelepípedo:");
                           double comprimentoParalelepipedo2 = sc.nextDouble();
                           System.out.println("Digite a largura do paralelepípedo:");
                           double larguraParalelepipedo2 = sc.nextDouble();
                           System.out.println("Digite a altura do paralelepípedo:");
                           double alturaParalelepipedo2 = sc.nextDouble();
                           Paralelepipedo paralelepipedo2 = new Paralelepipedo(comprimentoParalelepipedo2, larguraParalelepipedo2, alturaParalelepipedo2);
                           System.out.println("A área superficial do paralelepípedo é: " + paralelepipedo2.calcularAreaSuperficial());
                           break;
                       case 3:
                           System.out.println("Você escolheu calcular o volume e a área superficial do paralelepípedo.");
                           System.out.println("Digite o comprimento do paralelepípedo:");
                           double comprimentoParalelepipedo3 = sc.nextDouble();
                           System.out.println("Digite a largura do paralelepípedo:");
                           double larguraParalelepipedo3 = sc.nextDouble();
                           System.out.println("Digite a altura do paralelepípedo:");
                           double alturaParalelepipedo3 = sc.nextDouble();
                           Paralelepipedo paralelepipedo3 = new Paralelepipedo(comprimentoParalelepipedo3, larguraParalelepipedo3, alturaParalelepipedo3);
                           double volumeParalelepipedo = paralelepipedo3.calcularVolume();
                           double areaSuperficialParalelepipedo = paralelepipedo3.calcularAreaSuperficial();
                           System.out.println("O volume do paralelepípedo é: " + volumeParalelepipedo);
                           System.out.println("A área superficial do paralelepípedo é: " + areaSuperficialParalelepipedo);
                           break;
                       default:
                           System.out.println("Opção inválida para o paralelepípedo.");
                           break;
                   }
                   break;
                case 8:
                    System.out.println("Você escolheu Esfera.");
                    System.out.println("Você quer calcular: \n");
                    System.out.println("1 - Volume");
                    System.out.println("2 - Área Superficial");
                    System.out.println("3 - Os dois?");
                    System.out.println("Digite o número desejado: ");
                   int opcaoEsfera = sc.nextInt();
    
                   System.out.println("Digite o raio da esfera:");
                   double raioEsfera = sc.nextDouble();
                   Esfera esfera = new Esfera(raioEsfera);
    
                   switch (opcaoEsfera) {
                       case 1:
                           System.out.println("Você escolheu calcular o volume da Esfera.");
                           System.out.println("O volume da esfera é: " + esfera.calcularVolume());
                           break;
                       case 2:
                           System.out.println("Você escolheu calcular a área superficial da Esfera.");
                           System.out.println("A área superficial da esfera é: " + esfera.calcularAreaSuperficial());
                           break;
                       case 3:
                           System.out.println("Você escolheu calcular o volume e a área superficial da Esfera.");
                           double volumeEsfera = esfera.calcularVolume();
                           double areaSuperficialEsfera = esfera.calcularAreaSuperficial();
                           System.out.println("O volume da esfera é: " + volumeEsfera);
                           System.out.println("A área superficial da esfera é: " + areaSuperficialEsfera);
                           break;
                       default:
                           System.out.println("Opção inválida para a esfera.");
                           break;
                   }
                   break;
                case 9:
                    System.out.println("Você escolheu Pirâmide de Base Quadrada.");
                    System.out.println("Você quer calcular: \n");
                    System.out.println("1 - Volume");
                    System.out.println("2 - Área Superficial");
                    System.out.println("3 - Os dois?");
                    System.out.println("Digite o número desejado: ");
                   int opcaoPiramideDeBaseQuadrada = sc.nextInt();
    
                   System.out.println("Digite o lado da base da pirâmide:");
                   double ladoBasePiramide = sc.nextDouble();
                   System.out.println("Digite a altura da pirâmide:");
                   double alturaPiramide = sc.nextDouble();
                   PiramideDeBaseQuadrada piramide = new PiramideDeBaseQuadrada(ladoBasePiramide, alturaPiramide);
    
                   switch (opcaoPiramideDeBaseQuadrada) {
                       case 1:
                           System.out.println("Você escolheu calcular o volume da Pirâmide de Base Quadrada.");
                           System.out.println("O volume da pirâmide é: " + piramide.calcularVolume());
                           break;
                       case 2:
                           System.out.println("Você escolheu calcular a área superficial da Pirâmide de Base Quadrada.");
                           System.out.println("A área superficial da pirâmide é: " + piramide.calcularAreaSuperficial());
                           break;
                       case 3:
                           System.out.println("Você escolheu calcular o volume e a área superficial da Pirâmide de Base Quadrada.");
                           double volumePiramide = piramide.calcularVolume();
                           double areaSuperficialPiramide = piramide.calcularAreaSuperficial();
                           System.out.println("O volume da pirâmide é: " + volumePiramide);
                           System.out.println("A área superficial da pirâmide é: " + areaSuperficialPiramide);
                           break;
                       default:
                           System.out.println("Opção inválida para a pirâmide de base quadrada.");
                           break;
                   }
                    break;
                case 10:
                    System.out.println("Você escolheu Cilindro.");
                    System.out.println("Você quer calcular: \n");
                    System.out.println("1 - Volume");
                    System.out.println("2 - Área Superficial");
                    System.out.println("3 - Os dois?");
                    System.out.println("Digite o número desejado: ");
    
                   int opcaoCilindro = sc.nextInt();
                   System.out.println("Digite o raio do cilindro:");
                   double raioCilindro = sc.nextDouble();
                   System.out.println("Digite a altura do cilindro:");
                   double alturaCilindro = sc.nextDouble();
                   Cilindro cilindro = new Cilindro(raioCilindro, alturaCilindro);
    
                   switch (opcaoCilindro) {
                       case 1:
                           System.out.println("Você escolheu calcular o volume do cilindro.");
                           System.out.println("O volume do cilindro é: " + cilindro.calcularVolume());
                           break;
                       case 2:
                           System.out.println("Você escolheu calcular a área superficial do cilindro.");
                           System.out.println("A área superficial do cilindro é: " + cilindro.calcularAreaSuperficial());
                           break;
                       case 3:
                           System.out.println("Você escolheu calcular o volume e a área superficial do cilindro.");
                           double volumeCilindro = cilindro.calcularVolume();
                           double areaSuperficialCilindro = cilindro.calcularAreaSuperficial();
                           System.out.println("O volume do cilindro é: " + volumeCilindro);
                           System.out.println("A área superficial do cilindro é: " + areaSuperficialCilindro);
                           break;
                       default:
                           System.out.println("Opção inválida para o cilindro.");
                           break;
                   }
                   break;
                case 11:
                    System.out.println("Você escolheu Cone.");
                    System.out.println("Você quer calcular: \n");
                    System.out.println("1 - Volume");
                    System.out.println("2 - Área Superficial");
                    System.out.println("3 - Os dois?");
                    System.out.println("Digite o número desejado: ");
                   int opcaoCone = sc.nextInt();
    
                   System.out.println("Digite o raio do cone:");
                   double raioCone = sc.nextDouble();
                   System.out.println("Digite a altura do cone:");
                   double alturaCone = sc.nextDouble();
                   Cone cone = new Cone(raioCone, alturaCone);
    
                   switch (opcaoCone) {
                       case 1:
                           System.out.println("Você escolheu calcular o volume do cone.");
                           System.out.println("O volume do cone é: " + cone.calcularVolume());
                           break;
                       case 2:
                           System.out.println("Você escolheu calcular a área superficial do cone.");
                           System.out.println("A área superficial do cone é: " + cone.calcularAreaSuperficial());
                           break;
                       case 3:
                           System.out.println("Você escolheu calcular o volume e a área superficial do cone.");
                           double volumeCone = cone.calcularVolume();
                           double areaSuperficialCone = cone.calcularAreaSuperficial();
                           System.out.println("O volume do cone é: " + volumeCone);
                           System.out.println("A área superficial do cone é: " + areaSuperficialCone);
                           break;
                       default:
                           System.out.println("Opção inválida para o cone.");
                           break;
                   }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
        }
    }
}