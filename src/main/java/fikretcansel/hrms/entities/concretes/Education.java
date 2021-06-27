package fikretcansel.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","education"})
@Table(name = "educations")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @NotNull
    @NotBlank
    @Column(name="schoolName",nullable = false)
    private String schoolName;
    @NotNull
    @NotBlank
    @Column(name="programName",nullable = false)
    private String programName;
    @NotNull
    @NotBlank
    @Column(name="startDate",nullable = false)
    private Date startDate;
    //If jobSeeker not graduation,it can add empty
    @Column(name="graduationDate")
    private Date graduationDate;

    @JsonIgnore
    @ManyToOne(targetEntity = Cv.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "cvId")
    private Cv cv;



}

