package com.shoppinhapi.common;

import entities.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import repositories.RoleRepository;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class RoleRepositoryTest {


    @Autowired
    public RoleRepository roleRepository;


    @Test
    public void CanCreateNewRole() {
        Role role = new Role();
        role.setName("Admin");
        role.setDescription("just for test");

        var givenRole = roleRepository.save(role);

        assertThat(givenRole.getId()).isGreaterThan(0);
        assertThat(givenRole.getName()).isNotNull();
        assertThat(givenRole.getName()).isEqualTo(role.getName());
    }
}
