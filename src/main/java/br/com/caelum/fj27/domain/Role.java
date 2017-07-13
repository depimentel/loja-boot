package br.com.caelum.fj27.domain;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by nando on 13/07/17.
 */
@Entity
public class Role implements GrantedAuthority{

    @Id
    private String name;

    public Role(String name) {
        this.name = name;
    }

    /**
     * @deprecated frameworks only
     */
    private Role(){}

    @Override
    public String getAuthority() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                '}';
    }
}
