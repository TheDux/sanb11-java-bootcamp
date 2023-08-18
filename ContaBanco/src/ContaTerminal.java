import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        final double BANK_BALANCE = 1257.38;

        System.out.println(" /__/  /__/  /__/  /__/  /__/  /__/  /__/  /__/  /__/");
        System.out.println("  _____             _                  _           \r\n" + //
                " / ____|           | |                | |          \r\n" + //
                "| (___   __ _ _ __ | |_ __ _ _ __   __| | ___ _ __ \r\n" + //
                " \\___ \\ / _` | '_ \\| __/ _` | '_ \\ / _` |/ _ \\ '__|\r\n" + //
                " ____) | (_| | | | | || (_| | | | | (_| |  __/ |   \r\n" + //
                "|_____/ \\__,_|_| |_|\\__\\__,_|_| |_|\\__,_|\\___|_|   \r\n" + //
                "                                                   \r\n" + //
                "[Mas é o fake blz?]");
        System.out.println(" /__/  /__/  /__/  /__/  /__/  /__/  /__/  /__/  /__/ ");

        System.out.println("\n Por favor, digite o número da Agência:");
        int bankAccount = scanner.nextInt();

        System.out.println("\n Digite o número da conta com dígito verificador");
        String accountNumber = scanner.next();

        System.out.println("\n Nome do cliente:");
        String clientName = scanner.nextLine();
        clientName = scanner.nextLine();

        System.out.println("\n Olá "
        .concat(clientName)+
        ", obrigado por criar uma conta em nosso banco, sua agência é "
        +bankAccount
        +", conta "
        +accountNumber
        +" e seu saldo já está conosco via OpenBanking: "
        +BANK_BALANCE);
    }

}
