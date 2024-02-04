import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author Xandy
 */

public class Carta{
    private int valor;
    private char naipe;
    private Icon figura;
    private int numeroCarta;

    public Carta() {
    }

    public Carta(int valor, char naipe, String nomeImagem, int numeroCarta) {
        this.valor = valor;
        this.naipe = naipe;
        this.figura = new ImageIcon(getClass().getResource(nomeImagem));
        this.numeroCarta = numeroCarta;
    }

    public Carta(int numeroCarta, int naipe) {
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
     
        this.figura = new ImageIcon(getClass().getResource("/imagens/"+numeroCarta+this.naipe+".png"));
        this.numeroCarta = numeroCarta;
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
