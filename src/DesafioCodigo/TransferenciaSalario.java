package DesafioCodigo;

import java.util.Scanner;

public class TransferenciaSalario {
    public static void main(String[] args) {
        
        //ler valores de entrada
        Scanner leitorEntrada = new Scanner(System.in);

            System.out.println("Informe o valor do salario: R$ ");
            float valorSalario = leitorEntrada.nextFloat();

            System.out.println("Informe o valor do benefício: R$ ");
            float valorBeneficios = leitorEntrada.nextFloat();

        float valorImposto = 0;

        //Verificação do percentual de imposto sobre o valor do salario
        //Caso o salario seja maior ou igual a 0 ou menor ou igual a 1100 imposto aumenta em 5%
        if (valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = valorSalario * 0.05f;
        }

        //Caso o salario seja maior ou igual a 1100.0 ou menor ou igual a 2500 imposto aumenta em 10%
        else if (valorSalario >= 1100.01 && valorSalario <= 2500){
            valorImposto = valorSalario * 0.10f;
        }

        //Caso o salario seja maior que 2500 imposto aumenta em 15%
        else{
            valorImposto = valorSalario * 0.15f;
        }

        System.out.println("Foi descontado do seu salário R$ " + valorImposto);

        float salario = (valorSalario - valorImposto) + valorBeneficios;
            System.out.println("Seu salário somado aos beneficios é R$: " + salario);

        leitorEntrada.close();
    }
    
}