package ServicioRest.demo.dao;

import ServicioRest.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao1 extends JpaRepository <Usuario, Long> {
}
