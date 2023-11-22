package payloads.Board;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateABoard {

    @JsonProperty
    String name;
    @JsonProperty
    String desc;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
