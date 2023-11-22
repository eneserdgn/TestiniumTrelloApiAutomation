package payloads.Card;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateACard {
    @JsonProperty
    String name;
    @JsonProperty
    String desc;
    @JsonProperty
    String idList;

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

    public String getIdList() {
        return idList;
    }

    public void setIdList(String idList) {
        this.idList = idList;
    }


}
