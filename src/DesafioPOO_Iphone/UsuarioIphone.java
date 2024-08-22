package DesafioPOO_Iphone;

import java.util.Scanner;

import DesafioPOO_Iphone.APPs_Iphone.AparelhoTelefonico;
import DesafioPOO_Iphone.APPs_Iphone.NavegadorInternet;
import DesafioPOO_Iphone.APPs_Iphone.ReprodutorMusical;

public class UsuarioIphone {
    public static void main(String[] args) {

        Scanner click = new Scanner(System.in);
        int escolhaAPP = 0;
        int escolhaAcao = 0;

        Iphone em = new Iphone();

        AparelhoTelefonico ligacao = em;
        NavegadorInternet navegador = em;
        ReprodutorMusical musica = em;
        
        ligacao.ligar();
        ligacao.atender();
        ligacao.iniciarCorreioVoz();
        ligacao.realizarConferencia();
        ligacao.gravarLigacao();

        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        musica.tocar();
        musica.pausar();
        musica.selecionarMusica();
        musica.criarPlaylist();
        musica.aumentarVolume();
        musica.diminuirVolume();

        while (escolhaAPP != 4) {
            System.out.println("INFORME O APP QUE DESEJA ENTRAR \n -----------------------------------------------");
            System.out.println("1 - App Ligação");
            System.out.println("2 - App Navegador");
            System.out.println("3 - App Musica");
            System.out.println("4 - Sair");

            escolhaAPP = click.nextInt();

            switch (escolhaAPP) {
                case 1:
                    System.err.println("APP LIGAÇÃO\n ------------------ \nEscolha uma opção:");
                    System.out.println("1 - Atender ligação");
                    System.out.println("2 - Ligar");
                    System.out.println("3 - Iniciar correio de voz");
                    System.out.println("4 - Realizar conferência");
                    System.out.println("5 - Iniciar gravação de ligação");
                    System.out.println("6 - Voltar ao menu principal");
                    escolhaAcao = click.nextInt();

                    switch (escolhaAcao) {
                        case 1:
                            ligacao.atender();
                            break;
                        case 2:
                            ligacao.ligar();
                            break;
                        case 3:
                            ligacao.iniciarCorreioVoz();
                            break;
                        case 4:
                            ligacao.realizarConferencia();
                            break;
                        case 5:
                            ligacao.gravarLigacao();
                        case 6:
                            break;
                        default:
                            System.out.println("Opção invalida!");//;
                    }
                    break;
                case 2:
                    System.out.println("APP NAVEGADOR\n ------------------ \nEscolha uma opção:");
                    System.out.println("1 - Abrir nova aba");
                    System.out.println("2 - Atualizar página");
                    System.out.println("3 - Voltar ao menu principal");
                    
                    escolhaAcao = click.nextInt();

                    switch (escolhaAcao) {
                        case 1:
                            navegador.adicionarNovaAba();
                            break;
                        case 2:
                            navegador.atualizarPagina();
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Opção invalida!");
                    }
                    break;
                case 3:
                    System.out.println("APP Música\n ------------------ \nEscolha uma opção:");
                    System.out.println("1 - Selecionar música");
                    System.out.println("2 - Tocar música");
                    System.out.println("3 - Pausar música");
                    System.out.println("4 - Criar playlist");
                    System.out.println("5 - Aumentar volume");
                    System.out.println("6 - Diminuir volume");
                    System.out.println("7 - Voltar ao menu principal");

                    escolhaAcao = click.nextInt();

                    switch (escolhaAcao) {
                        case 1:
                            musica.selecionarMusica();
                            break;
                        case 2:
                            musica.tocar();;
                            break;
                        case 3:
                            musica.pausar();
                            break;
                        case 4:
                            musica.criarPlaylist();
                            break;
                        case 5:
                            musica.aumentarVolume();
                            break;
                        case 6:
                            musica.diminuirVolume();
                            break;
                        case 7:
                            break;
                        default:
                            System.out.println("Opção invalida!");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa");
                    break;
            default:
                    System.out.println("Opção inválida. Selecione novamente!");;
            }
        }
        click.close();



    }
}
