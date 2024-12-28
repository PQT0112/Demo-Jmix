package com.company.miniproject.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "LOP_HOC", indexes = {
        @Index(name = "IDX_LOP_HOC_TEACHER", columnList = "TEACHER_ID")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_LOP_HOC_UNIVERSITY", columnNames = {"NAME", "UNIVERSITY_ID", "CODE"}),

})
@Entity
public class LopHoc {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @JoinColumn(name = "UNIVERSITY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private University university;
    @Composition
    @OneToMany(mappedBy = "lophoc")
    private List<Student> student;
    @Column(name = "CODE", nullable = false)
    @NotNull
    private String code;
    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;
    @JoinColumn(name = "TEACHER_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Teacher teacher;
    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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