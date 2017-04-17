public class Saint {
    public String nome;
    public Armadura armadura;
    private boolean armaduraVestida;
    private Genero genero = Genero.NAOINFORMADO;
    private Status status = Status.VIVO;
    private double vida = 100.0;
    
    public Saint(String nome, Armadura armadura) {
        this.nome = nome;
        this.armadura = armadura;
        this.genero = genero;
        this.status = status;
    }

    public void vestirArmadura() {
        this.armaduraVestida = true;
    }
    
    public void perderVida (double vidaPerdida) {
        this.vida = this.vida - vidaPerdida;
    }
    // camelCase
    public boolean getArmaduraVestida() {
        return this.armaduraVestida;
    }
    
    public Genero getGenero() {
        return this.genero;
    }
    
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    public Status getStatus() {
        return this.status;
    }
    
    public double getVida(){
        return this.vida;
    }
    
    public int getCategoriaArmadura(){
        return this.armadura.categoria.getValor();
    }
}