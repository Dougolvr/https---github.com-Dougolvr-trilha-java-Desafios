package ControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parametro: ");
        int parametroUm =  terminal.nextInt();
            System.out.println("Digite o primeiro parametro: ");
        int parametroDois = terminal.nextInt();

//Tratamento de exceção caso o primeiro valor seja maior que o segundo
        try{
            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidosException exception){
            System.err.println("PARAMETROS INVALIDOS \n-------------------- \nO segundo parametro: " + parametroDois + " deve ser maior do que o primeiro.");
        }
        //Para fechar o Scanner por boas praticas (Apesar de rodar, apresenta "erro" linha 5 em "terminal")
        terminal.close();
    }
    public static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm < parametroDois){
            int contagem = parametroDois - parametroUm;

            for(int i=0; i < contagem; i++)
                System.out.println("O numero de repetições equivale ao valor da subtração da contagem, que foi: " + contagem);
        }else{
            throw new ParametrosInvalidosException();
        }
    }
}