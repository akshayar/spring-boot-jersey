package com.sapient.spring.boot.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.internal.scanning.PackageNamesScanner;
import org.springframework.stereotype.Component;

import com.sapient.spring.boot.jersey.res.TradeResource;

@Component
public class JerseyConfiguration extends ResourceConfig{
	
	public JerseyConfiguration() {
		registerFinder(new PackageNamesScanner(new String[]{TradeResource.class.getPackage().getName()},false));
		
	}

}
