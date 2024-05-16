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
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID UserId;
    private String UserName ;
    private Date saveDate ;
    private  Date UpdateDate ;
    private  String Content ;
    private  int contact ;
    private  String Email;
    private  String Gender ;
    private  String Addresss ;

}
