package com.zoudys.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/webapi")
public class MyApp extends Application {

	/**
	 * This how we can override method from Application Class
	 * https://docs.oracle.com/javaee/7/api/javax/ws/rs/core/Application.html
	 * to return instance of HashSet, we could create instance of each resource 
	 * and add to the HashSet.
	 */
	/*
	 * public Set<Class<?>> getClasses(){
		return new HashSet<Class<?>>();
	}*/
}
