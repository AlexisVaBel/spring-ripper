package com.ironstarter;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

import java.util.List;

@Data
@ConfigurationProperties("raven")
public class RavenProperties {
    boolean turnOn;
    List<String> whereFly;

    public List<String> getwhereFly() {
        return whereFly;
    }
}
