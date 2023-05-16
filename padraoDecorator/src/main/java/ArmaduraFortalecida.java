public class ArmaduraFortalecida extends ItemDecorator {
    public ArmaduraFortalecida(Item itemDecorado) {
        super(itemDecorado);
    }

    public int getPoder() {
        return super.getPoder() + 20;
    }

    public String getDescricao() {
        return super.getDescricao() + ", com resistência adicional";
    }
}
