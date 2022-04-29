package com.core.configuration;

import com.core.bean.CricketCoach;
import com.core.bean.ICoach;
import com.core.components.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class which define the beans
 *
 * @author Srinath.Rayabarapu
 */
@Configuration
public class SportConfig {

	@Bean
	public ICoach swimCoach() {
		return new SwimCoach();
	}

	@Bean
	public ICoach cricketCoach() {
		return new CricketCoach();
	}

	@Bean
	public IVehicle getVehicle() {
		return new Bus();
	}

}