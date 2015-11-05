Necessario rodar o wsimport.

Pode ser configurado no eclipse em Run... External Tools Confiuration...

aba main
location - local do wsimport.exe dentro da JDK (C:\Program Files (x86)\Java\jdk1.7.0_75\bin\wsimport.exe)
working directory - projeto no workspace (neste caso JAX-WS Test Client)
arguments - (-keep -verbose -s ./src/ -d ./bin/ http://localhost:8080/qualquernome/empregadoservice?wsdl)
	onde -s informa onde sera guardado o fonte dos stubs e -d o destino (.class) e por ultimo a url do wsdl

E EXECUTAR!!!!!!