package com.backend.project.repositories;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.project.entities.RolesEntity;
import com.backend.project.entities.UserEntity;

public interface RolesRepository extends JpaRepository<RolesEntity, Long>{

	public Optional<RolesEntity> findByName(String name);
}
