public class Main {
    public static void main(String[] args) {

      Lista lista = new Lista(10);

      lista.adicionar(5);
      lista.adicionar(10.3);
      System.out.println("O tamanho da lista é: " + lista.tamanho());

      for (int i = 0; i < lista.tamanho(); i++) {
          System.out.println(lista.get(i));
      }

      System.out.println(lista.get(2));
      lista.adicionar(-10);

      System.out.println(lista.get(2));

      lista.set(1, 1000);
      lista.limpar();
    }
}
