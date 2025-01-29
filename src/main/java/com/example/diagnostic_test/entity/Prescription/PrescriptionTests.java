package com.example.diagnostic_test.entity.Prescription;

import com.example.diagnostic_test.entity.DiagonesticTest;
import com.example.diagnostic_test.entity.Medicine.Medicine;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class PrescriptionTests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JsonIgnore
    private Prescription prescription;
    @ManyToOne
    @JsonIgnore
    private DiagonesticTest diagonesticTest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public DiagonesticTest getDiagonesticTest() {
        return diagonesticTest;
    }

    public void setDiagonesticTest(DiagonesticTest diagonesticTest) {
        this.diagonesticTest = diagonesticTest;
    }
}
