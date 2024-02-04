import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Xandy
 */

public class Baralho {

    private Random sorteio = new Random();

    private ArrayList<CartaViravel> baralho = new ArrayList<>();
     
    public void montarBaralho()
    {
        this.baralho.clear();
        for(int i=1; i<=4;i++)
        {
            for(int j=1; j<=13; j++)
            {
               baralho.add(new CartaViravel(j, i));
            }
        }
    }

    public void montarBaralhoComAsCartasQueTenho()
    {
        this.baralho.clear();
        for(int j=1; j<=13; j++)
        {
           baralho.add(new CartaViravel(j, 4));
        }
    }
    
    public CartaViravel pegarCarta()
    {       
        CartaViravel carta = null;
        
        if (!this.baralho.isEmpty())
        {
            int nrCartaSorteada = sorteio.nextInt(this.baralho.size());
            carta = baralho.get(nrCartaSorteada);
            this.baralho.remove(nrCartaSorteada);
        }
        return carta;
    } 
    
    public int getQuantidadeCartas()
    {
        return this.baralho.size();
    }
    
    public boolean acabouCartas()
    {
        return this.baralho.isEmpty();
    }
}
