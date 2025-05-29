package com.example.actuator.services;

import com.example.actuator.models.Note;

import java.util.List;

public interface NoteService {
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    Note createNote(Note note);
    Note updateNote(Long id, Note note);
    void removeNote(Long id);
}
