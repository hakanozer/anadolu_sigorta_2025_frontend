package com.works.entities.dto;

import com.works.customValid.NoteCategory;
import com.works.entities.Note;
import jakarta.validation.constraints.*;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Note}
 */
@Value
public class NoteSaveDto implements Serializable {
    @NotNull
    @Size(min = 2, max = 150)
    @NotEmpty
    String title;

    @NotNull
    @Min(1)
    @Max(10)
    Integer days;

    @NoteCategory
    @NotNull
    @NotEmpty
    String category;
}