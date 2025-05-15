public class ContaBancaria {
//atributos privados
private int numeroConta;
private String titular;
private double saldo;

  //construtor
  public ContaBancaria(int numeroConta, String  titular , double saldoInicial} {
     this.numeroConta = numeroConta;
     this.titular = titular;
     this.saldo = saldoIncial;
}

// Getters e Setters
public int getNumeroConta() {
    return numeroConta;
}

public void setNumeroConta(int numeroConta) { 
    this.numeroConta = numeroConta; 
}

public String getTitular{} {
    return titular;
}

public void setTitular(String titular) {
     this.titular = titular;
}

public diouble getSaldo() {
      return saldo;
}

//Métodos de operação
public void depositar (double valor) {
       if (valor > 0 valor <= saldo) {
           saldo = valor;
           return true;
     } else {
           return false;
     }
  }

}
  
  
