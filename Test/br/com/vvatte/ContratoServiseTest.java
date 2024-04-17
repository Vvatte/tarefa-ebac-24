package br.com.vvatte;

import br.com.vvatte.dao.ContratoDao;
import br.com.vvatte.dao.ContratoDaoMock;
import br.com.vvatte.dao.IContratoDao;
import br.com.vvatte.service.ContratoService;
import br.com.vvatte.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiseTest {
    @Test
    public void salvarTest() {
        IContratoDao contrato = new ContratoDaoMock();
        IContratoService service = new ContratoService(contrato);
        String retorno = service.salvar();
        Assert.assertEquals("Salvo", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarBancoDeDadosTest() {
        IContratoDao contrato = new ContratoDao();
        IContratoService service = new ContratoService(contrato);
        String retorno = service.salvar();
        Assert.assertEquals("Salvo", retorno);
    }
    // Testando Buscar
    @Test
    public void buscarTest() {
        IContratoDao contrato = new ContratoDaoMock();
        IContratoService service = new ContratoService(contrato);
        String retorno = service.buscar();
        Assert.assertEquals("Sua busca", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarBancoDeDadosTest() {
        IContratoDao contrato = new ContratoDao();
        IContratoService service = new ContratoService(contrato);
        String retorno = service.buscar();
        Assert.assertEquals("Sua busca", retorno);
    }

    //Testando atualizar
    @Test
    public void atualizarTest() {
        IContratoDao contrato = new ContratoDaoMock();
        IContratoService service = new ContratoService(contrato);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualizado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarBancoDeDadosTest() {
        IContratoDao contrato = new ContratoDao();
        IContratoService service = new ContratoService(contrato);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualizado", retorno);
    }

    //Testando excluir
    @Test
    public void excluirTest() {
        IContratoDao contrato = new ContratoDaoMock();
        IContratoService service = new ContratoService(contrato);
        String retorno = service.excluir();
        Assert.assertEquals("Excluido com sucessesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirBancoDeDadosTest() {
        IContratoDao contrato = new ContratoDao();
        IContratoService service = new ContratoService(contrato);
        String retorno = service.excluir();
        Assert.assertEquals("Excluido com sucessesso", retorno);
    }
}