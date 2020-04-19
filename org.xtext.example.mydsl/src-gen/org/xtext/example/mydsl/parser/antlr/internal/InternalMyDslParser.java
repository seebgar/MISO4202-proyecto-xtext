package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OBJECT_START", "RULE_EQUALS", "RULE_LIST_START", "RULE_COMA", "RULE_LIST_END", "RULE_OBJECT_END", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_SEMICOLON", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Company'", "'nit'", "'dashboards'", "'DBServers'", "'panels'", "'elements'", "'title'", "'registersPerPage'", "'actions'", "'search'", "'add'", "'columns'", "'Menu'", "'options'", "'icon'", "'urlComponent'", "'legendPosition'", "'labelStringXAxes'", "'colorGridLinesXAxes'", "'labelStringYAxes'", "'colorGridLinesYAxes'", "'displayGridLinesXAxes'", "'displayGridLinesYAxes'", "'data'", "'labels'", "'barPercentage'", "'angleLinesDisplay'", "'PIE'", "'columnTitle'", "'position'", "'filter'", "'edit'", "'delete'", "'source'", "'editable'", "'category'", "'borderColor'", "'backgroundColor'", "'borderDash'", "'fill'", "'('", "')'", "'systemManager'", "'token'", "'password'", "'relatedCollections'", "'documents'", "'-'", "'.'", "'E'", "'e'", "'MONGODB'", "'REDIS'", "'white'", "'blue'", "'red'", "'green'", "'gray'", "'yellow'", "'black'", "'cyan'", "'magenta'", "'silver'", "'maroon'", "'olive'", "'purple'", "'teal'", "'navy'", "'left'", "'right'", "'center'", "'top'", "'bottom'"
    };
    public static final int T__50=50;
    public static final int RULE_OBJECT_START=4;
    public static final int RULE_LIST_END=8;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_EQUALS=5;
    public static final int T__59=59;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int RULE_SEMICOLON=13;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int RULE_LIST_START=6;
    public static final int T__71=71;
    public static final int RULE_COMA=7;
    public static final int T__72=72;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_OBJECT_END=9;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Company";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCompany"
    // InternalMyDsl.g:65:1: entryRuleCompany returns [EObject current=null] : iv_ruleCompany= ruleCompany EOF ;
    public final EObject entryRuleCompany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompany = null;


        try {
            // InternalMyDsl.g:65:48: (iv_ruleCompany= ruleCompany EOF )
            // InternalMyDsl.g:66:2: iv_ruleCompany= ruleCompany EOF
            {
             newCompositeNode(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompany=ruleCompany();

            state._fsp--;

             current =iv_ruleCompany; 
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
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalMyDsl.g:72:1: ruleCompany returns [EObject current=null] : (otherlv_0= 'Company' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) ) )? this_OBJECT_START_4= RULE_OBJECT_START otherlv_5= 'dashboards' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_dashboards_8_0= ruleDashboard ) ) (this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) ) )* this_LIST_END_11= RULE_LIST_END otherlv_12= 'DBServers' this_EQUALS_13= RULE_EQUALS this_LIST_START_14= RULE_LIST_START ( (lv_DBServers_15_0= ruleDBServer ) ) (this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) ) )* this_LIST_END_18= RULE_LIST_END this_OBJECT_END_19= RULE_OBJECT_END ) ;
    public final EObject ruleCompany() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_OBJECT_START_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_LIST_START_7=null;
        Token this_COMA_9=null;
        Token this_LIST_END_11=null;
        Token otherlv_12=null;
        Token this_EQUALS_13=null;
        Token this_LIST_START_14=null;
        Token this_COMA_16=null;
        Token this_LIST_END_18=null;
        Token this_OBJECT_END_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_nit_3_0 = null;

        EObject lv_dashboards_8_0 = null;

        EObject lv_dashboards_10_0 = null;

        EObject lv_DBServers_15_0 = null;

        EObject lv_DBServers_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Company' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) ) )? this_OBJECT_START_4= RULE_OBJECT_START otherlv_5= 'dashboards' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_dashboards_8_0= ruleDashboard ) ) (this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) ) )* this_LIST_END_11= RULE_LIST_END otherlv_12= 'DBServers' this_EQUALS_13= RULE_EQUALS this_LIST_START_14= RULE_LIST_START ( (lv_DBServers_15_0= ruleDBServer ) ) (this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) ) )* this_LIST_END_18= RULE_LIST_END this_OBJECT_END_19= RULE_OBJECT_END ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Company' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) ) )? this_OBJECT_START_4= RULE_OBJECT_START otherlv_5= 'dashboards' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_dashboards_8_0= ruleDashboard ) ) (this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) ) )* this_LIST_END_11= RULE_LIST_END otherlv_12= 'DBServers' this_EQUALS_13= RULE_EQUALS this_LIST_START_14= RULE_LIST_START ( (lv_DBServers_15_0= ruleDBServer ) ) (this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) ) )* this_LIST_END_18= RULE_LIST_END this_OBJECT_END_19= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Company' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) ) )? this_OBJECT_START_4= RULE_OBJECT_START otherlv_5= 'dashboards' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_dashboards_8_0= ruleDashboard ) ) (this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) ) )* this_LIST_END_11= RULE_LIST_END otherlv_12= 'DBServers' this_EQUALS_13= RULE_EQUALS this_LIST_START_14= RULE_LIST_START ( (lv_DBServers_15_0= ruleDBServer ) ) (this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) ) )* this_LIST_END_18= RULE_LIST_END this_OBJECT_END_19= RULE_OBJECT_END )
            // InternalMyDsl.g:80:3: otherlv_0= 'Company' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) ) )? this_OBJECT_START_4= RULE_OBJECT_START otherlv_5= 'dashboards' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_dashboards_8_0= ruleDashboard ) ) (this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) ) )* this_LIST_END_11= RULE_LIST_END otherlv_12= 'DBServers' this_EQUALS_13= RULE_EQUALS this_LIST_START_14= RULE_LIST_START ( (lv_DBServers_15_0= ruleDBServer ) ) (this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) ) )* this_LIST_END_18= RULE_LIST_END this_OBJECT_END_19= RULE_OBJECT_END
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompanyAccess().getCompanyKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompanyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompanyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:103:3: (otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:104:4: otherlv_2= 'nit' ( (lv_nit_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getCompanyAccess().getNitKeyword_2_0());
                    			
                    // InternalMyDsl.g:108:4: ( (lv_nit_3_0= ruleEString ) )
                    // InternalMyDsl.g:109:5: (lv_nit_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:109:5: (lv_nit_3_0= ruleEString )
                    // InternalMyDsl.g:110:6: lv_nit_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompanyAccess().getNitEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_nit_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompanyRule());
                    						}
                    						set(
                    							current,
                    							"nit",
                    							lv_nit_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_OBJECT_START_4=(Token)match(input,RULE_OBJECT_START,FOLLOW_6); 

            			newLeafNode(this_OBJECT_START_4, grammarAccess.getCompanyAccess().getOBJECT_STARTTerminalRuleCall_3());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCompanyAccess().getDashboardsKeyword_4());
            		
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_6, grammarAccess.getCompanyAccess().getEQUALSTerminalRuleCall_5());
            		
            this_LIST_START_7=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_7, grammarAccess.getCompanyAccess().getLIST_STARTTerminalRuleCall_6());
            		
            // InternalMyDsl.g:144:3: ( (lv_dashboards_8_0= ruleDashboard ) )
            // InternalMyDsl.g:145:4: (lv_dashboards_8_0= ruleDashboard )
            {
            // InternalMyDsl.g:145:4: (lv_dashboards_8_0= ruleDashboard )
            // InternalMyDsl.g:146:5: lv_dashboards_8_0= ruleDashboard
            {

            					newCompositeNode(grammarAccess.getCompanyAccess().getDashboardsDashboardParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_dashboards_8_0=ruleDashboard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompanyRule());
            					}
            					add(
            						current,
            						"dashboards",
            						lv_dashboards_8_0,
            						"org.xtext.example.mydsl.MyDsl.Dashboard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:163:3: (this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:164:4: this_COMA_9= RULE_COMA ( (lv_dashboards_10_0= ruleDashboard ) )
            	    {
            	    this_COMA_9=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_9, grammarAccess.getCompanyAccess().getCOMATerminalRuleCall_8_0());
            	    			
            	    // InternalMyDsl.g:168:4: ( (lv_dashboards_10_0= ruleDashboard ) )
            	    // InternalMyDsl.g:169:5: (lv_dashboards_10_0= ruleDashboard )
            	    {
            	    // InternalMyDsl.g:169:5: (lv_dashboards_10_0= ruleDashboard )
            	    // InternalMyDsl.g:170:6: lv_dashboards_10_0= ruleDashboard
            	    {

            	    						newCompositeNode(grammarAccess.getCompanyAccess().getDashboardsDashboardParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_dashboards_10_0=ruleDashboard();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dashboards",
            	    							lv_dashboards_10_0,
            	    							"org.xtext.example.mydsl.MyDsl.Dashboard");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_LIST_END_11=(Token)match(input,RULE_LIST_END,FOLLOW_10); 

            			newLeafNode(this_LIST_END_11, grammarAccess.getCompanyAccess().getLIST_ENDTerminalRuleCall_9());
            		
            otherlv_12=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getCompanyAccess().getDBServersKeyword_10());
            		
            this_EQUALS_13=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_13, grammarAccess.getCompanyAccess().getEQUALSTerminalRuleCall_11());
            		
            this_LIST_START_14=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_14, grammarAccess.getCompanyAccess().getLIST_STARTTerminalRuleCall_12());
            		
            // InternalMyDsl.g:204:3: ( (lv_DBServers_15_0= ruleDBServer ) )
            // InternalMyDsl.g:205:4: (lv_DBServers_15_0= ruleDBServer )
            {
            // InternalMyDsl.g:205:4: (lv_DBServers_15_0= ruleDBServer )
            // InternalMyDsl.g:206:5: lv_DBServers_15_0= ruleDBServer
            {

            					newCompositeNode(grammarAccess.getCompanyAccess().getDBServersDBServerParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_DBServers_15_0=ruleDBServer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompanyRule());
            					}
            					add(
            						current,
            						"DBServers",
            						lv_DBServers_15_0,
            						"org.xtext.example.mydsl.MyDsl.DBServer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:223:3: (this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:224:4: this_COMA_16= RULE_COMA ( (lv_DBServers_17_0= ruleDBServer ) )
            	    {
            	    this_COMA_16=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_16, grammarAccess.getCompanyAccess().getCOMATerminalRuleCall_14_0());
            	    			
            	    // InternalMyDsl.g:228:4: ( (lv_DBServers_17_0= ruleDBServer ) )
            	    // InternalMyDsl.g:229:5: (lv_DBServers_17_0= ruleDBServer )
            	    {
            	    // InternalMyDsl.g:229:5: (lv_DBServers_17_0= ruleDBServer )
            	    // InternalMyDsl.g:230:6: lv_DBServers_17_0= ruleDBServer
            	    {

            	    						newCompositeNode(grammarAccess.getCompanyAccess().getDBServersDBServerParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_DBServers_17_0=ruleDBServer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"DBServers",
            	    							lv_DBServers_17_0,
            	    							"org.xtext.example.mydsl.MyDsl.DBServer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_LIST_END_18=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_18, grammarAccess.getCompanyAccess().getLIST_ENDTerminalRuleCall_15());
            		
            this_OBJECT_END_19=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_19, grammarAccess.getCompanyAccess().getOBJECT_ENDTerminalRuleCall_16());
            		

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
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleDashboard"
    // InternalMyDsl.g:260:1: entryRuleDashboard returns [EObject current=null] : iv_ruleDashboard= ruleDashboard EOF ;
    public final EObject entryRuleDashboard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDashboard = null;


        try {
            // InternalMyDsl.g:260:50: (iv_ruleDashboard= ruleDashboard EOF )
            // InternalMyDsl.g:261:2: iv_ruleDashboard= ruleDashboard EOF
            {
             newCompositeNode(grammarAccess.getDashboardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDashboard=ruleDashboard();

            state._fsp--;

             current =iv_ruleDashboard; 
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
    // $ANTLR end "entryRuleDashboard"


    // $ANTLR start "ruleDashboard"
    // InternalMyDsl.g:267:1: ruleDashboard returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'panels' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_panels_5_0= rulePanel ) ) (this_COMA_6= RULE_COMA ( (lv_panels_7_0= rulePanel ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END ) ;
    public final EObject ruleDashboard() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_LIST_START_4=null;
        Token this_COMA_6=null;
        Token this_LIST_END_8=null;
        Token this_OBJECT_END_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_panels_5_0 = null;

        EObject lv_panels_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:273:2: ( (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'panels' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_panels_5_0= rulePanel ) ) (this_COMA_6= RULE_COMA ( (lv_panels_7_0= rulePanel ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END ) )
            // InternalMyDsl.g:274:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'panels' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_panels_5_0= rulePanel ) ) (this_COMA_6= RULE_COMA ( (lv_panels_7_0= rulePanel ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:274:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'panels' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_panels_5_0= rulePanel ) ) (this_COMA_6= RULE_COMA ( (lv_panels_7_0= rulePanel ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END )
            // InternalMyDsl.g:275:3: this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'panels' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_panels_5_0= rulePanel ) ) (this_COMA_6= RULE_COMA ( (lv_panels_7_0= rulePanel ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getDashboardAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            // InternalMyDsl.g:279:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:280:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:280:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:281:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDashboardAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDashboardRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDashboardAccess().getPanelsKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getDashboardAccess().getEQUALSTerminalRuleCall_3());
            		
            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getDashboardAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalMyDsl.g:310:3: ( (lv_panels_5_0= rulePanel ) )
            // InternalMyDsl.g:311:4: (lv_panels_5_0= rulePanel )
            {
            // InternalMyDsl.g:311:4: (lv_panels_5_0= rulePanel )
            // InternalMyDsl.g:312:5: lv_panels_5_0= rulePanel
            {

            					newCompositeNode(grammarAccess.getDashboardAccess().getPanelsPanelParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_panels_5_0=rulePanel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDashboardRule());
            					}
            					add(
            						current,
            						"panels",
            						lv_panels_5_0,
            						"org.xtext.example.mydsl.MyDsl.Panel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:329:3: (this_COMA_6= RULE_COMA ( (lv_panels_7_0= rulePanel ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:330:4: this_COMA_6= RULE_COMA ( (lv_panels_7_0= rulePanel ) )
            	    {
            	    this_COMA_6=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_6, grammarAccess.getDashboardAccess().getCOMATerminalRuleCall_6_0());
            	    			
            	    // InternalMyDsl.g:334:4: ( (lv_panels_7_0= rulePanel ) )
            	    // InternalMyDsl.g:335:5: (lv_panels_7_0= rulePanel )
            	    {
            	    // InternalMyDsl.g:335:5: (lv_panels_7_0= rulePanel )
            	    // InternalMyDsl.g:336:6: lv_panels_7_0= rulePanel
            	    {

            	    						newCompositeNode(grammarAccess.getDashboardAccess().getPanelsPanelParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_panels_7_0=rulePanel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDashboardRule());
            	    						}
            	    						add(
            	    							current,
            	    							"panels",
            	    							lv_panels_7_0,
            	    							"org.xtext.example.mydsl.MyDsl.Panel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getDashboardAccess().getLIST_ENDTerminalRuleCall_7());
            		
            this_OBJECT_END_9=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_9, grammarAccess.getDashboardAccess().getOBJECT_ENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleDashboard"


    // $ANTLR start "entryRulePanel"
    // InternalMyDsl.g:366:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // InternalMyDsl.g:366:46: (iv_rulePanel= rulePanel EOF )
            // InternalMyDsl.g:367:2: iv_rulePanel= rulePanel EOF
            {
             newCompositeNode(grammarAccess.getPanelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePanel=rulePanel();

            state._fsp--;

             current =iv_rulePanel; 
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
    // $ANTLR end "entryRulePanel"


    // $ANTLR start "rulePanel"
    // InternalMyDsl.g:373:1: rulePanel returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'elements' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_elements_5_0= ruleElement ) ) (this_COMA_6= RULE_COMA ( (lv_elements_7_0= ruleElement ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END ) ;
    public final EObject rulePanel() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_LIST_START_4=null;
        Token this_COMA_6=null;
        Token this_LIST_END_8=null;
        Token this_OBJECT_END_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:379:2: ( (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'elements' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_elements_5_0= ruleElement ) ) (this_COMA_6= RULE_COMA ( (lv_elements_7_0= ruleElement ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END ) )
            // InternalMyDsl.g:380:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'elements' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_elements_5_0= ruleElement ) ) (this_COMA_6= RULE_COMA ( (lv_elements_7_0= ruleElement ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:380:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'elements' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_elements_5_0= ruleElement ) ) (this_COMA_6= RULE_COMA ( (lv_elements_7_0= ruleElement ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END )
            // InternalMyDsl.g:381:3: this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'elements' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_elements_5_0= ruleElement ) ) (this_COMA_6= RULE_COMA ( (lv_elements_7_0= ruleElement ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getPanelAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            // InternalMyDsl.g:385:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:386:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:386:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:387:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPanelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPanelAccess().getElementsKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getPanelAccess().getEQUALSTerminalRuleCall_3());
            		
            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_14); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getPanelAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalMyDsl.g:416:3: ( (lv_elements_5_0= ruleElement ) )
            // InternalMyDsl.g:417:4: (lv_elements_5_0= ruleElement )
            {
            // InternalMyDsl.g:417:4: (lv_elements_5_0= ruleElement )
            // InternalMyDsl.g:418:5: lv_elements_5_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getPanelAccess().getElementsElementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_5_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_5_0,
            						"org.xtext.example.mydsl.MyDsl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:435:3: (this_COMA_6= RULE_COMA ( (lv_elements_7_0= ruleElement ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:436:4: this_COMA_6= RULE_COMA ( (lv_elements_7_0= ruleElement ) )
            	    {
            	    this_COMA_6=(Token)match(input,RULE_COMA,FOLLOW_14); 

            	    				newLeafNode(this_COMA_6, grammarAccess.getPanelAccess().getCOMATerminalRuleCall_6_0());
            	    			
            	    // InternalMyDsl.g:440:4: ( (lv_elements_7_0= ruleElement ) )
            	    // InternalMyDsl.g:441:5: (lv_elements_7_0= ruleElement )
            	    {
            	    // InternalMyDsl.g:441:5: (lv_elements_7_0= ruleElement )
            	    // InternalMyDsl.g:442:6: lv_elements_7_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getPanelAccess().getElementsElementParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_elements_7_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPanelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_7_0,
            	    							"org.xtext.example.mydsl.MyDsl.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getPanelAccess().getLIST_ENDTerminalRuleCall_7());
            		
            this_OBJECT_END_9=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_9, grammarAccess.getPanelAccess().getOBJECT_ENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:472:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDsl.g:472:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:473:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:479:1: ruleElement returns [EObject current=null] : (this_Table_0= ruleTable | this_Menu_1= ruleMenu | this_LineChart_2= ruleLineChart | this_BarChart_3= ruleBarChart | this_RadarChart_4= ruleRadarChart | this_PieChart_5= rulePieChart ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Table_0 = null;

        EObject this_Menu_1 = null;

        EObject this_LineChart_2 = null;

        EObject this_BarChart_3 = null;

        EObject this_RadarChart_4 = null;

        EObject this_PieChart_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:485:2: ( (this_Table_0= ruleTable | this_Menu_1= ruleMenu | this_LineChart_2= ruleLineChart | this_BarChart_3= ruleBarChart | this_RadarChart_4= ruleRadarChart | this_PieChart_5= rulePieChart ) )
            // InternalMyDsl.g:486:2: (this_Table_0= ruleTable | this_Menu_1= ruleMenu | this_LineChart_2= ruleLineChart | this_BarChart_3= ruleBarChart | this_RadarChart_4= ruleRadarChart | this_PieChart_5= rulePieChart )
            {
            // InternalMyDsl.g:486:2: (this_Table_0= ruleTable | this_Menu_1= ruleMenu | this_LineChart_2= ruleLineChart | this_BarChart_3= ruleBarChart | this_RadarChart_4= ruleRadarChart | this_PieChart_5= rulePieChart )
            int alt6=6;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:487:3: this_Table_0= ruleTable
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Table_0=ruleTable();

                    state._fsp--;


                    			current = this_Table_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:496:3: this_Menu_1= ruleMenu
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMenuParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Menu_1=ruleMenu();

                    state._fsp--;


                    			current = this_Menu_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:505:3: this_LineChart_2= ruleLineChart
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLineChartParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineChart_2=ruleLineChart();

                    state._fsp--;


                    			current = this_LineChart_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:514:3: this_BarChart_3= ruleBarChart
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getBarChartParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BarChart_3=ruleBarChart();

                    state._fsp--;


                    			current = this_BarChart_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:523:3: this_RadarChart_4= ruleRadarChart
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRadarChartParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RadarChart_4=ruleRadarChart();

                    state._fsp--;


                    			current = this_RadarChart_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:532:3: this_PieChart_5= rulePieChart
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPieChartParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_PieChart_5=rulePieChart();

                    state._fsp--;


                    			current = this_PieChart_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleTable"
    // InternalMyDsl.g:544:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalMyDsl.g:544:46: (iv_ruleTable= ruleTable EOF )
            // InternalMyDsl.g:545:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMyDsl.g:551:1: ruleTable returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'registersPerPage' ( (lv_registersPerPage_5_0= ruleEInt ) ) )? (otherlv_6= 'actions' ( (lv_actions_7_0= ruleAction ) ) )? ( (lv_search_8_0= 'search' ) )? ( (lv_add_9_0= 'add' ) )? otherlv_10= 'columns' this_EQUALS_11= RULE_EQUALS this_LIST_START_12= RULE_LIST_START ( (lv_columns_13_0= ruleColumn ) ) (this_COMA_14= RULE_COMA ( (lv_columns_15_0= ruleColumn ) ) )* this_LIST_END_16= RULE_LIST_END this_OBJECT_END_17= RULE_OBJECT_END ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_search_8_0=null;
        Token lv_add_9_0=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_LIST_START_12=null;
        Token this_COMA_14=null;
        Token this_LIST_END_16=null;
        Token this_OBJECT_END_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_registersPerPage_5_0 = null;

        EObject lv_actions_7_0 = null;

        EObject lv_columns_13_0 = null;

        EObject lv_columns_15_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:557:2: ( (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'registersPerPage' ( (lv_registersPerPage_5_0= ruleEInt ) ) )? (otherlv_6= 'actions' ( (lv_actions_7_0= ruleAction ) ) )? ( (lv_search_8_0= 'search' ) )? ( (lv_add_9_0= 'add' ) )? otherlv_10= 'columns' this_EQUALS_11= RULE_EQUALS this_LIST_START_12= RULE_LIST_START ( (lv_columns_13_0= ruleColumn ) ) (this_COMA_14= RULE_COMA ( (lv_columns_15_0= ruleColumn ) ) )* this_LIST_END_16= RULE_LIST_END this_OBJECT_END_17= RULE_OBJECT_END ) )
            // InternalMyDsl.g:558:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'registersPerPage' ( (lv_registersPerPage_5_0= ruleEInt ) ) )? (otherlv_6= 'actions' ( (lv_actions_7_0= ruleAction ) ) )? ( (lv_search_8_0= 'search' ) )? ( (lv_add_9_0= 'add' ) )? otherlv_10= 'columns' this_EQUALS_11= RULE_EQUALS this_LIST_START_12= RULE_LIST_START ( (lv_columns_13_0= ruleColumn ) ) (this_COMA_14= RULE_COMA ( (lv_columns_15_0= ruleColumn ) ) )* this_LIST_END_16= RULE_LIST_END this_OBJECT_END_17= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:558:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'registersPerPage' ( (lv_registersPerPage_5_0= ruleEInt ) ) )? (otherlv_6= 'actions' ( (lv_actions_7_0= ruleAction ) ) )? ( (lv_search_8_0= 'search' ) )? ( (lv_add_9_0= 'add' ) )? otherlv_10= 'columns' this_EQUALS_11= RULE_EQUALS this_LIST_START_12= RULE_LIST_START ( (lv_columns_13_0= ruleColumn ) ) (this_COMA_14= RULE_COMA ( (lv_columns_15_0= ruleColumn ) ) )* this_LIST_END_16= RULE_LIST_END this_OBJECT_END_17= RULE_OBJECT_END )
            // InternalMyDsl.g:559:3: this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'registersPerPage' ( (lv_registersPerPage_5_0= ruleEInt ) ) )? (otherlv_6= 'actions' ( (lv_actions_7_0= ruleAction ) ) )? ( (lv_search_8_0= 'search' ) )? ( (lv_add_9_0= 'add' ) )? otherlv_10= 'columns' this_EQUALS_11= RULE_EQUALS this_LIST_START_12= RULE_LIST_START ( (lv_columns_13_0= ruleColumn ) ) (this_COMA_14= RULE_COMA ( (lv_columns_15_0= ruleColumn ) ) )* this_LIST_END_16= RULE_LIST_END this_OBJECT_END_17= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getTableAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            // InternalMyDsl.g:563:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:564:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:564:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:565:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:582:3: (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:583:4: otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTableAccess().getTitleKeyword_2_0());
                    			
                    // InternalMyDsl.g:587:4: ( (lv_title_3_0= ruleEString ) )
                    // InternalMyDsl.g:588:5: (lv_title_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:588:5: (lv_title_3_0= ruleEString )
                    // InternalMyDsl.g:589:6: lv_title_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_title_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:607:3: (otherlv_4= 'registersPerPage' ( (lv_registersPerPage_5_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:608:4: otherlv_4= 'registersPerPage' ( (lv_registersPerPage_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getRegistersPerPageKeyword_3_0());
                    			
                    // InternalMyDsl.g:612:4: ( (lv_registersPerPage_5_0= ruleEInt ) )
                    // InternalMyDsl.g:613:5: (lv_registersPerPage_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:613:5: (lv_registersPerPage_5_0= ruleEInt )
                    // InternalMyDsl.g:614:6: lv_registersPerPage_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getRegistersPerPageEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_registersPerPage_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"registersPerPage",
                    							lv_registersPerPage_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:632:3: (otherlv_6= 'actions' ( (lv_actions_7_0= ruleAction ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:633:4: otherlv_6= 'actions' ( (lv_actions_7_0= ruleAction ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getTableAccess().getActionsKeyword_4_0());
                    			
                    // InternalMyDsl.g:637:4: ( (lv_actions_7_0= ruleAction ) )
                    // InternalMyDsl.g:638:5: (lv_actions_7_0= ruleAction )
                    {
                    // InternalMyDsl.g:638:5: (lv_actions_7_0= ruleAction )
                    // InternalMyDsl.g:639:6: lv_actions_7_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getActionsActionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_actions_7_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"actions",
                    							lv_actions_7_0,
                    							"org.xtext.example.mydsl.MyDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:657:3: ( (lv_search_8_0= 'search' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:658:4: (lv_search_8_0= 'search' )
                    {
                    // InternalMyDsl.g:658:4: (lv_search_8_0= 'search' )
                    // InternalMyDsl.g:659:5: lv_search_8_0= 'search'
                    {
                    lv_search_8_0=(Token)match(input,27,FOLLOW_20); 

                    					newLeafNode(lv_search_8_0, grammarAccess.getTableAccess().getSearchSearchKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableRule());
                    					}
                    					setWithLastConsumed(current, "search", true, "search");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:671:3: ( (lv_add_9_0= 'add' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:672:4: (lv_add_9_0= 'add' )
                    {
                    // InternalMyDsl.g:672:4: (lv_add_9_0= 'add' )
                    // InternalMyDsl.g:673:5: lv_add_9_0= 'add'
                    {
                    lv_add_9_0=(Token)match(input,28,FOLLOW_21); 

                    					newLeafNode(lv_add_9_0, grammarAccess.getTableAccess().getAddAddKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableRule());
                    					}
                    					setWithLastConsumed(current, "add", true, "add");
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getTableAccess().getColumnsKeyword_7());
            		
            this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_11, grammarAccess.getTableAccess().getEQUALSTerminalRuleCall_8());
            		
            this_LIST_START_12=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_12, grammarAccess.getTableAccess().getLIST_STARTTerminalRuleCall_9());
            		
            // InternalMyDsl.g:697:3: ( (lv_columns_13_0= ruleColumn ) )
            // InternalMyDsl.g:698:4: (lv_columns_13_0= ruleColumn )
            {
            // InternalMyDsl.g:698:4: (lv_columns_13_0= ruleColumn )
            // InternalMyDsl.g:699:5: lv_columns_13_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_9);
            lv_columns_13_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_13_0,
            						"org.xtext.example.mydsl.MyDsl.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:716:3: (this_COMA_14= RULE_COMA ( (lv_columns_15_0= ruleColumn ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:717:4: this_COMA_14= RULE_COMA ( (lv_columns_15_0= ruleColumn ) )
            	    {
            	    this_COMA_14=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_14, grammarAccess.getTableAccess().getCOMATerminalRuleCall_11_0());
            	    			
            	    // InternalMyDsl.g:721:4: ( (lv_columns_15_0= ruleColumn ) )
            	    // InternalMyDsl.g:722:5: (lv_columns_15_0= ruleColumn )
            	    {
            	    // InternalMyDsl.g:722:5: (lv_columns_15_0= ruleColumn )
            	    // InternalMyDsl.g:723:6: lv_columns_15_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_columns_15_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_15_0,
            	    							"org.xtext.example.mydsl.MyDsl.Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            this_LIST_END_16=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_16, grammarAccess.getTableAccess().getLIST_ENDTerminalRuleCall_12());
            		
            this_OBJECT_END_17=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_17, grammarAccess.getTableAccess().getOBJECT_ENDTerminalRuleCall_13());
            		

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleMenu"
    // InternalMyDsl.g:753:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // InternalMyDsl.g:753:45: (iv_ruleMenu= ruleMenu EOF )
            // InternalMyDsl.g:754:2: iv_ruleMenu= ruleMenu EOF
            {
             newCompositeNode(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMenu=ruleMenu();

            state._fsp--;

             current =iv_ruleMenu; 
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
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // InternalMyDsl.g:760:1: ruleMenu returns [EObject current=null] : (otherlv_0= 'Menu' ( (lv_name_1_0= ruleEString ) ) this_OBJECT_START_2= RULE_OBJECT_START (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? otherlv_5= 'options' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_options_8_0= ruleOption ) ) (this_COMA_9= RULE_COMA ( (lv_options_10_0= ruleOption ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_OBJECT_START_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_LIST_START_7=null;
        Token this_COMA_9=null;
        Token this_LIST_END_11=null;
        Token this_OBJECT_END_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_title_4_0 = null;

        EObject lv_options_8_0 = null;

        EObject lv_options_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:766:2: ( (otherlv_0= 'Menu' ( (lv_name_1_0= ruleEString ) ) this_OBJECT_START_2= RULE_OBJECT_START (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? otherlv_5= 'options' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_options_8_0= ruleOption ) ) (this_COMA_9= RULE_COMA ( (lv_options_10_0= ruleOption ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END ) )
            // InternalMyDsl.g:767:2: (otherlv_0= 'Menu' ( (lv_name_1_0= ruleEString ) ) this_OBJECT_START_2= RULE_OBJECT_START (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? otherlv_5= 'options' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_options_8_0= ruleOption ) ) (this_COMA_9= RULE_COMA ( (lv_options_10_0= ruleOption ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:767:2: (otherlv_0= 'Menu' ( (lv_name_1_0= ruleEString ) ) this_OBJECT_START_2= RULE_OBJECT_START (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? otherlv_5= 'options' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_options_8_0= ruleOption ) ) (this_COMA_9= RULE_COMA ( (lv_options_10_0= ruleOption ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END )
            // InternalMyDsl.g:768:3: otherlv_0= 'Menu' ( (lv_name_1_0= ruleEString ) ) this_OBJECT_START_2= RULE_OBJECT_START (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? otherlv_5= 'options' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_options_8_0= ruleOption ) ) (this_COMA_9= RULE_COMA ( (lv_options_10_0= ruleOption ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMenuAccess().getMenuKeyword_0());
            		
            // InternalMyDsl.g:772:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:773:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:773:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:774:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMenuRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_OBJECT_START_2=(Token)match(input,RULE_OBJECT_START,FOLLOW_22); 

            			newLeafNode(this_OBJECT_START_2, grammarAccess.getMenuAccess().getOBJECT_STARTTerminalRuleCall_2());
            		
            // InternalMyDsl.g:795:3: (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:796:4: otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMenuAccess().getTitleKeyword_3_0());
                    			
                    // InternalMyDsl.g:800:4: ( (lv_title_4_0= ruleEString ) )
                    // InternalMyDsl.g:801:5: (lv_title_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:801:5: (lv_title_4_0= ruleEString )
                    // InternalMyDsl.g:802:6: lv_title_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMenuAccess().getTitleEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_title_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMenuRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getMenuAccess().getOptionsKeyword_4());
            		
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_6, grammarAccess.getMenuAccess().getEQUALSTerminalRuleCall_5());
            		
            this_LIST_START_7=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_7, grammarAccess.getMenuAccess().getLIST_STARTTerminalRuleCall_6());
            		
            // InternalMyDsl.g:832:3: ( (lv_options_8_0= ruleOption ) )
            // InternalMyDsl.g:833:4: (lv_options_8_0= ruleOption )
            {
            // InternalMyDsl.g:833:4: (lv_options_8_0= ruleOption )
            // InternalMyDsl.g:834:5: lv_options_8_0= ruleOption
            {

            					newCompositeNode(grammarAccess.getMenuAccess().getOptionsOptionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_options_8_0=ruleOption();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMenuRule());
            					}
            					add(
            						current,
            						"options",
            						lv_options_8_0,
            						"org.xtext.example.mydsl.MyDsl.Option");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:851:3: (this_COMA_9= RULE_COMA ( (lv_options_10_0= ruleOption ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:852:4: this_COMA_9= RULE_COMA ( (lv_options_10_0= ruleOption ) )
            	    {
            	    this_COMA_9=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_9, grammarAccess.getMenuAccess().getCOMATerminalRuleCall_8_0());
            	    			
            	    // InternalMyDsl.g:856:4: ( (lv_options_10_0= ruleOption ) )
            	    // InternalMyDsl.g:857:5: (lv_options_10_0= ruleOption )
            	    {
            	    // InternalMyDsl.g:857:5: (lv_options_10_0= ruleOption )
            	    // InternalMyDsl.g:858:6: lv_options_10_0= ruleOption
            	    {

            	    						newCompositeNode(grammarAccess.getMenuAccess().getOptionsOptionParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_options_10_0=ruleOption();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMenuRule());
            	    						}
            	    						add(
            	    							current,
            	    							"options",
            	    							lv_options_10_0,
            	    							"org.xtext.example.mydsl.MyDsl.Option");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            this_LIST_END_11=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_11, grammarAccess.getMenuAccess().getLIST_ENDTerminalRuleCall_9());
            		
            this_OBJECT_END_12=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_12, grammarAccess.getMenuAccess().getOBJECT_ENDTerminalRuleCall_10());
            		

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
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRuleOption"
    // InternalMyDsl.g:888:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalMyDsl.g:888:47: (iv_ruleOption= ruleOption EOF )
            // InternalMyDsl.g:889:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalMyDsl.g:895:1: ruleOption returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'icon' ( (lv_icon_4_0= ruleEString ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'urlComponent' ( (lv_urlComponent_8_0= ruleEString ) ) )? this_OBJECT_END_9= RULE_OBJECT_END ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_OBJECT_END_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_icon_4_0 = null;

        AntlrDatatypeRuleToken lv_title_6_0 = null;

        AntlrDatatypeRuleToken lv_urlComponent_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:901:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'icon' ( (lv_icon_4_0= ruleEString ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'urlComponent' ( (lv_urlComponent_8_0= ruleEString ) ) )? this_OBJECT_END_9= RULE_OBJECT_END ) )
            // InternalMyDsl.g:902:2: ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'icon' ( (lv_icon_4_0= ruleEString ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'urlComponent' ( (lv_urlComponent_8_0= ruleEString ) ) )? this_OBJECT_END_9= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:902:2: ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'icon' ( (lv_icon_4_0= ruleEString ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'urlComponent' ( (lv_urlComponent_8_0= ruleEString ) ) )? this_OBJECT_END_9= RULE_OBJECT_END )
            // InternalMyDsl.g:903:3: () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'icon' ( (lv_icon_4_0= ruleEString ) ) )? (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )? (otherlv_7= 'urlComponent' ( (lv_urlComponent_8_0= ruleEString ) ) )? this_OBJECT_END_9= RULE_OBJECT_END
            {
            // InternalMyDsl.g:903:3: ()
            // InternalMyDsl.g:904:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOptionAccess().getOptionAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getOptionAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            // InternalMyDsl.g:914:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:915:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:915:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:916:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:933:3: (otherlv_3= 'icon' ( (lv_icon_4_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:934:4: otherlv_3= 'icon' ( (lv_icon_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOptionAccess().getIconKeyword_3_0());
                    			
                    // InternalMyDsl.g:938:4: ( (lv_icon_4_0= ruleEString ) )
                    // InternalMyDsl.g:939:5: (lv_icon_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:939:5: (lv_icon_4_0= ruleEString )
                    // InternalMyDsl.g:940:6: lv_icon_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOptionAccess().getIconEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_icon_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionRule());
                    						}
                    						set(
                    							current,
                    							"icon",
                    							lv_icon_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:958:3: (otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:959:4: otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getOptionAccess().getTitleKeyword_4_0());
                    			
                    // InternalMyDsl.g:963:4: ( (lv_title_6_0= ruleEString ) )
                    // InternalMyDsl.g:964:5: (lv_title_6_0= ruleEString )
                    {
                    // InternalMyDsl.g:964:5: (lv_title_6_0= ruleEString )
                    // InternalMyDsl.g:965:6: lv_title_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOptionAccess().getTitleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_title_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:983:3: (otherlv_7= 'urlComponent' ( (lv_urlComponent_8_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:984:4: otherlv_7= 'urlComponent' ( (lv_urlComponent_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getOptionAccess().getUrlComponentKeyword_5_0());
                    			
                    // InternalMyDsl.g:988:4: ( (lv_urlComponent_8_0= ruleEString ) )
                    // InternalMyDsl.g:989:5: (lv_urlComponent_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:989:5: (lv_urlComponent_8_0= ruleEString )
                    // InternalMyDsl.g:990:6: lv_urlComponent_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOptionAccess().getUrlComponentEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_urlComponent_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionRule());
                    						}
                    						set(
                    							current,
                    							"urlComponent",
                    							lv_urlComponent_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_OBJECT_END_9=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_9, grammarAccess.getOptionAccess().getOBJECT_ENDTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleLineChart"
    // InternalMyDsl.g:1016:1: entryRuleLineChart returns [EObject current=null] : iv_ruleLineChart= ruleLineChart EOF ;
    public final EObject entryRuleLineChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineChart = null;


        try {
            // InternalMyDsl.g:1016:50: (iv_ruleLineChart= ruleLineChart EOF )
            // InternalMyDsl.g:1017:2: iv_ruleLineChart= ruleLineChart EOF
            {
             newCompositeNode(grammarAccess.getLineChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineChart=ruleLineChart();

            state._fsp--;

             current =iv_ruleLineChart; 
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
    // $ANTLR end "entryRuleLineChart"


    // $ANTLR start "ruleLineChart"
    // InternalMyDsl.g:1023:1: ruleLineChart returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? (otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) ) )? (otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) ) )? (otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) ) )? (otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) ) )? ( (lv_displayGridLinesXAxes_14_0= 'displayGridLinesXAxes' ) )? ( (lv_displayGridLinesYAxes_15_0= 'displayGridLinesYAxes' ) )? otherlv_16= 'data' this_EQUALS_17= RULE_EQUALS this_LIST_START_18= RULE_LIST_START ( (lv_data_19_0= ruleData ) ) (this_COMA_20= RULE_COMA ( (lv_data_21_0= ruleData ) ) )* this_LIST_END_22= RULE_LIST_END otherlv_23= 'labels' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( (lv_labels_26_0= ruleLabel ) ) (this_COMA_27= RULE_COMA ( (lv_labels_28_0= ruleLabel ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END ) ;
    public final EObject ruleLineChart() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_displayGridLinesXAxes_14_0=null;
        Token lv_displayGridLinesYAxes_15_0=null;
        Token otherlv_16=null;
        Token this_EQUALS_17=null;
        Token this_LIST_START_18=null;
        Token this_COMA_20=null;
        Token this_LIST_END_22=null;
        Token otherlv_23=null;
        Token this_EQUALS_24=null;
        Token this_LIST_START_25=null;
        Token this_COMA_27=null;
        Token this_LIST_END_29=null;
        Token this_OBJECT_END_30=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_title_3_0 = null;

        Enumerator lv_legendPosition_5_0 = null;

        AntlrDatatypeRuleToken lv_labelStringXAxes_7_0 = null;

        AntlrDatatypeRuleToken lv_colorGridLinesXAxes_9_0 = null;

        AntlrDatatypeRuleToken lv_labelStringYAxes_11_0 = null;

        AntlrDatatypeRuleToken lv_colorGridLinesYAxes_13_0 = null;

        EObject lv_data_19_0 = null;

        EObject lv_data_21_0 = null;

        EObject lv_labels_26_0 = null;

        EObject lv_labels_28_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1029:2: ( (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? (otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) ) )? (otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) ) )? (otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) ) )? (otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) ) )? ( (lv_displayGridLinesXAxes_14_0= 'displayGridLinesXAxes' ) )? ( (lv_displayGridLinesYAxes_15_0= 'displayGridLinesYAxes' ) )? otherlv_16= 'data' this_EQUALS_17= RULE_EQUALS this_LIST_START_18= RULE_LIST_START ( (lv_data_19_0= ruleData ) ) (this_COMA_20= RULE_COMA ( (lv_data_21_0= ruleData ) ) )* this_LIST_END_22= RULE_LIST_END otherlv_23= 'labels' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( (lv_labels_26_0= ruleLabel ) ) (this_COMA_27= RULE_COMA ( (lv_labels_28_0= ruleLabel ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END ) )
            // InternalMyDsl.g:1030:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? (otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) ) )? (otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) ) )? (otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) ) )? (otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) ) )? ( (lv_displayGridLinesXAxes_14_0= 'displayGridLinesXAxes' ) )? ( (lv_displayGridLinesYAxes_15_0= 'displayGridLinesYAxes' ) )? otherlv_16= 'data' this_EQUALS_17= RULE_EQUALS this_LIST_START_18= RULE_LIST_START ( (lv_data_19_0= ruleData ) ) (this_COMA_20= RULE_COMA ( (lv_data_21_0= ruleData ) ) )* this_LIST_END_22= RULE_LIST_END otherlv_23= 'labels' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( (lv_labels_26_0= ruleLabel ) ) (this_COMA_27= RULE_COMA ( (lv_labels_28_0= ruleLabel ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:1030:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? (otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) ) )? (otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) ) )? (otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) ) )? (otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) ) )? ( (lv_displayGridLinesXAxes_14_0= 'displayGridLinesXAxes' ) )? ( (lv_displayGridLinesYAxes_15_0= 'displayGridLinesYAxes' ) )? otherlv_16= 'data' this_EQUALS_17= RULE_EQUALS this_LIST_START_18= RULE_LIST_START ( (lv_data_19_0= ruleData ) ) (this_COMA_20= RULE_COMA ( (lv_data_21_0= ruleData ) ) )* this_LIST_END_22= RULE_LIST_END otherlv_23= 'labels' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( (lv_labels_26_0= ruleLabel ) ) (this_COMA_27= RULE_COMA ( (lv_labels_28_0= ruleLabel ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END )
            // InternalMyDsl.g:1031:3: this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? (otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) ) )? (otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) ) )? (otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) ) )? (otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) ) )? ( (lv_displayGridLinesXAxes_14_0= 'displayGridLinesXAxes' ) )? ( (lv_displayGridLinesYAxes_15_0= 'displayGridLinesYAxes' ) )? otherlv_16= 'data' this_EQUALS_17= RULE_EQUALS this_LIST_START_18= RULE_LIST_START ( (lv_data_19_0= ruleData ) ) (this_COMA_20= RULE_COMA ( (lv_data_21_0= ruleData ) ) )* this_LIST_END_22= RULE_LIST_END otherlv_23= 'labels' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( (lv_labels_26_0= ruleLabel ) ) (this_COMA_27= RULE_COMA ( (lv_labels_28_0= ruleLabel ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getLineChartAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            // InternalMyDsl.g:1035:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1036:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1036:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1037:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLineChartAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineChartRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1054:3: (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )
            // InternalMyDsl.g:1055:4: otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,24,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getLineChartAccess().getTitleKeyword_2_0());
            			
            // InternalMyDsl.g:1059:4: ( (lv_title_3_0= ruleEString ) )
            // InternalMyDsl.g:1060:5: (lv_title_3_0= ruleEString )
            {
            // InternalMyDsl.g:1060:5: (lv_title_3_0= ruleEString )
            // InternalMyDsl.g:1061:6: lv_title_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getLineChartAccess().getTitleEStringParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_28);
            lv_title_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getLineChartRule());
            						}
            						set(
            							current,
            							"title",
            							lv_title_3_0,
            							"org.xtext.example.mydsl.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:1079:3: (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1080:4: otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getLineChartAccess().getLegendPositionKeyword_3_0());
                    			
                    // InternalMyDsl.g:1084:4: ( (lv_legendPosition_5_0= rulePositionOptions ) )
                    // InternalMyDsl.g:1085:5: (lv_legendPosition_5_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:1085:5: (lv_legendPosition_5_0= rulePositionOptions )
                    // InternalMyDsl.g:1086:6: lv_legendPosition_5_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getLegendPositionPositionOptionsEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_legendPosition_5_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"legendPosition",
                    							lv_legendPosition_5_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1104:3: (otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1105:4: otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getLineChartAccess().getLabelStringXAxesKeyword_4_0());
                    			
                    // InternalMyDsl.g:1109:4: ( (lv_labelStringXAxes_7_0= ruleEString ) )
                    // InternalMyDsl.g:1110:5: (lv_labelStringXAxes_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:1110:5: (lv_labelStringXAxes_7_0= ruleEString )
                    // InternalMyDsl.g:1111:6: lv_labelStringXAxes_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getLabelStringXAxesEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_labelStringXAxes_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"labelStringXAxes",
                    							lv_labelStringXAxes_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1129:3: (otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1130:4: otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getLineChartAccess().getColorGridLinesXAxesKeyword_5_0());
                    			
                    // InternalMyDsl.g:1134:4: ( (lv_colorGridLinesXAxes_9_0= ruleEString ) )
                    // InternalMyDsl.g:1135:5: (lv_colorGridLinesXAxes_9_0= ruleEString )
                    {
                    // InternalMyDsl.g:1135:5: (lv_colorGridLinesXAxes_9_0= ruleEString )
                    // InternalMyDsl.g:1136:6: lv_colorGridLinesXAxes_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getColorGridLinesXAxesEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_colorGridLinesXAxes_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"colorGridLinesXAxes",
                    							lv_colorGridLinesXAxes_9_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1154:3: (otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1155:4: otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getLineChartAccess().getLabelStringYAxesKeyword_6_0());
                    			
                    // InternalMyDsl.g:1159:4: ( (lv_labelStringYAxes_11_0= ruleEString ) )
                    // InternalMyDsl.g:1160:5: (lv_labelStringYAxes_11_0= ruleEString )
                    {
                    // InternalMyDsl.g:1160:5: (lv_labelStringYAxes_11_0= ruleEString )
                    // InternalMyDsl.g:1161:6: lv_labelStringYAxes_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getLabelStringYAxesEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_labelStringYAxes_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"labelStringYAxes",
                    							lv_labelStringYAxes_11_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1179:3: (otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1180:4: otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getLineChartAccess().getColorGridLinesYAxesKeyword_7_0());
                    			
                    // InternalMyDsl.g:1184:4: ( (lv_colorGridLinesYAxes_13_0= ruleEString ) )
                    // InternalMyDsl.g:1185:5: (lv_colorGridLinesYAxes_13_0= ruleEString )
                    {
                    // InternalMyDsl.g:1185:5: (lv_colorGridLinesYAxes_13_0= ruleEString )
                    // InternalMyDsl.g:1186:6: lv_colorGridLinesYAxes_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getColorGridLinesYAxesEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_colorGridLinesYAxes_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"colorGridLinesYAxes",
                    							lv_colorGridLinesYAxes_13_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1204:3: ( (lv_displayGridLinesXAxes_14_0= 'displayGridLinesXAxes' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1205:4: (lv_displayGridLinesXAxes_14_0= 'displayGridLinesXAxes' )
                    {
                    // InternalMyDsl.g:1205:4: (lv_displayGridLinesXAxes_14_0= 'displayGridLinesXAxes' )
                    // InternalMyDsl.g:1206:5: lv_displayGridLinesXAxes_14_0= 'displayGridLinesXAxes'
                    {
                    lv_displayGridLinesXAxes_14_0=(Token)match(input,39,FOLLOW_35); 

                    					newLeafNode(lv_displayGridLinesXAxes_14_0, grammarAccess.getLineChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLineChartRule());
                    					}
                    					setWithLastConsumed(current, "displayGridLinesXAxes", true, "displayGridLinesXAxes");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1218:3: ( (lv_displayGridLinesYAxes_15_0= 'displayGridLinesYAxes' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1219:4: (lv_displayGridLinesYAxes_15_0= 'displayGridLinesYAxes' )
                    {
                    // InternalMyDsl.g:1219:4: (lv_displayGridLinesYAxes_15_0= 'displayGridLinesYAxes' )
                    // InternalMyDsl.g:1220:5: lv_displayGridLinesYAxes_15_0= 'displayGridLinesYAxes'
                    {
                    lv_displayGridLinesYAxes_15_0=(Token)match(input,40,FOLLOW_36); 

                    					newLeafNode(lv_displayGridLinesYAxes_15_0, grammarAccess.getLineChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLineChartRule());
                    					}
                    					setWithLastConsumed(current, "displayGridLinesYAxes", true, "displayGridLinesYAxes");
                    				

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_16, grammarAccess.getLineChartAccess().getDataKeyword_10());
            		
            this_EQUALS_17=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_17, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_11());
            		
            this_LIST_START_18=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_18, grammarAccess.getLineChartAccess().getLIST_STARTTerminalRuleCall_12());
            		
            // InternalMyDsl.g:1244:3: ( (lv_data_19_0= ruleData ) )
            // InternalMyDsl.g:1245:4: (lv_data_19_0= ruleData )
            {
            // InternalMyDsl.g:1245:4: (lv_data_19_0= ruleData )
            // InternalMyDsl.g:1246:5: lv_data_19_0= ruleData
            {

            					newCompositeNode(grammarAccess.getLineChartAccess().getDataDataParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_19_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineChartRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_19_0,
            						"org.xtext.example.mydsl.MyDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1263:3: (this_COMA_20= RULE_COMA ( (lv_data_21_0= ruleData ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_COMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:1264:4: this_COMA_20= RULE_COMA ( (lv_data_21_0= ruleData ) )
            	    {
            	    this_COMA_20=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_20, grammarAccess.getLineChartAccess().getCOMATerminalRuleCall_14_0());
            	    			
            	    // InternalMyDsl.g:1268:4: ( (lv_data_21_0= ruleData ) )
            	    // InternalMyDsl.g:1269:5: (lv_data_21_0= ruleData )
            	    {
            	    // InternalMyDsl.g:1269:5: (lv_data_21_0= ruleData )
            	    // InternalMyDsl.g:1270:6: lv_data_21_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getLineChartAccess().getDataDataParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_21_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLineChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_21_0,
            	    							"org.xtext.example.mydsl.MyDsl.Data");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            this_LIST_END_22=(Token)match(input,RULE_LIST_END,FOLLOW_37); 

            			newLeafNode(this_LIST_END_22, grammarAccess.getLineChartAccess().getLIST_ENDTerminalRuleCall_15());
            		
            otherlv_23=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_23, grammarAccess.getLineChartAccess().getLabelsKeyword_16());
            		
            this_EQUALS_24=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_24, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_17());
            		
            this_LIST_START_25=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_25, grammarAccess.getLineChartAccess().getLIST_STARTTerminalRuleCall_18());
            		
            // InternalMyDsl.g:1304:3: ( (lv_labels_26_0= ruleLabel ) )
            // InternalMyDsl.g:1305:4: (lv_labels_26_0= ruleLabel )
            {
            // InternalMyDsl.g:1305:4: (lv_labels_26_0= ruleLabel )
            // InternalMyDsl.g:1306:5: lv_labels_26_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getLineChartAccess().getLabelsLabelParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_9);
            lv_labels_26_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineChartRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_26_0,
            						"org.xtext.example.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1323:3: (this_COMA_27= RULE_COMA ( (lv_labels_28_0= ruleLabel ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_COMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:1324:4: this_COMA_27= RULE_COMA ( (lv_labels_28_0= ruleLabel ) )
            	    {
            	    this_COMA_27=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_27, grammarAccess.getLineChartAccess().getCOMATerminalRuleCall_20_0());
            	    			
            	    // InternalMyDsl.g:1328:4: ( (lv_labels_28_0= ruleLabel ) )
            	    // InternalMyDsl.g:1329:5: (lv_labels_28_0= ruleLabel )
            	    {
            	    // InternalMyDsl.g:1329:5: (lv_labels_28_0= ruleLabel )
            	    // InternalMyDsl.g:1330:6: lv_labels_28_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getLineChartAccess().getLabelsLabelParserRuleCall_20_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_labels_28_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLineChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_28_0,
            	    							"org.xtext.example.mydsl.MyDsl.Label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            this_LIST_END_29=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_29, grammarAccess.getLineChartAccess().getLIST_ENDTerminalRuleCall_21());
            		
            this_OBJECT_END_30=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_30, grammarAccess.getLineChartAccess().getOBJECT_ENDTerminalRuleCall_22());
            		

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
    // $ANTLR end "ruleLineChart"


    // $ANTLR start "entryRuleBarChart"
    // InternalMyDsl.g:1360:1: entryRuleBarChart returns [EObject current=null] : iv_ruleBarChart= ruleBarChart EOF ;
    public final EObject entryRuleBarChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarChart = null;


        try {
            // InternalMyDsl.g:1360:49: (iv_ruleBarChart= ruleBarChart EOF )
            // InternalMyDsl.g:1361:2: iv_ruleBarChart= ruleBarChart EOF
            {
             newCompositeNode(grammarAccess.getBarChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBarChart=ruleBarChart();

            state._fsp--;

             current =iv_ruleBarChart; 
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
    // $ANTLR end "entryRuleBarChart"


    // $ANTLR start "ruleBarChart"
    // InternalMyDsl.g:1367:1: ruleBarChart returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? (otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) ) )? (otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) ) )? (otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) ) )? (otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) ) )? (otherlv_14= 'barPercentage' ( (lv_barPercentage_15_0= ruleEFloat ) ) ) ( (lv_displayGridLinesXAxes_16_0= 'displayGridLinesXAxes' ) )? ( (lv_displayGridLinesYAxes_17_0= 'displayGridLinesYAxes' ) )? otherlv_18= 'data' this_EQUALS_19= RULE_EQUALS this_LIST_START_20= RULE_LIST_START ( (lv_data_21_0= ruleData ) ) (this_COMA_22= RULE_COMA ( (lv_data_23_0= ruleData ) ) )* this_LIST_END_24= RULE_LIST_END otherlv_25= 'labels' this_EQUALS_26= RULE_EQUALS this_LIST_START_27= RULE_LIST_START ( (lv_labels_28_0= ruleLabel ) ) (this_COMA_29= RULE_COMA ( (lv_labels_30_0= ruleLabel ) ) )* this_LIST_END_31= RULE_LIST_END this_OBJECT_END_32= RULE_OBJECT_END ) ;
    public final EObject ruleBarChart() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_displayGridLinesXAxes_16_0=null;
        Token lv_displayGridLinesYAxes_17_0=null;
        Token otherlv_18=null;
        Token this_EQUALS_19=null;
        Token this_LIST_START_20=null;
        Token this_COMA_22=null;
        Token this_LIST_END_24=null;
        Token otherlv_25=null;
        Token this_EQUALS_26=null;
        Token this_LIST_START_27=null;
        Token this_COMA_29=null;
        Token this_LIST_END_31=null;
        Token this_OBJECT_END_32=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_title_3_0 = null;

        Enumerator lv_legendPosition_5_0 = null;

        AntlrDatatypeRuleToken lv_labelStringXAxes_7_0 = null;

        AntlrDatatypeRuleToken lv_colorGridLinesXAxes_9_0 = null;

        AntlrDatatypeRuleToken lv_labelStringYAxes_11_0 = null;

        AntlrDatatypeRuleToken lv_colorGridLinesYAxes_13_0 = null;

        AntlrDatatypeRuleToken lv_barPercentage_15_0 = null;

        EObject lv_data_21_0 = null;

        EObject lv_data_23_0 = null;

        EObject lv_labels_28_0 = null;

        EObject lv_labels_30_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1373:2: ( (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? (otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) ) )? (otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) ) )? (otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) ) )? (otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) ) )? (otherlv_14= 'barPercentage' ( (lv_barPercentage_15_0= ruleEFloat ) ) ) ( (lv_displayGridLinesXAxes_16_0= 'displayGridLinesXAxes' ) )? ( (lv_displayGridLinesYAxes_17_0= 'displayGridLinesYAxes' ) )? otherlv_18= 'data' this_EQUALS_19= RULE_EQUALS this_LIST_START_20= RULE_LIST_START ( (lv_data_21_0= ruleData ) ) (this_COMA_22= RULE_COMA ( (lv_data_23_0= ruleData ) ) )* this_LIST_END_24= RULE_LIST_END otherlv_25= 'labels' this_EQUALS_26= RULE_EQUALS this_LIST_START_27= RULE_LIST_START ( (lv_labels_28_0= ruleLabel ) ) (this_COMA_29= RULE_COMA ( (lv_labels_30_0= ruleLabel ) ) )* this_LIST_END_31= RULE_LIST_END this_OBJECT_END_32= RULE_OBJECT_END ) )
            // InternalMyDsl.g:1374:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? (otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) ) )? (otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) ) )? (otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) ) )? (otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) ) )? (otherlv_14= 'barPercentage' ( (lv_barPercentage_15_0= ruleEFloat ) ) ) ( (lv_displayGridLinesXAxes_16_0= 'displayGridLinesXAxes' ) )? ( (lv_displayGridLinesYAxes_17_0= 'displayGridLinesYAxes' ) )? otherlv_18= 'data' this_EQUALS_19= RULE_EQUALS this_LIST_START_20= RULE_LIST_START ( (lv_data_21_0= ruleData ) ) (this_COMA_22= RULE_COMA ( (lv_data_23_0= ruleData ) ) )* this_LIST_END_24= RULE_LIST_END otherlv_25= 'labels' this_EQUALS_26= RULE_EQUALS this_LIST_START_27= RULE_LIST_START ( (lv_labels_28_0= ruleLabel ) ) (this_COMA_29= RULE_COMA ( (lv_labels_30_0= ruleLabel ) ) )* this_LIST_END_31= RULE_LIST_END this_OBJECT_END_32= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:1374:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? (otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) ) )? (otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) ) )? (otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) ) )? (otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) ) )? (otherlv_14= 'barPercentage' ( (lv_barPercentage_15_0= ruleEFloat ) ) ) ( (lv_displayGridLinesXAxes_16_0= 'displayGridLinesXAxes' ) )? ( (lv_displayGridLinesYAxes_17_0= 'displayGridLinesYAxes' ) )? otherlv_18= 'data' this_EQUALS_19= RULE_EQUALS this_LIST_START_20= RULE_LIST_START ( (lv_data_21_0= ruleData ) ) (this_COMA_22= RULE_COMA ( (lv_data_23_0= ruleData ) ) )* this_LIST_END_24= RULE_LIST_END otherlv_25= 'labels' this_EQUALS_26= RULE_EQUALS this_LIST_START_27= RULE_LIST_START ( (lv_labels_28_0= ruleLabel ) ) (this_COMA_29= RULE_COMA ( (lv_labels_30_0= ruleLabel ) ) )* this_LIST_END_31= RULE_LIST_END this_OBJECT_END_32= RULE_OBJECT_END )
            // InternalMyDsl.g:1375:3: this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? (otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) ) )? (otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) ) )? (otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) ) )? (otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) ) )? (otherlv_14= 'barPercentage' ( (lv_barPercentage_15_0= ruleEFloat ) ) ) ( (lv_displayGridLinesXAxes_16_0= 'displayGridLinesXAxes' ) )? ( (lv_displayGridLinesYAxes_17_0= 'displayGridLinesYAxes' ) )? otherlv_18= 'data' this_EQUALS_19= RULE_EQUALS this_LIST_START_20= RULE_LIST_START ( (lv_data_21_0= ruleData ) ) (this_COMA_22= RULE_COMA ( (lv_data_23_0= ruleData ) ) )* this_LIST_END_24= RULE_LIST_END otherlv_25= 'labels' this_EQUALS_26= RULE_EQUALS this_LIST_START_27= RULE_LIST_START ( (lv_labels_28_0= ruleLabel ) ) (this_COMA_29= RULE_COMA ( (lv_labels_30_0= ruleLabel ) ) )* this_LIST_END_31= RULE_LIST_END this_OBJECT_END_32= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getBarChartAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            // InternalMyDsl.g:1379:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1380:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1380:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1381:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBarChartAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarChartRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1398:3: (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )
            // InternalMyDsl.g:1399:4: otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,24,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getBarChartAccess().getTitleKeyword_2_0());
            			
            // InternalMyDsl.g:1403:4: ( (lv_title_3_0= ruleEString ) )
            // InternalMyDsl.g:1404:5: (lv_title_3_0= ruleEString )
            {
            // InternalMyDsl.g:1404:5: (lv_title_3_0= ruleEString )
            // InternalMyDsl.g:1405:6: lv_title_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getBarChartAccess().getTitleEStringParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_38);
            lv_title_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBarChartRule());
            						}
            						set(
            							current,
            							"title",
            							lv_title_3_0,
            							"org.xtext.example.mydsl.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:1423:3: (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1424:4: otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getBarChartAccess().getLegendPositionKeyword_3_0());
                    			
                    // InternalMyDsl.g:1428:4: ( (lv_legendPosition_5_0= rulePositionOptions ) )
                    // InternalMyDsl.g:1429:5: (lv_legendPosition_5_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:1429:5: (lv_legendPosition_5_0= rulePositionOptions )
                    // InternalMyDsl.g:1430:6: lv_legendPosition_5_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getLegendPositionPositionOptionsEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_legendPosition_5_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"legendPosition",
                    							lv_legendPosition_5_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1448:3: (otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1449:4: otherlv_6= 'labelStringXAxes' ( (lv_labelStringXAxes_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getBarChartAccess().getLabelStringXAxesKeyword_4_0());
                    			
                    // InternalMyDsl.g:1453:4: ( (lv_labelStringXAxes_7_0= ruleEString ) )
                    // InternalMyDsl.g:1454:5: (lv_labelStringXAxes_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:1454:5: (lv_labelStringXAxes_7_0= ruleEString )
                    // InternalMyDsl.g:1455:6: lv_labelStringXAxes_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getLabelStringXAxesEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_labelStringXAxes_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"labelStringXAxes",
                    							lv_labelStringXAxes_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1473:3: (otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1474:4: otherlv_8= 'colorGridLinesXAxes' ( (lv_colorGridLinesXAxes_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getBarChartAccess().getColorGridLinesXAxesKeyword_5_0());
                    			
                    // InternalMyDsl.g:1478:4: ( (lv_colorGridLinesXAxes_9_0= ruleEString ) )
                    // InternalMyDsl.g:1479:5: (lv_colorGridLinesXAxes_9_0= ruleEString )
                    {
                    // InternalMyDsl.g:1479:5: (lv_colorGridLinesXAxes_9_0= ruleEString )
                    // InternalMyDsl.g:1480:6: lv_colorGridLinesXAxes_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getColorGridLinesXAxesEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_colorGridLinesXAxes_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"colorGridLinesXAxes",
                    							lv_colorGridLinesXAxes_9_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1498:3: (otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1499:4: otherlv_10= 'labelStringYAxes' ( (lv_labelStringYAxes_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getBarChartAccess().getLabelStringYAxesKeyword_6_0());
                    			
                    // InternalMyDsl.g:1503:4: ( (lv_labelStringYAxes_11_0= ruleEString ) )
                    // InternalMyDsl.g:1504:5: (lv_labelStringYAxes_11_0= ruleEString )
                    {
                    // InternalMyDsl.g:1504:5: (lv_labelStringYAxes_11_0= ruleEString )
                    // InternalMyDsl.g:1505:6: lv_labelStringYAxes_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getLabelStringYAxesEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_labelStringYAxes_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"labelStringYAxes",
                    							lv_labelStringYAxes_11_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1523:3: (otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1524:4: otherlv_12= 'colorGridLinesYAxes' ( (lv_colorGridLinesYAxes_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getBarChartAccess().getColorGridLinesYAxesKeyword_7_0());
                    			
                    // InternalMyDsl.g:1528:4: ( (lv_colorGridLinesYAxes_13_0= ruleEString ) )
                    // InternalMyDsl.g:1529:5: (lv_colorGridLinesYAxes_13_0= ruleEString )
                    {
                    // InternalMyDsl.g:1529:5: (lv_colorGridLinesYAxes_13_0= ruleEString )
                    // InternalMyDsl.g:1530:6: lv_colorGridLinesYAxes_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getColorGridLinesYAxesEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_colorGridLinesYAxes_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"colorGridLinesYAxes",
                    							lv_colorGridLinesYAxes_13_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1548:3: (otherlv_14= 'barPercentage' ( (lv_barPercentage_15_0= ruleEFloat ) ) )
            // InternalMyDsl.g:1549:4: otherlv_14= 'barPercentage' ( (lv_barPercentage_15_0= ruleEFloat ) )
            {
            otherlv_14=(Token)match(input,43,FOLLOW_44); 

            				newLeafNode(otherlv_14, grammarAccess.getBarChartAccess().getBarPercentageKeyword_8_0());
            			
            // InternalMyDsl.g:1553:4: ( (lv_barPercentage_15_0= ruleEFloat ) )
            // InternalMyDsl.g:1554:5: (lv_barPercentage_15_0= ruleEFloat )
            {
            // InternalMyDsl.g:1554:5: (lv_barPercentage_15_0= ruleEFloat )
            // InternalMyDsl.g:1555:6: lv_barPercentage_15_0= ruleEFloat
            {

            						newCompositeNode(grammarAccess.getBarChartAccess().getBarPercentageEFloatParserRuleCall_8_1_0());
            					
            pushFollow(FOLLOW_34);
            lv_barPercentage_15_0=ruleEFloat();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBarChartRule());
            						}
            						set(
            							current,
            							"barPercentage",
            							lv_barPercentage_15_0,
            							"org.xtext.example.mydsl.MyDsl.EFloat");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:1573:3: ( (lv_displayGridLinesXAxes_16_0= 'displayGridLinesXAxes' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1574:4: (lv_displayGridLinesXAxes_16_0= 'displayGridLinesXAxes' )
                    {
                    // InternalMyDsl.g:1574:4: (lv_displayGridLinesXAxes_16_0= 'displayGridLinesXAxes' )
                    // InternalMyDsl.g:1575:5: lv_displayGridLinesXAxes_16_0= 'displayGridLinesXAxes'
                    {
                    lv_displayGridLinesXAxes_16_0=(Token)match(input,39,FOLLOW_35); 

                    					newLeafNode(lv_displayGridLinesXAxes_16_0, grammarAccess.getBarChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBarChartRule());
                    					}
                    					setWithLastConsumed(current, "displayGridLinesXAxes", true, "displayGridLinesXAxes");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1587:3: ( (lv_displayGridLinesYAxes_17_0= 'displayGridLinesYAxes' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1588:4: (lv_displayGridLinesYAxes_17_0= 'displayGridLinesYAxes' )
                    {
                    // InternalMyDsl.g:1588:4: (lv_displayGridLinesYAxes_17_0= 'displayGridLinesYAxes' )
                    // InternalMyDsl.g:1589:5: lv_displayGridLinesYAxes_17_0= 'displayGridLinesYAxes'
                    {
                    lv_displayGridLinesYAxes_17_0=(Token)match(input,40,FOLLOW_36); 

                    					newLeafNode(lv_displayGridLinesYAxes_17_0, grammarAccess.getBarChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBarChartRule());
                    					}
                    					setWithLastConsumed(current, "displayGridLinesYAxes", true, "displayGridLinesYAxes");
                    				

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getBarChartAccess().getDataKeyword_11());
            		
            this_EQUALS_19=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_19, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_12());
            		
            this_LIST_START_20=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_20, grammarAccess.getBarChartAccess().getLIST_STARTTerminalRuleCall_13());
            		
            // InternalMyDsl.g:1613:3: ( (lv_data_21_0= ruleData ) )
            // InternalMyDsl.g:1614:4: (lv_data_21_0= ruleData )
            {
            // InternalMyDsl.g:1614:4: (lv_data_21_0= ruleData )
            // InternalMyDsl.g:1615:5: lv_data_21_0= ruleData
            {

            					newCompositeNode(grammarAccess.getBarChartAccess().getDataDataParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_21_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarChartRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_21_0,
            						"org.xtext.example.mydsl.MyDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1632:3: (this_COMA_22= RULE_COMA ( (lv_data_23_0= ruleData ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_COMA) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:1633:4: this_COMA_22= RULE_COMA ( (lv_data_23_0= ruleData ) )
            	    {
            	    this_COMA_22=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_22, grammarAccess.getBarChartAccess().getCOMATerminalRuleCall_15_0());
            	    			
            	    // InternalMyDsl.g:1637:4: ( (lv_data_23_0= ruleData ) )
            	    // InternalMyDsl.g:1638:5: (lv_data_23_0= ruleData )
            	    {
            	    // InternalMyDsl.g:1638:5: (lv_data_23_0= ruleData )
            	    // InternalMyDsl.g:1639:6: lv_data_23_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getBarChartAccess().getDataDataParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_23_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBarChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_23_0,
            	    							"org.xtext.example.mydsl.MyDsl.Data");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            this_LIST_END_24=(Token)match(input,RULE_LIST_END,FOLLOW_37); 

            			newLeafNode(this_LIST_END_24, grammarAccess.getBarChartAccess().getLIST_ENDTerminalRuleCall_16());
            		
            otherlv_25=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_25, grammarAccess.getBarChartAccess().getLabelsKeyword_17());
            		
            this_EQUALS_26=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_26, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_18());
            		
            this_LIST_START_27=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_27, grammarAccess.getBarChartAccess().getLIST_STARTTerminalRuleCall_19());
            		
            // InternalMyDsl.g:1673:3: ( (lv_labels_28_0= ruleLabel ) )
            // InternalMyDsl.g:1674:4: (lv_labels_28_0= ruleLabel )
            {
            // InternalMyDsl.g:1674:4: (lv_labels_28_0= ruleLabel )
            // InternalMyDsl.g:1675:5: lv_labels_28_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getBarChartAccess().getLabelsLabelParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_9);
            lv_labels_28_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarChartRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_28_0,
            						"org.xtext.example.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1692:3: (this_COMA_29= RULE_COMA ( (lv_labels_30_0= ruleLabel ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_COMA) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:1693:4: this_COMA_29= RULE_COMA ( (lv_labels_30_0= ruleLabel ) )
            	    {
            	    this_COMA_29=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_29, grammarAccess.getBarChartAccess().getCOMATerminalRuleCall_21_0());
            	    			
            	    // InternalMyDsl.g:1697:4: ( (lv_labels_30_0= ruleLabel ) )
            	    // InternalMyDsl.g:1698:5: (lv_labels_30_0= ruleLabel )
            	    {
            	    // InternalMyDsl.g:1698:5: (lv_labels_30_0= ruleLabel )
            	    // InternalMyDsl.g:1699:6: lv_labels_30_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getBarChartAccess().getLabelsLabelParserRuleCall_21_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_labels_30_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBarChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_30_0,
            	    							"org.xtext.example.mydsl.MyDsl.Label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            this_LIST_END_31=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_31, grammarAccess.getBarChartAccess().getLIST_ENDTerminalRuleCall_22());
            		
            this_OBJECT_END_32=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_32, grammarAccess.getBarChartAccess().getOBJECT_ENDTerminalRuleCall_23());
            		

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
    // $ANTLR end "ruleBarChart"


    // $ANTLR start "entryRuleRadarChart"
    // InternalMyDsl.g:1729:1: entryRuleRadarChart returns [EObject current=null] : iv_ruleRadarChart= ruleRadarChart EOF ;
    public final EObject entryRuleRadarChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadarChart = null;


        try {
            // InternalMyDsl.g:1729:51: (iv_ruleRadarChart= ruleRadarChart EOF )
            // InternalMyDsl.g:1730:2: iv_ruleRadarChart= ruleRadarChart EOF
            {
             newCompositeNode(grammarAccess.getRadarChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRadarChart=ruleRadarChart();

            state._fsp--;

             current =iv_ruleRadarChart; 
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
    // $ANTLR end "entryRuleRadarChart"


    // $ANTLR start "ruleRadarChart"
    // InternalMyDsl.g:1736:1: ruleRadarChart returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? ( (lv_angleLinesDisplay_6_0= 'angleLinesDisplay' ) ) otherlv_7= 'data' this_EQUALS_8= RULE_EQUALS this_LIST_START_9= RULE_LIST_START ( (lv_data_10_0= ruleData ) ) (this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) ) )* this_LIST_END_13= RULE_LIST_END otherlv_14= 'labels' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_labels_17_0= ruleLabel ) ) (this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) ) )* this_LIST_END_20= RULE_LIST_END this_OBJECT_END_21= RULE_OBJECT_END ) ;
    public final EObject ruleRadarChart() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_angleLinesDisplay_6_0=null;
        Token otherlv_7=null;
        Token this_EQUALS_8=null;
        Token this_LIST_START_9=null;
        Token this_COMA_11=null;
        Token this_LIST_END_13=null;
        Token otherlv_14=null;
        Token this_EQUALS_15=null;
        Token this_LIST_START_16=null;
        Token this_COMA_18=null;
        Token this_LIST_END_20=null;
        Token this_OBJECT_END_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_title_3_0 = null;

        Enumerator lv_legendPosition_5_0 = null;

        EObject lv_data_10_0 = null;

        EObject lv_data_12_0 = null;

        EObject lv_labels_17_0 = null;

        EObject lv_labels_19_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1742:2: ( (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? ( (lv_angleLinesDisplay_6_0= 'angleLinesDisplay' ) ) otherlv_7= 'data' this_EQUALS_8= RULE_EQUALS this_LIST_START_9= RULE_LIST_START ( (lv_data_10_0= ruleData ) ) (this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) ) )* this_LIST_END_13= RULE_LIST_END otherlv_14= 'labels' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_labels_17_0= ruleLabel ) ) (this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) ) )* this_LIST_END_20= RULE_LIST_END this_OBJECT_END_21= RULE_OBJECT_END ) )
            // InternalMyDsl.g:1743:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? ( (lv_angleLinesDisplay_6_0= 'angleLinesDisplay' ) ) otherlv_7= 'data' this_EQUALS_8= RULE_EQUALS this_LIST_START_9= RULE_LIST_START ( (lv_data_10_0= ruleData ) ) (this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) ) )* this_LIST_END_13= RULE_LIST_END otherlv_14= 'labels' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_labels_17_0= ruleLabel ) ) (this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) ) )* this_LIST_END_20= RULE_LIST_END this_OBJECT_END_21= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:1743:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? ( (lv_angleLinesDisplay_6_0= 'angleLinesDisplay' ) ) otherlv_7= 'data' this_EQUALS_8= RULE_EQUALS this_LIST_START_9= RULE_LIST_START ( (lv_data_10_0= ruleData ) ) (this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) ) )* this_LIST_END_13= RULE_LIST_END otherlv_14= 'labels' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_labels_17_0= ruleLabel ) ) (this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) ) )* this_LIST_END_20= RULE_LIST_END this_OBJECT_END_21= RULE_OBJECT_END )
            // InternalMyDsl.g:1744:3: this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) ) (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )? ( (lv_angleLinesDisplay_6_0= 'angleLinesDisplay' ) ) otherlv_7= 'data' this_EQUALS_8= RULE_EQUALS this_LIST_START_9= RULE_LIST_START ( (lv_data_10_0= ruleData ) ) (this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) ) )* this_LIST_END_13= RULE_LIST_END otherlv_14= 'labels' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_labels_17_0= ruleLabel ) ) (this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) ) )* this_LIST_END_20= RULE_LIST_END this_OBJECT_END_21= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getRadarChartAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            // InternalMyDsl.g:1748:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1749:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1749:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1750:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRadarChartAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadarChartRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1767:3: (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )
            // InternalMyDsl.g:1768:4: otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,24,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getRadarChartAccess().getTitleKeyword_2_0());
            			
            // InternalMyDsl.g:1772:4: ( (lv_title_3_0= ruleEString ) )
            // InternalMyDsl.g:1773:5: (lv_title_3_0= ruleEString )
            {
            // InternalMyDsl.g:1773:5: (lv_title_3_0= ruleEString )
            // InternalMyDsl.g:1774:6: lv_title_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getRadarChartAccess().getTitleEStringParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_45);
            lv_title_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRadarChartRule());
            						}
            						set(
            							current,
            							"title",
            							lv_title_3_0,
            							"org.xtext.example.mydsl.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:1792:3: (otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1793:4: otherlv_4= 'legendPosition' ( (lv_legendPosition_5_0= rulePositionOptions ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getRadarChartAccess().getLegendPositionKeyword_3_0());
                    			
                    // InternalMyDsl.g:1797:4: ( (lv_legendPosition_5_0= rulePositionOptions ) )
                    // InternalMyDsl.g:1798:5: (lv_legendPosition_5_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:1798:5: (lv_legendPosition_5_0= rulePositionOptions )
                    // InternalMyDsl.g:1799:6: lv_legendPosition_5_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getRadarChartAccess().getLegendPositionPositionOptionsEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_legendPosition_5_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRadarChartRule());
                    						}
                    						set(
                    							current,
                    							"legendPosition",
                    							lv_legendPosition_5_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1817:3: ( (lv_angleLinesDisplay_6_0= 'angleLinesDisplay' ) )
            // InternalMyDsl.g:1818:4: (lv_angleLinesDisplay_6_0= 'angleLinesDisplay' )
            {
            // InternalMyDsl.g:1818:4: (lv_angleLinesDisplay_6_0= 'angleLinesDisplay' )
            // InternalMyDsl.g:1819:5: lv_angleLinesDisplay_6_0= 'angleLinesDisplay'
            {
            lv_angleLinesDisplay_6_0=(Token)match(input,44,FOLLOW_36); 

            					newLeafNode(lv_angleLinesDisplay_6_0, grammarAccess.getRadarChartAccess().getAngleLinesDisplayAngleLinesDisplayKeyword_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRadarChartRule());
            					}
            					setWithLastConsumed(current, "angleLinesDisplay", true, "angleLinesDisplay");
            				

            }


            }

            otherlv_7=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getRadarChartAccess().getDataKeyword_5());
            		
            this_EQUALS_8=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_8, grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_6());
            		
            this_LIST_START_9=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_9, grammarAccess.getRadarChartAccess().getLIST_STARTTerminalRuleCall_7());
            		
            // InternalMyDsl.g:1843:3: ( (lv_data_10_0= ruleData ) )
            // InternalMyDsl.g:1844:4: (lv_data_10_0= ruleData )
            {
            // InternalMyDsl.g:1844:4: (lv_data_10_0= ruleData )
            // InternalMyDsl.g:1845:5: lv_data_10_0= ruleData
            {

            					newCompositeNode(grammarAccess.getRadarChartAccess().getDataDataParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_10_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadarChartRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_10_0,
            						"org.xtext.example.mydsl.MyDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1862:3: (this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_COMA) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:1863:4: this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) )
            	    {
            	    this_COMA_11=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_11, grammarAccess.getRadarChartAccess().getCOMATerminalRuleCall_9_0());
            	    			
            	    // InternalMyDsl.g:1867:4: ( (lv_data_12_0= ruleData ) )
            	    // InternalMyDsl.g:1868:5: (lv_data_12_0= ruleData )
            	    {
            	    // InternalMyDsl.g:1868:5: (lv_data_12_0= ruleData )
            	    // InternalMyDsl.g:1869:6: lv_data_12_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getRadarChartAccess().getDataDataParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_12_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRadarChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_12_0,
            	    							"org.xtext.example.mydsl.MyDsl.Data");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            this_LIST_END_13=(Token)match(input,RULE_LIST_END,FOLLOW_37); 

            			newLeafNode(this_LIST_END_13, grammarAccess.getRadarChartAccess().getLIST_ENDTerminalRuleCall_10());
            		
            otherlv_14=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getRadarChartAccess().getLabelsKeyword_11());
            		
            this_EQUALS_15=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_15, grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_12());
            		
            this_LIST_START_16=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_16, grammarAccess.getRadarChartAccess().getLIST_STARTTerminalRuleCall_13());
            		
            // InternalMyDsl.g:1903:3: ( (lv_labels_17_0= ruleLabel ) )
            // InternalMyDsl.g:1904:4: (lv_labels_17_0= ruleLabel )
            {
            // InternalMyDsl.g:1904:4: (lv_labels_17_0= ruleLabel )
            // InternalMyDsl.g:1905:5: lv_labels_17_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getRadarChartAccess().getLabelsLabelParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_9);
            lv_labels_17_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadarChartRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_17_0,
            						"org.xtext.example.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1922:3: (this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_COMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:1923:4: this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) )
            	    {
            	    this_COMA_18=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_18, grammarAccess.getRadarChartAccess().getCOMATerminalRuleCall_15_0());
            	    			
            	    // InternalMyDsl.g:1927:4: ( (lv_labels_19_0= ruleLabel ) )
            	    // InternalMyDsl.g:1928:5: (lv_labels_19_0= ruleLabel )
            	    {
            	    // InternalMyDsl.g:1928:5: (lv_labels_19_0= ruleLabel )
            	    // InternalMyDsl.g:1929:6: lv_labels_19_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getRadarChartAccess().getLabelsLabelParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_labels_19_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRadarChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_19_0,
            	    							"org.xtext.example.mydsl.MyDsl.Label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            this_LIST_END_20=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_20, grammarAccess.getRadarChartAccess().getLIST_ENDTerminalRuleCall_16());
            		
            this_OBJECT_END_21=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_21, grammarAccess.getRadarChartAccess().getOBJECT_ENDTerminalRuleCall_17());
            		

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
    // $ANTLR end "ruleRadarChart"


    // $ANTLR start "entryRulePieChart"
    // InternalMyDsl.g:1959:1: entryRulePieChart returns [EObject current=null] : iv_rulePieChart= rulePieChart EOF ;
    public final EObject entryRulePieChart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePieChart = null;


        try {
            // InternalMyDsl.g:1959:49: (iv_rulePieChart= rulePieChart EOF )
            // InternalMyDsl.g:1960:2: iv_rulePieChart= rulePieChart EOF
            {
             newCompositeNode(grammarAccess.getPieChartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePieChart=rulePieChart();

            state._fsp--;

             current =iv_rulePieChart; 
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
    // $ANTLR end "entryRulePieChart"


    // $ANTLR start "rulePieChart"
    // InternalMyDsl.g:1966:1: rulePieChart returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIE' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'legendPosition' ( (lv_legendPosition_6_0= rulePositionOptions ) ) )? otherlv_7= 'data' this_EQUALS_8= RULE_EQUALS this_LIST_START_9= RULE_LIST_START ( (lv_data_10_0= ruleData ) ) (this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) ) )* this_LIST_END_13= RULE_LIST_END otherlv_14= 'labels' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_labels_17_0= ruleLabel ) ) (this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) ) )* this_LIST_END_20= RULE_LIST_END this_OBJECT_END_21= RULE_OBJECT_END ) ;
    public final EObject rulePieChart() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_EQUALS_8=null;
        Token this_LIST_START_9=null;
        Token this_COMA_11=null;
        Token this_LIST_END_13=null;
        Token otherlv_14=null;
        Token this_EQUALS_15=null;
        Token this_LIST_START_16=null;
        Token this_COMA_18=null;
        Token this_LIST_END_20=null;
        Token this_OBJECT_END_21=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_title_4_0 = null;

        Enumerator lv_legendPosition_6_0 = null;

        EObject lv_data_10_0 = null;

        EObject lv_data_12_0 = null;

        EObject lv_labels_17_0 = null;

        EObject lv_labels_19_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1972:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIE' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'legendPosition' ( (lv_legendPosition_6_0= rulePositionOptions ) ) )? otherlv_7= 'data' this_EQUALS_8= RULE_EQUALS this_LIST_START_9= RULE_LIST_START ( (lv_data_10_0= ruleData ) ) (this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) ) )* this_LIST_END_13= RULE_LIST_END otherlv_14= 'labels' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_labels_17_0= ruleLabel ) ) (this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) ) )* this_LIST_END_20= RULE_LIST_END this_OBJECT_END_21= RULE_OBJECT_END ) )
            // InternalMyDsl.g:1973:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIE' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'legendPosition' ( (lv_legendPosition_6_0= rulePositionOptions ) ) )? otherlv_7= 'data' this_EQUALS_8= RULE_EQUALS this_LIST_START_9= RULE_LIST_START ( (lv_data_10_0= ruleData ) ) (this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) ) )* this_LIST_END_13= RULE_LIST_END otherlv_14= 'labels' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_labels_17_0= ruleLabel ) ) (this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) ) )* this_LIST_END_20= RULE_LIST_END this_OBJECT_END_21= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:1973:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIE' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'legendPosition' ( (lv_legendPosition_6_0= rulePositionOptions ) ) )? otherlv_7= 'data' this_EQUALS_8= RULE_EQUALS this_LIST_START_9= RULE_LIST_START ( (lv_data_10_0= ruleData ) ) (this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) ) )* this_LIST_END_13= RULE_LIST_END otherlv_14= 'labels' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_labels_17_0= ruleLabel ) ) (this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) ) )* this_LIST_END_20= RULE_LIST_END this_OBJECT_END_21= RULE_OBJECT_END )
            // InternalMyDsl.g:1974:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIE' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'legendPosition' ( (lv_legendPosition_6_0= rulePositionOptions ) ) )? otherlv_7= 'data' this_EQUALS_8= RULE_EQUALS this_LIST_START_9= RULE_LIST_START ( (lv_data_10_0= ruleData ) ) (this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) ) )* this_LIST_END_13= RULE_LIST_END otherlv_14= 'labels' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_labels_17_0= ruleLabel ) ) (this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) ) )* this_LIST_END_20= RULE_LIST_END this_OBJECT_END_21= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_47); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getPieChartAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPieChartAccess().getPIEKeyword_1());
            		
            // InternalMyDsl.g:1982:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1983:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1983:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1984:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPieChartAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_48);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieChartRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2001:3: (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==24) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2002:4: otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPieChartAccess().getTitleKeyword_3_0());
                    			
                    // InternalMyDsl.g:2006:4: ( (lv_title_4_0= ruleEString ) )
                    // InternalMyDsl.g:2007:5: (lv_title_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:2007:5: (lv_title_4_0= ruleEString )
                    // InternalMyDsl.g:2008:6: lv_title_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPieChartAccess().getTitleEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_title_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPieChartRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2026:3: (otherlv_5= 'legendPosition' ( (lv_legendPosition_6_0= rulePositionOptions ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:2027:4: otherlv_5= 'legendPosition' ( (lv_legendPosition_6_0= rulePositionOptions ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getPieChartAccess().getLegendPositionKeyword_4_0());
                    			
                    // InternalMyDsl.g:2031:4: ( (lv_legendPosition_6_0= rulePositionOptions ) )
                    // InternalMyDsl.g:2032:5: (lv_legendPosition_6_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:2032:5: (lv_legendPosition_6_0= rulePositionOptions )
                    // InternalMyDsl.g:2033:6: lv_legendPosition_6_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getPieChartAccess().getLegendPositionPositionOptionsEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_legendPosition_6_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPieChartRule());
                    						}
                    						set(
                    							current,
                    							"legendPosition",
                    							lv_legendPosition_6_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getPieChartAccess().getDataKeyword_5());
            		
            this_EQUALS_8=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_8, grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_6());
            		
            this_LIST_START_9=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_9, grammarAccess.getPieChartAccess().getLIST_STARTTerminalRuleCall_7());
            		
            // InternalMyDsl.g:2063:3: ( (lv_data_10_0= ruleData ) )
            // InternalMyDsl.g:2064:4: (lv_data_10_0= ruleData )
            {
            // InternalMyDsl.g:2064:4: (lv_data_10_0= ruleData )
            // InternalMyDsl.g:2065:5: lv_data_10_0= ruleData
            {

            					newCompositeNode(grammarAccess.getPieChartAccess().getDataDataParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_10_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieChartRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_10_0,
            						"org.xtext.example.mydsl.MyDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2082:3: (this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_COMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMyDsl.g:2083:4: this_COMA_11= RULE_COMA ( (lv_data_12_0= ruleData ) )
            	    {
            	    this_COMA_11=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_11, grammarAccess.getPieChartAccess().getCOMATerminalRuleCall_9_0());
            	    			
            	    // InternalMyDsl.g:2087:4: ( (lv_data_12_0= ruleData ) )
            	    // InternalMyDsl.g:2088:5: (lv_data_12_0= ruleData )
            	    {
            	    // InternalMyDsl.g:2088:5: (lv_data_12_0= ruleData )
            	    // InternalMyDsl.g:2089:6: lv_data_12_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getPieChartAccess().getDataDataParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_12_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPieChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_12_0,
            	    							"org.xtext.example.mydsl.MyDsl.Data");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            this_LIST_END_13=(Token)match(input,RULE_LIST_END,FOLLOW_37); 

            			newLeafNode(this_LIST_END_13, grammarAccess.getPieChartAccess().getLIST_ENDTerminalRuleCall_10());
            		
            otherlv_14=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getPieChartAccess().getLabelsKeyword_11());
            		
            this_EQUALS_15=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_15, grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_12());
            		
            this_LIST_START_16=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_16, grammarAccess.getPieChartAccess().getLIST_STARTTerminalRuleCall_13());
            		
            // InternalMyDsl.g:2123:3: ( (lv_labels_17_0= ruleLabel ) )
            // InternalMyDsl.g:2124:4: (lv_labels_17_0= ruleLabel )
            {
            // InternalMyDsl.g:2124:4: (lv_labels_17_0= ruleLabel )
            // InternalMyDsl.g:2125:5: lv_labels_17_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getPieChartAccess().getLabelsLabelParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_9);
            lv_labels_17_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieChartRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_17_0,
            						"org.xtext.example.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2142:3: (this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_COMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyDsl.g:2143:4: this_COMA_18= RULE_COMA ( (lv_labels_19_0= ruleLabel ) )
            	    {
            	    this_COMA_18=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_18, grammarAccess.getPieChartAccess().getCOMATerminalRuleCall_15_0());
            	    			
            	    // InternalMyDsl.g:2147:4: ( (lv_labels_19_0= ruleLabel ) )
            	    // InternalMyDsl.g:2148:5: (lv_labels_19_0= ruleLabel )
            	    {
            	    // InternalMyDsl.g:2148:5: (lv_labels_19_0= ruleLabel )
            	    // InternalMyDsl.g:2149:6: lv_labels_19_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getPieChartAccess().getLabelsLabelParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_labels_19_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPieChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_19_0,
            	    							"org.xtext.example.mydsl.MyDsl.Label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            this_LIST_END_20=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_20, grammarAccess.getPieChartAccess().getLIST_ENDTerminalRuleCall_16());
            		
            this_OBJECT_END_21=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_21, grammarAccess.getPieChartAccess().getOBJECT_ENDTerminalRuleCall_17());
            		

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
    // $ANTLR end "rulePieChart"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:2179:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:2179:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:2180:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:2186:1: ruleAction returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'columnTitle' ( (lv_columnTitle_4_0= ruleEString ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePositionOptions ) ) )? ( (lv_add_7_0= 'add' ) )? ( (lv_filter_8_0= 'filter' ) )? ( (lv_edit_9_0= 'edit' ) )? ( (lv_delete_10_0= 'delete' ) )? this_OBJECT_END_11= RULE_OBJECT_END ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_add_7_0=null;
        Token lv_filter_8_0=null;
        Token lv_edit_9_0=null;
        Token lv_delete_10_0=null;
        Token this_OBJECT_END_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_columnTitle_4_0 = null;

        Enumerator lv_position_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2192:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'columnTitle' ( (lv_columnTitle_4_0= ruleEString ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePositionOptions ) ) )? ( (lv_add_7_0= 'add' ) )? ( (lv_filter_8_0= 'filter' ) )? ( (lv_edit_9_0= 'edit' ) )? ( (lv_delete_10_0= 'delete' ) )? this_OBJECT_END_11= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2193:2: ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'columnTitle' ( (lv_columnTitle_4_0= ruleEString ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePositionOptions ) ) )? ( (lv_add_7_0= 'add' ) )? ( (lv_filter_8_0= 'filter' ) )? ( (lv_edit_9_0= 'edit' ) )? ( (lv_delete_10_0= 'delete' ) )? this_OBJECT_END_11= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2193:2: ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'columnTitle' ( (lv_columnTitle_4_0= ruleEString ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePositionOptions ) ) )? ( (lv_add_7_0= 'add' ) )? ( (lv_filter_8_0= 'filter' ) )? ( (lv_edit_9_0= 'edit' ) )? ( (lv_delete_10_0= 'delete' ) )? this_OBJECT_END_11= RULE_OBJECT_END )
            // InternalMyDsl.g:2194:3: () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'columnTitle' ( (lv_columnTitle_4_0= ruleEString ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePositionOptions ) ) )? ( (lv_add_7_0= 'add' ) )? ( (lv_filter_8_0= 'filter' ) )? ( (lv_edit_9_0= 'edit' ) )? ( (lv_delete_10_0= 'delete' ) )? this_OBJECT_END_11= RULE_OBJECT_END
            {
            // InternalMyDsl.g:2194:3: ()
            // InternalMyDsl.g:2195:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getActionAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            // InternalMyDsl.g:2205:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2206:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2206:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2207:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_50);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2224:3: (otherlv_3= 'columnTitle' ( (lv_columnTitle_4_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:2225:4: otherlv_3= 'columnTitle' ( (lv_columnTitle_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getColumnTitleKeyword_3_0());
                    			
                    // InternalMyDsl.g:2229:4: ( (lv_columnTitle_4_0= ruleEString ) )
                    // InternalMyDsl.g:2230:5: (lv_columnTitle_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:2230:5: (lv_columnTitle_4_0= ruleEString )
                    // InternalMyDsl.g:2231:6: lv_columnTitle_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getColumnTitleEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_columnTitle_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"columnTitle",
                    							lv_columnTitle_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2249:3: (otherlv_5= 'position' ( (lv_position_6_0= rulePositionOptions ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2250:4: otherlv_5= 'position' ( (lv_position_6_0= rulePositionOptions ) )
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getPositionKeyword_4_0());
                    			
                    // InternalMyDsl.g:2254:4: ( (lv_position_6_0= rulePositionOptions ) )
                    // InternalMyDsl.g:2255:5: (lv_position_6_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:2255:5: (lv_position_6_0= rulePositionOptions )
                    // InternalMyDsl.g:2256:6: lv_position_6_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getPositionPositionOptionsEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_position_6_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_6_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2274:3: ( (lv_add_7_0= 'add' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2275:4: (lv_add_7_0= 'add' )
                    {
                    // InternalMyDsl.g:2275:4: (lv_add_7_0= 'add' )
                    // InternalMyDsl.g:2276:5: lv_add_7_0= 'add'
                    {
                    lv_add_7_0=(Token)match(input,28,FOLLOW_53); 

                    					newLeafNode(lv_add_7_0, grammarAccess.getActionAccess().getAddAddKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionRule());
                    					}
                    					setWithLastConsumed(current, "add", true, "add");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2288:3: ( (lv_filter_8_0= 'filter' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2289:4: (lv_filter_8_0= 'filter' )
                    {
                    // InternalMyDsl.g:2289:4: (lv_filter_8_0= 'filter' )
                    // InternalMyDsl.g:2290:5: lv_filter_8_0= 'filter'
                    {
                    lv_filter_8_0=(Token)match(input,48,FOLLOW_54); 

                    					newLeafNode(lv_filter_8_0, grammarAccess.getActionAccess().getFilterFilterKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionRule());
                    					}
                    					setWithLastConsumed(current, "filter", true, "filter");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2302:3: ( (lv_edit_9_0= 'edit' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2303:4: (lv_edit_9_0= 'edit' )
                    {
                    // InternalMyDsl.g:2303:4: (lv_edit_9_0= 'edit' )
                    // InternalMyDsl.g:2304:5: lv_edit_9_0= 'edit'
                    {
                    lv_edit_9_0=(Token)match(input,49,FOLLOW_55); 

                    					newLeafNode(lv_edit_9_0, grammarAccess.getActionAccess().getEditEditKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionRule());
                    					}
                    					setWithLastConsumed(current, "edit", true, "edit");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2316:3: ( (lv_delete_10_0= 'delete' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==50) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:2317:4: (lv_delete_10_0= 'delete' )
                    {
                    // InternalMyDsl.g:2317:4: (lv_delete_10_0= 'delete' )
                    // InternalMyDsl.g:2318:5: lv_delete_10_0= 'delete'
                    {
                    lv_delete_10_0=(Token)match(input,50,FOLLOW_11); 

                    					newLeafNode(lv_delete_10_0, grammarAccess.getActionAccess().getDeleteDeleteKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionRule());
                    					}
                    					setWithLastConsumed(current, "delete", true, "delete");
                    				

                    }


                    }
                    break;

            }

            this_OBJECT_END_11=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_11, grammarAccess.getActionAccess().getOBJECT_ENDTerminalRuleCall_9());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleColumn"
    // InternalMyDsl.g:2338:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMyDsl.g:2338:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMyDsl.g:2339:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMyDsl.g:2345:1: ruleColumn returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'source' ( ( ruleEString ) ) )? ( (lv_filter_7_0= 'filter' ) )? ( (lv_editable_8_0= 'editable' ) )? this_OBJECT_END_9= RULE_OBJECT_END ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_filter_7_0=null;
        Token lv_editable_8_0=null;
        Token this_OBJECT_END_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_title_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2351:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'source' ( ( ruleEString ) ) )? ( (lv_filter_7_0= 'filter' ) )? ( (lv_editable_8_0= 'editable' ) )? this_OBJECT_END_9= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2352:2: ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'source' ( ( ruleEString ) ) )? ( (lv_filter_7_0= 'filter' ) )? ( (lv_editable_8_0= 'editable' ) )? this_OBJECT_END_9= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2352:2: ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'source' ( ( ruleEString ) ) )? ( (lv_filter_7_0= 'filter' ) )? ( (lv_editable_8_0= 'editable' ) )? this_OBJECT_END_9= RULE_OBJECT_END )
            // InternalMyDsl.g:2353:3: () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'source' ( ( ruleEString ) ) )? ( (lv_filter_7_0= 'filter' ) )? ( (lv_editable_8_0= 'editable' ) )? this_OBJECT_END_9= RULE_OBJECT_END
            {
            // InternalMyDsl.g:2353:3: ()
            // InternalMyDsl.g:2354:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getColumnAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            // InternalMyDsl.g:2364:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2365:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2365:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2366:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_56);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2383:3: (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==24) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:2384:4: otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getTitleKeyword_3_0());
                    			
                    // InternalMyDsl.g:2388:4: ( (lv_title_4_0= ruleEString ) )
                    // InternalMyDsl.g:2389:5: (lv_title_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:2389:5: (lv_title_4_0= ruleEString )
                    // InternalMyDsl.g:2390:6: lv_title_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getTitleEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_title_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2408:3: (otherlv_5= 'source' ( ( ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:2409:4: otherlv_5= 'source' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getColumnAccess().getSourceKeyword_4_0());
                    			
                    // InternalMyDsl.g:2413:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2414:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2414:5: ( ruleEString )
                    // InternalMyDsl.g:2415:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getColumnAccess().getSourceCollectionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2430:3: ( (lv_filter_7_0= 'filter' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==48) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:2431:4: (lv_filter_7_0= 'filter' )
                    {
                    // InternalMyDsl.g:2431:4: (lv_filter_7_0= 'filter' )
                    // InternalMyDsl.g:2432:5: lv_filter_7_0= 'filter'
                    {
                    lv_filter_7_0=(Token)match(input,48,FOLLOW_59); 

                    					newLeafNode(lv_filter_7_0, grammarAccess.getColumnAccess().getFilterFilterKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnRule());
                    					}
                    					setWithLastConsumed(current, "filter", true, "filter");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2444:3: ( (lv_editable_8_0= 'editable' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==52) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2445:4: (lv_editable_8_0= 'editable' )
                    {
                    // InternalMyDsl.g:2445:4: (lv_editable_8_0= 'editable' )
                    // InternalMyDsl.g:2446:5: lv_editable_8_0= 'editable'
                    {
                    lv_editable_8_0=(Token)match(input,52,FOLLOW_11); 

                    					newLeafNode(lv_editable_8_0, grammarAccess.getColumnAccess().getEditableEditableKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnRule());
                    					}
                    					setWithLastConsumed(current, "editable", true, "editable");
                    				

                    }


                    }
                    break;

            }

            this_OBJECT_END_9=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_9, grammarAccess.getColumnAccess().getOBJECT_ENDTerminalRuleCall_7());
            		

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleData"
    // InternalMyDsl.g:2466:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalMyDsl.g:2466:45: (iv_ruleData= ruleData EOF )
            // InternalMyDsl.g:2467:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalMyDsl.g:2473:1: ruleData returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'category' ( (lv_category_3_0= ruleEString ) ) )? (otherlv_4= 'borderColor' ( (lv_borderColor_5_0= ruleColors ) ) )? (otherlv_6= 'backgroundColor' ( (lv_backgroundColor_7_0= ruleColors ) ) )? (otherlv_8= 'borderDash' ( (lv_borderDash_9_0= ruleEInt ) ) )? ( (lv_fill_10_0= 'fill' ) )? otherlv_11= 'data' otherlv_12= '(' ( ( ruleEString ) ) (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )* otherlv_16= ')' this_OBJECT_END_17= RULE_OBJECT_END ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_fill_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token this_COMA_14=null;
        Token otherlv_16=null;
        Token this_OBJECT_END_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_category_3_0 = null;

        Enumerator lv_borderColor_5_0 = null;

        Enumerator lv_backgroundColor_7_0 = null;

        AntlrDatatypeRuleToken lv_borderDash_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2479:2: ( (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'category' ( (lv_category_3_0= ruleEString ) ) )? (otherlv_4= 'borderColor' ( (lv_borderColor_5_0= ruleColors ) ) )? (otherlv_6= 'backgroundColor' ( (lv_backgroundColor_7_0= ruleColors ) ) )? (otherlv_8= 'borderDash' ( (lv_borderDash_9_0= ruleEInt ) ) )? ( (lv_fill_10_0= 'fill' ) )? otherlv_11= 'data' otherlv_12= '(' ( ( ruleEString ) ) (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )* otherlv_16= ')' this_OBJECT_END_17= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2480:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'category' ( (lv_category_3_0= ruleEString ) ) )? (otherlv_4= 'borderColor' ( (lv_borderColor_5_0= ruleColors ) ) )? (otherlv_6= 'backgroundColor' ( (lv_backgroundColor_7_0= ruleColors ) ) )? (otherlv_8= 'borderDash' ( (lv_borderDash_9_0= ruleEInt ) ) )? ( (lv_fill_10_0= 'fill' ) )? otherlv_11= 'data' otherlv_12= '(' ( ( ruleEString ) ) (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )* otherlv_16= ')' this_OBJECT_END_17= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2480:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'category' ( (lv_category_3_0= ruleEString ) ) )? (otherlv_4= 'borderColor' ( (lv_borderColor_5_0= ruleColors ) ) )? (otherlv_6= 'backgroundColor' ( (lv_backgroundColor_7_0= ruleColors ) ) )? (otherlv_8= 'borderDash' ( (lv_borderDash_9_0= ruleEInt ) ) )? ( (lv_fill_10_0= 'fill' ) )? otherlv_11= 'data' otherlv_12= '(' ( ( ruleEString ) ) (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )* otherlv_16= ')' this_OBJECT_END_17= RULE_OBJECT_END )
            // InternalMyDsl.g:2481:3: this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'category' ( (lv_category_3_0= ruleEString ) ) )? (otherlv_4= 'borderColor' ( (lv_borderColor_5_0= ruleColors ) ) )? (otherlv_6= 'backgroundColor' ( (lv_backgroundColor_7_0= ruleColors ) ) )? (otherlv_8= 'borderDash' ( (lv_borderDash_9_0= ruleEInt ) ) )? ( (lv_fill_10_0= 'fill' ) )? otherlv_11= 'data' otherlv_12= '(' ( ( ruleEString ) ) (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )* otherlv_16= ')' this_OBJECT_END_17= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getDataAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            // InternalMyDsl.g:2485:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2486:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2486:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2487:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_60);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2504:3: (otherlv_2= 'category' ( (lv_category_3_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==53) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:2505:4: otherlv_2= 'category' ( (lv_category_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataAccess().getCategoryKeyword_2_0());
                    			
                    // InternalMyDsl.g:2509:4: ( (lv_category_3_0= ruleEString ) )
                    // InternalMyDsl.g:2510:5: (lv_category_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:2510:5: (lv_category_3_0= ruleEString )
                    // InternalMyDsl.g:2511:6: lv_category_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getCategoryEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_category_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						set(
                    							current,
                    							"category",
                    							lv_category_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2529:3: (otherlv_4= 'borderColor' ( (lv_borderColor_5_0= ruleColors ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==54) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:2530:4: otherlv_4= 'borderColor' ( (lv_borderColor_5_0= ruleColors ) )
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_62); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataAccess().getBorderColorKeyword_3_0());
                    			
                    // InternalMyDsl.g:2534:4: ( (lv_borderColor_5_0= ruleColors ) )
                    // InternalMyDsl.g:2535:5: (lv_borderColor_5_0= ruleColors )
                    {
                    // InternalMyDsl.g:2535:5: (lv_borderColor_5_0= ruleColors )
                    // InternalMyDsl.g:2536:6: lv_borderColor_5_0= ruleColors
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getBorderColorColorsEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_borderColor_5_0=ruleColors();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						set(
                    							current,
                    							"borderColor",
                    							lv_borderColor_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Colors");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2554:3: (otherlv_6= 'backgroundColor' ( (lv_backgroundColor_7_0= ruleColors ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==55) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:2555:4: otherlv_6= 'backgroundColor' ( (lv_backgroundColor_7_0= ruleColors ) )
                    {
                    otherlv_6=(Token)match(input,55,FOLLOW_62); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataAccess().getBackgroundColorKeyword_4_0());
                    			
                    // InternalMyDsl.g:2559:4: ( (lv_backgroundColor_7_0= ruleColors ) )
                    // InternalMyDsl.g:2560:5: (lv_backgroundColor_7_0= ruleColors )
                    {
                    // InternalMyDsl.g:2560:5: (lv_backgroundColor_7_0= ruleColors )
                    // InternalMyDsl.g:2561:6: lv_backgroundColor_7_0= ruleColors
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getBackgroundColorColorsEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_backgroundColor_7_0=ruleColors();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						set(
                    							current,
                    							"backgroundColor",
                    							lv_backgroundColor_7_0,
                    							"org.xtext.example.mydsl.MyDsl.Colors");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2579:3: (otherlv_8= 'borderDash' ( (lv_borderDash_9_0= ruleEInt ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==56) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:2580:4: otherlv_8= 'borderDash' ( (lv_borderDash_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,56,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getDataAccess().getBorderDashKeyword_5_0());
                    			
                    // InternalMyDsl.g:2584:4: ( (lv_borderDash_9_0= ruleEInt ) )
                    // InternalMyDsl.g:2585:5: (lv_borderDash_9_0= ruleEInt )
                    {
                    // InternalMyDsl.g:2585:5: (lv_borderDash_9_0= ruleEInt )
                    // InternalMyDsl.g:2586:6: lv_borderDash_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getBorderDashEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_borderDash_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						set(
                    							current,
                    							"borderDash",
                    							lv_borderDash_9_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2604:3: ( (lv_fill_10_0= 'fill' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==57) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:2605:4: (lv_fill_10_0= 'fill' )
                    {
                    // InternalMyDsl.g:2605:4: (lv_fill_10_0= 'fill' )
                    // InternalMyDsl.g:2606:5: lv_fill_10_0= 'fill'
                    {
                    lv_fill_10_0=(Token)match(input,57,FOLLOW_36); 

                    					newLeafNode(lv_fill_10_0, grammarAccess.getDataAccess().getFillFillKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataRule());
                    					}
                    					setWithLastConsumed(current, "fill", true, "fill");
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,41,FOLLOW_66); 

            			newLeafNode(otherlv_11, grammarAccess.getDataAccess().getDataKeyword_7());
            		
            otherlv_12=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getDataAccess().getLeftParenthesisKeyword_8());
            		
            // InternalMyDsl.g:2626:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2627:4: ( ruleEString )
            {
            // InternalMyDsl.g:2627:4: ( ruleEString )
            // InternalMyDsl.g:2628:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataAccess().getDataCollectionCrossReference_9_0());
            				
            pushFollow(FOLLOW_67);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2642:3: (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_COMA) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMyDsl.g:2643:4: this_COMA_14= RULE_COMA ( ( ruleEString ) )
            	    {
            	    this_COMA_14=(Token)match(input,RULE_COMA,FOLLOW_3); 

            	    				newLeafNode(this_COMA_14, grammarAccess.getDataAccess().getCOMATerminalRuleCall_10_0());
            	    			
            	    // InternalMyDsl.g:2647:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:2648:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:2648:5: ( ruleEString )
            	    // InternalMyDsl.g:2649:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDataRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDataAccess().getDataCollectionCrossReference_10_1_0());
            	    					
            	    pushFollow(FOLLOW_67);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_16=(Token)match(input,59,FOLLOW_11); 

            			newLeafNode(otherlv_16, grammarAccess.getDataAccess().getRightParenthesisKeyword_11());
            		
            this_OBJECT_END_17=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_17, grammarAccess.getDataAccess().getOBJECT_ENDTerminalRuleCall_12());
            		

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleLabel"
    // InternalMyDsl.g:2676:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalMyDsl.g:2676:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDsl.g:2677:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMyDsl.g:2683:1: ruleLabel returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) this_OBJECT_END_3= RULE_OBJECT_END ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token this_OBJECT_END_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2689:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) this_OBJECT_END_3= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2690:2: ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) this_OBJECT_END_3= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2690:2: ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) this_OBJECT_END_3= RULE_OBJECT_END )
            // InternalMyDsl.g:2691:3: () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) this_OBJECT_END_3= RULE_OBJECT_END
            {
            // InternalMyDsl.g:2691:3: ()
            // InternalMyDsl.g:2692:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelAccess().getLabelAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getLabelAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            // InternalMyDsl.g:2702:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2703:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2703:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2704:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLabelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_OBJECT_END_3=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_3, grammarAccess.getLabelAccess().getOBJECT_ENDTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleDBServer"
    // InternalMyDsl.g:2729:1: entryRuleDBServer returns [EObject current=null] : iv_ruleDBServer= ruleDBServer EOF ;
    public final EObject entryRuleDBServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBServer = null;


        try {
            // InternalMyDsl.g:2729:49: (iv_ruleDBServer= ruleDBServer EOF )
            // InternalMyDsl.g:2730:2: iv_ruleDBServer= ruleDBServer EOF
            {
             newCompositeNode(grammarAccess.getDBServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDBServer=ruleDBServer();

            state._fsp--;

             current =iv_ruleDBServer; 
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
    // $ANTLR end "entryRuleDBServer"


    // $ANTLR start "ruleDBServer"
    // InternalMyDsl.g:2736:1: ruleDBServer returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'systemManager' ( (lv_systemManager_3_0= ruleDBSystem ) ) )? (otherlv_4= 'token' ( (lv_token_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? otherlv_8= 'relatedCollections' this_EQUALS_9= RULE_EQUALS this_LIST_START_10= RULE_LIST_START ( (lv_relatedCollections_11_0= ruleCollection ) ) (this_COMA_12= RULE_COMA ( (lv_relatedCollections_13_0= ruleCollection ) ) )* this_LIST_END_14= RULE_LIST_END this_OBJECT_END_15= RULE_OBJECT_END ) ;
    public final EObject ruleDBServer() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_EQUALS_9=null;
        Token this_LIST_START_10=null;
        Token this_COMA_12=null;
        Token this_LIST_END_14=null;
        Token this_OBJECT_END_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_systemManager_3_0 = null;

        AntlrDatatypeRuleToken lv_token_5_0 = null;

        AntlrDatatypeRuleToken lv_password_7_0 = null;

        EObject lv_relatedCollections_11_0 = null;

        EObject lv_relatedCollections_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2742:2: ( (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'systemManager' ( (lv_systemManager_3_0= ruleDBSystem ) ) )? (otherlv_4= 'token' ( (lv_token_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? otherlv_8= 'relatedCollections' this_EQUALS_9= RULE_EQUALS this_LIST_START_10= RULE_LIST_START ( (lv_relatedCollections_11_0= ruleCollection ) ) (this_COMA_12= RULE_COMA ( (lv_relatedCollections_13_0= ruleCollection ) ) )* this_LIST_END_14= RULE_LIST_END this_OBJECT_END_15= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2743:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'systemManager' ( (lv_systemManager_3_0= ruleDBSystem ) ) )? (otherlv_4= 'token' ( (lv_token_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? otherlv_8= 'relatedCollections' this_EQUALS_9= RULE_EQUALS this_LIST_START_10= RULE_LIST_START ( (lv_relatedCollections_11_0= ruleCollection ) ) (this_COMA_12= RULE_COMA ( (lv_relatedCollections_13_0= ruleCollection ) ) )* this_LIST_END_14= RULE_LIST_END this_OBJECT_END_15= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2743:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'systemManager' ( (lv_systemManager_3_0= ruleDBSystem ) ) )? (otherlv_4= 'token' ( (lv_token_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? otherlv_8= 'relatedCollections' this_EQUALS_9= RULE_EQUALS this_LIST_START_10= RULE_LIST_START ( (lv_relatedCollections_11_0= ruleCollection ) ) (this_COMA_12= RULE_COMA ( (lv_relatedCollections_13_0= ruleCollection ) ) )* this_LIST_END_14= RULE_LIST_END this_OBJECT_END_15= RULE_OBJECT_END )
            // InternalMyDsl.g:2744:3: this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'systemManager' ( (lv_systemManager_3_0= ruleDBSystem ) ) )? (otherlv_4= 'token' ( (lv_token_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? otherlv_8= 'relatedCollections' this_EQUALS_9= RULE_EQUALS this_LIST_START_10= RULE_LIST_START ( (lv_relatedCollections_11_0= ruleCollection ) ) (this_COMA_12= RULE_COMA ( (lv_relatedCollections_13_0= ruleCollection ) ) )* this_LIST_END_14= RULE_LIST_END this_OBJECT_END_15= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getDBServerAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            // InternalMyDsl.g:2748:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2749:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2749:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2750:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDBServerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_68);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDBServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2767:3: (otherlv_2= 'systemManager' ( (lv_systemManager_3_0= ruleDBSystem ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==60) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:2768:4: otherlv_2= 'systemManager' ( (lv_systemManager_3_0= ruleDBSystem ) )
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_69); 

                    				newLeafNode(otherlv_2, grammarAccess.getDBServerAccess().getSystemManagerKeyword_2_0());
                    			
                    // InternalMyDsl.g:2772:4: ( (lv_systemManager_3_0= ruleDBSystem ) )
                    // InternalMyDsl.g:2773:5: (lv_systemManager_3_0= ruleDBSystem )
                    {
                    // InternalMyDsl.g:2773:5: (lv_systemManager_3_0= ruleDBSystem )
                    // InternalMyDsl.g:2774:6: lv_systemManager_3_0= ruleDBSystem
                    {

                    						newCompositeNode(grammarAccess.getDBServerAccess().getSystemManagerDBSystemEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    lv_systemManager_3_0=ruleDBSystem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDBServerRule());
                    						}
                    						set(
                    							current,
                    							"systemManager",
                    							lv_systemManager_3_0,
                    							"org.xtext.example.mydsl.MyDsl.DBSystem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2792:3: (otherlv_4= 'token' ( (lv_token_5_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==61) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:2793:4: otherlv_4= 'token' ( (lv_token_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getDBServerAccess().getTokenKeyword_3_0());
                    			
                    // InternalMyDsl.g:2797:4: ( (lv_token_5_0= ruleEString ) )
                    // InternalMyDsl.g:2798:5: (lv_token_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:2798:5: (lv_token_5_0= ruleEString )
                    // InternalMyDsl.g:2799:6: lv_token_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDBServerAccess().getTokenEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_token_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDBServerRule());
                    						}
                    						set(
                    							current,
                    							"token",
                    							lv_token_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2817:3: (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==62) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:2818:4: otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getDBServerAccess().getPasswordKeyword_4_0());
                    			
                    // InternalMyDsl.g:2822:4: ( (lv_password_7_0= ruleEString ) )
                    // InternalMyDsl.g:2823:5: (lv_password_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:2823:5: (lv_password_7_0= ruleEString )
                    // InternalMyDsl.g:2824:6: lv_password_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDBServerAccess().getPasswordEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_password_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDBServerRule());
                    						}
                    						set(
                    							current,
                    							"password",
                    							lv_password_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,63,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getDBServerAccess().getRelatedCollectionsKeyword_5());
            		
            this_EQUALS_9=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_9, grammarAccess.getDBServerAccess().getEQUALSTerminalRuleCall_6());
            		
            this_LIST_START_10=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_10, grammarAccess.getDBServerAccess().getLIST_STARTTerminalRuleCall_7());
            		
            // InternalMyDsl.g:2854:3: ( (lv_relatedCollections_11_0= ruleCollection ) )
            // InternalMyDsl.g:2855:4: (lv_relatedCollections_11_0= ruleCollection )
            {
            // InternalMyDsl.g:2855:4: (lv_relatedCollections_11_0= ruleCollection )
            // InternalMyDsl.g:2856:5: lv_relatedCollections_11_0= ruleCollection
            {

            					newCompositeNode(grammarAccess.getDBServerAccess().getRelatedCollectionsCollectionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_relatedCollections_11_0=ruleCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDBServerRule());
            					}
            					add(
            						current,
            						"relatedCollections",
            						lv_relatedCollections_11_0,
            						"org.xtext.example.mydsl.MyDsl.Collection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2873:3: (this_COMA_12= RULE_COMA ( (lv_relatedCollections_13_0= ruleCollection ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_COMA) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalMyDsl.g:2874:4: this_COMA_12= RULE_COMA ( (lv_relatedCollections_13_0= ruleCollection ) )
            	    {
            	    this_COMA_12=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_12, grammarAccess.getDBServerAccess().getCOMATerminalRuleCall_9_0());
            	    			
            	    // InternalMyDsl.g:2878:4: ( (lv_relatedCollections_13_0= ruleCollection ) )
            	    // InternalMyDsl.g:2879:5: (lv_relatedCollections_13_0= ruleCollection )
            	    {
            	    // InternalMyDsl.g:2879:5: (lv_relatedCollections_13_0= ruleCollection )
            	    // InternalMyDsl.g:2880:6: lv_relatedCollections_13_0= ruleCollection
            	    {

            	    						newCompositeNode(grammarAccess.getDBServerAccess().getRelatedCollectionsCollectionParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_relatedCollections_13_0=ruleCollection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDBServerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relatedCollections",
            	    							lv_relatedCollections_13_0,
            	    							"org.xtext.example.mydsl.MyDsl.Collection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            this_LIST_END_14=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_14, grammarAccess.getDBServerAccess().getLIST_ENDTerminalRuleCall_10());
            		
            this_OBJECT_END_15=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_15, grammarAccess.getDBServerAccess().getOBJECT_ENDTerminalRuleCall_11());
            		

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
    // $ANTLR end "ruleDBServer"


    // $ANTLR start "entryRuleCollection"
    // InternalMyDsl.g:2910:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalMyDsl.g:2910:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalMyDsl.g:2911:2: iv_ruleCollection= ruleCollection EOF
            {
             newCompositeNode(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollection=ruleCollection();

            state._fsp--;

             current =iv_ruleCollection; 
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
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalMyDsl.g:2917:1: ruleCollection returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'documents' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_documents_5_0= ruleDocument ) ) (this_COMA_6= RULE_COMA ( (lv_documents_7_0= ruleDocument ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_LIST_START_4=null;
        Token this_COMA_6=null;
        Token this_LIST_END_8=null;
        Token this_OBJECT_END_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_documents_5_0 = null;

        EObject lv_documents_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2923:2: ( (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'documents' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_documents_5_0= ruleDocument ) ) (this_COMA_6= RULE_COMA ( (lv_documents_7_0= ruleDocument ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2924:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'documents' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_documents_5_0= ruleDocument ) ) (this_COMA_6= RULE_COMA ( (lv_documents_7_0= ruleDocument ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2924:2: (this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'documents' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_documents_5_0= ruleDocument ) ) (this_COMA_6= RULE_COMA ( (lv_documents_7_0= ruleDocument ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END )
            // InternalMyDsl.g:2925:3: this_OBJECT_START_0= RULE_OBJECT_START ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'documents' this_EQUALS_3= RULE_EQUALS this_LIST_START_4= RULE_LIST_START ( (lv_documents_5_0= ruleDocument ) ) (this_COMA_6= RULE_COMA ( (lv_documents_7_0= ruleDocument ) ) )* this_LIST_END_8= RULE_LIST_END this_OBJECT_END_9= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getCollectionAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            // InternalMyDsl.g:2929:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2930:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2930:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2931:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCollectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_73);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,64,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getDocumentsKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getCollectionAccess().getEQUALSTerminalRuleCall_3());
            		
            this_LIST_START_4=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_4, grammarAccess.getCollectionAccess().getLIST_STARTTerminalRuleCall_4());
            		
            // InternalMyDsl.g:2960:3: ( (lv_documents_5_0= ruleDocument ) )
            // InternalMyDsl.g:2961:4: (lv_documents_5_0= ruleDocument )
            {
            // InternalMyDsl.g:2961:4: (lv_documents_5_0= ruleDocument )
            // InternalMyDsl.g:2962:5: lv_documents_5_0= ruleDocument
            {

            					newCompositeNode(grammarAccess.getCollectionAccess().getDocumentsDocumentParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_documents_5_0=ruleDocument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionRule());
            					}
            					add(
            						current,
            						"documents",
            						lv_documents_5_0,
            						"org.xtext.example.mydsl.MyDsl.Document");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2979:3: (this_COMA_6= RULE_COMA ( (lv_documents_7_0= ruleDocument ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_COMA) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalMyDsl.g:2980:4: this_COMA_6= RULE_COMA ( (lv_documents_7_0= ruleDocument ) )
            	    {
            	    this_COMA_6=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_6, grammarAccess.getCollectionAccess().getCOMATerminalRuleCall_6_0());
            	    			
            	    // InternalMyDsl.g:2984:4: ( (lv_documents_7_0= ruleDocument ) )
            	    // InternalMyDsl.g:2985:5: (lv_documents_7_0= ruleDocument )
            	    {
            	    // InternalMyDsl.g:2985:5: (lv_documents_7_0= ruleDocument )
            	    // InternalMyDsl.g:2986:6: lv_documents_7_0= ruleDocument
            	    {

            	    						newCompositeNode(grammarAccess.getCollectionAccess().getDocumentsDocumentParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_documents_7_0=ruleDocument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCollectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"documents",
            	    							lv_documents_7_0,
            	    							"org.xtext.example.mydsl.MyDsl.Document");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            this_LIST_END_8=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_8, grammarAccess.getCollectionAccess().getLIST_ENDTerminalRuleCall_7());
            		
            this_OBJECT_END_9=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_9, grammarAccess.getCollectionAccess().getOBJECT_ENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleDocument"
    // InternalMyDsl.g:3016:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalMyDsl.g:3016:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalMyDsl.g:3017:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalMyDsl.g:3023:1: ruleDocument returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) this_OBJECT_END_3= RULE_OBJECT_END ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token this_OBJECT_END_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3029:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) this_OBJECT_END_3= RULE_OBJECT_END ) )
            // InternalMyDsl.g:3030:2: ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) this_OBJECT_END_3= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:3030:2: ( () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) this_OBJECT_END_3= RULE_OBJECT_END )
            // InternalMyDsl.g:3031:3: () this_OBJECT_START_1= RULE_OBJECT_START ( (lv_name_2_0= ruleEString ) ) this_OBJECT_END_3= RULE_OBJECT_END
            {
            // InternalMyDsl.g:3031:3: ()
            // InternalMyDsl.g:3032:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentAccess().getDocumentAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_3); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getDocumentAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            // InternalMyDsl.g:3042:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:3043:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:3043:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:3044:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDocumentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_OBJECT_END_3=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_3, grammarAccess.getDocumentAccess().getOBJECT_ENDTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleEFloat"
    // InternalMyDsl.g:3069:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalMyDsl.g:3069:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalMyDsl.g:3070:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalMyDsl.g:3076:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3082:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:3083:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:3083:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:3084:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:3084:3: (kw= '-' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==65) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyDsl.g:3085:4: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_74); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3091:3: (this_INT_1= RULE_INT )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_INT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyDsl.g:3092:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_75); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,66,FOLLOW_76); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_77); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyDsl.g:3112:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=67 && LA68_0<=68)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyDsl.g:3113:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:3113:4: (kw= 'E' | kw= 'e' )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==67) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==68) ) {
                        alt66=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalMyDsl.g:3114:5: kw= 'E'
                            {
                            kw=(Token)match(input,67,FOLLOW_17); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3120:5: kw= 'e'
                            {
                            kw=(Token)match(input,68,FOLLOW_17); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:3126:4: (kw= '-' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==65) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalMyDsl.g:3127:5: kw= '-'
                            {
                            kw=(Token)match(input,65,FOLLOW_76); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:3145:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:3145:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:3146:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:3152:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3158:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:3159:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:3159:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_STRING) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_ID) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:3160:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3168:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:3179:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:3179:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:3180:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:3186:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3192:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:3193:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:3193:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:3194:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:3194:3: (kw= '-' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==65) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMyDsl.g:3195:4: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_76); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleDBSystem"
    // InternalMyDsl.g:3212:1: ruleDBSystem returns [Enumerator current=null] : ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'REDIS' ) ) ;
    public final Enumerator ruleDBSystem() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3218:2: ( ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'REDIS' ) ) )
            // InternalMyDsl.g:3219:2: ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'REDIS' ) )
            {
            // InternalMyDsl.g:3219:2: ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'REDIS' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==69) ) {
                alt71=1;
            }
            else if ( (LA71_0==70) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyDsl.g:3220:3: (enumLiteral_0= 'MONGODB' )
                    {
                    // InternalMyDsl.g:3220:3: (enumLiteral_0= 'MONGODB' )
                    // InternalMyDsl.g:3221:4: enumLiteral_0= 'MONGODB'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getDBSystemAccess().getMONGODBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDBSystemAccess().getMONGODBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3228:3: (enumLiteral_1= 'REDIS' )
                    {
                    // InternalMyDsl.g:3228:3: (enumLiteral_1= 'REDIS' )
                    // InternalMyDsl.g:3229:4: enumLiteral_1= 'REDIS'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getDBSystemAccess().getREDISEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDBSystemAccess().getREDISEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleDBSystem"


    // $ANTLR start "ruleColors"
    // InternalMyDsl.g:3239:1: ruleColors returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'gray' ) | (enumLiteral_5= 'yellow' ) | (enumLiteral_6= 'black' ) | (enumLiteral_7= 'cyan' ) | (enumLiteral_8= 'magenta' ) | (enumLiteral_9= 'silver' ) | (enumLiteral_10= 'maroon' ) | (enumLiteral_11= 'olive' ) | (enumLiteral_12= 'purple' ) | (enumLiteral_13= 'teal' ) | (enumLiteral_14= 'navy' ) ) ;
    public final Enumerator ruleColors() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3245:2: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'gray' ) | (enumLiteral_5= 'yellow' ) | (enumLiteral_6= 'black' ) | (enumLiteral_7= 'cyan' ) | (enumLiteral_8= 'magenta' ) | (enumLiteral_9= 'silver' ) | (enumLiteral_10= 'maroon' ) | (enumLiteral_11= 'olive' ) | (enumLiteral_12= 'purple' ) | (enumLiteral_13= 'teal' ) | (enumLiteral_14= 'navy' ) ) )
            // InternalMyDsl.g:3246:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'gray' ) | (enumLiteral_5= 'yellow' ) | (enumLiteral_6= 'black' ) | (enumLiteral_7= 'cyan' ) | (enumLiteral_8= 'magenta' ) | (enumLiteral_9= 'silver' ) | (enumLiteral_10= 'maroon' ) | (enumLiteral_11= 'olive' ) | (enumLiteral_12= 'purple' ) | (enumLiteral_13= 'teal' ) | (enumLiteral_14= 'navy' ) )
            {
            // InternalMyDsl.g:3246:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'gray' ) | (enumLiteral_5= 'yellow' ) | (enumLiteral_6= 'black' ) | (enumLiteral_7= 'cyan' ) | (enumLiteral_8= 'magenta' ) | (enumLiteral_9= 'silver' ) | (enumLiteral_10= 'maroon' ) | (enumLiteral_11= 'olive' ) | (enumLiteral_12= 'purple' ) | (enumLiteral_13= 'teal' ) | (enumLiteral_14= 'navy' ) )
            int alt72=15;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt72=1;
                }
                break;
            case 72:
                {
                alt72=2;
                }
                break;
            case 73:
                {
                alt72=3;
                }
                break;
            case 74:
                {
                alt72=4;
                }
                break;
            case 75:
                {
                alt72=5;
                }
                break;
            case 76:
                {
                alt72=6;
                }
                break;
            case 77:
                {
                alt72=7;
                }
                break;
            case 78:
                {
                alt72=8;
                }
                break;
            case 79:
                {
                alt72=9;
                }
                break;
            case 80:
                {
                alt72=10;
                }
                break;
            case 81:
                {
                alt72=11;
                }
                break;
            case 82:
                {
                alt72=12;
                }
                break;
            case 83:
                {
                alt72=13;
                }
                break;
            case 84:
                {
                alt72=14;
                }
                break;
            case 85:
                {
                alt72=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalMyDsl.g:3247:3: (enumLiteral_0= 'white' )
                    {
                    // InternalMyDsl.g:3247:3: (enumLiteral_0= 'white' )
                    // InternalMyDsl.g:3248:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3255:3: (enumLiteral_1= 'blue' )
                    {
                    // InternalMyDsl.g:3255:3: (enumLiteral_1= 'blue' )
                    // InternalMyDsl.g:3256:4: enumLiteral_1= 'blue'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3263:3: (enumLiteral_2= 'red' )
                    {
                    // InternalMyDsl.g:3263:3: (enumLiteral_2= 'red' )
                    // InternalMyDsl.g:3264:4: enumLiteral_2= 'red'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3271:3: (enumLiteral_3= 'green' )
                    {
                    // InternalMyDsl.g:3271:3: (enumLiteral_3= 'green' )
                    // InternalMyDsl.g:3272:4: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getGreenEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3279:3: (enumLiteral_4= 'gray' )
                    {
                    // InternalMyDsl.g:3279:3: (enumLiteral_4= 'gray' )
                    // InternalMyDsl.g:3280:4: enumLiteral_4= 'gray'
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getGrayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorsAccess().getGrayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3287:3: (enumLiteral_5= 'yellow' )
                    {
                    // InternalMyDsl.g:3287:3: (enumLiteral_5= 'yellow' )
                    // InternalMyDsl.g:3288:4: enumLiteral_5= 'yellow'
                    {
                    enumLiteral_5=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:3295:3: (enumLiteral_6= 'black' )
                    {
                    // InternalMyDsl.g:3295:3: (enumLiteral_6= 'black' )
                    // InternalMyDsl.g:3296:4: enumLiteral_6= 'black'
                    {
                    enumLiteral_6=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:3303:3: (enumLiteral_7= 'cyan' )
                    {
                    // InternalMyDsl.g:3303:3: (enumLiteral_7= 'cyan' )
                    // InternalMyDsl.g:3304:4: enumLiteral_7= 'cyan'
                    {
                    enumLiteral_7=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getCyanEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getColorsAccess().getCyanEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:3311:3: (enumLiteral_8= 'magenta' )
                    {
                    // InternalMyDsl.g:3311:3: (enumLiteral_8= 'magenta' )
                    // InternalMyDsl.g:3312:4: enumLiteral_8= 'magenta'
                    {
                    enumLiteral_8=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getMagentaEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getColorsAccess().getMagentaEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:3319:3: (enumLiteral_9= 'silver' )
                    {
                    // InternalMyDsl.g:3319:3: (enumLiteral_9= 'silver' )
                    // InternalMyDsl.g:3320:4: enumLiteral_9= 'silver'
                    {
                    enumLiteral_9=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getSilverEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getColorsAccess().getSilverEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:3327:3: (enumLiteral_10= 'maroon' )
                    {
                    // InternalMyDsl.g:3327:3: (enumLiteral_10= 'maroon' )
                    // InternalMyDsl.g:3328:4: enumLiteral_10= 'maroon'
                    {
                    enumLiteral_10=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getMaroonEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getColorsAccess().getMaroonEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:3335:3: (enumLiteral_11= 'olive' )
                    {
                    // InternalMyDsl.g:3335:3: (enumLiteral_11= 'olive' )
                    // InternalMyDsl.g:3336:4: enumLiteral_11= 'olive'
                    {
                    enumLiteral_11=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getOliveEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getColorsAccess().getOliveEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:3343:3: (enumLiteral_12= 'purple' )
                    {
                    // InternalMyDsl.g:3343:3: (enumLiteral_12= 'purple' )
                    // InternalMyDsl.g:3344:4: enumLiteral_12= 'purple'
                    {
                    enumLiteral_12=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getPurpleEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getColorsAccess().getPurpleEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:3351:3: (enumLiteral_13= 'teal' )
                    {
                    // InternalMyDsl.g:3351:3: (enumLiteral_13= 'teal' )
                    // InternalMyDsl.g:3352:4: enumLiteral_13= 'teal'
                    {
                    enumLiteral_13=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getTealEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getColorsAccess().getTealEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:3359:3: (enumLiteral_14= 'navy' )
                    {
                    // InternalMyDsl.g:3359:3: (enumLiteral_14= 'navy' )
                    // InternalMyDsl.g:3360:4: enumLiteral_14= 'navy'
                    {
                    enumLiteral_14=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getNavyEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getColorsAccess().getNavyEnumLiteralDeclaration_14());
                    			

                    }


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
    // $ANTLR end "ruleColors"


    // $ANTLR start "rulePositionOptions"
    // InternalMyDsl.g:3370:1: rulePositionOptions returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'top' ) | (enumLiteral_4= 'bottom' ) ) ;
    public final Enumerator rulePositionOptions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3376:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'top' ) | (enumLiteral_4= 'bottom' ) ) )
            // InternalMyDsl.g:3377:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'top' ) | (enumLiteral_4= 'bottom' ) )
            {
            // InternalMyDsl.g:3377:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'top' ) | (enumLiteral_4= 'bottom' ) )
            int alt73=5;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt73=1;
                }
                break;
            case 87:
                {
                alt73=2;
                }
                break;
            case 88:
                {
                alt73=3;
                }
                break;
            case 89:
                {
                alt73=4;
                }
                break;
            case 90:
                {
                alt73=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalMyDsl.g:3378:3: (enumLiteral_0= 'left' )
                    {
                    // InternalMyDsl.g:3378:3: (enumLiteral_0= 'left' )
                    // InternalMyDsl.g:3379:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPositionOptionsAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3386:3: (enumLiteral_1= 'right' )
                    {
                    // InternalMyDsl.g:3386:3: (enumLiteral_1= 'right' )
                    // InternalMyDsl.g:3387:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPositionOptionsAccess().getRightEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3394:3: (enumLiteral_2= 'center' )
                    {
                    // InternalMyDsl.g:3394:3: (enumLiteral_2= 'center' )
                    // InternalMyDsl.g:3395:4: enumLiteral_2= 'center'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getCenterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPositionOptionsAccess().getCenterEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3402:3: (enumLiteral_3= 'top' )
                    {
                    // InternalMyDsl.g:3402:3: (enumLiteral_3= 'top' )
                    // InternalMyDsl.g:3403:4: enumLiteral_3= 'top'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getTopEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPositionOptionsAccess().getTopEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3410:3: (enumLiteral_4= 'bottom' )
                    {
                    // InternalMyDsl.g:3410:3: (enumLiteral_4= 'bottom' )
                    // InternalMyDsl.g:3411:4: enumLiteral_4= 'bottom'
                    {
                    enumLiteral_4=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getBottomEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPositionOptionsAccess().getBottomEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "rulePositionOptions"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\37\uffff";
    static final String dfa_2s = "\1\4\1\13\1\uffff\2\30\1\uffff\1\13\1\uffff\2\31\1\126\4\13\3\uffff\5\43\2\44\2\45\2\46\2\47";
    static final String dfa_3s = "\1\36\1\55\1\uffff\2\35\1\uffff\1\14\1\uffff\2\54\1\132\4\14\3\uffff\5\54\10\53";
    static final String dfa_4s = "\2\uffff\1\2\2\uffff\1\6\1\uffff\1\1\7\uffff\1\4\1\5\1\3\15\uffff";
    static final String dfa_5s = "\37\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\31\uffff\1\2",
            "\1\3\1\4\40\uffff\1\5",
            "",
            "\1\6\5\7",
            "\1\6\5\7",
            "",
            "\1\10\1\11",
            "",
            "\5\7\4\uffff\1\12\1\13\1\14\1\15\1\16\3\21\1\uffff\1\17\1\20",
            "\5\7\4\uffff\1\12\1\13\1\14\1\15\1\16\3\21\1\uffff\1\17\1\20",
            "\1\22\1\23\1\24\1\25\1\26",
            "\1\27\1\30",
            "\1\31\1\32",
            "\1\33\1\34",
            "\1\35\1\36",
            "",
            "",
            "",
            "\1\13\1\14\1\15\1\16\3\21\1\uffff\1\17\1\20",
            "\1\13\1\14\1\15\1\16\3\21\1\uffff\1\17\1\20",
            "\1\13\1\14\1\15\1\16\3\21\1\uffff\1\17\1\20",
            "\1\13\1\14\1\15\1\16\3\21\1\uffff\1\17\1\20",
            "\1\13\1\14\1\15\1\16\3\21\1\uffff\1\17\1\20",
            "\1\14\1\15\1\16\3\21\1\uffff\1\17",
            "\1\14\1\15\1\16\3\21\1\uffff\1\17",
            "\1\15\1\16\3\21\1\uffff\1\17",
            "\1\15\1\16\3\21\1\uffff\1\17",
            "\1\16\3\21\1\uffff\1\17",
            "\1\16\3\21\1\uffff\1\17",
            "\3\21\1\uffff\1\17",
            "\3\21\1\uffff\1\17"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "486:2: (this_Table_0= ruleTable | this_Menu_1= ruleMenu | this_LineChart_2= ruleLineChart | this_BarChart_3= ruleBarChart | this_RadarChart_4= ruleRadarChart | this_PieChart_5= rulePieChart )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000301000200L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000201000200L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000200L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000003FC00000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000003F800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000003F000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000087C00000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000087800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000087000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000086000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000006L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100400000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000020401000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0007C00010000200L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0007800010000200L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0007000010000200L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0007000000000200L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0006000000000200L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0004000000000200L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0019000001000200L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0019000000000200L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0011000000000200L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0010000000000200L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x03E0020000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x03C0020000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x00000000003FFF80L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0380020000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0300020000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0200020000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0800000000000080L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000004L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});

}