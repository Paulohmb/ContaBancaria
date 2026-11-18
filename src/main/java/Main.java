
void main() {
    var conta = new ContaBancaria();

    int opcao;

    do {
        consultarSaldo(conta);
        opcao = menu();
        switch (opcao) {
            case 1 -> depositar(conta);
            case 2 -> sacar(conta);
            case 0 -> IO.println("Encerrando o programa...");
            default -> IO.println("Opção inválida!");
        }

    } while (opcao != 0);
}

int menu() {
    IO.println("\n=== BANCO ===");
    IO.println("1 - Depositar");
    IO.println("2 - Sacar");
    IO.println("0 - Sair");
    IO.print("Escolha uma opção: ");

    return Integer.parseInt(IO.readln());
}

void depositar(ContaBancaria conta) {
    double valor = lerValor("Valor do depósito: ");

    conta.depositar(valor);

    IO.println("Depósito realizado!");
}

void sacar(ContaBancaria conta) {
    double valor = lerValor("Valor do saque: ");

    conta.sacar(valor);

    IO.println("Saque realizado!");
}

void consultarSaldo(ContaBancaria conta) {
    IO.println(String.format("Saldo atual: R$ %.2f%n", conta.getSaldo()));
}

double lerValor(String mensagem) {
    IO.print(mensagem);
    return Double.parseDouble(IO.readln());
}
