package com.example.diagnostic_test.dto.prescription;

import com.example.diagnostic_test.dto.DiagonesticTestDTO;
import com.example.diagnostic_test.entity.DiagonesticTest;

import java.util.List;

public class PrescriptionRequestDTO {

    private long id;
    private Long doctors;
    private String patientName;
    private List<MedicineRequestDTO> medicines;

    private List<DiagonesticTestDTO> diagonesticTests;

//    public Long getDoctorId() {
//        return doctors;
//    }
//
//    public void setDoctorId(Long doctorId) {
//        this.doctors = doctorId;
//    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public List<MedicineRequestDTO> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<MedicineRequestDTO> medicines) {
        this.medicines = medicines;
    }

    public Long getDoctors() {
        return doctors;
    }

    public void setDoctors(Long doctors) {
        this.doctors = doctors;
    }

    public List<DiagonesticTestDTO> getDiagonesticTests() {
        return diagonesticTests;
    }

    public void setDiagonesticTests(List<DiagonesticTestDTO> diagonesticTests) {
        this.diagonesticTests = diagonesticTests;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
