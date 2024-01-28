package com.idvalidate.IdValidate.Project.DAO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

    import java.util.Date;
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Builder
    public class NicEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long nicId;
        private String checkedId;
        private String gender;
        private String birthday;
        private String status;
    
    }
