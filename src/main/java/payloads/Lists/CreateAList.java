package payloads.Lists;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAList {
    @JsonProperty
    String name;
    @JsonProperty
    String idBoard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }
}
