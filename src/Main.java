import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Bem-vindo aos exercícios 2 e 3 do TP3 (lista 1) de Java. Os exercícios estão colocados em sequência. \n Digite qualquer tecla para continuar ...");
        scanner.next();

        System.out.println("2-)Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em  uma variável inteira), imprima cada um dos seus dígitos por extenso.\n");
        System.out.println("Digite o número a ser usado no exercício 2: ");
        String entradaEx2 = scanner.next();

        System.out.println(NumeroPorExtenso.RespostaEx2(Integer.parseInt(entradaEx2)));

        System.out.println("\n 3-) Escreva um programa que, a partir de um nome informado pelo usuário, exiba suas  iniciais.  As iniciais são formadas pela primeira letra de cada nome, sendo que todas deverão  aparecer em maiúsculas na saída do programa. Note que os conectores e, do, da, dos, das,  de, di, du não são considerados nomes e, portanto, não devem ser considerados para a  obtenção das iniciais. As iniciais devem ser impressas em maiúsculas, ainda que o nome  seja entrado todo em minúsculas.\n");
        System.out.println("Digite o nome a ser usado no exercício 3: ");
        scanner.nextLine();
        String entradaEx3 = scanner.nextLine();

        System.out.println(RespostaEx3(entradaEx3));
        scanner.close();
    }

    public static class NumeroPorExtenso
    {
        public static String RespostaEx2(int numero)
        {
            if(numero < 0)
            {
                return "Menos " + RespostaEx2(-numero);
            }
            String[] unidades = {
                    "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"
            };

            String numeroTratado = String.valueOf(numero);

            StringBuilder respostaFinal = new StringBuilder("Resposta: ");

            for(int i = 0; i < numeroTratado.length(); i++){

                int digito = Character.getNumericValue(numeroTratado.charAt(i));
                respostaFinal.append(unidades[digito]);

                if (i < numeroTratado.length() - 1) {
                    respostaFinal.append(", ");
                }
            }
            return respostaFinal.toString();
        }
    }

    public static String RespostaEx3(String nome)
    {
        if (nome.trim().isEmpty()) {
            return "Nenhum nome fornecido";
        }

        String nomeTratado = nome.toUpperCase();

        String[] nomes = nomeTratado.split(" ");

        StringBuilder iniciais = new StringBuilder("Resposta: ");

        for (String n : nomes) {
            if (!n.equals("E") && !n.equals("DO") && !n.equals("DA") && !n.equals("DOS") && !n.equals("DAS") && !n.equals("DE") && !n.equals("DI") && !n.equals("DU")) {
                iniciais.append(n.charAt(0));
            }
        }
        return iniciais.toString();
    }
}