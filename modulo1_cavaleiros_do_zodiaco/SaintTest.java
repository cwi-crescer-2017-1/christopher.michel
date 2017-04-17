import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SaintTest {
    @Test
    public void vestirArmaduraDeixaArmaduraVestida() throws Exception {
        // AAA
        // 1. Arrange - Montagem dos dados de teste
        Armadura capricornio = new Armadura("Capricórnio",Categoria.OURO);
        Saint hyoga = new Saint("Hyoga", capricornio);
        // 2. Act - Invocar a ação a ser testada
        hyoga.vestirArmadura();
        // 3. Assert - Verificação dos resultados do teste
        boolean resultado = hyoga.getArmaduraVestida();
       assertEquals(true, resultado);
    }
    
    @Test
    public void danoEstaFuncionando10() throws Exception {
        //1
        Saint mu = new Saint("Mu", new Armadura("Aries", Categoria.PRATA));
        //2
        mu.perderVida(10.0);
        //3
        assertEquals(90.0, mu.getVida(), 0.01);
    }
    
    @Test
    public void danoEstaFuncionando100() throws Exception {
        //1
        Saint mu = new Saint("Mu", new Armadura("Aries", Categoria.PRATA));
        //2
        mu.perderVida(100.0);
        //3
        assertEquals(0, mu.getVida(), 0.01);
    }
    
    @Test
    public void danoEstaFuncionando1000() throws Exception {
        //1
        Saint mu = new Saint("Mu", new Armadura("Aries", Categoria.PRATA));
        //2
        mu.perderVida(-1000.0);
        //3
        assertEquals(1100, mu.getVida(), 0.01);
    }
    
    @Test
    public void aoCriarSaintVidaIniciaEm100() throws Exception {
        //1
        Saint jabu = new Saint("Jabu", new Armadura("Unicórnio", Categoria.BRONZE));
        //3
        assertEquals(100.0, jabu.getVida(), 0.01);
    }

    @Test
    public void naoVestirArmaduraDeixaArmaduraNaoVestida() throws Exception {
        //1
        Saint saori = new Saint("Saori", new Armadura("Cisne", Categoria.PRATA));
        //3
        assertEquals(false, saori.getArmaduraVestida());
    }
    
    @Test
    public void aoCriarSaintGeneroENaoInformado() throws Exception {
        //1
        Saint shaka = new Saint("Shaka", new Armadura("Virgem", Categoria.BRONZE));
        //3
        assertEquals(Genero.NAOINFORMADO, shaka.getGenero());
    }
    
    @Test
    public void consigoTrocarDeGenero() throws Exception {
        //1
        Saint mu = new Saint("Mu", new Armadura("Áries", Categoria.BRONZE));
        mu.setGenero(Genero.MASCULINO);
        assertEquals(Genero.MASCULINO, mu.getGenero());
    }
    
    @Test
    public void aoCriarSaintStatusDeVidaEVivo() throws Exception {
        //1
        Saint ikki = new Saint("Ikki", new Armadura("Fênix", Categoria.BRONZE));
        //3
        assertEquals(Status.VIVO, ikki.getStatus());
    }
    
    @Test
    public void confirmarPesoDaArmadura() throws Exception {
        //1
        Saint jabu = new Saint("Jabu", new Armadura("Unicórnio", Categoria.BRONZE));
        //3
        assertEquals(jabu.getCategoriaArmadura(), 1);
    }
    
    /*@Test
    public void criarSaintNasceCom5SentidosDespertados() {
        Saint seiya = new Saint("Seiya", new Armadura("Peixes", Categoria.OURO));
        assertEquals(5, seiya.getQtdSentidosDespertados());
    }*/
    
    @Test
    public void saintOuroTem7Sentidos() throws Exception {
        Saint seiya = new Saint("Seiya", new Armadura("Peixes", Categoria.OURO));
        assertEquals(7, seiya.getQtdSentidosDespertados());
    }
    
    @Test
    public void saintPrataTem6Sentidos() throws Exception {
        Saint seiya = new Saint("Seiya", new Armadura("Peixes", Categoria.PRATA));
        assertEquals(6, seiya.getQtdSentidosDespertados());
    }
    
    @Test
    public void saintBronzeTem5Sentidos() throws Exception {
        Saint seiya = new Saint("Seiya", new Armadura("Peixes", Categoria.BRONZE));
        assertEquals(5, seiya.getQtdSentidosDespertados());
    }
}

