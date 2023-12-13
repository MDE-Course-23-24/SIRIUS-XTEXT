/*
 * generated by Xtext 2.32.0
 */
package it.univaq.disim.usecase.statemachine.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import it.univaq.disim.usecase.statemachine.xtext.StateMachineDslRuntimeModule;
import it.univaq.disim.usecase.statemachine.xtext.StateMachineDslStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class StateMachineDslIdeSetup extends StateMachineDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new StateMachineDslRuntimeModule(), new StateMachineDslIdeModule()));
	}
	
}
