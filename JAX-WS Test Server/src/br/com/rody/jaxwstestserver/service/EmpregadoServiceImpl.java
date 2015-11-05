package br.com.rody.jaxwstestserver.service;

import javax.jws.WebService;

import br.com.rody.jaxwstestserver.domain.Empregado;

@WebService
public class EmpregadoServiceImpl implements EmpregadoService {

	@Override
	public Empregado getEmpregadoById(String id) {
		
		return new Empregado("1", "Rodney Pereira");
	}

}
