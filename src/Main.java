import model.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.ligar("9999-8990");
        iphone.selecionarMusica("Hidroponica - Forfun");
        iphone.tocar();
        iphone.exibirPagina("www.youtube.com");

    }
}