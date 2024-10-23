import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");

        boolean contratado = false; // Inicializa como não contratado

        // Verificar se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].trim().equalsIgnoreCase(servico)) {
                contratado = true;
                break; // Se o serviço for encontrado, para o loop
            }
        }

        // Exibir o resultado
        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

        scanner.close();
    }
}
/*
 * 1. Primeiro desafio: Verificação de serviço contratado
 * Objetivo: Verificar se um cliente contratou um serviço específico (como
 * "movel", "fixa", "tv", etc.).
 * 
 * Conceitos abordados:
 * 
 * Manipulação de Strings: O desafio te pediu para ler uma entrada de dados que
 * contém uma lista de serviços
 * separados por vírgulas e verificar se um serviço específico está presente.
 * Isso te ajudou a praticar:
 * Como dividir uma string em partes usando split().
 * Comparação de strings (equalsIgnoreCase), que é importante ao trabalhar com
 * dados textuais.
 * Estruturas de controle: Usar loops para percorrer listas de dados (arrays).
 * Lógica condicional: Aplicar um simples if-else para tomar decisões baseadas
 * em se um serviço foi encontrado ou não.
 * Lições: Esse desafio te mostrou como lidar com entrada e saída de dados e
 * comparação de strings, algo essencial em muitas aplicações do mundo real.
 * Saber verificar se certas
 * informações estão presentes dentro de uma lista é uma habilidade muito usada
 * em várias áreas
 * da programação, como validação de dados e processamento de listas.
 */