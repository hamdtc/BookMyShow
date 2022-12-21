package com.example.BookMyShow.Dto.EntryDto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class TheaterEntryDto {
    @NonNull
    private String name;
    @NonNull
    private String city;

    private String Address;
}
