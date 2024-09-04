package model;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada do Iphone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina de Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando novo Aba");
    }
}
