package org.thingsboard.tools.service.device;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.thingsboard.server.common.data.rule.RuleChain;

@Slf4j
@Service
public class RuleChainManager {

    @Value("${tests.rest.url}")
    private String restUrl;

    @Value("${tests.rest.username}")
    private String username;

    @Value("${tests.rest.password}")
    private String password;

    public void init() {
        RuleChain rootRuleChain;
    }
}