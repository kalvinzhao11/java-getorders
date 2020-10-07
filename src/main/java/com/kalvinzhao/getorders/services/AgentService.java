package com.kalvinzhao.getorders.services;

import com.kalvinzhao.getorders.models.Agent;

public interface AgentService {
    Agent save(Agent agent);

    Agent findAgentById(long id);
}
