package com.works.services;

import com.works.entities.Note;
import com.works.entities.dto.NoteSaveDto;
import com.works.repositories.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository noteRepository;
    private final ModelMapper modelMapper;

    public Note save(NoteSaveDto noteSaveDto) {
        Note note = modelMapper.map(noteSaveDto, Note.class);
        return noteRepository.save(note);
    }

    public List<Note> findAll() {
        return noteRepository.findAll();
    }
}
