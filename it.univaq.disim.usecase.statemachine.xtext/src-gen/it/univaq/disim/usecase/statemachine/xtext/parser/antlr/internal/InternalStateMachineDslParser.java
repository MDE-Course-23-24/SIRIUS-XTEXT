package it.univaq.disim.usecase.statemachine.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.univaq.disim.usecase.statemachine.xtext.services.StateMachineDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'states'", "','", "'}'", "'transtions'", "'State'", "'actions'", "'Transition'", "'source'", "'target'", "'trigger'", "'Command'", "'code'", "':'", "'Event'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStateMachineDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateMachineDsl.g"; }



     	private StateMachineDslGrammarAccess grammarAccess;

        public InternalStateMachineDslParser(TokenStream input, StateMachineDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";
       	}

       	@Override
       	protected StateMachineDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateMachine"
    // InternalStateMachineDsl.g:64:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalStateMachineDsl.g:64:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalStateMachineDsl.g:65:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateMachineDsl.g:71:1: ruleStateMachine returns [EObject current=null] : ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transtions' otherlv_11= '{' ( (lv_transtions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transtions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_states_6_0 = null;

        EObject lv_states_8_0 = null;

        EObject lv_transtions_12_0 = null;

        EObject lv_transtions_14_0 = null;



        	enterRule();

        try {
            // InternalStateMachineDsl.g:77:2: ( ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transtions' otherlv_11= '{' ( (lv_transtions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transtions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalStateMachineDsl.g:78:2: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transtions' otherlv_11= '{' ( (lv_transtions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transtions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalStateMachineDsl.g:78:2: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transtions' otherlv_11= '{' ( (lv_transtions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transtions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalStateMachineDsl.g:79:3: () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transtions' otherlv_11= '{' ( (lv_transtions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transtions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalStateMachineDsl.g:79:3: ()
            // InternalStateMachineDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getStateMachineKeyword_1());
            		
            // InternalStateMachineDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalStateMachineDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalStateMachineDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalStateMachineDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.usecase.statemachine.xtext.StateMachineDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalStateMachineDsl.g:113:3: (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalStateMachineDsl.g:114:4: otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getStatesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalStateMachineDsl.g:122:4: ( (lv_states_6_0= ruleState ) )
                    // InternalStateMachineDsl.g:123:5: (lv_states_6_0= ruleState )
                    {
                    // InternalStateMachineDsl.g:123:5: (lv_states_6_0= ruleState )
                    // InternalStateMachineDsl.g:124:6: lv_states_6_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_states_6_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_6_0,
                    							"it.univaq.disim.usecase.statemachine.xtext.StateMachineDsl.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachineDsl.g:141:4: (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalStateMachineDsl.g:142:5: otherlv_7= ',' ( (lv_states_8_0= ruleState ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalStateMachineDsl.g:146:5: ( (lv_states_8_0= ruleState ) )
                    	    // InternalStateMachineDsl.g:147:6: (lv_states_8_0= ruleState )
                    	    {
                    	    // InternalStateMachineDsl.g:147:6: (lv_states_8_0= ruleState )
                    	    // InternalStateMachineDsl.g:148:7: lv_states_8_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_states_8_0=ruleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"states",
                    	    								lv_states_8_0,
                    	    								"it.univaq.disim.usecase.statemachine.xtext.StateMachineDsl.State");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalStateMachineDsl.g:171:3: (otherlv_10= 'transtions' otherlv_11= '{' ( (lv_transtions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transtions_14_0= ruleTransition ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalStateMachineDsl.g:172:4: otherlv_10= 'transtions' otherlv_11= '{' ( (lv_transtions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transtions_14_0= ruleTransition ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getTranstionsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalStateMachineDsl.g:180:4: ( (lv_transtions_12_0= ruleTransition ) )
                    // InternalStateMachineDsl.g:181:5: (lv_transtions_12_0= ruleTransition )
                    {
                    // InternalStateMachineDsl.g:181:5: (lv_transtions_12_0= ruleTransition )
                    // InternalStateMachineDsl.g:182:6: lv_transtions_12_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateMachineAccess().getTranstionsTransitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_transtions_12_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    						}
                    						add(
                    							current,
                    							"transtions",
                    							lv_transtions_12_0,
                    							"it.univaq.disim.usecase.statemachine.xtext.StateMachineDsl.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachineDsl.g:199:4: (otherlv_13= ',' ( (lv_transtions_14_0= ruleTransition ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalStateMachineDsl.g:200:5: otherlv_13= ',' ( (lv_transtions_14_0= ruleTransition ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getStateMachineAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalStateMachineDsl.g:204:5: ( (lv_transtions_14_0= ruleTransition ) )
                    	    // InternalStateMachineDsl.g:205:6: (lv_transtions_14_0= ruleTransition )
                    	    {
                    	    // InternalStateMachineDsl.g:205:6: (lv_transtions_14_0= ruleTransition )
                    	    // InternalStateMachineDsl.g:206:7: lv_transtions_14_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateMachineAccess().getTranstionsTransitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_transtions_14_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transtions",
                    	    								lv_transtions_14_0,
                    	    								"it.univaq.disim.usecase.statemachine.xtext.StateMachineDsl.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalStateMachineDsl.g:237:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachineDsl.g:237:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachineDsl.g:238:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateMachineDsl.g:244:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleCommand ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actions_6_0 = null;

        EObject lv_actions_8_0 = null;



        	enterRule();

        try {
            // InternalStateMachineDsl.g:250:2: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleCommand ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalStateMachineDsl.g:251:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleCommand ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalStateMachineDsl.g:251:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleCommand ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalStateMachineDsl.g:252:3: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleCommand ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalStateMachineDsl.g:252:3: ()
            // InternalStateMachineDsl.g:253:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalStateMachineDsl.g:263:3: ( (lv_name_2_0= ruleEString ) )
            // InternalStateMachineDsl.g:264:4: (lv_name_2_0= ruleEString )
            {
            // InternalStateMachineDsl.g:264:4: (lv_name_2_0= ruleEString )
            // InternalStateMachineDsl.g:265:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.usecase.statemachine.xtext.StateMachineDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalStateMachineDsl.g:286:3: (otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleCommand ) ) )* otherlv_9= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStateMachineDsl.g:287:4: otherlv_4= 'actions' otherlv_5= '{' ( (lv_actions_6_0= ruleCommand ) ) (otherlv_7= ',' ( (lv_actions_8_0= ruleCommand ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalStateMachineDsl.g:295:4: ( (lv_actions_6_0= ruleCommand ) )
                    // InternalStateMachineDsl.g:296:5: (lv_actions_6_0= ruleCommand )
                    {
                    // InternalStateMachineDsl.g:296:5: (lv_actions_6_0= ruleCommand )
                    // InternalStateMachineDsl.g:297:6: lv_actions_6_0= ruleCommand
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getActionsCommandParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_actions_6_0=ruleCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_6_0,
                    							"it.univaq.disim.usecase.statemachine.xtext.StateMachineDsl.Command");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachineDsl.g:314:4: (otherlv_7= ',' ( (lv_actions_8_0= ruleCommand ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalStateMachineDsl.g:315:5: otherlv_7= ',' ( (lv_actions_8_0= ruleCommand ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalStateMachineDsl.g:319:5: ( (lv_actions_8_0= ruleCommand ) )
                    	    // InternalStateMachineDsl.g:320:6: (lv_actions_8_0= ruleCommand )
                    	    {
                    	    // InternalStateMachineDsl.g:320:6: (lv_actions_8_0= ruleCommand )
                    	    // InternalStateMachineDsl.g:321:7: lv_actions_8_0= ruleCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getActionsCommandParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_actions_8_0=ruleCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_8_0,
                    	    								"it.univaq.disim.usecase.statemachine.xtext.StateMachineDsl.Command");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEString"
    // InternalStateMachineDsl.g:352:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalStateMachineDsl.g:352:47: (iv_ruleEString= ruleEString EOF )
            // InternalStateMachineDsl.g:353:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalStateMachineDsl.g:359:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalStateMachineDsl.g:365:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalStateMachineDsl.g:366:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalStateMachineDsl.g:366:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalStateMachineDsl.g:367:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachineDsl.g:375:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTransition"
    // InternalStateMachineDsl.g:386:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateMachineDsl.g:386:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateMachineDsl.g:387:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStateMachineDsl.g:393:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) otherlv_6= 'trigger' ( (lv_trigger_7_0= ruleEvent ) ) otherlv_8= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_trigger_7_0 = null;



        	enterRule();

        try {
            // InternalStateMachineDsl.g:399:2: ( (otherlv_0= 'Transition' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) otherlv_6= 'trigger' ( (lv_trigger_7_0= ruleEvent ) ) otherlv_8= '}' ) )
            // InternalStateMachineDsl.g:400:2: (otherlv_0= 'Transition' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) otherlv_6= 'trigger' ( (lv_trigger_7_0= ruleEvent ) ) otherlv_8= '}' )
            {
            // InternalStateMachineDsl.g:400:2: (otherlv_0= 'Transition' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) otherlv_6= 'trigger' ( (lv_trigger_7_0= ruleEvent ) ) otherlv_8= '}' )
            // InternalStateMachineDsl.g:401:3: otherlv_0= 'Transition' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= 'target' ( ( ruleEString ) ) otherlv_6= 'trigger' ( (lv_trigger_7_0= ruleEvent ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getSourceKeyword_2());
            		
            // InternalStateMachineDsl.g:413:3: ( ( ruleEString ) )
            // InternalStateMachineDsl.g:414:4: ( ruleEString )
            {
            // InternalStateMachineDsl.g:414:4: ( ruleEString )
            // InternalStateMachineDsl.g:415:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getTargetKeyword_4());
            		
            // InternalStateMachineDsl.g:433:3: ( ( ruleEString ) )
            // InternalStateMachineDsl.g:434:4: ( ruleEString )
            {
            // InternalStateMachineDsl.g:434:4: ( ruleEString )
            // InternalStateMachineDsl.g:435:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_5_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getTriggerKeyword_6());
            		
            // InternalStateMachineDsl.g:453:3: ( (lv_trigger_7_0= ruleEvent ) )
            // InternalStateMachineDsl.g:454:4: (lv_trigger_7_0= ruleEvent )
            {
            // InternalStateMachineDsl.g:454:4: (lv_trigger_7_0= ruleEvent )
            // InternalStateMachineDsl.g:455:5: lv_trigger_7_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getTriggerEventParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_trigger_7_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_7_0,
            						"it.univaq.disim.usecase.statemachine.xtext.StateMachineDsl.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleCommand"
    // InternalStateMachineDsl.g:480:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalStateMachineDsl.g:480:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalStateMachineDsl.g:481:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalStateMachineDsl.g:487:1: ruleCommand returns [EObject current=null] : ( () otherlv_1= 'Command' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_code_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalStateMachineDsl.g:493:2: ( ( () otherlv_1= 'Command' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            // InternalStateMachineDsl.g:494:2: ( () otherlv_1= 'Command' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            {
            // InternalStateMachineDsl.g:494:2: ( () otherlv_1= 'Command' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            // InternalStateMachineDsl.g:495:3: () otherlv_1= 'Command' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= ':' ( (lv_name_5_0= ruleEString ) )
            {
            // InternalStateMachineDsl.g:495:3: ()
            // InternalStateMachineDsl.g:496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandAccess().getCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getCommandKeyword_1());
            		
            // InternalStateMachineDsl.g:506:3: (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStateMachineDsl.g:507:4: otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getCodeKeyword_2_0());
                    			
                    // InternalStateMachineDsl.g:511:4: ( (lv_code_3_0= ruleEString ) )
                    // InternalStateMachineDsl.g:512:5: (lv_code_3_0= ruleEString )
                    {
                    // InternalStateMachineDsl.g:512:5: (lv_code_3_0= ruleEString )
                    // InternalStateMachineDsl.g:513:6: lv_code_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getCodeEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_code_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"code",
                    							lv_code_3_0,
                    							"it.univaq.disim.usecase.statemachine.xtext.StateMachineDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getColonKeyword_3());
            		
            // InternalStateMachineDsl.g:535:3: ( (lv_name_5_0= ruleEString ) )
            // InternalStateMachineDsl.g:536:4: (lv_name_5_0= ruleEString )
            {
            // InternalStateMachineDsl.g:536:4: (lv_name_5_0= ruleEString )
            // InternalStateMachineDsl.g:537:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommandAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"it.univaq.disim.usecase.statemachine.xtext.StateMachineDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleEvent"
    // InternalStateMachineDsl.g:558:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalStateMachineDsl.g:558:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalStateMachineDsl.g:559:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalStateMachineDsl.g:565:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'Event' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_code_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalStateMachineDsl.g:571:2: ( ( () otherlv_1= 'Event' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            // InternalStateMachineDsl.g:572:2: ( () otherlv_1= 'Event' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            {
            // InternalStateMachineDsl.g:572:2: ( () otherlv_1= 'Event' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            // InternalStateMachineDsl.g:573:3: () otherlv_1= 'Event' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= ':' ( (lv_name_5_0= ruleEString ) )
            {
            // InternalStateMachineDsl.g:573:3: ()
            // InternalStateMachineDsl.g:574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
            		
            // InternalStateMachineDsl.g:584:3: (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalStateMachineDsl.g:585:4: otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEventAccess().getCodeKeyword_2_0());
                    			
                    // InternalStateMachineDsl.g:589:4: ( (lv_code_3_0= ruleEString ) )
                    // InternalStateMachineDsl.g:590:5: (lv_code_3_0= ruleEString )
                    {
                    // InternalStateMachineDsl.g:590:5: (lv_code_3_0= ruleEString )
                    // InternalStateMachineDsl.g:591:6: lv_code_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getCodeEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_code_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"code",
                    							lv_code_3_0,
                    							"it.univaq.disim.usecase.statemachine.xtext.StateMachineDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEventAccess().getColonKeyword_3());
            		
            // InternalStateMachineDsl.g:613:3: ( (lv_name_5_0= ruleEString ) )
            // InternalStateMachineDsl.g:614:4: (lv_name_5_0= ruleEString )
            {
            // InternalStateMachineDsl.g:614:4: (lv_name_5_0= ruleEString )
            // InternalStateMachineDsl.g:615:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"it.univaq.disim.usecase.statemachine.xtext.StateMachineDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});

}