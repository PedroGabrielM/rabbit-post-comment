package br.com.project.rabbit.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String desc;
    @OneToMany(mappedBy = "post")
    @JsonIgnoreProperties("post")
    private List< Comment > commentList;
}