package com.example.kakao._temp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MyBody {
     @JsonProperty("merchant_uid")
    private String merchantUid;
    private int amount;
    @JsonProperty("imp_key")
    private String impKey;

}
