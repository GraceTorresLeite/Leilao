public class Lance {
    private Usuario proponente;
    private double valor;

    public Lance(Usuario proponente, double valor){
        this.proponente = proponente;
        this.valor = valor;
    }
    public Usuario getProponente(){
        return proponente;
    }
    public double getValor(){
        return valor;
    }

    @Override
    public String toString(){
        return String.format("Proponente: %s. Valor: %.2f", proponente.getNome(), valor);
    }
}
