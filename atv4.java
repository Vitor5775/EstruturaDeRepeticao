public class CrescimentoPopulacional {
    public static void main(String[] args) {
        int populacaoA = 80000;
        int populacaoB = 200000;
        double taxaCrescimentoA = 0.03; 
        double taxaCrescimentoB = 0.015; 
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (populacaoA * taxaCrescimentoA);
            populacaoB += (populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");
    }
}
