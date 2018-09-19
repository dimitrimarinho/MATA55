
/**
 * Escreva a descrição da classe Condutor aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Condutor
{
    private String nome, id;
    private CNH cnh;

    /**
     * Construtor para objetos da classe Condutor
     */
    public Condutor(String nome, int id, CNH cnh)
    {
        this.nome = nome;
        this.id = Integer.toString(id);
        this.cnh = cnh;
    }

    /**
     * Construtor para objetos da classe Condutor
     */
    public Condutor(String nome, int id, int numero, boolean status, char categoria)
    {
        this.nome = nome;
        this.id = Integer.toString(id);
        this.cnh = new CNH(numero, status, categoria);
    }
    
    public void setCategoria(char c) {
        this.cnh.setCategoria(c);
    }
    
    public void addPontos(int pontos) {
        this.cnh.addPontos(pontos);
    }
    
    public int getPontos() {
        return this.cnh.getPontos();
    }
}
