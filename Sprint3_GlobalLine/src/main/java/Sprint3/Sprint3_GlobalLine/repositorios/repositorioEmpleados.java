package Sprint2.Sprint2_GlobalLine.repositorios;

import Sprint2.Sprint2_GlobalLine.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioEmpleados extends JpaRepository<Empleado, Long> {
}
