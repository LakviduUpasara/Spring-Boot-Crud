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
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID CommentId;
    private  UUID Category_Id ;
    private  String Content ;
    private String status ;
    private Date Create_Date ;
    private  Date Update_Date ;
    private  UUID User_Id ;
    private  UUID Block_Id;







}
