package UFC;

public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

               l[0] =  new Lutador("Yury Mychell", "Mossoroense", 22, 1.58f, 67.5f,
                0, 5, 12   );
               l[1] =  new Lutador("Big Jairo", "Goiana", 15, 1.66f, 118.6f,
                3, 1, 15   );
               l[2] =  new Lutador("Matheus Lippi", "Zoologico", 73, 1.73f, 81.5f,
                1, 0, 9   );
               l[3] =  new Lutador("Diego", "Bahia", 35, 1.46f, 119.6f,
                0, 0, 0  );
               l[4] =  new Lutador("Paulo", "Alemanha", 23, 1.53f, 96.5f,
                10, 10, 0   );
               l[5] =  new Lutador("Jairo Atual", "Goiana", 23, 1.73f, 80.6f,
                9, 6, 0   );

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[1], l[3]);
        UFC01.Lutar();

    }
}