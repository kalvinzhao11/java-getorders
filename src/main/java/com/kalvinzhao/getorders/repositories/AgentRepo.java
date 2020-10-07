package com.kalvinzhao.getorders.repositories;

import com.kalvinzhao.getorders.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepo extends CrudRepository<Agent, Long> {
}
