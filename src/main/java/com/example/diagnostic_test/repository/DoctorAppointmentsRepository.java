package com.example.diagnostic_test.repository;

import com.example.diagnostic_test.entity.DoctorAppointments;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface DoctorAppointmentsRepository extends JpaRepository<DoctorAppointments,Long> {


    @Query(value = "SELECT * FROM doctor_appointments WHERE doctor_id = :doc_id ", nativeQuery = true)
    List<DoctorAppointments> findAllPatientByDoctorId(@Param("doc_id") Long doctorId);

    @Query("SELECT d FROM DoctorAppointments d " +
            "WHERE (:patientName IS NULL OR LOWER(d.patientName) LIKE LOWER(CONCAT('%', :patientName, '%'))) " +
            "AND (:contactNumber IS NULL OR d.contactNumber LIKE CONCAT('%', :contactNumber, '%')) " +
            "AND (:email IS NULL OR LOWER(d.email) LIKE LOWER(CONCAT('%', :email, '%'))) " +
            "AND (:appointmentDate IS NULL OR d.appointmentDate = :appointmentDate)")
    Page<DoctorAppointments> searchAppointments(
            @Param("patientName") String patientName,
            @Param("contactNumber") String contactNumber,
            @Param("email") String email,
            @Param("appointmentDate") LocalDate appointmentDate,
            Pageable pageable
    );
}
