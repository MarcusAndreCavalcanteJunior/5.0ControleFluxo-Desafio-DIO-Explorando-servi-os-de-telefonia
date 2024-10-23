import java.util.Scanner;

public class VerificacaoCombo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos serviços contratados pelo cliente
        String entradaServicos = scanner.nextLine().trim();

        // Separando os serviços contratados
        String[] servicosContratados = entradaServicos.split(",");

        // Variáveis para verificar se cada serviço foi contratado
        boolean movel = false;
        boolean bandaLarga = false;
        boolean tv = false;

        // Verificando os serviços contratados
        for (String servico : servicosContratados) {
            if (servico.trim().equalsIgnoreCase("movel")) {
                movel = true;
            } else if (servico.trim().equalsIgnoreCase("banda larga")) {
                bandaLarga = true;
            } else if (servico.trim().equalsIgnoreCase("tv")) {
                tv = true;
            }
        }

        // Verifica se todos os três serviços foram contratados
        if (movel && bandaLarga && tv) {
            System.out.println("Combo Completo");
        } else {
            System.out.println("Combo Incompleto");
        }

        scanner.close();
    }
}
/*
 * 2. Segundo desafio: Verificação de combo completo
 * Objetivo: Verificar se o cliente contratou um combo completo de serviços, ou
 * seja, todos os serviços
 * "movel", "banda larga" e "tv".
 * 
 * Conceitos abordados:
 * 
 * Verificação múltipla: Nesse desafio, você precisava verificar mais de uma
 * condição
 * (se três serviços estavam presentes na lista). Isso te ajudou a praticar:
 * Criar variáveis booleanas para acompanhar se cada serviço foi encontrado.
 * Usar loops e condicionais para verificar mais de um critério ao mesmo tempo.
 * Estrutura de repetição e lógica cumulativa: Como esse desafio envolvia
 * verificar várias condições
 * (cada serviço), você aprendeu a usar uma lógica cumulativa para guardar o
 * estado de cada verificação
 * e depois tomar uma decisão baseada na combinação dos resultados.
 * Lições: Esse desafio foca na habilidade de lidar com verificações múltiplas e
 * condições complexas.
 * Muitas vezes, um programa precisa verificar se várias condições são
 * verdadeiras ao mesmo tempo
 * (como garantir que um cliente atenda a vários critérios). Você também
 * aprendeu a manipular booleanos e
 * loops de maneira eficiente.
 * Resumo geral dos desafios:
 * Esses dois desafios são bons exemplos de como usar:
 * 
 * Entrada de dados: Lendo strings e processando-as.
 * Manipulação de listas e strings: Trabalhando com dados separados por vírgulas
 * e verificando valores
 * específicos.
 * Estruturas de controle: Como if-else e loops (for), que são essenciais em
 * praticamente
 * qualquer código que você escreverá.
 * Lógica de verificação: Aplicar condições para tomar decisões com base nos
 * dados.
 * Esses são conceitos fundamentais em programação. Conforme você avança em
 * Java, esses desafios
 * servem para solidificar sua compreensão de como construir soluções baseadas
 * em entrada de dados,
 * validação e estruturação de código. Você está aprendendo a pensar em termos
 * de lógica de programação,
 * que é a base para resolver problemas maiores e mais complexos no futuro!
 */