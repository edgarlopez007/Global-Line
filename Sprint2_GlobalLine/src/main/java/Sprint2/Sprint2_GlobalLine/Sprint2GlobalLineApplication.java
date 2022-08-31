package Sprint2.Sprint2_GlobalLine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sprint2GlobalLineApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sprint2GlobalLineApplication.class, args);


		Empleado emple1 = new Empleado( "Carlos", "carlosh@gmail.com", "Global Line", "Tecnico", 32456789 );
		Empresa empre1 = new Empresa ("Global Line", "Cra 5 c bis 32 sur", "3456234", 345677 );
		Transacciones tran1 = new Transacciones ("500.000", 2.3442321, "Credito", "Carlos");
	}

}
