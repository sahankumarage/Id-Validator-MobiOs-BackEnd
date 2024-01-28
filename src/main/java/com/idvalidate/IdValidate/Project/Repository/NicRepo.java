package com.idvalidate.IdValidate.Project.Repository;

import com.idvalidate.IdValidate.Project.DAO.NicEntity;
import com.idvalidate.IdValidate.Project.DAO.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface NicRepo extends CrudRepository<NicEntity, Long> {

}
