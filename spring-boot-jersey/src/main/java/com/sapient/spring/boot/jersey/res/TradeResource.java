package com.sapient.spring.boot.jersey.res;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sapient.spring.boot.jersey.dto.Trade;

@Path("trade")
@Component
@Scope("prototype")
public class TradeResource {
	private static final Logger logger=Logger.getLogger(TradeResource.class);
	
	@Context
	private UriInfo uriInfo;
	
	public TradeResource() {

		logger.info("Init");
	}
	

	@GET
	@Path("ping")
	public String ping(){
		logger.info(uriInfo.getAbsolutePath());
		return "OK";
	}
	
	@Path("")
	@PUT
	public Trade create(){
		logger.info(uriInfo.getAbsolutePath());
		return new Trade();
	}
}
