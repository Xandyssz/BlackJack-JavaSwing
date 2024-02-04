import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author Xandy
 */
public class CartaViravel{
    private int valor;
    private char naipe;
    private Icon figura;
    private Icon frente;
    private Icon verso;
    private int numeroCarta;
    private boolean aberta = false;

    public CartaViravel() {
    }

    public CartaViravel(int valor, char naipe, String nomeImagem, int numeroCarta) {
        this.valor = valor;
        this.naipe = naipe;
        this.figura = new ImageIcon(getClass().getResource(nomeImagem));
        this.numeroCarta = numeroCarta;
    }

    public CartaViravel(int numeroCarta, int naipe) {
        if (numeroCarta > 10)
            this.valor = 10;
        else
            this.valor = numeroCarta;
        
        switch (naipe)
        {
            case 1: this.naipe = 'o'; break;
            case 2: this.naipe = 'e'; break;
            case 3: this.naipe = 'c'; break;
            case 4: this.naipe = 'p'; break;
        }
     
        this.frente = new ImageIcon(getClass().getResource("/imagens/"+numeroCarta+this.naipe+".png"));
        this.verso = new ImageIcon(getClass().getResource("/imagens/verso.png"));
        this.figura = this.verso;
        this.numeroCarta = numeroCarta;
    }    
    
    public void abrirCarta()
    {
        this.figura = this.frente;
        this.aberta = true;
    }
    
    public void fecharCarta()
    {
        this.figura = this.verso;
        this.aberta = false;
    }
    
    public boolean estaAberta()
    {
        return this.aberta;
    }  
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public char getNaipe() {
        return naipe;
    }

    public void setNaipe(char naipe) {
        this.naipe = naipe;
    }

    public Icon getFigura() {
        return figura;
    }

    public void setFigura(Icon figura) {
        this.figura = figura;
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(int numeroCarta) {
        this.numeroCarta = numeroCarta;
    }
}
