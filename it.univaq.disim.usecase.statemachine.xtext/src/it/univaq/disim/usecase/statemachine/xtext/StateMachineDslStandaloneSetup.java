/*
 * generated by Xtext 2.32.0
 */
package it.univaq.disim.usecase.statemachine.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class StateMachineDslStandaloneSetup extends StateMachineDslStandaloneSetupGenerated {

	public static void doSetup() {
		new StateMachineDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
