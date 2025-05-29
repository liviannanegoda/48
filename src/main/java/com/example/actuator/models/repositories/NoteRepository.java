package com.example.actuator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.actuator.models.Note;
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
