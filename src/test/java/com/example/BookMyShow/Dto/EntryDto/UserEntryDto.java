package com.example.BookMyShow.Dto.EntryDto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntryDto {

    @NonNull
    private String name;

    @NonNull
    private String mobile;
}
