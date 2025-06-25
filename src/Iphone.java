public class Iphone implements Ipod, Telephone, Internet{
  
    @Override
    public void selecionarMusica () {
      System.out.println("Selecionando música no Iphone.");
    }
    
    @Override
    public void tocarMusica () {
      System.out.println("Tocando música no Iphone.");
    }
    
    @Override
    public void pausar () {
      System.out.println("Música pausada.");
    }
    
    //========================================================================
    
    @Override
    public void ligar () {
      System.out.println("Realizando chamada do Iphone.");
    }
    
    @Override
    public void atender () {
      System.out.println("Atendendo ligação do Iphone.");
    }
    
    @Override
    public void adicionarContato () {
      System.out.println("Adicionando contato ao Iphone.");
    }
    
    @Override
    public void removerContato () {
      System.out.println("Removendo contato do Iphone.");
    }

    @Override
    public void iniciarCorreioVoz () {
      System.out.println("Iniciando correio de voz.");
    }
    
    //========================================================================
    
    @Override
    public void navegar () {
      System.out.println("Navegando na internet pelo Iphone.");
    }
    
    @Override
    public void pesquisar () {
      System.out.println("Pesquisando na internet pelo Iphone.");
    }
    
    @Override
    public void exibirPagina () {
      System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba () {
      System.out.println("Adicionando nova aba.");
    }
    
    @Override
    public void atualizarPagina () {
      System.out.println("atualizando página.");
    }

  }
  