package com.idvalidate.IdValidate.Project.Service;

import com.idvalidate.IdValidate.Project.DAO.NicEntity;
import com.idvalidate.IdValidate.Project.Repository.NicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NicService {

    @Autowired
    NicRepo repository;

    public List<NicEntity> getNic() {
        return (List<NicEntity>) repository.findAll();
    }

    public void validate(NicEntity nicEntity) {
        NicEntity nic = NicEntity.builder()
                .nicId(nicEntity.getNicId())
                .checkedId(nicEntity.getCheckedId())
                .gender(nicEntity.getGender())
                .birthday(nicEntity.getBirthday())
                .status(nicEntity.getStatus())
                .build();

        repository.save(nic);
    }
}
