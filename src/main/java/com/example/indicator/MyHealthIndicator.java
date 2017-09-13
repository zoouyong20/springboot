package com.example.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		System.out.println("this is mysql health indicator");
		Builder builder = new Builder();
		builder.withDetail("mybuilder", "test");
		builder.status(Status.UP);
		Health health = builder.build();
        return health;
	}

}
