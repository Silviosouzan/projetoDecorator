public class Encantamentos extends Encantamento {

    public Encantamentos(Conta conta) {
        super(conta);
    }

    public float getPercentualPoder() {
        return 20.0f;
    }

    public String getNomeStatus() {
        return "ACC";
    }
}
