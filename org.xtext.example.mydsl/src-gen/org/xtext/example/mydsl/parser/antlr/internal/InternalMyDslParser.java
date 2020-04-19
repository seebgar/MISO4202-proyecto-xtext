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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OBJECT_START", "RULE_EQUALS", "RULE_LIST_START", "RULE_COMA", "RULE_LIST_END", "RULE_OBJECT_END", "RULE_SEMICOLON", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Company'", "'nit'", "'dashboards'", "'DBServers'", "'name'", "'panels'", "'elements'", "'title'", "'registersPerPage'", "'actions'", "'search'", "'add'", "'columns'", "'options'", "'icon'", "'urlComponent'", "'legendPosition'", "'labelStringXAxes'", "'colorGridLinesXAxes'", "'labelStringYAxes'", "'colorGridLinesYAxes'", "'displayGridLinesXAxes'", "'displayGridLinesYAxes'", "'data'", "'labels'", "'barPercentage'", "'angleLinesDisplay'", "'PIECHART'", "'columnTitle'", "'position'", "'filter'", "'edit'", "'delete'", "'source'", "'editable'", "'category'", "'borderColor'", "'backgroundColor'", "'borderDash'", "'fill'", "'systemManager'", "'token'", "'password'", "'relatedCollections'", "'documents'", "'attributes'", "'type'", "'-'", "'.'", "'E'", "'e'", "'MONGODB'", "'REDIS'", "'white'", "'blue'", "'red'", "'green'", "'gray'", "'yellow'", "'black'", "'cyan'", "'magenta'", "'silver'", "'maroon'", "'olive'", "'purple'", "'teal'", "'navy'", "'left'", "'right'", "'center'", "'top'", "'bottom'"
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
    public static final int RULE_ID=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
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
    public static final int RULE_SEMICOLON=10;
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
    public static final int RULE_STRING=12;
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
    // InternalMyDsl.g:267:1: ruleDashboard returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'panels' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_panels_8_0= rulePanel ) ) (this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END ) ;
    public final EObject ruleDashboard() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_LIST_START_7=null;
        Token this_COMA_9=null;
        Token this_LIST_END_11=null;
        Token this_OBJECT_END_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_panels_8_0 = null;

        EObject lv_panels_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:273:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'panels' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_panels_8_0= rulePanel ) ) (this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END ) )
            // InternalMyDsl.g:274:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'panels' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_panels_8_0= rulePanel ) ) (this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:274:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'panels' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_panels_8_0= rulePanel ) ) (this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END )
            // InternalMyDsl.g:275:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'panels' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_panels_8_0= rulePanel ) ) (this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getDashboardAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDashboardAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getDashboardAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:287:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:288:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:288:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:289:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDashboardAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDashboardRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_14); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getDashboardAccess().getSEMICOLONTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getDashboardAccess().getPanelsKeyword_5());
            		
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_6, grammarAccess.getDashboardAccess().getEQUALSTerminalRuleCall_6());
            		
            this_LIST_START_7=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_7, grammarAccess.getDashboardAccess().getLIST_STARTTerminalRuleCall_7());
            		
            // InternalMyDsl.g:322:3: ( (lv_panels_8_0= rulePanel ) )
            // InternalMyDsl.g:323:4: (lv_panels_8_0= rulePanel )
            {
            // InternalMyDsl.g:323:4: (lv_panels_8_0= rulePanel )
            // InternalMyDsl.g:324:5: lv_panels_8_0= rulePanel
            {

            					newCompositeNode(grammarAccess.getDashboardAccess().getPanelsPanelParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_panels_8_0=rulePanel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDashboardRule());
            					}
            					add(
            						current,
            						"panels",
            						lv_panels_8_0,
            						"org.xtext.example.mydsl.MyDsl.Panel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:341:3: (this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:342:4: this_COMA_9= RULE_COMA ( (lv_panels_10_0= rulePanel ) )
            	    {
            	    this_COMA_9=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_9, grammarAccess.getDashboardAccess().getCOMATerminalRuleCall_9_0());
            	    			
            	    // InternalMyDsl.g:346:4: ( (lv_panels_10_0= rulePanel ) )
            	    // InternalMyDsl.g:347:5: (lv_panels_10_0= rulePanel )
            	    {
            	    // InternalMyDsl.g:347:5: (lv_panels_10_0= rulePanel )
            	    // InternalMyDsl.g:348:6: lv_panels_10_0= rulePanel
            	    {

            	    						newCompositeNode(grammarAccess.getDashboardAccess().getPanelsPanelParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_panels_10_0=rulePanel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDashboardRule());
            	    						}
            	    						add(
            	    							current,
            	    							"panels",
            	    							lv_panels_10_0,
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

            this_LIST_END_11=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_11, grammarAccess.getDashboardAccess().getLIST_ENDTerminalRuleCall_10());
            		
            this_OBJECT_END_12=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_12, grammarAccess.getDashboardAccess().getOBJECT_ENDTerminalRuleCall_11());
            		

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
    // InternalMyDsl.g:378:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // InternalMyDsl.g:378:46: (iv_rulePanel= rulePanel EOF )
            // InternalMyDsl.g:379:2: iv_rulePanel= rulePanel EOF
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
    // InternalMyDsl.g:385:1: rulePanel returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'elements' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_elements_8_0= ruleElement ) ) (this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END ) ;
    public final EObject rulePanel() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_LIST_START_7=null;
        Token this_COMA_9=null;
        Token this_LIST_END_11=null;
        Token this_OBJECT_END_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_elements_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:391:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'elements' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_elements_8_0= ruleElement ) ) (this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END ) )
            // InternalMyDsl.g:392:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'elements' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_elements_8_0= ruleElement ) ) (this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:392:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'elements' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_elements_8_0= ruleElement ) ) (this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END )
            // InternalMyDsl.g:393:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'elements' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_elements_8_0= ruleElement ) ) (this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getPanelAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPanelAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getPanelAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:405:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:406:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:406:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:407:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPanelAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_15); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getPanelAccess().getSEMICOLONTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getPanelAccess().getElementsKeyword_5());
            		
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_6, grammarAccess.getPanelAccess().getEQUALSTerminalRuleCall_6());
            		
            this_LIST_START_7=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_7, grammarAccess.getPanelAccess().getLIST_STARTTerminalRuleCall_7());
            		
            // InternalMyDsl.g:440:3: ( (lv_elements_8_0= ruleElement ) )
            // InternalMyDsl.g:441:4: (lv_elements_8_0= ruleElement )
            {
            // InternalMyDsl.g:441:4: (lv_elements_8_0= ruleElement )
            // InternalMyDsl.g:442:5: lv_elements_8_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getPanelAccess().getElementsElementParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_8_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_8_0,
            						"org.xtext.example.mydsl.MyDsl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:459:3: (this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:460:4: this_COMA_9= RULE_COMA ( (lv_elements_10_0= ruleElement ) )
            	    {
            	    this_COMA_9=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_9, grammarAccess.getPanelAccess().getCOMATerminalRuleCall_9_0());
            	    			
            	    // InternalMyDsl.g:464:4: ( (lv_elements_10_0= ruleElement ) )
            	    // InternalMyDsl.g:465:5: (lv_elements_10_0= ruleElement )
            	    {
            	    // InternalMyDsl.g:465:5: (lv_elements_10_0= ruleElement )
            	    // InternalMyDsl.g:466:6: lv_elements_10_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getPanelAccess().getElementsElementParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_elements_10_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPanelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_10_0,
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

            this_LIST_END_11=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_11, grammarAccess.getPanelAccess().getLIST_ENDTerminalRuleCall_10());
            		
            this_OBJECT_END_12=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_12, grammarAccess.getPanelAccess().getOBJECT_ENDTerminalRuleCall_11());
            		

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
    // InternalMyDsl.g:496:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDsl.g:496:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:497:2: iv_ruleElement= ruleElement EOF
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
    // InternalMyDsl.g:503:1: ruleElement returns [EObject current=null] : (this_Table_0= ruleTable | this_Menu_1= ruleMenu | this_LineChart_2= ruleLineChart | this_BarChart_3= ruleBarChart | this_RadarChart_4= ruleRadarChart | this_PieChart_5= rulePieChart ) ;
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
            // InternalMyDsl.g:509:2: ( (this_Table_0= ruleTable | this_Menu_1= ruleMenu | this_LineChart_2= ruleLineChart | this_BarChart_3= ruleBarChart | this_RadarChart_4= ruleRadarChart | this_PieChart_5= rulePieChart ) )
            // InternalMyDsl.g:510:2: (this_Table_0= ruleTable | this_Menu_1= ruleMenu | this_LineChart_2= ruleLineChart | this_BarChart_3= ruleBarChart | this_RadarChart_4= ruleRadarChart | this_PieChart_5= rulePieChart )
            {
            // InternalMyDsl.g:510:2: (this_Table_0= ruleTable | this_Menu_1= ruleMenu | this_LineChart_2= ruleLineChart | this_BarChart_3= ruleBarChart | this_RadarChart_4= ruleRadarChart | this_PieChart_5= rulePieChart )
            int alt6=6;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:511:3: this_Table_0= ruleTable
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
                    // InternalMyDsl.g:520:3: this_Menu_1= ruleMenu
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
                    // InternalMyDsl.g:529:3: this_LineChart_2= ruleLineChart
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
                    // InternalMyDsl.g:538:3: this_BarChart_3= ruleBarChart
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
                    // InternalMyDsl.g:547:3: this_RadarChart_4= ruleRadarChart
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
                    // InternalMyDsl.g:556:3: this_PieChart_5= rulePieChart
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
    // InternalMyDsl.g:568:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalMyDsl.g:568:46: (iv_ruleTable= ruleTable EOF )
            // InternalMyDsl.g:569:2: iv_ruleTable= ruleTable EOF
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
    // InternalMyDsl.g:575:1: ruleTable returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON )? ( ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON )? ( ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON )? otherlv_21= 'columns' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_columns_24_0= ruleColumn ) ) (this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Token this_EQUALS_10=null;
        Token this_SEMICOLON_12=null;
        Token otherlv_13=null;
        Token this_EQUALS_14=null;
        Token this_SEMICOLON_16=null;
        Token lv_search_17_0=null;
        Token this_SEMICOLON_18=null;
        Token lv_add_19_0=null;
        Token this_SEMICOLON_20=null;
        Token otherlv_21=null;
        Token this_EQUALS_22=null;
        Token this_LIST_START_23=null;
        Token this_COMA_25=null;
        Token this_LIST_END_27=null;
        Token this_OBJECT_END_28=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        AntlrDatatypeRuleToken lv_registersPerPage_11_0 = null;

        EObject lv_actions_15_0 = null;

        EObject lv_columns_24_0 = null;

        EObject lv_columns_26_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:581:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON )? ( ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON )? ( ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON )? otherlv_21= 'columns' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_columns_24_0= ruleColumn ) ) (this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END ) )
            // InternalMyDsl.g:582:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON )? ( ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON )? ( ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON )? otherlv_21= 'columns' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_columns_24_0= ruleColumn ) ) (this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:582:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON )? ( ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON )? ( ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON )? otherlv_21= 'columns' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_columns_24_0= ruleColumn ) ) (this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END )
            // InternalMyDsl.g:583:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON )? ( ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON )? ( ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON )? otherlv_21= 'columns' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_columns_24_0= ruleColumn ) ) (this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getTableAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getTableAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:595:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:596:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:596:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:597:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_16); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:618:3: (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:619:4: otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getTableAccess().getTitleKeyword_5_0());
                    			
                    this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_6, grammarAccess.getTableAccess().getEQUALSTerminalRuleCall_5_1());
                    			
                    // InternalMyDsl.g:627:4: ( (lv_title_7_0= ruleEString ) )
                    // InternalMyDsl.g:628:5: (lv_title_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:628:5: (lv_title_7_0= ruleEString )
                    // InternalMyDsl.g:629:6: lv_title_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_17); 

                    				newLeafNode(this_SEMICOLON_8, grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:651:3: (otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:652:4: otherlv_9= 'registersPerPage' this_EQUALS_10= RULE_EQUALS ( (lv_registersPerPage_11_0= ruleEInt ) ) this_SEMICOLON_12= RULE_SEMICOLON
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getTableAccess().getRegistersPerPageKeyword_6_0());
                    			
                    this_EQUALS_10=(Token)match(input,RULE_EQUALS,FOLLOW_18); 

                    				newLeafNode(this_EQUALS_10, grammarAccess.getTableAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:660:4: ( (lv_registersPerPage_11_0= ruleEInt ) )
                    // InternalMyDsl.g:661:5: (lv_registersPerPage_11_0= ruleEInt )
                    {
                    // InternalMyDsl.g:661:5: (lv_registersPerPage_11_0= ruleEInt )
                    // InternalMyDsl.g:662:6: lv_registersPerPage_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getRegistersPerPageEIntParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_registersPerPage_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"registersPerPage",
                    							lv_registersPerPage_11_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_19); 

                    				newLeafNode(this_SEMICOLON_12, grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:684:3: (otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:685:4: otherlv_13= 'actions' this_EQUALS_14= RULE_EQUALS ( (lv_actions_15_0= ruleAction ) ) this_SEMICOLON_16= RULE_SEMICOLON
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getTableAccess().getActionsKeyword_7_0());
                    			
                    this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_5); 

                    				newLeafNode(this_EQUALS_14, grammarAccess.getTableAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:693:4: ( (lv_actions_15_0= ruleAction ) )
                    // InternalMyDsl.g:694:5: (lv_actions_15_0= ruleAction )
                    {
                    // InternalMyDsl.g:694:5: (lv_actions_15_0= ruleAction )
                    // InternalMyDsl.g:695:6: lv_actions_15_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getActionsActionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_actions_15_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"actions",
                    							lv_actions_15_0,
                    							"org.xtext.example.mydsl.MyDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_20); 

                    				newLeafNode(this_SEMICOLON_16, grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:717:3: ( ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:718:4: ( (lv_search_17_0= 'search' ) ) this_SEMICOLON_18= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:718:4: ( (lv_search_17_0= 'search' ) )
                    // InternalMyDsl.g:719:5: (lv_search_17_0= 'search' )
                    {
                    // InternalMyDsl.g:719:5: (lv_search_17_0= 'search' )
                    // InternalMyDsl.g:720:6: lv_search_17_0= 'search'
                    {
                    lv_search_17_0=(Token)match(input,28,FOLLOW_13); 

                    						newLeafNode(lv_search_17_0, grammarAccess.getTableAccess().getSearchSearchKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableRule());
                    						}
                    						setWithLastConsumed(current, "search", true, "search");
                    					

                    }


                    }

                    this_SEMICOLON_18=(Token)match(input,RULE_SEMICOLON,FOLLOW_21); 

                    				newLeafNode(this_SEMICOLON_18, grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_8_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:737:3: ( ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:738:4: ( (lv_add_19_0= 'add' ) ) this_SEMICOLON_20= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:738:4: ( (lv_add_19_0= 'add' ) )
                    // InternalMyDsl.g:739:5: (lv_add_19_0= 'add' )
                    {
                    // InternalMyDsl.g:739:5: (lv_add_19_0= 'add' )
                    // InternalMyDsl.g:740:6: lv_add_19_0= 'add'
                    {
                    lv_add_19_0=(Token)match(input,29,FOLLOW_13); 

                    						newLeafNode(lv_add_19_0, grammarAccess.getTableAccess().getAddAddKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableRule());
                    						}
                    						setWithLastConsumed(current, "add", true, "add");
                    					

                    }


                    }

                    this_SEMICOLON_20=(Token)match(input,RULE_SEMICOLON,FOLLOW_22); 

                    				newLeafNode(this_SEMICOLON_20, grammarAccess.getTableAccess().getSEMICOLONTerminalRuleCall_9_1());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_21, grammarAccess.getTableAccess().getColumnsKeyword_10());
            		
            this_EQUALS_22=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_22, grammarAccess.getTableAccess().getEQUALSTerminalRuleCall_11());
            		
            this_LIST_START_23=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_23, grammarAccess.getTableAccess().getLIST_STARTTerminalRuleCall_12());
            		
            // InternalMyDsl.g:769:3: ( (lv_columns_24_0= ruleColumn ) )
            // InternalMyDsl.g:770:4: (lv_columns_24_0= ruleColumn )
            {
            // InternalMyDsl.g:770:4: (lv_columns_24_0= ruleColumn )
            // InternalMyDsl.g:771:5: lv_columns_24_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_columns_24_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_24_0,
            						"org.xtext.example.mydsl.MyDsl.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:788:3: (this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:789:4: this_COMA_25= RULE_COMA ( (lv_columns_26_0= ruleColumn ) )
            	    {
            	    this_COMA_25=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_25, grammarAccess.getTableAccess().getCOMATerminalRuleCall_14_0());
            	    			
            	    // InternalMyDsl.g:793:4: ( (lv_columns_26_0= ruleColumn ) )
            	    // InternalMyDsl.g:794:5: (lv_columns_26_0= ruleColumn )
            	    {
            	    // InternalMyDsl.g:794:5: (lv_columns_26_0= ruleColumn )
            	    // InternalMyDsl.g:795:6: lv_columns_26_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_columns_26_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_26_0,
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

            this_LIST_END_27=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_27, grammarAccess.getTableAccess().getLIST_ENDTerminalRuleCall_15());
            		
            this_OBJECT_END_28=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_28, grammarAccess.getTableAccess().getOBJECT_ENDTerminalRuleCall_16());
            		

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
    // InternalMyDsl.g:825:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // InternalMyDsl.g:825:45: (iv_ruleMenu= ruleMenu EOF )
            // InternalMyDsl.g:826:2: iv_ruleMenu= ruleMenu EOF
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
    // InternalMyDsl.g:832:1: ruleMenu returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? otherlv_9= 'options' this_EQUALS_10= RULE_EQUALS this_LIST_START_11= RULE_LIST_START ( (lv_options_12_0= ruleOption ) ) (this_COMA_13= RULE_COMA ( (lv_options_14_0= ruleOption ) ) )* this_LIST_END_15= RULE_LIST_END this_OBJECT_END_16= RULE_OBJECT_END ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Token this_EQUALS_10=null;
        Token this_LIST_START_11=null;
        Token this_COMA_13=null;
        Token this_LIST_END_15=null;
        Token this_OBJECT_END_16=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        EObject lv_options_12_0 = null;

        EObject lv_options_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:838:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? otherlv_9= 'options' this_EQUALS_10= RULE_EQUALS this_LIST_START_11= RULE_LIST_START ( (lv_options_12_0= ruleOption ) ) (this_COMA_13= RULE_COMA ( (lv_options_14_0= ruleOption ) ) )* this_LIST_END_15= RULE_LIST_END this_OBJECT_END_16= RULE_OBJECT_END ) )
            // InternalMyDsl.g:839:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? otherlv_9= 'options' this_EQUALS_10= RULE_EQUALS this_LIST_START_11= RULE_LIST_START ( (lv_options_12_0= ruleOption ) ) (this_COMA_13= RULE_COMA ( (lv_options_14_0= ruleOption ) ) )* this_LIST_END_15= RULE_LIST_END this_OBJECT_END_16= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:839:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? otherlv_9= 'options' this_EQUALS_10= RULE_EQUALS this_LIST_START_11= RULE_LIST_START ( (lv_options_12_0= ruleOption ) ) (this_COMA_13= RULE_COMA ( (lv_options_14_0= ruleOption ) ) )* this_LIST_END_15= RULE_LIST_END this_OBJECT_END_16= RULE_OBJECT_END )
            // InternalMyDsl.g:840:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? otherlv_9= 'options' this_EQUALS_10= RULE_EQUALS this_LIST_START_11= RULE_LIST_START ( (lv_options_12_0= ruleOption ) ) (this_COMA_13= RULE_COMA ( (lv_options_14_0= ruleOption ) ) )* this_LIST_END_15= RULE_LIST_END this_OBJECT_END_16= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getMenuAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMenuAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getMenuAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:852:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:853:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:853:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:854:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMenuRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_23); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getMenuAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:875:3: (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:876:4: otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getMenuAccess().getTitleKeyword_5_0());
                    			
                    this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_6, grammarAccess.getMenuAccess().getEQUALSTerminalRuleCall_5_1());
                    			
                    // InternalMyDsl.g:884:4: ( (lv_title_7_0= ruleEString ) )
                    // InternalMyDsl.g:885:5: (lv_title_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:885:5: (lv_title_7_0= ruleEString )
                    // InternalMyDsl.g:886:6: lv_title_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMenuAccess().getTitleEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMenuRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_24); 

                    				newLeafNode(this_SEMICOLON_8, grammarAccess.getMenuAccess().getSEMICOLONTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getMenuAccess().getOptionsKeyword_6());
            		
            this_EQUALS_10=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_10, grammarAccess.getMenuAccess().getEQUALSTerminalRuleCall_7());
            		
            this_LIST_START_11=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_11, grammarAccess.getMenuAccess().getLIST_STARTTerminalRuleCall_8());
            		
            // InternalMyDsl.g:920:3: ( (lv_options_12_0= ruleOption ) )
            // InternalMyDsl.g:921:4: (lv_options_12_0= ruleOption )
            {
            // InternalMyDsl.g:921:4: (lv_options_12_0= ruleOption )
            // InternalMyDsl.g:922:5: lv_options_12_0= ruleOption
            {

            					newCompositeNode(grammarAccess.getMenuAccess().getOptionsOptionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_options_12_0=ruleOption();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMenuRule());
            					}
            					add(
            						current,
            						"options",
            						lv_options_12_0,
            						"org.xtext.example.mydsl.MyDsl.Option");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:939:3: (this_COMA_13= RULE_COMA ( (lv_options_14_0= ruleOption ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:940:4: this_COMA_13= RULE_COMA ( (lv_options_14_0= ruleOption ) )
            	    {
            	    this_COMA_13=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_13, grammarAccess.getMenuAccess().getCOMATerminalRuleCall_10_0());
            	    			
            	    // InternalMyDsl.g:944:4: ( (lv_options_14_0= ruleOption ) )
            	    // InternalMyDsl.g:945:5: (lv_options_14_0= ruleOption )
            	    {
            	    // InternalMyDsl.g:945:5: (lv_options_14_0= ruleOption )
            	    // InternalMyDsl.g:946:6: lv_options_14_0= ruleOption
            	    {

            	    						newCompositeNode(grammarAccess.getMenuAccess().getOptionsOptionParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_options_14_0=ruleOption();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMenuRule());
            	    						}
            	    						add(
            	    							current,
            	    							"options",
            	    							lv_options_14_0,
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

            this_LIST_END_15=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_15, grammarAccess.getMenuAccess().getLIST_ENDTerminalRuleCall_11());
            		
            this_OBJECT_END_16=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_16, grammarAccess.getMenuAccess().getOBJECT_ENDTerminalRuleCall_12());
            		

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
    // InternalMyDsl.g:976:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalMyDsl.g:976:47: (iv_ruleOption= ruleOption EOF )
            // InternalMyDsl.g:977:2: iv_ruleOption= ruleOption EOF
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
    // InternalMyDsl.g:983:1: ruleOption returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'icon' this_EQUALS_7= RULE_EQUALS ( (lv_icon_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'title' this_EQUALS_11= RULE_EQUALS ( (lv_title_12_0= ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? (otherlv_14= 'urlComponent' this_EQUALS_15= RULE_EQUALS ( (lv_urlComponent_16_0= ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON )? this_OBJECT_END_18= RULE_OBJECT_END ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMICOLON_9=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_SEMICOLON_13=null;
        Token otherlv_14=null;
        Token this_EQUALS_15=null;
        Token this_SEMICOLON_17=null;
        Token this_OBJECT_END_18=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_icon_8_0 = null;

        AntlrDatatypeRuleToken lv_title_12_0 = null;

        AntlrDatatypeRuleToken lv_urlComponent_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:989:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'icon' this_EQUALS_7= RULE_EQUALS ( (lv_icon_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'title' this_EQUALS_11= RULE_EQUALS ( (lv_title_12_0= ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? (otherlv_14= 'urlComponent' this_EQUALS_15= RULE_EQUALS ( (lv_urlComponent_16_0= ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON )? this_OBJECT_END_18= RULE_OBJECT_END ) )
            // InternalMyDsl.g:990:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'icon' this_EQUALS_7= RULE_EQUALS ( (lv_icon_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'title' this_EQUALS_11= RULE_EQUALS ( (lv_title_12_0= ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? (otherlv_14= 'urlComponent' this_EQUALS_15= RULE_EQUALS ( (lv_urlComponent_16_0= ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON )? this_OBJECT_END_18= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:990:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'icon' this_EQUALS_7= RULE_EQUALS ( (lv_icon_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'title' this_EQUALS_11= RULE_EQUALS ( (lv_title_12_0= ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? (otherlv_14= 'urlComponent' this_EQUALS_15= RULE_EQUALS ( (lv_urlComponent_16_0= ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON )? this_OBJECT_END_18= RULE_OBJECT_END )
            // InternalMyDsl.g:991:3: () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'icon' this_EQUALS_7= RULE_EQUALS ( (lv_icon_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'title' this_EQUALS_11= RULE_EQUALS ( (lv_title_12_0= ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? (otherlv_14= 'urlComponent' this_EQUALS_15= RULE_EQUALS ( (lv_urlComponent_16_0= ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON )? this_OBJECT_END_18= RULE_OBJECT_END
            {
            // InternalMyDsl.g:991:3: ()
            // InternalMyDsl.g:992:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOptionAccess().getOptionAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getOptionAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getNameKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getOptionAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1010:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:1011:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:1011:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:1012:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_25); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getOptionAccess().getSEMICOLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:1033:3: (otherlv_6= 'icon' this_EQUALS_7= RULE_EQUALS ( (lv_icon_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1034:4: otherlv_6= 'icon' this_EQUALS_7= RULE_EQUALS ( (lv_icon_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getOptionAccess().getIconKeyword_6_0());
                    			
                    this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_7, grammarAccess.getOptionAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:1042:4: ( (lv_icon_8_0= ruleEString ) )
                    // InternalMyDsl.g:1043:5: (lv_icon_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:1043:5: (lv_icon_8_0= ruleEString )
                    // InternalMyDsl.g:1044:6: lv_icon_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOptionAccess().getIconEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_icon_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionRule());
                    						}
                    						set(
                    							current,
                    							"icon",
                    							lv_icon_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_9=(Token)match(input,RULE_SEMICOLON,FOLLOW_26); 

                    				newLeafNode(this_SEMICOLON_9, grammarAccess.getOptionAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1066:3: (otherlv_10= 'title' this_EQUALS_11= RULE_EQUALS ( (lv_title_12_0= ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1067:4: otherlv_10= 'title' this_EQUALS_11= RULE_EQUALS ( (lv_title_12_0= ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getOptionAccess().getTitleKeyword_7_0());
                    			
                    this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_11, grammarAccess.getOptionAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:1075:4: ( (lv_title_12_0= ruleEString ) )
                    // InternalMyDsl.g:1076:5: (lv_title_12_0= ruleEString )
                    {
                    // InternalMyDsl.g:1076:5: (lv_title_12_0= ruleEString )
                    // InternalMyDsl.g:1077:6: lv_title_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOptionAccess().getTitleEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_12_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_13=(Token)match(input,RULE_SEMICOLON,FOLLOW_27); 

                    				newLeafNode(this_SEMICOLON_13, grammarAccess.getOptionAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1099:3: (otherlv_14= 'urlComponent' this_EQUALS_15= RULE_EQUALS ( (lv_urlComponent_16_0= ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1100:4: otherlv_14= 'urlComponent' this_EQUALS_15= RULE_EQUALS ( (lv_urlComponent_16_0= ruleEString ) ) this_SEMICOLON_17= RULE_SEMICOLON
                    {
                    otherlv_14=(Token)match(input,33,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getOptionAccess().getUrlComponentKeyword_8_0());
                    			
                    this_EQUALS_15=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_15, grammarAccess.getOptionAccess().getEQUALSTerminalRuleCall_8_1());
                    			
                    // InternalMyDsl.g:1108:4: ( (lv_urlComponent_16_0= ruleEString ) )
                    // InternalMyDsl.g:1109:5: (lv_urlComponent_16_0= ruleEString )
                    {
                    // InternalMyDsl.g:1109:5: (lv_urlComponent_16_0= ruleEString )
                    // InternalMyDsl.g:1110:6: lv_urlComponent_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOptionAccess().getUrlComponentEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_urlComponent_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionRule());
                    						}
                    						set(
                    							current,
                    							"urlComponent",
                    							lv_urlComponent_16_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_17=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

                    				newLeafNode(this_SEMICOLON_17, grammarAccess.getOptionAccess().getSEMICOLONTerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            this_OBJECT_END_18=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_18, grammarAccess.getOptionAccess().getOBJECT_ENDTerminalRuleCall_9());
            		

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
    // InternalMyDsl.g:1140:1: entryRuleLineChart returns [EObject current=null] : iv_ruleLineChart= ruleLineChart EOF ;
    public final EObject entryRuleLineChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineChart = null;


        try {
            // InternalMyDsl.g:1140:50: (iv_ruleLineChart= ruleLineChart EOF )
            // InternalMyDsl.g:1141:2: iv_ruleLineChart= ruleLineChart EOF
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
    // InternalMyDsl.g:1147:1: ruleLineChart returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? ( ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON )? otherlv_33= 'data' this_EQUALS_34= RULE_EQUALS this_LIST_START_35= RULE_LIST_START ( (lv_data_36_0= ruleData ) ) (this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) ) )* this_LIST_END_39= RULE_LIST_END otherlv_40= 'labels' this_EQUALS_41= RULE_EQUALS this_LIST_START_42= RULE_LIST_START ( (lv_labels_43_0= ruleLabel ) ) (this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) ) )* this_LIST_END_46= RULE_LIST_END this_OBJECT_END_47= RULE_OBJECT_END ) ;
    public final EObject ruleLineChart() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Token this_EQUALS_10=null;
        Token this_SEMICOLON_12=null;
        Token otherlv_13=null;
        Token this_EQUALS_14=null;
        Token this_SEMICOLON_16=null;
        Token otherlv_17=null;
        Token this_EQUALS_18=null;
        Token this_SEMICOLON_20=null;
        Token otherlv_21=null;
        Token this_EQUALS_22=null;
        Token this_SEMICOLON_24=null;
        Token otherlv_25=null;
        Token this_EQUALS_26=null;
        Token this_SEMICOLON_28=null;
        Token lv_displayGridLinesXAxes_29_0=null;
        Token this_SEMICOLON_30=null;
        Token lv_displayGridLinesYAxes_31_0=null;
        Token this_SEMICOLON_32=null;
        Token otherlv_33=null;
        Token this_EQUALS_34=null;
        Token this_LIST_START_35=null;
        Token this_COMA_37=null;
        Token this_LIST_END_39=null;
        Token otherlv_40=null;
        Token this_EQUALS_41=null;
        Token this_LIST_START_42=null;
        Token this_COMA_44=null;
        Token this_LIST_END_46=null;
        Token this_OBJECT_END_47=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        Enumerator lv_legendPosition_11_0 = null;

        AntlrDatatypeRuleToken lv_labelStringXAxes_15_0 = null;

        AntlrDatatypeRuleToken lv_colorGridLinesXAxes_19_0 = null;

        AntlrDatatypeRuleToken lv_labelStringYAxes_23_0 = null;

        AntlrDatatypeRuleToken lv_colorGridLinesYAxes_27_0 = null;

        EObject lv_data_36_0 = null;

        EObject lv_data_38_0 = null;

        EObject lv_labels_43_0 = null;

        EObject lv_labels_45_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1153:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? ( ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON )? otherlv_33= 'data' this_EQUALS_34= RULE_EQUALS this_LIST_START_35= RULE_LIST_START ( (lv_data_36_0= ruleData ) ) (this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) ) )* this_LIST_END_39= RULE_LIST_END otherlv_40= 'labels' this_EQUALS_41= RULE_EQUALS this_LIST_START_42= RULE_LIST_START ( (lv_labels_43_0= ruleLabel ) ) (this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) ) )* this_LIST_END_46= RULE_LIST_END this_OBJECT_END_47= RULE_OBJECT_END ) )
            // InternalMyDsl.g:1154:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? ( ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON )? otherlv_33= 'data' this_EQUALS_34= RULE_EQUALS this_LIST_START_35= RULE_LIST_START ( (lv_data_36_0= ruleData ) ) (this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) ) )* this_LIST_END_39= RULE_LIST_END otherlv_40= 'labels' this_EQUALS_41= RULE_EQUALS this_LIST_START_42= RULE_LIST_START ( (lv_labels_43_0= ruleLabel ) ) (this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) ) )* this_LIST_END_46= RULE_LIST_END this_OBJECT_END_47= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:1154:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? ( ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON )? otherlv_33= 'data' this_EQUALS_34= RULE_EQUALS this_LIST_START_35= RULE_LIST_START ( (lv_data_36_0= ruleData ) ) (this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) ) )* this_LIST_END_39= RULE_LIST_END otherlv_40= 'labels' this_EQUALS_41= RULE_EQUALS this_LIST_START_42= RULE_LIST_START ( (lv_labels_43_0= ruleLabel ) ) (this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) ) )* this_LIST_END_46= RULE_LIST_END this_OBJECT_END_47= RULE_OBJECT_END )
            // InternalMyDsl.g:1155:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? ( ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON )? otherlv_33= 'data' this_EQUALS_34= RULE_EQUALS this_LIST_START_35= RULE_LIST_START ( (lv_data_36_0= ruleData ) ) (this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) ) )* this_LIST_END_39= RULE_LIST_END otherlv_40= 'labels' this_EQUALS_41= RULE_EQUALS this_LIST_START_42= RULE_LIST_START ( (lv_labels_43_0= ruleLabel ) ) (this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) ) )* this_LIST_END_46= RULE_LIST_END this_OBJECT_END_47= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getLineChartAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLineChartAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:1167:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:1168:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:1168:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:1169:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLineChartAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineChartRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_28); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:1190:3: (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // InternalMyDsl.g:1191:4: otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            otherlv_5=(Token)match(input,25,FOLLOW_7); 

            				newLeafNode(otherlv_5, grammarAccess.getLineChartAccess().getTitleKeyword_5_0());
            			
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            				newLeafNode(this_EQUALS_6, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_5_1());
            			
            // InternalMyDsl.g:1199:4: ( (lv_title_7_0= ruleEString ) )
            // InternalMyDsl.g:1200:5: (lv_title_7_0= ruleEString )
            {
            // InternalMyDsl.g:1200:5: (lv_title_7_0= ruleEString )
            // InternalMyDsl.g:1201:6: lv_title_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getLineChartAccess().getTitleEStringParserRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_13);
            lv_title_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getLineChartRule());
            						}
            						set(
            							current,
            							"title",
            							lv_title_7_0,
            							"org.xtext.example.mydsl.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_29); 

            				newLeafNode(this_SEMICOLON_8, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_5_3());
            			

            }

            // InternalMyDsl.g:1223:3: (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1224:4: otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getLineChartAccess().getLegendPositionKeyword_6_0());
                    			
                    this_EQUALS_10=(Token)match(input,RULE_EQUALS,FOLLOW_30); 

                    				newLeafNode(this_EQUALS_10, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:1232:4: ( (lv_legendPosition_11_0= rulePositionOptions ) )
                    // InternalMyDsl.g:1233:5: (lv_legendPosition_11_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:1233:5: (lv_legendPosition_11_0= rulePositionOptions )
                    // InternalMyDsl.g:1234:6: lv_legendPosition_11_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getLegendPositionPositionOptionsEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_legendPosition_11_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"legendPosition",
                    							lv_legendPosition_11_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_31); 

                    				newLeafNode(this_SEMICOLON_12, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1256:3: (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1257:4: otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON
                    {
                    otherlv_13=(Token)match(input,35,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getLineChartAccess().getLabelStringXAxesKeyword_7_0());
                    			
                    this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_14, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:1265:4: ( (lv_labelStringXAxes_15_0= ruleEString ) )
                    // InternalMyDsl.g:1266:5: (lv_labelStringXAxes_15_0= ruleEString )
                    {
                    // InternalMyDsl.g:1266:5: (lv_labelStringXAxes_15_0= ruleEString )
                    // InternalMyDsl.g:1267:6: lv_labelStringXAxes_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getLabelStringXAxesEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_labelStringXAxes_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"labelStringXAxes",
                    							lv_labelStringXAxes_15_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_32); 

                    				newLeafNode(this_SEMICOLON_16, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1289:3: (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1290:4: otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON
                    {
                    otherlv_17=(Token)match(input,36,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getLineChartAccess().getColorGridLinesXAxesKeyword_8_0());
                    			
                    this_EQUALS_18=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_18, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_8_1());
                    			
                    // InternalMyDsl.g:1298:4: ( (lv_colorGridLinesXAxes_19_0= ruleEString ) )
                    // InternalMyDsl.g:1299:5: (lv_colorGridLinesXAxes_19_0= ruleEString )
                    {
                    // InternalMyDsl.g:1299:5: (lv_colorGridLinesXAxes_19_0= ruleEString )
                    // InternalMyDsl.g:1300:6: lv_colorGridLinesXAxes_19_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getColorGridLinesXAxesEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_colorGridLinesXAxes_19_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"colorGridLinesXAxes",
                    							lv_colorGridLinesXAxes_19_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_20=(Token)match(input,RULE_SEMICOLON,FOLLOW_33); 

                    				newLeafNode(this_SEMICOLON_20, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1322:3: (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1323:4: otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON
                    {
                    otherlv_21=(Token)match(input,37,FOLLOW_7); 

                    				newLeafNode(otherlv_21, grammarAccess.getLineChartAccess().getLabelStringYAxesKeyword_9_0());
                    			
                    this_EQUALS_22=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_22, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_9_1());
                    			
                    // InternalMyDsl.g:1331:4: ( (lv_labelStringYAxes_23_0= ruleEString ) )
                    // InternalMyDsl.g:1332:5: (lv_labelStringYAxes_23_0= ruleEString )
                    {
                    // InternalMyDsl.g:1332:5: (lv_labelStringYAxes_23_0= ruleEString )
                    // InternalMyDsl.g:1333:6: lv_labelStringYAxes_23_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getLabelStringYAxesEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_labelStringYAxes_23_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"labelStringYAxes",
                    							lv_labelStringYAxes_23_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_24=(Token)match(input,RULE_SEMICOLON,FOLLOW_34); 

                    				newLeafNode(this_SEMICOLON_24, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_9_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1355:3: (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1356:4: otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON
                    {
                    otherlv_25=(Token)match(input,38,FOLLOW_7); 

                    				newLeafNode(otherlv_25, grammarAccess.getLineChartAccess().getColorGridLinesYAxesKeyword_10_0());
                    			
                    this_EQUALS_26=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_26, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_10_1());
                    			
                    // InternalMyDsl.g:1364:4: ( (lv_colorGridLinesYAxes_27_0= ruleEString ) )
                    // InternalMyDsl.g:1365:5: (lv_colorGridLinesYAxes_27_0= ruleEString )
                    {
                    // InternalMyDsl.g:1365:5: (lv_colorGridLinesYAxes_27_0= ruleEString )
                    // InternalMyDsl.g:1366:6: lv_colorGridLinesYAxes_27_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineChartAccess().getColorGridLinesYAxesEStringParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_colorGridLinesYAxes_27_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineChartRule());
                    						}
                    						set(
                    							current,
                    							"colorGridLinesYAxes",
                    							lv_colorGridLinesYAxes_27_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_28=(Token)match(input,RULE_SEMICOLON,FOLLOW_35); 

                    				newLeafNode(this_SEMICOLON_28, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_10_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1388:3: ( ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1389:4: ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_30= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:1389:4: ( (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' ) )
                    // InternalMyDsl.g:1390:5: (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' )
                    {
                    // InternalMyDsl.g:1390:5: (lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes' )
                    // InternalMyDsl.g:1391:6: lv_displayGridLinesXAxes_29_0= 'displayGridLinesXAxes'
                    {
                    lv_displayGridLinesXAxes_29_0=(Token)match(input,39,FOLLOW_13); 

                    						newLeafNode(lv_displayGridLinesXAxes_29_0, grammarAccess.getLineChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineChartRule());
                    						}
                    						setWithLastConsumed(current, "displayGridLinesXAxes", true, "displayGridLinesXAxes");
                    					

                    }


                    }

                    this_SEMICOLON_30=(Token)match(input,RULE_SEMICOLON,FOLLOW_36); 

                    				newLeafNode(this_SEMICOLON_30, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_11_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1408:3: ( ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1409:4: ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_32= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:1409:4: ( (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' ) )
                    // InternalMyDsl.g:1410:5: (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' )
                    {
                    // InternalMyDsl.g:1410:5: (lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes' )
                    // InternalMyDsl.g:1411:6: lv_displayGridLinesYAxes_31_0= 'displayGridLinesYAxes'
                    {
                    lv_displayGridLinesYAxes_31_0=(Token)match(input,40,FOLLOW_13); 

                    						newLeafNode(lv_displayGridLinesYAxes_31_0, grammarAccess.getLineChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_12_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineChartRule());
                    						}
                    						setWithLastConsumed(current, "displayGridLinesYAxes", true, "displayGridLinesYAxes");
                    					

                    }


                    }

                    this_SEMICOLON_32=(Token)match(input,RULE_SEMICOLON,FOLLOW_37); 

                    				newLeafNode(this_SEMICOLON_32, grammarAccess.getLineChartAccess().getSEMICOLONTerminalRuleCall_12_1());
                    			

                    }
                    break;

            }

            otherlv_33=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_33, grammarAccess.getLineChartAccess().getDataKeyword_13());
            		
            this_EQUALS_34=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_34, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_14());
            		
            this_LIST_START_35=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_35, grammarAccess.getLineChartAccess().getLIST_STARTTerminalRuleCall_15());
            		
            // InternalMyDsl.g:1440:3: ( (lv_data_36_0= ruleData ) )
            // InternalMyDsl.g:1441:4: (lv_data_36_0= ruleData )
            {
            // InternalMyDsl.g:1441:4: (lv_data_36_0= ruleData )
            // InternalMyDsl.g:1442:5: lv_data_36_0= ruleData
            {

            					newCompositeNode(grammarAccess.getLineChartAccess().getDataDataParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_36_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineChartRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_36_0,
            						"org.xtext.example.mydsl.MyDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1459:3: (this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_COMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:1460:4: this_COMA_37= RULE_COMA ( (lv_data_38_0= ruleData ) )
            	    {
            	    this_COMA_37=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_37, grammarAccess.getLineChartAccess().getCOMATerminalRuleCall_17_0());
            	    			
            	    // InternalMyDsl.g:1464:4: ( (lv_data_38_0= ruleData ) )
            	    // InternalMyDsl.g:1465:5: (lv_data_38_0= ruleData )
            	    {
            	    // InternalMyDsl.g:1465:5: (lv_data_38_0= ruleData )
            	    // InternalMyDsl.g:1466:6: lv_data_38_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getLineChartAccess().getDataDataParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_38_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLineChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_38_0,
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

            this_LIST_END_39=(Token)match(input,RULE_LIST_END,FOLLOW_38); 

            			newLeafNode(this_LIST_END_39, grammarAccess.getLineChartAccess().getLIST_ENDTerminalRuleCall_18());
            		
            otherlv_40=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_40, grammarAccess.getLineChartAccess().getLabelsKeyword_19());
            		
            this_EQUALS_41=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_41, grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_20());
            		
            this_LIST_START_42=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_42, grammarAccess.getLineChartAccess().getLIST_STARTTerminalRuleCall_21());
            		
            // InternalMyDsl.g:1500:3: ( (lv_labels_43_0= ruleLabel ) )
            // InternalMyDsl.g:1501:4: (lv_labels_43_0= ruleLabel )
            {
            // InternalMyDsl.g:1501:4: (lv_labels_43_0= ruleLabel )
            // InternalMyDsl.g:1502:5: lv_labels_43_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getLineChartAccess().getLabelsLabelParserRuleCall_22_0());
            				
            pushFollow(FOLLOW_9);
            lv_labels_43_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineChartRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_43_0,
            						"org.xtext.example.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1519:3: (this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_COMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:1520:4: this_COMA_44= RULE_COMA ( (lv_labels_45_0= ruleLabel ) )
            	    {
            	    this_COMA_44=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_44, grammarAccess.getLineChartAccess().getCOMATerminalRuleCall_23_0());
            	    			
            	    // InternalMyDsl.g:1524:4: ( (lv_labels_45_0= ruleLabel ) )
            	    // InternalMyDsl.g:1525:5: (lv_labels_45_0= ruleLabel )
            	    {
            	    // InternalMyDsl.g:1525:5: (lv_labels_45_0= ruleLabel )
            	    // InternalMyDsl.g:1526:6: lv_labels_45_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getLineChartAccess().getLabelsLabelParserRuleCall_23_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_labels_45_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLineChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_45_0,
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

            this_LIST_END_46=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_46, grammarAccess.getLineChartAccess().getLIST_ENDTerminalRuleCall_24());
            		
            this_OBJECT_END_47=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_47, grammarAccess.getLineChartAccess().getOBJECT_ENDTerminalRuleCall_25());
            		

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
    // InternalMyDsl.g:1556:1: entryRuleBarChart returns [EObject current=null] : iv_ruleBarChart= ruleBarChart EOF ;
    public final EObject entryRuleBarChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarChart = null;


        try {
            // InternalMyDsl.g:1556:49: (iv_ruleBarChart= ruleBarChart EOF )
            // InternalMyDsl.g:1557:2: iv_ruleBarChart= ruleBarChart EOF
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
    // InternalMyDsl.g:1563:1: ruleBarChart returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? (otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON ) ( ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON )? otherlv_37= 'data' this_EQUALS_38= RULE_EQUALS this_LIST_START_39= RULE_LIST_START ( (lv_data_40_0= ruleData ) ) (this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) ) )* this_LIST_END_43= RULE_LIST_END otherlv_44= 'labels' this_EQUALS_45= RULE_EQUALS this_LIST_START_46= RULE_LIST_START ( (lv_labels_47_0= ruleLabel ) ) (this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) ) )* this_LIST_END_50= RULE_LIST_END this_OBJECT_END_51= RULE_OBJECT_END ) ;
    public final EObject ruleBarChart() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Token this_EQUALS_10=null;
        Token this_SEMICOLON_12=null;
        Token otherlv_13=null;
        Token this_EQUALS_14=null;
        Token this_SEMICOLON_16=null;
        Token otherlv_17=null;
        Token this_EQUALS_18=null;
        Token this_SEMICOLON_20=null;
        Token otherlv_21=null;
        Token this_EQUALS_22=null;
        Token this_SEMICOLON_24=null;
        Token otherlv_25=null;
        Token this_EQUALS_26=null;
        Token this_SEMICOLON_28=null;
        Token otherlv_29=null;
        Token this_EQUALS_30=null;
        Token this_SEMICOLON_32=null;
        Token lv_displayGridLinesXAxes_33_0=null;
        Token this_SEMICOLON_34=null;
        Token lv_displayGridLinesYAxes_35_0=null;
        Token this_SEMICOLON_36=null;
        Token otherlv_37=null;
        Token this_EQUALS_38=null;
        Token this_LIST_START_39=null;
        Token this_COMA_41=null;
        Token this_LIST_END_43=null;
        Token otherlv_44=null;
        Token this_EQUALS_45=null;
        Token this_LIST_START_46=null;
        Token this_COMA_48=null;
        Token this_LIST_END_50=null;
        Token this_OBJECT_END_51=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        Enumerator lv_legendPosition_11_0 = null;

        AntlrDatatypeRuleToken lv_labelStringXAxes_15_0 = null;

        AntlrDatatypeRuleToken lv_colorGridLinesXAxes_19_0 = null;

        AntlrDatatypeRuleToken lv_labelStringYAxes_23_0 = null;

        AntlrDatatypeRuleToken lv_colorGridLinesYAxes_27_0 = null;

        AntlrDatatypeRuleToken lv_barPercentage_31_0 = null;

        EObject lv_data_40_0 = null;

        EObject lv_data_42_0 = null;

        EObject lv_labels_47_0 = null;

        EObject lv_labels_49_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1569:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? (otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON ) ( ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON )? otherlv_37= 'data' this_EQUALS_38= RULE_EQUALS this_LIST_START_39= RULE_LIST_START ( (lv_data_40_0= ruleData ) ) (this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) ) )* this_LIST_END_43= RULE_LIST_END otherlv_44= 'labels' this_EQUALS_45= RULE_EQUALS this_LIST_START_46= RULE_LIST_START ( (lv_labels_47_0= ruleLabel ) ) (this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) ) )* this_LIST_END_50= RULE_LIST_END this_OBJECT_END_51= RULE_OBJECT_END ) )
            // InternalMyDsl.g:1570:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? (otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON ) ( ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON )? otherlv_37= 'data' this_EQUALS_38= RULE_EQUALS this_LIST_START_39= RULE_LIST_START ( (lv_data_40_0= ruleData ) ) (this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) ) )* this_LIST_END_43= RULE_LIST_END otherlv_44= 'labels' this_EQUALS_45= RULE_EQUALS this_LIST_START_46= RULE_LIST_START ( (lv_labels_47_0= ruleLabel ) ) (this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) ) )* this_LIST_END_50= RULE_LIST_END this_OBJECT_END_51= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:1570:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? (otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON ) ( ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON )? otherlv_37= 'data' this_EQUALS_38= RULE_EQUALS this_LIST_START_39= RULE_LIST_START ( (lv_data_40_0= ruleData ) ) (this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) ) )* this_LIST_END_43= RULE_LIST_END otherlv_44= 'labels' this_EQUALS_45= RULE_EQUALS this_LIST_START_46= RULE_LIST_START ( (lv_labels_47_0= ruleLabel ) ) (this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) ) )* this_LIST_END_50= RULE_LIST_END this_OBJECT_END_51= RULE_OBJECT_END )
            // InternalMyDsl.g:1571:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )? (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )? (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )? (otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON ) ( ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON )? ( ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON )? otherlv_37= 'data' this_EQUALS_38= RULE_EQUALS this_LIST_START_39= RULE_LIST_START ( (lv_data_40_0= ruleData ) ) (this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) ) )* this_LIST_END_43= RULE_LIST_END otherlv_44= 'labels' this_EQUALS_45= RULE_EQUALS this_LIST_START_46= RULE_LIST_START ( (lv_labels_47_0= ruleLabel ) ) (this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) ) )* this_LIST_END_50= RULE_LIST_END this_OBJECT_END_51= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getBarChartAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getBarChartAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:1583:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:1584:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:1584:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:1585:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBarChartAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarChartRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_28); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:1606:3: (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // InternalMyDsl.g:1607:4: otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            otherlv_5=(Token)match(input,25,FOLLOW_7); 

            				newLeafNode(otherlv_5, grammarAccess.getBarChartAccess().getTitleKeyword_5_0());
            			
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            				newLeafNode(this_EQUALS_6, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_5_1());
            			
            // InternalMyDsl.g:1615:4: ( (lv_title_7_0= ruleEString ) )
            // InternalMyDsl.g:1616:5: (lv_title_7_0= ruleEString )
            {
            // InternalMyDsl.g:1616:5: (lv_title_7_0= ruleEString )
            // InternalMyDsl.g:1617:6: lv_title_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getBarChartAccess().getTitleEStringParserRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_13);
            lv_title_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBarChartRule());
            						}
            						set(
            							current,
            							"title",
            							lv_title_7_0,
            							"org.xtext.example.mydsl.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_39); 

            				newLeafNode(this_SEMICOLON_8, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_5_3());
            			

            }

            // InternalMyDsl.g:1639:3: (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1640:4: otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getBarChartAccess().getLegendPositionKeyword_6_0());
                    			
                    this_EQUALS_10=(Token)match(input,RULE_EQUALS,FOLLOW_30); 

                    				newLeafNode(this_EQUALS_10, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:1648:4: ( (lv_legendPosition_11_0= rulePositionOptions ) )
                    // InternalMyDsl.g:1649:5: (lv_legendPosition_11_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:1649:5: (lv_legendPosition_11_0= rulePositionOptions )
                    // InternalMyDsl.g:1650:6: lv_legendPosition_11_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getLegendPositionPositionOptionsEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_legendPosition_11_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"legendPosition",
                    							lv_legendPosition_11_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_40); 

                    				newLeafNode(this_SEMICOLON_12, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1672:3: (otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1673:4: otherlv_13= 'labelStringXAxes' this_EQUALS_14= RULE_EQUALS ( (lv_labelStringXAxes_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON
                    {
                    otherlv_13=(Token)match(input,35,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getBarChartAccess().getLabelStringXAxesKeyword_7_0());
                    			
                    this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_14, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:1681:4: ( (lv_labelStringXAxes_15_0= ruleEString ) )
                    // InternalMyDsl.g:1682:5: (lv_labelStringXAxes_15_0= ruleEString )
                    {
                    // InternalMyDsl.g:1682:5: (lv_labelStringXAxes_15_0= ruleEString )
                    // InternalMyDsl.g:1683:6: lv_labelStringXAxes_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getLabelStringXAxesEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_labelStringXAxes_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"labelStringXAxes",
                    							lv_labelStringXAxes_15_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_41); 

                    				newLeafNode(this_SEMICOLON_16, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1705:3: (otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1706:4: otherlv_17= 'colorGridLinesXAxes' this_EQUALS_18= RULE_EQUALS ( (lv_colorGridLinesXAxes_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON
                    {
                    otherlv_17=(Token)match(input,36,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getBarChartAccess().getColorGridLinesXAxesKeyword_8_0());
                    			
                    this_EQUALS_18=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_18, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_8_1());
                    			
                    // InternalMyDsl.g:1714:4: ( (lv_colorGridLinesXAxes_19_0= ruleEString ) )
                    // InternalMyDsl.g:1715:5: (lv_colorGridLinesXAxes_19_0= ruleEString )
                    {
                    // InternalMyDsl.g:1715:5: (lv_colorGridLinesXAxes_19_0= ruleEString )
                    // InternalMyDsl.g:1716:6: lv_colorGridLinesXAxes_19_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getColorGridLinesXAxesEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_colorGridLinesXAxes_19_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"colorGridLinesXAxes",
                    							lv_colorGridLinesXAxes_19_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_20=(Token)match(input,RULE_SEMICOLON,FOLLOW_42); 

                    				newLeafNode(this_SEMICOLON_20, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1738:3: (otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1739:4: otherlv_21= 'labelStringYAxes' this_EQUALS_22= RULE_EQUALS ( (lv_labelStringYAxes_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON
                    {
                    otherlv_21=(Token)match(input,37,FOLLOW_7); 

                    				newLeafNode(otherlv_21, grammarAccess.getBarChartAccess().getLabelStringYAxesKeyword_9_0());
                    			
                    this_EQUALS_22=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_22, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_9_1());
                    			
                    // InternalMyDsl.g:1747:4: ( (lv_labelStringYAxes_23_0= ruleEString ) )
                    // InternalMyDsl.g:1748:5: (lv_labelStringYAxes_23_0= ruleEString )
                    {
                    // InternalMyDsl.g:1748:5: (lv_labelStringYAxes_23_0= ruleEString )
                    // InternalMyDsl.g:1749:6: lv_labelStringYAxes_23_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getLabelStringYAxesEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_labelStringYAxes_23_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"labelStringYAxes",
                    							lv_labelStringYAxes_23_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_24=(Token)match(input,RULE_SEMICOLON,FOLLOW_43); 

                    				newLeafNode(this_SEMICOLON_24, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_9_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1771:3: (otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1772:4: otherlv_25= 'colorGridLinesYAxes' this_EQUALS_26= RULE_EQUALS ( (lv_colorGridLinesYAxes_27_0= ruleEString ) ) this_SEMICOLON_28= RULE_SEMICOLON
                    {
                    otherlv_25=(Token)match(input,38,FOLLOW_7); 

                    				newLeafNode(otherlv_25, grammarAccess.getBarChartAccess().getColorGridLinesYAxesKeyword_10_0());
                    			
                    this_EQUALS_26=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_26, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_10_1());
                    			
                    // InternalMyDsl.g:1780:4: ( (lv_colorGridLinesYAxes_27_0= ruleEString ) )
                    // InternalMyDsl.g:1781:5: (lv_colorGridLinesYAxes_27_0= ruleEString )
                    {
                    // InternalMyDsl.g:1781:5: (lv_colorGridLinesYAxes_27_0= ruleEString )
                    // InternalMyDsl.g:1782:6: lv_colorGridLinesYAxes_27_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarChartAccess().getColorGridLinesYAxesEStringParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_colorGridLinesYAxes_27_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarChartRule());
                    						}
                    						set(
                    							current,
                    							"colorGridLinesYAxes",
                    							lv_colorGridLinesYAxes_27_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_28=(Token)match(input,RULE_SEMICOLON,FOLLOW_44); 

                    				newLeafNode(this_SEMICOLON_28, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_10_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1804:3: (otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON )
            // InternalMyDsl.g:1805:4: otherlv_29= 'barPercentage' this_EQUALS_30= RULE_EQUALS ( (lv_barPercentage_31_0= ruleEFloat ) ) this_SEMICOLON_32= RULE_SEMICOLON
            {
            otherlv_29=(Token)match(input,43,FOLLOW_7); 

            				newLeafNode(otherlv_29, grammarAccess.getBarChartAccess().getBarPercentageKeyword_11_0());
            			
            this_EQUALS_30=(Token)match(input,RULE_EQUALS,FOLLOW_45); 

            				newLeafNode(this_EQUALS_30, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_11_1());
            			
            // InternalMyDsl.g:1813:4: ( (lv_barPercentage_31_0= ruleEFloat ) )
            // InternalMyDsl.g:1814:5: (lv_barPercentage_31_0= ruleEFloat )
            {
            // InternalMyDsl.g:1814:5: (lv_barPercentage_31_0= ruleEFloat )
            // InternalMyDsl.g:1815:6: lv_barPercentage_31_0= ruleEFloat
            {

            						newCompositeNode(grammarAccess.getBarChartAccess().getBarPercentageEFloatParserRuleCall_11_2_0());
            					
            pushFollow(FOLLOW_13);
            lv_barPercentage_31_0=ruleEFloat();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBarChartRule());
            						}
            						set(
            							current,
            							"barPercentage",
            							lv_barPercentage_31_0,
            							"org.xtext.example.mydsl.MyDsl.EFloat");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_32=(Token)match(input,RULE_SEMICOLON,FOLLOW_35); 

            				newLeafNode(this_SEMICOLON_32, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_11_3());
            			

            }

            // InternalMyDsl.g:1837:3: ( ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1838:4: ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) ) this_SEMICOLON_34= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:1838:4: ( (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' ) )
                    // InternalMyDsl.g:1839:5: (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' )
                    {
                    // InternalMyDsl.g:1839:5: (lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes' )
                    // InternalMyDsl.g:1840:6: lv_displayGridLinesXAxes_33_0= 'displayGridLinesXAxes'
                    {
                    lv_displayGridLinesXAxes_33_0=(Token)match(input,39,FOLLOW_13); 

                    						newLeafNode(lv_displayGridLinesXAxes_33_0, grammarAccess.getBarChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_12_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBarChartRule());
                    						}
                    						setWithLastConsumed(current, "displayGridLinesXAxes", true, "displayGridLinesXAxes");
                    					

                    }


                    }

                    this_SEMICOLON_34=(Token)match(input,RULE_SEMICOLON,FOLLOW_36); 

                    				newLeafNode(this_SEMICOLON_34, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_12_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1857:3: ( ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1858:4: ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) ) this_SEMICOLON_36= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:1858:4: ( (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' ) )
                    // InternalMyDsl.g:1859:5: (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' )
                    {
                    // InternalMyDsl.g:1859:5: (lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes' )
                    // InternalMyDsl.g:1860:6: lv_displayGridLinesYAxes_35_0= 'displayGridLinesYAxes'
                    {
                    lv_displayGridLinesYAxes_35_0=(Token)match(input,40,FOLLOW_13); 

                    						newLeafNode(lv_displayGridLinesYAxes_35_0, grammarAccess.getBarChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_13_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBarChartRule());
                    						}
                    						setWithLastConsumed(current, "displayGridLinesYAxes", true, "displayGridLinesYAxes");
                    					

                    }


                    }

                    this_SEMICOLON_36=(Token)match(input,RULE_SEMICOLON,FOLLOW_37); 

                    				newLeafNode(this_SEMICOLON_36, grammarAccess.getBarChartAccess().getSEMICOLONTerminalRuleCall_13_1());
                    			

                    }
                    break;

            }

            otherlv_37=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_37, grammarAccess.getBarChartAccess().getDataKeyword_14());
            		
            this_EQUALS_38=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_38, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_15());
            		
            this_LIST_START_39=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_39, grammarAccess.getBarChartAccess().getLIST_STARTTerminalRuleCall_16());
            		
            // InternalMyDsl.g:1889:3: ( (lv_data_40_0= ruleData ) )
            // InternalMyDsl.g:1890:4: (lv_data_40_0= ruleData )
            {
            // InternalMyDsl.g:1890:4: (lv_data_40_0= ruleData )
            // InternalMyDsl.g:1891:5: lv_data_40_0= ruleData
            {

            					newCompositeNode(grammarAccess.getBarChartAccess().getDataDataParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_40_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarChartRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_40_0,
            						"org.xtext.example.mydsl.MyDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1908:3: (this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_COMA) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:1909:4: this_COMA_41= RULE_COMA ( (lv_data_42_0= ruleData ) )
            	    {
            	    this_COMA_41=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_41, grammarAccess.getBarChartAccess().getCOMATerminalRuleCall_18_0());
            	    			
            	    // InternalMyDsl.g:1913:4: ( (lv_data_42_0= ruleData ) )
            	    // InternalMyDsl.g:1914:5: (lv_data_42_0= ruleData )
            	    {
            	    // InternalMyDsl.g:1914:5: (lv_data_42_0= ruleData )
            	    // InternalMyDsl.g:1915:6: lv_data_42_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getBarChartAccess().getDataDataParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_42_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBarChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_42_0,
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

            this_LIST_END_43=(Token)match(input,RULE_LIST_END,FOLLOW_38); 

            			newLeafNode(this_LIST_END_43, grammarAccess.getBarChartAccess().getLIST_ENDTerminalRuleCall_19());
            		
            otherlv_44=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_44, grammarAccess.getBarChartAccess().getLabelsKeyword_20());
            		
            this_EQUALS_45=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_45, grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_21());
            		
            this_LIST_START_46=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_46, grammarAccess.getBarChartAccess().getLIST_STARTTerminalRuleCall_22());
            		
            // InternalMyDsl.g:1949:3: ( (lv_labels_47_0= ruleLabel ) )
            // InternalMyDsl.g:1950:4: (lv_labels_47_0= ruleLabel )
            {
            // InternalMyDsl.g:1950:4: (lv_labels_47_0= ruleLabel )
            // InternalMyDsl.g:1951:5: lv_labels_47_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getBarChartAccess().getLabelsLabelParserRuleCall_23_0());
            				
            pushFollow(FOLLOW_9);
            lv_labels_47_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarChartRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_47_0,
            						"org.xtext.example.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1968:3: (this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_COMA) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:1969:4: this_COMA_48= RULE_COMA ( (lv_labels_49_0= ruleLabel ) )
            	    {
            	    this_COMA_48=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_48, grammarAccess.getBarChartAccess().getCOMATerminalRuleCall_24_0());
            	    			
            	    // InternalMyDsl.g:1973:4: ( (lv_labels_49_0= ruleLabel ) )
            	    // InternalMyDsl.g:1974:5: (lv_labels_49_0= ruleLabel )
            	    {
            	    // InternalMyDsl.g:1974:5: (lv_labels_49_0= ruleLabel )
            	    // InternalMyDsl.g:1975:6: lv_labels_49_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getBarChartAccess().getLabelsLabelParserRuleCall_24_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_labels_49_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBarChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_49_0,
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

            this_LIST_END_50=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_50, grammarAccess.getBarChartAccess().getLIST_ENDTerminalRuleCall_25());
            		
            this_OBJECT_END_51=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_51, grammarAccess.getBarChartAccess().getOBJECT_ENDTerminalRuleCall_26());
            		

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
    // InternalMyDsl.g:2005:1: entryRuleRadarChart returns [EObject current=null] : iv_ruleRadarChart= ruleRadarChart EOF ;
    public final EObject entryRuleRadarChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadarChart = null;


        try {
            // InternalMyDsl.g:2005:51: (iv_ruleRadarChart= ruleRadarChart EOF )
            // InternalMyDsl.g:2006:2: iv_ruleRadarChart= ruleRadarChart EOF
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
    // InternalMyDsl.g:2012:1: ruleRadarChart returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? ( ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON ) otherlv_15= 'data' this_EQUALS_16= RULE_EQUALS this_LIST_START_17= RULE_LIST_START ( (lv_data_18_0= ruleData ) ) (this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) ) )* this_LIST_END_21= RULE_LIST_END otherlv_22= 'labels' this_EQUALS_23= RULE_EQUALS this_LIST_START_24= RULE_LIST_START ( (lv_labels_25_0= ruleLabel ) ) (this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) ) )* this_LIST_END_28= RULE_LIST_END this_OBJECT_END_29= RULE_OBJECT_END ) ;
    public final EObject ruleRadarChart() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Token this_EQUALS_10=null;
        Token this_SEMICOLON_12=null;
        Token lv_angleLinesDisplay_13_0=null;
        Token this_SEMICOLON_14=null;
        Token otherlv_15=null;
        Token this_EQUALS_16=null;
        Token this_LIST_START_17=null;
        Token this_COMA_19=null;
        Token this_LIST_END_21=null;
        Token otherlv_22=null;
        Token this_EQUALS_23=null;
        Token this_LIST_START_24=null;
        Token this_COMA_26=null;
        Token this_LIST_END_28=null;
        Token this_OBJECT_END_29=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        Enumerator lv_legendPosition_11_0 = null;

        EObject lv_data_18_0 = null;

        EObject lv_data_20_0 = null;

        EObject lv_labels_25_0 = null;

        EObject lv_labels_27_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2018:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? ( ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON ) otherlv_15= 'data' this_EQUALS_16= RULE_EQUALS this_LIST_START_17= RULE_LIST_START ( (lv_data_18_0= ruleData ) ) (this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) ) )* this_LIST_END_21= RULE_LIST_END otherlv_22= 'labels' this_EQUALS_23= RULE_EQUALS this_LIST_START_24= RULE_LIST_START ( (lv_labels_25_0= ruleLabel ) ) (this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) ) )* this_LIST_END_28= RULE_LIST_END this_OBJECT_END_29= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2019:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? ( ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON ) otherlv_15= 'data' this_EQUALS_16= RULE_EQUALS this_LIST_START_17= RULE_LIST_START ( (lv_data_18_0= ruleData ) ) (this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) ) )* this_LIST_END_21= RULE_LIST_END otherlv_22= 'labels' this_EQUALS_23= RULE_EQUALS this_LIST_START_24= RULE_LIST_START ( (lv_labels_25_0= ruleLabel ) ) (this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) ) )* this_LIST_END_28= RULE_LIST_END this_OBJECT_END_29= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2019:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? ( ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON ) otherlv_15= 'data' this_EQUALS_16= RULE_EQUALS this_LIST_START_17= RULE_LIST_START ( (lv_data_18_0= ruleData ) ) (this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) ) )* this_LIST_END_21= RULE_LIST_END otherlv_22= 'labels' this_EQUALS_23= RULE_EQUALS this_LIST_START_24= RULE_LIST_START ( (lv_labels_25_0= ruleLabel ) ) (this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) ) )* this_LIST_END_28= RULE_LIST_END this_OBJECT_END_29= RULE_OBJECT_END )
            // InternalMyDsl.g:2020:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON ) (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )? ( ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON ) otherlv_15= 'data' this_EQUALS_16= RULE_EQUALS this_LIST_START_17= RULE_LIST_START ( (lv_data_18_0= ruleData ) ) (this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) ) )* this_LIST_END_21= RULE_LIST_END otherlv_22= 'labels' this_EQUALS_23= RULE_EQUALS this_LIST_START_24= RULE_LIST_START ( (lv_labels_25_0= ruleLabel ) ) (this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) ) )* this_LIST_END_28= RULE_LIST_END this_OBJECT_END_29= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getRadarChartAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRadarChartAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:2032:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:2033:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:2033:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:2034:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRadarChartAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadarChartRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_28); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getRadarChartAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:2055:3: (otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // InternalMyDsl.g:2056:4: otherlv_5= 'title' this_EQUALS_6= RULE_EQUALS ( (lv_title_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            otherlv_5=(Token)match(input,25,FOLLOW_7); 

            				newLeafNode(otherlv_5, grammarAccess.getRadarChartAccess().getTitleKeyword_5_0());
            			
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            				newLeafNode(this_EQUALS_6, grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_5_1());
            			
            // InternalMyDsl.g:2064:4: ( (lv_title_7_0= ruleEString ) )
            // InternalMyDsl.g:2065:5: (lv_title_7_0= ruleEString )
            {
            // InternalMyDsl.g:2065:5: (lv_title_7_0= ruleEString )
            // InternalMyDsl.g:2066:6: lv_title_7_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getRadarChartAccess().getTitleEStringParserRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_13);
            lv_title_7_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRadarChartRule());
            						}
            						set(
            							current,
            							"title",
            							lv_title_7_0,
            							"org.xtext.example.mydsl.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_46); 

            				newLeafNode(this_SEMICOLON_8, grammarAccess.getRadarChartAccess().getSEMICOLONTerminalRuleCall_5_3());
            			

            }

            // InternalMyDsl.g:2088:3: (otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:2089:4: otherlv_9= 'legendPosition' this_EQUALS_10= RULE_EQUALS ( (lv_legendPosition_11_0= rulePositionOptions ) ) this_SEMICOLON_12= RULE_SEMICOLON
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getRadarChartAccess().getLegendPositionKeyword_6_0());
                    			
                    this_EQUALS_10=(Token)match(input,RULE_EQUALS,FOLLOW_30); 

                    				newLeafNode(this_EQUALS_10, grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:2097:4: ( (lv_legendPosition_11_0= rulePositionOptions ) )
                    // InternalMyDsl.g:2098:5: (lv_legendPosition_11_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:2098:5: (lv_legendPosition_11_0= rulePositionOptions )
                    // InternalMyDsl.g:2099:6: lv_legendPosition_11_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getRadarChartAccess().getLegendPositionPositionOptionsEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_legendPosition_11_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRadarChartRule());
                    						}
                    						set(
                    							current,
                    							"legendPosition",
                    							lv_legendPosition_11_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_47); 

                    				newLeafNode(this_SEMICOLON_12, grammarAccess.getRadarChartAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2121:3: ( ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON )
            // InternalMyDsl.g:2122:4: ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) ) this_SEMICOLON_14= RULE_SEMICOLON
            {
            // InternalMyDsl.g:2122:4: ( (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' ) )
            // InternalMyDsl.g:2123:5: (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' )
            {
            // InternalMyDsl.g:2123:5: (lv_angleLinesDisplay_13_0= 'angleLinesDisplay' )
            // InternalMyDsl.g:2124:6: lv_angleLinesDisplay_13_0= 'angleLinesDisplay'
            {
            lv_angleLinesDisplay_13_0=(Token)match(input,44,FOLLOW_13); 

            						newLeafNode(lv_angleLinesDisplay_13_0, grammarAccess.getRadarChartAccess().getAngleLinesDisplayAngleLinesDisplayKeyword_7_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getRadarChartRule());
            						}
            						setWithLastConsumed(current, "angleLinesDisplay", true, "angleLinesDisplay");
            					

            }


            }

            this_SEMICOLON_14=(Token)match(input,RULE_SEMICOLON,FOLLOW_37); 

            				newLeafNode(this_SEMICOLON_14, grammarAccess.getRadarChartAccess().getSEMICOLONTerminalRuleCall_7_1());
            			

            }

            otherlv_15=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getRadarChartAccess().getDataKeyword_8());
            		
            this_EQUALS_16=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_16, grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_9());
            		
            this_LIST_START_17=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_17, grammarAccess.getRadarChartAccess().getLIST_STARTTerminalRuleCall_10());
            		
            // InternalMyDsl.g:2153:3: ( (lv_data_18_0= ruleData ) )
            // InternalMyDsl.g:2154:4: (lv_data_18_0= ruleData )
            {
            // InternalMyDsl.g:2154:4: (lv_data_18_0= ruleData )
            // InternalMyDsl.g:2155:5: lv_data_18_0= ruleData
            {

            					newCompositeNode(grammarAccess.getRadarChartAccess().getDataDataParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_18_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadarChartRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_18_0,
            						"org.xtext.example.mydsl.MyDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2172:3: (this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_COMA) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:2173:4: this_COMA_19= RULE_COMA ( (lv_data_20_0= ruleData ) )
            	    {
            	    this_COMA_19=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_19, grammarAccess.getRadarChartAccess().getCOMATerminalRuleCall_12_0());
            	    			
            	    // InternalMyDsl.g:2177:4: ( (lv_data_20_0= ruleData ) )
            	    // InternalMyDsl.g:2178:5: (lv_data_20_0= ruleData )
            	    {
            	    // InternalMyDsl.g:2178:5: (lv_data_20_0= ruleData )
            	    // InternalMyDsl.g:2179:6: lv_data_20_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getRadarChartAccess().getDataDataParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_20_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRadarChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_20_0,
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

            this_LIST_END_21=(Token)match(input,RULE_LIST_END,FOLLOW_38); 

            			newLeafNode(this_LIST_END_21, grammarAccess.getRadarChartAccess().getLIST_ENDTerminalRuleCall_13());
            		
            otherlv_22=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_22, grammarAccess.getRadarChartAccess().getLabelsKeyword_14());
            		
            this_EQUALS_23=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_23, grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_15());
            		
            this_LIST_START_24=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_24, grammarAccess.getRadarChartAccess().getLIST_STARTTerminalRuleCall_16());
            		
            // InternalMyDsl.g:2213:3: ( (lv_labels_25_0= ruleLabel ) )
            // InternalMyDsl.g:2214:4: (lv_labels_25_0= ruleLabel )
            {
            // InternalMyDsl.g:2214:4: (lv_labels_25_0= ruleLabel )
            // InternalMyDsl.g:2215:5: lv_labels_25_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getRadarChartAccess().getLabelsLabelParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_9);
            lv_labels_25_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadarChartRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_25_0,
            						"org.xtext.example.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2232:3: (this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_COMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:2233:4: this_COMA_26= RULE_COMA ( (lv_labels_27_0= ruleLabel ) )
            	    {
            	    this_COMA_26=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_26, grammarAccess.getRadarChartAccess().getCOMATerminalRuleCall_18_0());
            	    			
            	    // InternalMyDsl.g:2237:4: ( (lv_labels_27_0= ruleLabel ) )
            	    // InternalMyDsl.g:2238:5: (lv_labels_27_0= ruleLabel )
            	    {
            	    // InternalMyDsl.g:2238:5: (lv_labels_27_0= ruleLabel )
            	    // InternalMyDsl.g:2239:6: lv_labels_27_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getRadarChartAccess().getLabelsLabelParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_labels_27_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRadarChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_27_0,
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

            this_LIST_END_28=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_28, grammarAccess.getRadarChartAccess().getLIST_ENDTerminalRuleCall_19());
            		
            this_OBJECT_END_29=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_29, grammarAccess.getRadarChartAccess().getOBJECT_ENDTerminalRuleCall_20());
            		

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
    // InternalMyDsl.g:2269:1: entryRulePieChart returns [EObject current=null] : iv_rulePieChart= rulePieChart EOF ;
    public final EObject entryRulePieChart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePieChart = null;


        try {
            // InternalMyDsl.g:2269:49: (iv_rulePieChart= rulePieChart EOF )
            // InternalMyDsl.g:2270:2: iv_rulePieChart= rulePieChart EOF
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
    // InternalMyDsl.g:2276:1: rulePieChart returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIECHART' otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? otherlv_14= 'data' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_data_17_0= ruleData ) ) (this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) ) )* this_LIST_END_20= RULE_LIST_END otherlv_21= 'labels' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_labels_24_0= ruleLabel ) ) (this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END ) ;
    public final EObject rulePieChart() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMICOLON_9=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_SEMICOLON_13=null;
        Token otherlv_14=null;
        Token this_EQUALS_15=null;
        Token this_LIST_START_16=null;
        Token this_COMA_18=null;
        Token this_LIST_END_20=null;
        Token otherlv_21=null;
        Token this_EQUALS_22=null;
        Token this_LIST_START_23=null;
        Token this_COMA_25=null;
        Token this_LIST_END_27=null;
        Token this_OBJECT_END_28=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_title_8_0 = null;

        Enumerator lv_legendPosition_12_0 = null;

        EObject lv_data_17_0 = null;

        EObject lv_data_19_0 = null;

        EObject lv_labels_24_0 = null;

        EObject lv_labels_26_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2282:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIECHART' otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? otherlv_14= 'data' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_data_17_0= ruleData ) ) (this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) ) )* this_LIST_END_20= RULE_LIST_END otherlv_21= 'labels' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_labels_24_0= ruleLabel ) ) (this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2283:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIECHART' otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? otherlv_14= 'data' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_data_17_0= ruleData ) ) (this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) ) )* this_LIST_END_20= RULE_LIST_END otherlv_21= 'labels' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_labels_24_0= ruleLabel ) ) (this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2283:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIECHART' otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? otherlv_14= 'data' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_data_17_0= ruleData ) ) (this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) ) )* this_LIST_END_20= RULE_LIST_END otherlv_21= 'labels' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_labels_24_0= ruleLabel ) ) (this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END )
            // InternalMyDsl.g:2284:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'PIECHART' otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? otherlv_14= 'data' this_EQUALS_15= RULE_EQUALS this_LIST_START_16= RULE_LIST_START ( (lv_data_17_0= ruleData ) ) (this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) ) )* this_LIST_END_20= RULE_LIST_END otherlv_21= 'labels' this_EQUALS_22= RULE_EQUALS this_LIST_START_23= RULE_LIST_START ( (lv_labels_24_0= ruleLabel ) ) (this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) ) )* this_LIST_END_27= RULE_LIST_END this_OBJECT_END_28= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_48); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getPieChartAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getPieChartAccess().getPIECHARTKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPieChartAccess().getNameKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:2300:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:2301:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:2301:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:2302:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPieChartAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieChartRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_49); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getPieChartAccess().getSEMICOLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:2323:3: (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2324:4: otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getPieChartAccess().getTitleKeyword_6_0());
                    			
                    this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_7, grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:2332:4: ( (lv_title_8_0= ruleEString ) )
                    // InternalMyDsl.g:2333:5: (lv_title_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:2333:5: (lv_title_8_0= ruleEString )
                    // InternalMyDsl.g:2334:6: lv_title_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPieChartAccess().getTitleEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPieChartRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_9=(Token)match(input,RULE_SEMICOLON,FOLLOW_50); 

                    				newLeafNode(this_SEMICOLON_9, grammarAccess.getPieChartAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2356:3: (otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:2357:4: otherlv_10= 'legendPosition' this_EQUALS_11= RULE_EQUALS ( (lv_legendPosition_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getPieChartAccess().getLegendPositionKeyword_7_0());
                    			
                    this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_30); 

                    				newLeafNode(this_EQUALS_11, grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:2365:4: ( (lv_legendPosition_12_0= rulePositionOptions ) )
                    // InternalMyDsl.g:2366:5: (lv_legendPosition_12_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:2366:5: (lv_legendPosition_12_0= rulePositionOptions )
                    // InternalMyDsl.g:2367:6: lv_legendPosition_12_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getPieChartAccess().getLegendPositionPositionOptionsEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_legendPosition_12_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPieChartRule());
                    						}
                    						set(
                    							current,
                    							"legendPosition",
                    							lv_legendPosition_12_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_13=(Token)match(input,RULE_SEMICOLON,FOLLOW_37); 

                    				newLeafNode(this_SEMICOLON_13, grammarAccess.getPieChartAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getPieChartAccess().getDataKeyword_8());
            		
            this_EQUALS_15=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_15, grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_9());
            		
            this_LIST_START_16=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_16, grammarAccess.getPieChartAccess().getLIST_STARTTerminalRuleCall_10());
            		
            // InternalMyDsl.g:2401:3: ( (lv_data_17_0= ruleData ) )
            // InternalMyDsl.g:2402:4: (lv_data_17_0= ruleData )
            {
            // InternalMyDsl.g:2402:4: (lv_data_17_0= ruleData )
            // InternalMyDsl.g:2403:5: lv_data_17_0= ruleData
            {

            					newCompositeNode(grammarAccess.getPieChartAccess().getDataDataParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_9);
            lv_data_17_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieChartRule());
            					}
            					add(
            						current,
            						"data",
            						lv_data_17_0,
            						"org.xtext.example.mydsl.MyDsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2420:3: (this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_COMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMyDsl.g:2421:4: this_COMA_18= RULE_COMA ( (lv_data_19_0= ruleData ) )
            	    {
            	    this_COMA_18=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_18, grammarAccess.getPieChartAccess().getCOMATerminalRuleCall_12_0());
            	    			
            	    // InternalMyDsl.g:2425:4: ( (lv_data_19_0= ruleData ) )
            	    // InternalMyDsl.g:2426:5: (lv_data_19_0= ruleData )
            	    {
            	    // InternalMyDsl.g:2426:5: (lv_data_19_0= ruleData )
            	    // InternalMyDsl.g:2427:6: lv_data_19_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getPieChartAccess().getDataDataParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_data_19_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPieChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_19_0,
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

            this_LIST_END_20=(Token)match(input,RULE_LIST_END,FOLLOW_38); 

            			newLeafNode(this_LIST_END_20, grammarAccess.getPieChartAccess().getLIST_ENDTerminalRuleCall_13());
            		
            otherlv_21=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_21, grammarAccess.getPieChartAccess().getLabelsKeyword_14());
            		
            this_EQUALS_22=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_22, grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_15());
            		
            this_LIST_START_23=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_23, grammarAccess.getPieChartAccess().getLIST_STARTTerminalRuleCall_16());
            		
            // InternalMyDsl.g:2461:3: ( (lv_labels_24_0= ruleLabel ) )
            // InternalMyDsl.g:2462:4: (lv_labels_24_0= ruleLabel )
            {
            // InternalMyDsl.g:2462:4: (lv_labels_24_0= ruleLabel )
            // InternalMyDsl.g:2463:5: lv_labels_24_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getPieChartAccess().getLabelsLabelParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_9);
            lv_labels_24_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPieChartRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_24_0,
            						"org.xtext.example.mydsl.MyDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2480:3: (this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_COMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyDsl.g:2481:4: this_COMA_25= RULE_COMA ( (lv_labels_26_0= ruleLabel ) )
            	    {
            	    this_COMA_25=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_25, grammarAccess.getPieChartAccess().getCOMATerminalRuleCall_18_0());
            	    			
            	    // InternalMyDsl.g:2485:4: ( (lv_labels_26_0= ruleLabel ) )
            	    // InternalMyDsl.g:2486:5: (lv_labels_26_0= ruleLabel )
            	    {
            	    // InternalMyDsl.g:2486:5: (lv_labels_26_0= ruleLabel )
            	    // InternalMyDsl.g:2487:6: lv_labels_26_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getPieChartAccess().getLabelsLabelParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_labels_26_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPieChartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_26_0,
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

            this_LIST_END_27=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_27, grammarAccess.getPieChartAccess().getLIST_ENDTerminalRuleCall_19());
            		
            this_OBJECT_END_28=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_28, grammarAccess.getPieChartAccess().getOBJECT_ENDTerminalRuleCall_20());
            		

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
    // InternalMyDsl.g:2517:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:2517:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:2518:2: iv_ruleAction= ruleAction EOF
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
    // InternalMyDsl.g:2524:1: ruleAction returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_delete_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMICOLON_9=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_SEMICOLON_13=null;
        Token lv_add_14_0=null;
        Token this_SEMICOLON_15=null;
        Token lv_filter_16_0=null;
        Token this_SEMICOLON_17=null;
        Token lv_edit_18_0=null;
        Token this_SEMICOLON_19=null;
        Token lv_delete_20_0=null;
        Token this_SEMICOLON_21=null;
        Token this_OBJECT_END_22=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_columnTitle_8_0 = null;

        Enumerator lv_position_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2530:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_delete_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2531:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_delete_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2531:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_delete_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END )
            // InternalMyDsl.g:2532:3: () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? ( ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON )? ( ( (lv_delete_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON )? this_OBJECT_END_22= RULE_OBJECT_END
            {
            // InternalMyDsl.g:2532:3: ()
            // InternalMyDsl.g:2533:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getActionAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getNameKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getActionAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:2551:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:2552:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:2552:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:2553:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_51); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:2574:3: (otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:2575:4: otherlv_6= 'columnTitle' this_EQUALS_7= RULE_EQUALS ( (lv_columnTitle_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getColumnTitleKeyword_6_0());
                    			
                    this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_7, grammarAccess.getActionAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:2583:4: ( (lv_columnTitle_8_0= ruleEString ) )
                    // InternalMyDsl.g:2584:5: (lv_columnTitle_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:2584:5: (lv_columnTitle_8_0= ruleEString )
                    // InternalMyDsl.g:2585:6: lv_columnTitle_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getColumnTitleEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_columnTitle_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"columnTitle",
                    							lv_columnTitle_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_9=(Token)match(input,RULE_SEMICOLON,FOLLOW_52); 

                    				newLeafNode(this_SEMICOLON_9, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2607:3: (otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2608:4: otherlv_10= 'position' this_EQUALS_11= RULE_EQUALS ( (lv_position_12_0= rulePositionOptions ) ) this_SEMICOLON_13= RULE_SEMICOLON
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getActionAccess().getPositionKeyword_7_0());
                    			
                    this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_30); 

                    				newLeafNode(this_EQUALS_11, grammarAccess.getActionAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:2616:4: ( (lv_position_12_0= rulePositionOptions ) )
                    // InternalMyDsl.g:2617:5: (lv_position_12_0= rulePositionOptions )
                    {
                    // InternalMyDsl.g:2617:5: (lv_position_12_0= rulePositionOptions )
                    // InternalMyDsl.g:2618:6: lv_position_12_0= rulePositionOptions
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getPositionPositionOptionsEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_position_12_0=rulePositionOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_12_0,
                    							"org.xtext.example.mydsl.MyDsl.PositionOptions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_13=(Token)match(input,RULE_SEMICOLON,FOLLOW_53); 

                    				newLeafNode(this_SEMICOLON_13, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2640:3: ( ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==29) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2641:4: ( (lv_add_14_0= 'add' ) ) this_SEMICOLON_15= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:2641:4: ( (lv_add_14_0= 'add' ) )
                    // InternalMyDsl.g:2642:5: (lv_add_14_0= 'add' )
                    {
                    // InternalMyDsl.g:2642:5: (lv_add_14_0= 'add' )
                    // InternalMyDsl.g:2643:6: lv_add_14_0= 'add'
                    {
                    lv_add_14_0=(Token)match(input,29,FOLLOW_13); 

                    						newLeafNode(lv_add_14_0, grammarAccess.getActionAccess().getAddAddKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "add", true, "add");
                    					

                    }


                    }

                    this_SEMICOLON_15=(Token)match(input,RULE_SEMICOLON,FOLLOW_54); 

                    				newLeafNode(this_SEMICOLON_15, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_8_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2660:3: ( ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2661:4: ( (lv_filter_16_0= 'filter' ) ) this_SEMICOLON_17= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:2661:4: ( (lv_filter_16_0= 'filter' ) )
                    // InternalMyDsl.g:2662:5: (lv_filter_16_0= 'filter' )
                    {
                    // InternalMyDsl.g:2662:5: (lv_filter_16_0= 'filter' )
                    // InternalMyDsl.g:2663:6: lv_filter_16_0= 'filter'
                    {
                    lv_filter_16_0=(Token)match(input,48,FOLLOW_13); 

                    						newLeafNode(lv_filter_16_0, grammarAccess.getActionAccess().getFilterFilterKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "filter", true, "filter");
                    					

                    }


                    }

                    this_SEMICOLON_17=(Token)match(input,RULE_SEMICOLON,FOLLOW_55); 

                    				newLeafNode(this_SEMICOLON_17, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_9_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2680:3: ( ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2681:4: ( (lv_edit_18_0= 'edit' ) ) this_SEMICOLON_19= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:2681:4: ( (lv_edit_18_0= 'edit' ) )
                    // InternalMyDsl.g:2682:5: (lv_edit_18_0= 'edit' )
                    {
                    // InternalMyDsl.g:2682:5: (lv_edit_18_0= 'edit' )
                    // InternalMyDsl.g:2683:6: lv_edit_18_0= 'edit'
                    {
                    lv_edit_18_0=(Token)match(input,49,FOLLOW_13); 

                    						newLeafNode(lv_edit_18_0, grammarAccess.getActionAccess().getEditEditKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "edit", true, "edit");
                    					

                    }


                    }

                    this_SEMICOLON_19=(Token)match(input,RULE_SEMICOLON,FOLLOW_56); 

                    				newLeafNode(this_SEMICOLON_19, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_10_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2700:3: ( ( (lv_delete_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==50) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:2701:4: ( (lv_delete_20_0= 'delete' ) ) this_SEMICOLON_21= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:2701:4: ( (lv_delete_20_0= 'delete' ) )
                    // InternalMyDsl.g:2702:5: (lv_delete_20_0= 'delete' )
                    {
                    // InternalMyDsl.g:2702:5: (lv_delete_20_0= 'delete' )
                    // InternalMyDsl.g:2703:6: lv_delete_20_0= 'delete'
                    {
                    lv_delete_20_0=(Token)match(input,50,FOLLOW_13); 

                    						newLeafNode(lv_delete_20_0, grammarAccess.getActionAccess().getDeleteDeleteKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "delete", true, "delete");
                    					

                    }


                    }

                    this_SEMICOLON_21=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

                    				newLeafNode(this_SEMICOLON_21, grammarAccess.getActionAccess().getSEMICOLONTerminalRuleCall_11_1());
                    			

                    }
                    break;

            }

            this_OBJECT_END_22=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_22, grammarAccess.getActionAccess().getOBJECT_ENDTerminalRuleCall_12());
            		

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
    // InternalMyDsl.g:2728:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMyDsl.g:2728:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMyDsl.g:2729:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalMyDsl.g:2735:1: ruleColumn returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_filter_14_0= 'filter' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_editable_16_0= 'editable' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? this_OBJECT_END_18= RULE_OBJECT_END ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMICOLON_9=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_SEMICOLON_13=null;
        Token lv_filter_14_0=null;
        Token this_SEMICOLON_15=null;
        Token lv_editable_16_0=null;
        Token this_SEMICOLON_17=null;
        Token this_OBJECT_END_18=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_title_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2741:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_filter_14_0= 'filter' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_editable_16_0= 'editable' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? this_OBJECT_END_18= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2742:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_filter_14_0= 'filter' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_editable_16_0= 'editable' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? this_OBJECT_END_18= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2742:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_filter_14_0= 'filter' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_editable_16_0= 'editable' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? this_OBJECT_END_18= RULE_OBJECT_END )
            // InternalMyDsl.g:2743:3: () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )? (otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )? ( ( (lv_filter_14_0= 'filter' ) ) this_SEMICOLON_15= RULE_SEMICOLON )? ( ( (lv_editable_16_0= 'editable' ) ) this_SEMICOLON_17= RULE_SEMICOLON )? this_OBJECT_END_18= RULE_OBJECT_END
            {
            // InternalMyDsl.g:2743:3: ()
            // InternalMyDsl.g:2744:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getColumnAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getNameKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getColumnAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:2762:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:2763:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:2763:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:2764:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_57); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getColumnAccess().getSEMICOLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:2785:3: (otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==25) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:2786:4: otherlv_6= 'title' this_EQUALS_7= RULE_EQUALS ( (lv_title_8_0= ruleEString ) ) this_SEMICOLON_9= RULE_SEMICOLON
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getTitleKeyword_6_0());
                    			
                    this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_7, grammarAccess.getColumnAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:2794:4: ( (lv_title_8_0= ruleEString ) )
                    // InternalMyDsl.g:2795:5: (lv_title_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:2795:5: (lv_title_8_0= ruleEString )
                    // InternalMyDsl.g:2796:6: lv_title_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getTitleEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_9=(Token)match(input,RULE_SEMICOLON,FOLLOW_58); 

                    				newLeafNode(this_SEMICOLON_9, grammarAccess.getColumnAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2818:3: (otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:2819:4: otherlv_10= 'source' this_EQUALS_11= RULE_EQUALS ( ( ruleEString ) ) this_SEMICOLON_13= RULE_SEMICOLON
                    {
                    otherlv_10=(Token)match(input,51,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getColumnAccess().getSourceKeyword_7_0());
                    			
                    this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_11, grammarAccess.getColumnAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:2827:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2828:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2828:5: ( ruleEString )
                    // InternalMyDsl.g:2829:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getColumnAccess().getSourceCollectionCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_13=(Token)match(input,RULE_SEMICOLON,FOLLOW_59); 

                    				newLeafNode(this_SEMICOLON_13, grammarAccess.getColumnAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2848:3: ( ( (lv_filter_14_0= 'filter' ) ) this_SEMICOLON_15= RULE_SEMICOLON )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==48) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:2849:4: ( (lv_filter_14_0= 'filter' ) ) this_SEMICOLON_15= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:2849:4: ( (lv_filter_14_0= 'filter' ) )
                    // InternalMyDsl.g:2850:5: (lv_filter_14_0= 'filter' )
                    {
                    // InternalMyDsl.g:2850:5: (lv_filter_14_0= 'filter' )
                    // InternalMyDsl.g:2851:6: lv_filter_14_0= 'filter'
                    {
                    lv_filter_14_0=(Token)match(input,48,FOLLOW_13); 

                    						newLeafNode(lv_filter_14_0, grammarAccess.getColumnAccess().getFilterFilterKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    						setWithLastConsumed(current, "filter", true, "filter");
                    					

                    }


                    }

                    this_SEMICOLON_15=(Token)match(input,RULE_SEMICOLON,FOLLOW_60); 

                    				newLeafNode(this_SEMICOLON_15, grammarAccess.getColumnAccess().getSEMICOLONTerminalRuleCall_8_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2868:3: ( ( (lv_editable_16_0= 'editable' ) ) this_SEMICOLON_17= RULE_SEMICOLON )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==52) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2869:4: ( (lv_editable_16_0= 'editable' ) ) this_SEMICOLON_17= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:2869:4: ( (lv_editable_16_0= 'editable' ) )
                    // InternalMyDsl.g:2870:5: (lv_editable_16_0= 'editable' )
                    {
                    // InternalMyDsl.g:2870:5: (lv_editable_16_0= 'editable' )
                    // InternalMyDsl.g:2871:6: lv_editable_16_0= 'editable'
                    {
                    lv_editable_16_0=(Token)match(input,52,FOLLOW_13); 

                    						newLeafNode(lv_editable_16_0, grammarAccess.getColumnAccess().getEditableEditableKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    						setWithLastConsumed(current, "editable", true, "editable");
                    					

                    }


                    }

                    this_SEMICOLON_17=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

                    				newLeafNode(this_SEMICOLON_17, grammarAccess.getColumnAccess().getSEMICOLONTerminalRuleCall_9_1());
                    			

                    }
                    break;

            }

            this_OBJECT_END_18=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_18, grammarAccess.getColumnAccess().getOBJECT_ENDTerminalRuleCall_10());
            		

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
    // InternalMyDsl.g:2896:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalMyDsl.g:2896:45: (iv_ruleData= ruleData EOF )
            // InternalMyDsl.g:2897:2: iv_ruleData= ruleData EOF
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
    // InternalMyDsl.g:2903:1: ruleData returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON )? ( ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON )? otherlv_23= 'data' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( ( ruleEString ) ) (this_COMA_27= RULE_COMA ( ( ruleEString ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Token this_EQUALS_10=null;
        Token this_SEMICOLON_12=null;
        Token otherlv_13=null;
        Token this_EQUALS_14=null;
        Token this_SEMICOLON_16=null;
        Token otherlv_17=null;
        Token this_EQUALS_18=null;
        Token this_SEMICOLON_20=null;
        Token lv_fill_21_0=null;
        Token this_SEMICOLON_22=null;
        Token otherlv_23=null;
        Token this_EQUALS_24=null;
        Token this_LIST_START_25=null;
        Token this_COMA_27=null;
        Token this_LIST_END_29=null;
        Token this_OBJECT_END_30=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_category_7_0 = null;

        Enumerator lv_borderColor_11_0 = null;

        Enumerator lv_backgroundColor_15_0 = null;

        AntlrDatatypeRuleToken lv_borderDash_19_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2909:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON )? ( ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON )? otherlv_23= 'data' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( ( ruleEString ) ) (this_COMA_27= RULE_COMA ( ( ruleEString ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END ) )
            // InternalMyDsl.g:2910:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON )? ( ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON )? otherlv_23= 'data' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( ( ruleEString ) ) (this_COMA_27= RULE_COMA ( ( ruleEString ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2910:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON )? ( ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON )? otherlv_23= 'data' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( ( ruleEString ) ) (this_COMA_27= RULE_COMA ( ( ruleEString ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END )
            // InternalMyDsl.g:2911:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON )? (otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON )? ( ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON )? otherlv_23= 'data' this_EQUALS_24= RULE_EQUALS this_LIST_START_25= RULE_LIST_START ( ( ruleEString ) ) (this_COMA_27= RULE_COMA ( ( ruleEString ) ) )* this_LIST_END_29= RULE_LIST_END this_OBJECT_END_30= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getDataAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getDataAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:2923:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:2924:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:2924:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:2925:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_61); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getDataAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:2946:3: (otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==53) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:2947:4: otherlv_5= 'category' this_EQUALS_6= RULE_EQUALS ( (lv_category_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON
                    {
                    otherlv_5=(Token)match(input,53,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getDataAccess().getCategoryKeyword_5_0());
                    			
                    this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_6, grammarAccess.getDataAccess().getEQUALSTerminalRuleCall_5_1());
                    			
                    // InternalMyDsl.g:2955:4: ( (lv_category_7_0= ruleEString ) )
                    // InternalMyDsl.g:2956:5: (lv_category_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:2956:5: (lv_category_7_0= ruleEString )
                    // InternalMyDsl.g:2957:6: lv_category_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getCategoryEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_category_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						set(
                    							current,
                    							"category",
                    							lv_category_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_62); 

                    				newLeafNode(this_SEMICOLON_8, grammarAccess.getDataAccess().getSEMICOLONTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2979:3: (otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==54) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:2980:4: otherlv_9= 'borderColor' this_EQUALS_10= RULE_EQUALS ( (lv_borderColor_11_0= ruleColors ) ) this_SEMICOLON_12= RULE_SEMICOLON
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getDataAccess().getBorderColorKeyword_6_0());
                    			
                    this_EQUALS_10=(Token)match(input,RULE_EQUALS,FOLLOW_63); 

                    				newLeafNode(this_EQUALS_10, grammarAccess.getDataAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:2988:4: ( (lv_borderColor_11_0= ruleColors ) )
                    // InternalMyDsl.g:2989:5: (lv_borderColor_11_0= ruleColors )
                    {
                    // InternalMyDsl.g:2989:5: (lv_borderColor_11_0= ruleColors )
                    // InternalMyDsl.g:2990:6: lv_borderColor_11_0= ruleColors
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getBorderColorColorsEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_borderColor_11_0=ruleColors();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						set(
                    							current,
                    							"borderColor",
                    							lv_borderColor_11_0,
                    							"org.xtext.example.mydsl.MyDsl.Colors");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_64); 

                    				newLeafNode(this_SEMICOLON_12, grammarAccess.getDataAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3012:3: (otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==55) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:3013:4: otherlv_13= 'backgroundColor' this_EQUALS_14= RULE_EQUALS ( (lv_backgroundColor_15_0= ruleColors ) ) this_SEMICOLON_16= RULE_SEMICOLON
                    {
                    otherlv_13=(Token)match(input,55,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getDataAccess().getBackgroundColorKeyword_7_0());
                    			
                    this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_63); 

                    				newLeafNode(this_EQUALS_14, grammarAccess.getDataAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:3021:4: ( (lv_backgroundColor_15_0= ruleColors ) )
                    // InternalMyDsl.g:3022:5: (lv_backgroundColor_15_0= ruleColors )
                    {
                    // InternalMyDsl.g:3022:5: (lv_backgroundColor_15_0= ruleColors )
                    // InternalMyDsl.g:3023:6: lv_backgroundColor_15_0= ruleColors
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getBackgroundColorColorsEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_backgroundColor_15_0=ruleColors();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						set(
                    							current,
                    							"backgroundColor",
                    							lv_backgroundColor_15_0,
                    							"org.xtext.example.mydsl.MyDsl.Colors");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_65); 

                    				newLeafNode(this_SEMICOLON_16, grammarAccess.getDataAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3045:3: (otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==56) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:3046:4: otherlv_17= 'borderDash' this_EQUALS_18= RULE_EQUALS ( (lv_borderDash_19_0= ruleEInt ) ) this_SEMICOLON_20= RULE_SEMICOLON
                    {
                    otherlv_17=(Token)match(input,56,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getDataAccess().getBorderDashKeyword_8_0());
                    			
                    this_EQUALS_18=(Token)match(input,RULE_EQUALS,FOLLOW_18); 

                    				newLeafNode(this_EQUALS_18, grammarAccess.getDataAccess().getEQUALSTerminalRuleCall_8_1());
                    			
                    // InternalMyDsl.g:3054:4: ( (lv_borderDash_19_0= ruleEInt ) )
                    // InternalMyDsl.g:3055:5: (lv_borderDash_19_0= ruleEInt )
                    {
                    // InternalMyDsl.g:3055:5: (lv_borderDash_19_0= ruleEInt )
                    // InternalMyDsl.g:3056:6: lv_borderDash_19_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getBorderDashEIntParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_borderDash_19_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						set(
                    							current,
                    							"borderDash",
                    							lv_borderDash_19_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_20=(Token)match(input,RULE_SEMICOLON,FOLLOW_66); 

                    				newLeafNode(this_SEMICOLON_20, grammarAccess.getDataAccess().getSEMICOLONTerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3078:3: ( ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==57) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:3079:4: ( (lv_fill_21_0= 'fill' ) ) this_SEMICOLON_22= RULE_SEMICOLON
                    {
                    // InternalMyDsl.g:3079:4: ( (lv_fill_21_0= 'fill' ) )
                    // InternalMyDsl.g:3080:5: (lv_fill_21_0= 'fill' )
                    {
                    // InternalMyDsl.g:3080:5: (lv_fill_21_0= 'fill' )
                    // InternalMyDsl.g:3081:6: lv_fill_21_0= 'fill'
                    {
                    lv_fill_21_0=(Token)match(input,57,FOLLOW_13); 

                    						newLeafNode(lv_fill_21_0, grammarAccess.getDataAccess().getFillFillKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataRule());
                    						}
                    						setWithLastConsumed(current, "fill", true, "fill");
                    					

                    }


                    }

                    this_SEMICOLON_22=(Token)match(input,RULE_SEMICOLON,FOLLOW_37); 

                    				newLeafNode(this_SEMICOLON_22, grammarAccess.getDataAccess().getSEMICOLONTerminalRuleCall_9_1());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_23, grammarAccess.getDataAccess().getDataKeyword_10());
            		
            this_EQUALS_24=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_24, grammarAccess.getDataAccess().getEQUALSTerminalRuleCall_11());
            		
            this_LIST_START_25=(Token)match(input,RULE_LIST_START,FOLLOW_3); 

            			newLeafNode(this_LIST_START_25, grammarAccess.getDataAccess().getLIST_STARTTerminalRuleCall_12());
            		
            // InternalMyDsl.g:3110:3: ( ( ruleEString ) )
            // InternalMyDsl.g:3111:4: ( ruleEString )
            {
            // InternalMyDsl.g:3111:4: ( ruleEString )
            // InternalMyDsl.g:3112:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataAccess().getDataCollectionCrossReference_13_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3126:3: (this_COMA_27= RULE_COMA ( ( ruleEString ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_COMA) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMyDsl.g:3127:4: this_COMA_27= RULE_COMA ( ( ruleEString ) )
            	    {
            	    this_COMA_27=(Token)match(input,RULE_COMA,FOLLOW_3); 

            	    				newLeafNode(this_COMA_27, grammarAccess.getDataAccess().getCOMATerminalRuleCall_14_0());
            	    			
            	    // InternalMyDsl.g:3131:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:3132:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:3132:5: ( ruleEString )
            	    // InternalMyDsl.g:3133:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDataRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDataAccess().getDataCollectionCrossReference_14_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
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

            this_LIST_END_29=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_29, grammarAccess.getDataAccess().getLIST_ENDTerminalRuleCall_15());
            		
            this_OBJECT_END_30=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_30, grammarAccess.getDataAccess().getOBJECT_ENDTerminalRuleCall_16());
            		

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
    // InternalMyDsl.g:3160:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalMyDsl.g:3160:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDsl.g:3161:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalMyDsl.g:3167:1: ruleLabel returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON this_OBJECT_END_6= RULE_OBJECT_END ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMICOLON_5=null;
        Token this_OBJECT_END_6=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3173:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON this_OBJECT_END_6= RULE_OBJECT_END ) )
            // InternalMyDsl.g:3174:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON this_OBJECT_END_6= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:3174:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON this_OBJECT_END_6= RULE_OBJECT_END )
            // InternalMyDsl.g:3175:3: () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON this_OBJECT_END_6= RULE_OBJECT_END
            {
            // InternalMyDsl.g:3175:3: ()
            // InternalMyDsl.g:3176:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelAccess().getLabelAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getLabelAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getNameKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getLabelAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:3194:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:3195:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:3195:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:3196:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLabelAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getLabelAccess().getSEMICOLONTerminalRuleCall_5());
            		
            this_OBJECT_END_6=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_6, grammarAccess.getLabelAccess().getOBJECT_ENDTerminalRuleCall_6());
            		

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
    // InternalMyDsl.g:3225:1: entryRuleDBServer returns [EObject current=null] : iv_ruleDBServer= ruleDBServer EOF ;
    public final EObject entryRuleDBServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBServer = null;


        try {
            // InternalMyDsl.g:3225:49: (iv_ruleDBServer= ruleDBServer EOF )
            // InternalMyDsl.g:3226:2: iv_ruleDBServer= ruleDBServer EOF
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
    // InternalMyDsl.g:3232:1: ruleDBServer returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'relatedCollections' this_EQUALS_18= RULE_EQUALS this_LIST_START_19= RULE_LIST_START ( (lv_relatedCollections_20_0= ruleCollection ) ) (this_COMA_21= RULE_COMA ( (lv_relatedCollections_22_0= ruleCollection ) ) )* this_LIST_END_23= RULE_LIST_END this_OBJECT_END_24= RULE_OBJECT_END ) ;
    public final EObject ruleDBServer() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Token this_EQUALS_10=null;
        Token this_SEMICOLON_12=null;
        Token otherlv_13=null;
        Token this_EQUALS_14=null;
        Token this_SEMICOLON_16=null;
        Token otherlv_17=null;
        Token this_EQUALS_18=null;
        Token this_LIST_START_19=null;
        Token this_COMA_21=null;
        Token this_LIST_END_23=null;
        Token this_OBJECT_END_24=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_systemManager_7_0 = null;

        AntlrDatatypeRuleToken lv_token_11_0 = null;

        AntlrDatatypeRuleToken lv_password_15_0 = null;

        EObject lv_relatedCollections_20_0 = null;

        EObject lv_relatedCollections_22_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3238:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'relatedCollections' this_EQUALS_18= RULE_EQUALS this_LIST_START_19= RULE_LIST_START ( (lv_relatedCollections_20_0= ruleCollection ) ) (this_COMA_21= RULE_COMA ( (lv_relatedCollections_22_0= ruleCollection ) ) )* this_LIST_END_23= RULE_LIST_END this_OBJECT_END_24= RULE_OBJECT_END ) )
            // InternalMyDsl.g:3239:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'relatedCollections' this_EQUALS_18= RULE_EQUALS this_LIST_START_19= RULE_LIST_START ( (lv_relatedCollections_20_0= ruleCollection ) ) (this_COMA_21= RULE_COMA ( (lv_relatedCollections_22_0= ruleCollection ) ) )* this_LIST_END_23= RULE_LIST_END this_OBJECT_END_24= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:3239:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'relatedCollections' this_EQUALS_18= RULE_EQUALS this_LIST_START_19= RULE_LIST_START ( (lv_relatedCollections_20_0= ruleCollection ) ) (this_COMA_21= RULE_COMA ( (lv_relatedCollections_22_0= ruleCollection ) ) )* this_LIST_END_23= RULE_LIST_END this_OBJECT_END_24= RULE_OBJECT_END )
            // InternalMyDsl.g:3240:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON (otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON )? (otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON )? (otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'relatedCollections' this_EQUALS_18= RULE_EQUALS this_LIST_START_19= RULE_LIST_START ( (lv_relatedCollections_20_0= ruleCollection ) ) (this_COMA_21= RULE_COMA ( (lv_relatedCollections_22_0= ruleCollection ) ) )* this_LIST_END_23= RULE_LIST_END this_OBJECT_END_24= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getDBServerAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDBServerAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getDBServerAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:3252:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:3253:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:3253:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:3254:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDBServerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDBServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_67); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getDBServerAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:3275:3: (otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==58) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:3276:4: otherlv_5= 'systemManager' this_EQUALS_6= RULE_EQUALS ( (lv_systemManager_7_0= ruleDBSystem ) ) this_SEMICOLON_8= RULE_SEMICOLON
                    {
                    otherlv_5=(Token)match(input,58,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getDBServerAccess().getSystemManagerKeyword_5_0());
                    			
                    this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_68); 

                    				newLeafNode(this_EQUALS_6, grammarAccess.getDBServerAccess().getEQUALSTerminalRuleCall_5_1());
                    			
                    // InternalMyDsl.g:3284:4: ( (lv_systemManager_7_0= ruleDBSystem ) )
                    // InternalMyDsl.g:3285:5: (lv_systemManager_7_0= ruleDBSystem )
                    {
                    // InternalMyDsl.g:3285:5: (lv_systemManager_7_0= ruleDBSystem )
                    // InternalMyDsl.g:3286:6: lv_systemManager_7_0= ruleDBSystem
                    {

                    						newCompositeNode(grammarAccess.getDBServerAccess().getSystemManagerDBSystemEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_systemManager_7_0=ruleDBSystem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDBServerRule());
                    						}
                    						set(
                    							current,
                    							"systemManager",
                    							lv_systemManager_7_0,
                    							"org.xtext.example.mydsl.MyDsl.DBSystem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_69); 

                    				newLeafNode(this_SEMICOLON_8, grammarAccess.getDBServerAccess().getSEMICOLONTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3308:3: (otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==59) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:3309:4: otherlv_9= 'token' this_EQUALS_10= RULE_EQUALS ( (lv_token_11_0= ruleEString ) ) this_SEMICOLON_12= RULE_SEMICOLON
                    {
                    otherlv_9=(Token)match(input,59,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getDBServerAccess().getTokenKeyword_6_0());
                    			
                    this_EQUALS_10=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_10, grammarAccess.getDBServerAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:3317:4: ( (lv_token_11_0= ruleEString ) )
                    // InternalMyDsl.g:3318:5: (lv_token_11_0= ruleEString )
                    {
                    // InternalMyDsl.g:3318:5: (lv_token_11_0= ruleEString )
                    // InternalMyDsl.g:3319:6: lv_token_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDBServerAccess().getTokenEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_token_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDBServerRule());
                    						}
                    						set(
                    							current,
                    							"token",
                    							lv_token_11_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_70); 

                    				newLeafNode(this_SEMICOLON_12, grammarAccess.getDBServerAccess().getSEMICOLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3341:3: (otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==60) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:3342:4: otherlv_13= 'password' this_EQUALS_14= RULE_EQUALS ( (lv_password_15_0= ruleEString ) ) this_SEMICOLON_16= RULE_SEMICOLON
                    {
                    otherlv_13=(Token)match(input,60,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getDBServerAccess().getPasswordKeyword_7_0());
                    			
                    this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_14, grammarAccess.getDBServerAccess().getEQUALSTerminalRuleCall_7_1());
                    			
                    // InternalMyDsl.g:3350:4: ( (lv_password_15_0= ruleEString ) )
                    // InternalMyDsl.g:3351:5: (lv_password_15_0= ruleEString )
                    {
                    // InternalMyDsl.g:3351:5: (lv_password_15_0= ruleEString )
                    // InternalMyDsl.g:3352:6: lv_password_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDBServerAccess().getPasswordEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_password_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDBServerRule());
                    						}
                    						set(
                    							current,
                    							"password",
                    							lv_password_15_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_71); 

                    				newLeafNode(this_SEMICOLON_16, grammarAccess.getDBServerAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,61,FOLLOW_7); 

            			newLeafNode(otherlv_17, grammarAccess.getDBServerAccess().getRelatedCollectionsKeyword_8());
            		
            this_EQUALS_18=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_18, grammarAccess.getDBServerAccess().getEQUALSTerminalRuleCall_9());
            		
            this_LIST_START_19=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_19, grammarAccess.getDBServerAccess().getLIST_STARTTerminalRuleCall_10());
            		
            // InternalMyDsl.g:3386:3: ( (lv_relatedCollections_20_0= ruleCollection ) )
            // InternalMyDsl.g:3387:4: (lv_relatedCollections_20_0= ruleCollection )
            {
            // InternalMyDsl.g:3387:4: (lv_relatedCollections_20_0= ruleCollection )
            // InternalMyDsl.g:3388:5: lv_relatedCollections_20_0= ruleCollection
            {

            					newCompositeNode(grammarAccess.getDBServerAccess().getRelatedCollectionsCollectionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_9);
            lv_relatedCollections_20_0=ruleCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDBServerRule());
            					}
            					add(
            						current,
            						"relatedCollections",
            						lv_relatedCollections_20_0,
            						"org.xtext.example.mydsl.MyDsl.Collection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3405:3: (this_COMA_21= RULE_COMA ( (lv_relatedCollections_22_0= ruleCollection ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_COMA) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalMyDsl.g:3406:4: this_COMA_21= RULE_COMA ( (lv_relatedCollections_22_0= ruleCollection ) )
            	    {
            	    this_COMA_21=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_21, grammarAccess.getDBServerAccess().getCOMATerminalRuleCall_12_0());
            	    			
            	    // InternalMyDsl.g:3410:4: ( (lv_relatedCollections_22_0= ruleCollection ) )
            	    // InternalMyDsl.g:3411:5: (lv_relatedCollections_22_0= ruleCollection )
            	    {
            	    // InternalMyDsl.g:3411:5: (lv_relatedCollections_22_0= ruleCollection )
            	    // InternalMyDsl.g:3412:6: lv_relatedCollections_22_0= ruleCollection
            	    {

            	    						newCompositeNode(grammarAccess.getDBServerAccess().getRelatedCollectionsCollectionParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_relatedCollections_22_0=ruleCollection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDBServerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relatedCollections",
            	    							lv_relatedCollections_22_0,
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

            this_LIST_END_23=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_23, grammarAccess.getDBServerAccess().getLIST_ENDTerminalRuleCall_13());
            		
            this_OBJECT_END_24=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_24, grammarAccess.getDBServerAccess().getOBJECT_ENDTerminalRuleCall_14());
            		

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
    // InternalMyDsl.g:3442:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalMyDsl.g:3442:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalMyDsl.g:3443:2: iv_ruleCollection= ruleCollection EOF
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
    // InternalMyDsl.g:3449:1: ruleCollection returns [EObject current=null] : (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'documents' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_documents_8_0= ruleDocument ) ) (this_COMA_9= RULE_COMA ( (lv_documents_10_0= ruleDocument ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_0=null;
        Token otherlv_1=null;
        Token this_EQUALS_2=null;
        Token this_SEMICOLON_4=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token this_LIST_START_7=null;
        Token this_COMA_9=null;
        Token this_LIST_END_11=null;
        Token this_OBJECT_END_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_documents_8_0 = null;

        EObject lv_documents_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3455:2: ( (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'documents' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_documents_8_0= ruleDocument ) ) (this_COMA_9= RULE_COMA ( (lv_documents_10_0= ruleDocument ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END ) )
            // InternalMyDsl.g:3456:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'documents' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_documents_8_0= ruleDocument ) ) (this_COMA_9= RULE_COMA ( (lv_documents_10_0= ruleDocument ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:3456:2: (this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'documents' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_documents_8_0= ruleDocument ) ) (this_COMA_9= RULE_COMA ( (lv_documents_10_0= ruleDocument ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END )
            // InternalMyDsl.g:3457:3: this_OBJECT_START_0= RULE_OBJECT_START otherlv_1= 'name' this_EQUALS_2= RULE_EQUALS ( (lv_name_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON otherlv_5= 'documents' this_EQUALS_6= RULE_EQUALS this_LIST_START_7= RULE_LIST_START ( (lv_documents_8_0= ruleDocument ) ) (this_COMA_9= RULE_COMA ( (lv_documents_10_0= ruleDocument ) ) )* this_LIST_END_11= RULE_LIST_END this_OBJECT_END_12= RULE_OBJECT_END
            {
            this_OBJECT_START_0=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_0, grammarAccess.getCollectionAccess().getOBJECT_STARTTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionAccess().getNameKeyword_1());
            		
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_2, grammarAccess.getCollectionAccess().getEQUALSTerminalRuleCall_2());
            		
            // InternalMyDsl.g:3469:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:3470:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:3470:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:3471:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCollectionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_72); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getCollectionAccess().getSEMICOLONTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,62,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getDocumentsKeyword_5());
            		
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_6, grammarAccess.getCollectionAccess().getEQUALSTerminalRuleCall_6());
            		
            this_LIST_START_7=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_7, grammarAccess.getCollectionAccess().getLIST_STARTTerminalRuleCall_7());
            		
            // InternalMyDsl.g:3504:3: ( (lv_documents_8_0= ruleDocument ) )
            // InternalMyDsl.g:3505:4: (lv_documents_8_0= ruleDocument )
            {
            // InternalMyDsl.g:3505:4: (lv_documents_8_0= ruleDocument )
            // InternalMyDsl.g:3506:5: lv_documents_8_0= ruleDocument
            {

            					newCompositeNode(grammarAccess.getCollectionAccess().getDocumentsDocumentParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_documents_8_0=ruleDocument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionRule());
            					}
            					add(
            						current,
            						"documents",
            						lv_documents_8_0,
            						"org.xtext.example.mydsl.MyDsl.Document");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3523:3: (this_COMA_9= RULE_COMA ( (lv_documents_10_0= ruleDocument ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_COMA) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalMyDsl.g:3524:4: this_COMA_9= RULE_COMA ( (lv_documents_10_0= ruleDocument ) )
            	    {
            	    this_COMA_9=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_9, grammarAccess.getCollectionAccess().getCOMATerminalRuleCall_9_0());
            	    			
            	    // InternalMyDsl.g:3528:4: ( (lv_documents_10_0= ruleDocument ) )
            	    // InternalMyDsl.g:3529:5: (lv_documents_10_0= ruleDocument )
            	    {
            	    // InternalMyDsl.g:3529:5: (lv_documents_10_0= ruleDocument )
            	    // InternalMyDsl.g:3530:6: lv_documents_10_0= ruleDocument
            	    {

            	    						newCompositeNode(grammarAccess.getCollectionAccess().getDocumentsDocumentParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_documents_10_0=ruleDocument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCollectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"documents",
            	    							lv_documents_10_0,
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

            this_LIST_END_11=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_11, grammarAccess.getCollectionAccess().getLIST_ENDTerminalRuleCall_10());
            		
            this_OBJECT_END_12=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_12, grammarAccess.getCollectionAccess().getOBJECT_ENDTerminalRuleCall_11());
            		

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
    // InternalMyDsl.g:3560:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalMyDsl.g:3560:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalMyDsl.g:3561:2: iv_ruleDocument= ruleDocument EOF
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
    // InternalMyDsl.g:3567:1: ruleDocument returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= 'attributes' this_EQUALS_7= RULE_EQUALS this_LIST_START_8= RULE_LIST_START ( (lv_attributes_9_0= ruleAttribute ) ) (this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) ) )* this_LIST_END_12= RULE_LIST_END this_OBJECT_END_13= RULE_OBJECT_END ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_LIST_START_8=null;
        Token this_COMA_10=null;
        Token this_LIST_END_12=null;
        Token this_OBJECT_END_13=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_attributes_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3573:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= 'attributes' this_EQUALS_7= RULE_EQUALS this_LIST_START_8= RULE_LIST_START ( (lv_attributes_9_0= ruleAttribute ) ) (this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) ) )* this_LIST_END_12= RULE_LIST_END this_OBJECT_END_13= RULE_OBJECT_END ) )
            // InternalMyDsl.g:3574:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= 'attributes' this_EQUALS_7= RULE_EQUALS this_LIST_START_8= RULE_LIST_START ( (lv_attributes_9_0= ruleAttribute ) ) (this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) ) )* this_LIST_END_12= RULE_LIST_END this_OBJECT_END_13= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:3574:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= 'attributes' this_EQUALS_7= RULE_EQUALS this_LIST_START_8= RULE_LIST_START ( (lv_attributes_9_0= ruleAttribute ) ) (this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) ) )* this_LIST_END_12= RULE_LIST_END this_OBJECT_END_13= RULE_OBJECT_END )
            // InternalMyDsl.g:3575:3: () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= 'attributes' this_EQUALS_7= RULE_EQUALS this_LIST_START_8= RULE_LIST_START ( (lv_attributes_9_0= ruleAttribute ) ) (this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) ) )* this_LIST_END_12= RULE_LIST_END this_OBJECT_END_13= RULE_OBJECT_END
            {
            // InternalMyDsl.g:3575:3: ()
            // InternalMyDsl.g:3576:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentAccess().getDocumentAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getDocumentAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDocumentAccess().getNameKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getDocumentAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:3594:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:3595:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:3595:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:3596:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDocumentAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_73); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getDocumentAccess().getSEMICOLONTerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,63,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDocumentAccess().getAttributesKeyword_6());
            		
            this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_8); 

            			newLeafNode(this_EQUALS_7, grammarAccess.getDocumentAccess().getEQUALSTerminalRuleCall_7());
            		
            this_LIST_START_8=(Token)match(input,RULE_LIST_START,FOLLOW_5); 

            			newLeafNode(this_LIST_START_8, grammarAccess.getDocumentAccess().getLIST_STARTTerminalRuleCall_8());
            		
            // InternalMyDsl.g:3629:3: ( (lv_attributes_9_0= ruleAttribute ) )
            // InternalMyDsl.g:3630:4: (lv_attributes_9_0= ruleAttribute )
            {
            // InternalMyDsl.g:3630:4: (lv_attributes_9_0= ruleAttribute )
            // InternalMyDsl.g:3631:5: lv_attributes_9_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getDocumentAccess().getAttributesAttributeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_attributes_9_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_9_0,
            						"org.xtext.example.mydsl.MyDsl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:3648:3: (this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_COMA) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalMyDsl.g:3649:4: this_COMA_10= RULE_COMA ( (lv_attributes_11_0= ruleAttribute ) )
            	    {
            	    this_COMA_10=(Token)match(input,RULE_COMA,FOLLOW_5); 

            	    				newLeafNode(this_COMA_10, grammarAccess.getDocumentAccess().getCOMATerminalRuleCall_10_0());
            	    			
            	    // InternalMyDsl.g:3653:4: ( (lv_attributes_11_0= ruleAttribute ) )
            	    // InternalMyDsl.g:3654:5: (lv_attributes_11_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:3654:5: (lv_attributes_11_0= ruleAttribute )
            	    // InternalMyDsl.g:3655:6: lv_attributes_11_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getDocumentAccess().getAttributesAttributeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_11_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_11_0,
            	    							"org.xtext.example.mydsl.MyDsl.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            this_LIST_END_12=(Token)match(input,RULE_LIST_END,FOLLOW_11); 

            			newLeafNode(this_LIST_END_12, grammarAccess.getDocumentAccess().getLIST_ENDTerminalRuleCall_11());
            		
            this_OBJECT_END_13=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_13, grammarAccess.getDocumentAccess().getOBJECT_ENDTerminalRuleCall_12());
            		

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


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:3685:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:3685:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:3686:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:3692:1: ruleAttribute returns [EObject current=null] : ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? this_OBJECT_END_9= RULE_OBJECT_END ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token this_OBJECT_START_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        Token this_SEMICOLON_8=null;
        Token this_OBJECT_END_9=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3698:2: ( ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? this_OBJECT_END_9= RULE_OBJECT_END ) )
            // InternalMyDsl.g:3699:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? this_OBJECT_END_9= RULE_OBJECT_END )
            {
            // InternalMyDsl.g:3699:2: ( () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? this_OBJECT_END_9= RULE_OBJECT_END )
            // InternalMyDsl.g:3700:3: () this_OBJECT_START_1= RULE_OBJECT_START otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) this_SEMICOLON_5= RULE_SEMICOLON (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )? this_OBJECT_END_9= RULE_OBJECT_END
            {
            // InternalMyDsl.g:3700:3: ()
            // InternalMyDsl.g:3701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            this_OBJECT_START_1=(Token)match(input,RULE_OBJECT_START,FOLLOW_12); 

            			newLeafNode(this_OBJECT_START_1, grammarAccess.getAttributeAccess().getOBJECT_STARTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getNameKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getAttributeAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:3719:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:3720:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:3720:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:3721:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_74); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getAttributeAccess().getSEMICOLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:3742:3: (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==64) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyDsl.g:3743:4: otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) this_SEMICOLON_8= RULE_SEMICOLON
                    {
                    otherlv_6=(Token)match(input,64,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getTypeKeyword_6_0());
                    			
                    // InternalMyDsl.g:3747:4: ( (lv_type_7_0= ruleEString ) )
                    // InternalMyDsl.g:3748:5: (lv_type_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:3748:5: (lv_type_7_0= ruleEString )
                    // InternalMyDsl.g:3749:6: lv_type_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

                    				newLeafNode(this_SEMICOLON_8, grammarAccess.getAttributeAccess().getSEMICOLONTerminalRuleCall_6_2());
                    			

                    }
                    break;

            }

            this_OBJECT_END_9=(Token)match(input,RULE_OBJECT_END,FOLLOW_2); 

            			newLeafNode(this_OBJECT_END_9, grammarAccess.getAttributeAccess().getOBJECT_ENDTerminalRuleCall_7());
            		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEFloat"
    // InternalMyDsl.g:3779:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalMyDsl.g:3779:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalMyDsl.g:3780:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalMyDsl.g:3786:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3792:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:3793:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:3793:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:3794:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:3794:3: (kw= '-' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==65) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyDsl.g:3795:4: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_75); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3801:3: (this_INT_1= RULE_INT )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_INT) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyDsl.g:3802:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_76); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,66,FOLLOW_77); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_78); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyDsl.g:3822:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=67 && LA70_0<=68)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMyDsl.g:3823:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:3823:4: (kw= 'E' | kw= 'e' )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==67) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==68) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalMyDsl.g:3824:5: kw= 'E'
                            {
                            kw=(Token)match(input,67,FOLLOW_18); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3830:5: kw= 'e'
                            {
                            kw=(Token)match(input,68,FOLLOW_18); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:3836:4: (kw= '-' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==65) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalMyDsl.g:3837:5: kw= '-'
                            {
                            kw=(Token)match(input,65,FOLLOW_77); 

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
    // InternalMyDsl.g:3855:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:3855:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:3856:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:3862:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3868:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:3869:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:3869:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_STRING) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_ID) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyDsl.g:3870:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3878:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:3889:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:3889:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:3890:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDsl.g:3896:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3902:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:3903:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:3903:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:3904:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:3904:3: (kw= '-' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==65) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalMyDsl.g:3905:4: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_77); 

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
    // InternalMyDsl.g:3922:1: ruleDBSystem returns [Enumerator current=null] : ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'REDIS' ) ) ;
    public final Enumerator ruleDBSystem() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3928:2: ( ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'REDIS' ) ) )
            // InternalMyDsl.g:3929:2: ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'REDIS' ) )
            {
            // InternalMyDsl.g:3929:2: ( (enumLiteral_0= 'MONGODB' ) | (enumLiteral_1= 'REDIS' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==69) ) {
                alt73=1;
            }
            else if ( (LA73_0==70) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalMyDsl.g:3930:3: (enumLiteral_0= 'MONGODB' )
                    {
                    // InternalMyDsl.g:3930:3: (enumLiteral_0= 'MONGODB' )
                    // InternalMyDsl.g:3931:4: enumLiteral_0= 'MONGODB'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getDBSystemAccess().getMONGODBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDBSystemAccess().getMONGODBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3938:3: (enumLiteral_1= 'REDIS' )
                    {
                    // InternalMyDsl.g:3938:3: (enumLiteral_1= 'REDIS' )
                    // InternalMyDsl.g:3939:4: enumLiteral_1= 'REDIS'
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
    // InternalMyDsl.g:3949:1: ruleColors returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'gray' ) | (enumLiteral_5= 'yellow' ) | (enumLiteral_6= 'black' ) | (enumLiteral_7= 'cyan' ) | (enumLiteral_8= 'magenta' ) | (enumLiteral_9= 'silver' ) | (enumLiteral_10= 'maroon' ) | (enumLiteral_11= 'olive' ) | (enumLiteral_12= 'purple' ) | (enumLiteral_13= 'teal' ) | (enumLiteral_14= 'navy' ) ) ;
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
            // InternalMyDsl.g:3955:2: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'gray' ) | (enumLiteral_5= 'yellow' ) | (enumLiteral_6= 'black' ) | (enumLiteral_7= 'cyan' ) | (enumLiteral_8= 'magenta' ) | (enumLiteral_9= 'silver' ) | (enumLiteral_10= 'maroon' ) | (enumLiteral_11= 'olive' ) | (enumLiteral_12= 'purple' ) | (enumLiteral_13= 'teal' ) | (enumLiteral_14= 'navy' ) ) )
            // InternalMyDsl.g:3956:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'gray' ) | (enumLiteral_5= 'yellow' ) | (enumLiteral_6= 'black' ) | (enumLiteral_7= 'cyan' ) | (enumLiteral_8= 'magenta' ) | (enumLiteral_9= 'silver' ) | (enumLiteral_10= 'maroon' ) | (enumLiteral_11= 'olive' ) | (enumLiteral_12= 'purple' ) | (enumLiteral_13= 'teal' ) | (enumLiteral_14= 'navy' ) )
            {
            // InternalMyDsl.g:3956:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'red' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'gray' ) | (enumLiteral_5= 'yellow' ) | (enumLiteral_6= 'black' ) | (enumLiteral_7= 'cyan' ) | (enumLiteral_8= 'magenta' ) | (enumLiteral_9= 'silver' ) | (enumLiteral_10= 'maroon' ) | (enumLiteral_11= 'olive' ) | (enumLiteral_12= 'purple' ) | (enumLiteral_13= 'teal' ) | (enumLiteral_14= 'navy' ) )
            int alt74=15;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt74=1;
                }
                break;
            case 72:
                {
                alt74=2;
                }
                break;
            case 73:
                {
                alt74=3;
                }
                break;
            case 74:
                {
                alt74=4;
                }
                break;
            case 75:
                {
                alt74=5;
                }
                break;
            case 76:
                {
                alt74=6;
                }
                break;
            case 77:
                {
                alt74=7;
                }
                break;
            case 78:
                {
                alt74=8;
                }
                break;
            case 79:
                {
                alt74=9;
                }
                break;
            case 80:
                {
                alt74=10;
                }
                break;
            case 81:
                {
                alt74=11;
                }
                break;
            case 82:
                {
                alt74=12;
                }
                break;
            case 83:
                {
                alt74=13;
                }
                break;
            case 84:
                {
                alt74=14;
                }
                break;
            case 85:
                {
                alt74=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalMyDsl.g:3957:3: (enumLiteral_0= 'white' )
                    {
                    // InternalMyDsl.g:3957:3: (enumLiteral_0= 'white' )
                    // InternalMyDsl.g:3958:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3965:3: (enumLiteral_1= 'blue' )
                    {
                    // InternalMyDsl.g:3965:3: (enumLiteral_1= 'blue' )
                    // InternalMyDsl.g:3966:4: enumLiteral_1= 'blue'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3973:3: (enumLiteral_2= 'red' )
                    {
                    // InternalMyDsl.g:3973:3: (enumLiteral_2= 'red' )
                    // InternalMyDsl.g:3974:4: enumLiteral_2= 'red'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3981:3: (enumLiteral_3= 'green' )
                    {
                    // InternalMyDsl.g:3981:3: (enumLiteral_3= 'green' )
                    // InternalMyDsl.g:3982:4: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getGreenEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3989:3: (enumLiteral_4= 'gray' )
                    {
                    // InternalMyDsl.g:3989:3: (enumLiteral_4= 'gray' )
                    // InternalMyDsl.g:3990:4: enumLiteral_4= 'gray'
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getGrayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorsAccess().getGrayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3997:3: (enumLiteral_5= 'yellow' )
                    {
                    // InternalMyDsl.g:3997:3: (enumLiteral_5= 'yellow' )
                    // InternalMyDsl.g:3998:4: enumLiteral_5= 'yellow'
                    {
                    enumLiteral_5=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:4005:3: (enumLiteral_6= 'black' )
                    {
                    // InternalMyDsl.g:4005:3: (enumLiteral_6= 'black' )
                    // InternalMyDsl.g:4006:4: enumLiteral_6= 'black'
                    {
                    enumLiteral_6=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:4013:3: (enumLiteral_7= 'cyan' )
                    {
                    // InternalMyDsl.g:4013:3: (enumLiteral_7= 'cyan' )
                    // InternalMyDsl.g:4014:4: enumLiteral_7= 'cyan'
                    {
                    enumLiteral_7=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getCyanEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getColorsAccess().getCyanEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:4021:3: (enumLiteral_8= 'magenta' )
                    {
                    // InternalMyDsl.g:4021:3: (enumLiteral_8= 'magenta' )
                    // InternalMyDsl.g:4022:4: enumLiteral_8= 'magenta'
                    {
                    enumLiteral_8=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getMagentaEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getColorsAccess().getMagentaEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:4029:3: (enumLiteral_9= 'silver' )
                    {
                    // InternalMyDsl.g:4029:3: (enumLiteral_9= 'silver' )
                    // InternalMyDsl.g:4030:4: enumLiteral_9= 'silver'
                    {
                    enumLiteral_9=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getSilverEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getColorsAccess().getSilverEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:4037:3: (enumLiteral_10= 'maroon' )
                    {
                    // InternalMyDsl.g:4037:3: (enumLiteral_10= 'maroon' )
                    // InternalMyDsl.g:4038:4: enumLiteral_10= 'maroon'
                    {
                    enumLiteral_10=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getMaroonEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getColorsAccess().getMaroonEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:4045:3: (enumLiteral_11= 'olive' )
                    {
                    // InternalMyDsl.g:4045:3: (enumLiteral_11= 'olive' )
                    // InternalMyDsl.g:4046:4: enumLiteral_11= 'olive'
                    {
                    enumLiteral_11=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getOliveEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getColorsAccess().getOliveEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:4053:3: (enumLiteral_12= 'purple' )
                    {
                    // InternalMyDsl.g:4053:3: (enumLiteral_12= 'purple' )
                    // InternalMyDsl.g:4054:4: enumLiteral_12= 'purple'
                    {
                    enumLiteral_12=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getPurpleEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getColorsAccess().getPurpleEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:4061:3: (enumLiteral_13= 'teal' )
                    {
                    // InternalMyDsl.g:4061:3: (enumLiteral_13= 'teal' )
                    // InternalMyDsl.g:4062:4: enumLiteral_13= 'teal'
                    {
                    enumLiteral_13=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getTealEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getColorsAccess().getTealEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:4069:3: (enumLiteral_14= 'navy' )
                    {
                    // InternalMyDsl.g:4069:3: (enumLiteral_14= 'navy' )
                    // InternalMyDsl.g:4070:4: enumLiteral_14= 'navy'
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
    // InternalMyDsl.g:4080:1: rulePositionOptions returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'top' ) | (enumLiteral_4= 'bottom' ) ) ;
    public final Enumerator rulePositionOptions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4086:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'top' ) | (enumLiteral_4= 'bottom' ) ) )
            // InternalMyDsl.g:4087:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'top' ) | (enumLiteral_4= 'bottom' ) )
            {
            // InternalMyDsl.g:4087:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'top' ) | (enumLiteral_4= 'bottom' ) )
            int alt75=5;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt75=1;
                }
                break;
            case 87:
                {
                alt75=2;
                }
                break;
            case 88:
                {
                alt75=3;
                }
                break;
            case 89:
                {
                alt75=4;
                }
                break;
            case 90:
                {
                alt75=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalMyDsl.g:4088:3: (enumLiteral_0= 'left' )
                    {
                    // InternalMyDsl.g:4088:3: (enumLiteral_0= 'left' )
                    // InternalMyDsl.g:4089:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPositionOptionsAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4096:3: (enumLiteral_1= 'right' )
                    {
                    // InternalMyDsl.g:4096:3: (enumLiteral_1= 'right' )
                    // InternalMyDsl.g:4097:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPositionOptionsAccess().getRightEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:4104:3: (enumLiteral_2= 'center' )
                    {
                    // InternalMyDsl.g:4104:3: (enumLiteral_2= 'center' )
                    // InternalMyDsl.g:4105:4: enumLiteral_2= 'center'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getCenterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPositionOptionsAccess().getCenterEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:4112:3: (enumLiteral_3= 'top' )
                    {
                    // InternalMyDsl.g:4112:3: (enumLiteral_3= 'top' )
                    // InternalMyDsl.g:4113:4: enumLiteral_3= 'top'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getPositionOptionsAccess().getTopEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPositionOptionsAccess().getTopEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:4120:3: (enumLiteral_4= 'bottom' )
                    {
                    // InternalMyDsl.g:4120:3: (enumLiteral_4= 'bottom' )
                    // InternalMyDsl.g:4121:4: enumLiteral_4= 'bottom'
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
    static final String dfa_1s = "\56\uffff";
    static final String dfa_2s = "\1\4\1\26\1\5\1\uffff\1\14\2\12\1\31\1\5\2\uffff\1\14\2\12\1\32\1\5\1\uffff\4\5\2\uffff\1\126\4\14\15\12\1\43\1\44\1\45\1\46\1\47";
    static final String dfa_3s = "\1\4\1\55\1\5\1\uffff\1\15\2\12\1\37\1\5\2\uffff\1\15\2\12\1\54\1\5\1\uffff\4\5\2\uffff\1\132\4\15\15\12\1\54\4\53";
    static final String dfa_4s = "\3\uffff\1\6\5\uffff\1\2\1\1\5\uffff\1\5\4\uffff\1\4\1\3\27\uffff";
    static final String dfa_5s = "\56\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\26\uffff\1\3",
            "\1\4",
            "",
            "\1\5\1\6",
            "\1\7",
            "\1\7",
            "\1\10\5\12\1\11",
            "\1\13",
            "",
            "",
            "\1\14\1\15",
            "\1\16",
            "\1\16",
            "\5\12\1\11\2\uffff\1\17\1\21\1\22\1\23\1\24\3\26\1\uffff\1\25\1\20",
            "\1\27",
            "",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "",
            "",
            "\1\34\1\35\1\36\1\37\1\40",
            "\1\41\1\42",
            "\1\43\1\44",
            "\1\45\1\46",
            "\1\47\1\50",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\52",
            "\1\52",
            "\1\53",
            "\1\53",
            "\1\54",
            "\1\54",
            "\1\55",
            "\1\55",
            "\1\21\1\22\1\23\1\24\3\26\1\uffff\1\25\1\20",
            "\1\22\1\23\1\24\3\26\1\uffff\1\25",
            "\1\23\1\24\3\26\1\uffff\1\25",
            "\1\24\3\26\1\uffff\1\25",
            "\3\26\1\uffff\1\25"
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
            return "510:2: (this_Table_0= ruleTable | this_Menu_1= ruleMenu | this_LineChart_2= ruleLineChart | this_BarChart_3= ruleBarChart | this_RadarChart_4= ruleRadarChart | this_PieChart_5= rulePieChart )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000302000200L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000202000200L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000003FC00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000003F800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000003F000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000087C00000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000087800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000087000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000086000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000006L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100400000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000020402000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0007C00020000200L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0007800020000200L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0007000020000200L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0007000000000200L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0006000000000200L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0004000000000200L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0019000002000200L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0019000000000200L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0011000000000200L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0010000000000200L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x03E0020000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x03C0020000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x00000000003FFF80L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0380020000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0300020000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0200020000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x3C00000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000001L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000004L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});

}