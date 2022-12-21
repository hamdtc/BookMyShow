package com.example.BookMyShow.Dto.ResponseDto;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieRespDto {

    private int id;

    @NonNull
    private String name;
    @NonNull
    private LocalDate releaseDate;


}
