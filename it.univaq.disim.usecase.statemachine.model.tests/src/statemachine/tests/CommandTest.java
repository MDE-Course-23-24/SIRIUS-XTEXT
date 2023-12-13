/**
 */
package statemachine.tests;

import junit.textui.TestRunner;

import statemachine.Command;
import statemachine.StatemachineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandTest extends AbstractEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommandTest.class);
	}

	/**
	 * Constructs a new Command test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Command getFixture() {
		return (Command)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StatemachineFactory.eINSTANCE.createCommand());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CommandTest
