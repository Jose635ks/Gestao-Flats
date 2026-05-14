import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class GestaoFlats
{
    private NumberFormat usd;
    private Flats flatMaisBarato;

    ///  Construtor
    public GestaoFlats()
    {
        usd = NumberFormat.getCurrencyInstance(Locale.US);
    }

    public void lerDoFicheiro(String nf)
    {
        StringTokenizer str;
        String umaLinha = "";
        int tipoFlat;
        int andar;
        float aluger;

        //Leitura do ficheiro
        try
        {
            FileReader fr = new FileReader(nf);
            BufferedReader br = new BufferedReader(fr);
            umaLinha = br.readLine();

            while (umaLinha != null)
            {
                str = new StringTokenizer(umaLinha, " ");
                tipoFlat = Integer.parseInt(str.nextToken());
                andar = Integer.parseInt(str.nextToken());
                aluger = Float.parseFloat(str.nextToken());

                Flats f = new Flats(tipoFlat, andar, aluger);
                System.out.println(f);

                //Flat mais barato
                flatMaisBarato(f);

                umaLinha = br.readLine(); //Salta para a proxima Linha
            }
            br.close(); // Fecho da leitura

            visualizar(); // Visualizar o resultado
        } catch (FileNotFoundException a)
        {
            System.out.println("Ficheiro " + nf + " nao encontrado");
        } catch (NumberFormatException nb)
        {
            System.out.println(nb.getMessage());
        } catch (IOException b)
        {
            System.out.println(b.getMessage());
        }

    }

    // Metodo para identificar a Flat mais Barata
    public void flatMaisBarato(Flats f)
    {
        // Verificar se o flat do tipo 5 esta no andar inferior ou igual a 5
        if (f.getTipoFlats() == 3 && f.getAndar() <= 5)
        {
            // Verifica se ainda não existe flat escolhido (null)
            // ou se este flat tem aluguer menor que o atual flatMaisBarato
            if (flatMaisBarato == null || f.getAluger() < flatMaisBarato.getAluger())
                flatMaisBarato = f;
        }
    }

    // Metodo para visualizar o resultado
    public void visualizar()
    {
        System.out.println("====Resultaddo===");
        if (flatMaisBarato != null)
        {
            System.out.println("Flat do tipo 3 mais barato no andar <=5:" + "\n" + flatMaisBarato);
        } else
        {
            System.out.println("Nao existe Flat do tipo 3 no andar <=5");
        }
    }

}
