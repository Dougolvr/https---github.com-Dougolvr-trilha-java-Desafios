package DesafioTelefonia;

import java.util.Scanner;

public class verificarCombo {
    public static void main(String[] args) {
        Scanner leitorEntrada = new Scanner(System.in);
        
        System.out.println("Quais serviços você possui? (movel|banda larga|tv)");
        String tipoServico = leitorEntrada.nextLine().trim();

        String servicosCombo[] = {"movel", "banda larga", "tv"};

        boolean servicosContratados = true;


        /*Contains verifica se o que foi inserido em "tipoServico" esta contido no array "servicosContratados"
         * "!" faz a negação de tipoServico.contains(servicosCombo[i]) ou seja, o torna falso
         * Se o serviço não estiver presente em tipoServico, servicosContratados é definido como false, e o laço é interrompido com break.
         */
        for(int i = 0; i < servicosCombo.length; i++) {
            if(!tipoServico.contains(servicosCombo[i])){
                servicosContratados = false;
                break;
            }
        }
        if (servicosContratados) {
            System.out.println("Combo Completo! \n Cliente possui os serviço: " + tipoServico);
        } else {
            System.out.println("Combo Incompleto! \n Cliente posssui apenas: " + tipoServico);
        }
    }
}
