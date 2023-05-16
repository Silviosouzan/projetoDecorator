public abstract class ItemDecorator implements Item {
    protected Item itemDecorado;

    public ItemDecorator(Item itemDecorado) {
        this.itemDecorado = itemDecorado;
    }

    public String getNome() {
        return itemDecorado.getNome();
    }

    public int getPoder() {
        return itemDecorado.getPoder();
    }

    public String getDescricao() {
        return itemDecorado.getDescricao();
    }
}

