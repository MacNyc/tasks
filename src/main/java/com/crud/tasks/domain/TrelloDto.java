package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloDto {

    @JsonProperty("card")
    private Integer card;

    @JsonProperty("board")
    private Integer board;
}
