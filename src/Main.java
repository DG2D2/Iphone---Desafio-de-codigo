public class Main {
    public static void main(String[] args) {
      
      Iphone iphone = new Iphone();
      
      iphone.selecionarMusica();
      iphone.tocarMusica();
      iphone.pausar();

      System.out.print("\n");
      
      iphone.ligar();
      iphone.atender();
      iphone.adicionarContato();
      iphone.removerContato();
      iphone.iniciarCorreioVoz();
      
      System.out.print("\n");
      
      iphone.navegar();
      iphone.pesquisar();
      iphone.exibirPagina();
      iphone.adicionarNovaAba();
      iphone.atualizarPagina();
  }
}
