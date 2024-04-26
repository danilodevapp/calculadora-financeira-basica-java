public class Calcular {

public double Montante, Capital, CapitalInicial, Taxa, Tempo, Juros;


public double CalcularJurosSimples(double capitalInicial, double juros){
    
    capitalInicial = CapitalInicial;
    juros = Juros;

    Montante = capitalInicial + juros;

    return capitalInicial + Montante;
}

public double CalcularJuros (double capitalInicial, double taxa, double tempo){
    
    capitalInicial = CapitalInicial;
    taxa = Taxa;
    tempo = Tempo;
    
    return capitalInicial * taxa * tempo;
}

public double CalcularTaxaDeJuros (double juros, double capital, double taxa){
    
    juros = Juros;
    capital = Capital;
    taxa = Taxa;

    return juros / (capital * taxa);
}

public double CalcularJurosCompostos (double capitalInicial, double taxa, double tempo){
    
    capitalInicial = CapitalInicial;
    taxa = Taxa;
    tempo = Tempo;

    return capitalInicial * Math.pow((1 + taxa), tempo);
}

}
