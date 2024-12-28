package com.company.miniproject.entity;

import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "TEACHER", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_TEACHER_UNQ_DUP", columnNames = {"PHONE_NUMBER", "UNIVERSITY_ID"})
})
@Entity
public class Teacher {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @Composition
    @OneToMany(mappedBy = "teacher")
    private List<LopHoc> lophoc;
    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;
    @Column(name = "YEAR_", nullable = false)
    @NotNull
    private String year;
    @Column(name = "ADDRESS")
    private String address;
    @Length(min = 10, max = 10)
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @JoinColumn(name = "UNIVERSITY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private University university;
    @Column(name = "PICTURE", length = 1024)
    private FileRef picture;
    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public FileRef getPicture() {
        return picture;
    }

    public void setPicture(FileRef picture) {
        this.picture = picture;
    }

    public List<LopHoc> getLophoc() {
        return lophoc;
    }

    public void setLophoc(List<LopHoc> lophoc) {
        this.lophoc = lophoc;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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