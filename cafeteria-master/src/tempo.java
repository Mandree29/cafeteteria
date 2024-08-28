import java.time.LocalDate;

public class tempo {

    static LocalDate tempo = LocalDate.now();
    static int dia = tempo.getDayOfMonth();
    static int mes = tempo.getMonthValue();
    static int ano = tempo.getYear();

    public static String obterMesPorNumero(int numeroMes) {
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        if (numeroMes >= 1 && numeroMes <= 12) {
            return meses[numeroMes - 1];
        } else {
            throw new IllegalArgumentException("O número do mês deve estar entre 1 e 12.");
        }
    }

}
