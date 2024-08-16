// - "gets" : lê uma linha com dados de entrada(inputs) do usuario;
// - "print" : imprie um texto de saida(output), pulando linha.

// Lê os valores de entrada
const valorSalario =  parseFloat(gets("informe o salario: "));
const valorBeneficio =  parseFloat(gets("informe o beneficio: "));

//Calcula o imposto atraves da função "calcularImposto"
const valorImposto = calcaularImposto(valorSalario);

//Calcula e imprime a saida (com 2 casas decimais)
const salario = valorSalario - valorImposto + valorBeneficio;
print("valor do salario ", saida.toFixed(2));

//Função util para o calculo do imposto(baseda nas aliquotas).
function calcularImposto(salario){
    let aliquota; //Let é usado quando o valor pode mudar
        if(salario >=0 && salario <=1100){
            aliquota = 0.05;
        }
        else if (Salario >= 1100.01 && Salario <= 2500){
            aliquota = 0.10;
        }
        else{
            aliquota = 0.15;
        }
    //Retorna o calculo
    return aliquota * salario;
}

// EXEMPLO APENAS PARA VIZUALIZAÇÃO DE COMO FICARIA O CODIGO Java EM JavaScript




// para consegui visualizar o codigo na IDE rprecisa instalar o node.js
// depois baixa a extensão Code Runner