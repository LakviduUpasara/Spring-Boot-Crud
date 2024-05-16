package com.Frist.Pr1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@ToString

public class Blog {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private UUID BlockID;
    private UUID AuthorId ;
    private String Title ;
    private String category ;

    private String Content ;

    private Date Creation_Date ;
    private Date Uptade_Date ;
    private String Status ;

    private  String Image ;

}
