package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Reportingmanager;

@Repository
public interface ReportingManagerDao extends JpaRepository<Reportingmanager, Integer> {

}
