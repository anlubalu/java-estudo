public class Estudos {
    public static void main(String[] args) {
        System.out.println("JVM (Java Virtual Machine) - é a Máquina Virtual do Java responsável por executar o bytecode");
        System.out.println("JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu program");
        // digitar sout

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de aventura com galâ dos anos 80";
        System.out.println(sinopse);

        sinopse = """
                teste de string 1
                teste de string 2
                teste de string 3
                """ + anoDeLancamento;
        System.out.println(sinopse);

        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        int classificacao;
        classificacao = (int) (media/2); // cast explicito

        String nome = "Maria";
        int idade = 30;
        double valord = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valord));

        String nomed = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nomed, aulas);

        System.out.println(mensagem);

        int valor =  10;
        valor += 15;  //Equivalente a valor = valor + 15, atribui o valor 25 à variável valor

        int a = 10 + 5; // Atribui o valor 15 à variável a
        int b = 10 - 5; // Atribui o valor 5 à variável b
        int c = 10 * 5; // Atribui o valor 50 à variável c
        int d = 10 / 5; // Atribui o valor 2 à variável d
        int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)

        int aa = 10; // Atribui o valor 10 à variável a
        int bb = 5; // Atribui o valor 5 à variável b
        int cc = 30; // Atribui o valor 30 à variável c

        boolean igual = (b == a); //Nesse caso a variável igual ficará com o valor *false*, pois o valor de b não é igual o valor de a.
        boolean diferente = (b != c); //A variável diferente ficará com o valor *true*, pois o valor de b é diferente do valor de c.
        boolean maior = (b > a); //A variável maior ficará com o valor *false*, pois o valor de b é menor que o valor de a.
        boolean menorIgual = (b <= c); //A variável menorIgual ficará com o valor *true*, pois o valor de b é menor que o valor de c.

        boolean ab = true;
        boolean ba = false;
        if (ab && ba) {
            // Este código não será executado, já que a é verdadeiro e b é falso.
            System.out.println("Este código não será executado, já que a é verdadeiro e b é falso.");
        }

        boolean aaa = true;
        boolean bbb = false;
        if (aaa || bbb) {
            // Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
            System.out.println("Este código será executado, já que a é verdadeiro, mesmo que b seja falso.");
        }

        boolean aaaa = true;
        if (!aaaa) {
            // Este código não será executado, já que a é verdadeiro.
            System.out.println("Este código não será executado, já que a é verdadeiro.");
        }

        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

        int resultado2 = num++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(num); // imprime 6
        System.out.println(resultado2); // imprime 5
    }
}
