package ru.ruslan.springapp.Object;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Film {
    private Data data;
    private ExternalId externalId;

    public  Film(){}

    public void setData(Data data){
        System.out.println(data.getNameEn());

        this.data = data;
    }
    public void setExternalId(ExternalId externalId){
        System.out.println(externalId.getImdbId());
        this.externalId = externalId;
    }
    public Data getData(){
        return data;
    }

    public ExternalId getExternalId() {
        return externalId;
    }
}
