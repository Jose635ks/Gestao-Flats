import java.io.*;
import java.util.Locale;
import java.text.NumberFormat;

public class Flats
{
    private int tipoFlats;
    private int andar;
    private float aluger;
    private NumberFormat usd;

    //Construtor
    public Flats(int tipoFlats, int andar, float aluger)
    {
        this.tipoFlats = tipoFlats;
        this.andar = andar;
        this.aluger = aluger;
        usd = NumberFormat.getCurrencyInstance(Locale.US);

    }

    // Getters
    public int getTipoFlats()
    {
        return tipoFlats;
    }

    public int getAndar()
    {
        return andar;
    }

    public float getAluger()
    {
        return aluger;
    }

    // Metodo String to String
    public String toString()
    {
        return " Tipo de Flat: " + tipoFlats +
                " Andar: " + andar +
                " Aluger: " + usd.format(aluger);
    }
}
