package br.com.vvatte.service;

import br.com.vvatte.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao contrato) {
        this.contratoDao = contrato;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Salvo";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Sua busca";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizado";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Excluido com sucessesso";
    }
}
