
/**
 * Escreva a descrição da classe CNH aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CNH
{
    private String numero;
    private int pontos;
    private boolean status;
    private char categoria;

    /**
     * Construtor para objetos da classe 
     */
    public CNH(int numero, boolean status, char categoria)
    {
        this.numero = Integer.toString(numero);
        this.pontos = 0;
        this.status = status;
        this.categoria = categoria;
    }

    /**
     * Altera Categoria
     */
    public void setCategoria(char newCategoria)
    {
        if (newCategoria == 'A' || newCategoria == 'B' || newCategoria == 'C')
        {
            this.categoria = newCategoria;
        } else {
            this.categoria = 'A';
        }
    }

    /**
     * Adiciona Pontos
     */
    public void addPontos(int pontos)
    {
        this.pontos += pontos;
        if (this.pontos >30)
        {
            this.status = false;
        }
    }

    /**
     * Verifica Pontos
     */
    public int getPontos()
    {
        return this.pontos;
    }
}
