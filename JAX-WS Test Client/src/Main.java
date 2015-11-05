import br.com.rody.jaxwstestserver.service.Empregado;
import br.com.rody.jaxwstestserver.service.EmpregadoServiceImpl;
import br.com.rody.jaxwstestserver.service.EmpregadoServiceImplService;


public class Main {

	public static void main(String[] args) {
		
		//chamando o web service
		//URL: http://localhost:8080/qualquernome/empregadoservice?wsdl
		
		EmpregadoServiceImpl webService = new EmpregadoServiceImplService().getEmpregadoServiceImplPort();
		Empregado empregado = webService.getEmpregadoById("1");
		
		System.out.println(empregado.getNome());
	}

}
