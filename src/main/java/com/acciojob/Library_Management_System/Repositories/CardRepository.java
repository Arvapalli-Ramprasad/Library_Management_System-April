package com.acciojob.Library_Management_System.Repositories;

import com.acciojob.Library_Management_System.Models.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CardRepository extends JpaRepository<LibraryCard,Integer> {

}
