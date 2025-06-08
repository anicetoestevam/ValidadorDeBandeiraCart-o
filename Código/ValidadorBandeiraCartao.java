public class ValidadorBandeiraCartao {

    public static String identificar(String cardNumber) {
        if (cardNumber == null)
            return "Desconhecida";

        int length = cardNumber.length();

        // MasterCard: começa com 51-55 ou 2221-2720, 16 dígitos
        if ((cardNumber.matches("^5[1-5].*") && length == 16) ||
            (cardNumber.matches("^2(2[2-9][1-9]|2[3-9]\\d|[3-6]\\d{2}|7[01]\\d|720).*") && length == 16)) {
            return "MasterCard";
        }

        // Visa: começa com 4, 13 ou 16 ou 19 dígitos
        if (cardNumber.startsWith("4") && (length == 13 || length == 16 || length == 19)) {
            return "Visa";
        }

        // Visa Electron: começa com 4026, 417500, 4508, 4844, 4913, 4917, 16 dígitos
        if ((cardNumber.matches("^(4026|417500|4508|4844|4913|4917).*")) && length == 16) {
            return "Visa Electron";
        }

        // American Express: começa com 34 ou 37, 15 dígitos
        if ((cardNumber.startsWith("34") || cardNumber.startsWith("37")) && length == 15) {
            return "American Express";
        }

        // Diners Club: começa com 300-305, 36, 38, 39, 14 dígitos
        if ((cardNumber.matches("^3(0[0-5]|[68]|9).*")) && length == 14) {
            return "Diners Club";
        }

        // Discover: começa com 6011, 622126-622925, 644-649, 65, 16 dígitos
        if ((cardNumber.matches("^(6011|65|64[4-9]).*") && length == 16) ||
            (cardNumber.matches("^622(12[6-9]|1[3-9][0-9]|[2-8][0-9]{2}|9[01][0-9]|92[0-5]).*") && length == 16)) {
            return "Discover";
        }

        // enRoute: começa com 2014, 2149, 15 dígitos
        if ((cardNumber.startsWith("2014") || cardNumber.startsWith("2149")) && length == 15) {
            return "enRoute";
        }

        // JCB: começa com 3528-3589, 16 dígitos
        if (cardNumber.matches("^35(2[89]|[3-8][0-9]).*") && length == 16) {
            return "JCB";
        }

        // Maestro: começa com 5018, 5020, 5038, 56-69, 12 a 19 dígitos
        if (cardNumber.matches("^(5018|5020|5038|56|57|58|6[0-9]).*") && length >= 12 && length <= 19) {
            return "Maestro";
        }

        // Solo: começa com 6334, 6767, 16, 18 ou 19 dígitos
        if ((cardNumber.startsWith("6334") || cardNumber.startsWith("6767")) && (length == 16 || length == 18 || length == 19)) {
            return "Solo";
        }

        // Switch: começa com 4903, 4905, 4911, 4936, 6333, 6759, 16, 18 ou 19 dígitos
        if ((cardNumber.matches("^(4903|4905|4911|4936|6333|6759).*")) && (length == 16 || length == 18 || length == 19)) {
            return "Switch";
        }

        // Laser: começa com 6304, 6706, 6771, 6709, 16-19 dígitos
        if ((cardNumber.matches("^(6304|6706|6771|6709).*")) && (length >= 16 && length <= 19)) {
            return "Laser";
        }

        return "Desconhecida";
    }
}