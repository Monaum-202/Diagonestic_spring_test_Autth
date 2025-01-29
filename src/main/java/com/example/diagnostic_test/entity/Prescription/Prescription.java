package com.example.diagnostic_test.entity.Prescription;


import com.example.diagnostic_test.entity.DiagonesticTest;
import com.example.diagnostic_test.entity.Doctors;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctorId", nullable = false)
    @JsonIgnore
    private Doctors doctors;
    private String patientName;
    private LocalDateTime createdAt;
    @OneToMany(mappedBy = "prescription", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<PrescriptionMedicine> medicines;

    @OneToMany(mappedBy = "prescription", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<PrescriptionTests> diagonesticTests;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<PrescriptionMedicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<PrescriptionMedicine> medicines) {
        this.medicines = medicines;
    }

    public List<PrescriptionTests> getDiagonesticTests() {
        return diagonesticTests;
    }

    public void setDiagonesticTests(List<PrescriptionTests> diagonesticTests) {
        this.diagonesticTests = diagonesticTests;
    }
}
