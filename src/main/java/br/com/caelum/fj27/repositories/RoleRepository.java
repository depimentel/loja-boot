package br.com.caelum.fj27.repositories;

import br.com.caelum.fj27.domain.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nando on 13/07/17.
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, String>{

}
