package DesafioPOO_Iphone;

import DesafioPOO_Iphone.APPs_Iphone.AparelhoTelefonico;
import DesafioPOO_Iphone.APPs_Iphone.NavegadorInternet;
import DesafioPOO_Iphone.APPs_Iphone.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    //Motodos de NavegadorInternet
    public void adicionarNovaAba() {
        System.out.println("Abrindo novo aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    //Metodos ReprodutorMusical
    public void aumentarVolume() {
        System.out.println("Aumentando volume");
    }

    public void criarPlaylist() {
        System.out.println("Criando playlist");
    }

    public void diminuirVolume() {
        System.out.println("Dimunuindo volume");
    }

    public void pausar() {
        System.out.println("Reprodução pausada");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }

    public void tocar() {
        System.out.println("Tocando música");
    }

    //Metodos Aparelhotelefonico
    public void ligar(){
        System.out.println("Ligando...");
    }
    public void atender() {
        System.out.println("Atendendo chamada");
    }
    public void gravarLigacao() {
        System.out.println("Gravando ligação");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }
    public void realizarConferencia() {
        System.out.println("Realizando conferência");
    }
}
