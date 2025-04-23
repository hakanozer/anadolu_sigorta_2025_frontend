package com.works.restcontrollers;

import com.works.entities.Note;
import com.works.entities.Product;
import com.works.entities.dto.NoteSaveDto;
import com.works.services.NoteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("note")
public class NoteRestController {

    private final NoteService noteService;

    @PostMapping("save")
    public Note save(@Valid @RequestBody NoteSaveDto noteSaveDto) {
        return noteService.save(noteSaveDto);
    }

    @GetMapping("list")
    public List<Note> list() {
        return noteService.findAll();
    }

}
