package com.ironbank.service;

import com.ironbank.ProfileConstants;
import com.ironbank.model.ProphetProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by alexeybel on 29.10.18.
 */
@Service
@Profile(ProfileConstants.WINTER_HERE)
@RequiredArgsConstructor
public class WhiteListProphetServiceImpl implements ProphetService {
    private final ProphetProperties prophetProperties;
    @Override
    public boolean willSurvive(String name) {
        return prophetProperties.getLstReturningDepts().contains(name);
    }
}
