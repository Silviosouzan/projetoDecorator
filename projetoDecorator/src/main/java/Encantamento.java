public abstract class Encantamento implements Conta {

    private Conta conta;
    public String status;

    public Encantamento(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public abstract float getPercentualPoder();

    public float getPoder() {
        return this.conta.getPoder() * (1 + (this.getPoder() / 100));
    }

    public abstract String getNomeStatus();

    public String getStatus() {
        return this.conta.getStatus() + "/" + this.getStatus();
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
