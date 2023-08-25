package aula05;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("---------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("A conta esta aberta? " + this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta Negativada");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }

    }


    public void depositar(float valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito Feito na conta: " + this.getDono());
        } else {
            System.out.println("Impossivel depositar");
        }

    }

    public void sacar(float valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque Realizado na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }


    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }
            else if (this.getTipo() == "CP") {
                v = 20;
        }
            if (this.getStatus()){
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Mensalidade paga por :" + this.getDono());
                }
                else {
                    System.out.println("Impossivel Pagar");
                }
            }



    public ContaBanco(){
        this.setSaldo(0);
        this.status = false;

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

