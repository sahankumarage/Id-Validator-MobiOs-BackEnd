package com.idvalidate.IdValidate.Project.Controller;

import com.idvalidate.IdValidate.Project.DAO.NicEntity;
import com.idvalidate.IdValidate.Project.Service.NicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/nic")
public class NicController {

    @Autowired
    private  NicService service;



    @PostMapping("/validate")
    public void validate(@RequestBody NicEntity nicEntity) {
        service.validate(nicEntity);
    }

    @GetMapping("/nics")
    public List<NicEntity> getAllNic() {
        return service.getNic();
    }
}
