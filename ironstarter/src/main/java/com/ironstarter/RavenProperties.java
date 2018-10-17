package com.ironstarter;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("raven")
public class RavenProperties {
    public List<String> getWhere() {
        return where;
    }

    public void setWhere(List<String> where) {
        this.where = where;
    }

    List<String> where;
    public RavenProperties(){
//        lstDists.stream().forEach(System.out::println);

    }
}
