public class Avaliador {
    private Lance maiorLance;
    private Lance menorLance;

    public Avaliador() {
        maiorLance =  new Lance( new Usuario(""), Double.NEGATIVE_INFINITY);
        menorLance = new Lance( new Usuario(""), Double.POSITIVE_INFINITY);
    }
    public  void avalia (Leilao leilao) throws Exception{
        if(leilao.getLances().isEmpty()){
            throw new Exception("Leilão deve conter pelo menos um Lance.");
        }
        for (Lance lance: leilao.getLances()){
             if (lance.getValor() > maiorLance.getValor()){
                 maiorLance = lance;
             }
             if (lance.getValor() < menorLance.getValor()){
                 menorLance = lance;
             }

        }
    }
    public Lance getMaiorLance(){
        return maiorLance;
    }
    public Lance getMenorLance(){
        return  menorLance;
    }
}
