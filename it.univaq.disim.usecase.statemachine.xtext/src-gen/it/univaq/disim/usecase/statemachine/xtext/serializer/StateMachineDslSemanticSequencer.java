/*
 * generated by Xtext 2.32.0
 */
package it.univaq.disim.usecase.statemachine.xtext.serializer;

import com.google.inject.Inject;
import it.univaq.disim.usecase.statemachine.xtext.services.StateMachineDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import statemachine.Command;
import statemachine.Event;
import statemachine.State;
import statemachine.StateMachine;
import statemachine.StatemachinePackage;
import statemachine.Transition;

@SuppressWarnings("all")
public class StateMachineDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StateMachineDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == StatemachinePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StatemachinePackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case StatemachinePackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case StatemachinePackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case StatemachinePackage.STATE_MACHINE:
				sequence_StateMachine(context, (StateMachine) semanticObject); 
				return; 
			case StatemachinePackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns Command
	 *
	 * Constraint:
	 *     (code=EString? name=EString)
	 * </pre>
	 */
	protected void sequence_Command(ISerializationContext context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (code=EString? name=EString)
	 * </pre>
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StateMachine returns StateMachine
	 *
	 * Constraint:
	 *     (name=EString (states+=State states+=State*)? (transtions+=Transition transtions+=Transition*)?)
	 * </pre>
	 */
	protected void sequence_StateMachine(ISerializationContext context, StateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=EString (actions+=Command actions+=Command*)?)
	 * </pre>
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (source=[State|EString] target=[State|EString] trigger=Event)
	 * </pre>
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.TRANSITION__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.TRANSITION__SOURCE));
			if (transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.TRANSITION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.TRANSITION__TARGET));
			if (transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.TRANSITION__TRIGGER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.TRANSITION__TRIGGER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_3_0_1(), semanticObject.eGet(StatemachinePackage.Literals.TRANSITION__SOURCE, false));
		feeder.accept(grammarAccess.getTransitionAccess().getTargetStateEStringParserRuleCall_5_0_1(), semanticObject.eGet(StatemachinePackage.Literals.TRANSITION__TARGET, false));
		feeder.accept(grammarAccess.getTransitionAccess().getTriggerEventParserRuleCall_7_0(), semanticObject.getTrigger());
		feeder.finish();
	}
	
	
}