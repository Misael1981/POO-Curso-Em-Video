public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 50;

        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println("============");

        Caneta c2 = new Caneta();
        c2.modelo = "Pilot";
        c2.cor = "Vermelha";
        c2.ponta = 1f;
        c2.carga = 10;

        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
