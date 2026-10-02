import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Algoritmo1();
        Algoritmo2();
        Algoritmo3();
        Algoritmo4();
        Algoritmo5();
        Algoritmo6();
        Algoritmo7();
        Algoritmo8();
        Algoritmo9();
        Algoritmo10();
        Algoritmo11();
        Algoritmo12();
    }

    private static void Algoritmo1() {
        System.out.println("Algoritmo 1");
        Scanner scanner = new Scanner(System.in);

        //VARIAVEL
        int i=1;

        while ( i >= 1) {
            System.out.println("Digite o " + i + " número:");
            int Numero1 = scanner.nextInt();
            int Numero2 = scanner.nextInt();

            if (Numero1 >= 1 && Numero2 >= 1) {
                int Soma = Numero1 + Numero2;
                System.out.println("A SOMA É IGUAL A:" + Soma);

                int Subtracao = Numero1 - Numero2;
                System.out.println("A Subtração é" + Subtracao);

                int Multiplicacao = Numero1 * Numero2;
                System.out.println("A multiplicação é " + Multiplicacao);

                int Divisao = Numero1 / Numero2;
                System.out.println("A divisão é" + Divisao);
            } else {
                System.out.println("Não é possivél calcular esses números!!!");
                break;
            }
            i++;
        }
        scanner.close();
    }

    private static void Algoritmo2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++ALGORITMO2+++++");

        //Variavél
        int i;
        int Soma = 0;
        //A soma de números impares  até 500
        for (i = 1; i <= 500; i += 2) {
            Soma += i;
        }
        System.out.println("A soma dos números impares é " + Soma);

        scanner.close();
    }


    private static void Algoritmo3() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++ALGORITMO3+++++");

        int qtfuncionario;
        int funcRecente = 0;
        int meses;
        int maiorMes = 1;
        int menorMes = 0;
        int numeroFunc;
        int posFuncMaior = Integer.MAX_VALUE;

        for (qtfuncionario = 0; qtfuncionario <= 300; qtfuncionario++) {

            System.out.println("Digite seu número de cadastro da  empresa");
            numeroFunc = scanner.nextInt();

            System.out.println("Digite a quantos meses você trabalha na empresa");
            meses = scanner.nextInt();

            System.out.println("Número do funcionário: " + numeroFunc + "Meses de trabalho " + meses);

            if (numeroFunc <= 0) {
                System.out.println("Número de cadastro não encontrado");
            }
            if (posFuncMaior > meses) {
                posFuncMaior = numeroFunc;
                maiorMes = meses;
            }
            if (funcRecente < meses) {
                funcRecente = numeroFunc;
                menorMes = meses;
            }

        }
        System.out.println("O funcionário mais antigo da empresa é: " + posFuncMaior);

        System.out.println("O funcionário mais recente na empresa é: " + funcRecente);

        scanner.close();
    }


    private static void Algoritmo4() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++ALGORITMO4+++++");


        int sexFem = 0;
        int sexMas = 0;
        double altura;
        double menorAltura = Integer.MAX_VALUE;
        double maiorAltura = 0;
        String sexMenorAltura = "";
        String sexMaiorAltura = "";
        String sex;
        double soma = 0;
        int numPessoas;

        for (numPessoas = 0; numPessoas <= 3; numPessoas++) {
            System.out.println("Digite seu sexo F para feminino e M para Masculino");
            sex = scanner.next();

            if (!sex.equalsFoldCase("F") && !sex.equalsFoldCase("M")) {
                System.out.println("Sexo invalido!!");
                break;
            }

            System.out.println("Digite sua altura");
            altura = scanner.nextDouble();

            if (sex.equalsFoldCase("F")) {
                soma += altura;
                sexFem += 1;
            } else {
                sexMas += 1;
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
                sexMaiorAltura = sex;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
                sexMenorAltura = sex;
            }
        }
        double media = soma / sexFem;
        System.out.println("A média da altura da mulheres é igual a: " + media);
        System.out.println("O número de Homens é igual a: " + sexMas);
        System.out.println(" Sexo com a maior altura: " + sexMaiorAltura);
        System.out.println("Sexo com a menor altura: " + sexMenorAltura);

        scanner.close();
    }


    private static void Algoritmo5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++ALGORITMO5+++++");

        //variaveis;
        int numPessoas;
        double salario;
        double somaSalario = 0;
        double maiorSalario = 0;
        double salario250 = 0;
        int numFilhos;
        int somaFilhos = 0;


        for (numPessoas = 0; numPessoas >= 0; numPessoas++) {

            System.out.println("Digite o valor do seu salário atual");
            salario = scanner.nextDouble();

            System.out.println("Digite o número de filhos que você possui");
            numFilhos = scanner.nextInt();

            if (salario < 0 && numFilhos < 0) {
                System.out.println("Salário inválido");
                break;
            }

            if (salario >= 0) {
                somaSalario += salario;
            }

            if (numFilhos > 0) {
                somaFilhos += numFilhos;
            }

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 250) {
                salario250 = salario;
                salario += salario250;
            }

        }
        double mediaSalario = somaSalario / numPessoas;
        int mediaFilhos = somaFilhos / numPessoas;

        System.out.println("A média do salário da população é: " + mediaSalario);
        System.out.println("A média do número de filhos é: " + mediaFilhos);
        System.out.println("O maior salário é; " + maiorSalario);
        System.out.println("Pessoas com o salário de 250 para baixo é igual a: " + salario250 / 100 + "%");

        scanner.close();
    }

    private static void Algoritmo6() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("++++Algoritmo 6+++++++");

        int valores;
        int i;
        int valoresNegativos = 0;
        int valoresPositivos = 0;
        int qtValores = 0;
        int qtPositivos = 0;
        int qtNegativos = 0;
        int soma = 0;

        for (i = 1; i >= 0; i++) {

            System.out.println("Digite o " + i + "° número");
            valores = scanner.nextInt();

            if (valores == 0) {
                System.out.println("Número inválido");
                break;
            }
            soma += valores;
            qtValores++;


            if (valores > 0) {
                qtPositivos++;
            } else {
                qtNegativos++;
            }
        }

        if (qtValores > 0) {
            double media = (double) soma / qtValores;
            double porcPositivos = ((double) qtPositivos / qtValores) * 100;
            double porcNegativos = ((double) qtNegativos / qtValores) * 100;


            System.out.println("Quantidade de valores positivos: " + qtPositivos);
            System.out.println("Quantidade de valores negativos: " + qtNegativos);
            System.out.println("Total de números digitados: " + qtValores);
            System.out.println("Porcentagem de positivos: " + porcPositivos + "%");
            System.out.println("Porcentagem de negativos: " + porcNegativos + "%");
        }

        scanner.close();
    }

    private static void Algoritmo7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++ALGORITMO7+++++");

        int numero;
        int qtNumero;
        int qtValida = 0;
        int soma = 0;

        for (qtNumero = 1; qtNumero <= 75; qtNumero++) {

            System.out.println("Digite o " + qtNumero + " número");
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Número inválido!!");
                break;
            }

            if (numero > 0) {
                soma += numero;
                qtValida++;
            }
        }
        if (qtValida > 0) {
            double media = (double) soma / qtValida;
            System.out.println("A quantidade de números válidos é: " + qtValida);
            System.out.println("A soma dos números é: " + soma);
            System.out.println("A média dos números é: " + media);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }
        scanner.close();
    }

    private static void Algoritmo8() {
        Scanner scanner = new Scanner(System.in);
        String nomeMaior = "";
        String nomeMenor = "";
        double maiorAltura = 0.0;
        double menorAltura = 0.0;
        double somaTotal = 0.0;
        double somaHomens = 0.0;
        double somaMulheres = 0.0;
        int qtdHomens = 0;
        int qtdMulheres = 0;

        final int TOTAL_AMIGOS = 15;

        for (int i = 1; i <= TOTAL_AMIGOS; i++) {
            System.out.println("\n--- Dados do " + i + "º amigo ---");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Altura em metros (ex: 1.75): ");
            double altura = scanner.nextDouble();

            System.out.print("Sexo (1 - Masculino, 2 - Feminino): ");
            int sexo = scanner.nextInt();


            scanner.nextLine();


            somaTotal += altura;

            if (i == 1) {
                maiorAltura = altura;
                nomeMaior = nome;
                menorAltura = altura;
                nomeMenor = nome;
            } else {
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    nomeMaior = nome;
                }
                if (altura < menorAltura) {
                    menorAltura = altura;
                    nomeMenor = nome;
                }
            }


            if (sexo == 1) {
                somaHomens += altura;
                qtdHomens++;
            } else if (sexo == 2) {
                somaMulheres += altura;
                qtdMulheres++;
            } else {
                System.out.println("Código de sexo inválido. Registro ignorado na média por sexo.");
            }
        }


        System.out.println("Maior altura: " + maiorAltura + "Nome:" + nomeMaior);
        System.out.println("Menor altura:  Nome:" + menorAltura + nomeMenor);

        double mediaTotal = somaTotal / TOTAL_AMIGOS;
        System.out.println("Média de altura geral da turma:" + mediaTotal);

        if (qtdHomens > 0) {
            double mediaHomens = somaHomens / qtdHomens;
            System.out.println("Média de altura dos homens: " + mediaHomens);
        } else {
            System.out.println("Nenhum homem foi cadastrado.");
        }

        if (qtdMulheres > 0) {
            double mediaMulheres = somaMulheres / qtdMulheres;
            System.out.printf("Média de altura das mulheres: %.2fm%n", mediaMulheres);
        } else {
            System.out.println("Nenhuma mulher foi cadastrada.");
        }

        scanner.close();
    }


    private static void Algoritmo9() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++ALGORITMO9+++++");

        double i;
        double nota;
        double Maior = 0;
        double Menor = 1;
        // número de pessoas que podem dar os dados
        for (i = 1; i >= 0; i++) {
            System.out.println("Digite a nota do aluno:");
            nota = scanner.nextInt();


            if (nota > 15 || nota < 0) {
                System.out.println("Não é possivél encontra nota");
                break;
            }

            if (nota > Maior) {
                Maior = nota;
            }
            if (nota < Menor) {
                Menor = nota;
            }
        }
        System.out.println("Menor nota é:" + Menor);
        System.out.println("Maior nota é:" + Maior);

        scanner.close();
    }

    private static void Algoritmo10() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++ALGORITMO9+++++");

        int polegadas;
        double centimetros = 0;
        int i;


        for (i = 1; i <= 20; i++) {
            System.out.println("Digite o valor da polegada:");
            polegadas = scanner.nextInt();

            if (polegadas < 0) {
                System.out.println("Valor inválido");
                break;
            }

            if (polegadas > 0) {
                centimetros = polegadas * 2.54;
            }

        }
        System.out.println("O valor das polegadas em centimetros é " + centimetros);

        scanner.close();
    }

    private static void Algoritmo11() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("+++Algoritmo 9+++++");
        //Variavél
        int i;
        ;
        int somaPares;
        int primNum;
        int ultmNUm = 0;


        System.out.print("Digite o primeiro número do intervalo: ");
        primNum = scanner.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        int ultmNum = scanner.nextInt();

        somaPares = 0;

        // O laço agora percorre do primeiro número até o último do intervalo
        for (i = primNum; i <= ultmNum; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            }
        }

        System.out.println("A soma dos números pares no intervalo de " + primNum + " até " + ultmNum + " é: " + somaPares);

        scanner.close();
    }


    private static void Algoritmo12() {
        Scanner scanner = new Scanner(System.in);
        int matricula;
        int maiorMatricula = 0;
        int segundaMaior = 0;
        int nota;
        int maiorNota = 0;
        int segundaMaiorNota = 0;
        int alunos;

        for (alunos = 0; alunos <= 4; alunos++) {

            System.out.println("Digite o número da sua matricula:");
            matricula = scanner.nextInt();

            System.out.println("Digite sua nota:");
            nota = scanner.nextInt();

            if (nota > maiorNota) {
                maiorNota = nota;
                maiorMatricula = matricula;
            }
            if (nota > segundaMaiorNota) {
                segundaMaiorNota = nota;
                segundaMaior = matricula;
            }
            System.out.println("O aluno com a maior nota é do número de matricula:"+maiorMatricula);
            System.out.println("O aluno com a segunda maior nota é do número de matricula:"+segundaMaior);

            scanner.close();
        }
    }
}