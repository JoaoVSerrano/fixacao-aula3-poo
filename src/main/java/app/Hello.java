package app;

public class Hello {
    public static void main(String[] args) {
        Genero g1 = new Genero(1, "Aventura");
        Genero g2 = new Genero(2, " ");
  
        System.out.println("genero 1 = " + g1.getNome() + "(" + g1.getId() + ")");
        System.out.println("genero 2 = " + g2.getNome() + "(" + g2.getId() + ")");
    }
}




