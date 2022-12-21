package com.example.BookMyShow.Dto.EntryDto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class MovieEntryDto {
    String name;

    @NotNull
    LocalDate releaseDate;
}
