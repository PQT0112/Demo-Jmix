package com.company.miniproject.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "STUDENT", indexes = {
        @Index(name = "IDX_STUDENT_UNIVERSITY", columnList = "UNIVERSITY_ID")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_STUDENT_UNQ", columnNames = {"CODE", "CCCD", "PHONE_NUMBER"})
})
@Entity
public class Student {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @JoinColumn(name = "UNIVERSITY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private University university;
    @Composition
    @OneToMany(mappedBy = "student")
    private List<Mark> score;
    @Column(name = "CODE", nullable = false)
    @NotNull
    private String code;
    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;
    @Column(name = "DATE_OF_BIRTH", nullable = false)
    @NotNull
    private LocalDate dateOfBirth;
    @Length(min = 12, max = 12)
    @Column(name = "CCCD")
    private String cccd;
    @Column(name = "ADDRESS")
    private String address;
    @Length(min = 10, max = 10)
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;
    @JoinColumn(name = "LOPHOC_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private LopHoc lophoc;

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public LopHoc getLophoc() {
        return lophoc;
    }

    public void setLophoc(LopHoc lophoc) {
        this.lophoc = lophoc;
    }

    public List<Mark> getScore() {
        return score;
    }

    public void setScore(List<Mark> score) {
        this.score = score;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}