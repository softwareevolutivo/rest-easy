package ec.com.softwareevolutivo.demos.service;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class SEApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public SEApplication() {
		singletons.add(new PersonaService());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return empty;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
