package br.com.rody.jaxwstestserver.service;

import javax.xml.ws.Endpoint;

public class Export {

	public static void main(String[] args) {
		
		//gerador do wsdl
		Endpoint.publish("http://localhost:8080/qualquernome/empregadoservice", new EmpregadoServiceImpl());
	}

}
