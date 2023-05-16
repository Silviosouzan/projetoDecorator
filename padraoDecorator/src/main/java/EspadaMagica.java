public class EspadaMagica extends ItemDecorator {
    public EspadaMagica(Item itemDecorado) {
        super(itemDecorado);
    }

    public int getPoder() {
        return super.getPoder() + 10;
    }

    public String getDescricao() {
        return super.getDescricao() + ", com poder mágico";
    }
}

