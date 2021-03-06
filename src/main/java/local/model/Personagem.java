package local.model;
/*
import local.exception.NomePersonagemException;
import local.exception.PersonagemException;
import local.exception.VidaException;
import local.template.PersonagemDAO;
*/
public abstract class Personagem {

    protected String nome;
    protected int forca;
    protected int habilidadeMental;
    protected int poderDeAtaque;
    protected int esquiva;
    protected int resistencia;
    protected int vidaAtual;
    protected int vidaMaxima;

    public abstract void atacar(Personagem oponente);
    public abstract void contraAtacar(Personagem oponente);
    public abstract void aprimorarHabilidadePrincipal();
    public abstract void regenerarVida();


}
