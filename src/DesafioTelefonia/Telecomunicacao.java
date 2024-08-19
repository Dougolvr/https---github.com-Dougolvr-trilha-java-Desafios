package DesafioTelefonia;

import java.util.Scanner;

public class Telecomunicacao {
    public static void main(String[] args) {
        
        Scanner leitorEntrada = new Scanner(System.in);

        System.out.println("Infomre o tipo de serviço | movel | fixa | banda larga | tv|: ");
        String tipoServico = leitorEntrada.next().trim();
        System.out.println("Informe seu nome e os serviços que contratou: ");
        String clienteServico = leitorEntrada.next().trim();

        // String[] separa 'clienteServico' por virgulas e as armazenam em um array.
        String[] dadosCliente = clienteServico.split(",");
        // nomeCliente armazena nome no array dados na primeira posição(0) do array.
        String nomeClinte = dadosCliente[0];

        // Verificação do servico contratado
        boolean  servicoContratado = false;
        for (int i = 1; i < dadosCliente.length; i++) {
            if(dadosCliente[i].trim().equalsIgnoreCase(tipoServico)) {
                servicoContratado = true;
                break;
            }
        }
        if(servicoContratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        leitorEntrada.close();
    }
}


// trim() -> remove espaços extras na impressão
// equalsIgnoreCase() -> é usado para ignorar diferenças entre letras maiúsculas e minúsculas.