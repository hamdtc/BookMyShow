package com.example.BookMyShow.Dto.ResponseDto;

import lombok.*;

@Data
@Builder
public class UserRespDto {

        int id;

        @NonNull
        private String name;

        @NonNull
        private String mobile;
}
