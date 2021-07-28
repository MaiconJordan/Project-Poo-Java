package ProjetoYouTube;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula de Node");

        Aluno a[] = new Aluno[2];

        a[0] = new Aluno("Joao", 22, "M", "Jojo");
        a[1] = new Aluno("Alex",21,"M","Ale");



        // System.out.println(v[0].toString());
        System.out.println(a[0].toString());
    }
}
