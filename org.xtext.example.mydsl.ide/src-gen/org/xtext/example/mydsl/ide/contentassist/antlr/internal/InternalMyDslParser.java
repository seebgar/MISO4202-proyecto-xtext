package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_OBJECT_START", "RULE_EQUALS", "RULE_LIST_START", "RULE_LIST_END", "RULE_OBJECT_END", "RULE_COMA", "RULE_INT", "RULE_SEMICOLON", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'MONGODB'", "'REDIS'", "'white'", "'blue'", "'red'", "'green'", "'gray'", "'yellow'", "'black'", "'cyan'", "'magenta'", "'silver'", "'maroon'", "'olive'", "'purple'", "'teal'", "'navy'", "'left'", "'right'", "'center'", "'top'", "'bottom'", "'Company'", "'dashboards'", "'DBServers'", "'nit'", "'panels'", "'elements'", "'columns'", "'title'", "'registersPerPage'", "'actions'", "'Menu'", "'options'", "'icon'", "'urlComponent'", "'data'", "'labels'", "'legendPosition'", "'labelStringXAxes'", "'colorGridLinesXAxes'", "'labelStringYAxes'", "'colorGridLinesYAxes'", "'barPercentage'", "'PIE'", "'columnTitle'", "'position'", "'source'", "'('", "')'", "'category'", "'borderColor'", "'backgroundColor'", "'borderDash'", "'relatedCollections'", "'systemManager'", "'token'", "'password'", "'documents'", "'-'", "'.'", "'search'", "'add'", "'displayGridLinesXAxes'", "'displayGridLinesYAxes'", "'angleLinesDisplay'", "'filter'", "'edit'", "'delete'", "'editable'", "'fill'"
    };
    public static final int T__50=50;
    public static final int RULE_OBJECT_START=6;
    public static final int RULE_LIST_END=9;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_EQUALS=7;
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
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
    public static final int RULE_LIST_START=8;
    public static final int T__71=71;
    public static final int RULE_COMA=11;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
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
    public static final int RULE_OBJECT_END=10;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCompany"
    // InternalMyDsl.g:53:1: entryRuleCompany : ruleCompany EOF ;
    public final void entryRuleCompany() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleCompany EOF )
            // InternalMyDsl.g:55:1: ruleCompany EOF
            {
             before(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            ruleCompany();

            state._fsp--;

             after(grammarAccess.getCompanyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalMyDsl.g:62:1: ruleCompany : ( ( rule__Company__Group__0 ) ) ;
    public final void ruleCompany() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Company__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Company__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Company__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Company__Group__0 )
            {
             before(grammarAccess.getCompanyAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Company__Group__0 )
            // InternalMyDsl.g:69:4: rule__Company__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleDashboard"
    // InternalMyDsl.g:78:1: entryRuleDashboard : ruleDashboard EOF ;
    public final void entryRuleDashboard() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleDashboard EOF )
            // InternalMyDsl.g:80:1: ruleDashboard EOF
            {
             before(grammarAccess.getDashboardRule()); 
            pushFollow(FOLLOW_1);
            ruleDashboard();

            state._fsp--;

             after(grammarAccess.getDashboardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDashboard"


    // $ANTLR start "ruleDashboard"
    // InternalMyDsl.g:87:1: ruleDashboard : ( ( rule__Dashboard__Group__0 ) ) ;
    public final void ruleDashboard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Dashboard__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Dashboard__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Dashboard__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Dashboard__Group__0 )
            {
             before(grammarAccess.getDashboardAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Dashboard__Group__0 )
            // InternalMyDsl.g:94:4: rule__Dashboard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDashboardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDashboard"


    // $ANTLR start "entryRulePanel"
    // InternalMyDsl.g:103:1: entryRulePanel : rulePanel EOF ;
    public final void entryRulePanel() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( rulePanel EOF )
            // InternalMyDsl.g:105:1: rulePanel EOF
            {
             before(grammarAccess.getPanelRule()); 
            pushFollow(FOLLOW_1);
            rulePanel();

            state._fsp--;

             after(grammarAccess.getPanelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePanel"


    // $ANTLR start "rulePanel"
    // InternalMyDsl.g:112:1: rulePanel : ( ( rule__Panel__Group__0 ) ) ;
    public final void rulePanel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Panel__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Panel__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Panel__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Panel__Group__0 )
            {
             before(grammarAccess.getPanelAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Panel__Group__0 )
            // InternalMyDsl.g:119:4: rule__Panel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:128:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleElement EOF )
            // InternalMyDsl.g:130:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:137:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Element__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Element__Alternatives )
            // InternalMyDsl.g:144:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleTable"
    // InternalMyDsl.g:153:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleTable EOF )
            // InternalMyDsl.g:155:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMyDsl.g:162:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Table__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Table__Group__0 )
            // InternalMyDsl.g:169:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleMenu"
    // InternalMyDsl.g:178:1: entryRuleMenu : ruleMenu EOF ;
    public final void entryRuleMenu() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleMenu EOF )
            // InternalMyDsl.g:180:1: ruleMenu EOF
            {
             before(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_1);
            ruleMenu();

            state._fsp--;

             after(grammarAccess.getMenuRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // InternalMyDsl.g:187:1: ruleMenu : ( ( rule__Menu__Group__0 ) ) ;
    public final void ruleMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Menu__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Menu__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Menu__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Menu__Group__0 )
            {
             before(grammarAccess.getMenuAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Menu__Group__0 )
            // InternalMyDsl.g:194:4: rule__Menu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRuleOption"
    // InternalMyDsl.g:203:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleOption EOF )
            // InternalMyDsl.g:205:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalMyDsl.g:212:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Option__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Option__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Option__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Option__Group__0 )
            // InternalMyDsl.g:219:4: rule__Option__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleLineChart"
    // InternalMyDsl.g:228:1: entryRuleLineChart : ruleLineChart EOF ;
    public final void entryRuleLineChart() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleLineChart EOF )
            // InternalMyDsl.g:230:1: ruleLineChart EOF
            {
             before(grammarAccess.getLineChartRule()); 
            pushFollow(FOLLOW_1);
            ruleLineChart();

            state._fsp--;

             after(grammarAccess.getLineChartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLineChart"


    // $ANTLR start "ruleLineChart"
    // InternalMyDsl.g:237:1: ruleLineChart : ( ( rule__LineChart__Group__0 ) ) ;
    public final void ruleLineChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__LineChart__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__LineChart__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__LineChart__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__LineChart__Group__0 )
            {
             before(grammarAccess.getLineChartAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__LineChart__Group__0 )
            // InternalMyDsl.g:244:4: rule__LineChart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineChart"


    // $ANTLR start "entryRuleBarChart"
    // InternalMyDsl.g:253:1: entryRuleBarChart : ruleBarChart EOF ;
    public final void entryRuleBarChart() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleBarChart EOF )
            // InternalMyDsl.g:255:1: ruleBarChart EOF
            {
             before(grammarAccess.getBarChartRule()); 
            pushFollow(FOLLOW_1);
            ruleBarChart();

            state._fsp--;

             after(grammarAccess.getBarChartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBarChart"


    // $ANTLR start "ruleBarChart"
    // InternalMyDsl.g:262:1: ruleBarChart : ( ( rule__BarChart__Group__0 ) ) ;
    public final void ruleBarChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__BarChart__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__BarChart__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__BarChart__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__BarChart__Group__0 )
            {
             before(grammarAccess.getBarChartAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__BarChart__Group__0 )
            // InternalMyDsl.g:269:4: rule__BarChart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBarChart"


    // $ANTLR start "entryRuleRadarChart"
    // InternalMyDsl.g:278:1: entryRuleRadarChart : ruleRadarChart EOF ;
    public final void entryRuleRadarChart() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleRadarChart EOF )
            // InternalMyDsl.g:280:1: ruleRadarChart EOF
            {
             before(grammarAccess.getRadarChartRule()); 
            pushFollow(FOLLOW_1);
            ruleRadarChart();

            state._fsp--;

             after(grammarAccess.getRadarChartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRadarChart"


    // $ANTLR start "ruleRadarChart"
    // InternalMyDsl.g:287:1: ruleRadarChart : ( ( rule__RadarChart__Group__0 ) ) ;
    public final void ruleRadarChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__RadarChart__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__RadarChart__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__RadarChart__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__RadarChart__Group__0 )
            {
             before(grammarAccess.getRadarChartAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__RadarChart__Group__0 )
            // InternalMyDsl.g:294:4: rule__RadarChart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRadarChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRadarChart"


    // $ANTLR start "entryRulePieChart"
    // InternalMyDsl.g:303:1: entryRulePieChart : rulePieChart EOF ;
    public final void entryRulePieChart() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( rulePieChart EOF )
            // InternalMyDsl.g:305:1: rulePieChart EOF
            {
             before(grammarAccess.getPieChartRule()); 
            pushFollow(FOLLOW_1);
            rulePieChart();

            state._fsp--;

             after(grammarAccess.getPieChartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePieChart"


    // $ANTLR start "rulePieChart"
    // InternalMyDsl.g:312:1: rulePieChart : ( ( rule__PieChart__Group__0 ) ) ;
    public final void rulePieChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__PieChart__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__PieChart__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__PieChart__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__PieChart__Group__0 )
            {
             before(grammarAccess.getPieChartAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__PieChart__Group__0 )
            // InternalMyDsl.g:319:4: rule__PieChart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPieChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePieChart"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:328:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleAction EOF )
            // InternalMyDsl.g:330:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:337:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Action__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Action__Group__0 )
            // InternalMyDsl.g:344:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleColumn"
    // InternalMyDsl.g:353:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleColumn EOF )
            // InternalMyDsl.g:355:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMyDsl.g:362:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Column__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Column__Group__0 )
            // InternalMyDsl.g:369:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleData"
    // InternalMyDsl.g:378:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleData EOF )
            // InternalMyDsl.g:380:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalMyDsl.g:387:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Data__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Data__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Data__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Data__Group__0 )
            // InternalMyDsl.g:394:4: rule__Data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleLabel"
    // InternalMyDsl.g:403:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleLabel EOF )
            // InternalMyDsl.g:405:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMyDsl.g:412:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Label__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Label__Group__0 )
            // InternalMyDsl.g:419:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleDBServer"
    // InternalMyDsl.g:428:1: entryRuleDBServer : ruleDBServer EOF ;
    public final void entryRuleDBServer() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleDBServer EOF )
            // InternalMyDsl.g:430:1: ruleDBServer EOF
            {
             before(grammarAccess.getDBServerRule()); 
            pushFollow(FOLLOW_1);
            ruleDBServer();

            state._fsp--;

             after(grammarAccess.getDBServerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDBServer"


    // $ANTLR start "ruleDBServer"
    // InternalMyDsl.g:437:1: ruleDBServer : ( ( rule__DBServer__Group__0 ) ) ;
    public final void ruleDBServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__DBServer__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__DBServer__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__DBServer__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__DBServer__Group__0 )
            {
             before(grammarAccess.getDBServerAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__DBServer__Group__0 )
            // InternalMyDsl.g:444:4: rule__DBServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DBServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDBServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDBServer"


    // $ANTLR start "entryRuleCollection"
    // InternalMyDsl.g:453:1: entryRuleCollection : ruleCollection EOF ;
    public final void entryRuleCollection() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleCollection EOF )
            // InternalMyDsl.g:455:1: ruleCollection EOF
            {
             before(grammarAccess.getCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleCollection();

            state._fsp--;

             after(grammarAccess.getCollectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalMyDsl.g:462:1: ruleCollection : ( ( rule__Collection__Group__0 ) ) ;
    public final void ruleCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Collection__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Collection__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Collection__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Collection__Group__0 )
            {
             before(grammarAccess.getCollectionAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Collection__Group__0 )
            // InternalMyDsl.g:469:4: rule__Collection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleDocument"
    // InternalMyDsl.g:478:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleDocument EOF )
            // InternalMyDsl.g:480:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalMyDsl.g:487:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Document__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Document__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Document__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Document__Group__0 )
            {
             before(grammarAccess.getDocumentAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Document__Group__0 )
            // InternalMyDsl.g:494:4: rule__Document__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Document__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleEFloat"
    // InternalMyDsl.g:503:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleEFloat EOF )
            // InternalMyDsl.g:505:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalMyDsl.g:512:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__EFloat__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__EFloat__Group__0 )
            // InternalMyDsl.g:519:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:528:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleEString EOF )
            // InternalMyDsl.g:530:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:537:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:543:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:544:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:544:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:553:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleEInt EOF )
            // InternalMyDsl.g:555:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:562:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:569:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleDBSystem"
    // InternalMyDsl.g:578:1: ruleDBSystem : ( ( rule__DBSystem__Alternatives ) ) ;
    public final void ruleDBSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( ( ( rule__DBSystem__Alternatives ) ) )
            // InternalMyDsl.g:583:2: ( ( rule__DBSystem__Alternatives ) )
            {
            // InternalMyDsl.g:583:2: ( ( rule__DBSystem__Alternatives ) )
            // InternalMyDsl.g:584:3: ( rule__DBSystem__Alternatives )
            {
             before(grammarAccess.getDBSystemAccess().getAlternatives()); 
            // InternalMyDsl.g:585:3: ( rule__DBSystem__Alternatives )
            // InternalMyDsl.g:585:4: rule__DBSystem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DBSystem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDBSystemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDBSystem"


    // $ANTLR start "ruleColors"
    // InternalMyDsl.g:594:1: ruleColors : ( ( rule__Colors__Alternatives ) ) ;
    public final void ruleColors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( ( ( rule__Colors__Alternatives ) ) )
            // InternalMyDsl.g:599:2: ( ( rule__Colors__Alternatives ) )
            {
            // InternalMyDsl.g:599:2: ( ( rule__Colors__Alternatives ) )
            // InternalMyDsl.g:600:3: ( rule__Colors__Alternatives )
            {
             before(grammarAccess.getColorsAccess().getAlternatives()); 
            // InternalMyDsl.g:601:3: ( rule__Colors__Alternatives )
            // InternalMyDsl.g:601:4: rule__Colors__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Colors__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColors"


    // $ANTLR start "rulePositionOptions"
    // InternalMyDsl.g:610:1: rulePositionOptions : ( ( rule__PositionOptions__Alternatives ) ) ;
    public final void rulePositionOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:614:1: ( ( ( rule__PositionOptions__Alternatives ) ) )
            // InternalMyDsl.g:615:2: ( ( rule__PositionOptions__Alternatives ) )
            {
            // InternalMyDsl.g:615:2: ( ( rule__PositionOptions__Alternatives ) )
            // InternalMyDsl.g:616:3: ( rule__PositionOptions__Alternatives )
            {
             before(grammarAccess.getPositionOptionsAccess().getAlternatives()); 
            // InternalMyDsl.g:617:3: ( rule__PositionOptions__Alternatives )
            // InternalMyDsl.g:617:4: rule__PositionOptions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PositionOptions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPositionOptionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositionOptions"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalMyDsl.g:625:1: rule__Element__Alternatives : ( ( ruleTable ) | ( ruleMenu ) | ( ruleLineChart ) | ( ruleBarChart ) | ( ruleRadarChart ) | ( rulePieChart ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:629:1: ( ( ruleTable ) | ( ruleMenu ) | ( ruleLineChart ) | ( ruleBarChart ) | ( ruleRadarChart ) | ( rulePieChart ) )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:630:2: ( ruleTable )
                    {
                    // InternalMyDsl.g:630:2: ( ruleTable )
                    // InternalMyDsl.g:631:3: ruleTable
                    {
                     before(grammarAccess.getElementAccess().getTableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTable();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:636:2: ( ruleMenu )
                    {
                    // InternalMyDsl.g:636:2: ( ruleMenu )
                    // InternalMyDsl.g:637:3: ruleMenu
                    {
                     before(grammarAccess.getElementAccess().getMenuParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMenu();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMenuParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:642:2: ( ruleLineChart )
                    {
                    // InternalMyDsl.g:642:2: ( ruleLineChart )
                    // InternalMyDsl.g:643:3: ruleLineChart
                    {
                     before(grammarAccess.getElementAccess().getLineChartParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLineChart();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLineChartParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:648:2: ( ruleBarChart )
                    {
                    // InternalMyDsl.g:648:2: ( ruleBarChart )
                    // InternalMyDsl.g:649:3: ruleBarChart
                    {
                     before(grammarAccess.getElementAccess().getBarChartParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBarChart();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getBarChartParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:654:2: ( ruleRadarChart )
                    {
                    // InternalMyDsl.g:654:2: ( ruleRadarChart )
                    // InternalMyDsl.g:655:3: ruleRadarChart
                    {
                     before(grammarAccess.getElementAccess().getRadarChartParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRadarChart();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getRadarChartParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:660:2: ( rulePieChart )
                    {
                    // InternalMyDsl.g:660:2: ( rulePieChart )
                    // InternalMyDsl.g:661:3: rulePieChart
                    {
                     before(grammarAccess.getElementAccess().getPieChartParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulePieChart();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPieChartParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalMyDsl.g:670:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:675:2: ( 'E' )
                    {
                    // InternalMyDsl.g:675:2: ( 'E' )
                    // InternalMyDsl.g:676:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:681:2: ( 'e' )
                    {
                    // InternalMyDsl.g:681:2: ( 'e' )
                    // InternalMyDsl.g:682:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:691:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:695:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:696:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:696:2: ( RULE_STRING )
                    // InternalMyDsl.g:697:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:702:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:702:2: ( RULE_ID )
                    // InternalMyDsl.g:703:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__DBSystem__Alternatives"
    // InternalMyDsl.g:712:1: rule__DBSystem__Alternatives : ( ( ( 'MONGODB' ) ) | ( ( 'REDIS' ) ) );
    public final void rule__DBSystem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:1: ( ( ( 'MONGODB' ) ) | ( ( 'REDIS' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:717:2: ( ( 'MONGODB' ) )
                    {
                    // InternalMyDsl.g:717:2: ( ( 'MONGODB' ) )
                    // InternalMyDsl.g:718:3: ( 'MONGODB' )
                    {
                     before(grammarAccess.getDBSystemAccess().getMONGODBEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:719:3: ( 'MONGODB' )
                    // InternalMyDsl.g:719:4: 'MONGODB'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDBSystemAccess().getMONGODBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:723:2: ( ( 'REDIS' ) )
                    {
                    // InternalMyDsl.g:723:2: ( ( 'REDIS' ) )
                    // InternalMyDsl.g:724:3: ( 'REDIS' )
                    {
                     before(grammarAccess.getDBSystemAccess().getREDISEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:725:3: ( 'REDIS' )
                    // InternalMyDsl.g:725:4: 'REDIS'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDBSystemAccess().getREDISEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBSystem__Alternatives"


    // $ANTLR start "rule__Colors__Alternatives"
    // InternalMyDsl.g:733:1: rule__Colors__Alternatives : ( ( ( 'white' ) ) | ( ( 'blue' ) ) | ( ( 'red' ) ) | ( ( 'green' ) ) | ( ( 'gray' ) ) | ( ( 'yellow' ) ) | ( ( 'black' ) ) | ( ( 'cyan' ) ) | ( ( 'magenta' ) ) | ( ( 'silver' ) ) | ( ( 'maroon' ) ) | ( ( 'olive' ) ) | ( ( 'purple' ) ) | ( ( 'teal' ) ) | ( ( 'navy' ) ) );
    public final void rule__Colors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:737:1: ( ( ( 'white' ) ) | ( ( 'blue' ) ) | ( ( 'red' ) ) | ( ( 'green' ) ) | ( ( 'gray' ) ) | ( ( 'yellow' ) ) | ( ( 'black' ) ) | ( ( 'cyan' ) ) | ( ( 'magenta' ) ) | ( ( 'silver' ) ) | ( ( 'maroon' ) ) | ( ( 'olive' ) ) | ( ( 'purple' ) ) | ( ( 'teal' ) ) | ( ( 'navy' ) ) )
            int alt5=15;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 26:
                {
                alt5=5;
                }
                break;
            case 27:
                {
                alt5=6;
                }
                break;
            case 28:
                {
                alt5=7;
                }
                break;
            case 29:
                {
                alt5=8;
                }
                break;
            case 30:
                {
                alt5=9;
                }
                break;
            case 31:
                {
                alt5=10;
                }
                break;
            case 32:
                {
                alt5=11;
                }
                break;
            case 33:
                {
                alt5=12;
                }
                break;
            case 34:
                {
                alt5=13;
                }
                break;
            case 35:
                {
                alt5=14;
                }
                break;
            case 36:
                {
                alt5=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:738:2: ( ( 'white' ) )
                    {
                    // InternalMyDsl.g:738:2: ( ( 'white' ) )
                    // InternalMyDsl.g:739:3: ( 'white' )
                    {
                     before(grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:740:3: ( 'white' )
                    // InternalMyDsl.g:740:4: 'white'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getWhiteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:744:2: ( ( 'blue' ) )
                    {
                    // InternalMyDsl.g:744:2: ( ( 'blue' ) )
                    // InternalMyDsl.g:745:3: ( 'blue' )
                    {
                     before(grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:746:3: ( 'blue' )
                    // InternalMyDsl.g:746:4: 'blue'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBlueEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:750:2: ( ( 'red' ) )
                    {
                    // InternalMyDsl.g:750:2: ( ( 'red' ) )
                    // InternalMyDsl.g:751:3: ( 'red' )
                    {
                     before(grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:752:3: ( 'red' )
                    // InternalMyDsl.g:752:4: 'red'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getRedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:756:2: ( ( 'green' ) )
                    {
                    // InternalMyDsl.g:756:2: ( ( 'green' ) )
                    // InternalMyDsl.g:757:3: ( 'green' )
                    {
                     before(grammarAccess.getColorsAccess().getGreenEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:758:3: ( 'green' )
                    // InternalMyDsl.g:758:4: 'green'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getGreenEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:762:2: ( ( 'gray' ) )
                    {
                    // InternalMyDsl.g:762:2: ( ( 'gray' ) )
                    // InternalMyDsl.g:763:3: ( 'gray' )
                    {
                     before(grammarAccess.getColorsAccess().getGrayEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:764:3: ( 'gray' )
                    // InternalMyDsl.g:764:4: 'gray'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getGrayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:768:2: ( ( 'yellow' ) )
                    {
                    // InternalMyDsl.g:768:2: ( ( 'yellow' ) )
                    // InternalMyDsl.g:769:3: ( 'yellow' )
                    {
                     before(grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:770:3: ( 'yellow' )
                    // InternalMyDsl.g:770:4: 'yellow'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getYellowEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:774:2: ( ( 'black' ) )
                    {
                    // InternalMyDsl.g:774:2: ( ( 'black' ) )
                    // InternalMyDsl.g:775:3: ( 'black' )
                    {
                     before(grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:776:3: ( 'black' )
                    // InternalMyDsl.g:776:4: 'black'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBlackEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:780:2: ( ( 'cyan' ) )
                    {
                    // InternalMyDsl.g:780:2: ( ( 'cyan' ) )
                    // InternalMyDsl.g:781:3: ( 'cyan' )
                    {
                     before(grammarAccess.getColorsAccess().getCyanEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:782:3: ( 'cyan' )
                    // InternalMyDsl.g:782:4: 'cyan'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getCyanEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:786:2: ( ( 'magenta' ) )
                    {
                    // InternalMyDsl.g:786:2: ( ( 'magenta' ) )
                    // InternalMyDsl.g:787:3: ( 'magenta' )
                    {
                     before(grammarAccess.getColorsAccess().getMagentaEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:788:3: ( 'magenta' )
                    // InternalMyDsl.g:788:4: 'magenta'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getMagentaEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:792:2: ( ( 'silver' ) )
                    {
                    // InternalMyDsl.g:792:2: ( ( 'silver' ) )
                    // InternalMyDsl.g:793:3: ( 'silver' )
                    {
                     before(grammarAccess.getColorsAccess().getSilverEnumLiteralDeclaration_9()); 
                    // InternalMyDsl.g:794:3: ( 'silver' )
                    // InternalMyDsl.g:794:4: 'silver'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getSilverEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:798:2: ( ( 'maroon' ) )
                    {
                    // InternalMyDsl.g:798:2: ( ( 'maroon' ) )
                    // InternalMyDsl.g:799:3: ( 'maroon' )
                    {
                     before(grammarAccess.getColorsAccess().getMaroonEnumLiteralDeclaration_10()); 
                    // InternalMyDsl.g:800:3: ( 'maroon' )
                    // InternalMyDsl.g:800:4: 'maroon'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getMaroonEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:804:2: ( ( 'olive' ) )
                    {
                    // InternalMyDsl.g:804:2: ( ( 'olive' ) )
                    // InternalMyDsl.g:805:3: ( 'olive' )
                    {
                     before(grammarAccess.getColorsAccess().getOliveEnumLiteralDeclaration_11()); 
                    // InternalMyDsl.g:806:3: ( 'olive' )
                    // InternalMyDsl.g:806:4: 'olive'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getOliveEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:810:2: ( ( 'purple' ) )
                    {
                    // InternalMyDsl.g:810:2: ( ( 'purple' ) )
                    // InternalMyDsl.g:811:3: ( 'purple' )
                    {
                     before(grammarAccess.getColorsAccess().getPurpleEnumLiteralDeclaration_12()); 
                    // InternalMyDsl.g:812:3: ( 'purple' )
                    // InternalMyDsl.g:812:4: 'purple'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getPurpleEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:816:2: ( ( 'teal' ) )
                    {
                    // InternalMyDsl.g:816:2: ( ( 'teal' ) )
                    // InternalMyDsl.g:817:3: ( 'teal' )
                    {
                     before(grammarAccess.getColorsAccess().getTealEnumLiteralDeclaration_13()); 
                    // InternalMyDsl.g:818:3: ( 'teal' )
                    // InternalMyDsl.g:818:4: 'teal'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getTealEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:822:2: ( ( 'navy' ) )
                    {
                    // InternalMyDsl.g:822:2: ( ( 'navy' ) )
                    // InternalMyDsl.g:823:3: ( 'navy' )
                    {
                     before(grammarAccess.getColorsAccess().getNavyEnumLiteralDeclaration_14()); 
                    // InternalMyDsl.g:824:3: ( 'navy' )
                    // InternalMyDsl.g:824:4: 'navy'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getNavyEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colors__Alternatives"


    // $ANTLR start "rule__PositionOptions__Alternatives"
    // InternalMyDsl.g:832:1: rule__PositionOptions__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) | ( ( 'center' ) ) | ( ( 'top' ) ) | ( ( 'bottom' ) ) );
    public final void rule__PositionOptions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:836:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) | ( ( 'center' ) ) | ( ( 'top' ) ) | ( ( 'bottom' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt6=1;
                }
                break;
            case 38:
                {
                alt6=2;
                }
                break;
            case 39:
                {
                alt6=3;
                }
                break;
            case 40:
                {
                alt6=4;
                }
                break;
            case 41:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:837:2: ( ( 'left' ) )
                    {
                    // InternalMyDsl.g:837:2: ( ( 'left' ) )
                    // InternalMyDsl.g:838:3: ( 'left' )
                    {
                     before(grammarAccess.getPositionOptionsAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:839:3: ( 'left' )
                    // InternalMyDsl.g:839:4: 'left'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionOptionsAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:843:2: ( ( 'right' ) )
                    {
                    // InternalMyDsl.g:843:2: ( ( 'right' ) )
                    // InternalMyDsl.g:844:3: ( 'right' )
                    {
                     before(grammarAccess.getPositionOptionsAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:845:3: ( 'right' )
                    // InternalMyDsl.g:845:4: 'right'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionOptionsAccess().getRightEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:849:2: ( ( 'center' ) )
                    {
                    // InternalMyDsl.g:849:2: ( ( 'center' ) )
                    // InternalMyDsl.g:850:3: ( 'center' )
                    {
                     before(grammarAccess.getPositionOptionsAccess().getCenterEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:851:3: ( 'center' )
                    // InternalMyDsl.g:851:4: 'center'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionOptionsAccess().getCenterEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:855:2: ( ( 'top' ) )
                    {
                    // InternalMyDsl.g:855:2: ( ( 'top' ) )
                    // InternalMyDsl.g:856:3: ( 'top' )
                    {
                     before(grammarAccess.getPositionOptionsAccess().getTopEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:857:3: ( 'top' )
                    // InternalMyDsl.g:857:4: 'top'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionOptionsAccess().getTopEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:861:2: ( ( 'bottom' ) )
                    {
                    // InternalMyDsl.g:861:2: ( ( 'bottom' ) )
                    // InternalMyDsl.g:862:3: ( 'bottom' )
                    {
                     before(grammarAccess.getPositionOptionsAccess().getBottomEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:863:3: ( 'bottom' )
                    // InternalMyDsl.g:863:4: 'bottom'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionOptionsAccess().getBottomEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionOptions__Alternatives"


    // $ANTLR start "rule__Company__Group__0"
    // InternalMyDsl.g:871:1: rule__Company__Group__0 : rule__Company__Group__0__Impl rule__Company__Group__1 ;
    public final void rule__Company__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( rule__Company__Group__0__Impl rule__Company__Group__1 )
            // InternalMyDsl.g:876:2: rule__Company__Group__0__Impl rule__Company__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Company__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__0"


    // $ANTLR start "rule__Company__Group__0__Impl"
    // InternalMyDsl.g:883:1: rule__Company__Group__0__Impl : ( 'Company' ) ;
    public final void rule__Company__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:887:1: ( ( 'Company' ) )
            // InternalMyDsl.g:888:1: ( 'Company' )
            {
            // InternalMyDsl.g:888:1: ( 'Company' )
            // InternalMyDsl.g:889:2: 'Company'
            {
             before(grammarAccess.getCompanyAccess().getCompanyKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getCompanyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__0__Impl"


    // $ANTLR start "rule__Company__Group__1"
    // InternalMyDsl.g:898:1: rule__Company__Group__1 : rule__Company__Group__1__Impl rule__Company__Group__2 ;
    public final void rule__Company__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( rule__Company__Group__1__Impl rule__Company__Group__2 )
            // InternalMyDsl.g:903:2: rule__Company__Group__1__Impl rule__Company__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Company__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__1"


    // $ANTLR start "rule__Company__Group__1__Impl"
    // InternalMyDsl.g:910:1: rule__Company__Group__1__Impl : ( ( rule__Company__NameAssignment_1 ) ) ;
    public final void rule__Company__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:914:1: ( ( ( rule__Company__NameAssignment_1 ) ) )
            // InternalMyDsl.g:915:1: ( ( rule__Company__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:915:1: ( ( rule__Company__NameAssignment_1 ) )
            // InternalMyDsl.g:916:2: ( rule__Company__NameAssignment_1 )
            {
             before(grammarAccess.getCompanyAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:917:2: ( rule__Company__NameAssignment_1 )
            // InternalMyDsl.g:917:3: rule__Company__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Company__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__1__Impl"


    // $ANTLR start "rule__Company__Group__2"
    // InternalMyDsl.g:925:1: rule__Company__Group__2 : rule__Company__Group__2__Impl rule__Company__Group__3 ;
    public final void rule__Company__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( rule__Company__Group__2__Impl rule__Company__Group__3 )
            // InternalMyDsl.g:930:2: rule__Company__Group__2__Impl rule__Company__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Company__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__2"


    // $ANTLR start "rule__Company__Group__2__Impl"
    // InternalMyDsl.g:937:1: rule__Company__Group__2__Impl : ( ( rule__Company__Group_2__0 )? ) ;
    public final void rule__Company__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:1: ( ( ( rule__Company__Group_2__0 )? ) )
            // InternalMyDsl.g:942:1: ( ( rule__Company__Group_2__0 )? )
            {
            // InternalMyDsl.g:942:1: ( ( rule__Company__Group_2__0 )? )
            // InternalMyDsl.g:943:2: ( rule__Company__Group_2__0 )?
            {
             before(grammarAccess.getCompanyAccess().getGroup_2()); 
            // InternalMyDsl.g:944:2: ( rule__Company__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==45) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:944:3: rule__Company__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Company__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompanyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__2__Impl"


    // $ANTLR start "rule__Company__Group__3"
    // InternalMyDsl.g:952:1: rule__Company__Group__3 : rule__Company__Group__3__Impl rule__Company__Group__4 ;
    public final void rule__Company__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( rule__Company__Group__3__Impl rule__Company__Group__4 )
            // InternalMyDsl.g:957:2: rule__Company__Group__3__Impl rule__Company__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Company__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__3"


    // $ANTLR start "rule__Company__Group__3__Impl"
    // InternalMyDsl.g:964:1: rule__Company__Group__3__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Company__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:969:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:969:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:970:2: RULE_OBJECT_START
            {
             before(grammarAccess.getCompanyAccess().getOBJECT_STARTTerminalRuleCall_3()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getOBJECT_STARTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__3__Impl"


    // $ANTLR start "rule__Company__Group__4"
    // InternalMyDsl.g:979:1: rule__Company__Group__4 : rule__Company__Group__4__Impl rule__Company__Group__5 ;
    public final void rule__Company__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:983:1: ( rule__Company__Group__4__Impl rule__Company__Group__5 )
            // InternalMyDsl.g:984:2: rule__Company__Group__4__Impl rule__Company__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Company__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__4"


    // $ANTLR start "rule__Company__Group__4__Impl"
    // InternalMyDsl.g:991:1: rule__Company__Group__4__Impl : ( 'dashboards' ) ;
    public final void rule__Company__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( ( 'dashboards' ) )
            // InternalMyDsl.g:996:1: ( 'dashboards' )
            {
            // InternalMyDsl.g:996:1: ( 'dashboards' )
            // InternalMyDsl.g:997:2: 'dashboards'
            {
             before(grammarAccess.getCompanyAccess().getDashboardsKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getDashboardsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__4__Impl"


    // $ANTLR start "rule__Company__Group__5"
    // InternalMyDsl.g:1006:1: rule__Company__Group__5 : rule__Company__Group__5__Impl rule__Company__Group__6 ;
    public final void rule__Company__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( rule__Company__Group__5__Impl rule__Company__Group__6 )
            // InternalMyDsl.g:1011:2: rule__Company__Group__5__Impl rule__Company__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Company__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__5"


    // $ANTLR start "rule__Company__Group__5__Impl"
    // InternalMyDsl.g:1018:1: rule__Company__Group__5__Impl : ( RULE_EQUALS ) ;
    public final void rule__Company__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:1023:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:1023:1: ( RULE_EQUALS )
            // InternalMyDsl.g:1024:2: RULE_EQUALS
            {
             before(grammarAccess.getCompanyAccess().getEQUALSTerminalRuleCall_5()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getEQUALSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__5__Impl"


    // $ANTLR start "rule__Company__Group__6"
    // InternalMyDsl.g:1033:1: rule__Company__Group__6 : rule__Company__Group__6__Impl rule__Company__Group__7 ;
    public final void rule__Company__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( rule__Company__Group__6__Impl rule__Company__Group__7 )
            // InternalMyDsl.g:1038:2: rule__Company__Group__6__Impl rule__Company__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Company__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__6"


    // $ANTLR start "rule__Company__Group__6__Impl"
    // InternalMyDsl.g:1045:1: rule__Company__Group__6__Impl : ( RULE_LIST_START ) ;
    public final void rule__Company__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:1050:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:1050:1: ( RULE_LIST_START )
            // InternalMyDsl.g:1051:2: RULE_LIST_START
            {
             before(grammarAccess.getCompanyAccess().getLIST_STARTTerminalRuleCall_6()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getLIST_STARTTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__6__Impl"


    // $ANTLR start "rule__Company__Group__7"
    // InternalMyDsl.g:1060:1: rule__Company__Group__7 : rule__Company__Group__7__Impl rule__Company__Group__8 ;
    public final void rule__Company__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( rule__Company__Group__7__Impl rule__Company__Group__8 )
            // InternalMyDsl.g:1065:2: rule__Company__Group__7__Impl rule__Company__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Company__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__7"


    // $ANTLR start "rule__Company__Group__7__Impl"
    // InternalMyDsl.g:1072:1: rule__Company__Group__7__Impl : ( ( rule__Company__DashboardsAssignment_7 ) ) ;
    public final void rule__Company__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( ( ( rule__Company__DashboardsAssignment_7 ) ) )
            // InternalMyDsl.g:1077:1: ( ( rule__Company__DashboardsAssignment_7 ) )
            {
            // InternalMyDsl.g:1077:1: ( ( rule__Company__DashboardsAssignment_7 ) )
            // InternalMyDsl.g:1078:2: ( rule__Company__DashboardsAssignment_7 )
            {
             before(grammarAccess.getCompanyAccess().getDashboardsAssignment_7()); 
            // InternalMyDsl.g:1079:2: ( rule__Company__DashboardsAssignment_7 )
            // InternalMyDsl.g:1079:3: rule__Company__DashboardsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Company__DashboardsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getDashboardsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__7__Impl"


    // $ANTLR start "rule__Company__Group__8"
    // InternalMyDsl.g:1087:1: rule__Company__Group__8 : rule__Company__Group__8__Impl rule__Company__Group__9 ;
    public final void rule__Company__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:1: ( rule__Company__Group__8__Impl rule__Company__Group__9 )
            // InternalMyDsl.g:1092:2: rule__Company__Group__8__Impl rule__Company__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Company__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__8"


    // $ANTLR start "rule__Company__Group__8__Impl"
    // InternalMyDsl.g:1099:1: rule__Company__Group__8__Impl : ( ( rule__Company__Group_8__0 )* ) ;
    public final void rule__Company__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1103:1: ( ( ( rule__Company__Group_8__0 )* ) )
            // InternalMyDsl.g:1104:1: ( ( rule__Company__Group_8__0 )* )
            {
            // InternalMyDsl.g:1104:1: ( ( rule__Company__Group_8__0 )* )
            // InternalMyDsl.g:1105:2: ( rule__Company__Group_8__0 )*
            {
             before(grammarAccess.getCompanyAccess().getGroup_8()); 
            // InternalMyDsl.g:1106:2: ( rule__Company__Group_8__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1106:3: rule__Company__Group_8__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Company__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCompanyAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__8__Impl"


    // $ANTLR start "rule__Company__Group__9"
    // InternalMyDsl.g:1114:1: rule__Company__Group__9 : rule__Company__Group__9__Impl rule__Company__Group__10 ;
    public final void rule__Company__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1118:1: ( rule__Company__Group__9__Impl rule__Company__Group__10 )
            // InternalMyDsl.g:1119:2: rule__Company__Group__9__Impl rule__Company__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Company__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__9"


    // $ANTLR start "rule__Company__Group__9__Impl"
    // InternalMyDsl.g:1126:1: rule__Company__Group__9__Impl : ( RULE_LIST_END ) ;
    public final void rule__Company__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:1131:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:1131:1: ( RULE_LIST_END )
            // InternalMyDsl.g:1132:2: RULE_LIST_END
            {
             before(grammarAccess.getCompanyAccess().getLIST_ENDTerminalRuleCall_9()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getLIST_ENDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__9__Impl"


    // $ANTLR start "rule__Company__Group__10"
    // InternalMyDsl.g:1141:1: rule__Company__Group__10 : rule__Company__Group__10__Impl rule__Company__Group__11 ;
    public final void rule__Company__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( rule__Company__Group__10__Impl rule__Company__Group__11 )
            // InternalMyDsl.g:1146:2: rule__Company__Group__10__Impl rule__Company__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Company__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__10"


    // $ANTLR start "rule__Company__Group__10__Impl"
    // InternalMyDsl.g:1153:1: rule__Company__Group__10__Impl : ( 'DBServers' ) ;
    public final void rule__Company__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( ( 'DBServers' ) )
            // InternalMyDsl.g:1158:1: ( 'DBServers' )
            {
            // InternalMyDsl.g:1158:1: ( 'DBServers' )
            // InternalMyDsl.g:1159:2: 'DBServers'
            {
             before(grammarAccess.getCompanyAccess().getDBServersKeyword_10()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getDBServersKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__10__Impl"


    // $ANTLR start "rule__Company__Group__11"
    // InternalMyDsl.g:1168:1: rule__Company__Group__11 : rule__Company__Group__11__Impl rule__Company__Group__12 ;
    public final void rule__Company__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1172:1: ( rule__Company__Group__11__Impl rule__Company__Group__12 )
            // InternalMyDsl.g:1173:2: rule__Company__Group__11__Impl rule__Company__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__Company__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__11"


    // $ANTLR start "rule__Company__Group__11__Impl"
    // InternalMyDsl.g:1180:1: rule__Company__Group__11__Impl : ( RULE_EQUALS ) ;
    public final void rule__Company__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:1185:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:1185:1: ( RULE_EQUALS )
            // InternalMyDsl.g:1186:2: RULE_EQUALS
            {
             before(grammarAccess.getCompanyAccess().getEQUALSTerminalRuleCall_11()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getEQUALSTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__11__Impl"


    // $ANTLR start "rule__Company__Group__12"
    // InternalMyDsl.g:1195:1: rule__Company__Group__12 : rule__Company__Group__12__Impl rule__Company__Group__13 ;
    public final void rule__Company__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1199:1: ( rule__Company__Group__12__Impl rule__Company__Group__13 )
            // InternalMyDsl.g:1200:2: rule__Company__Group__12__Impl rule__Company__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Company__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__12"


    // $ANTLR start "rule__Company__Group__12__Impl"
    // InternalMyDsl.g:1207:1: rule__Company__Group__12__Impl : ( RULE_LIST_START ) ;
    public final void rule__Company__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:1212:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:1212:1: ( RULE_LIST_START )
            // InternalMyDsl.g:1213:2: RULE_LIST_START
            {
             before(grammarAccess.getCompanyAccess().getLIST_STARTTerminalRuleCall_12()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getLIST_STARTTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__12__Impl"


    // $ANTLR start "rule__Company__Group__13"
    // InternalMyDsl.g:1222:1: rule__Company__Group__13 : rule__Company__Group__13__Impl rule__Company__Group__14 ;
    public final void rule__Company__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1226:1: ( rule__Company__Group__13__Impl rule__Company__Group__14 )
            // InternalMyDsl.g:1227:2: rule__Company__Group__13__Impl rule__Company__Group__14
            {
            pushFollow(FOLLOW_9);
            rule__Company__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__13"


    // $ANTLR start "rule__Company__Group__13__Impl"
    // InternalMyDsl.g:1234:1: rule__Company__Group__13__Impl : ( ( rule__Company__DBServersAssignment_13 ) ) ;
    public final void rule__Company__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( ( ( rule__Company__DBServersAssignment_13 ) ) )
            // InternalMyDsl.g:1239:1: ( ( rule__Company__DBServersAssignment_13 ) )
            {
            // InternalMyDsl.g:1239:1: ( ( rule__Company__DBServersAssignment_13 ) )
            // InternalMyDsl.g:1240:2: ( rule__Company__DBServersAssignment_13 )
            {
             before(grammarAccess.getCompanyAccess().getDBServersAssignment_13()); 
            // InternalMyDsl.g:1241:2: ( rule__Company__DBServersAssignment_13 )
            // InternalMyDsl.g:1241:3: rule__Company__DBServersAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Company__DBServersAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getDBServersAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__13__Impl"


    // $ANTLR start "rule__Company__Group__14"
    // InternalMyDsl.g:1249:1: rule__Company__Group__14 : rule__Company__Group__14__Impl rule__Company__Group__15 ;
    public final void rule__Company__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( rule__Company__Group__14__Impl rule__Company__Group__15 )
            // InternalMyDsl.g:1254:2: rule__Company__Group__14__Impl rule__Company__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__Company__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__14"


    // $ANTLR start "rule__Company__Group__14__Impl"
    // InternalMyDsl.g:1261:1: rule__Company__Group__14__Impl : ( ( rule__Company__Group_14__0 )* ) ;
    public final void rule__Company__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( ( ( rule__Company__Group_14__0 )* ) )
            // InternalMyDsl.g:1266:1: ( ( rule__Company__Group_14__0 )* )
            {
            // InternalMyDsl.g:1266:1: ( ( rule__Company__Group_14__0 )* )
            // InternalMyDsl.g:1267:2: ( rule__Company__Group_14__0 )*
            {
             before(grammarAccess.getCompanyAccess().getGroup_14()); 
            // InternalMyDsl.g:1268:2: ( rule__Company__Group_14__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1268:3: rule__Company__Group_14__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Company__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCompanyAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__14__Impl"


    // $ANTLR start "rule__Company__Group__15"
    // InternalMyDsl.g:1276:1: rule__Company__Group__15 : rule__Company__Group__15__Impl rule__Company__Group__16 ;
    public final void rule__Company__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( rule__Company__Group__15__Impl rule__Company__Group__16 )
            // InternalMyDsl.g:1281:2: rule__Company__Group__15__Impl rule__Company__Group__16
            {
            pushFollow(FOLLOW_12);
            rule__Company__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__15"


    // $ANTLR start "rule__Company__Group__15__Impl"
    // InternalMyDsl.g:1288:1: rule__Company__Group__15__Impl : ( RULE_LIST_END ) ;
    public final void rule__Company__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:1293:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:1293:1: ( RULE_LIST_END )
            // InternalMyDsl.g:1294:2: RULE_LIST_END
            {
             before(grammarAccess.getCompanyAccess().getLIST_ENDTerminalRuleCall_15()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getLIST_ENDTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__15__Impl"


    // $ANTLR start "rule__Company__Group__16"
    // InternalMyDsl.g:1303:1: rule__Company__Group__16 : rule__Company__Group__16__Impl ;
    public final void rule__Company__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1307:1: ( rule__Company__Group__16__Impl )
            // InternalMyDsl.g:1308:2: rule__Company__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__16"


    // $ANTLR start "rule__Company__Group__16__Impl"
    // InternalMyDsl.g:1314:1: rule__Company__Group__16__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Company__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1318:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:1319:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:1319:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:1320:2: RULE_OBJECT_END
            {
             before(grammarAccess.getCompanyAccess().getOBJECT_ENDTerminalRuleCall_16()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getOBJECT_ENDTerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__16__Impl"


    // $ANTLR start "rule__Company__Group_2__0"
    // InternalMyDsl.g:1330:1: rule__Company__Group_2__0 : rule__Company__Group_2__0__Impl rule__Company__Group_2__1 ;
    public final void rule__Company__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1334:1: ( rule__Company__Group_2__0__Impl rule__Company__Group_2__1 )
            // InternalMyDsl.g:1335:2: rule__Company__Group_2__0__Impl rule__Company__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Company__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_2__0"


    // $ANTLR start "rule__Company__Group_2__0__Impl"
    // InternalMyDsl.g:1342:1: rule__Company__Group_2__0__Impl : ( 'nit' ) ;
    public final void rule__Company__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( ( 'nit' ) )
            // InternalMyDsl.g:1347:1: ( 'nit' )
            {
            // InternalMyDsl.g:1347:1: ( 'nit' )
            // InternalMyDsl.g:1348:2: 'nit'
            {
             before(grammarAccess.getCompanyAccess().getNitKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getNitKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_2__0__Impl"


    // $ANTLR start "rule__Company__Group_2__1"
    // InternalMyDsl.g:1357:1: rule__Company__Group_2__1 : rule__Company__Group_2__1__Impl ;
    public final void rule__Company__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1361:1: ( rule__Company__Group_2__1__Impl )
            // InternalMyDsl.g:1362:2: rule__Company__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_2__1"


    // $ANTLR start "rule__Company__Group_2__1__Impl"
    // InternalMyDsl.g:1368:1: rule__Company__Group_2__1__Impl : ( ( rule__Company__NitAssignment_2_1 ) ) ;
    public final void rule__Company__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1372:1: ( ( ( rule__Company__NitAssignment_2_1 ) ) )
            // InternalMyDsl.g:1373:1: ( ( rule__Company__NitAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1373:1: ( ( rule__Company__NitAssignment_2_1 ) )
            // InternalMyDsl.g:1374:2: ( rule__Company__NitAssignment_2_1 )
            {
             before(grammarAccess.getCompanyAccess().getNitAssignment_2_1()); 
            // InternalMyDsl.g:1375:2: ( rule__Company__NitAssignment_2_1 )
            // InternalMyDsl.g:1375:3: rule__Company__NitAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Company__NitAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getNitAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_2__1__Impl"


    // $ANTLR start "rule__Company__Group_8__0"
    // InternalMyDsl.g:1384:1: rule__Company__Group_8__0 : rule__Company__Group_8__0__Impl rule__Company__Group_8__1 ;
    public final void rule__Company__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1388:1: ( rule__Company__Group_8__0__Impl rule__Company__Group_8__1 )
            // InternalMyDsl.g:1389:2: rule__Company__Group_8__0__Impl rule__Company__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__Company__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_8__0"


    // $ANTLR start "rule__Company__Group_8__0__Impl"
    // InternalMyDsl.g:1396:1: rule__Company__Group_8__0__Impl : ( RULE_COMA ) ;
    public final void rule__Company__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:1401:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:1401:1: ( RULE_COMA )
            // InternalMyDsl.g:1402:2: RULE_COMA
            {
             before(grammarAccess.getCompanyAccess().getCOMATerminalRuleCall_8_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getCOMATerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_8__0__Impl"


    // $ANTLR start "rule__Company__Group_8__1"
    // InternalMyDsl.g:1411:1: rule__Company__Group_8__1 : rule__Company__Group_8__1__Impl ;
    public final void rule__Company__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1415:1: ( rule__Company__Group_8__1__Impl )
            // InternalMyDsl.g:1416:2: rule__Company__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_8__1"


    // $ANTLR start "rule__Company__Group_8__1__Impl"
    // InternalMyDsl.g:1422:1: rule__Company__Group_8__1__Impl : ( ( rule__Company__DashboardsAssignment_8_1 ) ) ;
    public final void rule__Company__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1426:1: ( ( ( rule__Company__DashboardsAssignment_8_1 ) ) )
            // InternalMyDsl.g:1427:1: ( ( rule__Company__DashboardsAssignment_8_1 ) )
            {
            // InternalMyDsl.g:1427:1: ( ( rule__Company__DashboardsAssignment_8_1 ) )
            // InternalMyDsl.g:1428:2: ( rule__Company__DashboardsAssignment_8_1 )
            {
             before(grammarAccess.getCompanyAccess().getDashboardsAssignment_8_1()); 
            // InternalMyDsl.g:1429:2: ( rule__Company__DashboardsAssignment_8_1 )
            // InternalMyDsl.g:1429:3: rule__Company__DashboardsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Company__DashboardsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getDashboardsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_8__1__Impl"


    // $ANTLR start "rule__Company__Group_14__0"
    // InternalMyDsl.g:1438:1: rule__Company__Group_14__0 : rule__Company__Group_14__0__Impl rule__Company__Group_14__1 ;
    public final void rule__Company__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1442:1: ( rule__Company__Group_14__0__Impl rule__Company__Group_14__1 )
            // InternalMyDsl.g:1443:2: rule__Company__Group_14__0__Impl rule__Company__Group_14__1
            {
            pushFollow(FOLLOW_8);
            rule__Company__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_14__0"


    // $ANTLR start "rule__Company__Group_14__0__Impl"
    // InternalMyDsl.g:1450:1: rule__Company__Group_14__0__Impl : ( RULE_COMA ) ;
    public final void rule__Company__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:1455:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:1455:1: ( RULE_COMA )
            // InternalMyDsl.g:1456:2: RULE_COMA
            {
             before(grammarAccess.getCompanyAccess().getCOMATerminalRuleCall_14_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getCOMATerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_14__0__Impl"


    // $ANTLR start "rule__Company__Group_14__1"
    // InternalMyDsl.g:1465:1: rule__Company__Group_14__1 : rule__Company__Group_14__1__Impl ;
    public final void rule__Company__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1469:1: ( rule__Company__Group_14__1__Impl )
            // InternalMyDsl.g:1470:2: rule__Company__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_14__1"


    // $ANTLR start "rule__Company__Group_14__1__Impl"
    // InternalMyDsl.g:1476:1: rule__Company__Group_14__1__Impl : ( ( rule__Company__DBServersAssignment_14_1 ) ) ;
    public final void rule__Company__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1480:1: ( ( ( rule__Company__DBServersAssignment_14_1 ) ) )
            // InternalMyDsl.g:1481:1: ( ( rule__Company__DBServersAssignment_14_1 ) )
            {
            // InternalMyDsl.g:1481:1: ( ( rule__Company__DBServersAssignment_14_1 ) )
            // InternalMyDsl.g:1482:2: ( rule__Company__DBServersAssignment_14_1 )
            {
             before(grammarAccess.getCompanyAccess().getDBServersAssignment_14_1()); 
            // InternalMyDsl.g:1483:2: ( rule__Company__DBServersAssignment_14_1 )
            // InternalMyDsl.g:1483:3: rule__Company__DBServersAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Company__DBServersAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getDBServersAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_14__1__Impl"


    // $ANTLR start "rule__Dashboard__Group__0"
    // InternalMyDsl.g:1492:1: rule__Dashboard__Group__0 : rule__Dashboard__Group__0__Impl rule__Dashboard__Group__1 ;
    public final void rule__Dashboard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1496:1: ( rule__Dashboard__Group__0__Impl rule__Dashboard__Group__1 )
            // InternalMyDsl.g:1497:2: rule__Dashboard__Group__0__Impl rule__Dashboard__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Dashboard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__0"


    // $ANTLR start "rule__Dashboard__Group__0__Impl"
    // InternalMyDsl.g:1504:1: rule__Dashboard__Group__0__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Dashboard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:1509:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:1509:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:1510:2: RULE_OBJECT_START
            {
             before(grammarAccess.getDashboardAccess().getOBJECT_STARTTerminalRuleCall_0()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getDashboardAccess().getOBJECT_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__0__Impl"


    // $ANTLR start "rule__Dashboard__Group__1"
    // InternalMyDsl.g:1519:1: rule__Dashboard__Group__1 : rule__Dashboard__Group__1__Impl rule__Dashboard__Group__2 ;
    public final void rule__Dashboard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1523:1: ( rule__Dashboard__Group__1__Impl rule__Dashboard__Group__2 )
            // InternalMyDsl.g:1524:2: rule__Dashboard__Group__1__Impl rule__Dashboard__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Dashboard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__1"


    // $ANTLR start "rule__Dashboard__Group__1__Impl"
    // InternalMyDsl.g:1531:1: rule__Dashboard__Group__1__Impl : ( ( rule__Dashboard__NameAssignment_1 ) ) ;
    public final void rule__Dashboard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1535:1: ( ( ( rule__Dashboard__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1536:1: ( ( rule__Dashboard__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1536:1: ( ( rule__Dashboard__NameAssignment_1 ) )
            // InternalMyDsl.g:1537:2: ( rule__Dashboard__NameAssignment_1 )
            {
             before(grammarAccess.getDashboardAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1538:2: ( rule__Dashboard__NameAssignment_1 )
            // InternalMyDsl.g:1538:3: rule__Dashboard__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDashboardAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__1__Impl"


    // $ANTLR start "rule__Dashboard__Group__2"
    // InternalMyDsl.g:1546:1: rule__Dashboard__Group__2 : rule__Dashboard__Group__2__Impl rule__Dashboard__Group__3 ;
    public final void rule__Dashboard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1550:1: ( rule__Dashboard__Group__2__Impl rule__Dashboard__Group__3 )
            // InternalMyDsl.g:1551:2: rule__Dashboard__Group__2__Impl rule__Dashboard__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Dashboard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__2"


    // $ANTLR start "rule__Dashboard__Group__2__Impl"
    // InternalMyDsl.g:1558:1: rule__Dashboard__Group__2__Impl : ( 'panels' ) ;
    public final void rule__Dashboard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1562:1: ( ( 'panels' ) )
            // InternalMyDsl.g:1563:1: ( 'panels' )
            {
            // InternalMyDsl.g:1563:1: ( 'panels' )
            // InternalMyDsl.g:1564:2: 'panels'
            {
             before(grammarAccess.getDashboardAccess().getPanelsKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDashboardAccess().getPanelsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__2__Impl"


    // $ANTLR start "rule__Dashboard__Group__3"
    // InternalMyDsl.g:1573:1: rule__Dashboard__Group__3 : rule__Dashboard__Group__3__Impl rule__Dashboard__Group__4 ;
    public final void rule__Dashboard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1577:1: ( rule__Dashboard__Group__3__Impl rule__Dashboard__Group__4 )
            // InternalMyDsl.g:1578:2: rule__Dashboard__Group__3__Impl rule__Dashboard__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Dashboard__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__3"


    // $ANTLR start "rule__Dashboard__Group__3__Impl"
    // InternalMyDsl.g:1585:1: rule__Dashboard__Group__3__Impl : ( RULE_EQUALS ) ;
    public final void rule__Dashboard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:1590:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:1590:1: ( RULE_EQUALS )
            // InternalMyDsl.g:1591:2: RULE_EQUALS
            {
             before(grammarAccess.getDashboardAccess().getEQUALSTerminalRuleCall_3()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getDashboardAccess().getEQUALSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__3__Impl"


    // $ANTLR start "rule__Dashboard__Group__4"
    // InternalMyDsl.g:1600:1: rule__Dashboard__Group__4 : rule__Dashboard__Group__4__Impl rule__Dashboard__Group__5 ;
    public final void rule__Dashboard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1604:1: ( rule__Dashboard__Group__4__Impl rule__Dashboard__Group__5 )
            // InternalMyDsl.g:1605:2: rule__Dashboard__Group__4__Impl rule__Dashboard__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Dashboard__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__4"


    // $ANTLR start "rule__Dashboard__Group__4__Impl"
    // InternalMyDsl.g:1612:1: rule__Dashboard__Group__4__Impl : ( RULE_LIST_START ) ;
    public final void rule__Dashboard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1616:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:1617:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:1617:1: ( RULE_LIST_START )
            // InternalMyDsl.g:1618:2: RULE_LIST_START
            {
             before(grammarAccess.getDashboardAccess().getLIST_STARTTerminalRuleCall_4()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getDashboardAccess().getLIST_STARTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__4__Impl"


    // $ANTLR start "rule__Dashboard__Group__5"
    // InternalMyDsl.g:1627:1: rule__Dashboard__Group__5 : rule__Dashboard__Group__5__Impl rule__Dashboard__Group__6 ;
    public final void rule__Dashboard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1631:1: ( rule__Dashboard__Group__5__Impl rule__Dashboard__Group__6 )
            // InternalMyDsl.g:1632:2: rule__Dashboard__Group__5__Impl rule__Dashboard__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Dashboard__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__5"


    // $ANTLR start "rule__Dashboard__Group__5__Impl"
    // InternalMyDsl.g:1639:1: rule__Dashboard__Group__5__Impl : ( ( rule__Dashboard__PanelsAssignment_5 ) ) ;
    public final void rule__Dashboard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1643:1: ( ( ( rule__Dashboard__PanelsAssignment_5 ) ) )
            // InternalMyDsl.g:1644:1: ( ( rule__Dashboard__PanelsAssignment_5 ) )
            {
            // InternalMyDsl.g:1644:1: ( ( rule__Dashboard__PanelsAssignment_5 ) )
            // InternalMyDsl.g:1645:2: ( rule__Dashboard__PanelsAssignment_5 )
            {
             before(grammarAccess.getDashboardAccess().getPanelsAssignment_5()); 
            // InternalMyDsl.g:1646:2: ( rule__Dashboard__PanelsAssignment_5 )
            // InternalMyDsl.g:1646:3: rule__Dashboard__PanelsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__PanelsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDashboardAccess().getPanelsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__5__Impl"


    // $ANTLR start "rule__Dashboard__Group__6"
    // InternalMyDsl.g:1654:1: rule__Dashboard__Group__6 : rule__Dashboard__Group__6__Impl rule__Dashboard__Group__7 ;
    public final void rule__Dashboard__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1658:1: ( rule__Dashboard__Group__6__Impl rule__Dashboard__Group__7 )
            // InternalMyDsl.g:1659:2: rule__Dashboard__Group__6__Impl rule__Dashboard__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Dashboard__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__6"


    // $ANTLR start "rule__Dashboard__Group__6__Impl"
    // InternalMyDsl.g:1666:1: rule__Dashboard__Group__6__Impl : ( ( rule__Dashboard__Group_6__0 )* ) ;
    public final void rule__Dashboard__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1670:1: ( ( ( rule__Dashboard__Group_6__0 )* ) )
            // InternalMyDsl.g:1671:1: ( ( rule__Dashboard__Group_6__0 )* )
            {
            // InternalMyDsl.g:1671:1: ( ( rule__Dashboard__Group_6__0 )* )
            // InternalMyDsl.g:1672:2: ( rule__Dashboard__Group_6__0 )*
            {
             before(grammarAccess.getDashboardAccess().getGroup_6()); 
            // InternalMyDsl.g:1673:2: ( rule__Dashboard__Group_6__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1673:3: rule__Dashboard__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Dashboard__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDashboardAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__6__Impl"


    // $ANTLR start "rule__Dashboard__Group__7"
    // InternalMyDsl.g:1681:1: rule__Dashboard__Group__7 : rule__Dashboard__Group__7__Impl rule__Dashboard__Group__8 ;
    public final void rule__Dashboard__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1685:1: ( rule__Dashboard__Group__7__Impl rule__Dashboard__Group__8 )
            // InternalMyDsl.g:1686:2: rule__Dashboard__Group__7__Impl rule__Dashboard__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Dashboard__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__7"


    // $ANTLR start "rule__Dashboard__Group__7__Impl"
    // InternalMyDsl.g:1693:1: rule__Dashboard__Group__7__Impl : ( RULE_LIST_END ) ;
    public final void rule__Dashboard__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1697:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:1698:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:1698:1: ( RULE_LIST_END )
            // InternalMyDsl.g:1699:2: RULE_LIST_END
            {
             before(grammarAccess.getDashboardAccess().getLIST_ENDTerminalRuleCall_7()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getDashboardAccess().getLIST_ENDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__7__Impl"


    // $ANTLR start "rule__Dashboard__Group__8"
    // InternalMyDsl.g:1708:1: rule__Dashboard__Group__8 : rule__Dashboard__Group__8__Impl ;
    public final void rule__Dashboard__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1712:1: ( rule__Dashboard__Group__8__Impl )
            // InternalMyDsl.g:1713:2: rule__Dashboard__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__8"


    // $ANTLR start "rule__Dashboard__Group__8__Impl"
    // InternalMyDsl.g:1719:1: rule__Dashboard__Group__8__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Dashboard__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:1724:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:1724:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:1725:2: RULE_OBJECT_END
            {
             before(grammarAccess.getDashboardAccess().getOBJECT_ENDTerminalRuleCall_8()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getDashboardAccess().getOBJECT_ENDTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group__8__Impl"


    // $ANTLR start "rule__Dashboard__Group_6__0"
    // InternalMyDsl.g:1735:1: rule__Dashboard__Group_6__0 : rule__Dashboard__Group_6__0__Impl rule__Dashboard__Group_6__1 ;
    public final void rule__Dashboard__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1739:1: ( rule__Dashboard__Group_6__0__Impl rule__Dashboard__Group_6__1 )
            // InternalMyDsl.g:1740:2: rule__Dashboard__Group_6__0__Impl rule__Dashboard__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Dashboard__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dashboard__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group_6__0"


    // $ANTLR start "rule__Dashboard__Group_6__0__Impl"
    // InternalMyDsl.g:1747:1: rule__Dashboard__Group_6__0__Impl : ( RULE_COMA ) ;
    public final void rule__Dashboard__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1751:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:1752:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:1752:1: ( RULE_COMA )
            // InternalMyDsl.g:1753:2: RULE_COMA
            {
             before(grammarAccess.getDashboardAccess().getCOMATerminalRuleCall_6_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getDashboardAccess().getCOMATerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group_6__0__Impl"


    // $ANTLR start "rule__Dashboard__Group_6__1"
    // InternalMyDsl.g:1762:1: rule__Dashboard__Group_6__1 : rule__Dashboard__Group_6__1__Impl ;
    public final void rule__Dashboard__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1766:1: ( rule__Dashboard__Group_6__1__Impl )
            // InternalMyDsl.g:1767:2: rule__Dashboard__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group_6__1"


    // $ANTLR start "rule__Dashboard__Group_6__1__Impl"
    // InternalMyDsl.g:1773:1: rule__Dashboard__Group_6__1__Impl : ( ( rule__Dashboard__PanelsAssignment_6_1 ) ) ;
    public final void rule__Dashboard__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1777:1: ( ( ( rule__Dashboard__PanelsAssignment_6_1 ) ) )
            // InternalMyDsl.g:1778:1: ( ( rule__Dashboard__PanelsAssignment_6_1 ) )
            {
            // InternalMyDsl.g:1778:1: ( ( rule__Dashboard__PanelsAssignment_6_1 ) )
            // InternalMyDsl.g:1779:2: ( rule__Dashboard__PanelsAssignment_6_1 )
            {
             before(grammarAccess.getDashboardAccess().getPanelsAssignment_6_1()); 
            // InternalMyDsl.g:1780:2: ( rule__Dashboard__PanelsAssignment_6_1 )
            // InternalMyDsl.g:1780:3: rule__Dashboard__PanelsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Dashboard__PanelsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDashboardAccess().getPanelsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__Group_6__1__Impl"


    // $ANTLR start "rule__Panel__Group__0"
    // InternalMyDsl.g:1789:1: rule__Panel__Group__0 : rule__Panel__Group__0__Impl rule__Panel__Group__1 ;
    public final void rule__Panel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1793:1: ( rule__Panel__Group__0__Impl rule__Panel__Group__1 )
            // InternalMyDsl.g:1794:2: rule__Panel__Group__0__Impl rule__Panel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Panel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__0"


    // $ANTLR start "rule__Panel__Group__0__Impl"
    // InternalMyDsl.g:1801:1: rule__Panel__Group__0__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Panel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1805:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:1806:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:1806:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:1807:2: RULE_OBJECT_START
            {
             before(grammarAccess.getPanelAccess().getOBJECT_STARTTerminalRuleCall_0()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getOBJECT_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__0__Impl"


    // $ANTLR start "rule__Panel__Group__1"
    // InternalMyDsl.g:1816:1: rule__Panel__Group__1 : rule__Panel__Group__1__Impl rule__Panel__Group__2 ;
    public final void rule__Panel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1820:1: ( rule__Panel__Group__1__Impl rule__Panel__Group__2 )
            // InternalMyDsl.g:1821:2: rule__Panel__Group__1__Impl rule__Panel__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Panel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__1"


    // $ANTLR start "rule__Panel__Group__1__Impl"
    // InternalMyDsl.g:1828:1: rule__Panel__Group__1__Impl : ( ( rule__Panel__NameAssignment_1 ) ) ;
    public final void rule__Panel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( ( ( rule__Panel__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1833:1: ( ( rule__Panel__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1833:1: ( ( rule__Panel__NameAssignment_1 ) )
            // InternalMyDsl.g:1834:2: ( rule__Panel__NameAssignment_1 )
            {
             before(grammarAccess.getPanelAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1835:2: ( rule__Panel__NameAssignment_1 )
            // InternalMyDsl.g:1835:3: rule__Panel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Panel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__1__Impl"


    // $ANTLR start "rule__Panel__Group__2"
    // InternalMyDsl.g:1843:1: rule__Panel__Group__2 : rule__Panel__Group__2__Impl rule__Panel__Group__3 ;
    public final void rule__Panel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1847:1: ( rule__Panel__Group__2__Impl rule__Panel__Group__3 )
            // InternalMyDsl.g:1848:2: rule__Panel__Group__2__Impl rule__Panel__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Panel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__2"


    // $ANTLR start "rule__Panel__Group__2__Impl"
    // InternalMyDsl.g:1855:1: rule__Panel__Group__2__Impl : ( 'elements' ) ;
    public final void rule__Panel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1859:1: ( ( 'elements' ) )
            // InternalMyDsl.g:1860:1: ( 'elements' )
            {
            // InternalMyDsl.g:1860:1: ( 'elements' )
            // InternalMyDsl.g:1861:2: 'elements'
            {
             before(grammarAccess.getPanelAccess().getElementsKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getElementsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__2__Impl"


    // $ANTLR start "rule__Panel__Group__3"
    // InternalMyDsl.g:1870:1: rule__Panel__Group__3 : rule__Panel__Group__3__Impl rule__Panel__Group__4 ;
    public final void rule__Panel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1874:1: ( rule__Panel__Group__3__Impl rule__Panel__Group__4 )
            // InternalMyDsl.g:1875:2: rule__Panel__Group__3__Impl rule__Panel__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Panel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__3"


    // $ANTLR start "rule__Panel__Group__3__Impl"
    // InternalMyDsl.g:1882:1: rule__Panel__Group__3__Impl : ( RULE_EQUALS ) ;
    public final void rule__Panel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:1887:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:1887:1: ( RULE_EQUALS )
            // InternalMyDsl.g:1888:2: RULE_EQUALS
            {
             before(grammarAccess.getPanelAccess().getEQUALSTerminalRuleCall_3()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getEQUALSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__3__Impl"


    // $ANTLR start "rule__Panel__Group__4"
    // InternalMyDsl.g:1897:1: rule__Panel__Group__4 : rule__Panel__Group__4__Impl rule__Panel__Group__5 ;
    public final void rule__Panel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1901:1: ( rule__Panel__Group__4__Impl rule__Panel__Group__5 )
            // InternalMyDsl.g:1902:2: rule__Panel__Group__4__Impl rule__Panel__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Panel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__4"


    // $ANTLR start "rule__Panel__Group__4__Impl"
    // InternalMyDsl.g:1909:1: rule__Panel__Group__4__Impl : ( RULE_LIST_START ) ;
    public final void rule__Panel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1913:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:1914:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:1914:1: ( RULE_LIST_START )
            // InternalMyDsl.g:1915:2: RULE_LIST_START
            {
             before(grammarAccess.getPanelAccess().getLIST_STARTTerminalRuleCall_4()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getLIST_STARTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__4__Impl"


    // $ANTLR start "rule__Panel__Group__5"
    // InternalMyDsl.g:1924:1: rule__Panel__Group__5 : rule__Panel__Group__5__Impl rule__Panel__Group__6 ;
    public final void rule__Panel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1928:1: ( rule__Panel__Group__5__Impl rule__Panel__Group__6 )
            // InternalMyDsl.g:1929:2: rule__Panel__Group__5__Impl rule__Panel__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Panel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__5"


    // $ANTLR start "rule__Panel__Group__5__Impl"
    // InternalMyDsl.g:1936:1: rule__Panel__Group__5__Impl : ( ( rule__Panel__ElementsAssignment_5 ) ) ;
    public final void rule__Panel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( ( ( rule__Panel__ElementsAssignment_5 ) ) )
            // InternalMyDsl.g:1941:1: ( ( rule__Panel__ElementsAssignment_5 ) )
            {
            // InternalMyDsl.g:1941:1: ( ( rule__Panel__ElementsAssignment_5 ) )
            // InternalMyDsl.g:1942:2: ( rule__Panel__ElementsAssignment_5 )
            {
             before(grammarAccess.getPanelAccess().getElementsAssignment_5()); 
            // InternalMyDsl.g:1943:2: ( rule__Panel__ElementsAssignment_5 )
            // InternalMyDsl.g:1943:3: rule__Panel__ElementsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Panel__ElementsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getElementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__5__Impl"


    // $ANTLR start "rule__Panel__Group__6"
    // InternalMyDsl.g:1951:1: rule__Panel__Group__6 : rule__Panel__Group__6__Impl rule__Panel__Group__7 ;
    public final void rule__Panel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1955:1: ( rule__Panel__Group__6__Impl rule__Panel__Group__7 )
            // InternalMyDsl.g:1956:2: rule__Panel__Group__6__Impl rule__Panel__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Panel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__6"


    // $ANTLR start "rule__Panel__Group__6__Impl"
    // InternalMyDsl.g:1963:1: rule__Panel__Group__6__Impl : ( ( rule__Panel__Group_6__0 )* ) ;
    public final void rule__Panel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1967:1: ( ( ( rule__Panel__Group_6__0 )* ) )
            // InternalMyDsl.g:1968:1: ( ( rule__Panel__Group_6__0 )* )
            {
            // InternalMyDsl.g:1968:1: ( ( rule__Panel__Group_6__0 )* )
            // InternalMyDsl.g:1969:2: ( rule__Panel__Group_6__0 )*
            {
             before(grammarAccess.getPanelAccess().getGroup_6()); 
            // InternalMyDsl.g:1970:2: ( rule__Panel__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1970:3: rule__Panel__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Panel__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPanelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__6__Impl"


    // $ANTLR start "rule__Panel__Group__7"
    // InternalMyDsl.g:1978:1: rule__Panel__Group__7 : rule__Panel__Group__7__Impl rule__Panel__Group__8 ;
    public final void rule__Panel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1982:1: ( rule__Panel__Group__7__Impl rule__Panel__Group__8 )
            // InternalMyDsl.g:1983:2: rule__Panel__Group__7__Impl rule__Panel__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Panel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__7"


    // $ANTLR start "rule__Panel__Group__7__Impl"
    // InternalMyDsl.g:1990:1: rule__Panel__Group__7__Impl : ( RULE_LIST_END ) ;
    public final void rule__Panel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1994:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:1995:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:1995:1: ( RULE_LIST_END )
            // InternalMyDsl.g:1996:2: RULE_LIST_END
            {
             before(grammarAccess.getPanelAccess().getLIST_ENDTerminalRuleCall_7()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getLIST_ENDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__7__Impl"


    // $ANTLR start "rule__Panel__Group__8"
    // InternalMyDsl.g:2005:1: rule__Panel__Group__8 : rule__Panel__Group__8__Impl ;
    public final void rule__Panel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2009:1: ( rule__Panel__Group__8__Impl )
            // InternalMyDsl.g:2010:2: rule__Panel__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__8"


    // $ANTLR start "rule__Panel__Group__8__Impl"
    // InternalMyDsl.g:2016:1: rule__Panel__Group__8__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Panel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2020:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:2021:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2021:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:2022:2: RULE_OBJECT_END
            {
             before(grammarAccess.getPanelAccess().getOBJECT_ENDTerminalRuleCall_8()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getOBJECT_ENDTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__8__Impl"


    // $ANTLR start "rule__Panel__Group_6__0"
    // InternalMyDsl.g:2032:1: rule__Panel__Group_6__0 : rule__Panel__Group_6__0__Impl rule__Panel__Group_6__1 ;
    public final void rule__Panel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2036:1: ( rule__Panel__Group_6__0__Impl rule__Panel__Group_6__1 )
            // InternalMyDsl.g:2037:2: rule__Panel__Group_6__0__Impl rule__Panel__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Panel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__0"


    // $ANTLR start "rule__Panel__Group_6__0__Impl"
    // InternalMyDsl.g:2044:1: rule__Panel__Group_6__0__Impl : ( RULE_COMA ) ;
    public final void rule__Panel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2048:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:2049:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:2049:1: ( RULE_COMA )
            // InternalMyDsl.g:2050:2: RULE_COMA
            {
             before(grammarAccess.getPanelAccess().getCOMATerminalRuleCall_6_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getCOMATerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__0__Impl"


    // $ANTLR start "rule__Panel__Group_6__1"
    // InternalMyDsl.g:2059:1: rule__Panel__Group_6__1 : rule__Panel__Group_6__1__Impl ;
    public final void rule__Panel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2063:1: ( rule__Panel__Group_6__1__Impl )
            // InternalMyDsl.g:2064:2: rule__Panel__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__1"


    // $ANTLR start "rule__Panel__Group_6__1__Impl"
    // InternalMyDsl.g:2070:1: rule__Panel__Group_6__1__Impl : ( ( rule__Panel__ElementsAssignment_6_1 ) ) ;
    public final void rule__Panel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2074:1: ( ( ( rule__Panel__ElementsAssignment_6_1 ) ) )
            // InternalMyDsl.g:2075:1: ( ( rule__Panel__ElementsAssignment_6_1 ) )
            {
            // InternalMyDsl.g:2075:1: ( ( rule__Panel__ElementsAssignment_6_1 ) )
            // InternalMyDsl.g:2076:2: ( rule__Panel__ElementsAssignment_6_1 )
            {
             before(grammarAccess.getPanelAccess().getElementsAssignment_6_1()); 
            // InternalMyDsl.g:2077:2: ( rule__Panel__ElementsAssignment_6_1 )
            // InternalMyDsl.g:2077:3: rule__Panel__ElementsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Panel__ElementsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getElementsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalMyDsl.g:2086:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2090:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalMyDsl.g:2091:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalMyDsl.g:2098:1: rule__Table__Group__0__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2102:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:2103:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:2103:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:2104:2: RULE_OBJECT_START
            {
             before(grammarAccess.getTableAccess().getOBJECT_STARTTerminalRuleCall_0()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getOBJECT_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalMyDsl.g:2113:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2117:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalMyDsl.g:2118:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalMyDsl.g:2125:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2129:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2130:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2130:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalMyDsl.g:2131:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2132:2: ( rule__Table__NameAssignment_1 )
            // InternalMyDsl.g:2132:3: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalMyDsl.g:2140:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2144:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalMyDsl.g:2145:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalMyDsl.g:2152:1: rule__Table__Group__2__Impl : ( ( rule__Table__Group_2__0 )? ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2156:1: ( ( ( rule__Table__Group_2__0 )? ) )
            // InternalMyDsl.g:2157:1: ( ( rule__Table__Group_2__0 )? )
            {
            // InternalMyDsl.g:2157:1: ( ( rule__Table__Group_2__0 )? )
            // InternalMyDsl.g:2158:2: ( rule__Table__Group_2__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_2()); 
            // InternalMyDsl.g:2159:2: ( rule__Table__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==49) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:2159:3: rule__Table__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalMyDsl.g:2167:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2171:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalMyDsl.g:2172:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalMyDsl.g:2179:1: rule__Table__Group__3__Impl : ( ( rule__Table__Group_3__0 )? ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2183:1: ( ( ( rule__Table__Group_3__0 )? ) )
            // InternalMyDsl.g:2184:1: ( ( rule__Table__Group_3__0 )? )
            {
            // InternalMyDsl.g:2184:1: ( ( rule__Table__Group_3__0 )? )
            // InternalMyDsl.g:2185:2: ( rule__Table__Group_3__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_3()); 
            // InternalMyDsl.g:2186:2: ( rule__Table__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==50) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:2186:3: rule__Table__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalMyDsl.g:2194:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2198:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalMyDsl.g:2199:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalMyDsl.g:2206:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )? ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2210:1: ( ( ( rule__Table__Group_4__0 )? ) )
            // InternalMyDsl.g:2211:1: ( ( rule__Table__Group_4__0 )? )
            {
            // InternalMyDsl.g:2211:1: ( ( rule__Table__Group_4__0 )? )
            // InternalMyDsl.g:2212:2: ( rule__Table__Group_4__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalMyDsl.g:2213:2: ( rule__Table__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==51) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2213:3: rule__Table__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalMyDsl.g:2221:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2225:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalMyDsl.g:2226:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Table__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalMyDsl.g:2233:1: rule__Table__Group__5__Impl : ( ( rule__Table__SearchAssignment_5 )? ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2237:1: ( ( ( rule__Table__SearchAssignment_5 )? ) )
            // InternalMyDsl.g:2238:1: ( ( rule__Table__SearchAssignment_5 )? )
            {
            // InternalMyDsl.g:2238:1: ( ( rule__Table__SearchAssignment_5 )? )
            // InternalMyDsl.g:2239:2: ( rule__Table__SearchAssignment_5 )?
            {
             before(grammarAccess.getTableAccess().getSearchAssignment_5()); 
            // InternalMyDsl.g:2240:2: ( rule__Table__SearchAssignment_5 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==81) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:2240:3: rule__Table__SearchAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__SearchAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getSearchAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__6"
    // InternalMyDsl.g:2248:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2252:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // InternalMyDsl.g:2253:2: rule__Table__Group__6__Impl rule__Table__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Table__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6"


    // $ANTLR start "rule__Table__Group__6__Impl"
    // InternalMyDsl.g:2260:1: rule__Table__Group__6__Impl : ( ( rule__Table__AddAssignment_6 )? ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2264:1: ( ( ( rule__Table__AddAssignment_6 )? ) )
            // InternalMyDsl.g:2265:1: ( ( rule__Table__AddAssignment_6 )? )
            {
            // InternalMyDsl.g:2265:1: ( ( rule__Table__AddAssignment_6 )? )
            // InternalMyDsl.g:2266:2: ( rule__Table__AddAssignment_6 )?
            {
             before(grammarAccess.getTableAccess().getAddAssignment_6()); 
            // InternalMyDsl.g:2267:2: ( rule__Table__AddAssignment_6 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==82) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2267:3: rule__Table__AddAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__AddAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getAddAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6__Impl"


    // $ANTLR start "rule__Table__Group__7"
    // InternalMyDsl.g:2275:1: rule__Table__Group__7 : rule__Table__Group__7__Impl rule__Table__Group__8 ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2279:1: ( rule__Table__Group__7__Impl rule__Table__Group__8 )
            // InternalMyDsl.g:2280:2: rule__Table__Group__7__Impl rule__Table__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Table__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7"


    // $ANTLR start "rule__Table__Group__7__Impl"
    // InternalMyDsl.g:2287:1: rule__Table__Group__7__Impl : ( 'columns' ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2291:1: ( ( 'columns' ) )
            // InternalMyDsl.g:2292:1: ( 'columns' )
            {
            // InternalMyDsl.g:2292:1: ( 'columns' )
            // InternalMyDsl.g:2293:2: 'columns'
            {
             before(grammarAccess.getTableAccess().getColumnsKeyword_7()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getColumnsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7__Impl"


    // $ANTLR start "rule__Table__Group__8"
    // InternalMyDsl.g:2302:1: rule__Table__Group__8 : rule__Table__Group__8__Impl rule__Table__Group__9 ;
    public final void rule__Table__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2306:1: ( rule__Table__Group__8__Impl rule__Table__Group__9 )
            // InternalMyDsl.g:2307:2: rule__Table__Group__8__Impl rule__Table__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__8"


    // $ANTLR start "rule__Table__Group__8__Impl"
    // InternalMyDsl.g:2314:1: rule__Table__Group__8__Impl : ( RULE_EQUALS ) ;
    public final void rule__Table__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2318:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:2319:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:2319:1: ( RULE_EQUALS )
            // InternalMyDsl.g:2320:2: RULE_EQUALS
            {
             before(grammarAccess.getTableAccess().getEQUALSTerminalRuleCall_8()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getEQUALSTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__8__Impl"


    // $ANTLR start "rule__Table__Group__9"
    // InternalMyDsl.g:2329:1: rule__Table__Group__9 : rule__Table__Group__9__Impl rule__Table__Group__10 ;
    public final void rule__Table__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2333:1: ( rule__Table__Group__9__Impl rule__Table__Group__10 )
            // InternalMyDsl.g:2334:2: rule__Table__Group__9__Impl rule__Table__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__9"


    // $ANTLR start "rule__Table__Group__9__Impl"
    // InternalMyDsl.g:2341:1: rule__Table__Group__9__Impl : ( RULE_LIST_START ) ;
    public final void rule__Table__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2345:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:2346:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:2346:1: ( RULE_LIST_START )
            // InternalMyDsl.g:2347:2: RULE_LIST_START
            {
             before(grammarAccess.getTableAccess().getLIST_STARTTerminalRuleCall_9()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLIST_STARTTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__9__Impl"


    // $ANTLR start "rule__Table__Group__10"
    // InternalMyDsl.g:2356:1: rule__Table__Group__10 : rule__Table__Group__10__Impl rule__Table__Group__11 ;
    public final void rule__Table__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2360:1: ( rule__Table__Group__10__Impl rule__Table__Group__11 )
            // InternalMyDsl.g:2361:2: rule__Table__Group__10__Impl rule__Table__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Table__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__10"


    // $ANTLR start "rule__Table__Group__10__Impl"
    // InternalMyDsl.g:2368:1: rule__Table__Group__10__Impl : ( ( rule__Table__ColumnsAssignment_10 ) ) ;
    public final void rule__Table__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2372:1: ( ( ( rule__Table__ColumnsAssignment_10 ) ) )
            // InternalMyDsl.g:2373:1: ( ( rule__Table__ColumnsAssignment_10 ) )
            {
            // InternalMyDsl.g:2373:1: ( ( rule__Table__ColumnsAssignment_10 ) )
            // InternalMyDsl.g:2374:2: ( rule__Table__ColumnsAssignment_10 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_10()); 
            // InternalMyDsl.g:2375:2: ( rule__Table__ColumnsAssignment_10 )
            // InternalMyDsl.g:2375:3: rule__Table__ColumnsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__10__Impl"


    // $ANTLR start "rule__Table__Group__11"
    // InternalMyDsl.g:2383:1: rule__Table__Group__11 : rule__Table__Group__11__Impl rule__Table__Group__12 ;
    public final void rule__Table__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2387:1: ( rule__Table__Group__11__Impl rule__Table__Group__12 )
            // InternalMyDsl.g:2388:2: rule__Table__Group__11__Impl rule__Table__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Table__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__11"


    // $ANTLR start "rule__Table__Group__11__Impl"
    // InternalMyDsl.g:2395:1: rule__Table__Group__11__Impl : ( ( rule__Table__Group_11__0 )* ) ;
    public final void rule__Table__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2399:1: ( ( ( rule__Table__Group_11__0 )* ) )
            // InternalMyDsl.g:2400:1: ( ( rule__Table__Group_11__0 )* )
            {
            // InternalMyDsl.g:2400:1: ( ( rule__Table__Group_11__0 )* )
            // InternalMyDsl.g:2401:2: ( rule__Table__Group_11__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_11()); 
            // InternalMyDsl.g:2402:2: ( rule__Table__Group_11__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:2402:3: rule__Table__Group_11__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Table__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__11__Impl"


    // $ANTLR start "rule__Table__Group__12"
    // InternalMyDsl.g:2410:1: rule__Table__Group__12 : rule__Table__Group__12__Impl rule__Table__Group__13 ;
    public final void rule__Table__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2414:1: ( rule__Table__Group__12__Impl rule__Table__Group__13 )
            // InternalMyDsl.g:2415:2: rule__Table__Group__12__Impl rule__Table__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Table__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__12"


    // $ANTLR start "rule__Table__Group__12__Impl"
    // InternalMyDsl.g:2422:1: rule__Table__Group__12__Impl : ( RULE_LIST_END ) ;
    public final void rule__Table__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2426:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:2427:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:2427:1: ( RULE_LIST_END )
            // InternalMyDsl.g:2428:2: RULE_LIST_END
            {
             before(grammarAccess.getTableAccess().getLIST_ENDTerminalRuleCall_12()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLIST_ENDTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__12__Impl"


    // $ANTLR start "rule__Table__Group__13"
    // InternalMyDsl.g:2437:1: rule__Table__Group__13 : rule__Table__Group__13__Impl ;
    public final void rule__Table__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2441:1: ( rule__Table__Group__13__Impl )
            // InternalMyDsl.g:2442:2: rule__Table__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__13"


    // $ANTLR start "rule__Table__Group__13__Impl"
    // InternalMyDsl.g:2448:1: rule__Table__Group__13__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Table__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2452:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:2453:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2453:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:2454:2: RULE_OBJECT_END
            {
             before(grammarAccess.getTableAccess().getOBJECT_ENDTerminalRuleCall_13()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getOBJECT_ENDTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__13__Impl"


    // $ANTLR start "rule__Table__Group_2__0"
    // InternalMyDsl.g:2464:1: rule__Table__Group_2__0 : rule__Table__Group_2__0__Impl rule__Table__Group_2__1 ;
    public final void rule__Table__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2468:1: ( rule__Table__Group_2__0__Impl rule__Table__Group_2__1 )
            // InternalMyDsl.g:2469:2: rule__Table__Group_2__0__Impl rule__Table__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Table__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_2__0"


    // $ANTLR start "rule__Table__Group_2__0__Impl"
    // InternalMyDsl.g:2476:1: rule__Table__Group_2__0__Impl : ( 'title' ) ;
    public final void rule__Table__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2480:1: ( ( 'title' ) )
            // InternalMyDsl.g:2481:1: ( 'title' )
            {
            // InternalMyDsl.g:2481:1: ( 'title' )
            // InternalMyDsl.g:2482:2: 'title'
            {
             before(grammarAccess.getTableAccess().getTitleKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTitleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_2__0__Impl"


    // $ANTLR start "rule__Table__Group_2__1"
    // InternalMyDsl.g:2491:1: rule__Table__Group_2__1 : rule__Table__Group_2__1__Impl ;
    public final void rule__Table__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2495:1: ( rule__Table__Group_2__1__Impl )
            // InternalMyDsl.g:2496:2: rule__Table__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_2__1"


    // $ANTLR start "rule__Table__Group_2__1__Impl"
    // InternalMyDsl.g:2502:1: rule__Table__Group_2__1__Impl : ( ( rule__Table__TitleAssignment_2_1 ) ) ;
    public final void rule__Table__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2506:1: ( ( ( rule__Table__TitleAssignment_2_1 ) ) )
            // InternalMyDsl.g:2507:1: ( ( rule__Table__TitleAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2507:1: ( ( rule__Table__TitleAssignment_2_1 ) )
            // InternalMyDsl.g:2508:2: ( rule__Table__TitleAssignment_2_1 )
            {
             before(grammarAccess.getTableAccess().getTitleAssignment_2_1()); 
            // InternalMyDsl.g:2509:2: ( rule__Table__TitleAssignment_2_1 )
            // InternalMyDsl.g:2509:3: rule__Table__TitleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__TitleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getTitleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_2__1__Impl"


    // $ANTLR start "rule__Table__Group_3__0"
    // InternalMyDsl.g:2518:1: rule__Table__Group_3__0 : rule__Table__Group_3__0__Impl rule__Table__Group_3__1 ;
    public final void rule__Table__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2522:1: ( rule__Table__Group_3__0__Impl rule__Table__Group_3__1 )
            // InternalMyDsl.g:2523:2: rule__Table__Group_3__0__Impl rule__Table__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Table__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_3__0"


    // $ANTLR start "rule__Table__Group_3__0__Impl"
    // InternalMyDsl.g:2530:1: rule__Table__Group_3__0__Impl : ( 'registersPerPage' ) ;
    public final void rule__Table__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2534:1: ( ( 'registersPerPage' ) )
            // InternalMyDsl.g:2535:1: ( 'registersPerPage' )
            {
            // InternalMyDsl.g:2535:1: ( 'registersPerPage' )
            // InternalMyDsl.g:2536:2: 'registersPerPage'
            {
             before(grammarAccess.getTableAccess().getRegistersPerPageKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRegistersPerPageKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_3__0__Impl"


    // $ANTLR start "rule__Table__Group_3__1"
    // InternalMyDsl.g:2545:1: rule__Table__Group_3__1 : rule__Table__Group_3__1__Impl ;
    public final void rule__Table__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2549:1: ( rule__Table__Group_3__1__Impl )
            // InternalMyDsl.g:2550:2: rule__Table__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_3__1"


    // $ANTLR start "rule__Table__Group_3__1__Impl"
    // InternalMyDsl.g:2556:1: rule__Table__Group_3__1__Impl : ( ( rule__Table__RegistersPerPageAssignment_3_1 ) ) ;
    public final void rule__Table__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2560:1: ( ( ( rule__Table__RegistersPerPageAssignment_3_1 ) ) )
            // InternalMyDsl.g:2561:1: ( ( rule__Table__RegistersPerPageAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2561:1: ( ( rule__Table__RegistersPerPageAssignment_3_1 ) )
            // InternalMyDsl.g:2562:2: ( rule__Table__RegistersPerPageAssignment_3_1 )
            {
             before(grammarAccess.getTableAccess().getRegistersPerPageAssignment_3_1()); 
            // InternalMyDsl.g:2563:2: ( rule__Table__RegistersPerPageAssignment_3_1 )
            // InternalMyDsl.g:2563:3: rule__Table__RegistersPerPageAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__RegistersPerPageAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getRegistersPerPageAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_3__1__Impl"


    // $ANTLR start "rule__Table__Group_4__0"
    // InternalMyDsl.g:2572:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2576:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalMyDsl.g:2577:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__0"


    // $ANTLR start "rule__Table__Group_4__0__Impl"
    // InternalMyDsl.g:2584:1: rule__Table__Group_4__0__Impl : ( 'actions' ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2588:1: ( ( 'actions' ) )
            // InternalMyDsl.g:2589:1: ( 'actions' )
            {
            // InternalMyDsl.g:2589:1: ( 'actions' )
            // InternalMyDsl.g:2590:2: 'actions'
            {
             before(grammarAccess.getTableAccess().getActionsKeyword_4_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getActionsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__0__Impl"


    // $ANTLR start "rule__Table__Group_4__1"
    // InternalMyDsl.g:2599:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2603:1: ( rule__Table__Group_4__1__Impl )
            // InternalMyDsl.g:2604:2: rule__Table__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__1"


    // $ANTLR start "rule__Table__Group_4__1__Impl"
    // InternalMyDsl.g:2610:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__ActionsAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2614:1: ( ( ( rule__Table__ActionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:2615:1: ( ( rule__Table__ActionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2615:1: ( ( rule__Table__ActionsAssignment_4_1 ) )
            // InternalMyDsl.g:2616:2: ( rule__Table__ActionsAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getActionsAssignment_4_1()); 
            // InternalMyDsl.g:2617:2: ( rule__Table__ActionsAssignment_4_1 )
            // InternalMyDsl.g:2617:3: rule__Table__ActionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ActionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getActionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__1__Impl"


    // $ANTLR start "rule__Table__Group_11__0"
    // InternalMyDsl.g:2626:1: rule__Table__Group_11__0 : rule__Table__Group_11__0__Impl rule__Table__Group_11__1 ;
    public final void rule__Table__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2630:1: ( rule__Table__Group_11__0__Impl rule__Table__Group_11__1 )
            // InternalMyDsl.g:2631:2: rule__Table__Group_11__0__Impl rule__Table__Group_11__1
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_11__0"


    // $ANTLR start "rule__Table__Group_11__0__Impl"
    // InternalMyDsl.g:2638:1: rule__Table__Group_11__0__Impl : ( RULE_COMA ) ;
    public final void rule__Table__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2642:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:2643:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:2643:1: ( RULE_COMA )
            // InternalMyDsl.g:2644:2: RULE_COMA
            {
             before(grammarAccess.getTableAccess().getCOMATerminalRuleCall_11_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCOMATerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_11__0__Impl"


    // $ANTLR start "rule__Table__Group_11__1"
    // InternalMyDsl.g:2653:1: rule__Table__Group_11__1 : rule__Table__Group_11__1__Impl ;
    public final void rule__Table__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2657:1: ( rule__Table__Group_11__1__Impl )
            // InternalMyDsl.g:2658:2: rule__Table__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_11__1"


    // $ANTLR start "rule__Table__Group_11__1__Impl"
    // InternalMyDsl.g:2664:1: rule__Table__Group_11__1__Impl : ( ( rule__Table__ColumnsAssignment_11_1 ) ) ;
    public final void rule__Table__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2668:1: ( ( ( rule__Table__ColumnsAssignment_11_1 ) ) )
            // InternalMyDsl.g:2669:1: ( ( rule__Table__ColumnsAssignment_11_1 ) )
            {
            // InternalMyDsl.g:2669:1: ( ( rule__Table__ColumnsAssignment_11_1 ) )
            // InternalMyDsl.g:2670:2: ( rule__Table__ColumnsAssignment_11_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_11_1()); 
            // InternalMyDsl.g:2671:2: ( rule__Table__ColumnsAssignment_11_1 )
            // InternalMyDsl.g:2671:3: rule__Table__ColumnsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_11__1__Impl"


    // $ANTLR start "rule__Menu__Group__0"
    // InternalMyDsl.g:2680:1: rule__Menu__Group__0 : rule__Menu__Group__0__Impl rule__Menu__Group__1 ;
    public final void rule__Menu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2684:1: ( rule__Menu__Group__0__Impl rule__Menu__Group__1 )
            // InternalMyDsl.g:2685:2: rule__Menu__Group__0__Impl rule__Menu__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Menu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__0"


    // $ANTLR start "rule__Menu__Group__0__Impl"
    // InternalMyDsl.g:2692:1: rule__Menu__Group__0__Impl : ( 'Menu' ) ;
    public final void rule__Menu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( ( 'Menu' ) )
            // InternalMyDsl.g:2697:1: ( 'Menu' )
            {
            // InternalMyDsl.g:2697:1: ( 'Menu' )
            // InternalMyDsl.g:2698:2: 'Menu'
            {
             before(grammarAccess.getMenuAccess().getMenuKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getMenuKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__0__Impl"


    // $ANTLR start "rule__Menu__Group__1"
    // InternalMyDsl.g:2707:1: rule__Menu__Group__1 : rule__Menu__Group__1__Impl rule__Menu__Group__2 ;
    public final void rule__Menu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2711:1: ( rule__Menu__Group__1__Impl rule__Menu__Group__2 )
            // InternalMyDsl.g:2712:2: rule__Menu__Group__1__Impl rule__Menu__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Menu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__1"


    // $ANTLR start "rule__Menu__Group__1__Impl"
    // InternalMyDsl.g:2719:1: rule__Menu__Group__1__Impl : ( ( rule__Menu__NameAssignment_1 ) ) ;
    public final void rule__Menu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2723:1: ( ( ( rule__Menu__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2724:1: ( ( rule__Menu__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2724:1: ( ( rule__Menu__NameAssignment_1 ) )
            // InternalMyDsl.g:2725:2: ( rule__Menu__NameAssignment_1 )
            {
             before(grammarAccess.getMenuAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2726:2: ( rule__Menu__NameAssignment_1 )
            // InternalMyDsl.g:2726:3: rule__Menu__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Menu__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__1__Impl"


    // $ANTLR start "rule__Menu__Group__2"
    // InternalMyDsl.g:2734:1: rule__Menu__Group__2 : rule__Menu__Group__2__Impl rule__Menu__Group__3 ;
    public final void rule__Menu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2738:1: ( rule__Menu__Group__2__Impl rule__Menu__Group__3 )
            // InternalMyDsl.g:2739:2: rule__Menu__Group__2__Impl rule__Menu__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Menu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__2"


    // $ANTLR start "rule__Menu__Group__2__Impl"
    // InternalMyDsl.g:2746:1: rule__Menu__Group__2__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Menu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2750:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:2751:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:2751:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:2752:2: RULE_OBJECT_START
            {
             before(grammarAccess.getMenuAccess().getOBJECT_STARTTerminalRuleCall_2()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getOBJECT_STARTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__2__Impl"


    // $ANTLR start "rule__Menu__Group__3"
    // InternalMyDsl.g:2761:1: rule__Menu__Group__3 : rule__Menu__Group__3__Impl rule__Menu__Group__4 ;
    public final void rule__Menu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2765:1: ( rule__Menu__Group__3__Impl rule__Menu__Group__4 )
            // InternalMyDsl.g:2766:2: rule__Menu__Group__3__Impl rule__Menu__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Menu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__3"


    // $ANTLR start "rule__Menu__Group__3__Impl"
    // InternalMyDsl.g:2773:1: rule__Menu__Group__3__Impl : ( ( rule__Menu__Group_3__0 )? ) ;
    public final void rule__Menu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2777:1: ( ( ( rule__Menu__Group_3__0 )? ) )
            // InternalMyDsl.g:2778:1: ( ( rule__Menu__Group_3__0 )? )
            {
            // InternalMyDsl.g:2778:1: ( ( rule__Menu__Group_3__0 )? )
            // InternalMyDsl.g:2779:2: ( rule__Menu__Group_3__0 )?
            {
             before(grammarAccess.getMenuAccess().getGroup_3()); 
            // InternalMyDsl.g:2780:2: ( rule__Menu__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==49) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2780:3: rule__Menu__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Menu__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMenuAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__3__Impl"


    // $ANTLR start "rule__Menu__Group__4"
    // InternalMyDsl.g:2788:1: rule__Menu__Group__4 : rule__Menu__Group__4__Impl rule__Menu__Group__5 ;
    public final void rule__Menu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2792:1: ( rule__Menu__Group__4__Impl rule__Menu__Group__5 )
            // InternalMyDsl.g:2793:2: rule__Menu__Group__4__Impl rule__Menu__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Menu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__4"


    // $ANTLR start "rule__Menu__Group__4__Impl"
    // InternalMyDsl.g:2800:1: rule__Menu__Group__4__Impl : ( 'options' ) ;
    public final void rule__Menu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2804:1: ( ( 'options' ) )
            // InternalMyDsl.g:2805:1: ( 'options' )
            {
            // InternalMyDsl.g:2805:1: ( 'options' )
            // InternalMyDsl.g:2806:2: 'options'
            {
             before(grammarAccess.getMenuAccess().getOptionsKeyword_4()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getOptionsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__4__Impl"


    // $ANTLR start "rule__Menu__Group__5"
    // InternalMyDsl.g:2815:1: rule__Menu__Group__5 : rule__Menu__Group__5__Impl rule__Menu__Group__6 ;
    public final void rule__Menu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2819:1: ( rule__Menu__Group__5__Impl rule__Menu__Group__6 )
            // InternalMyDsl.g:2820:2: rule__Menu__Group__5__Impl rule__Menu__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Menu__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__5"


    // $ANTLR start "rule__Menu__Group__5__Impl"
    // InternalMyDsl.g:2827:1: rule__Menu__Group__5__Impl : ( RULE_EQUALS ) ;
    public final void rule__Menu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:2832:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:2832:1: ( RULE_EQUALS )
            // InternalMyDsl.g:2833:2: RULE_EQUALS
            {
             before(grammarAccess.getMenuAccess().getEQUALSTerminalRuleCall_5()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getEQUALSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__5__Impl"


    // $ANTLR start "rule__Menu__Group__6"
    // InternalMyDsl.g:2842:1: rule__Menu__Group__6 : rule__Menu__Group__6__Impl rule__Menu__Group__7 ;
    public final void rule__Menu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2846:1: ( rule__Menu__Group__6__Impl rule__Menu__Group__7 )
            // InternalMyDsl.g:2847:2: rule__Menu__Group__6__Impl rule__Menu__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Menu__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__6"


    // $ANTLR start "rule__Menu__Group__6__Impl"
    // InternalMyDsl.g:2854:1: rule__Menu__Group__6__Impl : ( RULE_LIST_START ) ;
    public final void rule__Menu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2858:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:2859:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:2859:1: ( RULE_LIST_START )
            // InternalMyDsl.g:2860:2: RULE_LIST_START
            {
             before(grammarAccess.getMenuAccess().getLIST_STARTTerminalRuleCall_6()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getLIST_STARTTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__6__Impl"


    // $ANTLR start "rule__Menu__Group__7"
    // InternalMyDsl.g:2869:1: rule__Menu__Group__7 : rule__Menu__Group__7__Impl rule__Menu__Group__8 ;
    public final void rule__Menu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2873:1: ( rule__Menu__Group__7__Impl rule__Menu__Group__8 )
            // InternalMyDsl.g:2874:2: rule__Menu__Group__7__Impl rule__Menu__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Menu__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__7"


    // $ANTLR start "rule__Menu__Group__7__Impl"
    // InternalMyDsl.g:2881:1: rule__Menu__Group__7__Impl : ( ( rule__Menu__OptionsAssignment_7 ) ) ;
    public final void rule__Menu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2885:1: ( ( ( rule__Menu__OptionsAssignment_7 ) ) )
            // InternalMyDsl.g:2886:1: ( ( rule__Menu__OptionsAssignment_7 ) )
            {
            // InternalMyDsl.g:2886:1: ( ( rule__Menu__OptionsAssignment_7 ) )
            // InternalMyDsl.g:2887:2: ( rule__Menu__OptionsAssignment_7 )
            {
             before(grammarAccess.getMenuAccess().getOptionsAssignment_7()); 
            // InternalMyDsl.g:2888:2: ( rule__Menu__OptionsAssignment_7 )
            // InternalMyDsl.g:2888:3: rule__Menu__OptionsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Menu__OptionsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getOptionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__7__Impl"


    // $ANTLR start "rule__Menu__Group__8"
    // InternalMyDsl.g:2896:1: rule__Menu__Group__8 : rule__Menu__Group__8__Impl rule__Menu__Group__9 ;
    public final void rule__Menu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2900:1: ( rule__Menu__Group__8__Impl rule__Menu__Group__9 )
            // InternalMyDsl.g:2901:2: rule__Menu__Group__8__Impl rule__Menu__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Menu__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__8"


    // $ANTLR start "rule__Menu__Group__8__Impl"
    // InternalMyDsl.g:2908:1: rule__Menu__Group__8__Impl : ( ( rule__Menu__Group_8__0 )* ) ;
    public final void rule__Menu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( ( ( rule__Menu__Group_8__0 )* ) )
            // InternalMyDsl.g:2913:1: ( ( rule__Menu__Group_8__0 )* )
            {
            // InternalMyDsl.g:2913:1: ( ( rule__Menu__Group_8__0 )* )
            // InternalMyDsl.g:2914:2: ( rule__Menu__Group_8__0 )*
            {
             before(grammarAccess.getMenuAccess().getGroup_8()); 
            // InternalMyDsl.g:2915:2: ( rule__Menu__Group_8__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2915:3: rule__Menu__Group_8__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Menu__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMenuAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__8__Impl"


    // $ANTLR start "rule__Menu__Group__9"
    // InternalMyDsl.g:2923:1: rule__Menu__Group__9 : rule__Menu__Group__9__Impl rule__Menu__Group__10 ;
    public final void rule__Menu__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2927:1: ( rule__Menu__Group__9__Impl rule__Menu__Group__10 )
            // InternalMyDsl.g:2928:2: rule__Menu__Group__9__Impl rule__Menu__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Menu__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__9"


    // $ANTLR start "rule__Menu__Group__9__Impl"
    // InternalMyDsl.g:2935:1: rule__Menu__Group__9__Impl : ( RULE_LIST_END ) ;
    public final void rule__Menu__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2939:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:2940:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:2940:1: ( RULE_LIST_END )
            // InternalMyDsl.g:2941:2: RULE_LIST_END
            {
             before(grammarAccess.getMenuAccess().getLIST_ENDTerminalRuleCall_9()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getLIST_ENDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__9__Impl"


    // $ANTLR start "rule__Menu__Group__10"
    // InternalMyDsl.g:2950:1: rule__Menu__Group__10 : rule__Menu__Group__10__Impl ;
    public final void rule__Menu__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2954:1: ( rule__Menu__Group__10__Impl )
            // InternalMyDsl.g:2955:2: rule__Menu__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__10"


    // $ANTLR start "rule__Menu__Group__10__Impl"
    // InternalMyDsl.g:2961:1: rule__Menu__Group__10__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Menu__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2965:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:2966:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:2966:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:2967:2: RULE_OBJECT_END
            {
             before(grammarAccess.getMenuAccess().getOBJECT_ENDTerminalRuleCall_10()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getOBJECT_ENDTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__10__Impl"


    // $ANTLR start "rule__Menu__Group_3__0"
    // InternalMyDsl.g:2977:1: rule__Menu__Group_3__0 : rule__Menu__Group_3__0__Impl rule__Menu__Group_3__1 ;
    public final void rule__Menu__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2981:1: ( rule__Menu__Group_3__0__Impl rule__Menu__Group_3__1 )
            // InternalMyDsl.g:2982:2: rule__Menu__Group_3__0__Impl rule__Menu__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Menu__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_3__0"


    // $ANTLR start "rule__Menu__Group_3__0__Impl"
    // InternalMyDsl.g:2989:1: rule__Menu__Group_3__0__Impl : ( 'title' ) ;
    public final void rule__Menu__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2993:1: ( ( 'title' ) )
            // InternalMyDsl.g:2994:1: ( 'title' )
            {
            // InternalMyDsl.g:2994:1: ( 'title' )
            // InternalMyDsl.g:2995:2: 'title'
            {
             before(grammarAccess.getMenuAccess().getTitleKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getTitleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_3__0__Impl"


    // $ANTLR start "rule__Menu__Group_3__1"
    // InternalMyDsl.g:3004:1: rule__Menu__Group_3__1 : rule__Menu__Group_3__1__Impl ;
    public final void rule__Menu__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3008:1: ( rule__Menu__Group_3__1__Impl )
            // InternalMyDsl.g:3009:2: rule__Menu__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_3__1"


    // $ANTLR start "rule__Menu__Group_3__1__Impl"
    // InternalMyDsl.g:3015:1: rule__Menu__Group_3__1__Impl : ( ( rule__Menu__TitleAssignment_3_1 ) ) ;
    public final void rule__Menu__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3019:1: ( ( ( rule__Menu__TitleAssignment_3_1 ) ) )
            // InternalMyDsl.g:3020:1: ( ( rule__Menu__TitleAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3020:1: ( ( rule__Menu__TitleAssignment_3_1 ) )
            // InternalMyDsl.g:3021:2: ( rule__Menu__TitleAssignment_3_1 )
            {
             before(grammarAccess.getMenuAccess().getTitleAssignment_3_1()); 
            // InternalMyDsl.g:3022:2: ( rule__Menu__TitleAssignment_3_1 )
            // InternalMyDsl.g:3022:3: rule__Menu__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Menu__TitleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getTitleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_3__1__Impl"


    // $ANTLR start "rule__Menu__Group_8__0"
    // InternalMyDsl.g:3031:1: rule__Menu__Group_8__0 : rule__Menu__Group_8__0__Impl rule__Menu__Group_8__1 ;
    public final void rule__Menu__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3035:1: ( rule__Menu__Group_8__0__Impl rule__Menu__Group_8__1 )
            // InternalMyDsl.g:3036:2: rule__Menu__Group_8__0__Impl rule__Menu__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__Menu__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_8__0"


    // $ANTLR start "rule__Menu__Group_8__0__Impl"
    // InternalMyDsl.g:3043:1: rule__Menu__Group_8__0__Impl : ( RULE_COMA ) ;
    public final void rule__Menu__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3047:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:3048:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:3048:1: ( RULE_COMA )
            // InternalMyDsl.g:3049:2: RULE_COMA
            {
             before(grammarAccess.getMenuAccess().getCOMATerminalRuleCall_8_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getCOMATerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_8__0__Impl"


    // $ANTLR start "rule__Menu__Group_8__1"
    // InternalMyDsl.g:3058:1: rule__Menu__Group_8__1 : rule__Menu__Group_8__1__Impl ;
    public final void rule__Menu__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3062:1: ( rule__Menu__Group_8__1__Impl )
            // InternalMyDsl.g:3063:2: rule__Menu__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_8__1"


    // $ANTLR start "rule__Menu__Group_8__1__Impl"
    // InternalMyDsl.g:3069:1: rule__Menu__Group_8__1__Impl : ( ( rule__Menu__OptionsAssignment_8_1 ) ) ;
    public final void rule__Menu__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3073:1: ( ( ( rule__Menu__OptionsAssignment_8_1 ) ) )
            // InternalMyDsl.g:3074:1: ( ( rule__Menu__OptionsAssignment_8_1 ) )
            {
            // InternalMyDsl.g:3074:1: ( ( rule__Menu__OptionsAssignment_8_1 ) )
            // InternalMyDsl.g:3075:2: ( rule__Menu__OptionsAssignment_8_1 )
            {
             before(grammarAccess.getMenuAccess().getOptionsAssignment_8_1()); 
            // InternalMyDsl.g:3076:2: ( rule__Menu__OptionsAssignment_8_1 )
            // InternalMyDsl.g:3076:3: rule__Menu__OptionsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Menu__OptionsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getOptionsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_8__1__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // InternalMyDsl.g:3085:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3089:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalMyDsl.g:3090:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // InternalMyDsl.g:3097:1: rule__Option__Group__0__Impl : ( () ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3101:1: ( ( () ) )
            // InternalMyDsl.g:3102:1: ( () )
            {
            // InternalMyDsl.g:3102:1: ( () )
            // InternalMyDsl.g:3103:2: ()
            {
             before(grammarAccess.getOptionAccess().getOptionAction_0()); 
            // InternalMyDsl.g:3104:2: ()
            // InternalMyDsl.g:3104:3: 
            {
            }

             after(grammarAccess.getOptionAccess().getOptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // InternalMyDsl.g:3112:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3116:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // InternalMyDsl.g:3117:2: rule__Option__Group__1__Impl rule__Option__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Option__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // InternalMyDsl.g:3124:1: rule__Option__Group__1__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3128:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:3129:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:3129:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:3130:2: RULE_OBJECT_START
            {
             before(grammarAccess.getOptionAccess().getOBJECT_STARTTerminalRuleCall_1()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getOBJECT_STARTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__Option__Group__2"
    // InternalMyDsl.g:3139:1: rule__Option__Group__2 : rule__Option__Group__2__Impl rule__Option__Group__3 ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3143:1: ( rule__Option__Group__2__Impl rule__Option__Group__3 )
            // InternalMyDsl.g:3144:2: rule__Option__Group__2__Impl rule__Option__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Option__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__2"


    // $ANTLR start "rule__Option__Group__2__Impl"
    // InternalMyDsl.g:3151:1: rule__Option__Group__2__Impl : ( ( rule__Option__NameAssignment_2 ) ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3155:1: ( ( ( rule__Option__NameAssignment_2 ) ) )
            // InternalMyDsl.g:3156:1: ( ( rule__Option__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:3156:1: ( ( rule__Option__NameAssignment_2 ) )
            // InternalMyDsl.g:3157:2: ( rule__Option__NameAssignment_2 )
            {
             before(grammarAccess.getOptionAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3158:2: ( rule__Option__NameAssignment_2 )
            // InternalMyDsl.g:3158:3: rule__Option__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Option__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__2__Impl"


    // $ANTLR start "rule__Option__Group__3"
    // InternalMyDsl.g:3166:1: rule__Option__Group__3 : rule__Option__Group__3__Impl rule__Option__Group__4 ;
    public final void rule__Option__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3170:1: ( rule__Option__Group__3__Impl rule__Option__Group__4 )
            // InternalMyDsl.g:3171:2: rule__Option__Group__3__Impl rule__Option__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Option__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__3"


    // $ANTLR start "rule__Option__Group__3__Impl"
    // InternalMyDsl.g:3178:1: rule__Option__Group__3__Impl : ( ( rule__Option__Group_3__0 )? ) ;
    public final void rule__Option__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3182:1: ( ( ( rule__Option__Group_3__0 )? ) )
            // InternalMyDsl.g:3183:1: ( ( rule__Option__Group_3__0 )? )
            {
            // InternalMyDsl.g:3183:1: ( ( rule__Option__Group_3__0 )? )
            // InternalMyDsl.g:3184:2: ( rule__Option__Group_3__0 )?
            {
             before(grammarAccess.getOptionAccess().getGroup_3()); 
            // InternalMyDsl.g:3185:2: ( rule__Option__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==54) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:3185:3: rule__Option__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Option__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__3__Impl"


    // $ANTLR start "rule__Option__Group__4"
    // InternalMyDsl.g:3193:1: rule__Option__Group__4 : rule__Option__Group__4__Impl rule__Option__Group__5 ;
    public final void rule__Option__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3197:1: ( rule__Option__Group__4__Impl rule__Option__Group__5 )
            // InternalMyDsl.g:3198:2: rule__Option__Group__4__Impl rule__Option__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Option__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__4"


    // $ANTLR start "rule__Option__Group__4__Impl"
    // InternalMyDsl.g:3205:1: rule__Option__Group__4__Impl : ( ( rule__Option__Group_4__0 )? ) ;
    public final void rule__Option__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3209:1: ( ( ( rule__Option__Group_4__0 )? ) )
            // InternalMyDsl.g:3210:1: ( ( rule__Option__Group_4__0 )? )
            {
            // InternalMyDsl.g:3210:1: ( ( rule__Option__Group_4__0 )? )
            // InternalMyDsl.g:3211:2: ( rule__Option__Group_4__0 )?
            {
             before(grammarAccess.getOptionAccess().getGroup_4()); 
            // InternalMyDsl.g:3212:2: ( rule__Option__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==49) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:3212:3: rule__Option__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Option__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__4__Impl"


    // $ANTLR start "rule__Option__Group__5"
    // InternalMyDsl.g:3220:1: rule__Option__Group__5 : rule__Option__Group__5__Impl rule__Option__Group__6 ;
    public final void rule__Option__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3224:1: ( rule__Option__Group__5__Impl rule__Option__Group__6 )
            // InternalMyDsl.g:3225:2: rule__Option__Group__5__Impl rule__Option__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Option__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__5"


    // $ANTLR start "rule__Option__Group__5__Impl"
    // InternalMyDsl.g:3232:1: rule__Option__Group__5__Impl : ( ( rule__Option__Group_5__0 )? ) ;
    public final void rule__Option__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3236:1: ( ( ( rule__Option__Group_5__0 )? ) )
            // InternalMyDsl.g:3237:1: ( ( rule__Option__Group_5__0 )? )
            {
            // InternalMyDsl.g:3237:1: ( ( rule__Option__Group_5__0 )? )
            // InternalMyDsl.g:3238:2: ( rule__Option__Group_5__0 )?
            {
             before(grammarAccess.getOptionAccess().getGroup_5()); 
            // InternalMyDsl.g:3239:2: ( rule__Option__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==55) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:3239:3: rule__Option__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Option__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__5__Impl"


    // $ANTLR start "rule__Option__Group__6"
    // InternalMyDsl.g:3247:1: rule__Option__Group__6 : rule__Option__Group__6__Impl ;
    public final void rule__Option__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3251:1: ( rule__Option__Group__6__Impl )
            // InternalMyDsl.g:3252:2: rule__Option__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__6"


    // $ANTLR start "rule__Option__Group__6__Impl"
    // InternalMyDsl.g:3258:1: rule__Option__Group__6__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Option__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3262:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:3263:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:3263:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:3264:2: RULE_OBJECT_END
            {
             before(grammarAccess.getOptionAccess().getOBJECT_ENDTerminalRuleCall_6()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getOBJECT_ENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__6__Impl"


    // $ANTLR start "rule__Option__Group_3__0"
    // InternalMyDsl.g:3274:1: rule__Option__Group_3__0 : rule__Option__Group_3__0__Impl rule__Option__Group_3__1 ;
    public final void rule__Option__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3278:1: ( rule__Option__Group_3__0__Impl rule__Option__Group_3__1 )
            // InternalMyDsl.g:3279:2: rule__Option__Group_3__0__Impl rule__Option__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Option__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_3__0"


    // $ANTLR start "rule__Option__Group_3__0__Impl"
    // InternalMyDsl.g:3286:1: rule__Option__Group_3__0__Impl : ( 'icon' ) ;
    public final void rule__Option__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3290:1: ( ( 'icon' ) )
            // InternalMyDsl.g:3291:1: ( 'icon' )
            {
            // InternalMyDsl.g:3291:1: ( 'icon' )
            // InternalMyDsl.g:3292:2: 'icon'
            {
             before(grammarAccess.getOptionAccess().getIconKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getIconKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_3__0__Impl"


    // $ANTLR start "rule__Option__Group_3__1"
    // InternalMyDsl.g:3301:1: rule__Option__Group_3__1 : rule__Option__Group_3__1__Impl ;
    public final void rule__Option__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3305:1: ( rule__Option__Group_3__1__Impl )
            // InternalMyDsl.g:3306:2: rule__Option__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_3__1"


    // $ANTLR start "rule__Option__Group_3__1__Impl"
    // InternalMyDsl.g:3312:1: rule__Option__Group_3__1__Impl : ( ( rule__Option__IconAssignment_3_1 ) ) ;
    public final void rule__Option__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3316:1: ( ( ( rule__Option__IconAssignment_3_1 ) ) )
            // InternalMyDsl.g:3317:1: ( ( rule__Option__IconAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3317:1: ( ( rule__Option__IconAssignment_3_1 ) )
            // InternalMyDsl.g:3318:2: ( rule__Option__IconAssignment_3_1 )
            {
             before(grammarAccess.getOptionAccess().getIconAssignment_3_1()); 
            // InternalMyDsl.g:3319:2: ( rule__Option__IconAssignment_3_1 )
            // InternalMyDsl.g:3319:3: rule__Option__IconAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Option__IconAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getIconAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_3__1__Impl"


    // $ANTLR start "rule__Option__Group_4__0"
    // InternalMyDsl.g:3328:1: rule__Option__Group_4__0 : rule__Option__Group_4__0__Impl rule__Option__Group_4__1 ;
    public final void rule__Option__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3332:1: ( rule__Option__Group_4__0__Impl rule__Option__Group_4__1 )
            // InternalMyDsl.g:3333:2: rule__Option__Group_4__0__Impl rule__Option__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Option__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_4__0"


    // $ANTLR start "rule__Option__Group_4__0__Impl"
    // InternalMyDsl.g:3340:1: rule__Option__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__Option__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3344:1: ( ( 'title' ) )
            // InternalMyDsl.g:3345:1: ( 'title' )
            {
            // InternalMyDsl.g:3345:1: ( 'title' )
            // InternalMyDsl.g:3346:2: 'title'
            {
             before(grammarAccess.getOptionAccess().getTitleKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_4__0__Impl"


    // $ANTLR start "rule__Option__Group_4__1"
    // InternalMyDsl.g:3355:1: rule__Option__Group_4__1 : rule__Option__Group_4__1__Impl ;
    public final void rule__Option__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3359:1: ( rule__Option__Group_4__1__Impl )
            // InternalMyDsl.g:3360:2: rule__Option__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_4__1"


    // $ANTLR start "rule__Option__Group_4__1__Impl"
    // InternalMyDsl.g:3366:1: rule__Option__Group_4__1__Impl : ( ( rule__Option__TitleAssignment_4_1 ) ) ;
    public final void rule__Option__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3370:1: ( ( ( rule__Option__TitleAssignment_4_1 ) ) )
            // InternalMyDsl.g:3371:1: ( ( rule__Option__TitleAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3371:1: ( ( rule__Option__TitleAssignment_4_1 ) )
            // InternalMyDsl.g:3372:2: ( rule__Option__TitleAssignment_4_1 )
            {
             before(grammarAccess.getOptionAccess().getTitleAssignment_4_1()); 
            // InternalMyDsl.g:3373:2: ( rule__Option__TitleAssignment_4_1 )
            // InternalMyDsl.g:3373:3: rule__Option__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Option__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_4__1__Impl"


    // $ANTLR start "rule__Option__Group_5__0"
    // InternalMyDsl.g:3382:1: rule__Option__Group_5__0 : rule__Option__Group_5__0__Impl rule__Option__Group_5__1 ;
    public final void rule__Option__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3386:1: ( rule__Option__Group_5__0__Impl rule__Option__Group_5__1 )
            // InternalMyDsl.g:3387:2: rule__Option__Group_5__0__Impl rule__Option__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Option__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_5__0"


    // $ANTLR start "rule__Option__Group_5__0__Impl"
    // InternalMyDsl.g:3394:1: rule__Option__Group_5__0__Impl : ( 'urlComponent' ) ;
    public final void rule__Option__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3398:1: ( ( 'urlComponent' ) )
            // InternalMyDsl.g:3399:1: ( 'urlComponent' )
            {
            // InternalMyDsl.g:3399:1: ( 'urlComponent' )
            // InternalMyDsl.g:3400:2: 'urlComponent'
            {
             before(grammarAccess.getOptionAccess().getUrlComponentKeyword_5_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getUrlComponentKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_5__0__Impl"


    // $ANTLR start "rule__Option__Group_5__1"
    // InternalMyDsl.g:3409:1: rule__Option__Group_5__1 : rule__Option__Group_5__1__Impl ;
    public final void rule__Option__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3413:1: ( rule__Option__Group_5__1__Impl )
            // InternalMyDsl.g:3414:2: rule__Option__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_5__1"


    // $ANTLR start "rule__Option__Group_5__1__Impl"
    // InternalMyDsl.g:3420:1: rule__Option__Group_5__1__Impl : ( ( rule__Option__UrlComponentAssignment_5_1 ) ) ;
    public final void rule__Option__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3424:1: ( ( ( rule__Option__UrlComponentAssignment_5_1 ) ) )
            // InternalMyDsl.g:3425:1: ( ( rule__Option__UrlComponentAssignment_5_1 ) )
            {
            // InternalMyDsl.g:3425:1: ( ( rule__Option__UrlComponentAssignment_5_1 ) )
            // InternalMyDsl.g:3426:2: ( rule__Option__UrlComponentAssignment_5_1 )
            {
             before(grammarAccess.getOptionAccess().getUrlComponentAssignment_5_1()); 
            // InternalMyDsl.g:3427:2: ( rule__Option__UrlComponentAssignment_5_1 )
            // InternalMyDsl.g:3427:3: rule__Option__UrlComponentAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Option__UrlComponentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getUrlComponentAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_5__1__Impl"


    // $ANTLR start "rule__LineChart__Group__0"
    // InternalMyDsl.g:3436:1: rule__LineChart__Group__0 : rule__LineChart__Group__0__Impl rule__LineChart__Group__1 ;
    public final void rule__LineChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3440:1: ( rule__LineChart__Group__0__Impl rule__LineChart__Group__1 )
            // InternalMyDsl.g:3441:2: rule__LineChart__Group__0__Impl rule__LineChart__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LineChart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__0"


    // $ANTLR start "rule__LineChart__Group__0__Impl"
    // InternalMyDsl.g:3448:1: rule__LineChart__Group__0__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__LineChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3452:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:3453:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:3453:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:3454:2: RULE_OBJECT_START
            {
             before(grammarAccess.getLineChartAccess().getOBJECT_STARTTerminalRuleCall_0()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getOBJECT_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__0__Impl"


    // $ANTLR start "rule__LineChart__Group__1"
    // InternalMyDsl.g:3463:1: rule__LineChart__Group__1 : rule__LineChart__Group__1__Impl rule__LineChart__Group__2 ;
    public final void rule__LineChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3467:1: ( rule__LineChart__Group__1__Impl rule__LineChart__Group__2 )
            // InternalMyDsl.g:3468:2: rule__LineChart__Group__1__Impl rule__LineChart__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__LineChart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__1"


    // $ANTLR start "rule__LineChart__Group__1__Impl"
    // InternalMyDsl.g:3475:1: rule__LineChart__Group__1__Impl : ( ( rule__LineChart__NameAssignment_1 ) ) ;
    public final void rule__LineChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3479:1: ( ( ( rule__LineChart__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3480:1: ( ( rule__LineChart__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3480:1: ( ( rule__LineChart__NameAssignment_1 ) )
            // InternalMyDsl.g:3481:2: ( rule__LineChart__NameAssignment_1 )
            {
             before(grammarAccess.getLineChartAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3482:2: ( rule__LineChart__NameAssignment_1 )
            // InternalMyDsl.g:3482:3: rule__LineChart__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__1__Impl"


    // $ANTLR start "rule__LineChart__Group__2"
    // InternalMyDsl.g:3490:1: rule__LineChart__Group__2 : rule__LineChart__Group__2__Impl rule__LineChart__Group__3 ;
    public final void rule__LineChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3494:1: ( rule__LineChart__Group__2__Impl rule__LineChart__Group__3 )
            // InternalMyDsl.g:3495:2: rule__LineChart__Group__2__Impl rule__LineChart__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__LineChart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__2"


    // $ANTLR start "rule__LineChart__Group__2__Impl"
    // InternalMyDsl.g:3502:1: rule__LineChart__Group__2__Impl : ( ( rule__LineChart__Group_2__0 ) ) ;
    public final void rule__LineChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3506:1: ( ( ( rule__LineChart__Group_2__0 ) ) )
            // InternalMyDsl.g:3507:1: ( ( rule__LineChart__Group_2__0 ) )
            {
            // InternalMyDsl.g:3507:1: ( ( rule__LineChart__Group_2__0 ) )
            // InternalMyDsl.g:3508:2: ( rule__LineChart__Group_2__0 )
            {
             before(grammarAccess.getLineChartAccess().getGroup_2()); 
            // InternalMyDsl.g:3509:2: ( rule__LineChart__Group_2__0 )
            // InternalMyDsl.g:3509:3: rule__LineChart__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__2__Impl"


    // $ANTLR start "rule__LineChart__Group__3"
    // InternalMyDsl.g:3517:1: rule__LineChart__Group__3 : rule__LineChart__Group__3__Impl rule__LineChart__Group__4 ;
    public final void rule__LineChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3521:1: ( rule__LineChart__Group__3__Impl rule__LineChart__Group__4 )
            // InternalMyDsl.g:3522:2: rule__LineChart__Group__3__Impl rule__LineChart__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__LineChart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__3"


    // $ANTLR start "rule__LineChart__Group__3__Impl"
    // InternalMyDsl.g:3529:1: rule__LineChart__Group__3__Impl : ( ( rule__LineChart__Group_3__0 )? ) ;
    public final void rule__LineChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3533:1: ( ( ( rule__LineChart__Group_3__0 )? ) )
            // InternalMyDsl.g:3534:1: ( ( rule__LineChart__Group_3__0 )? )
            {
            // InternalMyDsl.g:3534:1: ( ( rule__LineChart__Group_3__0 )? )
            // InternalMyDsl.g:3535:2: ( rule__LineChart__Group_3__0 )?
            {
             before(grammarAccess.getLineChartAccess().getGroup_3()); 
            // InternalMyDsl.g:3536:2: ( rule__LineChart__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==58) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:3536:3: rule__LineChart__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChart__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__3__Impl"


    // $ANTLR start "rule__LineChart__Group__4"
    // InternalMyDsl.g:3544:1: rule__LineChart__Group__4 : rule__LineChart__Group__4__Impl rule__LineChart__Group__5 ;
    public final void rule__LineChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3548:1: ( rule__LineChart__Group__4__Impl rule__LineChart__Group__5 )
            // InternalMyDsl.g:3549:2: rule__LineChart__Group__4__Impl rule__LineChart__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__LineChart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__4"


    // $ANTLR start "rule__LineChart__Group__4__Impl"
    // InternalMyDsl.g:3556:1: rule__LineChart__Group__4__Impl : ( ( rule__LineChart__Group_4__0 )? ) ;
    public final void rule__LineChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3560:1: ( ( ( rule__LineChart__Group_4__0 )? ) )
            // InternalMyDsl.g:3561:1: ( ( rule__LineChart__Group_4__0 )? )
            {
            // InternalMyDsl.g:3561:1: ( ( rule__LineChart__Group_4__0 )? )
            // InternalMyDsl.g:3562:2: ( rule__LineChart__Group_4__0 )?
            {
             before(grammarAccess.getLineChartAccess().getGroup_4()); 
            // InternalMyDsl.g:3563:2: ( rule__LineChart__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==59) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3563:3: rule__LineChart__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChart__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__4__Impl"


    // $ANTLR start "rule__LineChart__Group__5"
    // InternalMyDsl.g:3571:1: rule__LineChart__Group__5 : rule__LineChart__Group__5__Impl rule__LineChart__Group__6 ;
    public final void rule__LineChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3575:1: ( rule__LineChart__Group__5__Impl rule__LineChart__Group__6 )
            // InternalMyDsl.g:3576:2: rule__LineChart__Group__5__Impl rule__LineChart__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__LineChart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__5"


    // $ANTLR start "rule__LineChart__Group__5__Impl"
    // InternalMyDsl.g:3583:1: rule__LineChart__Group__5__Impl : ( ( rule__LineChart__Group_5__0 )? ) ;
    public final void rule__LineChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3587:1: ( ( ( rule__LineChart__Group_5__0 )? ) )
            // InternalMyDsl.g:3588:1: ( ( rule__LineChart__Group_5__0 )? )
            {
            // InternalMyDsl.g:3588:1: ( ( rule__LineChart__Group_5__0 )? )
            // InternalMyDsl.g:3589:2: ( rule__LineChart__Group_5__0 )?
            {
             before(grammarAccess.getLineChartAccess().getGroup_5()); 
            // InternalMyDsl.g:3590:2: ( rule__LineChart__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==60) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:3590:3: rule__LineChart__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChart__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__5__Impl"


    // $ANTLR start "rule__LineChart__Group__6"
    // InternalMyDsl.g:3598:1: rule__LineChart__Group__6 : rule__LineChart__Group__6__Impl rule__LineChart__Group__7 ;
    public final void rule__LineChart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3602:1: ( rule__LineChart__Group__6__Impl rule__LineChart__Group__7 )
            // InternalMyDsl.g:3603:2: rule__LineChart__Group__6__Impl rule__LineChart__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__LineChart__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__6"


    // $ANTLR start "rule__LineChart__Group__6__Impl"
    // InternalMyDsl.g:3610:1: rule__LineChart__Group__6__Impl : ( ( rule__LineChart__Group_6__0 )? ) ;
    public final void rule__LineChart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3614:1: ( ( ( rule__LineChart__Group_6__0 )? ) )
            // InternalMyDsl.g:3615:1: ( ( rule__LineChart__Group_6__0 )? )
            {
            // InternalMyDsl.g:3615:1: ( ( rule__LineChart__Group_6__0 )? )
            // InternalMyDsl.g:3616:2: ( rule__LineChart__Group_6__0 )?
            {
             before(grammarAccess.getLineChartAccess().getGroup_6()); 
            // InternalMyDsl.g:3617:2: ( rule__LineChart__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==61) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3617:3: rule__LineChart__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChart__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__6__Impl"


    // $ANTLR start "rule__LineChart__Group__7"
    // InternalMyDsl.g:3625:1: rule__LineChart__Group__7 : rule__LineChart__Group__7__Impl rule__LineChart__Group__8 ;
    public final void rule__LineChart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3629:1: ( rule__LineChart__Group__7__Impl rule__LineChart__Group__8 )
            // InternalMyDsl.g:3630:2: rule__LineChart__Group__7__Impl rule__LineChart__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__LineChart__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__7"


    // $ANTLR start "rule__LineChart__Group__7__Impl"
    // InternalMyDsl.g:3637:1: rule__LineChart__Group__7__Impl : ( ( rule__LineChart__Group_7__0 )? ) ;
    public final void rule__LineChart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3641:1: ( ( ( rule__LineChart__Group_7__0 )? ) )
            // InternalMyDsl.g:3642:1: ( ( rule__LineChart__Group_7__0 )? )
            {
            // InternalMyDsl.g:3642:1: ( ( rule__LineChart__Group_7__0 )? )
            // InternalMyDsl.g:3643:2: ( rule__LineChart__Group_7__0 )?
            {
             before(grammarAccess.getLineChartAccess().getGroup_7()); 
            // InternalMyDsl.g:3644:2: ( rule__LineChart__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==62) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3644:3: rule__LineChart__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChart__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__7__Impl"


    // $ANTLR start "rule__LineChart__Group__8"
    // InternalMyDsl.g:3652:1: rule__LineChart__Group__8 : rule__LineChart__Group__8__Impl rule__LineChart__Group__9 ;
    public final void rule__LineChart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3656:1: ( rule__LineChart__Group__8__Impl rule__LineChart__Group__9 )
            // InternalMyDsl.g:3657:2: rule__LineChart__Group__8__Impl rule__LineChart__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__LineChart__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__8"


    // $ANTLR start "rule__LineChart__Group__8__Impl"
    // InternalMyDsl.g:3664:1: rule__LineChart__Group__8__Impl : ( ( rule__LineChart__DisplayGridLinesXAxesAssignment_8 )? ) ;
    public final void rule__LineChart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3668:1: ( ( ( rule__LineChart__DisplayGridLinesXAxesAssignment_8 )? ) )
            // InternalMyDsl.g:3669:1: ( ( rule__LineChart__DisplayGridLinesXAxesAssignment_8 )? )
            {
            // InternalMyDsl.g:3669:1: ( ( rule__LineChart__DisplayGridLinesXAxesAssignment_8 )? )
            // InternalMyDsl.g:3670:2: ( rule__LineChart__DisplayGridLinesXAxesAssignment_8 )?
            {
             before(grammarAccess.getLineChartAccess().getDisplayGridLinesXAxesAssignment_8()); 
            // InternalMyDsl.g:3671:2: ( rule__LineChart__DisplayGridLinesXAxesAssignment_8 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==83) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3671:3: rule__LineChart__DisplayGridLinesXAxesAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChart__DisplayGridLinesXAxesAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartAccess().getDisplayGridLinesXAxesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__8__Impl"


    // $ANTLR start "rule__LineChart__Group__9"
    // InternalMyDsl.g:3679:1: rule__LineChart__Group__9 : rule__LineChart__Group__9__Impl rule__LineChart__Group__10 ;
    public final void rule__LineChart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3683:1: ( rule__LineChart__Group__9__Impl rule__LineChart__Group__10 )
            // InternalMyDsl.g:3684:2: rule__LineChart__Group__9__Impl rule__LineChart__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__LineChart__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__9"


    // $ANTLR start "rule__LineChart__Group__9__Impl"
    // InternalMyDsl.g:3691:1: rule__LineChart__Group__9__Impl : ( ( rule__LineChart__DisplayGridLinesYAxesAssignment_9 )? ) ;
    public final void rule__LineChart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3695:1: ( ( ( rule__LineChart__DisplayGridLinesYAxesAssignment_9 )? ) )
            // InternalMyDsl.g:3696:1: ( ( rule__LineChart__DisplayGridLinesYAxesAssignment_9 )? )
            {
            // InternalMyDsl.g:3696:1: ( ( rule__LineChart__DisplayGridLinesYAxesAssignment_9 )? )
            // InternalMyDsl.g:3697:2: ( rule__LineChart__DisplayGridLinesYAxesAssignment_9 )?
            {
             before(grammarAccess.getLineChartAccess().getDisplayGridLinesYAxesAssignment_9()); 
            // InternalMyDsl.g:3698:2: ( rule__LineChart__DisplayGridLinesYAxesAssignment_9 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==84) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:3698:3: rule__LineChart__DisplayGridLinesYAxesAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineChart__DisplayGridLinesYAxesAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineChartAccess().getDisplayGridLinesYAxesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__9__Impl"


    // $ANTLR start "rule__LineChart__Group__10"
    // InternalMyDsl.g:3706:1: rule__LineChart__Group__10 : rule__LineChart__Group__10__Impl rule__LineChart__Group__11 ;
    public final void rule__LineChart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3710:1: ( rule__LineChart__Group__10__Impl rule__LineChart__Group__11 )
            // InternalMyDsl.g:3711:2: rule__LineChart__Group__10__Impl rule__LineChart__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__LineChart__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__10"


    // $ANTLR start "rule__LineChart__Group__10__Impl"
    // InternalMyDsl.g:3718:1: rule__LineChart__Group__10__Impl : ( 'data' ) ;
    public final void rule__LineChart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3722:1: ( ( 'data' ) )
            // InternalMyDsl.g:3723:1: ( 'data' )
            {
            // InternalMyDsl.g:3723:1: ( 'data' )
            // InternalMyDsl.g:3724:2: 'data'
            {
             before(grammarAccess.getLineChartAccess().getDataKeyword_10()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getDataKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__10__Impl"


    // $ANTLR start "rule__LineChart__Group__11"
    // InternalMyDsl.g:3733:1: rule__LineChart__Group__11 : rule__LineChart__Group__11__Impl rule__LineChart__Group__12 ;
    public final void rule__LineChart__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3737:1: ( rule__LineChart__Group__11__Impl rule__LineChart__Group__12 )
            // InternalMyDsl.g:3738:2: rule__LineChart__Group__11__Impl rule__LineChart__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__LineChart__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__11"


    // $ANTLR start "rule__LineChart__Group__11__Impl"
    // InternalMyDsl.g:3745:1: rule__LineChart__Group__11__Impl : ( RULE_EQUALS ) ;
    public final void rule__LineChart__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3749:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:3750:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:3750:1: ( RULE_EQUALS )
            // InternalMyDsl.g:3751:2: RULE_EQUALS
            {
             before(grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_11()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__11__Impl"


    // $ANTLR start "rule__LineChart__Group__12"
    // InternalMyDsl.g:3760:1: rule__LineChart__Group__12 : rule__LineChart__Group__12__Impl rule__LineChart__Group__13 ;
    public final void rule__LineChart__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3764:1: ( rule__LineChart__Group__12__Impl rule__LineChart__Group__13 )
            // InternalMyDsl.g:3765:2: rule__LineChart__Group__12__Impl rule__LineChart__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__LineChart__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__12"


    // $ANTLR start "rule__LineChart__Group__12__Impl"
    // InternalMyDsl.g:3772:1: rule__LineChart__Group__12__Impl : ( RULE_LIST_START ) ;
    public final void rule__LineChart__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3776:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:3777:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:3777:1: ( RULE_LIST_START )
            // InternalMyDsl.g:3778:2: RULE_LIST_START
            {
             before(grammarAccess.getLineChartAccess().getLIST_STARTTerminalRuleCall_12()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getLIST_STARTTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__12__Impl"


    // $ANTLR start "rule__LineChart__Group__13"
    // InternalMyDsl.g:3787:1: rule__LineChart__Group__13 : rule__LineChart__Group__13__Impl rule__LineChart__Group__14 ;
    public final void rule__LineChart__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3791:1: ( rule__LineChart__Group__13__Impl rule__LineChart__Group__14 )
            // InternalMyDsl.g:3792:2: rule__LineChart__Group__13__Impl rule__LineChart__Group__14
            {
            pushFollow(FOLLOW_9);
            rule__LineChart__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__13"


    // $ANTLR start "rule__LineChart__Group__13__Impl"
    // InternalMyDsl.g:3799:1: rule__LineChart__Group__13__Impl : ( ( rule__LineChart__DataAssignment_13 ) ) ;
    public final void rule__LineChart__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3803:1: ( ( ( rule__LineChart__DataAssignment_13 ) ) )
            // InternalMyDsl.g:3804:1: ( ( rule__LineChart__DataAssignment_13 ) )
            {
            // InternalMyDsl.g:3804:1: ( ( rule__LineChart__DataAssignment_13 ) )
            // InternalMyDsl.g:3805:2: ( rule__LineChart__DataAssignment_13 )
            {
             before(grammarAccess.getLineChartAccess().getDataAssignment_13()); 
            // InternalMyDsl.g:3806:2: ( rule__LineChart__DataAssignment_13 )
            // InternalMyDsl.g:3806:3: rule__LineChart__DataAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__DataAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getDataAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__13__Impl"


    // $ANTLR start "rule__LineChart__Group__14"
    // InternalMyDsl.g:3814:1: rule__LineChart__Group__14 : rule__LineChart__Group__14__Impl rule__LineChart__Group__15 ;
    public final void rule__LineChart__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3818:1: ( rule__LineChart__Group__14__Impl rule__LineChart__Group__15 )
            // InternalMyDsl.g:3819:2: rule__LineChart__Group__14__Impl rule__LineChart__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__LineChart__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__14"


    // $ANTLR start "rule__LineChart__Group__14__Impl"
    // InternalMyDsl.g:3826:1: rule__LineChart__Group__14__Impl : ( ( rule__LineChart__Group_14__0 )* ) ;
    public final void rule__LineChart__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3830:1: ( ( ( rule__LineChart__Group_14__0 )* ) )
            // InternalMyDsl.g:3831:1: ( ( rule__LineChart__Group_14__0 )* )
            {
            // InternalMyDsl.g:3831:1: ( ( rule__LineChart__Group_14__0 )* )
            // InternalMyDsl.g:3832:2: ( rule__LineChart__Group_14__0 )*
            {
             before(grammarAccess.getLineChartAccess().getGroup_14()); 
            // InternalMyDsl.g:3833:2: ( rule__LineChart__Group_14__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_COMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:3833:3: rule__LineChart__Group_14__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__LineChart__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getLineChartAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__14__Impl"


    // $ANTLR start "rule__LineChart__Group__15"
    // InternalMyDsl.g:3841:1: rule__LineChart__Group__15 : rule__LineChart__Group__15__Impl rule__LineChart__Group__16 ;
    public final void rule__LineChart__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3845:1: ( rule__LineChart__Group__15__Impl rule__LineChart__Group__16 )
            // InternalMyDsl.g:3846:2: rule__LineChart__Group__15__Impl rule__LineChart__Group__16
            {
            pushFollow(FOLLOW_22);
            rule__LineChart__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__15"


    // $ANTLR start "rule__LineChart__Group__15__Impl"
    // InternalMyDsl.g:3853:1: rule__LineChart__Group__15__Impl : ( RULE_LIST_END ) ;
    public final void rule__LineChart__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3857:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:3858:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:3858:1: ( RULE_LIST_END )
            // InternalMyDsl.g:3859:2: RULE_LIST_END
            {
             before(grammarAccess.getLineChartAccess().getLIST_ENDTerminalRuleCall_15()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getLIST_ENDTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__15__Impl"


    // $ANTLR start "rule__LineChart__Group__16"
    // InternalMyDsl.g:3868:1: rule__LineChart__Group__16 : rule__LineChart__Group__16__Impl rule__LineChart__Group__17 ;
    public final void rule__LineChart__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3872:1: ( rule__LineChart__Group__16__Impl rule__LineChart__Group__17 )
            // InternalMyDsl.g:3873:2: rule__LineChart__Group__16__Impl rule__LineChart__Group__17
            {
            pushFollow(FOLLOW_6);
            rule__LineChart__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__16"


    // $ANTLR start "rule__LineChart__Group__16__Impl"
    // InternalMyDsl.g:3880:1: rule__LineChart__Group__16__Impl : ( 'labels' ) ;
    public final void rule__LineChart__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3884:1: ( ( 'labels' ) )
            // InternalMyDsl.g:3885:1: ( 'labels' )
            {
            // InternalMyDsl.g:3885:1: ( 'labels' )
            // InternalMyDsl.g:3886:2: 'labels'
            {
             before(grammarAccess.getLineChartAccess().getLabelsKeyword_16()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getLabelsKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__16__Impl"


    // $ANTLR start "rule__LineChart__Group__17"
    // InternalMyDsl.g:3895:1: rule__LineChart__Group__17 : rule__LineChart__Group__17__Impl rule__LineChart__Group__18 ;
    public final void rule__LineChart__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3899:1: ( rule__LineChart__Group__17__Impl rule__LineChart__Group__18 )
            // InternalMyDsl.g:3900:2: rule__LineChart__Group__17__Impl rule__LineChart__Group__18
            {
            pushFollow(FOLLOW_7);
            rule__LineChart__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__17"


    // $ANTLR start "rule__LineChart__Group__17__Impl"
    // InternalMyDsl.g:3907:1: rule__LineChart__Group__17__Impl : ( RULE_EQUALS ) ;
    public final void rule__LineChart__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3911:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:3912:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:3912:1: ( RULE_EQUALS )
            // InternalMyDsl.g:3913:2: RULE_EQUALS
            {
             before(grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_17()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getEQUALSTerminalRuleCall_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__17__Impl"


    // $ANTLR start "rule__LineChart__Group__18"
    // InternalMyDsl.g:3922:1: rule__LineChart__Group__18 : rule__LineChart__Group__18__Impl rule__LineChart__Group__19 ;
    public final void rule__LineChart__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3926:1: ( rule__LineChart__Group__18__Impl rule__LineChart__Group__19 )
            // InternalMyDsl.g:3927:2: rule__LineChart__Group__18__Impl rule__LineChart__Group__19
            {
            pushFollow(FOLLOW_8);
            rule__LineChart__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__18"


    // $ANTLR start "rule__LineChart__Group__18__Impl"
    // InternalMyDsl.g:3934:1: rule__LineChart__Group__18__Impl : ( RULE_LIST_START ) ;
    public final void rule__LineChart__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3938:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:3939:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:3939:1: ( RULE_LIST_START )
            // InternalMyDsl.g:3940:2: RULE_LIST_START
            {
             before(grammarAccess.getLineChartAccess().getLIST_STARTTerminalRuleCall_18()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getLIST_STARTTerminalRuleCall_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__18__Impl"


    // $ANTLR start "rule__LineChart__Group__19"
    // InternalMyDsl.g:3949:1: rule__LineChart__Group__19 : rule__LineChart__Group__19__Impl rule__LineChart__Group__20 ;
    public final void rule__LineChart__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3953:1: ( rule__LineChart__Group__19__Impl rule__LineChart__Group__20 )
            // InternalMyDsl.g:3954:2: rule__LineChart__Group__19__Impl rule__LineChart__Group__20
            {
            pushFollow(FOLLOW_9);
            rule__LineChart__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__19"


    // $ANTLR start "rule__LineChart__Group__19__Impl"
    // InternalMyDsl.g:3961:1: rule__LineChart__Group__19__Impl : ( ( rule__LineChart__LabelsAssignment_19 ) ) ;
    public final void rule__LineChart__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3965:1: ( ( ( rule__LineChart__LabelsAssignment_19 ) ) )
            // InternalMyDsl.g:3966:1: ( ( rule__LineChart__LabelsAssignment_19 ) )
            {
            // InternalMyDsl.g:3966:1: ( ( rule__LineChart__LabelsAssignment_19 ) )
            // InternalMyDsl.g:3967:2: ( rule__LineChart__LabelsAssignment_19 )
            {
             before(grammarAccess.getLineChartAccess().getLabelsAssignment_19()); 
            // InternalMyDsl.g:3968:2: ( rule__LineChart__LabelsAssignment_19 )
            // InternalMyDsl.g:3968:3: rule__LineChart__LabelsAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__LabelsAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getLabelsAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__19__Impl"


    // $ANTLR start "rule__LineChart__Group__20"
    // InternalMyDsl.g:3976:1: rule__LineChart__Group__20 : rule__LineChart__Group__20__Impl rule__LineChart__Group__21 ;
    public final void rule__LineChart__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3980:1: ( rule__LineChart__Group__20__Impl rule__LineChart__Group__21 )
            // InternalMyDsl.g:3981:2: rule__LineChart__Group__20__Impl rule__LineChart__Group__21
            {
            pushFollow(FOLLOW_9);
            rule__LineChart__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__20"


    // $ANTLR start "rule__LineChart__Group__20__Impl"
    // InternalMyDsl.g:3988:1: rule__LineChart__Group__20__Impl : ( ( rule__LineChart__Group_20__0 )* ) ;
    public final void rule__LineChart__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3992:1: ( ( ( rule__LineChart__Group_20__0 )* ) )
            // InternalMyDsl.g:3993:1: ( ( rule__LineChart__Group_20__0 )* )
            {
            // InternalMyDsl.g:3993:1: ( ( rule__LineChart__Group_20__0 )* )
            // InternalMyDsl.g:3994:2: ( rule__LineChart__Group_20__0 )*
            {
             before(grammarAccess.getLineChartAccess().getGroup_20()); 
            // InternalMyDsl.g:3995:2: ( rule__LineChart__Group_20__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:3995:3: rule__LineChart__Group_20__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__LineChart__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getLineChartAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__20__Impl"


    // $ANTLR start "rule__LineChart__Group__21"
    // InternalMyDsl.g:4003:1: rule__LineChart__Group__21 : rule__LineChart__Group__21__Impl rule__LineChart__Group__22 ;
    public final void rule__LineChart__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4007:1: ( rule__LineChart__Group__21__Impl rule__LineChart__Group__22 )
            // InternalMyDsl.g:4008:2: rule__LineChart__Group__21__Impl rule__LineChart__Group__22
            {
            pushFollow(FOLLOW_12);
            rule__LineChart__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__21"


    // $ANTLR start "rule__LineChart__Group__21__Impl"
    // InternalMyDsl.g:4015:1: rule__LineChart__Group__21__Impl : ( RULE_LIST_END ) ;
    public final void rule__LineChart__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4019:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:4020:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:4020:1: ( RULE_LIST_END )
            // InternalMyDsl.g:4021:2: RULE_LIST_END
            {
             before(grammarAccess.getLineChartAccess().getLIST_ENDTerminalRuleCall_21()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getLIST_ENDTerminalRuleCall_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__21__Impl"


    // $ANTLR start "rule__LineChart__Group__22"
    // InternalMyDsl.g:4030:1: rule__LineChart__Group__22 : rule__LineChart__Group__22__Impl ;
    public final void rule__LineChart__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4034:1: ( rule__LineChart__Group__22__Impl )
            // InternalMyDsl.g:4035:2: rule__LineChart__Group__22__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__Group__22__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__22"


    // $ANTLR start "rule__LineChart__Group__22__Impl"
    // InternalMyDsl.g:4041:1: rule__LineChart__Group__22__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__LineChart__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4045:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:4046:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:4046:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:4047:2: RULE_OBJECT_END
            {
             before(grammarAccess.getLineChartAccess().getOBJECT_ENDTerminalRuleCall_22()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getOBJECT_ENDTerminalRuleCall_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__22__Impl"


    // $ANTLR start "rule__LineChart__Group_2__0"
    // InternalMyDsl.g:4057:1: rule__LineChart__Group_2__0 : rule__LineChart__Group_2__0__Impl rule__LineChart__Group_2__1 ;
    public final void rule__LineChart__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4061:1: ( rule__LineChart__Group_2__0__Impl rule__LineChart__Group_2__1 )
            // InternalMyDsl.g:4062:2: rule__LineChart__Group_2__0__Impl rule__LineChart__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__LineChart__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_2__0"


    // $ANTLR start "rule__LineChart__Group_2__0__Impl"
    // InternalMyDsl.g:4069:1: rule__LineChart__Group_2__0__Impl : ( 'title' ) ;
    public final void rule__LineChart__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4073:1: ( ( 'title' ) )
            // InternalMyDsl.g:4074:1: ( 'title' )
            {
            // InternalMyDsl.g:4074:1: ( 'title' )
            // InternalMyDsl.g:4075:2: 'title'
            {
             before(grammarAccess.getLineChartAccess().getTitleKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getTitleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_2__0__Impl"


    // $ANTLR start "rule__LineChart__Group_2__1"
    // InternalMyDsl.g:4084:1: rule__LineChart__Group_2__1 : rule__LineChart__Group_2__1__Impl ;
    public final void rule__LineChart__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4088:1: ( rule__LineChart__Group_2__1__Impl )
            // InternalMyDsl.g:4089:2: rule__LineChart__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_2__1"


    // $ANTLR start "rule__LineChart__Group_2__1__Impl"
    // InternalMyDsl.g:4095:1: rule__LineChart__Group_2__1__Impl : ( ( rule__LineChart__TitleAssignment_2_1 ) ) ;
    public final void rule__LineChart__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4099:1: ( ( ( rule__LineChart__TitleAssignment_2_1 ) ) )
            // InternalMyDsl.g:4100:1: ( ( rule__LineChart__TitleAssignment_2_1 ) )
            {
            // InternalMyDsl.g:4100:1: ( ( rule__LineChart__TitleAssignment_2_1 ) )
            // InternalMyDsl.g:4101:2: ( rule__LineChart__TitleAssignment_2_1 )
            {
             before(grammarAccess.getLineChartAccess().getTitleAssignment_2_1()); 
            // InternalMyDsl.g:4102:2: ( rule__LineChart__TitleAssignment_2_1 )
            // InternalMyDsl.g:4102:3: rule__LineChart__TitleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__TitleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getTitleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_2__1__Impl"


    // $ANTLR start "rule__LineChart__Group_3__0"
    // InternalMyDsl.g:4111:1: rule__LineChart__Group_3__0 : rule__LineChart__Group_3__0__Impl rule__LineChart__Group_3__1 ;
    public final void rule__LineChart__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4115:1: ( rule__LineChart__Group_3__0__Impl rule__LineChart__Group_3__1 )
            // InternalMyDsl.g:4116:2: rule__LineChart__Group_3__0__Impl rule__LineChart__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__LineChart__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_3__0"


    // $ANTLR start "rule__LineChart__Group_3__0__Impl"
    // InternalMyDsl.g:4123:1: rule__LineChart__Group_3__0__Impl : ( 'legendPosition' ) ;
    public final void rule__LineChart__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4127:1: ( ( 'legendPosition' ) )
            // InternalMyDsl.g:4128:1: ( 'legendPosition' )
            {
            // InternalMyDsl.g:4128:1: ( 'legendPosition' )
            // InternalMyDsl.g:4129:2: 'legendPosition'
            {
             before(grammarAccess.getLineChartAccess().getLegendPositionKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getLegendPositionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_3__0__Impl"


    // $ANTLR start "rule__LineChart__Group_3__1"
    // InternalMyDsl.g:4138:1: rule__LineChart__Group_3__1 : rule__LineChart__Group_3__1__Impl ;
    public final void rule__LineChart__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4142:1: ( rule__LineChart__Group_3__1__Impl )
            // InternalMyDsl.g:4143:2: rule__LineChart__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_3__1"


    // $ANTLR start "rule__LineChart__Group_3__1__Impl"
    // InternalMyDsl.g:4149:1: rule__LineChart__Group_3__1__Impl : ( ( rule__LineChart__LegendPositionAssignment_3_1 ) ) ;
    public final void rule__LineChart__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4153:1: ( ( ( rule__LineChart__LegendPositionAssignment_3_1 ) ) )
            // InternalMyDsl.g:4154:1: ( ( rule__LineChart__LegendPositionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4154:1: ( ( rule__LineChart__LegendPositionAssignment_3_1 ) )
            // InternalMyDsl.g:4155:2: ( rule__LineChart__LegendPositionAssignment_3_1 )
            {
             before(grammarAccess.getLineChartAccess().getLegendPositionAssignment_3_1()); 
            // InternalMyDsl.g:4156:2: ( rule__LineChart__LegendPositionAssignment_3_1 )
            // InternalMyDsl.g:4156:3: rule__LineChart__LegendPositionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__LegendPositionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getLegendPositionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_3__1__Impl"


    // $ANTLR start "rule__LineChart__Group_4__0"
    // InternalMyDsl.g:4165:1: rule__LineChart__Group_4__0 : rule__LineChart__Group_4__0__Impl rule__LineChart__Group_4__1 ;
    public final void rule__LineChart__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4169:1: ( rule__LineChart__Group_4__0__Impl rule__LineChart__Group_4__1 )
            // InternalMyDsl.g:4170:2: rule__LineChart__Group_4__0__Impl rule__LineChart__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__LineChart__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_4__0"


    // $ANTLR start "rule__LineChart__Group_4__0__Impl"
    // InternalMyDsl.g:4177:1: rule__LineChart__Group_4__0__Impl : ( 'labelStringXAxes' ) ;
    public final void rule__LineChart__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4181:1: ( ( 'labelStringXAxes' ) )
            // InternalMyDsl.g:4182:1: ( 'labelStringXAxes' )
            {
            // InternalMyDsl.g:4182:1: ( 'labelStringXAxes' )
            // InternalMyDsl.g:4183:2: 'labelStringXAxes'
            {
             before(grammarAccess.getLineChartAccess().getLabelStringXAxesKeyword_4_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getLabelStringXAxesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_4__0__Impl"


    // $ANTLR start "rule__LineChart__Group_4__1"
    // InternalMyDsl.g:4192:1: rule__LineChart__Group_4__1 : rule__LineChart__Group_4__1__Impl ;
    public final void rule__LineChart__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4196:1: ( rule__LineChart__Group_4__1__Impl )
            // InternalMyDsl.g:4197:2: rule__LineChart__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_4__1"


    // $ANTLR start "rule__LineChart__Group_4__1__Impl"
    // InternalMyDsl.g:4203:1: rule__LineChart__Group_4__1__Impl : ( ( rule__LineChart__LabelStringXAxesAssignment_4_1 ) ) ;
    public final void rule__LineChart__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4207:1: ( ( ( rule__LineChart__LabelStringXAxesAssignment_4_1 ) ) )
            // InternalMyDsl.g:4208:1: ( ( rule__LineChart__LabelStringXAxesAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4208:1: ( ( rule__LineChart__LabelStringXAxesAssignment_4_1 ) )
            // InternalMyDsl.g:4209:2: ( rule__LineChart__LabelStringXAxesAssignment_4_1 )
            {
             before(grammarAccess.getLineChartAccess().getLabelStringXAxesAssignment_4_1()); 
            // InternalMyDsl.g:4210:2: ( rule__LineChart__LabelStringXAxesAssignment_4_1 )
            // InternalMyDsl.g:4210:3: rule__LineChart__LabelStringXAxesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__LabelStringXAxesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getLabelStringXAxesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_4__1__Impl"


    // $ANTLR start "rule__LineChart__Group_5__0"
    // InternalMyDsl.g:4219:1: rule__LineChart__Group_5__0 : rule__LineChart__Group_5__0__Impl rule__LineChart__Group_5__1 ;
    public final void rule__LineChart__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4223:1: ( rule__LineChart__Group_5__0__Impl rule__LineChart__Group_5__1 )
            // InternalMyDsl.g:4224:2: rule__LineChart__Group_5__0__Impl rule__LineChart__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__LineChart__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_5__0"


    // $ANTLR start "rule__LineChart__Group_5__0__Impl"
    // InternalMyDsl.g:4231:1: rule__LineChart__Group_5__0__Impl : ( 'colorGridLinesXAxes' ) ;
    public final void rule__LineChart__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4235:1: ( ( 'colorGridLinesXAxes' ) )
            // InternalMyDsl.g:4236:1: ( 'colorGridLinesXAxes' )
            {
            // InternalMyDsl.g:4236:1: ( 'colorGridLinesXAxes' )
            // InternalMyDsl.g:4237:2: 'colorGridLinesXAxes'
            {
             before(grammarAccess.getLineChartAccess().getColorGridLinesXAxesKeyword_5_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getColorGridLinesXAxesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_5__0__Impl"


    // $ANTLR start "rule__LineChart__Group_5__1"
    // InternalMyDsl.g:4246:1: rule__LineChart__Group_5__1 : rule__LineChart__Group_5__1__Impl ;
    public final void rule__LineChart__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4250:1: ( rule__LineChart__Group_5__1__Impl )
            // InternalMyDsl.g:4251:2: rule__LineChart__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_5__1"


    // $ANTLR start "rule__LineChart__Group_5__1__Impl"
    // InternalMyDsl.g:4257:1: rule__LineChart__Group_5__1__Impl : ( ( rule__LineChart__ColorGridLinesXAxesAssignment_5_1 ) ) ;
    public final void rule__LineChart__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4261:1: ( ( ( rule__LineChart__ColorGridLinesXAxesAssignment_5_1 ) ) )
            // InternalMyDsl.g:4262:1: ( ( rule__LineChart__ColorGridLinesXAxesAssignment_5_1 ) )
            {
            // InternalMyDsl.g:4262:1: ( ( rule__LineChart__ColorGridLinesXAxesAssignment_5_1 ) )
            // InternalMyDsl.g:4263:2: ( rule__LineChart__ColorGridLinesXAxesAssignment_5_1 )
            {
             before(grammarAccess.getLineChartAccess().getColorGridLinesXAxesAssignment_5_1()); 
            // InternalMyDsl.g:4264:2: ( rule__LineChart__ColorGridLinesXAxesAssignment_5_1 )
            // InternalMyDsl.g:4264:3: rule__LineChart__ColorGridLinesXAxesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__ColorGridLinesXAxesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getColorGridLinesXAxesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_5__1__Impl"


    // $ANTLR start "rule__LineChart__Group_6__0"
    // InternalMyDsl.g:4273:1: rule__LineChart__Group_6__0 : rule__LineChart__Group_6__0__Impl rule__LineChart__Group_6__1 ;
    public final void rule__LineChart__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4277:1: ( rule__LineChart__Group_6__0__Impl rule__LineChart__Group_6__1 )
            // InternalMyDsl.g:4278:2: rule__LineChart__Group_6__0__Impl rule__LineChart__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__LineChart__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_6__0"


    // $ANTLR start "rule__LineChart__Group_6__0__Impl"
    // InternalMyDsl.g:4285:1: rule__LineChart__Group_6__0__Impl : ( 'labelStringYAxes' ) ;
    public final void rule__LineChart__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4289:1: ( ( 'labelStringYAxes' ) )
            // InternalMyDsl.g:4290:1: ( 'labelStringYAxes' )
            {
            // InternalMyDsl.g:4290:1: ( 'labelStringYAxes' )
            // InternalMyDsl.g:4291:2: 'labelStringYAxes'
            {
             before(grammarAccess.getLineChartAccess().getLabelStringYAxesKeyword_6_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getLabelStringYAxesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_6__0__Impl"


    // $ANTLR start "rule__LineChart__Group_6__1"
    // InternalMyDsl.g:4300:1: rule__LineChart__Group_6__1 : rule__LineChart__Group_6__1__Impl ;
    public final void rule__LineChart__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4304:1: ( rule__LineChart__Group_6__1__Impl )
            // InternalMyDsl.g:4305:2: rule__LineChart__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_6__1"


    // $ANTLR start "rule__LineChart__Group_6__1__Impl"
    // InternalMyDsl.g:4311:1: rule__LineChart__Group_6__1__Impl : ( ( rule__LineChart__LabelStringYAxesAssignment_6_1 ) ) ;
    public final void rule__LineChart__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4315:1: ( ( ( rule__LineChart__LabelStringYAxesAssignment_6_1 ) ) )
            // InternalMyDsl.g:4316:1: ( ( rule__LineChart__LabelStringYAxesAssignment_6_1 ) )
            {
            // InternalMyDsl.g:4316:1: ( ( rule__LineChart__LabelStringYAxesAssignment_6_1 ) )
            // InternalMyDsl.g:4317:2: ( rule__LineChart__LabelStringYAxesAssignment_6_1 )
            {
             before(grammarAccess.getLineChartAccess().getLabelStringYAxesAssignment_6_1()); 
            // InternalMyDsl.g:4318:2: ( rule__LineChart__LabelStringYAxesAssignment_6_1 )
            // InternalMyDsl.g:4318:3: rule__LineChart__LabelStringYAxesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__LabelStringYAxesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getLabelStringYAxesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_6__1__Impl"


    // $ANTLR start "rule__LineChart__Group_7__0"
    // InternalMyDsl.g:4327:1: rule__LineChart__Group_7__0 : rule__LineChart__Group_7__0__Impl rule__LineChart__Group_7__1 ;
    public final void rule__LineChart__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4331:1: ( rule__LineChart__Group_7__0__Impl rule__LineChart__Group_7__1 )
            // InternalMyDsl.g:4332:2: rule__LineChart__Group_7__0__Impl rule__LineChart__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__LineChart__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_7__0"


    // $ANTLR start "rule__LineChart__Group_7__0__Impl"
    // InternalMyDsl.g:4339:1: rule__LineChart__Group_7__0__Impl : ( 'colorGridLinesYAxes' ) ;
    public final void rule__LineChart__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4343:1: ( ( 'colorGridLinesYAxes' ) )
            // InternalMyDsl.g:4344:1: ( 'colorGridLinesYAxes' )
            {
            // InternalMyDsl.g:4344:1: ( 'colorGridLinesYAxes' )
            // InternalMyDsl.g:4345:2: 'colorGridLinesYAxes'
            {
             before(grammarAccess.getLineChartAccess().getColorGridLinesYAxesKeyword_7_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getColorGridLinesYAxesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_7__0__Impl"


    // $ANTLR start "rule__LineChart__Group_7__1"
    // InternalMyDsl.g:4354:1: rule__LineChart__Group_7__1 : rule__LineChart__Group_7__1__Impl ;
    public final void rule__LineChart__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4358:1: ( rule__LineChart__Group_7__1__Impl )
            // InternalMyDsl.g:4359:2: rule__LineChart__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_7__1"


    // $ANTLR start "rule__LineChart__Group_7__1__Impl"
    // InternalMyDsl.g:4365:1: rule__LineChart__Group_7__1__Impl : ( ( rule__LineChart__ColorGridLinesYAxesAssignment_7_1 ) ) ;
    public final void rule__LineChart__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4369:1: ( ( ( rule__LineChart__ColorGridLinesYAxesAssignment_7_1 ) ) )
            // InternalMyDsl.g:4370:1: ( ( rule__LineChart__ColorGridLinesYAxesAssignment_7_1 ) )
            {
            // InternalMyDsl.g:4370:1: ( ( rule__LineChart__ColorGridLinesYAxesAssignment_7_1 ) )
            // InternalMyDsl.g:4371:2: ( rule__LineChart__ColorGridLinesYAxesAssignment_7_1 )
            {
             before(grammarAccess.getLineChartAccess().getColorGridLinesYAxesAssignment_7_1()); 
            // InternalMyDsl.g:4372:2: ( rule__LineChart__ColorGridLinesYAxesAssignment_7_1 )
            // InternalMyDsl.g:4372:3: rule__LineChart__ColorGridLinesYAxesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__ColorGridLinesYAxesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getColorGridLinesYAxesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_7__1__Impl"


    // $ANTLR start "rule__LineChart__Group_14__0"
    // InternalMyDsl.g:4381:1: rule__LineChart__Group_14__0 : rule__LineChart__Group_14__0__Impl rule__LineChart__Group_14__1 ;
    public final void rule__LineChart__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4385:1: ( rule__LineChart__Group_14__0__Impl rule__LineChart__Group_14__1 )
            // InternalMyDsl.g:4386:2: rule__LineChart__Group_14__0__Impl rule__LineChart__Group_14__1
            {
            pushFollow(FOLLOW_8);
            rule__LineChart__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_14__0"


    // $ANTLR start "rule__LineChart__Group_14__0__Impl"
    // InternalMyDsl.g:4393:1: rule__LineChart__Group_14__0__Impl : ( RULE_COMA ) ;
    public final void rule__LineChart__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4397:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:4398:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:4398:1: ( RULE_COMA )
            // InternalMyDsl.g:4399:2: RULE_COMA
            {
             before(grammarAccess.getLineChartAccess().getCOMATerminalRuleCall_14_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getCOMATerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_14__0__Impl"


    // $ANTLR start "rule__LineChart__Group_14__1"
    // InternalMyDsl.g:4408:1: rule__LineChart__Group_14__1 : rule__LineChart__Group_14__1__Impl ;
    public final void rule__LineChart__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4412:1: ( rule__LineChart__Group_14__1__Impl )
            // InternalMyDsl.g:4413:2: rule__LineChart__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_14__1"


    // $ANTLR start "rule__LineChart__Group_14__1__Impl"
    // InternalMyDsl.g:4419:1: rule__LineChart__Group_14__1__Impl : ( ( rule__LineChart__DataAssignment_14_1 ) ) ;
    public final void rule__LineChart__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4423:1: ( ( ( rule__LineChart__DataAssignment_14_1 ) ) )
            // InternalMyDsl.g:4424:1: ( ( rule__LineChart__DataAssignment_14_1 ) )
            {
            // InternalMyDsl.g:4424:1: ( ( rule__LineChart__DataAssignment_14_1 ) )
            // InternalMyDsl.g:4425:2: ( rule__LineChart__DataAssignment_14_1 )
            {
             before(grammarAccess.getLineChartAccess().getDataAssignment_14_1()); 
            // InternalMyDsl.g:4426:2: ( rule__LineChart__DataAssignment_14_1 )
            // InternalMyDsl.g:4426:3: rule__LineChart__DataAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__DataAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getDataAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_14__1__Impl"


    // $ANTLR start "rule__LineChart__Group_20__0"
    // InternalMyDsl.g:4435:1: rule__LineChart__Group_20__0 : rule__LineChart__Group_20__0__Impl rule__LineChart__Group_20__1 ;
    public final void rule__LineChart__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4439:1: ( rule__LineChart__Group_20__0__Impl rule__LineChart__Group_20__1 )
            // InternalMyDsl.g:4440:2: rule__LineChart__Group_20__0__Impl rule__LineChart__Group_20__1
            {
            pushFollow(FOLLOW_8);
            rule__LineChart__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_20__0"


    // $ANTLR start "rule__LineChart__Group_20__0__Impl"
    // InternalMyDsl.g:4447:1: rule__LineChart__Group_20__0__Impl : ( RULE_COMA ) ;
    public final void rule__LineChart__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4451:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:4452:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:4452:1: ( RULE_COMA )
            // InternalMyDsl.g:4453:2: RULE_COMA
            {
             before(grammarAccess.getLineChartAccess().getCOMATerminalRuleCall_20_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getCOMATerminalRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_20__0__Impl"


    // $ANTLR start "rule__LineChart__Group_20__1"
    // InternalMyDsl.g:4462:1: rule__LineChart__Group_20__1 : rule__LineChart__Group_20__1__Impl ;
    public final void rule__LineChart__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4466:1: ( rule__LineChart__Group_20__1__Impl )
            // InternalMyDsl.g:4467:2: rule__LineChart__Group_20__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__Group_20__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_20__1"


    // $ANTLR start "rule__LineChart__Group_20__1__Impl"
    // InternalMyDsl.g:4473:1: rule__LineChart__Group_20__1__Impl : ( ( rule__LineChart__LabelsAssignment_20_1 ) ) ;
    public final void rule__LineChart__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4477:1: ( ( ( rule__LineChart__LabelsAssignment_20_1 ) ) )
            // InternalMyDsl.g:4478:1: ( ( rule__LineChart__LabelsAssignment_20_1 ) )
            {
            // InternalMyDsl.g:4478:1: ( ( rule__LineChart__LabelsAssignment_20_1 ) )
            // InternalMyDsl.g:4479:2: ( rule__LineChart__LabelsAssignment_20_1 )
            {
             before(grammarAccess.getLineChartAccess().getLabelsAssignment_20_1()); 
            // InternalMyDsl.g:4480:2: ( rule__LineChart__LabelsAssignment_20_1 )
            // InternalMyDsl.g:4480:3: rule__LineChart__LabelsAssignment_20_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__LabelsAssignment_20_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getLabelsAssignment_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group_20__1__Impl"


    // $ANTLR start "rule__BarChart__Group__0"
    // InternalMyDsl.g:4489:1: rule__BarChart__Group__0 : rule__BarChart__Group__0__Impl rule__BarChart__Group__1 ;
    public final void rule__BarChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4493:1: ( rule__BarChart__Group__0__Impl rule__BarChart__Group__1 )
            // InternalMyDsl.g:4494:2: rule__BarChart__Group__0__Impl rule__BarChart__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BarChart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__0"


    // $ANTLR start "rule__BarChart__Group__0__Impl"
    // InternalMyDsl.g:4501:1: rule__BarChart__Group__0__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__BarChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4505:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:4506:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:4506:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:4507:2: RULE_OBJECT_START
            {
             before(grammarAccess.getBarChartAccess().getOBJECT_STARTTerminalRuleCall_0()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getOBJECT_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__0__Impl"


    // $ANTLR start "rule__BarChart__Group__1"
    // InternalMyDsl.g:4516:1: rule__BarChart__Group__1 : rule__BarChart__Group__1__Impl rule__BarChart__Group__2 ;
    public final void rule__BarChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4520:1: ( rule__BarChart__Group__1__Impl rule__BarChart__Group__2 )
            // InternalMyDsl.g:4521:2: rule__BarChart__Group__1__Impl rule__BarChart__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__BarChart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__1"


    // $ANTLR start "rule__BarChart__Group__1__Impl"
    // InternalMyDsl.g:4528:1: rule__BarChart__Group__1__Impl : ( ( rule__BarChart__NameAssignment_1 ) ) ;
    public final void rule__BarChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4532:1: ( ( ( rule__BarChart__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4533:1: ( ( rule__BarChart__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4533:1: ( ( rule__BarChart__NameAssignment_1 ) )
            // InternalMyDsl.g:4534:2: ( rule__BarChart__NameAssignment_1 )
            {
             before(grammarAccess.getBarChartAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4535:2: ( rule__BarChart__NameAssignment_1 )
            // InternalMyDsl.g:4535:3: rule__BarChart__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__1__Impl"


    // $ANTLR start "rule__BarChart__Group__2"
    // InternalMyDsl.g:4543:1: rule__BarChart__Group__2 : rule__BarChart__Group__2__Impl rule__BarChart__Group__3 ;
    public final void rule__BarChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4547:1: ( rule__BarChart__Group__2__Impl rule__BarChart__Group__3 )
            // InternalMyDsl.g:4548:2: rule__BarChart__Group__2__Impl rule__BarChart__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__BarChart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__2"


    // $ANTLR start "rule__BarChart__Group__2__Impl"
    // InternalMyDsl.g:4555:1: rule__BarChart__Group__2__Impl : ( ( rule__BarChart__Group_2__0 ) ) ;
    public final void rule__BarChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4559:1: ( ( ( rule__BarChart__Group_2__0 ) ) )
            // InternalMyDsl.g:4560:1: ( ( rule__BarChart__Group_2__0 ) )
            {
            // InternalMyDsl.g:4560:1: ( ( rule__BarChart__Group_2__0 ) )
            // InternalMyDsl.g:4561:2: ( rule__BarChart__Group_2__0 )
            {
             before(grammarAccess.getBarChartAccess().getGroup_2()); 
            // InternalMyDsl.g:4562:2: ( rule__BarChart__Group_2__0 )
            // InternalMyDsl.g:4562:3: rule__BarChart__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__2__Impl"


    // $ANTLR start "rule__BarChart__Group__3"
    // InternalMyDsl.g:4570:1: rule__BarChart__Group__3 : rule__BarChart__Group__3__Impl rule__BarChart__Group__4 ;
    public final void rule__BarChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4574:1: ( rule__BarChart__Group__3__Impl rule__BarChart__Group__4 )
            // InternalMyDsl.g:4575:2: rule__BarChart__Group__3__Impl rule__BarChart__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__BarChart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__3"


    // $ANTLR start "rule__BarChart__Group__3__Impl"
    // InternalMyDsl.g:4582:1: rule__BarChart__Group__3__Impl : ( ( rule__BarChart__Group_3__0 )? ) ;
    public final void rule__BarChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4586:1: ( ( ( rule__BarChart__Group_3__0 )? ) )
            // InternalMyDsl.g:4587:1: ( ( rule__BarChart__Group_3__0 )? )
            {
            // InternalMyDsl.g:4587:1: ( ( rule__BarChart__Group_3__0 )? )
            // InternalMyDsl.g:4588:2: ( rule__BarChart__Group_3__0 )?
            {
             before(grammarAccess.getBarChartAccess().getGroup_3()); 
            // InternalMyDsl.g:4589:2: ( rule__BarChart__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==58) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:4589:3: rule__BarChart__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChart__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__3__Impl"


    // $ANTLR start "rule__BarChart__Group__4"
    // InternalMyDsl.g:4597:1: rule__BarChart__Group__4 : rule__BarChart__Group__4__Impl rule__BarChart__Group__5 ;
    public final void rule__BarChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4601:1: ( rule__BarChart__Group__4__Impl rule__BarChart__Group__5 )
            // InternalMyDsl.g:4602:2: rule__BarChart__Group__4__Impl rule__BarChart__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__BarChart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__4"


    // $ANTLR start "rule__BarChart__Group__4__Impl"
    // InternalMyDsl.g:4609:1: rule__BarChart__Group__4__Impl : ( ( rule__BarChart__Group_4__0 )? ) ;
    public final void rule__BarChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4613:1: ( ( ( rule__BarChart__Group_4__0 )? ) )
            // InternalMyDsl.g:4614:1: ( ( rule__BarChart__Group_4__0 )? )
            {
            // InternalMyDsl.g:4614:1: ( ( rule__BarChart__Group_4__0 )? )
            // InternalMyDsl.g:4615:2: ( rule__BarChart__Group_4__0 )?
            {
             before(grammarAccess.getBarChartAccess().getGroup_4()); 
            // InternalMyDsl.g:4616:2: ( rule__BarChart__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==59) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:4616:3: rule__BarChart__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChart__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__4__Impl"


    // $ANTLR start "rule__BarChart__Group__5"
    // InternalMyDsl.g:4624:1: rule__BarChart__Group__5 : rule__BarChart__Group__5__Impl rule__BarChart__Group__6 ;
    public final void rule__BarChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4628:1: ( rule__BarChart__Group__5__Impl rule__BarChart__Group__6 )
            // InternalMyDsl.g:4629:2: rule__BarChart__Group__5__Impl rule__BarChart__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__BarChart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__5"


    // $ANTLR start "rule__BarChart__Group__5__Impl"
    // InternalMyDsl.g:4636:1: rule__BarChart__Group__5__Impl : ( ( rule__BarChart__Group_5__0 )? ) ;
    public final void rule__BarChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4640:1: ( ( ( rule__BarChart__Group_5__0 )? ) )
            // InternalMyDsl.g:4641:1: ( ( rule__BarChart__Group_5__0 )? )
            {
            // InternalMyDsl.g:4641:1: ( ( rule__BarChart__Group_5__0 )? )
            // InternalMyDsl.g:4642:2: ( rule__BarChart__Group_5__0 )?
            {
             before(grammarAccess.getBarChartAccess().getGroup_5()); 
            // InternalMyDsl.g:4643:2: ( rule__BarChart__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==60) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:4643:3: rule__BarChart__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChart__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__5__Impl"


    // $ANTLR start "rule__BarChart__Group__6"
    // InternalMyDsl.g:4651:1: rule__BarChart__Group__6 : rule__BarChart__Group__6__Impl rule__BarChart__Group__7 ;
    public final void rule__BarChart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4655:1: ( rule__BarChart__Group__6__Impl rule__BarChart__Group__7 )
            // InternalMyDsl.g:4656:2: rule__BarChart__Group__6__Impl rule__BarChart__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__BarChart__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__6"


    // $ANTLR start "rule__BarChart__Group__6__Impl"
    // InternalMyDsl.g:4663:1: rule__BarChart__Group__6__Impl : ( ( rule__BarChart__Group_6__0 )? ) ;
    public final void rule__BarChart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4667:1: ( ( ( rule__BarChart__Group_6__0 )? ) )
            // InternalMyDsl.g:4668:1: ( ( rule__BarChart__Group_6__0 )? )
            {
            // InternalMyDsl.g:4668:1: ( ( rule__BarChart__Group_6__0 )? )
            // InternalMyDsl.g:4669:2: ( rule__BarChart__Group_6__0 )?
            {
             before(grammarAccess.getBarChartAccess().getGroup_6()); 
            // InternalMyDsl.g:4670:2: ( rule__BarChart__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==61) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:4670:3: rule__BarChart__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChart__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__6__Impl"


    // $ANTLR start "rule__BarChart__Group__7"
    // InternalMyDsl.g:4678:1: rule__BarChart__Group__7 : rule__BarChart__Group__7__Impl rule__BarChart__Group__8 ;
    public final void rule__BarChart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4682:1: ( rule__BarChart__Group__7__Impl rule__BarChart__Group__8 )
            // InternalMyDsl.g:4683:2: rule__BarChart__Group__7__Impl rule__BarChart__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__BarChart__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__7"


    // $ANTLR start "rule__BarChart__Group__7__Impl"
    // InternalMyDsl.g:4690:1: rule__BarChart__Group__7__Impl : ( ( rule__BarChart__Group_7__0 )? ) ;
    public final void rule__BarChart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4694:1: ( ( ( rule__BarChart__Group_7__0 )? ) )
            // InternalMyDsl.g:4695:1: ( ( rule__BarChart__Group_7__0 )? )
            {
            // InternalMyDsl.g:4695:1: ( ( rule__BarChart__Group_7__0 )? )
            // InternalMyDsl.g:4696:2: ( rule__BarChart__Group_7__0 )?
            {
             before(grammarAccess.getBarChartAccess().getGroup_7()); 
            // InternalMyDsl.g:4697:2: ( rule__BarChart__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==62) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:4697:3: rule__BarChart__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChart__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__7__Impl"


    // $ANTLR start "rule__BarChart__Group__8"
    // InternalMyDsl.g:4705:1: rule__BarChart__Group__8 : rule__BarChart__Group__8__Impl rule__BarChart__Group__9 ;
    public final void rule__BarChart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4709:1: ( rule__BarChart__Group__8__Impl rule__BarChart__Group__9 )
            // InternalMyDsl.g:4710:2: rule__BarChart__Group__8__Impl rule__BarChart__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__BarChart__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__8"


    // $ANTLR start "rule__BarChart__Group__8__Impl"
    // InternalMyDsl.g:4717:1: rule__BarChart__Group__8__Impl : ( ( rule__BarChart__Group_8__0 ) ) ;
    public final void rule__BarChart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4721:1: ( ( ( rule__BarChart__Group_8__0 ) ) )
            // InternalMyDsl.g:4722:1: ( ( rule__BarChart__Group_8__0 ) )
            {
            // InternalMyDsl.g:4722:1: ( ( rule__BarChart__Group_8__0 ) )
            // InternalMyDsl.g:4723:2: ( rule__BarChart__Group_8__0 )
            {
             before(grammarAccess.getBarChartAccess().getGroup_8()); 
            // InternalMyDsl.g:4724:2: ( rule__BarChart__Group_8__0 )
            // InternalMyDsl.g:4724:3: rule__BarChart__Group_8__0
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__8__Impl"


    // $ANTLR start "rule__BarChart__Group__9"
    // InternalMyDsl.g:4732:1: rule__BarChart__Group__9 : rule__BarChart__Group__9__Impl rule__BarChart__Group__10 ;
    public final void rule__BarChart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4736:1: ( rule__BarChart__Group__9__Impl rule__BarChart__Group__10 )
            // InternalMyDsl.g:4737:2: rule__BarChart__Group__9__Impl rule__BarChart__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__BarChart__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__9"


    // $ANTLR start "rule__BarChart__Group__9__Impl"
    // InternalMyDsl.g:4744:1: rule__BarChart__Group__9__Impl : ( ( rule__BarChart__DisplayGridLinesXAxesAssignment_9 )? ) ;
    public final void rule__BarChart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4748:1: ( ( ( rule__BarChart__DisplayGridLinesXAxesAssignment_9 )? ) )
            // InternalMyDsl.g:4749:1: ( ( rule__BarChart__DisplayGridLinesXAxesAssignment_9 )? )
            {
            // InternalMyDsl.g:4749:1: ( ( rule__BarChart__DisplayGridLinesXAxesAssignment_9 )? )
            // InternalMyDsl.g:4750:2: ( rule__BarChart__DisplayGridLinesXAxesAssignment_9 )?
            {
             before(grammarAccess.getBarChartAccess().getDisplayGridLinesXAxesAssignment_9()); 
            // InternalMyDsl.g:4751:2: ( rule__BarChart__DisplayGridLinesXAxesAssignment_9 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==83) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:4751:3: rule__BarChart__DisplayGridLinesXAxesAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChart__DisplayGridLinesXAxesAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartAccess().getDisplayGridLinesXAxesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__9__Impl"


    // $ANTLR start "rule__BarChart__Group__10"
    // InternalMyDsl.g:4759:1: rule__BarChart__Group__10 : rule__BarChart__Group__10__Impl rule__BarChart__Group__11 ;
    public final void rule__BarChart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4763:1: ( rule__BarChart__Group__10__Impl rule__BarChart__Group__11 )
            // InternalMyDsl.g:4764:2: rule__BarChart__Group__10__Impl rule__BarChart__Group__11
            {
            pushFollow(FOLLOW_25);
            rule__BarChart__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__10"


    // $ANTLR start "rule__BarChart__Group__10__Impl"
    // InternalMyDsl.g:4771:1: rule__BarChart__Group__10__Impl : ( ( rule__BarChart__DisplayGridLinesYAxesAssignment_10 )? ) ;
    public final void rule__BarChart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4775:1: ( ( ( rule__BarChart__DisplayGridLinesYAxesAssignment_10 )? ) )
            // InternalMyDsl.g:4776:1: ( ( rule__BarChart__DisplayGridLinesYAxesAssignment_10 )? )
            {
            // InternalMyDsl.g:4776:1: ( ( rule__BarChart__DisplayGridLinesYAxesAssignment_10 )? )
            // InternalMyDsl.g:4777:2: ( rule__BarChart__DisplayGridLinesYAxesAssignment_10 )?
            {
             before(grammarAccess.getBarChartAccess().getDisplayGridLinesYAxesAssignment_10()); 
            // InternalMyDsl.g:4778:2: ( rule__BarChart__DisplayGridLinesYAxesAssignment_10 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==84) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:4778:3: rule__BarChart__DisplayGridLinesYAxesAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarChart__DisplayGridLinesYAxesAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarChartAccess().getDisplayGridLinesYAxesAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__10__Impl"


    // $ANTLR start "rule__BarChart__Group__11"
    // InternalMyDsl.g:4786:1: rule__BarChart__Group__11 : rule__BarChart__Group__11__Impl rule__BarChart__Group__12 ;
    public final void rule__BarChart__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4790:1: ( rule__BarChart__Group__11__Impl rule__BarChart__Group__12 )
            // InternalMyDsl.g:4791:2: rule__BarChart__Group__11__Impl rule__BarChart__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__BarChart__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__11"


    // $ANTLR start "rule__BarChart__Group__11__Impl"
    // InternalMyDsl.g:4798:1: rule__BarChart__Group__11__Impl : ( 'data' ) ;
    public final void rule__BarChart__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4802:1: ( ( 'data' ) )
            // InternalMyDsl.g:4803:1: ( 'data' )
            {
            // InternalMyDsl.g:4803:1: ( 'data' )
            // InternalMyDsl.g:4804:2: 'data'
            {
             before(grammarAccess.getBarChartAccess().getDataKeyword_11()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getDataKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__11__Impl"


    // $ANTLR start "rule__BarChart__Group__12"
    // InternalMyDsl.g:4813:1: rule__BarChart__Group__12 : rule__BarChart__Group__12__Impl rule__BarChart__Group__13 ;
    public final void rule__BarChart__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4817:1: ( rule__BarChart__Group__12__Impl rule__BarChart__Group__13 )
            // InternalMyDsl.g:4818:2: rule__BarChart__Group__12__Impl rule__BarChart__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__BarChart__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__12"


    // $ANTLR start "rule__BarChart__Group__12__Impl"
    // InternalMyDsl.g:4825:1: rule__BarChart__Group__12__Impl : ( RULE_EQUALS ) ;
    public final void rule__BarChart__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4829:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:4830:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:4830:1: ( RULE_EQUALS )
            // InternalMyDsl.g:4831:2: RULE_EQUALS
            {
             before(grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_12()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__12__Impl"


    // $ANTLR start "rule__BarChart__Group__13"
    // InternalMyDsl.g:4840:1: rule__BarChart__Group__13 : rule__BarChart__Group__13__Impl rule__BarChart__Group__14 ;
    public final void rule__BarChart__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4844:1: ( rule__BarChart__Group__13__Impl rule__BarChart__Group__14 )
            // InternalMyDsl.g:4845:2: rule__BarChart__Group__13__Impl rule__BarChart__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__BarChart__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__13"


    // $ANTLR start "rule__BarChart__Group__13__Impl"
    // InternalMyDsl.g:4852:1: rule__BarChart__Group__13__Impl : ( RULE_LIST_START ) ;
    public final void rule__BarChart__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4856:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:4857:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:4857:1: ( RULE_LIST_START )
            // InternalMyDsl.g:4858:2: RULE_LIST_START
            {
             before(grammarAccess.getBarChartAccess().getLIST_STARTTerminalRuleCall_13()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getLIST_STARTTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__13__Impl"


    // $ANTLR start "rule__BarChart__Group__14"
    // InternalMyDsl.g:4867:1: rule__BarChart__Group__14 : rule__BarChart__Group__14__Impl rule__BarChart__Group__15 ;
    public final void rule__BarChart__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4871:1: ( rule__BarChart__Group__14__Impl rule__BarChart__Group__15 )
            // InternalMyDsl.g:4872:2: rule__BarChart__Group__14__Impl rule__BarChart__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__BarChart__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__14"


    // $ANTLR start "rule__BarChart__Group__14__Impl"
    // InternalMyDsl.g:4879:1: rule__BarChart__Group__14__Impl : ( ( rule__BarChart__DataAssignment_14 ) ) ;
    public final void rule__BarChart__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4883:1: ( ( ( rule__BarChart__DataAssignment_14 ) ) )
            // InternalMyDsl.g:4884:1: ( ( rule__BarChart__DataAssignment_14 ) )
            {
            // InternalMyDsl.g:4884:1: ( ( rule__BarChart__DataAssignment_14 ) )
            // InternalMyDsl.g:4885:2: ( rule__BarChart__DataAssignment_14 )
            {
             before(grammarAccess.getBarChartAccess().getDataAssignment_14()); 
            // InternalMyDsl.g:4886:2: ( rule__BarChart__DataAssignment_14 )
            // InternalMyDsl.g:4886:3: rule__BarChart__DataAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__DataAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getDataAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__14__Impl"


    // $ANTLR start "rule__BarChart__Group__15"
    // InternalMyDsl.g:4894:1: rule__BarChart__Group__15 : rule__BarChart__Group__15__Impl rule__BarChart__Group__16 ;
    public final void rule__BarChart__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4898:1: ( rule__BarChart__Group__15__Impl rule__BarChart__Group__16 )
            // InternalMyDsl.g:4899:2: rule__BarChart__Group__15__Impl rule__BarChart__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__BarChart__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__15"


    // $ANTLR start "rule__BarChart__Group__15__Impl"
    // InternalMyDsl.g:4906:1: rule__BarChart__Group__15__Impl : ( ( rule__BarChart__Group_15__0 )* ) ;
    public final void rule__BarChart__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4910:1: ( ( ( rule__BarChart__Group_15__0 )* ) )
            // InternalMyDsl.g:4911:1: ( ( rule__BarChart__Group_15__0 )* )
            {
            // InternalMyDsl.g:4911:1: ( ( rule__BarChart__Group_15__0 )* )
            // InternalMyDsl.g:4912:2: ( rule__BarChart__Group_15__0 )*
            {
             before(grammarAccess.getBarChartAccess().getGroup_15()); 
            // InternalMyDsl.g:4913:2: ( rule__BarChart__Group_15__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_COMA) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMyDsl.g:4913:3: rule__BarChart__Group_15__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__BarChart__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getBarChartAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__15__Impl"


    // $ANTLR start "rule__BarChart__Group__16"
    // InternalMyDsl.g:4921:1: rule__BarChart__Group__16 : rule__BarChart__Group__16__Impl rule__BarChart__Group__17 ;
    public final void rule__BarChart__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4925:1: ( rule__BarChart__Group__16__Impl rule__BarChart__Group__17 )
            // InternalMyDsl.g:4926:2: rule__BarChart__Group__16__Impl rule__BarChart__Group__17
            {
            pushFollow(FOLLOW_22);
            rule__BarChart__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__16"


    // $ANTLR start "rule__BarChart__Group__16__Impl"
    // InternalMyDsl.g:4933:1: rule__BarChart__Group__16__Impl : ( RULE_LIST_END ) ;
    public final void rule__BarChart__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4937:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:4938:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:4938:1: ( RULE_LIST_END )
            // InternalMyDsl.g:4939:2: RULE_LIST_END
            {
             before(grammarAccess.getBarChartAccess().getLIST_ENDTerminalRuleCall_16()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getLIST_ENDTerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__16__Impl"


    // $ANTLR start "rule__BarChart__Group__17"
    // InternalMyDsl.g:4948:1: rule__BarChart__Group__17 : rule__BarChart__Group__17__Impl rule__BarChart__Group__18 ;
    public final void rule__BarChart__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4952:1: ( rule__BarChart__Group__17__Impl rule__BarChart__Group__18 )
            // InternalMyDsl.g:4953:2: rule__BarChart__Group__17__Impl rule__BarChart__Group__18
            {
            pushFollow(FOLLOW_6);
            rule__BarChart__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__17"


    // $ANTLR start "rule__BarChart__Group__17__Impl"
    // InternalMyDsl.g:4960:1: rule__BarChart__Group__17__Impl : ( 'labels' ) ;
    public final void rule__BarChart__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4964:1: ( ( 'labels' ) )
            // InternalMyDsl.g:4965:1: ( 'labels' )
            {
            // InternalMyDsl.g:4965:1: ( 'labels' )
            // InternalMyDsl.g:4966:2: 'labels'
            {
             before(grammarAccess.getBarChartAccess().getLabelsKeyword_17()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getLabelsKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__17__Impl"


    // $ANTLR start "rule__BarChart__Group__18"
    // InternalMyDsl.g:4975:1: rule__BarChart__Group__18 : rule__BarChart__Group__18__Impl rule__BarChart__Group__19 ;
    public final void rule__BarChart__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4979:1: ( rule__BarChart__Group__18__Impl rule__BarChart__Group__19 )
            // InternalMyDsl.g:4980:2: rule__BarChart__Group__18__Impl rule__BarChart__Group__19
            {
            pushFollow(FOLLOW_7);
            rule__BarChart__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__18"


    // $ANTLR start "rule__BarChart__Group__18__Impl"
    // InternalMyDsl.g:4987:1: rule__BarChart__Group__18__Impl : ( RULE_EQUALS ) ;
    public final void rule__BarChart__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4991:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:4992:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:4992:1: ( RULE_EQUALS )
            // InternalMyDsl.g:4993:2: RULE_EQUALS
            {
             before(grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_18()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getEQUALSTerminalRuleCall_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__18__Impl"


    // $ANTLR start "rule__BarChart__Group__19"
    // InternalMyDsl.g:5002:1: rule__BarChart__Group__19 : rule__BarChart__Group__19__Impl rule__BarChart__Group__20 ;
    public final void rule__BarChart__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5006:1: ( rule__BarChart__Group__19__Impl rule__BarChart__Group__20 )
            // InternalMyDsl.g:5007:2: rule__BarChart__Group__19__Impl rule__BarChart__Group__20
            {
            pushFollow(FOLLOW_8);
            rule__BarChart__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__19"


    // $ANTLR start "rule__BarChart__Group__19__Impl"
    // InternalMyDsl.g:5014:1: rule__BarChart__Group__19__Impl : ( RULE_LIST_START ) ;
    public final void rule__BarChart__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5018:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:5019:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:5019:1: ( RULE_LIST_START )
            // InternalMyDsl.g:5020:2: RULE_LIST_START
            {
             before(grammarAccess.getBarChartAccess().getLIST_STARTTerminalRuleCall_19()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getLIST_STARTTerminalRuleCall_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__19__Impl"


    // $ANTLR start "rule__BarChart__Group__20"
    // InternalMyDsl.g:5029:1: rule__BarChart__Group__20 : rule__BarChart__Group__20__Impl rule__BarChart__Group__21 ;
    public final void rule__BarChart__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5033:1: ( rule__BarChart__Group__20__Impl rule__BarChart__Group__21 )
            // InternalMyDsl.g:5034:2: rule__BarChart__Group__20__Impl rule__BarChart__Group__21
            {
            pushFollow(FOLLOW_9);
            rule__BarChart__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__20"


    // $ANTLR start "rule__BarChart__Group__20__Impl"
    // InternalMyDsl.g:5041:1: rule__BarChart__Group__20__Impl : ( ( rule__BarChart__LabelsAssignment_20 ) ) ;
    public final void rule__BarChart__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5045:1: ( ( ( rule__BarChart__LabelsAssignment_20 ) ) )
            // InternalMyDsl.g:5046:1: ( ( rule__BarChart__LabelsAssignment_20 ) )
            {
            // InternalMyDsl.g:5046:1: ( ( rule__BarChart__LabelsAssignment_20 ) )
            // InternalMyDsl.g:5047:2: ( rule__BarChart__LabelsAssignment_20 )
            {
             before(grammarAccess.getBarChartAccess().getLabelsAssignment_20()); 
            // InternalMyDsl.g:5048:2: ( rule__BarChart__LabelsAssignment_20 )
            // InternalMyDsl.g:5048:3: rule__BarChart__LabelsAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__LabelsAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getLabelsAssignment_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__20__Impl"


    // $ANTLR start "rule__BarChart__Group__21"
    // InternalMyDsl.g:5056:1: rule__BarChart__Group__21 : rule__BarChart__Group__21__Impl rule__BarChart__Group__22 ;
    public final void rule__BarChart__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5060:1: ( rule__BarChart__Group__21__Impl rule__BarChart__Group__22 )
            // InternalMyDsl.g:5061:2: rule__BarChart__Group__21__Impl rule__BarChart__Group__22
            {
            pushFollow(FOLLOW_9);
            rule__BarChart__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__21"


    // $ANTLR start "rule__BarChart__Group__21__Impl"
    // InternalMyDsl.g:5068:1: rule__BarChart__Group__21__Impl : ( ( rule__BarChart__Group_21__0 )* ) ;
    public final void rule__BarChart__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5072:1: ( ( ( rule__BarChart__Group_21__0 )* ) )
            // InternalMyDsl.g:5073:1: ( ( rule__BarChart__Group_21__0 )* )
            {
            // InternalMyDsl.g:5073:1: ( ( rule__BarChart__Group_21__0 )* )
            // InternalMyDsl.g:5074:2: ( rule__BarChart__Group_21__0 )*
            {
             before(grammarAccess.getBarChartAccess().getGroup_21()); 
            // InternalMyDsl.g:5075:2: ( rule__BarChart__Group_21__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_COMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:5075:3: rule__BarChart__Group_21__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__BarChart__Group_21__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getBarChartAccess().getGroup_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__21__Impl"


    // $ANTLR start "rule__BarChart__Group__22"
    // InternalMyDsl.g:5083:1: rule__BarChart__Group__22 : rule__BarChart__Group__22__Impl rule__BarChart__Group__23 ;
    public final void rule__BarChart__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5087:1: ( rule__BarChart__Group__22__Impl rule__BarChart__Group__23 )
            // InternalMyDsl.g:5088:2: rule__BarChart__Group__22__Impl rule__BarChart__Group__23
            {
            pushFollow(FOLLOW_12);
            rule__BarChart__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__22"


    // $ANTLR start "rule__BarChart__Group__22__Impl"
    // InternalMyDsl.g:5095:1: rule__BarChart__Group__22__Impl : ( RULE_LIST_END ) ;
    public final void rule__BarChart__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5099:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:5100:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:5100:1: ( RULE_LIST_END )
            // InternalMyDsl.g:5101:2: RULE_LIST_END
            {
             before(grammarAccess.getBarChartAccess().getLIST_ENDTerminalRuleCall_22()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getLIST_ENDTerminalRuleCall_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__22__Impl"


    // $ANTLR start "rule__BarChart__Group__23"
    // InternalMyDsl.g:5110:1: rule__BarChart__Group__23 : rule__BarChart__Group__23__Impl ;
    public final void rule__BarChart__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5114:1: ( rule__BarChart__Group__23__Impl )
            // InternalMyDsl.g:5115:2: rule__BarChart__Group__23__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group__23__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__23"


    // $ANTLR start "rule__BarChart__Group__23__Impl"
    // InternalMyDsl.g:5121:1: rule__BarChart__Group__23__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__BarChart__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5125:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:5126:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:5126:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:5127:2: RULE_OBJECT_END
            {
             before(grammarAccess.getBarChartAccess().getOBJECT_ENDTerminalRuleCall_23()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getOBJECT_ENDTerminalRuleCall_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__23__Impl"


    // $ANTLR start "rule__BarChart__Group_2__0"
    // InternalMyDsl.g:5137:1: rule__BarChart__Group_2__0 : rule__BarChart__Group_2__0__Impl rule__BarChart__Group_2__1 ;
    public final void rule__BarChart__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5141:1: ( rule__BarChart__Group_2__0__Impl rule__BarChart__Group_2__1 )
            // InternalMyDsl.g:5142:2: rule__BarChart__Group_2__0__Impl rule__BarChart__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__BarChart__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_2__0"


    // $ANTLR start "rule__BarChart__Group_2__0__Impl"
    // InternalMyDsl.g:5149:1: rule__BarChart__Group_2__0__Impl : ( 'title' ) ;
    public final void rule__BarChart__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5153:1: ( ( 'title' ) )
            // InternalMyDsl.g:5154:1: ( 'title' )
            {
            // InternalMyDsl.g:5154:1: ( 'title' )
            // InternalMyDsl.g:5155:2: 'title'
            {
             before(grammarAccess.getBarChartAccess().getTitleKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getTitleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_2__0__Impl"


    // $ANTLR start "rule__BarChart__Group_2__1"
    // InternalMyDsl.g:5164:1: rule__BarChart__Group_2__1 : rule__BarChart__Group_2__1__Impl ;
    public final void rule__BarChart__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5168:1: ( rule__BarChart__Group_2__1__Impl )
            // InternalMyDsl.g:5169:2: rule__BarChart__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_2__1"


    // $ANTLR start "rule__BarChart__Group_2__1__Impl"
    // InternalMyDsl.g:5175:1: rule__BarChart__Group_2__1__Impl : ( ( rule__BarChart__TitleAssignment_2_1 ) ) ;
    public final void rule__BarChart__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5179:1: ( ( ( rule__BarChart__TitleAssignment_2_1 ) ) )
            // InternalMyDsl.g:5180:1: ( ( rule__BarChart__TitleAssignment_2_1 ) )
            {
            // InternalMyDsl.g:5180:1: ( ( rule__BarChart__TitleAssignment_2_1 ) )
            // InternalMyDsl.g:5181:2: ( rule__BarChart__TitleAssignment_2_1 )
            {
             before(grammarAccess.getBarChartAccess().getTitleAssignment_2_1()); 
            // InternalMyDsl.g:5182:2: ( rule__BarChart__TitleAssignment_2_1 )
            // InternalMyDsl.g:5182:3: rule__BarChart__TitleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__TitleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getTitleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_2__1__Impl"


    // $ANTLR start "rule__BarChart__Group_3__0"
    // InternalMyDsl.g:5191:1: rule__BarChart__Group_3__0 : rule__BarChart__Group_3__0__Impl rule__BarChart__Group_3__1 ;
    public final void rule__BarChart__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5195:1: ( rule__BarChart__Group_3__0__Impl rule__BarChart__Group_3__1 )
            // InternalMyDsl.g:5196:2: rule__BarChart__Group_3__0__Impl rule__BarChart__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__BarChart__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_3__0"


    // $ANTLR start "rule__BarChart__Group_3__0__Impl"
    // InternalMyDsl.g:5203:1: rule__BarChart__Group_3__0__Impl : ( 'legendPosition' ) ;
    public final void rule__BarChart__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5207:1: ( ( 'legendPosition' ) )
            // InternalMyDsl.g:5208:1: ( 'legendPosition' )
            {
            // InternalMyDsl.g:5208:1: ( 'legendPosition' )
            // InternalMyDsl.g:5209:2: 'legendPosition'
            {
             before(grammarAccess.getBarChartAccess().getLegendPositionKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getLegendPositionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_3__0__Impl"


    // $ANTLR start "rule__BarChart__Group_3__1"
    // InternalMyDsl.g:5218:1: rule__BarChart__Group_3__1 : rule__BarChart__Group_3__1__Impl ;
    public final void rule__BarChart__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5222:1: ( rule__BarChart__Group_3__1__Impl )
            // InternalMyDsl.g:5223:2: rule__BarChart__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_3__1"


    // $ANTLR start "rule__BarChart__Group_3__1__Impl"
    // InternalMyDsl.g:5229:1: rule__BarChart__Group_3__1__Impl : ( ( rule__BarChart__LegendPositionAssignment_3_1 ) ) ;
    public final void rule__BarChart__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5233:1: ( ( ( rule__BarChart__LegendPositionAssignment_3_1 ) ) )
            // InternalMyDsl.g:5234:1: ( ( rule__BarChart__LegendPositionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:5234:1: ( ( rule__BarChart__LegendPositionAssignment_3_1 ) )
            // InternalMyDsl.g:5235:2: ( rule__BarChart__LegendPositionAssignment_3_1 )
            {
             before(grammarAccess.getBarChartAccess().getLegendPositionAssignment_3_1()); 
            // InternalMyDsl.g:5236:2: ( rule__BarChart__LegendPositionAssignment_3_1 )
            // InternalMyDsl.g:5236:3: rule__BarChart__LegendPositionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__LegendPositionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getLegendPositionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_3__1__Impl"


    // $ANTLR start "rule__BarChart__Group_4__0"
    // InternalMyDsl.g:5245:1: rule__BarChart__Group_4__0 : rule__BarChart__Group_4__0__Impl rule__BarChart__Group_4__1 ;
    public final void rule__BarChart__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5249:1: ( rule__BarChart__Group_4__0__Impl rule__BarChart__Group_4__1 )
            // InternalMyDsl.g:5250:2: rule__BarChart__Group_4__0__Impl rule__BarChart__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__BarChart__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_4__0"


    // $ANTLR start "rule__BarChart__Group_4__0__Impl"
    // InternalMyDsl.g:5257:1: rule__BarChart__Group_4__0__Impl : ( 'labelStringXAxes' ) ;
    public final void rule__BarChart__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5261:1: ( ( 'labelStringXAxes' ) )
            // InternalMyDsl.g:5262:1: ( 'labelStringXAxes' )
            {
            // InternalMyDsl.g:5262:1: ( 'labelStringXAxes' )
            // InternalMyDsl.g:5263:2: 'labelStringXAxes'
            {
             before(grammarAccess.getBarChartAccess().getLabelStringXAxesKeyword_4_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getLabelStringXAxesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_4__0__Impl"


    // $ANTLR start "rule__BarChart__Group_4__1"
    // InternalMyDsl.g:5272:1: rule__BarChart__Group_4__1 : rule__BarChart__Group_4__1__Impl ;
    public final void rule__BarChart__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5276:1: ( rule__BarChart__Group_4__1__Impl )
            // InternalMyDsl.g:5277:2: rule__BarChart__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_4__1"


    // $ANTLR start "rule__BarChart__Group_4__1__Impl"
    // InternalMyDsl.g:5283:1: rule__BarChart__Group_4__1__Impl : ( ( rule__BarChart__LabelStringXAxesAssignment_4_1 ) ) ;
    public final void rule__BarChart__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5287:1: ( ( ( rule__BarChart__LabelStringXAxesAssignment_4_1 ) ) )
            // InternalMyDsl.g:5288:1: ( ( rule__BarChart__LabelStringXAxesAssignment_4_1 ) )
            {
            // InternalMyDsl.g:5288:1: ( ( rule__BarChart__LabelStringXAxesAssignment_4_1 ) )
            // InternalMyDsl.g:5289:2: ( rule__BarChart__LabelStringXAxesAssignment_4_1 )
            {
             before(grammarAccess.getBarChartAccess().getLabelStringXAxesAssignment_4_1()); 
            // InternalMyDsl.g:5290:2: ( rule__BarChart__LabelStringXAxesAssignment_4_1 )
            // InternalMyDsl.g:5290:3: rule__BarChart__LabelStringXAxesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__LabelStringXAxesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getLabelStringXAxesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_4__1__Impl"


    // $ANTLR start "rule__BarChart__Group_5__0"
    // InternalMyDsl.g:5299:1: rule__BarChart__Group_5__0 : rule__BarChart__Group_5__0__Impl rule__BarChart__Group_5__1 ;
    public final void rule__BarChart__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5303:1: ( rule__BarChart__Group_5__0__Impl rule__BarChart__Group_5__1 )
            // InternalMyDsl.g:5304:2: rule__BarChart__Group_5__0__Impl rule__BarChart__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__BarChart__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_5__0"


    // $ANTLR start "rule__BarChart__Group_5__0__Impl"
    // InternalMyDsl.g:5311:1: rule__BarChart__Group_5__0__Impl : ( 'colorGridLinesXAxes' ) ;
    public final void rule__BarChart__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5315:1: ( ( 'colorGridLinesXAxes' ) )
            // InternalMyDsl.g:5316:1: ( 'colorGridLinesXAxes' )
            {
            // InternalMyDsl.g:5316:1: ( 'colorGridLinesXAxes' )
            // InternalMyDsl.g:5317:2: 'colorGridLinesXAxes'
            {
             before(grammarAccess.getBarChartAccess().getColorGridLinesXAxesKeyword_5_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getColorGridLinesXAxesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_5__0__Impl"


    // $ANTLR start "rule__BarChart__Group_5__1"
    // InternalMyDsl.g:5326:1: rule__BarChart__Group_5__1 : rule__BarChart__Group_5__1__Impl ;
    public final void rule__BarChart__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5330:1: ( rule__BarChart__Group_5__1__Impl )
            // InternalMyDsl.g:5331:2: rule__BarChart__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_5__1"


    // $ANTLR start "rule__BarChart__Group_5__1__Impl"
    // InternalMyDsl.g:5337:1: rule__BarChart__Group_5__1__Impl : ( ( rule__BarChart__ColorGridLinesXAxesAssignment_5_1 ) ) ;
    public final void rule__BarChart__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5341:1: ( ( ( rule__BarChart__ColorGridLinesXAxesAssignment_5_1 ) ) )
            // InternalMyDsl.g:5342:1: ( ( rule__BarChart__ColorGridLinesXAxesAssignment_5_1 ) )
            {
            // InternalMyDsl.g:5342:1: ( ( rule__BarChart__ColorGridLinesXAxesAssignment_5_1 ) )
            // InternalMyDsl.g:5343:2: ( rule__BarChart__ColorGridLinesXAxesAssignment_5_1 )
            {
             before(grammarAccess.getBarChartAccess().getColorGridLinesXAxesAssignment_5_1()); 
            // InternalMyDsl.g:5344:2: ( rule__BarChart__ColorGridLinesXAxesAssignment_5_1 )
            // InternalMyDsl.g:5344:3: rule__BarChart__ColorGridLinesXAxesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__ColorGridLinesXAxesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getColorGridLinesXAxesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_5__1__Impl"


    // $ANTLR start "rule__BarChart__Group_6__0"
    // InternalMyDsl.g:5353:1: rule__BarChart__Group_6__0 : rule__BarChart__Group_6__0__Impl rule__BarChart__Group_6__1 ;
    public final void rule__BarChart__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5357:1: ( rule__BarChart__Group_6__0__Impl rule__BarChart__Group_6__1 )
            // InternalMyDsl.g:5358:2: rule__BarChart__Group_6__0__Impl rule__BarChart__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__BarChart__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_6__0"


    // $ANTLR start "rule__BarChart__Group_6__0__Impl"
    // InternalMyDsl.g:5365:1: rule__BarChart__Group_6__0__Impl : ( 'labelStringYAxes' ) ;
    public final void rule__BarChart__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5369:1: ( ( 'labelStringYAxes' ) )
            // InternalMyDsl.g:5370:1: ( 'labelStringYAxes' )
            {
            // InternalMyDsl.g:5370:1: ( 'labelStringYAxes' )
            // InternalMyDsl.g:5371:2: 'labelStringYAxes'
            {
             before(grammarAccess.getBarChartAccess().getLabelStringYAxesKeyword_6_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getLabelStringYAxesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_6__0__Impl"


    // $ANTLR start "rule__BarChart__Group_6__1"
    // InternalMyDsl.g:5380:1: rule__BarChart__Group_6__1 : rule__BarChart__Group_6__1__Impl ;
    public final void rule__BarChart__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5384:1: ( rule__BarChart__Group_6__1__Impl )
            // InternalMyDsl.g:5385:2: rule__BarChart__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_6__1"


    // $ANTLR start "rule__BarChart__Group_6__1__Impl"
    // InternalMyDsl.g:5391:1: rule__BarChart__Group_6__1__Impl : ( ( rule__BarChart__LabelStringYAxesAssignment_6_1 ) ) ;
    public final void rule__BarChart__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5395:1: ( ( ( rule__BarChart__LabelStringYAxesAssignment_6_1 ) ) )
            // InternalMyDsl.g:5396:1: ( ( rule__BarChart__LabelStringYAxesAssignment_6_1 ) )
            {
            // InternalMyDsl.g:5396:1: ( ( rule__BarChart__LabelStringYAxesAssignment_6_1 ) )
            // InternalMyDsl.g:5397:2: ( rule__BarChart__LabelStringYAxesAssignment_6_1 )
            {
             before(grammarAccess.getBarChartAccess().getLabelStringYAxesAssignment_6_1()); 
            // InternalMyDsl.g:5398:2: ( rule__BarChart__LabelStringYAxesAssignment_6_1 )
            // InternalMyDsl.g:5398:3: rule__BarChart__LabelStringYAxesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__LabelStringYAxesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getLabelStringYAxesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_6__1__Impl"


    // $ANTLR start "rule__BarChart__Group_7__0"
    // InternalMyDsl.g:5407:1: rule__BarChart__Group_7__0 : rule__BarChart__Group_7__0__Impl rule__BarChart__Group_7__1 ;
    public final void rule__BarChart__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5411:1: ( rule__BarChart__Group_7__0__Impl rule__BarChart__Group_7__1 )
            // InternalMyDsl.g:5412:2: rule__BarChart__Group_7__0__Impl rule__BarChart__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__BarChart__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_7__0"


    // $ANTLR start "rule__BarChart__Group_7__0__Impl"
    // InternalMyDsl.g:5419:1: rule__BarChart__Group_7__0__Impl : ( 'colorGridLinesYAxes' ) ;
    public final void rule__BarChart__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5423:1: ( ( 'colorGridLinesYAxes' ) )
            // InternalMyDsl.g:5424:1: ( 'colorGridLinesYAxes' )
            {
            // InternalMyDsl.g:5424:1: ( 'colorGridLinesYAxes' )
            // InternalMyDsl.g:5425:2: 'colorGridLinesYAxes'
            {
             before(grammarAccess.getBarChartAccess().getColorGridLinesYAxesKeyword_7_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getColorGridLinesYAxesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_7__0__Impl"


    // $ANTLR start "rule__BarChart__Group_7__1"
    // InternalMyDsl.g:5434:1: rule__BarChart__Group_7__1 : rule__BarChart__Group_7__1__Impl ;
    public final void rule__BarChart__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5438:1: ( rule__BarChart__Group_7__1__Impl )
            // InternalMyDsl.g:5439:2: rule__BarChart__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_7__1"


    // $ANTLR start "rule__BarChart__Group_7__1__Impl"
    // InternalMyDsl.g:5445:1: rule__BarChart__Group_7__1__Impl : ( ( rule__BarChart__ColorGridLinesYAxesAssignment_7_1 ) ) ;
    public final void rule__BarChart__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5449:1: ( ( ( rule__BarChart__ColorGridLinesYAxesAssignment_7_1 ) ) )
            // InternalMyDsl.g:5450:1: ( ( rule__BarChart__ColorGridLinesYAxesAssignment_7_1 ) )
            {
            // InternalMyDsl.g:5450:1: ( ( rule__BarChart__ColorGridLinesYAxesAssignment_7_1 ) )
            // InternalMyDsl.g:5451:2: ( rule__BarChart__ColorGridLinesYAxesAssignment_7_1 )
            {
             before(grammarAccess.getBarChartAccess().getColorGridLinesYAxesAssignment_7_1()); 
            // InternalMyDsl.g:5452:2: ( rule__BarChart__ColorGridLinesYAxesAssignment_7_1 )
            // InternalMyDsl.g:5452:3: rule__BarChart__ColorGridLinesYAxesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__ColorGridLinesYAxesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getColorGridLinesYAxesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_7__1__Impl"


    // $ANTLR start "rule__BarChart__Group_8__0"
    // InternalMyDsl.g:5461:1: rule__BarChart__Group_8__0 : rule__BarChart__Group_8__0__Impl rule__BarChart__Group_8__1 ;
    public final void rule__BarChart__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5465:1: ( rule__BarChart__Group_8__0__Impl rule__BarChart__Group_8__1 )
            // InternalMyDsl.g:5466:2: rule__BarChart__Group_8__0__Impl rule__BarChart__Group_8__1
            {
            pushFollow(FOLLOW_26);
            rule__BarChart__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_8__0"


    // $ANTLR start "rule__BarChart__Group_8__0__Impl"
    // InternalMyDsl.g:5473:1: rule__BarChart__Group_8__0__Impl : ( 'barPercentage' ) ;
    public final void rule__BarChart__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5477:1: ( ( 'barPercentage' ) )
            // InternalMyDsl.g:5478:1: ( 'barPercentage' )
            {
            // InternalMyDsl.g:5478:1: ( 'barPercentage' )
            // InternalMyDsl.g:5479:2: 'barPercentage'
            {
             before(grammarAccess.getBarChartAccess().getBarPercentageKeyword_8_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getBarPercentageKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_8__0__Impl"


    // $ANTLR start "rule__BarChart__Group_8__1"
    // InternalMyDsl.g:5488:1: rule__BarChart__Group_8__1 : rule__BarChart__Group_8__1__Impl ;
    public final void rule__BarChart__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5492:1: ( rule__BarChart__Group_8__1__Impl )
            // InternalMyDsl.g:5493:2: rule__BarChart__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_8__1"


    // $ANTLR start "rule__BarChart__Group_8__1__Impl"
    // InternalMyDsl.g:5499:1: rule__BarChart__Group_8__1__Impl : ( ( rule__BarChart__BarPercentageAssignment_8_1 ) ) ;
    public final void rule__BarChart__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5503:1: ( ( ( rule__BarChart__BarPercentageAssignment_8_1 ) ) )
            // InternalMyDsl.g:5504:1: ( ( rule__BarChart__BarPercentageAssignment_8_1 ) )
            {
            // InternalMyDsl.g:5504:1: ( ( rule__BarChart__BarPercentageAssignment_8_1 ) )
            // InternalMyDsl.g:5505:2: ( rule__BarChart__BarPercentageAssignment_8_1 )
            {
             before(grammarAccess.getBarChartAccess().getBarPercentageAssignment_8_1()); 
            // InternalMyDsl.g:5506:2: ( rule__BarChart__BarPercentageAssignment_8_1 )
            // InternalMyDsl.g:5506:3: rule__BarChart__BarPercentageAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__BarPercentageAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getBarPercentageAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_8__1__Impl"


    // $ANTLR start "rule__BarChart__Group_15__0"
    // InternalMyDsl.g:5515:1: rule__BarChart__Group_15__0 : rule__BarChart__Group_15__0__Impl rule__BarChart__Group_15__1 ;
    public final void rule__BarChart__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5519:1: ( rule__BarChart__Group_15__0__Impl rule__BarChart__Group_15__1 )
            // InternalMyDsl.g:5520:2: rule__BarChart__Group_15__0__Impl rule__BarChart__Group_15__1
            {
            pushFollow(FOLLOW_8);
            rule__BarChart__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_15__0"


    // $ANTLR start "rule__BarChart__Group_15__0__Impl"
    // InternalMyDsl.g:5527:1: rule__BarChart__Group_15__0__Impl : ( RULE_COMA ) ;
    public final void rule__BarChart__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5531:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:5532:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:5532:1: ( RULE_COMA )
            // InternalMyDsl.g:5533:2: RULE_COMA
            {
             before(grammarAccess.getBarChartAccess().getCOMATerminalRuleCall_15_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getCOMATerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_15__0__Impl"


    // $ANTLR start "rule__BarChart__Group_15__1"
    // InternalMyDsl.g:5542:1: rule__BarChart__Group_15__1 : rule__BarChart__Group_15__1__Impl ;
    public final void rule__BarChart__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5546:1: ( rule__BarChart__Group_15__1__Impl )
            // InternalMyDsl.g:5547:2: rule__BarChart__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_15__1"


    // $ANTLR start "rule__BarChart__Group_15__1__Impl"
    // InternalMyDsl.g:5553:1: rule__BarChart__Group_15__1__Impl : ( ( rule__BarChart__DataAssignment_15_1 ) ) ;
    public final void rule__BarChart__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5557:1: ( ( ( rule__BarChart__DataAssignment_15_1 ) ) )
            // InternalMyDsl.g:5558:1: ( ( rule__BarChart__DataAssignment_15_1 ) )
            {
            // InternalMyDsl.g:5558:1: ( ( rule__BarChart__DataAssignment_15_1 ) )
            // InternalMyDsl.g:5559:2: ( rule__BarChart__DataAssignment_15_1 )
            {
             before(grammarAccess.getBarChartAccess().getDataAssignment_15_1()); 
            // InternalMyDsl.g:5560:2: ( rule__BarChart__DataAssignment_15_1 )
            // InternalMyDsl.g:5560:3: rule__BarChart__DataAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__DataAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getDataAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_15__1__Impl"


    // $ANTLR start "rule__BarChart__Group_21__0"
    // InternalMyDsl.g:5569:1: rule__BarChart__Group_21__0 : rule__BarChart__Group_21__0__Impl rule__BarChart__Group_21__1 ;
    public final void rule__BarChart__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5573:1: ( rule__BarChart__Group_21__0__Impl rule__BarChart__Group_21__1 )
            // InternalMyDsl.g:5574:2: rule__BarChart__Group_21__0__Impl rule__BarChart__Group_21__1
            {
            pushFollow(FOLLOW_8);
            rule__BarChart__Group_21__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group_21__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_21__0"


    // $ANTLR start "rule__BarChart__Group_21__0__Impl"
    // InternalMyDsl.g:5581:1: rule__BarChart__Group_21__0__Impl : ( RULE_COMA ) ;
    public final void rule__BarChart__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5585:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:5586:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:5586:1: ( RULE_COMA )
            // InternalMyDsl.g:5587:2: RULE_COMA
            {
             before(grammarAccess.getBarChartAccess().getCOMATerminalRuleCall_21_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getCOMATerminalRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_21__0__Impl"


    // $ANTLR start "rule__BarChart__Group_21__1"
    // InternalMyDsl.g:5596:1: rule__BarChart__Group_21__1 : rule__BarChart__Group_21__1__Impl ;
    public final void rule__BarChart__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5600:1: ( rule__BarChart__Group_21__1__Impl )
            // InternalMyDsl.g:5601:2: rule__BarChart__Group_21__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group_21__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_21__1"


    // $ANTLR start "rule__BarChart__Group_21__1__Impl"
    // InternalMyDsl.g:5607:1: rule__BarChart__Group_21__1__Impl : ( ( rule__BarChart__LabelsAssignment_21_1 ) ) ;
    public final void rule__BarChart__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5611:1: ( ( ( rule__BarChart__LabelsAssignment_21_1 ) ) )
            // InternalMyDsl.g:5612:1: ( ( rule__BarChart__LabelsAssignment_21_1 ) )
            {
            // InternalMyDsl.g:5612:1: ( ( rule__BarChart__LabelsAssignment_21_1 ) )
            // InternalMyDsl.g:5613:2: ( rule__BarChart__LabelsAssignment_21_1 )
            {
             before(grammarAccess.getBarChartAccess().getLabelsAssignment_21_1()); 
            // InternalMyDsl.g:5614:2: ( rule__BarChart__LabelsAssignment_21_1 )
            // InternalMyDsl.g:5614:3: rule__BarChart__LabelsAssignment_21_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__LabelsAssignment_21_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getLabelsAssignment_21_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group_21__1__Impl"


    // $ANTLR start "rule__RadarChart__Group__0"
    // InternalMyDsl.g:5623:1: rule__RadarChart__Group__0 : rule__RadarChart__Group__0__Impl rule__RadarChart__Group__1 ;
    public final void rule__RadarChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5627:1: ( rule__RadarChart__Group__0__Impl rule__RadarChart__Group__1 )
            // InternalMyDsl.g:5628:2: rule__RadarChart__Group__0__Impl rule__RadarChart__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RadarChart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__0"


    // $ANTLR start "rule__RadarChart__Group__0__Impl"
    // InternalMyDsl.g:5635:1: rule__RadarChart__Group__0__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__RadarChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5639:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:5640:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:5640:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:5641:2: RULE_OBJECT_START
            {
             before(grammarAccess.getRadarChartAccess().getOBJECT_STARTTerminalRuleCall_0()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getOBJECT_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__0__Impl"


    // $ANTLR start "rule__RadarChart__Group__1"
    // InternalMyDsl.g:5650:1: rule__RadarChart__Group__1 : rule__RadarChart__Group__1__Impl rule__RadarChart__Group__2 ;
    public final void rule__RadarChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5654:1: ( rule__RadarChart__Group__1__Impl rule__RadarChart__Group__2 )
            // InternalMyDsl.g:5655:2: rule__RadarChart__Group__1__Impl rule__RadarChart__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__RadarChart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__1"


    // $ANTLR start "rule__RadarChart__Group__1__Impl"
    // InternalMyDsl.g:5662:1: rule__RadarChart__Group__1__Impl : ( ( rule__RadarChart__NameAssignment_1 ) ) ;
    public final void rule__RadarChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5666:1: ( ( ( rule__RadarChart__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5667:1: ( ( rule__RadarChart__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5667:1: ( ( rule__RadarChart__NameAssignment_1 ) )
            // InternalMyDsl.g:5668:2: ( rule__RadarChart__NameAssignment_1 )
            {
             before(grammarAccess.getRadarChartAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5669:2: ( rule__RadarChart__NameAssignment_1 )
            // InternalMyDsl.g:5669:3: rule__RadarChart__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRadarChartAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__1__Impl"


    // $ANTLR start "rule__RadarChart__Group__2"
    // InternalMyDsl.g:5677:1: rule__RadarChart__Group__2 : rule__RadarChart__Group__2__Impl rule__RadarChart__Group__3 ;
    public final void rule__RadarChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5681:1: ( rule__RadarChart__Group__2__Impl rule__RadarChart__Group__3 )
            // InternalMyDsl.g:5682:2: rule__RadarChart__Group__2__Impl rule__RadarChart__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__RadarChart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__2"


    // $ANTLR start "rule__RadarChart__Group__2__Impl"
    // InternalMyDsl.g:5689:1: rule__RadarChart__Group__2__Impl : ( ( rule__RadarChart__Group_2__0 ) ) ;
    public final void rule__RadarChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5693:1: ( ( ( rule__RadarChart__Group_2__0 ) ) )
            // InternalMyDsl.g:5694:1: ( ( rule__RadarChart__Group_2__0 ) )
            {
            // InternalMyDsl.g:5694:1: ( ( rule__RadarChart__Group_2__0 ) )
            // InternalMyDsl.g:5695:2: ( rule__RadarChart__Group_2__0 )
            {
             before(grammarAccess.getRadarChartAccess().getGroup_2()); 
            // InternalMyDsl.g:5696:2: ( rule__RadarChart__Group_2__0 )
            // InternalMyDsl.g:5696:3: rule__RadarChart__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getRadarChartAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__2__Impl"


    // $ANTLR start "rule__RadarChart__Group__3"
    // InternalMyDsl.g:5704:1: rule__RadarChart__Group__3 : rule__RadarChart__Group__3__Impl rule__RadarChart__Group__4 ;
    public final void rule__RadarChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5708:1: ( rule__RadarChart__Group__3__Impl rule__RadarChart__Group__4 )
            // InternalMyDsl.g:5709:2: rule__RadarChart__Group__3__Impl rule__RadarChart__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__RadarChart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__3"


    // $ANTLR start "rule__RadarChart__Group__3__Impl"
    // InternalMyDsl.g:5716:1: rule__RadarChart__Group__3__Impl : ( ( rule__RadarChart__Group_3__0 )? ) ;
    public final void rule__RadarChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5720:1: ( ( ( rule__RadarChart__Group_3__0 )? ) )
            // InternalMyDsl.g:5721:1: ( ( rule__RadarChart__Group_3__0 )? )
            {
            // InternalMyDsl.g:5721:1: ( ( rule__RadarChart__Group_3__0 )? )
            // InternalMyDsl.g:5722:2: ( rule__RadarChart__Group_3__0 )?
            {
             before(grammarAccess.getRadarChartAccess().getGroup_3()); 
            // InternalMyDsl.g:5723:2: ( rule__RadarChart__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==58) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:5723:3: rule__RadarChart__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RadarChart__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRadarChartAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__3__Impl"


    // $ANTLR start "rule__RadarChart__Group__4"
    // InternalMyDsl.g:5731:1: rule__RadarChart__Group__4 : rule__RadarChart__Group__4__Impl rule__RadarChart__Group__5 ;
    public final void rule__RadarChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5735:1: ( rule__RadarChart__Group__4__Impl rule__RadarChart__Group__5 )
            // InternalMyDsl.g:5736:2: rule__RadarChart__Group__4__Impl rule__RadarChart__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__RadarChart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__4"


    // $ANTLR start "rule__RadarChart__Group__4__Impl"
    // InternalMyDsl.g:5743:1: rule__RadarChart__Group__4__Impl : ( ( rule__RadarChart__AngleLinesDisplayAssignment_4 ) ) ;
    public final void rule__RadarChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5747:1: ( ( ( rule__RadarChart__AngleLinesDisplayAssignment_4 ) ) )
            // InternalMyDsl.g:5748:1: ( ( rule__RadarChart__AngleLinesDisplayAssignment_4 ) )
            {
            // InternalMyDsl.g:5748:1: ( ( rule__RadarChart__AngleLinesDisplayAssignment_4 ) )
            // InternalMyDsl.g:5749:2: ( rule__RadarChart__AngleLinesDisplayAssignment_4 )
            {
             before(grammarAccess.getRadarChartAccess().getAngleLinesDisplayAssignment_4()); 
            // InternalMyDsl.g:5750:2: ( rule__RadarChart__AngleLinesDisplayAssignment_4 )
            // InternalMyDsl.g:5750:3: rule__RadarChart__AngleLinesDisplayAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__AngleLinesDisplayAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRadarChartAccess().getAngleLinesDisplayAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__4__Impl"


    // $ANTLR start "rule__RadarChart__Group__5"
    // InternalMyDsl.g:5758:1: rule__RadarChart__Group__5 : rule__RadarChart__Group__5__Impl rule__RadarChart__Group__6 ;
    public final void rule__RadarChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5762:1: ( rule__RadarChart__Group__5__Impl rule__RadarChart__Group__6 )
            // InternalMyDsl.g:5763:2: rule__RadarChart__Group__5__Impl rule__RadarChart__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__RadarChart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__5"


    // $ANTLR start "rule__RadarChart__Group__5__Impl"
    // InternalMyDsl.g:5770:1: rule__RadarChart__Group__5__Impl : ( 'data' ) ;
    public final void rule__RadarChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5774:1: ( ( 'data' ) )
            // InternalMyDsl.g:5775:1: ( 'data' )
            {
            // InternalMyDsl.g:5775:1: ( 'data' )
            // InternalMyDsl.g:5776:2: 'data'
            {
             before(grammarAccess.getRadarChartAccess().getDataKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getDataKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__5__Impl"


    // $ANTLR start "rule__RadarChart__Group__6"
    // InternalMyDsl.g:5785:1: rule__RadarChart__Group__6 : rule__RadarChart__Group__6__Impl rule__RadarChart__Group__7 ;
    public final void rule__RadarChart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5789:1: ( rule__RadarChart__Group__6__Impl rule__RadarChart__Group__7 )
            // InternalMyDsl.g:5790:2: rule__RadarChart__Group__6__Impl rule__RadarChart__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__RadarChart__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__6"


    // $ANTLR start "rule__RadarChart__Group__6__Impl"
    // InternalMyDsl.g:5797:1: rule__RadarChart__Group__6__Impl : ( RULE_EQUALS ) ;
    public final void rule__RadarChart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5801:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:5802:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:5802:1: ( RULE_EQUALS )
            // InternalMyDsl.g:5803:2: RULE_EQUALS
            {
             before(grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_6()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__6__Impl"


    // $ANTLR start "rule__RadarChart__Group__7"
    // InternalMyDsl.g:5812:1: rule__RadarChart__Group__7 : rule__RadarChart__Group__7__Impl rule__RadarChart__Group__8 ;
    public final void rule__RadarChart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5816:1: ( rule__RadarChart__Group__7__Impl rule__RadarChart__Group__8 )
            // InternalMyDsl.g:5817:2: rule__RadarChart__Group__7__Impl rule__RadarChart__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__RadarChart__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__7"


    // $ANTLR start "rule__RadarChart__Group__7__Impl"
    // InternalMyDsl.g:5824:1: rule__RadarChart__Group__7__Impl : ( RULE_LIST_START ) ;
    public final void rule__RadarChart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5828:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:5829:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:5829:1: ( RULE_LIST_START )
            // InternalMyDsl.g:5830:2: RULE_LIST_START
            {
             before(grammarAccess.getRadarChartAccess().getLIST_STARTTerminalRuleCall_7()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getLIST_STARTTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__7__Impl"


    // $ANTLR start "rule__RadarChart__Group__8"
    // InternalMyDsl.g:5839:1: rule__RadarChart__Group__8 : rule__RadarChart__Group__8__Impl rule__RadarChart__Group__9 ;
    public final void rule__RadarChart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5843:1: ( rule__RadarChart__Group__8__Impl rule__RadarChart__Group__9 )
            // InternalMyDsl.g:5844:2: rule__RadarChart__Group__8__Impl rule__RadarChart__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__RadarChart__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__8"


    // $ANTLR start "rule__RadarChart__Group__8__Impl"
    // InternalMyDsl.g:5851:1: rule__RadarChart__Group__8__Impl : ( ( rule__RadarChart__DataAssignment_8 ) ) ;
    public final void rule__RadarChart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5855:1: ( ( ( rule__RadarChart__DataAssignment_8 ) ) )
            // InternalMyDsl.g:5856:1: ( ( rule__RadarChart__DataAssignment_8 ) )
            {
            // InternalMyDsl.g:5856:1: ( ( rule__RadarChart__DataAssignment_8 ) )
            // InternalMyDsl.g:5857:2: ( rule__RadarChart__DataAssignment_8 )
            {
             before(grammarAccess.getRadarChartAccess().getDataAssignment_8()); 
            // InternalMyDsl.g:5858:2: ( rule__RadarChart__DataAssignment_8 )
            // InternalMyDsl.g:5858:3: rule__RadarChart__DataAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__DataAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRadarChartAccess().getDataAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__8__Impl"


    // $ANTLR start "rule__RadarChart__Group__9"
    // InternalMyDsl.g:5866:1: rule__RadarChart__Group__9 : rule__RadarChart__Group__9__Impl rule__RadarChart__Group__10 ;
    public final void rule__RadarChart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5870:1: ( rule__RadarChart__Group__9__Impl rule__RadarChart__Group__10 )
            // InternalMyDsl.g:5871:2: rule__RadarChart__Group__9__Impl rule__RadarChart__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__RadarChart__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__9"


    // $ANTLR start "rule__RadarChart__Group__9__Impl"
    // InternalMyDsl.g:5878:1: rule__RadarChart__Group__9__Impl : ( ( rule__RadarChart__Group_9__0 )* ) ;
    public final void rule__RadarChart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5882:1: ( ( ( rule__RadarChart__Group_9__0 )* ) )
            // InternalMyDsl.g:5883:1: ( ( rule__RadarChart__Group_9__0 )* )
            {
            // InternalMyDsl.g:5883:1: ( ( rule__RadarChart__Group_9__0 )* )
            // InternalMyDsl.g:5884:2: ( rule__RadarChart__Group_9__0 )*
            {
             before(grammarAccess.getRadarChartAccess().getGroup_9()); 
            // InternalMyDsl.g:5885:2: ( rule__RadarChart__Group_9__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_COMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyDsl.g:5885:3: rule__RadarChart__Group_9__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RadarChart__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getRadarChartAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__9__Impl"


    // $ANTLR start "rule__RadarChart__Group__10"
    // InternalMyDsl.g:5893:1: rule__RadarChart__Group__10 : rule__RadarChart__Group__10__Impl rule__RadarChart__Group__11 ;
    public final void rule__RadarChart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5897:1: ( rule__RadarChart__Group__10__Impl rule__RadarChart__Group__11 )
            // InternalMyDsl.g:5898:2: rule__RadarChart__Group__10__Impl rule__RadarChart__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__RadarChart__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__10"


    // $ANTLR start "rule__RadarChart__Group__10__Impl"
    // InternalMyDsl.g:5905:1: rule__RadarChart__Group__10__Impl : ( RULE_LIST_END ) ;
    public final void rule__RadarChart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5909:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:5910:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:5910:1: ( RULE_LIST_END )
            // InternalMyDsl.g:5911:2: RULE_LIST_END
            {
             before(grammarAccess.getRadarChartAccess().getLIST_ENDTerminalRuleCall_10()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getLIST_ENDTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__10__Impl"


    // $ANTLR start "rule__RadarChart__Group__11"
    // InternalMyDsl.g:5920:1: rule__RadarChart__Group__11 : rule__RadarChart__Group__11__Impl rule__RadarChart__Group__12 ;
    public final void rule__RadarChart__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5924:1: ( rule__RadarChart__Group__11__Impl rule__RadarChart__Group__12 )
            // InternalMyDsl.g:5925:2: rule__RadarChart__Group__11__Impl rule__RadarChart__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__RadarChart__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__11"


    // $ANTLR start "rule__RadarChart__Group__11__Impl"
    // InternalMyDsl.g:5932:1: rule__RadarChart__Group__11__Impl : ( 'labels' ) ;
    public final void rule__RadarChart__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5936:1: ( ( 'labels' ) )
            // InternalMyDsl.g:5937:1: ( 'labels' )
            {
            // InternalMyDsl.g:5937:1: ( 'labels' )
            // InternalMyDsl.g:5938:2: 'labels'
            {
             before(grammarAccess.getRadarChartAccess().getLabelsKeyword_11()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getLabelsKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__11__Impl"


    // $ANTLR start "rule__RadarChart__Group__12"
    // InternalMyDsl.g:5947:1: rule__RadarChart__Group__12 : rule__RadarChart__Group__12__Impl rule__RadarChart__Group__13 ;
    public final void rule__RadarChart__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5951:1: ( rule__RadarChart__Group__12__Impl rule__RadarChart__Group__13 )
            // InternalMyDsl.g:5952:2: rule__RadarChart__Group__12__Impl rule__RadarChart__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__RadarChart__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__12"


    // $ANTLR start "rule__RadarChart__Group__12__Impl"
    // InternalMyDsl.g:5959:1: rule__RadarChart__Group__12__Impl : ( RULE_EQUALS ) ;
    public final void rule__RadarChart__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5963:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:5964:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:5964:1: ( RULE_EQUALS )
            // InternalMyDsl.g:5965:2: RULE_EQUALS
            {
             before(grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_12()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getEQUALSTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__12__Impl"


    // $ANTLR start "rule__RadarChart__Group__13"
    // InternalMyDsl.g:5974:1: rule__RadarChart__Group__13 : rule__RadarChart__Group__13__Impl rule__RadarChart__Group__14 ;
    public final void rule__RadarChart__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5978:1: ( rule__RadarChart__Group__13__Impl rule__RadarChart__Group__14 )
            // InternalMyDsl.g:5979:2: rule__RadarChart__Group__13__Impl rule__RadarChart__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__RadarChart__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__13"


    // $ANTLR start "rule__RadarChart__Group__13__Impl"
    // InternalMyDsl.g:5986:1: rule__RadarChart__Group__13__Impl : ( RULE_LIST_START ) ;
    public final void rule__RadarChart__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5990:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:5991:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:5991:1: ( RULE_LIST_START )
            // InternalMyDsl.g:5992:2: RULE_LIST_START
            {
             before(grammarAccess.getRadarChartAccess().getLIST_STARTTerminalRuleCall_13()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getLIST_STARTTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__13__Impl"


    // $ANTLR start "rule__RadarChart__Group__14"
    // InternalMyDsl.g:6001:1: rule__RadarChart__Group__14 : rule__RadarChart__Group__14__Impl rule__RadarChart__Group__15 ;
    public final void rule__RadarChart__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6005:1: ( rule__RadarChart__Group__14__Impl rule__RadarChart__Group__15 )
            // InternalMyDsl.g:6006:2: rule__RadarChart__Group__14__Impl rule__RadarChart__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__RadarChart__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__14"


    // $ANTLR start "rule__RadarChart__Group__14__Impl"
    // InternalMyDsl.g:6013:1: rule__RadarChart__Group__14__Impl : ( ( rule__RadarChart__LabelsAssignment_14 ) ) ;
    public final void rule__RadarChart__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6017:1: ( ( ( rule__RadarChart__LabelsAssignment_14 ) ) )
            // InternalMyDsl.g:6018:1: ( ( rule__RadarChart__LabelsAssignment_14 ) )
            {
            // InternalMyDsl.g:6018:1: ( ( rule__RadarChart__LabelsAssignment_14 ) )
            // InternalMyDsl.g:6019:2: ( rule__RadarChart__LabelsAssignment_14 )
            {
             before(grammarAccess.getRadarChartAccess().getLabelsAssignment_14()); 
            // InternalMyDsl.g:6020:2: ( rule__RadarChart__LabelsAssignment_14 )
            // InternalMyDsl.g:6020:3: rule__RadarChart__LabelsAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__LabelsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getRadarChartAccess().getLabelsAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__14__Impl"


    // $ANTLR start "rule__RadarChart__Group__15"
    // InternalMyDsl.g:6028:1: rule__RadarChart__Group__15 : rule__RadarChart__Group__15__Impl rule__RadarChart__Group__16 ;
    public final void rule__RadarChart__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6032:1: ( rule__RadarChart__Group__15__Impl rule__RadarChart__Group__16 )
            // InternalMyDsl.g:6033:2: rule__RadarChart__Group__15__Impl rule__RadarChart__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__RadarChart__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__15"


    // $ANTLR start "rule__RadarChart__Group__15__Impl"
    // InternalMyDsl.g:6040:1: rule__RadarChart__Group__15__Impl : ( ( rule__RadarChart__Group_15__0 )* ) ;
    public final void rule__RadarChart__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6044:1: ( ( ( rule__RadarChart__Group_15__0 )* ) )
            // InternalMyDsl.g:6045:1: ( ( rule__RadarChart__Group_15__0 )* )
            {
            // InternalMyDsl.g:6045:1: ( ( rule__RadarChart__Group_15__0 )* )
            // InternalMyDsl.g:6046:2: ( rule__RadarChart__Group_15__0 )*
            {
             before(grammarAccess.getRadarChartAccess().getGroup_15()); 
            // InternalMyDsl.g:6047:2: ( rule__RadarChart__Group_15__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_COMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:6047:3: rule__RadarChart__Group_15__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RadarChart__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getRadarChartAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__15__Impl"


    // $ANTLR start "rule__RadarChart__Group__16"
    // InternalMyDsl.g:6055:1: rule__RadarChart__Group__16 : rule__RadarChart__Group__16__Impl rule__RadarChart__Group__17 ;
    public final void rule__RadarChart__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6059:1: ( rule__RadarChart__Group__16__Impl rule__RadarChart__Group__17 )
            // InternalMyDsl.g:6060:2: rule__RadarChart__Group__16__Impl rule__RadarChart__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__RadarChart__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__16"


    // $ANTLR start "rule__RadarChart__Group__16__Impl"
    // InternalMyDsl.g:6067:1: rule__RadarChart__Group__16__Impl : ( RULE_LIST_END ) ;
    public final void rule__RadarChart__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6071:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:6072:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:6072:1: ( RULE_LIST_END )
            // InternalMyDsl.g:6073:2: RULE_LIST_END
            {
             before(grammarAccess.getRadarChartAccess().getLIST_ENDTerminalRuleCall_16()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getLIST_ENDTerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__16__Impl"


    // $ANTLR start "rule__RadarChart__Group__17"
    // InternalMyDsl.g:6082:1: rule__RadarChart__Group__17 : rule__RadarChart__Group__17__Impl ;
    public final void rule__RadarChart__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6086:1: ( rule__RadarChart__Group__17__Impl )
            // InternalMyDsl.g:6087:2: rule__RadarChart__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__17"


    // $ANTLR start "rule__RadarChart__Group__17__Impl"
    // InternalMyDsl.g:6093:1: rule__RadarChart__Group__17__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__RadarChart__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6097:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:6098:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:6098:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:6099:2: RULE_OBJECT_END
            {
             before(grammarAccess.getRadarChartAccess().getOBJECT_ENDTerminalRuleCall_17()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getOBJECT_ENDTerminalRuleCall_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group__17__Impl"


    // $ANTLR start "rule__RadarChart__Group_2__0"
    // InternalMyDsl.g:6109:1: rule__RadarChart__Group_2__0 : rule__RadarChart__Group_2__0__Impl rule__RadarChart__Group_2__1 ;
    public final void rule__RadarChart__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6113:1: ( rule__RadarChart__Group_2__0__Impl rule__RadarChart__Group_2__1 )
            // InternalMyDsl.g:6114:2: rule__RadarChart__Group_2__0__Impl rule__RadarChart__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__RadarChart__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_2__0"


    // $ANTLR start "rule__RadarChart__Group_2__0__Impl"
    // InternalMyDsl.g:6121:1: rule__RadarChart__Group_2__0__Impl : ( 'title' ) ;
    public final void rule__RadarChart__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6125:1: ( ( 'title' ) )
            // InternalMyDsl.g:6126:1: ( 'title' )
            {
            // InternalMyDsl.g:6126:1: ( 'title' )
            // InternalMyDsl.g:6127:2: 'title'
            {
             before(grammarAccess.getRadarChartAccess().getTitleKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getTitleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_2__0__Impl"


    // $ANTLR start "rule__RadarChart__Group_2__1"
    // InternalMyDsl.g:6136:1: rule__RadarChart__Group_2__1 : rule__RadarChart__Group_2__1__Impl ;
    public final void rule__RadarChart__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6140:1: ( rule__RadarChart__Group_2__1__Impl )
            // InternalMyDsl.g:6141:2: rule__RadarChart__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_2__1"


    // $ANTLR start "rule__RadarChart__Group_2__1__Impl"
    // InternalMyDsl.g:6147:1: rule__RadarChart__Group_2__1__Impl : ( ( rule__RadarChart__TitleAssignment_2_1 ) ) ;
    public final void rule__RadarChart__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6151:1: ( ( ( rule__RadarChart__TitleAssignment_2_1 ) ) )
            // InternalMyDsl.g:6152:1: ( ( rule__RadarChart__TitleAssignment_2_1 ) )
            {
            // InternalMyDsl.g:6152:1: ( ( rule__RadarChart__TitleAssignment_2_1 ) )
            // InternalMyDsl.g:6153:2: ( rule__RadarChart__TitleAssignment_2_1 )
            {
             before(grammarAccess.getRadarChartAccess().getTitleAssignment_2_1()); 
            // InternalMyDsl.g:6154:2: ( rule__RadarChart__TitleAssignment_2_1 )
            // InternalMyDsl.g:6154:3: rule__RadarChart__TitleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__TitleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRadarChartAccess().getTitleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_2__1__Impl"


    // $ANTLR start "rule__RadarChart__Group_3__0"
    // InternalMyDsl.g:6163:1: rule__RadarChart__Group_3__0 : rule__RadarChart__Group_3__0__Impl rule__RadarChart__Group_3__1 ;
    public final void rule__RadarChart__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6167:1: ( rule__RadarChart__Group_3__0__Impl rule__RadarChart__Group_3__1 )
            // InternalMyDsl.g:6168:2: rule__RadarChart__Group_3__0__Impl rule__RadarChart__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__RadarChart__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_3__0"


    // $ANTLR start "rule__RadarChart__Group_3__0__Impl"
    // InternalMyDsl.g:6175:1: rule__RadarChart__Group_3__0__Impl : ( 'legendPosition' ) ;
    public final void rule__RadarChart__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6179:1: ( ( 'legendPosition' ) )
            // InternalMyDsl.g:6180:1: ( 'legendPosition' )
            {
            // InternalMyDsl.g:6180:1: ( 'legendPosition' )
            // InternalMyDsl.g:6181:2: 'legendPosition'
            {
             before(grammarAccess.getRadarChartAccess().getLegendPositionKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getLegendPositionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_3__0__Impl"


    // $ANTLR start "rule__RadarChart__Group_3__1"
    // InternalMyDsl.g:6190:1: rule__RadarChart__Group_3__1 : rule__RadarChart__Group_3__1__Impl ;
    public final void rule__RadarChart__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6194:1: ( rule__RadarChart__Group_3__1__Impl )
            // InternalMyDsl.g:6195:2: rule__RadarChart__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_3__1"


    // $ANTLR start "rule__RadarChart__Group_3__1__Impl"
    // InternalMyDsl.g:6201:1: rule__RadarChart__Group_3__1__Impl : ( ( rule__RadarChart__LegendPositionAssignment_3_1 ) ) ;
    public final void rule__RadarChart__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6205:1: ( ( ( rule__RadarChart__LegendPositionAssignment_3_1 ) ) )
            // InternalMyDsl.g:6206:1: ( ( rule__RadarChart__LegendPositionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:6206:1: ( ( rule__RadarChart__LegendPositionAssignment_3_1 ) )
            // InternalMyDsl.g:6207:2: ( rule__RadarChart__LegendPositionAssignment_3_1 )
            {
             before(grammarAccess.getRadarChartAccess().getLegendPositionAssignment_3_1()); 
            // InternalMyDsl.g:6208:2: ( rule__RadarChart__LegendPositionAssignment_3_1 )
            // InternalMyDsl.g:6208:3: rule__RadarChart__LegendPositionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__LegendPositionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRadarChartAccess().getLegendPositionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_3__1__Impl"


    // $ANTLR start "rule__RadarChart__Group_9__0"
    // InternalMyDsl.g:6217:1: rule__RadarChart__Group_9__0 : rule__RadarChart__Group_9__0__Impl rule__RadarChart__Group_9__1 ;
    public final void rule__RadarChart__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6221:1: ( rule__RadarChart__Group_9__0__Impl rule__RadarChart__Group_9__1 )
            // InternalMyDsl.g:6222:2: rule__RadarChart__Group_9__0__Impl rule__RadarChart__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__RadarChart__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_9__0"


    // $ANTLR start "rule__RadarChart__Group_9__0__Impl"
    // InternalMyDsl.g:6229:1: rule__RadarChart__Group_9__0__Impl : ( RULE_COMA ) ;
    public final void rule__RadarChart__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6233:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:6234:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:6234:1: ( RULE_COMA )
            // InternalMyDsl.g:6235:2: RULE_COMA
            {
             before(grammarAccess.getRadarChartAccess().getCOMATerminalRuleCall_9_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getCOMATerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_9__0__Impl"


    // $ANTLR start "rule__RadarChart__Group_9__1"
    // InternalMyDsl.g:6244:1: rule__RadarChart__Group_9__1 : rule__RadarChart__Group_9__1__Impl ;
    public final void rule__RadarChart__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6248:1: ( rule__RadarChart__Group_9__1__Impl )
            // InternalMyDsl.g:6249:2: rule__RadarChart__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_9__1"


    // $ANTLR start "rule__RadarChart__Group_9__1__Impl"
    // InternalMyDsl.g:6255:1: rule__RadarChart__Group_9__1__Impl : ( ( rule__RadarChart__DataAssignment_9_1 ) ) ;
    public final void rule__RadarChart__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6259:1: ( ( ( rule__RadarChart__DataAssignment_9_1 ) ) )
            // InternalMyDsl.g:6260:1: ( ( rule__RadarChart__DataAssignment_9_1 ) )
            {
            // InternalMyDsl.g:6260:1: ( ( rule__RadarChart__DataAssignment_9_1 ) )
            // InternalMyDsl.g:6261:2: ( rule__RadarChart__DataAssignment_9_1 )
            {
             before(grammarAccess.getRadarChartAccess().getDataAssignment_9_1()); 
            // InternalMyDsl.g:6262:2: ( rule__RadarChart__DataAssignment_9_1 )
            // InternalMyDsl.g:6262:3: rule__RadarChart__DataAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__DataAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getRadarChartAccess().getDataAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_9__1__Impl"


    // $ANTLR start "rule__RadarChart__Group_15__0"
    // InternalMyDsl.g:6271:1: rule__RadarChart__Group_15__0 : rule__RadarChart__Group_15__0__Impl rule__RadarChart__Group_15__1 ;
    public final void rule__RadarChart__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6275:1: ( rule__RadarChart__Group_15__0__Impl rule__RadarChart__Group_15__1 )
            // InternalMyDsl.g:6276:2: rule__RadarChart__Group_15__0__Impl rule__RadarChart__Group_15__1
            {
            pushFollow(FOLLOW_8);
            rule__RadarChart__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarChart__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_15__0"


    // $ANTLR start "rule__RadarChart__Group_15__0__Impl"
    // InternalMyDsl.g:6283:1: rule__RadarChart__Group_15__0__Impl : ( RULE_COMA ) ;
    public final void rule__RadarChart__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6287:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:6288:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:6288:1: ( RULE_COMA )
            // InternalMyDsl.g:6289:2: RULE_COMA
            {
             before(grammarAccess.getRadarChartAccess().getCOMATerminalRuleCall_15_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getCOMATerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_15__0__Impl"


    // $ANTLR start "rule__RadarChart__Group_15__1"
    // InternalMyDsl.g:6298:1: rule__RadarChart__Group_15__1 : rule__RadarChart__Group_15__1__Impl ;
    public final void rule__RadarChart__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6302:1: ( rule__RadarChart__Group_15__1__Impl )
            // InternalMyDsl.g:6303:2: rule__RadarChart__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_15__1"


    // $ANTLR start "rule__RadarChart__Group_15__1__Impl"
    // InternalMyDsl.g:6309:1: rule__RadarChart__Group_15__1__Impl : ( ( rule__RadarChart__LabelsAssignment_15_1 ) ) ;
    public final void rule__RadarChart__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6313:1: ( ( ( rule__RadarChart__LabelsAssignment_15_1 ) ) )
            // InternalMyDsl.g:6314:1: ( ( rule__RadarChart__LabelsAssignment_15_1 ) )
            {
            // InternalMyDsl.g:6314:1: ( ( rule__RadarChart__LabelsAssignment_15_1 ) )
            // InternalMyDsl.g:6315:2: ( rule__RadarChart__LabelsAssignment_15_1 )
            {
             before(grammarAccess.getRadarChartAccess().getLabelsAssignment_15_1()); 
            // InternalMyDsl.g:6316:2: ( rule__RadarChart__LabelsAssignment_15_1 )
            // InternalMyDsl.g:6316:3: rule__RadarChart__LabelsAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__RadarChart__LabelsAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getRadarChartAccess().getLabelsAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__Group_15__1__Impl"


    // $ANTLR start "rule__PieChart__Group__0"
    // InternalMyDsl.g:6325:1: rule__PieChart__Group__0 : rule__PieChart__Group__0__Impl rule__PieChart__Group__1 ;
    public final void rule__PieChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6329:1: ( rule__PieChart__Group__0__Impl rule__PieChart__Group__1 )
            // InternalMyDsl.g:6330:2: rule__PieChart__Group__0__Impl rule__PieChart__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__PieChart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__0"


    // $ANTLR start "rule__PieChart__Group__0__Impl"
    // InternalMyDsl.g:6337:1: rule__PieChart__Group__0__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__PieChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6341:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:6342:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:6342:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:6343:2: RULE_OBJECT_START
            {
             before(grammarAccess.getPieChartAccess().getOBJECT_STARTTerminalRuleCall_0()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getOBJECT_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__0__Impl"


    // $ANTLR start "rule__PieChart__Group__1"
    // InternalMyDsl.g:6352:1: rule__PieChart__Group__1 : rule__PieChart__Group__1__Impl rule__PieChart__Group__2 ;
    public final void rule__PieChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6356:1: ( rule__PieChart__Group__1__Impl rule__PieChart__Group__2 )
            // InternalMyDsl.g:6357:2: rule__PieChart__Group__1__Impl rule__PieChart__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__PieChart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__1"


    // $ANTLR start "rule__PieChart__Group__1__Impl"
    // InternalMyDsl.g:6364:1: rule__PieChart__Group__1__Impl : ( 'PIE' ) ;
    public final void rule__PieChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6368:1: ( ( 'PIE' ) )
            // InternalMyDsl.g:6369:1: ( 'PIE' )
            {
            // InternalMyDsl.g:6369:1: ( 'PIE' )
            // InternalMyDsl.g:6370:2: 'PIE'
            {
             before(grammarAccess.getPieChartAccess().getPIEKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getPIEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__1__Impl"


    // $ANTLR start "rule__PieChart__Group__2"
    // InternalMyDsl.g:6379:1: rule__PieChart__Group__2 : rule__PieChart__Group__2__Impl rule__PieChart__Group__3 ;
    public final void rule__PieChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6383:1: ( rule__PieChart__Group__2__Impl rule__PieChart__Group__3 )
            // InternalMyDsl.g:6384:2: rule__PieChart__Group__2__Impl rule__PieChart__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__PieChart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__2"


    // $ANTLR start "rule__PieChart__Group__2__Impl"
    // InternalMyDsl.g:6391:1: rule__PieChart__Group__2__Impl : ( ( rule__PieChart__NameAssignment_2 ) ) ;
    public final void rule__PieChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6395:1: ( ( ( rule__PieChart__NameAssignment_2 ) ) )
            // InternalMyDsl.g:6396:1: ( ( rule__PieChart__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:6396:1: ( ( rule__PieChart__NameAssignment_2 ) )
            // InternalMyDsl.g:6397:2: ( rule__PieChart__NameAssignment_2 )
            {
             before(grammarAccess.getPieChartAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:6398:2: ( rule__PieChart__NameAssignment_2 )
            // InternalMyDsl.g:6398:3: rule__PieChart__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPieChartAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__2__Impl"


    // $ANTLR start "rule__PieChart__Group__3"
    // InternalMyDsl.g:6406:1: rule__PieChart__Group__3 : rule__PieChart__Group__3__Impl rule__PieChart__Group__4 ;
    public final void rule__PieChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6410:1: ( rule__PieChart__Group__3__Impl rule__PieChart__Group__4 )
            // InternalMyDsl.g:6411:2: rule__PieChart__Group__3__Impl rule__PieChart__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__PieChart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__3"


    // $ANTLR start "rule__PieChart__Group__3__Impl"
    // InternalMyDsl.g:6418:1: rule__PieChart__Group__3__Impl : ( ( rule__PieChart__Group_3__0 )? ) ;
    public final void rule__PieChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6422:1: ( ( ( rule__PieChart__Group_3__0 )? ) )
            // InternalMyDsl.g:6423:1: ( ( rule__PieChart__Group_3__0 )? )
            {
            // InternalMyDsl.g:6423:1: ( ( rule__PieChart__Group_3__0 )? )
            // InternalMyDsl.g:6424:2: ( rule__PieChart__Group_3__0 )?
            {
             before(grammarAccess.getPieChartAccess().getGroup_3()); 
            // InternalMyDsl.g:6425:2: ( rule__PieChart__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:6425:3: rule__PieChart__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PieChart__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieChartAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__3__Impl"


    // $ANTLR start "rule__PieChart__Group__4"
    // InternalMyDsl.g:6433:1: rule__PieChart__Group__4 : rule__PieChart__Group__4__Impl rule__PieChart__Group__5 ;
    public final void rule__PieChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6437:1: ( rule__PieChart__Group__4__Impl rule__PieChart__Group__5 )
            // InternalMyDsl.g:6438:2: rule__PieChart__Group__4__Impl rule__PieChart__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__PieChart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__4"


    // $ANTLR start "rule__PieChart__Group__4__Impl"
    // InternalMyDsl.g:6445:1: rule__PieChart__Group__4__Impl : ( ( rule__PieChart__Group_4__0 )? ) ;
    public final void rule__PieChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6449:1: ( ( ( rule__PieChart__Group_4__0 )? ) )
            // InternalMyDsl.g:6450:1: ( ( rule__PieChart__Group_4__0 )? )
            {
            // InternalMyDsl.g:6450:1: ( ( rule__PieChart__Group_4__0 )? )
            // InternalMyDsl.g:6451:2: ( rule__PieChart__Group_4__0 )?
            {
             before(grammarAccess.getPieChartAccess().getGroup_4()); 
            // InternalMyDsl.g:6452:2: ( rule__PieChart__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==58) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:6452:3: rule__PieChart__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PieChart__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPieChartAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__4__Impl"


    // $ANTLR start "rule__PieChart__Group__5"
    // InternalMyDsl.g:6460:1: rule__PieChart__Group__5 : rule__PieChart__Group__5__Impl rule__PieChart__Group__6 ;
    public final void rule__PieChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6464:1: ( rule__PieChart__Group__5__Impl rule__PieChart__Group__6 )
            // InternalMyDsl.g:6465:2: rule__PieChart__Group__5__Impl rule__PieChart__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__PieChart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__5"


    // $ANTLR start "rule__PieChart__Group__5__Impl"
    // InternalMyDsl.g:6472:1: rule__PieChart__Group__5__Impl : ( 'data' ) ;
    public final void rule__PieChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6476:1: ( ( 'data' ) )
            // InternalMyDsl.g:6477:1: ( 'data' )
            {
            // InternalMyDsl.g:6477:1: ( 'data' )
            // InternalMyDsl.g:6478:2: 'data'
            {
             before(grammarAccess.getPieChartAccess().getDataKeyword_5()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getDataKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__5__Impl"


    // $ANTLR start "rule__PieChart__Group__6"
    // InternalMyDsl.g:6487:1: rule__PieChart__Group__6 : rule__PieChart__Group__6__Impl rule__PieChart__Group__7 ;
    public final void rule__PieChart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6491:1: ( rule__PieChart__Group__6__Impl rule__PieChart__Group__7 )
            // InternalMyDsl.g:6492:2: rule__PieChart__Group__6__Impl rule__PieChart__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__PieChart__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__6"


    // $ANTLR start "rule__PieChart__Group__6__Impl"
    // InternalMyDsl.g:6499:1: rule__PieChart__Group__6__Impl : ( RULE_EQUALS ) ;
    public final void rule__PieChart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6503:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:6504:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:6504:1: ( RULE_EQUALS )
            // InternalMyDsl.g:6505:2: RULE_EQUALS
            {
             before(grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_6()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__6__Impl"


    // $ANTLR start "rule__PieChart__Group__7"
    // InternalMyDsl.g:6514:1: rule__PieChart__Group__7 : rule__PieChart__Group__7__Impl rule__PieChart__Group__8 ;
    public final void rule__PieChart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6518:1: ( rule__PieChart__Group__7__Impl rule__PieChart__Group__8 )
            // InternalMyDsl.g:6519:2: rule__PieChart__Group__7__Impl rule__PieChart__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__PieChart__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__7"


    // $ANTLR start "rule__PieChart__Group__7__Impl"
    // InternalMyDsl.g:6526:1: rule__PieChart__Group__7__Impl : ( RULE_LIST_START ) ;
    public final void rule__PieChart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6530:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:6531:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:6531:1: ( RULE_LIST_START )
            // InternalMyDsl.g:6532:2: RULE_LIST_START
            {
             before(grammarAccess.getPieChartAccess().getLIST_STARTTerminalRuleCall_7()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getLIST_STARTTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__7__Impl"


    // $ANTLR start "rule__PieChart__Group__8"
    // InternalMyDsl.g:6541:1: rule__PieChart__Group__8 : rule__PieChart__Group__8__Impl rule__PieChart__Group__9 ;
    public final void rule__PieChart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6545:1: ( rule__PieChart__Group__8__Impl rule__PieChart__Group__9 )
            // InternalMyDsl.g:6546:2: rule__PieChart__Group__8__Impl rule__PieChart__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__PieChart__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__8"


    // $ANTLR start "rule__PieChart__Group__8__Impl"
    // InternalMyDsl.g:6553:1: rule__PieChart__Group__8__Impl : ( ( rule__PieChart__DataAssignment_8 ) ) ;
    public final void rule__PieChart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6557:1: ( ( ( rule__PieChart__DataAssignment_8 ) ) )
            // InternalMyDsl.g:6558:1: ( ( rule__PieChart__DataAssignment_8 ) )
            {
            // InternalMyDsl.g:6558:1: ( ( rule__PieChart__DataAssignment_8 ) )
            // InternalMyDsl.g:6559:2: ( rule__PieChart__DataAssignment_8 )
            {
             before(grammarAccess.getPieChartAccess().getDataAssignment_8()); 
            // InternalMyDsl.g:6560:2: ( rule__PieChart__DataAssignment_8 )
            // InternalMyDsl.g:6560:3: rule__PieChart__DataAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__DataAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPieChartAccess().getDataAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__8__Impl"


    // $ANTLR start "rule__PieChart__Group__9"
    // InternalMyDsl.g:6568:1: rule__PieChart__Group__9 : rule__PieChart__Group__9__Impl rule__PieChart__Group__10 ;
    public final void rule__PieChart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6572:1: ( rule__PieChart__Group__9__Impl rule__PieChart__Group__10 )
            // InternalMyDsl.g:6573:2: rule__PieChart__Group__9__Impl rule__PieChart__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__PieChart__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__9"


    // $ANTLR start "rule__PieChart__Group__9__Impl"
    // InternalMyDsl.g:6580:1: rule__PieChart__Group__9__Impl : ( ( rule__PieChart__Group_9__0 )* ) ;
    public final void rule__PieChart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6584:1: ( ( ( rule__PieChart__Group_9__0 )* ) )
            // InternalMyDsl.g:6585:1: ( ( rule__PieChart__Group_9__0 )* )
            {
            // InternalMyDsl.g:6585:1: ( ( rule__PieChart__Group_9__0 )* )
            // InternalMyDsl.g:6586:2: ( rule__PieChart__Group_9__0 )*
            {
             before(grammarAccess.getPieChartAccess().getGroup_9()); 
            // InternalMyDsl.g:6587:2: ( rule__PieChart__Group_9__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_COMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMyDsl.g:6587:3: rule__PieChart__Group_9__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PieChart__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getPieChartAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__9__Impl"


    // $ANTLR start "rule__PieChart__Group__10"
    // InternalMyDsl.g:6595:1: rule__PieChart__Group__10 : rule__PieChart__Group__10__Impl rule__PieChart__Group__11 ;
    public final void rule__PieChart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6599:1: ( rule__PieChart__Group__10__Impl rule__PieChart__Group__11 )
            // InternalMyDsl.g:6600:2: rule__PieChart__Group__10__Impl rule__PieChart__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__PieChart__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__10"


    // $ANTLR start "rule__PieChart__Group__10__Impl"
    // InternalMyDsl.g:6607:1: rule__PieChart__Group__10__Impl : ( RULE_LIST_END ) ;
    public final void rule__PieChart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6611:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:6612:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:6612:1: ( RULE_LIST_END )
            // InternalMyDsl.g:6613:2: RULE_LIST_END
            {
             before(grammarAccess.getPieChartAccess().getLIST_ENDTerminalRuleCall_10()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getLIST_ENDTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__10__Impl"


    // $ANTLR start "rule__PieChart__Group__11"
    // InternalMyDsl.g:6622:1: rule__PieChart__Group__11 : rule__PieChart__Group__11__Impl rule__PieChart__Group__12 ;
    public final void rule__PieChart__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6626:1: ( rule__PieChart__Group__11__Impl rule__PieChart__Group__12 )
            // InternalMyDsl.g:6627:2: rule__PieChart__Group__11__Impl rule__PieChart__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__PieChart__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__11"


    // $ANTLR start "rule__PieChart__Group__11__Impl"
    // InternalMyDsl.g:6634:1: rule__PieChart__Group__11__Impl : ( 'labels' ) ;
    public final void rule__PieChart__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6638:1: ( ( 'labels' ) )
            // InternalMyDsl.g:6639:1: ( 'labels' )
            {
            // InternalMyDsl.g:6639:1: ( 'labels' )
            // InternalMyDsl.g:6640:2: 'labels'
            {
             before(grammarAccess.getPieChartAccess().getLabelsKeyword_11()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getLabelsKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__11__Impl"


    // $ANTLR start "rule__PieChart__Group__12"
    // InternalMyDsl.g:6649:1: rule__PieChart__Group__12 : rule__PieChart__Group__12__Impl rule__PieChart__Group__13 ;
    public final void rule__PieChart__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6653:1: ( rule__PieChart__Group__12__Impl rule__PieChart__Group__13 )
            // InternalMyDsl.g:6654:2: rule__PieChart__Group__12__Impl rule__PieChart__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__PieChart__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__12"


    // $ANTLR start "rule__PieChart__Group__12__Impl"
    // InternalMyDsl.g:6661:1: rule__PieChart__Group__12__Impl : ( RULE_EQUALS ) ;
    public final void rule__PieChart__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6665:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:6666:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:6666:1: ( RULE_EQUALS )
            // InternalMyDsl.g:6667:2: RULE_EQUALS
            {
             before(grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_12()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getEQUALSTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__12__Impl"


    // $ANTLR start "rule__PieChart__Group__13"
    // InternalMyDsl.g:6676:1: rule__PieChart__Group__13 : rule__PieChart__Group__13__Impl rule__PieChart__Group__14 ;
    public final void rule__PieChart__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6680:1: ( rule__PieChart__Group__13__Impl rule__PieChart__Group__14 )
            // InternalMyDsl.g:6681:2: rule__PieChart__Group__13__Impl rule__PieChart__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__PieChart__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__13"


    // $ANTLR start "rule__PieChart__Group__13__Impl"
    // InternalMyDsl.g:6688:1: rule__PieChart__Group__13__Impl : ( RULE_LIST_START ) ;
    public final void rule__PieChart__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6692:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:6693:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:6693:1: ( RULE_LIST_START )
            // InternalMyDsl.g:6694:2: RULE_LIST_START
            {
             before(grammarAccess.getPieChartAccess().getLIST_STARTTerminalRuleCall_13()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getLIST_STARTTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__13__Impl"


    // $ANTLR start "rule__PieChart__Group__14"
    // InternalMyDsl.g:6703:1: rule__PieChart__Group__14 : rule__PieChart__Group__14__Impl rule__PieChart__Group__15 ;
    public final void rule__PieChart__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6707:1: ( rule__PieChart__Group__14__Impl rule__PieChart__Group__15 )
            // InternalMyDsl.g:6708:2: rule__PieChart__Group__14__Impl rule__PieChart__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__PieChart__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__14"


    // $ANTLR start "rule__PieChart__Group__14__Impl"
    // InternalMyDsl.g:6715:1: rule__PieChart__Group__14__Impl : ( ( rule__PieChart__LabelsAssignment_14 ) ) ;
    public final void rule__PieChart__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6719:1: ( ( ( rule__PieChart__LabelsAssignment_14 ) ) )
            // InternalMyDsl.g:6720:1: ( ( rule__PieChart__LabelsAssignment_14 ) )
            {
            // InternalMyDsl.g:6720:1: ( ( rule__PieChart__LabelsAssignment_14 ) )
            // InternalMyDsl.g:6721:2: ( rule__PieChart__LabelsAssignment_14 )
            {
             before(grammarAccess.getPieChartAccess().getLabelsAssignment_14()); 
            // InternalMyDsl.g:6722:2: ( rule__PieChart__LabelsAssignment_14 )
            // InternalMyDsl.g:6722:3: rule__PieChart__LabelsAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__LabelsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getPieChartAccess().getLabelsAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__14__Impl"


    // $ANTLR start "rule__PieChart__Group__15"
    // InternalMyDsl.g:6730:1: rule__PieChart__Group__15 : rule__PieChart__Group__15__Impl rule__PieChart__Group__16 ;
    public final void rule__PieChart__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6734:1: ( rule__PieChart__Group__15__Impl rule__PieChart__Group__16 )
            // InternalMyDsl.g:6735:2: rule__PieChart__Group__15__Impl rule__PieChart__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__PieChart__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__15"


    // $ANTLR start "rule__PieChart__Group__15__Impl"
    // InternalMyDsl.g:6742:1: rule__PieChart__Group__15__Impl : ( ( rule__PieChart__Group_15__0 )* ) ;
    public final void rule__PieChart__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6746:1: ( ( ( rule__PieChart__Group_15__0 )* ) )
            // InternalMyDsl.g:6747:1: ( ( rule__PieChart__Group_15__0 )* )
            {
            // InternalMyDsl.g:6747:1: ( ( rule__PieChart__Group_15__0 )* )
            // InternalMyDsl.g:6748:2: ( rule__PieChart__Group_15__0 )*
            {
             before(grammarAccess.getPieChartAccess().getGroup_15()); 
            // InternalMyDsl.g:6749:2: ( rule__PieChart__Group_15__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_COMA) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMyDsl.g:6749:3: rule__PieChart__Group_15__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PieChart__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getPieChartAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__15__Impl"


    // $ANTLR start "rule__PieChart__Group__16"
    // InternalMyDsl.g:6757:1: rule__PieChart__Group__16 : rule__PieChart__Group__16__Impl rule__PieChart__Group__17 ;
    public final void rule__PieChart__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6761:1: ( rule__PieChart__Group__16__Impl rule__PieChart__Group__17 )
            // InternalMyDsl.g:6762:2: rule__PieChart__Group__16__Impl rule__PieChart__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__PieChart__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__16"


    // $ANTLR start "rule__PieChart__Group__16__Impl"
    // InternalMyDsl.g:6769:1: rule__PieChart__Group__16__Impl : ( RULE_LIST_END ) ;
    public final void rule__PieChart__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6773:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:6774:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:6774:1: ( RULE_LIST_END )
            // InternalMyDsl.g:6775:2: RULE_LIST_END
            {
             before(grammarAccess.getPieChartAccess().getLIST_ENDTerminalRuleCall_16()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getLIST_ENDTerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__16__Impl"


    // $ANTLR start "rule__PieChart__Group__17"
    // InternalMyDsl.g:6784:1: rule__PieChart__Group__17 : rule__PieChart__Group__17__Impl ;
    public final void rule__PieChart__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6788:1: ( rule__PieChart__Group__17__Impl )
            // InternalMyDsl.g:6789:2: rule__PieChart__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__17"


    // $ANTLR start "rule__PieChart__Group__17__Impl"
    // InternalMyDsl.g:6795:1: rule__PieChart__Group__17__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__PieChart__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6799:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:6800:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:6800:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:6801:2: RULE_OBJECT_END
            {
             before(grammarAccess.getPieChartAccess().getOBJECT_ENDTerminalRuleCall_17()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getOBJECT_ENDTerminalRuleCall_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__17__Impl"


    // $ANTLR start "rule__PieChart__Group_3__0"
    // InternalMyDsl.g:6811:1: rule__PieChart__Group_3__0 : rule__PieChart__Group_3__0__Impl rule__PieChart__Group_3__1 ;
    public final void rule__PieChart__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6815:1: ( rule__PieChart__Group_3__0__Impl rule__PieChart__Group_3__1 )
            // InternalMyDsl.g:6816:2: rule__PieChart__Group_3__0__Impl rule__PieChart__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__PieChart__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_3__0"


    // $ANTLR start "rule__PieChart__Group_3__0__Impl"
    // InternalMyDsl.g:6823:1: rule__PieChart__Group_3__0__Impl : ( 'title' ) ;
    public final void rule__PieChart__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6827:1: ( ( 'title' ) )
            // InternalMyDsl.g:6828:1: ( 'title' )
            {
            // InternalMyDsl.g:6828:1: ( 'title' )
            // InternalMyDsl.g:6829:2: 'title'
            {
             before(grammarAccess.getPieChartAccess().getTitleKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getTitleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_3__0__Impl"


    // $ANTLR start "rule__PieChart__Group_3__1"
    // InternalMyDsl.g:6838:1: rule__PieChart__Group_3__1 : rule__PieChart__Group_3__1__Impl ;
    public final void rule__PieChart__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6842:1: ( rule__PieChart__Group_3__1__Impl )
            // InternalMyDsl.g:6843:2: rule__PieChart__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_3__1"


    // $ANTLR start "rule__PieChart__Group_3__1__Impl"
    // InternalMyDsl.g:6849:1: rule__PieChart__Group_3__1__Impl : ( ( rule__PieChart__TitleAssignment_3_1 ) ) ;
    public final void rule__PieChart__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6853:1: ( ( ( rule__PieChart__TitleAssignment_3_1 ) ) )
            // InternalMyDsl.g:6854:1: ( ( rule__PieChart__TitleAssignment_3_1 ) )
            {
            // InternalMyDsl.g:6854:1: ( ( rule__PieChart__TitleAssignment_3_1 ) )
            // InternalMyDsl.g:6855:2: ( rule__PieChart__TitleAssignment_3_1 )
            {
             before(grammarAccess.getPieChartAccess().getTitleAssignment_3_1()); 
            // InternalMyDsl.g:6856:2: ( rule__PieChart__TitleAssignment_3_1 )
            // InternalMyDsl.g:6856:3: rule__PieChart__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__TitleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPieChartAccess().getTitleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_3__1__Impl"


    // $ANTLR start "rule__PieChart__Group_4__0"
    // InternalMyDsl.g:6865:1: rule__PieChart__Group_4__0 : rule__PieChart__Group_4__0__Impl rule__PieChart__Group_4__1 ;
    public final void rule__PieChart__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6869:1: ( rule__PieChart__Group_4__0__Impl rule__PieChart__Group_4__1 )
            // InternalMyDsl.g:6870:2: rule__PieChart__Group_4__0__Impl rule__PieChart__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__PieChart__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_4__0"


    // $ANTLR start "rule__PieChart__Group_4__0__Impl"
    // InternalMyDsl.g:6877:1: rule__PieChart__Group_4__0__Impl : ( 'legendPosition' ) ;
    public final void rule__PieChart__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6881:1: ( ( 'legendPosition' ) )
            // InternalMyDsl.g:6882:1: ( 'legendPosition' )
            {
            // InternalMyDsl.g:6882:1: ( 'legendPosition' )
            // InternalMyDsl.g:6883:2: 'legendPosition'
            {
             before(grammarAccess.getPieChartAccess().getLegendPositionKeyword_4_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getLegendPositionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_4__0__Impl"


    // $ANTLR start "rule__PieChart__Group_4__1"
    // InternalMyDsl.g:6892:1: rule__PieChart__Group_4__1 : rule__PieChart__Group_4__1__Impl ;
    public final void rule__PieChart__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6896:1: ( rule__PieChart__Group_4__1__Impl )
            // InternalMyDsl.g:6897:2: rule__PieChart__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_4__1"


    // $ANTLR start "rule__PieChart__Group_4__1__Impl"
    // InternalMyDsl.g:6903:1: rule__PieChart__Group_4__1__Impl : ( ( rule__PieChart__LegendPositionAssignment_4_1 ) ) ;
    public final void rule__PieChart__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6907:1: ( ( ( rule__PieChart__LegendPositionAssignment_4_1 ) ) )
            // InternalMyDsl.g:6908:1: ( ( rule__PieChart__LegendPositionAssignment_4_1 ) )
            {
            // InternalMyDsl.g:6908:1: ( ( rule__PieChart__LegendPositionAssignment_4_1 ) )
            // InternalMyDsl.g:6909:2: ( rule__PieChart__LegendPositionAssignment_4_1 )
            {
             before(grammarAccess.getPieChartAccess().getLegendPositionAssignment_4_1()); 
            // InternalMyDsl.g:6910:2: ( rule__PieChart__LegendPositionAssignment_4_1 )
            // InternalMyDsl.g:6910:3: rule__PieChart__LegendPositionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__LegendPositionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPieChartAccess().getLegendPositionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_4__1__Impl"


    // $ANTLR start "rule__PieChart__Group_9__0"
    // InternalMyDsl.g:6919:1: rule__PieChart__Group_9__0 : rule__PieChart__Group_9__0__Impl rule__PieChart__Group_9__1 ;
    public final void rule__PieChart__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6923:1: ( rule__PieChart__Group_9__0__Impl rule__PieChart__Group_9__1 )
            // InternalMyDsl.g:6924:2: rule__PieChart__Group_9__0__Impl rule__PieChart__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__PieChart__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_9__0"


    // $ANTLR start "rule__PieChart__Group_9__0__Impl"
    // InternalMyDsl.g:6931:1: rule__PieChart__Group_9__0__Impl : ( RULE_COMA ) ;
    public final void rule__PieChart__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6935:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:6936:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:6936:1: ( RULE_COMA )
            // InternalMyDsl.g:6937:2: RULE_COMA
            {
             before(grammarAccess.getPieChartAccess().getCOMATerminalRuleCall_9_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getCOMATerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_9__0__Impl"


    // $ANTLR start "rule__PieChart__Group_9__1"
    // InternalMyDsl.g:6946:1: rule__PieChart__Group_9__1 : rule__PieChart__Group_9__1__Impl ;
    public final void rule__PieChart__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6950:1: ( rule__PieChart__Group_9__1__Impl )
            // InternalMyDsl.g:6951:2: rule__PieChart__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_9__1"


    // $ANTLR start "rule__PieChart__Group_9__1__Impl"
    // InternalMyDsl.g:6957:1: rule__PieChart__Group_9__1__Impl : ( ( rule__PieChart__DataAssignment_9_1 ) ) ;
    public final void rule__PieChart__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6961:1: ( ( ( rule__PieChart__DataAssignment_9_1 ) ) )
            // InternalMyDsl.g:6962:1: ( ( rule__PieChart__DataAssignment_9_1 ) )
            {
            // InternalMyDsl.g:6962:1: ( ( rule__PieChart__DataAssignment_9_1 ) )
            // InternalMyDsl.g:6963:2: ( rule__PieChart__DataAssignment_9_1 )
            {
             before(grammarAccess.getPieChartAccess().getDataAssignment_9_1()); 
            // InternalMyDsl.g:6964:2: ( rule__PieChart__DataAssignment_9_1 )
            // InternalMyDsl.g:6964:3: rule__PieChart__DataAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__DataAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPieChartAccess().getDataAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_9__1__Impl"


    // $ANTLR start "rule__PieChart__Group_15__0"
    // InternalMyDsl.g:6973:1: rule__PieChart__Group_15__0 : rule__PieChart__Group_15__0__Impl rule__PieChart__Group_15__1 ;
    public final void rule__PieChart__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6977:1: ( rule__PieChart__Group_15__0__Impl rule__PieChart__Group_15__1 )
            // InternalMyDsl.g:6978:2: rule__PieChart__Group_15__0__Impl rule__PieChart__Group_15__1
            {
            pushFollow(FOLLOW_8);
            rule__PieChart__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_15__0"


    // $ANTLR start "rule__PieChart__Group_15__0__Impl"
    // InternalMyDsl.g:6985:1: rule__PieChart__Group_15__0__Impl : ( RULE_COMA ) ;
    public final void rule__PieChart__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6989:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:6990:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:6990:1: ( RULE_COMA )
            // InternalMyDsl.g:6991:2: RULE_COMA
            {
             before(grammarAccess.getPieChartAccess().getCOMATerminalRuleCall_15_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getCOMATerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_15__0__Impl"


    // $ANTLR start "rule__PieChart__Group_15__1"
    // InternalMyDsl.g:7000:1: rule__PieChart__Group_15__1 : rule__PieChart__Group_15__1__Impl ;
    public final void rule__PieChart__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7004:1: ( rule__PieChart__Group_15__1__Impl )
            // InternalMyDsl.g:7005:2: rule__PieChart__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_15__1"


    // $ANTLR start "rule__PieChart__Group_15__1__Impl"
    // InternalMyDsl.g:7011:1: rule__PieChart__Group_15__1__Impl : ( ( rule__PieChart__LabelsAssignment_15_1 ) ) ;
    public final void rule__PieChart__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7015:1: ( ( ( rule__PieChart__LabelsAssignment_15_1 ) ) )
            // InternalMyDsl.g:7016:1: ( ( rule__PieChart__LabelsAssignment_15_1 ) )
            {
            // InternalMyDsl.g:7016:1: ( ( rule__PieChart__LabelsAssignment_15_1 ) )
            // InternalMyDsl.g:7017:2: ( rule__PieChart__LabelsAssignment_15_1 )
            {
             before(grammarAccess.getPieChartAccess().getLabelsAssignment_15_1()); 
            // InternalMyDsl.g:7018:2: ( rule__PieChart__LabelsAssignment_15_1 )
            // InternalMyDsl.g:7018:3: rule__PieChart__LabelsAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__LabelsAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getPieChartAccess().getLabelsAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group_15__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalMyDsl.g:7027:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7031:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalMyDsl.g:7032:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalMyDsl.g:7039:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7043:1: ( ( () ) )
            // InternalMyDsl.g:7044:1: ( () )
            {
            // InternalMyDsl.g:7044:1: ( () )
            // InternalMyDsl.g:7045:2: ()
            {
             before(grammarAccess.getActionAccess().getActionAction_0()); 
            // InternalMyDsl.g:7046:2: ()
            // InternalMyDsl.g:7046:3: 
            {
            }

             after(grammarAccess.getActionAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalMyDsl.g:7054:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7058:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalMyDsl.g:7059:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalMyDsl.g:7066:1: rule__Action__Group__1__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7070:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:7071:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:7071:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:7072:2: RULE_OBJECT_START
            {
             before(grammarAccess.getActionAccess().getOBJECT_STARTTerminalRuleCall_1()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getOBJECT_STARTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalMyDsl.g:7081:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7085:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalMyDsl.g:7086:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalMyDsl.g:7093:1: rule__Action__Group__2__Impl : ( ( rule__Action__NameAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7097:1: ( ( ( rule__Action__NameAssignment_2 ) ) )
            // InternalMyDsl.g:7098:1: ( ( rule__Action__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:7098:1: ( ( rule__Action__NameAssignment_2 ) )
            // InternalMyDsl.g:7099:2: ( rule__Action__NameAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:7100:2: ( rule__Action__NameAssignment_2 )
            // InternalMyDsl.g:7100:3: rule__Action__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalMyDsl.g:7108:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7112:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalMyDsl.g:7113:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalMyDsl.g:7120:1: rule__Action__Group__3__Impl : ( ( rule__Action__Group_3__0 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7124:1: ( ( ( rule__Action__Group_3__0 )? ) )
            // InternalMyDsl.g:7125:1: ( ( rule__Action__Group_3__0 )? )
            {
            // InternalMyDsl.g:7125:1: ( ( rule__Action__Group_3__0 )? )
            // InternalMyDsl.g:7126:2: ( rule__Action__Group_3__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // InternalMyDsl.g:7127:2: ( rule__Action__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==65) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:7127:3: rule__Action__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalMyDsl.g:7135:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7139:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalMyDsl.g:7140:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalMyDsl.g:7147:1: rule__Action__Group__4__Impl : ( ( rule__Action__Group_4__0 )? ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7151:1: ( ( ( rule__Action__Group_4__0 )? ) )
            // InternalMyDsl.g:7152:1: ( ( rule__Action__Group_4__0 )? )
            {
            // InternalMyDsl.g:7152:1: ( ( rule__Action__Group_4__0 )? )
            // InternalMyDsl.g:7153:2: ( rule__Action__Group_4__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_4()); 
            // InternalMyDsl.g:7154:2: ( rule__Action__Group_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==66) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:7154:3: rule__Action__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalMyDsl.g:7162:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7166:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalMyDsl.g:7167:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Action__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalMyDsl.g:7174:1: rule__Action__Group__5__Impl : ( ( rule__Action__AddAssignment_5 )? ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7178:1: ( ( ( rule__Action__AddAssignment_5 )? ) )
            // InternalMyDsl.g:7179:1: ( ( rule__Action__AddAssignment_5 )? )
            {
            // InternalMyDsl.g:7179:1: ( ( rule__Action__AddAssignment_5 )? )
            // InternalMyDsl.g:7180:2: ( rule__Action__AddAssignment_5 )?
            {
             before(grammarAccess.getActionAccess().getAddAssignment_5()); 
            // InternalMyDsl.g:7181:2: ( rule__Action__AddAssignment_5 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==82) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:7181:3: rule__Action__AddAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__AddAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getAddAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // InternalMyDsl.g:7189:1: rule__Action__Group__6 : rule__Action__Group__6__Impl rule__Action__Group__7 ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7193:1: ( rule__Action__Group__6__Impl rule__Action__Group__7 )
            // InternalMyDsl.g:7194:2: rule__Action__Group__6__Impl rule__Action__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Action__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // InternalMyDsl.g:7201:1: rule__Action__Group__6__Impl : ( ( rule__Action__FilterAssignment_6 )? ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7205:1: ( ( ( rule__Action__FilterAssignment_6 )? ) )
            // InternalMyDsl.g:7206:1: ( ( rule__Action__FilterAssignment_6 )? )
            {
            // InternalMyDsl.g:7206:1: ( ( rule__Action__FilterAssignment_6 )? )
            // InternalMyDsl.g:7207:2: ( rule__Action__FilterAssignment_6 )?
            {
             before(grammarAccess.getActionAccess().getFilterAssignment_6()); 
            // InternalMyDsl.g:7208:2: ( rule__Action__FilterAssignment_6 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==86) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:7208:3: rule__Action__FilterAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__FilterAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getFilterAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__Action__Group__7"
    // InternalMyDsl.g:7216:1: rule__Action__Group__7 : rule__Action__Group__7__Impl rule__Action__Group__8 ;
    public final void rule__Action__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7220:1: ( rule__Action__Group__7__Impl rule__Action__Group__8 )
            // InternalMyDsl.g:7221:2: rule__Action__Group__7__Impl rule__Action__Group__8
            {
            pushFollow(FOLLOW_31);
            rule__Action__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7"


    // $ANTLR start "rule__Action__Group__7__Impl"
    // InternalMyDsl.g:7228:1: rule__Action__Group__7__Impl : ( ( rule__Action__EditAssignment_7 )? ) ;
    public final void rule__Action__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7232:1: ( ( ( rule__Action__EditAssignment_7 )? ) )
            // InternalMyDsl.g:7233:1: ( ( rule__Action__EditAssignment_7 )? )
            {
            // InternalMyDsl.g:7233:1: ( ( rule__Action__EditAssignment_7 )? )
            // InternalMyDsl.g:7234:2: ( rule__Action__EditAssignment_7 )?
            {
             before(grammarAccess.getActionAccess().getEditAssignment_7()); 
            // InternalMyDsl.g:7235:2: ( rule__Action__EditAssignment_7 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==87) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:7235:3: rule__Action__EditAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__EditAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getEditAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7__Impl"


    // $ANTLR start "rule__Action__Group__8"
    // InternalMyDsl.g:7243:1: rule__Action__Group__8 : rule__Action__Group__8__Impl rule__Action__Group__9 ;
    public final void rule__Action__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7247:1: ( rule__Action__Group__8__Impl rule__Action__Group__9 )
            // InternalMyDsl.g:7248:2: rule__Action__Group__8__Impl rule__Action__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__Action__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__8"


    // $ANTLR start "rule__Action__Group__8__Impl"
    // InternalMyDsl.g:7255:1: rule__Action__Group__8__Impl : ( ( rule__Action__DeleteAssignment_8 )? ) ;
    public final void rule__Action__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7259:1: ( ( ( rule__Action__DeleteAssignment_8 )? ) )
            // InternalMyDsl.g:7260:1: ( ( rule__Action__DeleteAssignment_8 )? )
            {
            // InternalMyDsl.g:7260:1: ( ( rule__Action__DeleteAssignment_8 )? )
            // InternalMyDsl.g:7261:2: ( rule__Action__DeleteAssignment_8 )?
            {
             before(grammarAccess.getActionAccess().getDeleteAssignment_8()); 
            // InternalMyDsl.g:7262:2: ( rule__Action__DeleteAssignment_8 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==88) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:7262:3: rule__Action__DeleteAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__DeleteAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getDeleteAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__8__Impl"


    // $ANTLR start "rule__Action__Group__9"
    // InternalMyDsl.g:7270:1: rule__Action__Group__9 : rule__Action__Group__9__Impl ;
    public final void rule__Action__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7274:1: ( rule__Action__Group__9__Impl )
            // InternalMyDsl.g:7275:2: rule__Action__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__9"


    // $ANTLR start "rule__Action__Group__9__Impl"
    // InternalMyDsl.g:7281:1: rule__Action__Group__9__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Action__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7285:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:7286:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:7286:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:7287:2: RULE_OBJECT_END
            {
             before(grammarAccess.getActionAccess().getOBJECT_ENDTerminalRuleCall_9()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getOBJECT_ENDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__9__Impl"


    // $ANTLR start "rule__Action__Group_3__0"
    // InternalMyDsl.g:7297:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7301:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // InternalMyDsl.g:7302:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__0"


    // $ANTLR start "rule__Action__Group_3__0__Impl"
    // InternalMyDsl.g:7309:1: rule__Action__Group_3__0__Impl : ( 'columnTitle' ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7313:1: ( ( 'columnTitle' ) )
            // InternalMyDsl.g:7314:1: ( 'columnTitle' )
            {
            // InternalMyDsl.g:7314:1: ( 'columnTitle' )
            // InternalMyDsl.g:7315:2: 'columnTitle'
            {
             before(grammarAccess.getActionAccess().getColumnTitleKeyword_3_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getColumnTitleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__0__Impl"


    // $ANTLR start "rule__Action__Group_3__1"
    // InternalMyDsl.g:7324:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7328:1: ( rule__Action__Group_3__1__Impl )
            // InternalMyDsl.g:7329:2: rule__Action__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__1"


    // $ANTLR start "rule__Action__Group_3__1__Impl"
    // InternalMyDsl.g:7335:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__ColumnTitleAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7339:1: ( ( ( rule__Action__ColumnTitleAssignment_3_1 ) ) )
            // InternalMyDsl.g:7340:1: ( ( rule__Action__ColumnTitleAssignment_3_1 ) )
            {
            // InternalMyDsl.g:7340:1: ( ( rule__Action__ColumnTitleAssignment_3_1 ) )
            // InternalMyDsl.g:7341:2: ( rule__Action__ColumnTitleAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getColumnTitleAssignment_3_1()); 
            // InternalMyDsl.g:7342:2: ( rule__Action__ColumnTitleAssignment_3_1 )
            // InternalMyDsl.g:7342:3: rule__Action__ColumnTitleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ColumnTitleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getColumnTitleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__1__Impl"


    // $ANTLR start "rule__Action__Group_4__0"
    // InternalMyDsl.g:7351:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7355:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // InternalMyDsl.g:7356:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__Action__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0"


    // $ANTLR start "rule__Action__Group_4__0__Impl"
    // InternalMyDsl.g:7363:1: rule__Action__Group_4__0__Impl : ( 'position' ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7367:1: ( ( 'position' ) )
            // InternalMyDsl.g:7368:1: ( 'position' )
            {
            // InternalMyDsl.g:7368:1: ( 'position' )
            // InternalMyDsl.g:7369:2: 'position'
            {
             before(grammarAccess.getActionAccess().getPositionKeyword_4_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getPositionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0__Impl"


    // $ANTLR start "rule__Action__Group_4__1"
    // InternalMyDsl.g:7378:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7382:1: ( rule__Action__Group_4__1__Impl )
            // InternalMyDsl.g:7383:2: rule__Action__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1"


    // $ANTLR start "rule__Action__Group_4__1__Impl"
    // InternalMyDsl.g:7389:1: rule__Action__Group_4__1__Impl : ( ( rule__Action__PositionAssignment_4_1 ) ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7393:1: ( ( ( rule__Action__PositionAssignment_4_1 ) ) )
            // InternalMyDsl.g:7394:1: ( ( rule__Action__PositionAssignment_4_1 ) )
            {
            // InternalMyDsl.g:7394:1: ( ( rule__Action__PositionAssignment_4_1 ) )
            // InternalMyDsl.g:7395:2: ( rule__Action__PositionAssignment_4_1 )
            {
             before(grammarAccess.getActionAccess().getPositionAssignment_4_1()); 
            // InternalMyDsl.g:7396:2: ( rule__Action__PositionAssignment_4_1 )
            // InternalMyDsl.g:7396:3: rule__Action__PositionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__PositionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getPositionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalMyDsl.g:7405:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7409:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalMyDsl.g:7410:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalMyDsl.g:7417:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7421:1: ( ( () ) )
            // InternalMyDsl.g:7422:1: ( () )
            {
            // InternalMyDsl.g:7422:1: ( () )
            // InternalMyDsl.g:7423:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalMyDsl.g:7424:2: ()
            // InternalMyDsl.g:7424:3: 
            {
            }

             after(grammarAccess.getColumnAccess().getColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalMyDsl.g:7432:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7436:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalMyDsl.g:7437:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalMyDsl.g:7444:1: rule__Column__Group__1__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7448:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:7449:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:7449:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:7450:2: RULE_OBJECT_START
            {
             before(grammarAccess.getColumnAccess().getOBJECT_STARTTerminalRuleCall_1()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getOBJECT_STARTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalMyDsl.g:7459:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7463:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalMyDsl.g:7464:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalMyDsl.g:7471:1: rule__Column__Group__2__Impl : ( ( rule__Column__NameAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7475:1: ( ( ( rule__Column__NameAssignment_2 ) ) )
            // InternalMyDsl.g:7476:1: ( ( rule__Column__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:7476:1: ( ( rule__Column__NameAssignment_2 ) )
            // InternalMyDsl.g:7477:2: ( rule__Column__NameAssignment_2 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:7478:2: ( rule__Column__NameAssignment_2 )
            // InternalMyDsl.g:7478:3: rule__Column__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalMyDsl.g:7486:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7490:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalMyDsl.g:7491:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Column__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalMyDsl.g:7498:1: rule__Column__Group__3__Impl : ( ( rule__Column__Group_3__0 )? ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7502:1: ( ( ( rule__Column__Group_3__0 )? ) )
            // InternalMyDsl.g:7503:1: ( ( rule__Column__Group_3__0 )? )
            {
            // InternalMyDsl.g:7503:1: ( ( rule__Column__Group_3__0 )? )
            // InternalMyDsl.g:7504:2: ( rule__Column__Group_3__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_3()); 
            // InternalMyDsl.g:7505:2: ( rule__Column__Group_3__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==49) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:7505:3: rule__Column__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__4"
    // InternalMyDsl.g:7513:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7517:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalMyDsl.g:7518:2: rule__Column__Group__4__Impl rule__Column__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Column__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // InternalMyDsl.g:7525:1: rule__Column__Group__4__Impl : ( ( rule__Column__Group_4__0 )? ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7529:1: ( ( ( rule__Column__Group_4__0 )? ) )
            // InternalMyDsl.g:7530:1: ( ( rule__Column__Group_4__0 )? )
            {
            // InternalMyDsl.g:7530:1: ( ( rule__Column__Group_4__0 )? )
            // InternalMyDsl.g:7531:2: ( rule__Column__Group_4__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_4()); 
            // InternalMyDsl.g:7532:2: ( rule__Column__Group_4__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==67) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:7532:3: rule__Column__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__5"
    // InternalMyDsl.g:7540:1: rule__Column__Group__5 : rule__Column__Group__5__Impl rule__Column__Group__6 ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7544:1: ( rule__Column__Group__5__Impl rule__Column__Group__6 )
            // InternalMyDsl.g:7545:2: rule__Column__Group__5__Impl rule__Column__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__Column__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5"


    // $ANTLR start "rule__Column__Group__5__Impl"
    // InternalMyDsl.g:7552:1: rule__Column__Group__5__Impl : ( ( rule__Column__FilterAssignment_5 )? ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7556:1: ( ( ( rule__Column__FilterAssignment_5 )? ) )
            // InternalMyDsl.g:7557:1: ( ( rule__Column__FilterAssignment_5 )? )
            {
            // InternalMyDsl.g:7557:1: ( ( rule__Column__FilterAssignment_5 )? )
            // InternalMyDsl.g:7558:2: ( rule__Column__FilterAssignment_5 )?
            {
             before(grammarAccess.getColumnAccess().getFilterAssignment_5()); 
            // InternalMyDsl.g:7559:2: ( rule__Column__FilterAssignment_5 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==86) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:7559:3: rule__Column__FilterAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__FilterAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getFilterAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5__Impl"


    // $ANTLR start "rule__Column__Group__6"
    // InternalMyDsl.g:7567:1: rule__Column__Group__6 : rule__Column__Group__6__Impl rule__Column__Group__7 ;
    public final void rule__Column__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7571:1: ( rule__Column__Group__6__Impl rule__Column__Group__7 )
            // InternalMyDsl.g:7572:2: rule__Column__Group__6__Impl rule__Column__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__Column__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__6"


    // $ANTLR start "rule__Column__Group__6__Impl"
    // InternalMyDsl.g:7579:1: rule__Column__Group__6__Impl : ( ( rule__Column__EditableAssignment_6 )? ) ;
    public final void rule__Column__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7583:1: ( ( ( rule__Column__EditableAssignment_6 )? ) )
            // InternalMyDsl.g:7584:1: ( ( rule__Column__EditableAssignment_6 )? )
            {
            // InternalMyDsl.g:7584:1: ( ( rule__Column__EditableAssignment_6 )? )
            // InternalMyDsl.g:7585:2: ( rule__Column__EditableAssignment_6 )?
            {
             before(grammarAccess.getColumnAccess().getEditableAssignment_6()); 
            // InternalMyDsl.g:7586:2: ( rule__Column__EditableAssignment_6 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==89) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:7586:3: rule__Column__EditableAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__EditableAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getEditableAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__6__Impl"


    // $ANTLR start "rule__Column__Group__7"
    // InternalMyDsl.g:7594:1: rule__Column__Group__7 : rule__Column__Group__7__Impl ;
    public final void rule__Column__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7598:1: ( rule__Column__Group__7__Impl )
            // InternalMyDsl.g:7599:2: rule__Column__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__7"


    // $ANTLR start "rule__Column__Group__7__Impl"
    // InternalMyDsl.g:7605:1: rule__Column__Group__7__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Column__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7609:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:7610:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:7610:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:7611:2: RULE_OBJECT_END
            {
             before(grammarAccess.getColumnAccess().getOBJECT_ENDTerminalRuleCall_7()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getOBJECT_ENDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__7__Impl"


    // $ANTLR start "rule__Column__Group_3__0"
    // InternalMyDsl.g:7621:1: rule__Column__Group_3__0 : rule__Column__Group_3__0__Impl rule__Column__Group_3__1 ;
    public final void rule__Column__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7625:1: ( rule__Column__Group_3__0__Impl rule__Column__Group_3__1 )
            // InternalMyDsl.g:7626:2: rule__Column__Group_3__0__Impl rule__Column__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Column__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_3__0"


    // $ANTLR start "rule__Column__Group_3__0__Impl"
    // InternalMyDsl.g:7633:1: rule__Column__Group_3__0__Impl : ( 'title' ) ;
    public final void rule__Column__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7637:1: ( ( 'title' ) )
            // InternalMyDsl.g:7638:1: ( 'title' )
            {
            // InternalMyDsl.g:7638:1: ( 'title' )
            // InternalMyDsl.g:7639:2: 'title'
            {
             before(grammarAccess.getColumnAccess().getTitleKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getTitleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_3__0__Impl"


    // $ANTLR start "rule__Column__Group_3__1"
    // InternalMyDsl.g:7648:1: rule__Column__Group_3__1 : rule__Column__Group_3__1__Impl ;
    public final void rule__Column__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7652:1: ( rule__Column__Group_3__1__Impl )
            // InternalMyDsl.g:7653:2: rule__Column__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_3__1"


    // $ANTLR start "rule__Column__Group_3__1__Impl"
    // InternalMyDsl.g:7659:1: rule__Column__Group_3__1__Impl : ( ( rule__Column__TitleAssignment_3_1 ) ) ;
    public final void rule__Column__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7663:1: ( ( ( rule__Column__TitleAssignment_3_1 ) ) )
            // InternalMyDsl.g:7664:1: ( ( rule__Column__TitleAssignment_3_1 ) )
            {
            // InternalMyDsl.g:7664:1: ( ( rule__Column__TitleAssignment_3_1 ) )
            // InternalMyDsl.g:7665:2: ( rule__Column__TitleAssignment_3_1 )
            {
             before(grammarAccess.getColumnAccess().getTitleAssignment_3_1()); 
            // InternalMyDsl.g:7666:2: ( rule__Column__TitleAssignment_3_1 )
            // InternalMyDsl.g:7666:3: rule__Column__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__TitleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getTitleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_3__1__Impl"


    // $ANTLR start "rule__Column__Group_4__0"
    // InternalMyDsl.g:7675:1: rule__Column__Group_4__0 : rule__Column__Group_4__0__Impl rule__Column__Group_4__1 ;
    public final void rule__Column__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7679:1: ( rule__Column__Group_4__0__Impl rule__Column__Group_4__1 )
            // InternalMyDsl.g:7680:2: rule__Column__Group_4__0__Impl rule__Column__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Column__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__0"


    // $ANTLR start "rule__Column__Group_4__0__Impl"
    // InternalMyDsl.g:7687:1: rule__Column__Group_4__0__Impl : ( 'source' ) ;
    public final void rule__Column__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7691:1: ( ( 'source' ) )
            // InternalMyDsl.g:7692:1: ( 'source' )
            {
            // InternalMyDsl.g:7692:1: ( 'source' )
            // InternalMyDsl.g:7693:2: 'source'
            {
             before(grammarAccess.getColumnAccess().getSourceKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getSourceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__0__Impl"


    // $ANTLR start "rule__Column__Group_4__1"
    // InternalMyDsl.g:7702:1: rule__Column__Group_4__1 : rule__Column__Group_4__1__Impl ;
    public final void rule__Column__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7706:1: ( rule__Column__Group_4__1__Impl )
            // InternalMyDsl.g:7707:2: rule__Column__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__1"


    // $ANTLR start "rule__Column__Group_4__1__Impl"
    // InternalMyDsl.g:7713:1: rule__Column__Group_4__1__Impl : ( ( rule__Column__SourceAssignment_4_1 ) ) ;
    public final void rule__Column__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7717:1: ( ( ( rule__Column__SourceAssignment_4_1 ) ) )
            // InternalMyDsl.g:7718:1: ( ( rule__Column__SourceAssignment_4_1 ) )
            {
            // InternalMyDsl.g:7718:1: ( ( rule__Column__SourceAssignment_4_1 ) )
            // InternalMyDsl.g:7719:2: ( rule__Column__SourceAssignment_4_1 )
            {
             before(grammarAccess.getColumnAccess().getSourceAssignment_4_1()); 
            // InternalMyDsl.g:7720:2: ( rule__Column__SourceAssignment_4_1 )
            // InternalMyDsl.g:7720:3: rule__Column__SourceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__SourceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getSourceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__1__Impl"


    // $ANTLR start "rule__Data__Group__0"
    // InternalMyDsl.g:7729:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7733:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalMyDsl.g:7734:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__0"


    // $ANTLR start "rule__Data__Group__0__Impl"
    // InternalMyDsl.g:7741:1: rule__Data__Group__0__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7745:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:7746:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:7746:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:7747:2: RULE_OBJECT_START
            {
             before(grammarAccess.getDataAccess().getOBJECT_STARTTerminalRuleCall_0()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getOBJECT_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__0__Impl"


    // $ANTLR start "rule__Data__Group__1"
    // InternalMyDsl.g:7756:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7760:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalMyDsl.g:7761:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Data__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__1"


    // $ANTLR start "rule__Data__Group__1__Impl"
    // InternalMyDsl.g:7768:1: rule__Data__Group__1__Impl : ( ( rule__Data__NameAssignment_1 ) ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7772:1: ( ( ( rule__Data__NameAssignment_1 ) ) )
            // InternalMyDsl.g:7773:1: ( ( rule__Data__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:7773:1: ( ( rule__Data__NameAssignment_1 ) )
            // InternalMyDsl.g:7774:2: ( rule__Data__NameAssignment_1 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:7775:2: ( rule__Data__NameAssignment_1 )
            // InternalMyDsl.g:7775:3: rule__Data__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__1__Impl"


    // $ANTLR start "rule__Data__Group__2"
    // InternalMyDsl.g:7783:1: rule__Data__Group__2 : rule__Data__Group__2__Impl rule__Data__Group__3 ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7787:1: ( rule__Data__Group__2__Impl rule__Data__Group__3 )
            // InternalMyDsl.g:7788:2: rule__Data__Group__2__Impl rule__Data__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Data__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__2"


    // $ANTLR start "rule__Data__Group__2__Impl"
    // InternalMyDsl.g:7795:1: rule__Data__Group__2__Impl : ( ( rule__Data__Group_2__0 )? ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7799:1: ( ( ( rule__Data__Group_2__0 )? ) )
            // InternalMyDsl.g:7800:1: ( ( rule__Data__Group_2__0 )? )
            {
            // InternalMyDsl.g:7800:1: ( ( rule__Data__Group_2__0 )? )
            // InternalMyDsl.g:7801:2: ( rule__Data__Group_2__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_2()); 
            // InternalMyDsl.g:7802:2: ( rule__Data__Group_2__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==70) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:7802:3: rule__Data__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__2__Impl"


    // $ANTLR start "rule__Data__Group__3"
    // InternalMyDsl.g:7810:1: rule__Data__Group__3 : rule__Data__Group__3__Impl rule__Data__Group__4 ;
    public final void rule__Data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7814:1: ( rule__Data__Group__3__Impl rule__Data__Group__4 )
            // InternalMyDsl.g:7815:2: rule__Data__Group__3__Impl rule__Data__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Data__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__3"


    // $ANTLR start "rule__Data__Group__3__Impl"
    // InternalMyDsl.g:7822:1: rule__Data__Group__3__Impl : ( ( rule__Data__Group_3__0 )? ) ;
    public final void rule__Data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7826:1: ( ( ( rule__Data__Group_3__0 )? ) )
            // InternalMyDsl.g:7827:1: ( ( rule__Data__Group_3__0 )? )
            {
            // InternalMyDsl.g:7827:1: ( ( rule__Data__Group_3__0 )? )
            // InternalMyDsl.g:7828:2: ( rule__Data__Group_3__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_3()); 
            // InternalMyDsl.g:7829:2: ( rule__Data__Group_3__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==71) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:7829:3: rule__Data__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__3__Impl"


    // $ANTLR start "rule__Data__Group__4"
    // InternalMyDsl.g:7837:1: rule__Data__Group__4 : rule__Data__Group__4__Impl rule__Data__Group__5 ;
    public final void rule__Data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7841:1: ( rule__Data__Group__4__Impl rule__Data__Group__5 )
            // InternalMyDsl.g:7842:2: rule__Data__Group__4__Impl rule__Data__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__Data__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__4"


    // $ANTLR start "rule__Data__Group__4__Impl"
    // InternalMyDsl.g:7849:1: rule__Data__Group__4__Impl : ( ( rule__Data__Group_4__0 )? ) ;
    public final void rule__Data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7853:1: ( ( ( rule__Data__Group_4__0 )? ) )
            // InternalMyDsl.g:7854:1: ( ( rule__Data__Group_4__0 )? )
            {
            // InternalMyDsl.g:7854:1: ( ( rule__Data__Group_4__0 )? )
            // InternalMyDsl.g:7855:2: ( rule__Data__Group_4__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_4()); 
            // InternalMyDsl.g:7856:2: ( rule__Data__Group_4__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==72) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:7856:3: rule__Data__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__4__Impl"


    // $ANTLR start "rule__Data__Group__5"
    // InternalMyDsl.g:7864:1: rule__Data__Group__5 : rule__Data__Group__5__Impl rule__Data__Group__6 ;
    public final void rule__Data__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7868:1: ( rule__Data__Group__5__Impl rule__Data__Group__6 )
            // InternalMyDsl.g:7869:2: rule__Data__Group__5__Impl rule__Data__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Data__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__5"


    // $ANTLR start "rule__Data__Group__5__Impl"
    // InternalMyDsl.g:7876:1: rule__Data__Group__5__Impl : ( ( rule__Data__Group_5__0 )? ) ;
    public final void rule__Data__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7880:1: ( ( ( rule__Data__Group_5__0 )? ) )
            // InternalMyDsl.g:7881:1: ( ( rule__Data__Group_5__0 )? )
            {
            // InternalMyDsl.g:7881:1: ( ( rule__Data__Group_5__0 )? )
            // InternalMyDsl.g:7882:2: ( rule__Data__Group_5__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_5()); 
            // InternalMyDsl.g:7883:2: ( rule__Data__Group_5__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==73) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:7883:3: rule__Data__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__5__Impl"


    // $ANTLR start "rule__Data__Group__6"
    // InternalMyDsl.g:7891:1: rule__Data__Group__6 : rule__Data__Group__6__Impl rule__Data__Group__7 ;
    public final void rule__Data__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7895:1: ( rule__Data__Group__6__Impl rule__Data__Group__7 )
            // InternalMyDsl.g:7896:2: rule__Data__Group__6__Impl rule__Data__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__Data__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__6"


    // $ANTLR start "rule__Data__Group__6__Impl"
    // InternalMyDsl.g:7903:1: rule__Data__Group__6__Impl : ( ( rule__Data__FillAssignment_6 )? ) ;
    public final void rule__Data__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7907:1: ( ( ( rule__Data__FillAssignment_6 )? ) )
            // InternalMyDsl.g:7908:1: ( ( rule__Data__FillAssignment_6 )? )
            {
            // InternalMyDsl.g:7908:1: ( ( rule__Data__FillAssignment_6 )? )
            // InternalMyDsl.g:7909:2: ( rule__Data__FillAssignment_6 )?
            {
             before(grammarAccess.getDataAccess().getFillAssignment_6()); 
            // InternalMyDsl.g:7910:2: ( rule__Data__FillAssignment_6 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==90) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:7910:3: rule__Data__FillAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__FillAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getFillAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__6__Impl"


    // $ANTLR start "rule__Data__Group__7"
    // InternalMyDsl.g:7918:1: rule__Data__Group__7 : rule__Data__Group__7__Impl rule__Data__Group__8 ;
    public final void rule__Data__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7922:1: ( rule__Data__Group__7__Impl rule__Data__Group__8 )
            // InternalMyDsl.g:7923:2: rule__Data__Group__7__Impl rule__Data__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__Data__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__7"


    // $ANTLR start "rule__Data__Group__7__Impl"
    // InternalMyDsl.g:7930:1: rule__Data__Group__7__Impl : ( 'data' ) ;
    public final void rule__Data__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7934:1: ( ( 'data' ) )
            // InternalMyDsl.g:7935:1: ( 'data' )
            {
            // InternalMyDsl.g:7935:1: ( 'data' )
            // InternalMyDsl.g:7936:2: 'data'
            {
             before(grammarAccess.getDataAccess().getDataKeyword_7()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getDataKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__7__Impl"


    // $ANTLR start "rule__Data__Group__8"
    // InternalMyDsl.g:7945:1: rule__Data__Group__8 : rule__Data__Group__8__Impl rule__Data__Group__9 ;
    public final void rule__Data__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7949:1: ( rule__Data__Group__8__Impl rule__Data__Group__9 )
            // InternalMyDsl.g:7950:2: rule__Data__Group__8__Impl rule__Data__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Data__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__8"


    // $ANTLR start "rule__Data__Group__8__Impl"
    // InternalMyDsl.g:7957:1: rule__Data__Group__8__Impl : ( '(' ) ;
    public final void rule__Data__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7961:1: ( ( '(' ) )
            // InternalMyDsl.g:7962:1: ( '(' )
            {
            // InternalMyDsl.g:7962:1: ( '(' )
            // InternalMyDsl.g:7963:2: '('
            {
             before(grammarAccess.getDataAccess().getLeftParenthesisKeyword_8()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getLeftParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__8__Impl"


    // $ANTLR start "rule__Data__Group__9"
    // InternalMyDsl.g:7972:1: rule__Data__Group__9 : rule__Data__Group__9__Impl rule__Data__Group__10 ;
    public final void rule__Data__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7976:1: ( rule__Data__Group__9__Impl rule__Data__Group__10 )
            // InternalMyDsl.g:7977:2: rule__Data__Group__9__Impl rule__Data__Group__10
            {
            pushFollow(FOLLOW_35);
            rule__Data__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__9"


    // $ANTLR start "rule__Data__Group__9__Impl"
    // InternalMyDsl.g:7984:1: rule__Data__Group__9__Impl : ( ( rule__Data__DataAssignment_9 ) ) ;
    public final void rule__Data__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7988:1: ( ( ( rule__Data__DataAssignment_9 ) ) )
            // InternalMyDsl.g:7989:1: ( ( rule__Data__DataAssignment_9 ) )
            {
            // InternalMyDsl.g:7989:1: ( ( rule__Data__DataAssignment_9 ) )
            // InternalMyDsl.g:7990:2: ( rule__Data__DataAssignment_9 )
            {
             before(grammarAccess.getDataAccess().getDataAssignment_9()); 
            // InternalMyDsl.g:7991:2: ( rule__Data__DataAssignment_9 )
            // InternalMyDsl.g:7991:3: rule__Data__DataAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Data__DataAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getDataAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__9__Impl"


    // $ANTLR start "rule__Data__Group__10"
    // InternalMyDsl.g:7999:1: rule__Data__Group__10 : rule__Data__Group__10__Impl rule__Data__Group__11 ;
    public final void rule__Data__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8003:1: ( rule__Data__Group__10__Impl rule__Data__Group__11 )
            // InternalMyDsl.g:8004:2: rule__Data__Group__10__Impl rule__Data__Group__11
            {
            pushFollow(FOLLOW_35);
            rule__Data__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__10"


    // $ANTLR start "rule__Data__Group__10__Impl"
    // InternalMyDsl.g:8011:1: rule__Data__Group__10__Impl : ( ( rule__Data__Group_10__0 )* ) ;
    public final void rule__Data__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8015:1: ( ( ( rule__Data__Group_10__0 )* ) )
            // InternalMyDsl.g:8016:1: ( ( rule__Data__Group_10__0 )* )
            {
            // InternalMyDsl.g:8016:1: ( ( rule__Data__Group_10__0 )* )
            // InternalMyDsl.g:8017:2: ( rule__Data__Group_10__0 )*
            {
             before(grammarAccess.getDataAccess().getGroup_10()); 
            // InternalMyDsl.g:8018:2: ( rule__Data__Group_10__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_COMA) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalMyDsl.g:8018:3: rule__Data__Group_10__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Data__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getDataAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__10__Impl"


    // $ANTLR start "rule__Data__Group__11"
    // InternalMyDsl.g:8026:1: rule__Data__Group__11 : rule__Data__Group__11__Impl rule__Data__Group__12 ;
    public final void rule__Data__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8030:1: ( rule__Data__Group__11__Impl rule__Data__Group__12 )
            // InternalMyDsl.g:8031:2: rule__Data__Group__11__Impl rule__Data__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Data__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__11"


    // $ANTLR start "rule__Data__Group__11__Impl"
    // InternalMyDsl.g:8038:1: rule__Data__Group__11__Impl : ( ')' ) ;
    public final void rule__Data__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8042:1: ( ( ')' ) )
            // InternalMyDsl.g:8043:1: ( ')' )
            {
            // InternalMyDsl.g:8043:1: ( ')' )
            // InternalMyDsl.g:8044:2: ')'
            {
             before(grammarAccess.getDataAccess().getRightParenthesisKeyword_11()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__11__Impl"


    // $ANTLR start "rule__Data__Group__12"
    // InternalMyDsl.g:8053:1: rule__Data__Group__12 : rule__Data__Group__12__Impl ;
    public final void rule__Data__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8057:1: ( rule__Data__Group__12__Impl )
            // InternalMyDsl.g:8058:2: rule__Data__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__12"


    // $ANTLR start "rule__Data__Group__12__Impl"
    // InternalMyDsl.g:8064:1: rule__Data__Group__12__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Data__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8068:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:8069:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:8069:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:8070:2: RULE_OBJECT_END
            {
             before(grammarAccess.getDataAccess().getOBJECT_ENDTerminalRuleCall_12()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getOBJECT_ENDTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__12__Impl"


    // $ANTLR start "rule__Data__Group_2__0"
    // InternalMyDsl.g:8080:1: rule__Data__Group_2__0 : rule__Data__Group_2__0__Impl rule__Data__Group_2__1 ;
    public final void rule__Data__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8084:1: ( rule__Data__Group_2__0__Impl rule__Data__Group_2__1 )
            // InternalMyDsl.g:8085:2: rule__Data__Group_2__0__Impl rule__Data__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Data__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_2__0"


    // $ANTLR start "rule__Data__Group_2__0__Impl"
    // InternalMyDsl.g:8092:1: rule__Data__Group_2__0__Impl : ( 'category' ) ;
    public final void rule__Data__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8096:1: ( ( 'category' ) )
            // InternalMyDsl.g:8097:1: ( 'category' )
            {
            // InternalMyDsl.g:8097:1: ( 'category' )
            // InternalMyDsl.g:8098:2: 'category'
            {
             before(grammarAccess.getDataAccess().getCategoryKeyword_2_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getCategoryKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_2__0__Impl"


    // $ANTLR start "rule__Data__Group_2__1"
    // InternalMyDsl.g:8107:1: rule__Data__Group_2__1 : rule__Data__Group_2__1__Impl ;
    public final void rule__Data__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8111:1: ( rule__Data__Group_2__1__Impl )
            // InternalMyDsl.g:8112:2: rule__Data__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_2__1"


    // $ANTLR start "rule__Data__Group_2__1__Impl"
    // InternalMyDsl.g:8118:1: rule__Data__Group_2__1__Impl : ( ( rule__Data__CategoryAssignment_2_1 ) ) ;
    public final void rule__Data__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8122:1: ( ( ( rule__Data__CategoryAssignment_2_1 ) ) )
            // InternalMyDsl.g:8123:1: ( ( rule__Data__CategoryAssignment_2_1 ) )
            {
            // InternalMyDsl.g:8123:1: ( ( rule__Data__CategoryAssignment_2_1 ) )
            // InternalMyDsl.g:8124:2: ( rule__Data__CategoryAssignment_2_1 )
            {
             before(grammarAccess.getDataAccess().getCategoryAssignment_2_1()); 
            // InternalMyDsl.g:8125:2: ( rule__Data__CategoryAssignment_2_1 )
            // InternalMyDsl.g:8125:3: rule__Data__CategoryAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__CategoryAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getCategoryAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_2__1__Impl"


    // $ANTLR start "rule__Data__Group_3__0"
    // InternalMyDsl.g:8134:1: rule__Data__Group_3__0 : rule__Data__Group_3__0__Impl rule__Data__Group_3__1 ;
    public final void rule__Data__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8138:1: ( rule__Data__Group_3__0__Impl rule__Data__Group_3__1 )
            // InternalMyDsl.g:8139:2: rule__Data__Group_3__0__Impl rule__Data__Group_3__1
            {
            pushFollow(FOLLOW_36);
            rule__Data__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_3__0"


    // $ANTLR start "rule__Data__Group_3__0__Impl"
    // InternalMyDsl.g:8146:1: rule__Data__Group_3__0__Impl : ( 'borderColor' ) ;
    public final void rule__Data__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8150:1: ( ( 'borderColor' ) )
            // InternalMyDsl.g:8151:1: ( 'borderColor' )
            {
            // InternalMyDsl.g:8151:1: ( 'borderColor' )
            // InternalMyDsl.g:8152:2: 'borderColor'
            {
             before(grammarAccess.getDataAccess().getBorderColorKeyword_3_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getBorderColorKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_3__0__Impl"


    // $ANTLR start "rule__Data__Group_3__1"
    // InternalMyDsl.g:8161:1: rule__Data__Group_3__1 : rule__Data__Group_3__1__Impl ;
    public final void rule__Data__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8165:1: ( rule__Data__Group_3__1__Impl )
            // InternalMyDsl.g:8166:2: rule__Data__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_3__1"


    // $ANTLR start "rule__Data__Group_3__1__Impl"
    // InternalMyDsl.g:8172:1: rule__Data__Group_3__1__Impl : ( ( rule__Data__BorderColorAssignment_3_1 ) ) ;
    public final void rule__Data__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8176:1: ( ( ( rule__Data__BorderColorAssignment_3_1 ) ) )
            // InternalMyDsl.g:8177:1: ( ( rule__Data__BorderColorAssignment_3_1 ) )
            {
            // InternalMyDsl.g:8177:1: ( ( rule__Data__BorderColorAssignment_3_1 ) )
            // InternalMyDsl.g:8178:2: ( rule__Data__BorderColorAssignment_3_1 )
            {
             before(grammarAccess.getDataAccess().getBorderColorAssignment_3_1()); 
            // InternalMyDsl.g:8179:2: ( rule__Data__BorderColorAssignment_3_1 )
            // InternalMyDsl.g:8179:3: rule__Data__BorderColorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__BorderColorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getBorderColorAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_3__1__Impl"


    // $ANTLR start "rule__Data__Group_4__0"
    // InternalMyDsl.g:8188:1: rule__Data__Group_4__0 : rule__Data__Group_4__0__Impl rule__Data__Group_4__1 ;
    public final void rule__Data__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8192:1: ( rule__Data__Group_4__0__Impl rule__Data__Group_4__1 )
            // InternalMyDsl.g:8193:2: rule__Data__Group_4__0__Impl rule__Data__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__Data__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_4__0"


    // $ANTLR start "rule__Data__Group_4__0__Impl"
    // InternalMyDsl.g:8200:1: rule__Data__Group_4__0__Impl : ( 'backgroundColor' ) ;
    public final void rule__Data__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8204:1: ( ( 'backgroundColor' ) )
            // InternalMyDsl.g:8205:1: ( 'backgroundColor' )
            {
            // InternalMyDsl.g:8205:1: ( 'backgroundColor' )
            // InternalMyDsl.g:8206:2: 'backgroundColor'
            {
             before(grammarAccess.getDataAccess().getBackgroundColorKeyword_4_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getBackgroundColorKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_4__0__Impl"


    // $ANTLR start "rule__Data__Group_4__1"
    // InternalMyDsl.g:8215:1: rule__Data__Group_4__1 : rule__Data__Group_4__1__Impl ;
    public final void rule__Data__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8219:1: ( rule__Data__Group_4__1__Impl )
            // InternalMyDsl.g:8220:2: rule__Data__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_4__1"


    // $ANTLR start "rule__Data__Group_4__1__Impl"
    // InternalMyDsl.g:8226:1: rule__Data__Group_4__1__Impl : ( ( rule__Data__BackgroundColorAssignment_4_1 ) ) ;
    public final void rule__Data__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8230:1: ( ( ( rule__Data__BackgroundColorAssignment_4_1 ) ) )
            // InternalMyDsl.g:8231:1: ( ( rule__Data__BackgroundColorAssignment_4_1 ) )
            {
            // InternalMyDsl.g:8231:1: ( ( rule__Data__BackgroundColorAssignment_4_1 ) )
            // InternalMyDsl.g:8232:2: ( rule__Data__BackgroundColorAssignment_4_1 )
            {
             before(grammarAccess.getDataAccess().getBackgroundColorAssignment_4_1()); 
            // InternalMyDsl.g:8233:2: ( rule__Data__BackgroundColorAssignment_4_1 )
            // InternalMyDsl.g:8233:3: rule__Data__BackgroundColorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__BackgroundColorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getBackgroundColorAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_4__1__Impl"


    // $ANTLR start "rule__Data__Group_5__0"
    // InternalMyDsl.g:8242:1: rule__Data__Group_5__0 : rule__Data__Group_5__0__Impl rule__Data__Group_5__1 ;
    public final void rule__Data__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8246:1: ( rule__Data__Group_5__0__Impl rule__Data__Group_5__1 )
            // InternalMyDsl.g:8247:2: rule__Data__Group_5__0__Impl rule__Data__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Data__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_5__0"


    // $ANTLR start "rule__Data__Group_5__0__Impl"
    // InternalMyDsl.g:8254:1: rule__Data__Group_5__0__Impl : ( 'borderDash' ) ;
    public final void rule__Data__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8258:1: ( ( 'borderDash' ) )
            // InternalMyDsl.g:8259:1: ( 'borderDash' )
            {
            // InternalMyDsl.g:8259:1: ( 'borderDash' )
            // InternalMyDsl.g:8260:2: 'borderDash'
            {
             before(grammarAccess.getDataAccess().getBorderDashKeyword_5_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getBorderDashKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_5__0__Impl"


    // $ANTLR start "rule__Data__Group_5__1"
    // InternalMyDsl.g:8269:1: rule__Data__Group_5__1 : rule__Data__Group_5__1__Impl ;
    public final void rule__Data__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8273:1: ( rule__Data__Group_5__1__Impl )
            // InternalMyDsl.g:8274:2: rule__Data__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_5__1"


    // $ANTLR start "rule__Data__Group_5__1__Impl"
    // InternalMyDsl.g:8280:1: rule__Data__Group_5__1__Impl : ( ( rule__Data__BorderDashAssignment_5_1 ) ) ;
    public final void rule__Data__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8284:1: ( ( ( rule__Data__BorderDashAssignment_5_1 ) ) )
            // InternalMyDsl.g:8285:1: ( ( rule__Data__BorderDashAssignment_5_1 ) )
            {
            // InternalMyDsl.g:8285:1: ( ( rule__Data__BorderDashAssignment_5_1 ) )
            // InternalMyDsl.g:8286:2: ( rule__Data__BorderDashAssignment_5_1 )
            {
             before(grammarAccess.getDataAccess().getBorderDashAssignment_5_1()); 
            // InternalMyDsl.g:8287:2: ( rule__Data__BorderDashAssignment_5_1 )
            // InternalMyDsl.g:8287:3: rule__Data__BorderDashAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__BorderDashAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getBorderDashAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_5__1__Impl"


    // $ANTLR start "rule__Data__Group_10__0"
    // InternalMyDsl.g:8296:1: rule__Data__Group_10__0 : rule__Data__Group_10__0__Impl rule__Data__Group_10__1 ;
    public final void rule__Data__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8300:1: ( rule__Data__Group_10__0__Impl rule__Data__Group_10__1 )
            // InternalMyDsl.g:8301:2: rule__Data__Group_10__0__Impl rule__Data__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__Data__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_10__0"


    // $ANTLR start "rule__Data__Group_10__0__Impl"
    // InternalMyDsl.g:8308:1: rule__Data__Group_10__0__Impl : ( RULE_COMA ) ;
    public final void rule__Data__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8312:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:8313:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:8313:1: ( RULE_COMA )
            // InternalMyDsl.g:8314:2: RULE_COMA
            {
             before(grammarAccess.getDataAccess().getCOMATerminalRuleCall_10_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getCOMATerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_10__0__Impl"


    // $ANTLR start "rule__Data__Group_10__1"
    // InternalMyDsl.g:8323:1: rule__Data__Group_10__1 : rule__Data__Group_10__1__Impl ;
    public final void rule__Data__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8327:1: ( rule__Data__Group_10__1__Impl )
            // InternalMyDsl.g:8328:2: rule__Data__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_10__1"


    // $ANTLR start "rule__Data__Group_10__1__Impl"
    // InternalMyDsl.g:8334:1: rule__Data__Group_10__1__Impl : ( ( rule__Data__DataAssignment_10_1 ) ) ;
    public final void rule__Data__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8338:1: ( ( ( rule__Data__DataAssignment_10_1 ) ) )
            // InternalMyDsl.g:8339:1: ( ( rule__Data__DataAssignment_10_1 ) )
            {
            // InternalMyDsl.g:8339:1: ( ( rule__Data__DataAssignment_10_1 ) )
            // InternalMyDsl.g:8340:2: ( rule__Data__DataAssignment_10_1 )
            {
             before(grammarAccess.getDataAccess().getDataAssignment_10_1()); 
            // InternalMyDsl.g:8341:2: ( rule__Data__DataAssignment_10_1 )
            // InternalMyDsl.g:8341:3: rule__Data__DataAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__DataAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getDataAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_10__1__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalMyDsl.g:8350:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8354:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalMyDsl.g:8355:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalMyDsl.g:8362:1: rule__Label__Group__0__Impl : ( () ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8366:1: ( ( () ) )
            // InternalMyDsl.g:8367:1: ( () )
            {
            // InternalMyDsl.g:8367:1: ( () )
            // InternalMyDsl.g:8368:2: ()
            {
             before(grammarAccess.getLabelAccess().getLabelAction_0()); 
            // InternalMyDsl.g:8369:2: ()
            // InternalMyDsl.g:8369:3: 
            {
            }

             after(grammarAccess.getLabelAccess().getLabelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalMyDsl.g:8377:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8381:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalMyDsl.g:8382:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalMyDsl.g:8389:1: rule__Label__Group__1__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8393:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:8394:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:8394:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:8395:2: RULE_OBJECT_START
            {
             before(grammarAccess.getLabelAccess().getOBJECT_STARTTerminalRuleCall_1()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getOBJECT_STARTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__2"
    // InternalMyDsl.g:8404:1: rule__Label__Group__2 : rule__Label__Group__2__Impl rule__Label__Group__3 ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8408:1: ( rule__Label__Group__2__Impl rule__Label__Group__3 )
            // InternalMyDsl.g:8409:2: rule__Label__Group__2__Impl rule__Label__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Label__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2"


    // $ANTLR start "rule__Label__Group__2__Impl"
    // InternalMyDsl.g:8416:1: rule__Label__Group__2__Impl : ( ( rule__Label__NameAssignment_2 ) ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8420:1: ( ( ( rule__Label__NameAssignment_2 ) ) )
            // InternalMyDsl.g:8421:1: ( ( rule__Label__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:8421:1: ( ( rule__Label__NameAssignment_2 ) )
            // InternalMyDsl.g:8422:2: ( rule__Label__NameAssignment_2 )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:8423:2: ( rule__Label__NameAssignment_2 )
            // InternalMyDsl.g:8423:3: rule__Label__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Label__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2__Impl"


    // $ANTLR start "rule__Label__Group__3"
    // InternalMyDsl.g:8431:1: rule__Label__Group__3 : rule__Label__Group__3__Impl ;
    public final void rule__Label__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8435:1: ( rule__Label__Group__3__Impl )
            // InternalMyDsl.g:8436:2: rule__Label__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__3"


    // $ANTLR start "rule__Label__Group__3__Impl"
    // InternalMyDsl.g:8442:1: rule__Label__Group__3__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Label__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8446:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:8447:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:8447:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:8448:2: RULE_OBJECT_END
            {
             before(grammarAccess.getLabelAccess().getOBJECT_ENDTerminalRuleCall_3()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getOBJECT_ENDTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__3__Impl"


    // $ANTLR start "rule__DBServer__Group__0"
    // InternalMyDsl.g:8458:1: rule__DBServer__Group__0 : rule__DBServer__Group__0__Impl rule__DBServer__Group__1 ;
    public final void rule__DBServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8462:1: ( rule__DBServer__Group__0__Impl rule__DBServer__Group__1 )
            // InternalMyDsl.g:8463:2: rule__DBServer__Group__0__Impl rule__DBServer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DBServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__0"


    // $ANTLR start "rule__DBServer__Group__0__Impl"
    // InternalMyDsl.g:8470:1: rule__DBServer__Group__0__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__DBServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8474:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:8475:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:8475:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:8476:2: RULE_OBJECT_START
            {
             before(grammarAccess.getDBServerAccess().getOBJECT_STARTTerminalRuleCall_0()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getDBServerAccess().getOBJECT_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__0__Impl"


    // $ANTLR start "rule__DBServer__Group__1"
    // InternalMyDsl.g:8485:1: rule__DBServer__Group__1 : rule__DBServer__Group__1__Impl rule__DBServer__Group__2 ;
    public final void rule__DBServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8489:1: ( rule__DBServer__Group__1__Impl rule__DBServer__Group__2 )
            // InternalMyDsl.g:8490:2: rule__DBServer__Group__1__Impl rule__DBServer__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__DBServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__1"


    // $ANTLR start "rule__DBServer__Group__1__Impl"
    // InternalMyDsl.g:8497:1: rule__DBServer__Group__1__Impl : ( ( rule__DBServer__NameAssignment_1 ) ) ;
    public final void rule__DBServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8501:1: ( ( ( rule__DBServer__NameAssignment_1 ) ) )
            // InternalMyDsl.g:8502:1: ( ( rule__DBServer__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:8502:1: ( ( rule__DBServer__NameAssignment_1 ) )
            // InternalMyDsl.g:8503:2: ( rule__DBServer__NameAssignment_1 )
            {
             before(grammarAccess.getDBServerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:8504:2: ( rule__DBServer__NameAssignment_1 )
            // InternalMyDsl.g:8504:3: rule__DBServer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DBServer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDBServerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__1__Impl"


    // $ANTLR start "rule__DBServer__Group__2"
    // InternalMyDsl.g:8512:1: rule__DBServer__Group__2 : rule__DBServer__Group__2__Impl rule__DBServer__Group__3 ;
    public final void rule__DBServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8516:1: ( rule__DBServer__Group__2__Impl rule__DBServer__Group__3 )
            // InternalMyDsl.g:8517:2: rule__DBServer__Group__2__Impl rule__DBServer__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__DBServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__2"


    // $ANTLR start "rule__DBServer__Group__2__Impl"
    // InternalMyDsl.g:8524:1: rule__DBServer__Group__2__Impl : ( ( rule__DBServer__Group_2__0 )? ) ;
    public final void rule__DBServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8528:1: ( ( ( rule__DBServer__Group_2__0 )? ) )
            // InternalMyDsl.g:8529:1: ( ( rule__DBServer__Group_2__0 )? )
            {
            // InternalMyDsl.g:8529:1: ( ( rule__DBServer__Group_2__0 )? )
            // InternalMyDsl.g:8530:2: ( rule__DBServer__Group_2__0 )?
            {
             before(grammarAccess.getDBServerAccess().getGroup_2()); 
            // InternalMyDsl.g:8531:2: ( rule__DBServer__Group_2__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==75) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyDsl.g:8531:3: rule__DBServer__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DBServer__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDBServerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__2__Impl"


    // $ANTLR start "rule__DBServer__Group__3"
    // InternalMyDsl.g:8539:1: rule__DBServer__Group__3 : rule__DBServer__Group__3__Impl rule__DBServer__Group__4 ;
    public final void rule__DBServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8543:1: ( rule__DBServer__Group__3__Impl rule__DBServer__Group__4 )
            // InternalMyDsl.g:8544:2: rule__DBServer__Group__3__Impl rule__DBServer__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__DBServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__3"


    // $ANTLR start "rule__DBServer__Group__3__Impl"
    // InternalMyDsl.g:8551:1: rule__DBServer__Group__3__Impl : ( ( rule__DBServer__Group_3__0 )? ) ;
    public final void rule__DBServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8555:1: ( ( ( rule__DBServer__Group_3__0 )? ) )
            // InternalMyDsl.g:8556:1: ( ( rule__DBServer__Group_3__0 )? )
            {
            // InternalMyDsl.g:8556:1: ( ( rule__DBServer__Group_3__0 )? )
            // InternalMyDsl.g:8557:2: ( rule__DBServer__Group_3__0 )?
            {
             before(grammarAccess.getDBServerAccess().getGroup_3()); 
            // InternalMyDsl.g:8558:2: ( rule__DBServer__Group_3__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==76) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyDsl.g:8558:3: rule__DBServer__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DBServer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDBServerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__3__Impl"


    // $ANTLR start "rule__DBServer__Group__4"
    // InternalMyDsl.g:8566:1: rule__DBServer__Group__4 : rule__DBServer__Group__4__Impl rule__DBServer__Group__5 ;
    public final void rule__DBServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8570:1: ( rule__DBServer__Group__4__Impl rule__DBServer__Group__5 )
            // InternalMyDsl.g:8571:2: rule__DBServer__Group__4__Impl rule__DBServer__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__DBServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__4"


    // $ANTLR start "rule__DBServer__Group__4__Impl"
    // InternalMyDsl.g:8578:1: rule__DBServer__Group__4__Impl : ( ( rule__DBServer__Group_4__0 )? ) ;
    public final void rule__DBServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8582:1: ( ( ( rule__DBServer__Group_4__0 )? ) )
            // InternalMyDsl.g:8583:1: ( ( rule__DBServer__Group_4__0 )? )
            {
            // InternalMyDsl.g:8583:1: ( ( rule__DBServer__Group_4__0 )? )
            // InternalMyDsl.g:8584:2: ( rule__DBServer__Group_4__0 )?
            {
             before(grammarAccess.getDBServerAccess().getGroup_4()); 
            // InternalMyDsl.g:8585:2: ( rule__DBServer__Group_4__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==77) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyDsl.g:8585:3: rule__DBServer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DBServer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDBServerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__4__Impl"


    // $ANTLR start "rule__DBServer__Group__5"
    // InternalMyDsl.g:8593:1: rule__DBServer__Group__5 : rule__DBServer__Group__5__Impl rule__DBServer__Group__6 ;
    public final void rule__DBServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8597:1: ( rule__DBServer__Group__5__Impl rule__DBServer__Group__6 )
            // InternalMyDsl.g:8598:2: rule__DBServer__Group__5__Impl rule__DBServer__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__DBServer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__5"


    // $ANTLR start "rule__DBServer__Group__5__Impl"
    // InternalMyDsl.g:8605:1: rule__DBServer__Group__5__Impl : ( 'relatedCollections' ) ;
    public final void rule__DBServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8609:1: ( ( 'relatedCollections' ) )
            // InternalMyDsl.g:8610:1: ( 'relatedCollections' )
            {
            // InternalMyDsl.g:8610:1: ( 'relatedCollections' )
            // InternalMyDsl.g:8611:2: 'relatedCollections'
            {
             before(grammarAccess.getDBServerAccess().getRelatedCollectionsKeyword_5()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getDBServerAccess().getRelatedCollectionsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__5__Impl"


    // $ANTLR start "rule__DBServer__Group__6"
    // InternalMyDsl.g:8620:1: rule__DBServer__Group__6 : rule__DBServer__Group__6__Impl rule__DBServer__Group__7 ;
    public final void rule__DBServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8624:1: ( rule__DBServer__Group__6__Impl rule__DBServer__Group__7 )
            // InternalMyDsl.g:8625:2: rule__DBServer__Group__6__Impl rule__DBServer__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__DBServer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__6"


    // $ANTLR start "rule__DBServer__Group__6__Impl"
    // InternalMyDsl.g:8632:1: rule__DBServer__Group__6__Impl : ( RULE_EQUALS ) ;
    public final void rule__DBServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8636:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:8637:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:8637:1: ( RULE_EQUALS )
            // InternalMyDsl.g:8638:2: RULE_EQUALS
            {
             before(grammarAccess.getDBServerAccess().getEQUALSTerminalRuleCall_6()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getDBServerAccess().getEQUALSTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__6__Impl"


    // $ANTLR start "rule__DBServer__Group__7"
    // InternalMyDsl.g:8647:1: rule__DBServer__Group__7 : rule__DBServer__Group__7__Impl rule__DBServer__Group__8 ;
    public final void rule__DBServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8651:1: ( rule__DBServer__Group__7__Impl rule__DBServer__Group__8 )
            // InternalMyDsl.g:8652:2: rule__DBServer__Group__7__Impl rule__DBServer__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__DBServer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__7"


    // $ANTLR start "rule__DBServer__Group__7__Impl"
    // InternalMyDsl.g:8659:1: rule__DBServer__Group__7__Impl : ( RULE_LIST_START ) ;
    public final void rule__DBServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8663:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:8664:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:8664:1: ( RULE_LIST_START )
            // InternalMyDsl.g:8665:2: RULE_LIST_START
            {
             before(grammarAccess.getDBServerAccess().getLIST_STARTTerminalRuleCall_7()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getDBServerAccess().getLIST_STARTTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__7__Impl"


    // $ANTLR start "rule__DBServer__Group__8"
    // InternalMyDsl.g:8674:1: rule__DBServer__Group__8 : rule__DBServer__Group__8__Impl rule__DBServer__Group__9 ;
    public final void rule__DBServer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8678:1: ( rule__DBServer__Group__8__Impl rule__DBServer__Group__9 )
            // InternalMyDsl.g:8679:2: rule__DBServer__Group__8__Impl rule__DBServer__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__DBServer__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__8"


    // $ANTLR start "rule__DBServer__Group__8__Impl"
    // InternalMyDsl.g:8686:1: rule__DBServer__Group__8__Impl : ( ( rule__DBServer__RelatedCollectionsAssignment_8 ) ) ;
    public final void rule__DBServer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8690:1: ( ( ( rule__DBServer__RelatedCollectionsAssignment_8 ) ) )
            // InternalMyDsl.g:8691:1: ( ( rule__DBServer__RelatedCollectionsAssignment_8 ) )
            {
            // InternalMyDsl.g:8691:1: ( ( rule__DBServer__RelatedCollectionsAssignment_8 ) )
            // InternalMyDsl.g:8692:2: ( rule__DBServer__RelatedCollectionsAssignment_8 )
            {
             before(grammarAccess.getDBServerAccess().getRelatedCollectionsAssignment_8()); 
            // InternalMyDsl.g:8693:2: ( rule__DBServer__RelatedCollectionsAssignment_8 )
            // InternalMyDsl.g:8693:3: rule__DBServer__RelatedCollectionsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__DBServer__RelatedCollectionsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDBServerAccess().getRelatedCollectionsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__8__Impl"


    // $ANTLR start "rule__DBServer__Group__9"
    // InternalMyDsl.g:8701:1: rule__DBServer__Group__9 : rule__DBServer__Group__9__Impl rule__DBServer__Group__10 ;
    public final void rule__DBServer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8705:1: ( rule__DBServer__Group__9__Impl rule__DBServer__Group__10 )
            // InternalMyDsl.g:8706:2: rule__DBServer__Group__9__Impl rule__DBServer__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__DBServer__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__9"


    // $ANTLR start "rule__DBServer__Group__9__Impl"
    // InternalMyDsl.g:8713:1: rule__DBServer__Group__9__Impl : ( ( rule__DBServer__Group_9__0 )* ) ;
    public final void rule__DBServer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8717:1: ( ( ( rule__DBServer__Group_9__0 )* ) )
            // InternalMyDsl.g:8718:1: ( ( rule__DBServer__Group_9__0 )* )
            {
            // InternalMyDsl.g:8718:1: ( ( rule__DBServer__Group_9__0 )* )
            // InternalMyDsl.g:8719:2: ( rule__DBServer__Group_9__0 )*
            {
             before(grammarAccess.getDBServerAccess().getGroup_9()); 
            // InternalMyDsl.g:8720:2: ( rule__DBServer__Group_9__0 )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_COMA) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalMyDsl.g:8720:3: rule__DBServer__Group_9__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DBServer__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

             after(grammarAccess.getDBServerAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__9__Impl"


    // $ANTLR start "rule__DBServer__Group__10"
    // InternalMyDsl.g:8728:1: rule__DBServer__Group__10 : rule__DBServer__Group__10__Impl rule__DBServer__Group__11 ;
    public final void rule__DBServer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8732:1: ( rule__DBServer__Group__10__Impl rule__DBServer__Group__11 )
            // InternalMyDsl.g:8733:2: rule__DBServer__Group__10__Impl rule__DBServer__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__DBServer__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__10"


    // $ANTLR start "rule__DBServer__Group__10__Impl"
    // InternalMyDsl.g:8740:1: rule__DBServer__Group__10__Impl : ( RULE_LIST_END ) ;
    public final void rule__DBServer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8744:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:8745:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:8745:1: ( RULE_LIST_END )
            // InternalMyDsl.g:8746:2: RULE_LIST_END
            {
             before(grammarAccess.getDBServerAccess().getLIST_ENDTerminalRuleCall_10()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getDBServerAccess().getLIST_ENDTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__10__Impl"


    // $ANTLR start "rule__DBServer__Group__11"
    // InternalMyDsl.g:8755:1: rule__DBServer__Group__11 : rule__DBServer__Group__11__Impl ;
    public final void rule__DBServer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8759:1: ( rule__DBServer__Group__11__Impl )
            // InternalMyDsl.g:8760:2: rule__DBServer__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBServer__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__11"


    // $ANTLR start "rule__DBServer__Group__11__Impl"
    // InternalMyDsl.g:8766:1: rule__DBServer__Group__11__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__DBServer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8770:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:8771:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:8771:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:8772:2: RULE_OBJECT_END
            {
             before(grammarAccess.getDBServerAccess().getOBJECT_ENDTerminalRuleCall_11()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getDBServerAccess().getOBJECT_ENDTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group__11__Impl"


    // $ANTLR start "rule__DBServer__Group_2__0"
    // InternalMyDsl.g:8782:1: rule__DBServer__Group_2__0 : rule__DBServer__Group_2__0__Impl rule__DBServer__Group_2__1 ;
    public final void rule__DBServer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8786:1: ( rule__DBServer__Group_2__0__Impl rule__DBServer__Group_2__1 )
            // InternalMyDsl.g:8787:2: rule__DBServer__Group_2__0__Impl rule__DBServer__Group_2__1
            {
            pushFollow(FOLLOW_38);
            rule__DBServer__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_2__0"


    // $ANTLR start "rule__DBServer__Group_2__0__Impl"
    // InternalMyDsl.g:8794:1: rule__DBServer__Group_2__0__Impl : ( 'systemManager' ) ;
    public final void rule__DBServer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8798:1: ( ( 'systemManager' ) )
            // InternalMyDsl.g:8799:1: ( 'systemManager' )
            {
            // InternalMyDsl.g:8799:1: ( 'systemManager' )
            // InternalMyDsl.g:8800:2: 'systemManager'
            {
             before(grammarAccess.getDBServerAccess().getSystemManagerKeyword_2_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getDBServerAccess().getSystemManagerKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_2__0__Impl"


    // $ANTLR start "rule__DBServer__Group_2__1"
    // InternalMyDsl.g:8809:1: rule__DBServer__Group_2__1 : rule__DBServer__Group_2__1__Impl ;
    public final void rule__DBServer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8813:1: ( rule__DBServer__Group_2__1__Impl )
            // InternalMyDsl.g:8814:2: rule__DBServer__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBServer__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_2__1"


    // $ANTLR start "rule__DBServer__Group_2__1__Impl"
    // InternalMyDsl.g:8820:1: rule__DBServer__Group_2__1__Impl : ( ( rule__DBServer__SystemManagerAssignment_2_1 ) ) ;
    public final void rule__DBServer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8824:1: ( ( ( rule__DBServer__SystemManagerAssignment_2_1 ) ) )
            // InternalMyDsl.g:8825:1: ( ( rule__DBServer__SystemManagerAssignment_2_1 ) )
            {
            // InternalMyDsl.g:8825:1: ( ( rule__DBServer__SystemManagerAssignment_2_1 ) )
            // InternalMyDsl.g:8826:2: ( rule__DBServer__SystemManagerAssignment_2_1 )
            {
             before(grammarAccess.getDBServerAccess().getSystemManagerAssignment_2_1()); 
            // InternalMyDsl.g:8827:2: ( rule__DBServer__SystemManagerAssignment_2_1 )
            // InternalMyDsl.g:8827:3: rule__DBServer__SystemManagerAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DBServer__SystemManagerAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDBServerAccess().getSystemManagerAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_2__1__Impl"


    // $ANTLR start "rule__DBServer__Group_3__0"
    // InternalMyDsl.g:8836:1: rule__DBServer__Group_3__0 : rule__DBServer__Group_3__0__Impl rule__DBServer__Group_3__1 ;
    public final void rule__DBServer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8840:1: ( rule__DBServer__Group_3__0__Impl rule__DBServer__Group_3__1 )
            // InternalMyDsl.g:8841:2: rule__DBServer__Group_3__0__Impl rule__DBServer__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__DBServer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_3__0"


    // $ANTLR start "rule__DBServer__Group_3__0__Impl"
    // InternalMyDsl.g:8848:1: rule__DBServer__Group_3__0__Impl : ( 'token' ) ;
    public final void rule__DBServer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8852:1: ( ( 'token' ) )
            // InternalMyDsl.g:8853:1: ( 'token' )
            {
            // InternalMyDsl.g:8853:1: ( 'token' )
            // InternalMyDsl.g:8854:2: 'token'
            {
             before(grammarAccess.getDBServerAccess().getTokenKeyword_3_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getDBServerAccess().getTokenKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_3__0__Impl"


    // $ANTLR start "rule__DBServer__Group_3__1"
    // InternalMyDsl.g:8863:1: rule__DBServer__Group_3__1 : rule__DBServer__Group_3__1__Impl ;
    public final void rule__DBServer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8867:1: ( rule__DBServer__Group_3__1__Impl )
            // InternalMyDsl.g:8868:2: rule__DBServer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBServer__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_3__1"


    // $ANTLR start "rule__DBServer__Group_3__1__Impl"
    // InternalMyDsl.g:8874:1: rule__DBServer__Group_3__1__Impl : ( ( rule__DBServer__TokenAssignment_3_1 ) ) ;
    public final void rule__DBServer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8878:1: ( ( ( rule__DBServer__TokenAssignment_3_1 ) ) )
            // InternalMyDsl.g:8879:1: ( ( rule__DBServer__TokenAssignment_3_1 ) )
            {
            // InternalMyDsl.g:8879:1: ( ( rule__DBServer__TokenAssignment_3_1 ) )
            // InternalMyDsl.g:8880:2: ( rule__DBServer__TokenAssignment_3_1 )
            {
             before(grammarAccess.getDBServerAccess().getTokenAssignment_3_1()); 
            // InternalMyDsl.g:8881:2: ( rule__DBServer__TokenAssignment_3_1 )
            // InternalMyDsl.g:8881:3: rule__DBServer__TokenAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DBServer__TokenAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDBServerAccess().getTokenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_3__1__Impl"


    // $ANTLR start "rule__DBServer__Group_4__0"
    // InternalMyDsl.g:8890:1: rule__DBServer__Group_4__0 : rule__DBServer__Group_4__0__Impl rule__DBServer__Group_4__1 ;
    public final void rule__DBServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8894:1: ( rule__DBServer__Group_4__0__Impl rule__DBServer__Group_4__1 )
            // InternalMyDsl.g:8895:2: rule__DBServer__Group_4__0__Impl rule__DBServer__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__DBServer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_4__0"


    // $ANTLR start "rule__DBServer__Group_4__0__Impl"
    // InternalMyDsl.g:8902:1: rule__DBServer__Group_4__0__Impl : ( 'password' ) ;
    public final void rule__DBServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8906:1: ( ( 'password' ) )
            // InternalMyDsl.g:8907:1: ( 'password' )
            {
            // InternalMyDsl.g:8907:1: ( 'password' )
            // InternalMyDsl.g:8908:2: 'password'
            {
             before(grammarAccess.getDBServerAccess().getPasswordKeyword_4_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getDBServerAccess().getPasswordKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_4__0__Impl"


    // $ANTLR start "rule__DBServer__Group_4__1"
    // InternalMyDsl.g:8917:1: rule__DBServer__Group_4__1 : rule__DBServer__Group_4__1__Impl ;
    public final void rule__DBServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8921:1: ( rule__DBServer__Group_4__1__Impl )
            // InternalMyDsl.g:8922:2: rule__DBServer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBServer__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_4__1"


    // $ANTLR start "rule__DBServer__Group_4__1__Impl"
    // InternalMyDsl.g:8928:1: rule__DBServer__Group_4__1__Impl : ( ( rule__DBServer__PasswordAssignment_4_1 ) ) ;
    public final void rule__DBServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8932:1: ( ( ( rule__DBServer__PasswordAssignment_4_1 ) ) )
            // InternalMyDsl.g:8933:1: ( ( rule__DBServer__PasswordAssignment_4_1 ) )
            {
            // InternalMyDsl.g:8933:1: ( ( rule__DBServer__PasswordAssignment_4_1 ) )
            // InternalMyDsl.g:8934:2: ( rule__DBServer__PasswordAssignment_4_1 )
            {
             before(grammarAccess.getDBServerAccess().getPasswordAssignment_4_1()); 
            // InternalMyDsl.g:8935:2: ( rule__DBServer__PasswordAssignment_4_1 )
            // InternalMyDsl.g:8935:3: rule__DBServer__PasswordAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DBServer__PasswordAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDBServerAccess().getPasswordAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_4__1__Impl"


    // $ANTLR start "rule__DBServer__Group_9__0"
    // InternalMyDsl.g:8944:1: rule__DBServer__Group_9__0 : rule__DBServer__Group_9__0__Impl rule__DBServer__Group_9__1 ;
    public final void rule__DBServer__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8948:1: ( rule__DBServer__Group_9__0__Impl rule__DBServer__Group_9__1 )
            // InternalMyDsl.g:8949:2: rule__DBServer__Group_9__0__Impl rule__DBServer__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__DBServer__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DBServer__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_9__0"


    // $ANTLR start "rule__DBServer__Group_9__0__Impl"
    // InternalMyDsl.g:8956:1: rule__DBServer__Group_9__0__Impl : ( RULE_COMA ) ;
    public final void rule__DBServer__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8960:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:8961:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:8961:1: ( RULE_COMA )
            // InternalMyDsl.g:8962:2: RULE_COMA
            {
             before(grammarAccess.getDBServerAccess().getCOMATerminalRuleCall_9_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getDBServerAccess().getCOMATerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_9__0__Impl"


    // $ANTLR start "rule__DBServer__Group_9__1"
    // InternalMyDsl.g:8971:1: rule__DBServer__Group_9__1 : rule__DBServer__Group_9__1__Impl ;
    public final void rule__DBServer__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8975:1: ( rule__DBServer__Group_9__1__Impl )
            // InternalMyDsl.g:8976:2: rule__DBServer__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBServer__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_9__1"


    // $ANTLR start "rule__DBServer__Group_9__1__Impl"
    // InternalMyDsl.g:8982:1: rule__DBServer__Group_9__1__Impl : ( ( rule__DBServer__RelatedCollectionsAssignment_9_1 ) ) ;
    public final void rule__DBServer__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8986:1: ( ( ( rule__DBServer__RelatedCollectionsAssignment_9_1 ) ) )
            // InternalMyDsl.g:8987:1: ( ( rule__DBServer__RelatedCollectionsAssignment_9_1 ) )
            {
            // InternalMyDsl.g:8987:1: ( ( rule__DBServer__RelatedCollectionsAssignment_9_1 ) )
            // InternalMyDsl.g:8988:2: ( rule__DBServer__RelatedCollectionsAssignment_9_1 )
            {
             before(grammarAccess.getDBServerAccess().getRelatedCollectionsAssignment_9_1()); 
            // InternalMyDsl.g:8989:2: ( rule__DBServer__RelatedCollectionsAssignment_9_1 )
            // InternalMyDsl.g:8989:3: rule__DBServer__RelatedCollectionsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__DBServer__RelatedCollectionsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getDBServerAccess().getRelatedCollectionsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__Group_9__1__Impl"


    // $ANTLR start "rule__Collection__Group__0"
    // InternalMyDsl.g:8998:1: rule__Collection__Group__0 : rule__Collection__Group__0__Impl rule__Collection__Group__1 ;
    public final void rule__Collection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9002:1: ( rule__Collection__Group__0__Impl rule__Collection__Group__1 )
            // InternalMyDsl.g:9003:2: rule__Collection__Group__0__Impl rule__Collection__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Collection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__0"


    // $ANTLR start "rule__Collection__Group__0__Impl"
    // InternalMyDsl.g:9010:1: rule__Collection__Group__0__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Collection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9014:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:9015:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:9015:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:9016:2: RULE_OBJECT_START
            {
             before(grammarAccess.getCollectionAccess().getOBJECT_STARTTerminalRuleCall_0()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getOBJECT_STARTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__0__Impl"


    // $ANTLR start "rule__Collection__Group__1"
    // InternalMyDsl.g:9025:1: rule__Collection__Group__1 : rule__Collection__Group__1__Impl rule__Collection__Group__2 ;
    public final void rule__Collection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9029:1: ( rule__Collection__Group__1__Impl rule__Collection__Group__2 )
            // InternalMyDsl.g:9030:2: rule__Collection__Group__1__Impl rule__Collection__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Collection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__1"


    // $ANTLR start "rule__Collection__Group__1__Impl"
    // InternalMyDsl.g:9037:1: rule__Collection__Group__1__Impl : ( ( rule__Collection__NameAssignment_1 ) ) ;
    public final void rule__Collection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9041:1: ( ( ( rule__Collection__NameAssignment_1 ) ) )
            // InternalMyDsl.g:9042:1: ( ( rule__Collection__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:9042:1: ( ( rule__Collection__NameAssignment_1 ) )
            // InternalMyDsl.g:9043:2: ( rule__Collection__NameAssignment_1 )
            {
             before(grammarAccess.getCollectionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:9044:2: ( rule__Collection__NameAssignment_1 )
            // InternalMyDsl.g:9044:3: rule__Collection__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Collection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__1__Impl"


    // $ANTLR start "rule__Collection__Group__2"
    // InternalMyDsl.g:9052:1: rule__Collection__Group__2 : rule__Collection__Group__2__Impl rule__Collection__Group__3 ;
    public final void rule__Collection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9056:1: ( rule__Collection__Group__2__Impl rule__Collection__Group__3 )
            // InternalMyDsl.g:9057:2: rule__Collection__Group__2__Impl rule__Collection__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Collection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__2"


    // $ANTLR start "rule__Collection__Group__2__Impl"
    // InternalMyDsl.g:9064:1: rule__Collection__Group__2__Impl : ( 'documents' ) ;
    public final void rule__Collection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9068:1: ( ( 'documents' ) )
            // InternalMyDsl.g:9069:1: ( 'documents' )
            {
            // InternalMyDsl.g:9069:1: ( 'documents' )
            // InternalMyDsl.g:9070:2: 'documents'
            {
             before(grammarAccess.getCollectionAccess().getDocumentsKeyword_2()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getDocumentsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__2__Impl"


    // $ANTLR start "rule__Collection__Group__3"
    // InternalMyDsl.g:9079:1: rule__Collection__Group__3 : rule__Collection__Group__3__Impl rule__Collection__Group__4 ;
    public final void rule__Collection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9083:1: ( rule__Collection__Group__3__Impl rule__Collection__Group__4 )
            // InternalMyDsl.g:9084:2: rule__Collection__Group__3__Impl rule__Collection__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Collection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__3"


    // $ANTLR start "rule__Collection__Group__3__Impl"
    // InternalMyDsl.g:9091:1: rule__Collection__Group__3__Impl : ( RULE_EQUALS ) ;
    public final void rule__Collection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9095:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:9096:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:9096:1: ( RULE_EQUALS )
            // InternalMyDsl.g:9097:2: RULE_EQUALS
            {
             before(grammarAccess.getCollectionAccess().getEQUALSTerminalRuleCall_3()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getEQUALSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__3__Impl"


    // $ANTLR start "rule__Collection__Group__4"
    // InternalMyDsl.g:9106:1: rule__Collection__Group__4 : rule__Collection__Group__4__Impl rule__Collection__Group__5 ;
    public final void rule__Collection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9110:1: ( rule__Collection__Group__4__Impl rule__Collection__Group__5 )
            // InternalMyDsl.g:9111:2: rule__Collection__Group__4__Impl rule__Collection__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Collection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__4"


    // $ANTLR start "rule__Collection__Group__4__Impl"
    // InternalMyDsl.g:9118:1: rule__Collection__Group__4__Impl : ( RULE_LIST_START ) ;
    public final void rule__Collection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9122:1: ( ( RULE_LIST_START ) )
            // InternalMyDsl.g:9123:1: ( RULE_LIST_START )
            {
            // InternalMyDsl.g:9123:1: ( RULE_LIST_START )
            // InternalMyDsl.g:9124:2: RULE_LIST_START
            {
             before(grammarAccess.getCollectionAccess().getLIST_STARTTerminalRuleCall_4()); 
            match(input,RULE_LIST_START,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getLIST_STARTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__4__Impl"


    // $ANTLR start "rule__Collection__Group__5"
    // InternalMyDsl.g:9133:1: rule__Collection__Group__5 : rule__Collection__Group__5__Impl rule__Collection__Group__6 ;
    public final void rule__Collection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9137:1: ( rule__Collection__Group__5__Impl rule__Collection__Group__6 )
            // InternalMyDsl.g:9138:2: rule__Collection__Group__5__Impl rule__Collection__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Collection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__5"


    // $ANTLR start "rule__Collection__Group__5__Impl"
    // InternalMyDsl.g:9145:1: rule__Collection__Group__5__Impl : ( ( rule__Collection__DocumentsAssignment_5 ) ) ;
    public final void rule__Collection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9149:1: ( ( ( rule__Collection__DocumentsAssignment_5 ) ) )
            // InternalMyDsl.g:9150:1: ( ( rule__Collection__DocumentsAssignment_5 ) )
            {
            // InternalMyDsl.g:9150:1: ( ( rule__Collection__DocumentsAssignment_5 ) )
            // InternalMyDsl.g:9151:2: ( rule__Collection__DocumentsAssignment_5 )
            {
             before(grammarAccess.getCollectionAccess().getDocumentsAssignment_5()); 
            // InternalMyDsl.g:9152:2: ( rule__Collection__DocumentsAssignment_5 )
            // InternalMyDsl.g:9152:3: rule__Collection__DocumentsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Collection__DocumentsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getDocumentsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__5__Impl"


    // $ANTLR start "rule__Collection__Group__6"
    // InternalMyDsl.g:9160:1: rule__Collection__Group__6 : rule__Collection__Group__6__Impl rule__Collection__Group__7 ;
    public final void rule__Collection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9164:1: ( rule__Collection__Group__6__Impl rule__Collection__Group__7 )
            // InternalMyDsl.g:9165:2: rule__Collection__Group__6__Impl rule__Collection__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Collection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__6"


    // $ANTLR start "rule__Collection__Group__6__Impl"
    // InternalMyDsl.g:9172:1: rule__Collection__Group__6__Impl : ( ( rule__Collection__Group_6__0 )* ) ;
    public final void rule__Collection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9176:1: ( ( ( rule__Collection__Group_6__0 )* ) )
            // InternalMyDsl.g:9177:1: ( ( rule__Collection__Group_6__0 )* )
            {
            // InternalMyDsl.g:9177:1: ( ( rule__Collection__Group_6__0 )* )
            // InternalMyDsl.g:9178:2: ( rule__Collection__Group_6__0 )*
            {
             before(grammarAccess.getCollectionAccess().getGroup_6()); 
            // InternalMyDsl.g:9179:2: ( rule__Collection__Group_6__0 )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_COMA) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalMyDsl.g:9179:3: rule__Collection__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Collection__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

             after(grammarAccess.getCollectionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__6__Impl"


    // $ANTLR start "rule__Collection__Group__7"
    // InternalMyDsl.g:9187:1: rule__Collection__Group__7 : rule__Collection__Group__7__Impl rule__Collection__Group__8 ;
    public final void rule__Collection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9191:1: ( rule__Collection__Group__7__Impl rule__Collection__Group__8 )
            // InternalMyDsl.g:9192:2: rule__Collection__Group__7__Impl rule__Collection__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Collection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__7"


    // $ANTLR start "rule__Collection__Group__7__Impl"
    // InternalMyDsl.g:9199:1: rule__Collection__Group__7__Impl : ( RULE_LIST_END ) ;
    public final void rule__Collection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9203:1: ( ( RULE_LIST_END ) )
            // InternalMyDsl.g:9204:1: ( RULE_LIST_END )
            {
            // InternalMyDsl.g:9204:1: ( RULE_LIST_END )
            // InternalMyDsl.g:9205:2: RULE_LIST_END
            {
             before(grammarAccess.getCollectionAccess().getLIST_ENDTerminalRuleCall_7()); 
            match(input,RULE_LIST_END,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getLIST_ENDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__7__Impl"


    // $ANTLR start "rule__Collection__Group__8"
    // InternalMyDsl.g:9214:1: rule__Collection__Group__8 : rule__Collection__Group__8__Impl ;
    public final void rule__Collection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9218:1: ( rule__Collection__Group__8__Impl )
            // InternalMyDsl.g:9219:2: rule__Collection__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__8"


    // $ANTLR start "rule__Collection__Group__8__Impl"
    // InternalMyDsl.g:9225:1: rule__Collection__Group__8__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Collection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9229:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:9230:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:9230:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:9231:2: RULE_OBJECT_END
            {
             before(grammarAccess.getCollectionAccess().getOBJECT_ENDTerminalRuleCall_8()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getOBJECT_ENDTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group__8__Impl"


    // $ANTLR start "rule__Collection__Group_6__0"
    // InternalMyDsl.g:9241:1: rule__Collection__Group_6__0 : rule__Collection__Group_6__0__Impl rule__Collection__Group_6__1 ;
    public final void rule__Collection__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9245:1: ( rule__Collection__Group_6__0__Impl rule__Collection__Group_6__1 )
            // InternalMyDsl.g:9246:2: rule__Collection__Group_6__0__Impl rule__Collection__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Collection__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collection__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_6__0"


    // $ANTLR start "rule__Collection__Group_6__0__Impl"
    // InternalMyDsl.g:9253:1: rule__Collection__Group_6__0__Impl : ( RULE_COMA ) ;
    public final void rule__Collection__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9257:1: ( ( RULE_COMA ) )
            // InternalMyDsl.g:9258:1: ( RULE_COMA )
            {
            // InternalMyDsl.g:9258:1: ( RULE_COMA )
            // InternalMyDsl.g:9259:2: RULE_COMA
            {
             before(grammarAccess.getCollectionAccess().getCOMATerminalRuleCall_6_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getCollectionAccess().getCOMATerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_6__0__Impl"


    // $ANTLR start "rule__Collection__Group_6__1"
    // InternalMyDsl.g:9268:1: rule__Collection__Group_6__1 : rule__Collection__Group_6__1__Impl ;
    public final void rule__Collection__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9272:1: ( rule__Collection__Group_6__1__Impl )
            // InternalMyDsl.g:9273:2: rule__Collection__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collection__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_6__1"


    // $ANTLR start "rule__Collection__Group_6__1__Impl"
    // InternalMyDsl.g:9279:1: rule__Collection__Group_6__1__Impl : ( ( rule__Collection__DocumentsAssignment_6_1 ) ) ;
    public final void rule__Collection__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9283:1: ( ( ( rule__Collection__DocumentsAssignment_6_1 ) ) )
            // InternalMyDsl.g:9284:1: ( ( rule__Collection__DocumentsAssignment_6_1 ) )
            {
            // InternalMyDsl.g:9284:1: ( ( rule__Collection__DocumentsAssignment_6_1 ) )
            // InternalMyDsl.g:9285:2: ( rule__Collection__DocumentsAssignment_6_1 )
            {
             before(grammarAccess.getCollectionAccess().getDocumentsAssignment_6_1()); 
            // InternalMyDsl.g:9286:2: ( rule__Collection__DocumentsAssignment_6_1 )
            // InternalMyDsl.g:9286:3: rule__Collection__DocumentsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Collection__DocumentsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCollectionAccess().getDocumentsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__Group_6__1__Impl"


    // $ANTLR start "rule__Document__Group__0"
    // InternalMyDsl.g:9295:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9299:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // InternalMyDsl.g:9300:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__0"


    // $ANTLR start "rule__Document__Group__0__Impl"
    // InternalMyDsl.g:9307:1: rule__Document__Group__0__Impl : ( () ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9311:1: ( ( () ) )
            // InternalMyDsl.g:9312:1: ( () )
            {
            // InternalMyDsl.g:9312:1: ( () )
            // InternalMyDsl.g:9313:2: ()
            {
             before(grammarAccess.getDocumentAccess().getDocumentAction_0()); 
            // InternalMyDsl.g:9314:2: ()
            // InternalMyDsl.g:9314:3: 
            {
            }

             after(grammarAccess.getDocumentAccess().getDocumentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__0__Impl"


    // $ANTLR start "rule__Document__Group__1"
    // InternalMyDsl.g:9322:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9326:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // InternalMyDsl.g:9327:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Document__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__1"


    // $ANTLR start "rule__Document__Group__1__Impl"
    // InternalMyDsl.g:9334:1: rule__Document__Group__1__Impl : ( RULE_OBJECT_START ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9338:1: ( ( RULE_OBJECT_START ) )
            // InternalMyDsl.g:9339:1: ( RULE_OBJECT_START )
            {
            // InternalMyDsl.g:9339:1: ( RULE_OBJECT_START )
            // InternalMyDsl.g:9340:2: RULE_OBJECT_START
            {
             before(grammarAccess.getDocumentAccess().getOBJECT_STARTTerminalRuleCall_1()); 
            match(input,RULE_OBJECT_START,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getOBJECT_STARTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__1__Impl"


    // $ANTLR start "rule__Document__Group__2"
    // InternalMyDsl.g:9349:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9353:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // InternalMyDsl.g:9354:2: rule__Document__Group__2__Impl rule__Document__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Document__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__2"


    // $ANTLR start "rule__Document__Group__2__Impl"
    // InternalMyDsl.g:9361:1: rule__Document__Group__2__Impl : ( ( rule__Document__NameAssignment_2 ) ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9365:1: ( ( ( rule__Document__NameAssignment_2 ) ) )
            // InternalMyDsl.g:9366:1: ( ( rule__Document__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:9366:1: ( ( rule__Document__NameAssignment_2 ) )
            // InternalMyDsl.g:9367:2: ( rule__Document__NameAssignment_2 )
            {
             before(grammarAccess.getDocumentAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:9368:2: ( rule__Document__NameAssignment_2 )
            // InternalMyDsl.g:9368:3: rule__Document__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Document__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__2__Impl"


    // $ANTLR start "rule__Document__Group__3"
    // InternalMyDsl.g:9376:1: rule__Document__Group__3 : rule__Document__Group__3__Impl ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9380:1: ( rule__Document__Group__3__Impl )
            // InternalMyDsl.g:9381:2: rule__Document__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Document__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__3"


    // $ANTLR start "rule__Document__Group__3__Impl"
    // InternalMyDsl.g:9387:1: rule__Document__Group__3__Impl : ( RULE_OBJECT_END ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9391:1: ( ( RULE_OBJECT_END ) )
            // InternalMyDsl.g:9392:1: ( RULE_OBJECT_END )
            {
            // InternalMyDsl.g:9392:1: ( RULE_OBJECT_END )
            // InternalMyDsl.g:9393:2: RULE_OBJECT_END
            {
             before(grammarAccess.getDocumentAccess().getOBJECT_ENDTerminalRuleCall_3()); 
            match(input,RULE_OBJECT_END,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getOBJECT_ENDTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalMyDsl.g:9403:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9407:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalMyDsl.g:9408:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalMyDsl.g:9415:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9419:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:9420:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:9420:1: ( ( '-' )? )
            // InternalMyDsl.g:9421:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:9422:2: ( '-' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==79) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:9422:3: '-'
                    {
                    match(input,79,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalMyDsl.g:9430:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9434:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalMyDsl.g:9435:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalMyDsl.g:9442:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9446:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:9447:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:9447:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:9448:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalMyDsl.g:9449:2: ( RULE_INT )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_INT) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMyDsl.g:9449:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalMyDsl.g:9457:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9461:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalMyDsl.g:9462:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalMyDsl.g:9469:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9473:1: ( ( '.' ) )
            // InternalMyDsl.g:9474:1: ( '.' )
            {
            // InternalMyDsl.g:9474:1: ( '.' )
            // InternalMyDsl.g:9475:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalMyDsl.g:9484:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9488:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalMyDsl.g:9489:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalMyDsl.g:9496:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9500:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:9501:1: ( RULE_INT )
            {
            // InternalMyDsl.g:9501:1: ( RULE_INT )
            // InternalMyDsl.g:9502:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalMyDsl.g:9511:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9515:1: ( rule__EFloat__Group__4__Impl )
            // InternalMyDsl.g:9516:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalMyDsl.g:9522:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9526:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalMyDsl.g:9527:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalMyDsl.g:9527:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalMyDsl.g:9528:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalMyDsl.g:9529:2: ( rule__EFloat__Group_4__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=18 && LA71_0<=19)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyDsl.g:9529:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalMyDsl.g:9538:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9542:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalMyDsl.g:9543:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalMyDsl.g:9550:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9554:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalMyDsl.g:9555:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalMyDsl.g:9555:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalMyDsl.g:9556:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalMyDsl.g:9557:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalMyDsl.g:9557:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalMyDsl.g:9565:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9569:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalMyDsl.g:9570:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalMyDsl.g:9577:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9581:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:9582:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:9582:1: ( ( '-' )? )
            // InternalMyDsl.g:9583:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalMyDsl.g:9584:2: ( '-' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==79) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalMyDsl.g:9584:3: '-'
                    {
                    match(input,79,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalMyDsl.g:9592:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9596:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalMyDsl.g:9597:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalMyDsl.g:9603:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9607:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:9608:1: ( RULE_INT )
            {
            // InternalMyDsl.g:9608:1: ( RULE_INT )
            // InternalMyDsl.g:9609:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:9619:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9623:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:9624:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:9631:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9635:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:9636:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:9636:1: ( ( '-' )? )
            // InternalMyDsl.g:9637:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:9638:2: ( '-' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==79) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalMyDsl.g:9638:3: '-'
                    {
                    match(input,79,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:9646:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9650:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:9651:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:9657:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9661:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:9662:1: ( RULE_INT )
            {
            // InternalMyDsl.g:9662:1: ( RULE_INT )
            // InternalMyDsl.g:9663:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Company__NameAssignment_1"
    // InternalMyDsl.g:9673:1: rule__Company__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Company__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9677:1: ( ( ruleEString ) )
            // InternalMyDsl.g:9678:2: ( ruleEString )
            {
            // InternalMyDsl.g:9678:2: ( ruleEString )
            // InternalMyDsl.g:9679:3: ruleEString
            {
             before(grammarAccess.getCompanyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__NameAssignment_1"


    // $ANTLR start "rule__Company__NitAssignment_2_1"
    // InternalMyDsl.g:9688:1: rule__Company__NitAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Company__NitAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9692:1: ( ( ruleEString ) )
            // InternalMyDsl.g:9693:2: ( ruleEString )
            {
            // InternalMyDsl.g:9693:2: ( ruleEString )
            // InternalMyDsl.g:9694:3: ruleEString
            {
             before(grammarAccess.getCompanyAccess().getNitEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getNitEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__NitAssignment_2_1"


    // $ANTLR start "rule__Company__DashboardsAssignment_7"
    // InternalMyDsl.g:9703:1: rule__Company__DashboardsAssignment_7 : ( ruleDashboard ) ;
    public final void rule__Company__DashboardsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9707:1: ( ( ruleDashboard ) )
            // InternalMyDsl.g:9708:2: ( ruleDashboard )
            {
            // InternalMyDsl.g:9708:2: ( ruleDashboard )
            // InternalMyDsl.g:9709:3: ruleDashboard
            {
             before(grammarAccess.getCompanyAccess().getDashboardsDashboardParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDashboard();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getDashboardsDashboardParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__DashboardsAssignment_7"


    // $ANTLR start "rule__Company__DashboardsAssignment_8_1"
    // InternalMyDsl.g:9718:1: rule__Company__DashboardsAssignment_8_1 : ( ruleDashboard ) ;
    public final void rule__Company__DashboardsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9722:1: ( ( ruleDashboard ) )
            // InternalMyDsl.g:9723:2: ( ruleDashboard )
            {
            // InternalMyDsl.g:9723:2: ( ruleDashboard )
            // InternalMyDsl.g:9724:3: ruleDashboard
            {
             before(grammarAccess.getCompanyAccess().getDashboardsDashboardParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDashboard();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getDashboardsDashboardParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__DashboardsAssignment_8_1"


    // $ANTLR start "rule__Company__DBServersAssignment_13"
    // InternalMyDsl.g:9733:1: rule__Company__DBServersAssignment_13 : ( ruleDBServer ) ;
    public final void rule__Company__DBServersAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9737:1: ( ( ruleDBServer ) )
            // InternalMyDsl.g:9738:2: ( ruleDBServer )
            {
            // InternalMyDsl.g:9738:2: ( ruleDBServer )
            // InternalMyDsl.g:9739:3: ruleDBServer
            {
             before(grammarAccess.getCompanyAccess().getDBServersDBServerParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleDBServer();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getDBServersDBServerParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__DBServersAssignment_13"


    // $ANTLR start "rule__Company__DBServersAssignment_14_1"
    // InternalMyDsl.g:9748:1: rule__Company__DBServersAssignment_14_1 : ( ruleDBServer ) ;
    public final void rule__Company__DBServersAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9752:1: ( ( ruleDBServer ) )
            // InternalMyDsl.g:9753:2: ( ruleDBServer )
            {
            // InternalMyDsl.g:9753:2: ( ruleDBServer )
            // InternalMyDsl.g:9754:3: ruleDBServer
            {
             before(grammarAccess.getCompanyAccess().getDBServersDBServerParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDBServer();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getDBServersDBServerParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__DBServersAssignment_14_1"


    // $ANTLR start "rule__Dashboard__NameAssignment_1"
    // InternalMyDsl.g:9763:1: rule__Dashboard__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Dashboard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9767:1: ( ( ruleEString ) )
            // InternalMyDsl.g:9768:2: ( ruleEString )
            {
            // InternalMyDsl.g:9768:2: ( ruleEString )
            // InternalMyDsl.g:9769:3: ruleEString
            {
             before(grammarAccess.getDashboardAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDashboardAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__NameAssignment_1"


    // $ANTLR start "rule__Dashboard__PanelsAssignment_5"
    // InternalMyDsl.g:9778:1: rule__Dashboard__PanelsAssignment_5 : ( rulePanel ) ;
    public final void rule__Dashboard__PanelsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9782:1: ( ( rulePanel ) )
            // InternalMyDsl.g:9783:2: ( rulePanel )
            {
            // InternalMyDsl.g:9783:2: ( rulePanel )
            // InternalMyDsl.g:9784:3: rulePanel
            {
             before(grammarAccess.getDashboardAccess().getPanelsPanelParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePanel();

            state._fsp--;

             after(grammarAccess.getDashboardAccess().getPanelsPanelParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__PanelsAssignment_5"


    // $ANTLR start "rule__Dashboard__PanelsAssignment_6_1"
    // InternalMyDsl.g:9793:1: rule__Dashboard__PanelsAssignment_6_1 : ( rulePanel ) ;
    public final void rule__Dashboard__PanelsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9797:1: ( ( rulePanel ) )
            // InternalMyDsl.g:9798:2: ( rulePanel )
            {
            // InternalMyDsl.g:9798:2: ( rulePanel )
            // InternalMyDsl.g:9799:3: rulePanel
            {
             before(grammarAccess.getDashboardAccess().getPanelsPanelParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            rulePanel();

            state._fsp--;

             after(grammarAccess.getDashboardAccess().getPanelsPanelParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dashboard__PanelsAssignment_6_1"


    // $ANTLR start "rule__Panel__NameAssignment_1"
    // InternalMyDsl.g:9808:1: rule__Panel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Panel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9812:1: ( ( ruleEString ) )
            // InternalMyDsl.g:9813:2: ( ruleEString )
            {
            // InternalMyDsl.g:9813:2: ( ruleEString )
            // InternalMyDsl.g:9814:3: ruleEString
            {
             before(grammarAccess.getPanelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__NameAssignment_1"


    // $ANTLR start "rule__Panel__ElementsAssignment_5"
    // InternalMyDsl.g:9823:1: rule__Panel__ElementsAssignment_5 : ( ruleElement ) ;
    public final void rule__Panel__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9827:1: ( ( ruleElement ) )
            // InternalMyDsl.g:9828:2: ( ruleElement )
            {
            // InternalMyDsl.g:9828:2: ( ruleElement )
            // InternalMyDsl.g:9829:3: ruleElement
            {
             before(grammarAccess.getPanelAccess().getElementsElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getElementsElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__ElementsAssignment_5"


    // $ANTLR start "rule__Panel__ElementsAssignment_6_1"
    // InternalMyDsl.g:9838:1: rule__Panel__ElementsAssignment_6_1 : ( ruleElement ) ;
    public final void rule__Panel__ElementsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9842:1: ( ( ruleElement ) )
            // InternalMyDsl.g:9843:2: ( ruleElement )
            {
            // InternalMyDsl.g:9843:2: ( ruleElement )
            // InternalMyDsl.g:9844:3: ruleElement
            {
             before(grammarAccess.getPanelAccess().getElementsElementParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getElementsElementParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__ElementsAssignment_6_1"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalMyDsl.g:9853:1: rule__Table__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9857:1: ( ( ruleEString ) )
            // InternalMyDsl.g:9858:2: ( ruleEString )
            {
            // InternalMyDsl.g:9858:2: ( ruleEString )
            // InternalMyDsl.g:9859:3: ruleEString
            {
             before(grammarAccess.getTableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__TitleAssignment_2_1"
    // InternalMyDsl.g:9868:1: rule__Table__TitleAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Table__TitleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9872:1: ( ( ruleEString ) )
            // InternalMyDsl.g:9873:2: ( ruleEString )
            {
            // InternalMyDsl.g:9873:2: ( ruleEString )
            // InternalMyDsl.g:9874:3: ruleEString
            {
             before(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableAccess().getTitleEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__TitleAssignment_2_1"


    // $ANTLR start "rule__Table__RegistersPerPageAssignment_3_1"
    // InternalMyDsl.g:9883:1: rule__Table__RegistersPerPageAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Table__RegistersPerPageAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9887:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:9888:2: ( ruleEInt )
            {
            // InternalMyDsl.g:9888:2: ( ruleEInt )
            // InternalMyDsl.g:9889:3: ruleEInt
            {
             before(grammarAccess.getTableAccess().getRegistersPerPageEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTableAccess().getRegistersPerPageEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__RegistersPerPageAssignment_3_1"


    // $ANTLR start "rule__Table__ActionsAssignment_4_1"
    // InternalMyDsl.g:9898:1: rule__Table__ActionsAssignment_4_1 : ( ruleAction ) ;
    public final void rule__Table__ActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9902:1: ( ( ruleAction ) )
            // InternalMyDsl.g:9903:2: ( ruleAction )
            {
            // InternalMyDsl.g:9903:2: ( ruleAction )
            // InternalMyDsl.g:9904:3: ruleAction
            {
             before(grammarAccess.getTableAccess().getActionsActionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getTableAccess().getActionsActionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ActionsAssignment_4_1"


    // $ANTLR start "rule__Table__SearchAssignment_5"
    // InternalMyDsl.g:9913:1: rule__Table__SearchAssignment_5 : ( ( 'search' ) ) ;
    public final void rule__Table__SearchAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9917:1: ( ( ( 'search' ) ) )
            // InternalMyDsl.g:9918:2: ( ( 'search' ) )
            {
            // InternalMyDsl.g:9918:2: ( ( 'search' ) )
            // InternalMyDsl.g:9919:3: ( 'search' )
            {
             before(grammarAccess.getTableAccess().getSearchSearchKeyword_5_0()); 
            // InternalMyDsl.g:9920:3: ( 'search' )
            // InternalMyDsl.g:9921:4: 'search'
            {
             before(grammarAccess.getTableAccess().getSearchSearchKeyword_5_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getSearchSearchKeyword_5_0()); 

            }

             after(grammarAccess.getTableAccess().getSearchSearchKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__SearchAssignment_5"


    // $ANTLR start "rule__Table__AddAssignment_6"
    // InternalMyDsl.g:9932:1: rule__Table__AddAssignment_6 : ( ( 'add' ) ) ;
    public final void rule__Table__AddAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9936:1: ( ( ( 'add' ) ) )
            // InternalMyDsl.g:9937:2: ( ( 'add' ) )
            {
            // InternalMyDsl.g:9937:2: ( ( 'add' ) )
            // InternalMyDsl.g:9938:3: ( 'add' )
            {
             before(grammarAccess.getTableAccess().getAddAddKeyword_6_0()); 
            // InternalMyDsl.g:9939:3: ( 'add' )
            // InternalMyDsl.g:9940:4: 'add'
            {
             before(grammarAccess.getTableAccess().getAddAddKeyword_6_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getAddAddKeyword_6_0()); 

            }

             after(grammarAccess.getTableAccess().getAddAddKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__AddAssignment_6"


    // $ANTLR start "rule__Table__ColumnsAssignment_10"
    // InternalMyDsl.g:9951:1: rule__Table__ColumnsAssignment_10 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9955:1: ( ( ruleColumn ) )
            // InternalMyDsl.g:9956:2: ( ruleColumn )
            {
            // InternalMyDsl.g:9956:2: ( ruleColumn )
            // InternalMyDsl.g:9957:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_10"


    // $ANTLR start "rule__Table__ColumnsAssignment_11_1"
    // InternalMyDsl.g:9966:1: rule__Table__ColumnsAssignment_11_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9970:1: ( ( ruleColumn ) )
            // InternalMyDsl.g:9971:2: ( ruleColumn )
            {
            // InternalMyDsl.g:9971:2: ( ruleColumn )
            // InternalMyDsl.g:9972:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_11_1"


    // $ANTLR start "rule__Menu__NameAssignment_1"
    // InternalMyDsl.g:9981:1: rule__Menu__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Menu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9985:1: ( ( ruleEString ) )
            // InternalMyDsl.g:9986:2: ( ruleEString )
            {
            // InternalMyDsl.g:9986:2: ( ruleEString )
            // InternalMyDsl.g:9987:3: ruleEString
            {
             before(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__NameAssignment_1"


    // $ANTLR start "rule__Menu__TitleAssignment_3_1"
    // InternalMyDsl.g:9996:1: rule__Menu__TitleAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Menu__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10000:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10001:2: ( ruleEString )
            {
            // InternalMyDsl.g:10001:2: ( ruleEString )
            // InternalMyDsl.g:10002:3: ruleEString
            {
             before(grammarAccess.getMenuAccess().getTitleEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getTitleEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__TitleAssignment_3_1"


    // $ANTLR start "rule__Menu__OptionsAssignment_7"
    // InternalMyDsl.g:10011:1: rule__Menu__OptionsAssignment_7 : ( ruleOption ) ;
    public final void rule__Menu__OptionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10015:1: ( ( ruleOption ) )
            // InternalMyDsl.g:10016:2: ( ruleOption )
            {
            // InternalMyDsl.g:10016:2: ( ruleOption )
            // InternalMyDsl.g:10017:3: ruleOption
            {
             before(grammarAccess.getMenuAccess().getOptionsOptionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getOptionsOptionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__OptionsAssignment_7"


    // $ANTLR start "rule__Menu__OptionsAssignment_8_1"
    // InternalMyDsl.g:10026:1: rule__Menu__OptionsAssignment_8_1 : ( ruleOption ) ;
    public final void rule__Menu__OptionsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10030:1: ( ( ruleOption ) )
            // InternalMyDsl.g:10031:2: ( ruleOption )
            {
            // InternalMyDsl.g:10031:2: ( ruleOption )
            // InternalMyDsl.g:10032:3: ruleOption
            {
             before(grammarAccess.getMenuAccess().getOptionsOptionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getOptionsOptionParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__OptionsAssignment_8_1"


    // $ANTLR start "rule__Option__NameAssignment_2"
    // InternalMyDsl.g:10041:1: rule__Option__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Option__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10045:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10046:2: ( ruleEString )
            {
            // InternalMyDsl.g:10046:2: ( ruleEString )
            // InternalMyDsl.g:10047:3: ruleEString
            {
             before(grammarAccess.getOptionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__NameAssignment_2"


    // $ANTLR start "rule__Option__IconAssignment_3_1"
    // InternalMyDsl.g:10056:1: rule__Option__IconAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Option__IconAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10060:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10061:2: ( ruleEString )
            {
            // InternalMyDsl.g:10061:2: ( ruleEString )
            // InternalMyDsl.g:10062:3: ruleEString
            {
             before(grammarAccess.getOptionAccess().getIconEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getIconEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__IconAssignment_3_1"


    // $ANTLR start "rule__Option__TitleAssignment_4_1"
    // InternalMyDsl.g:10071:1: rule__Option__TitleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Option__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10075:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10076:2: ( ruleEString )
            {
            // InternalMyDsl.g:10076:2: ( ruleEString )
            // InternalMyDsl.g:10077:3: ruleEString
            {
             before(grammarAccess.getOptionAccess().getTitleEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getTitleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__TitleAssignment_4_1"


    // $ANTLR start "rule__Option__UrlComponentAssignment_5_1"
    // InternalMyDsl.g:10086:1: rule__Option__UrlComponentAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Option__UrlComponentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10090:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10091:2: ( ruleEString )
            {
            // InternalMyDsl.g:10091:2: ( ruleEString )
            // InternalMyDsl.g:10092:3: ruleEString
            {
             before(grammarAccess.getOptionAccess().getUrlComponentEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getUrlComponentEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__UrlComponentAssignment_5_1"


    // $ANTLR start "rule__LineChart__NameAssignment_1"
    // InternalMyDsl.g:10101:1: rule__LineChart__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__LineChart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10105:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10106:2: ( ruleEString )
            {
            // InternalMyDsl.g:10106:2: ( ruleEString )
            // InternalMyDsl.g:10107:3: ruleEString
            {
             before(grammarAccess.getLineChartAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineChartAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__NameAssignment_1"


    // $ANTLR start "rule__LineChart__TitleAssignment_2_1"
    // InternalMyDsl.g:10116:1: rule__LineChart__TitleAssignment_2_1 : ( ruleEString ) ;
    public final void rule__LineChart__TitleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10120:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10121:2: ( ruleEString )
            {
            // InternalMyDsl.g:10121:2: ( ruleEString )
            // InternalMyDsl.g:10122:3: ruleEString
            {
             before(grammarAccess.getLineChartAccess().getTitleEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineChartAccess().getTitleEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__TitleAssignment_2_1"


    // $ANTLR start "rule__LineChart__LegendPositionAssignment_3_1"
    // InternalMyDsl.g:10131:1: rule__LineChart__LegendPositionAssignment_3_1 : ( rulePositionOptions ) ;
    public final void rule__LineChart__LegendPositionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10135:1: ( ( rulePositionOptions ) )
            // InternalMyDsl.g:10136:2: ( rulePositionOptions )
            {
            // InternalMyDsl.g:10136:2: ( rulePositionOptions )
            // InternalMyDsl.g:10137:3: rulePositionOptions
            {
             before(grammarAccess.getLineChartAccess().getLegendPositionPositionOptionsEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePositionOptions();

            state._fsp--;

             after(grammarAccess.getLineChartAccess().getLegendPositionPositionOptionsEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__LegendPositionAssignment_3_1"


    // $ANTLR start "rule__LineChart__LabelStringXAxesAssignment_4_1"
    // InternalMyDsl.g:10146:1: rule__LineChart__LabelStringXAxesAssignment_4_1 : ( ruleEString ) ;
    public final void rule__LineChart__LabelStringXAxesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10150:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10151:2: ( ruleEString )
            {
            // InternalMyDsl.g:10151:2: ( ruleEString )
            // InternalMyDsl.g:10152:3: ruleEString
            {
             before(grammarAccess.getLineChartAccess().getLabelStringXAxesEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineChartAccess().getLabelStringXAxesEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__LabelStringXAxesAssignment_4_1"


    // $ANTLR start "rule__LineChart__ColorGridLinesXAxesAssignment_5_1"
    // InternalMyDsl.g:10161:1: rule__LineChart__ColorGridLinesXAxesAssignment_5_1 : ( ruleEString ) ;
    public final void rule__LineChart__ColorGridLinesXAxesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10165:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10166:2: ( ruleEString )
            {
            // InternalMyDsl.g:10166:2: ( ruleEString )
            // InternalMyDsl.g:10167:3: ruleEString
            {
             before(grammarAccess.getLineChartAccess().getColorGridLinesXAxesEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineChartAccess().getColorGridLinesXAxesEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__ColorGridLinesXAxesAssignment_5_1"


    // $ANTLR start "rule__LineChart__LabelStringYAxesAssignment_6_1"
    // InternalMyDsl.g:10176:1: rule__LineChart__LabelStringYAxesAssignment_6_1 : ( ruleEString ) ;
    public final void rule__LineChart__LabelStringYAxesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10180:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10181:2: ( ruleEString )
            {
            // InternalMyDsl.g:10181:2: ( ruleEString )
            // InternalMyDsl.g:10182:3: ruleEString
            {
             before(grammarAccess.getLineChartAccess().getLabelStringYAxesEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineChartAccess().getLabelStringYAxesEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__LabelStringYAxesAssignment_6_1"


    // $ANTLR start "rule__LineChart__ColorGridLinesYAxesAssignment_7_1"
    // InternalMyDsl.g:10191:1: rule__LineChart__ColorGridLinesYAxesAssignment_7_1 : ( ruleEString ) ;
    public final void rule__LineChart__ColorGridLinesYAxesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10195:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10196:2: ( ruleEString )
            {
            // InternalMyDsl.g:10196:2: ( ruleEString )
            // InternalMyDsl.g:10197:3: ruleEString
            {
             before(grammarAccess.getLineChartAccess().getColorGridLinesYAxesEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineChartAccess().getColorGridLinesYAxesEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__ColorGridLinesYAxesAssignment_7_1"


    // $ANTLR start "rule__LineChart__DisplayGridLinesXAxesAssignment_8"
    // InternalMyDsl.g:10206:1: rule__LineChart__DisplayGridLinesXAxesAssignment_8 : ( ( 'displayGridLinesXAxes' ) ) ;
    public final void rule__LineChart__DisplayGridLinesXAxesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10210:1: ( ( ( 'displayGridLinesXAxes' ) ) )
            // InternalMyDsl.g:10211:2: ( ( 'displayGridLinesXAxes' ) )
            {
            // InternalMyDsl.g:10211:2: ( ( 'displayGridLinesXAxes' ) )
            // InternalMyDsl.g:10212:3: ( 'displayGridLinesXAxes' )
            {
             before(grammarAccess.getLineChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_8_0()); 
            // InternalMyDsl.g:10213:3: ( 'displayGridLinesXAxes' )
            // InternalMyDsl.g:10214:4: 'displayGridLinesXAxes'
            {
             before(grammarAccess.getLineChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_8_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_8_0()); 

            }

             after(grammarAccess.getLineChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__DisplayGridLinesXAxesAssignment_8"


    // $ANTLR start "rule__LineChart__DisplayGridLinesYAxesAssignment_9"
    // InternalMyDsl.g:10225:1: rule__LineChart__DisplayGridLinesYAxesAssignment_9 : ( ( 'displayGridLinesYAxes' ) ) ;
    public final void rule__LineChart__DisplayGridLinesYAxesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10229:1: ( ( ( 'displayGridLinesYAxes' ) ) )
            // InternalMyDsl.g:10230:2: ( ( 'displayGridLinesYAxes' ) )
            {
            // InternalMyDsl.g:10230:2: ( ( 'displayGridLinesYAxes' ) )
            // InternalMyDsl.g:10231:3: ( 'displayGridLinesYAxes' )
            {
             before(grammarAccess.getLineChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_9_0()); 
            // InternalMyDsl.g:10232:3: ( 'displayGridLinesYAxes' )
            // InternalMyDsl.g:10233:4: 'displayGridLinesYAxes'
            {
             before(grammarAccess.getLineChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_9_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_9_0()); 

            }

             after(grammarAccess.getLineChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__DisplayGridLinesYAxesAssignment_9"


    // $ANTLR start "rule__LineChart__DataAssignment_13"
    // InternalMyDsl.g:10244:1: rule__LineChart__DataAssignment_13 : ( ruleData ) ;
    public final void rule__LineChart__DataAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10248:1: ( ( ruleData ) )
            // InternalMyDsl.g:10249:2: ( ruleData )
            {
            // InternalMyDsl.g:10249:2: ( ruleData )
            // InternalMyDsl.g:10250:3: ruleData
            {
             before(grammarAccess.getLineChartAccess().getDataDataParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getLineChartAccess().getDataDataParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__DataAssignment_13"


    // $ANTLR start "rule__LineChart__DataAssignment_14_1"
    // InternalMyDsl.g:10259:1: rule__LineChart__DataAssignment_14_1 : ( ruleData ) ;
    public final void rule__LineChart__DataAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10263:1: ( ( ruleData ) )
            // InternalMyDsl.g:10264:2: ( ruleData )
            {
            // InternalMyDsl.g:10264:2: ( ruleData )
            // InternalMyDsl.g:10265:3: ruleData
            {
             before(grammarAccess.getLineChartAccess().getDataDataParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getLineChartAccess().getDataDataParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__DataAssignment_14_1"


    // $ANTLR start "rule__LineChart__LabelsAssignment_19"
    // InternalMyDsl.g:10274:1: rule__LineChart__LabelsAssignment_19 : ( ruleLabel ) ;
    public final void rule__LineChart__LabelsAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10278:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:10279:2: ( ruleLabel )
            {
            // InternalMyDsl.g:10279:2: ( ruleLabel )
            // InternalMyDsl.g:10280:3: ruleLabel
            {
             before(grammarAccess.getLineChartAccess().getLabelsLabelParserRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLineChartAccess().getLabelsLabelParserRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__LabelsAssignment_19"


    // $ANTLR start "rule__LineChart__LabelsAssignment_20_1"
    // InternalMyDsl.g:10289:1: rule__LineChart__LabelsAssignment_20_1 : ( ruleLabel ) ;
    public final void rule__LineChart__LabelsAssignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10293:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:10294:2: ( ruleLabel )
            {
            // InternalMyDsl.g:10294:2: ( ruleLabel )
            // InternalMyDsl.g:10295:3: ruleLabel
            {
             before(grammarAccess.getLineChartAccess().getLabelsLabelParserRuleCall_20_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLineChartAccess().getLabelsLabelParserRuleCall_20_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__LabelsAssignment_20_1"


    // $ANTLR start "rule__BarChart__NameAssignment_1"
    // InternalMyDsl.g:10304:1: rule__BarChart__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BarChart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10308:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10309:2: ( ruleEString )
            {
            // InternalMyDsl.g:10309:2: ( ruleEString )
            // InternalMyDsl.g:10310:3: ruleEString
            {
             before(grammarAccess.getBarChartAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarChartAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__NameAssignment_1"


    // $ANTLR start "rule__BarChart__TitleAssignment_2_1"
    // InternalMyDsl.g:10319:1: rule__BarChart__TitleAssignment_2_1 : ( ruleEString ) ;
    public final void rule__BarChart__TitleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10323:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10324:2: ( ruleEString )
            {
            // InternalMyDsl.g:10324:2: ( ruleEString )
            // InternalMyDsl.g:10325:3: ruleEString
            {
             before(grammarAccess.getBarChartAccess().getTitleEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarChartAccess().getTitleEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__TitleAssignment_2_1"


    // $ANTLR start "rule__BarChart__LegendPositionAssignment_3_1"
    // InternalMyDsl.g:10334:1: rule__BarChart__LegendPositionAssignment_3_1 : ( rulePositionOptions ) ;
    public final void rule__BarChart__LegendPositionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10338:1: ( ( rulePositionOptions ) )
            // InternalMyDsl.g:10339:2: ( rulePositionOptions )
            {
            // InternalMyDsl.g:10339:2: ( rulePositionOptions )
            // InternalMyDsl.g:10340:3: rulePositionOptions
            {
             before(grammarAccess.getBarChartAccess().getLegendPositionPositionOptionsEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePositionOptions();

            state._fsp--;

             after(grammarAccess.getBarChartAccess().getLegendPositionPositionOptionsEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__LegendPositionAssignment_3_1"


    // $ANTLR start "rule__BarChart__LabelStringXAxesAssignment_4_1"
    // InternalMyDsl.g:10349:1: rule__BarChart__LabelStringXAxesAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BarChart__LabelStringXAxesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10353:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10354:2: ( ruleEString )
            {
            // InternalMyDsl.g:10354:2: ( ruleEString )
            // InternalMyDsl.g:10355:3: ruleEString
            {
             before(grammarAccess.getBarChartAccess().getLabelStringXAxesEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarChartAccess().getLabelStringXAxesEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__LabelStringXAxesAssignment_4_1"


    // $ANTLR start "rule__BarChart__ColorGridLinesXAxesAssignment_5_1"
    // InternalMyDsl.g:10364:1: rule__BarChart__ColorGridLinesXAxesAssignment_5_1 : ( ruleEString ) ;
    public final void rule__BarChart__ColorGridLinesXAxesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10368:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10369:2: ( ruleEString )
            {
            // InternalMyDsl.g:10369:2: ( ruleEString )
            // InternalMyDsl.g:10370:3: ruleEString
            {
             before(grammarAccess.getBarChartAccess().getColorGridLinesXAxesEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarChartAccess().getColorGridLinesXAxesEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__ColorGridLinesXAxesAssignment_5_1"


    // $ANTLR start "rule__BarChart__LabelStringYAxesAssignment_6_1"
    // InternalMyDsl.g:10379:1: rule__BarChart__LabelStringYAxesAssignment_6_1 : ( ruleEString ) ;
    public final void rule__BarChart__LabelStringYAxesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10383:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10384:2: ( ruleEString )
            {
            // InternalMyDsl.g:10384:2: ( ruleEString )
            // InternalMyDsl.g:10385:3: ruleEString
            {
             before(grammarAccess.getBarChartAccess().getLabelStringYAxesEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarChartAccess().getLabelStringYAxesEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__LabelStringYAxesAssignment_6_1"


    // $ANTLR start "rule__BarChart__ColorGridLinesYAxesAssignment_7_1"
    // InternalMyDsl.g:10394:1: rule__BarChart__ColorGridLinesYAxesAssignment_7_1 : ( ruleEString ) ;
    public final void rule__BarChart__ColorGridLinesYAxesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10398:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10399:2: ( ruleEString )
            {
            // InternalMyDsl.g:10399:2: ( ruleEString )
            // InternalMyDsl.g:10400:3: ruleEString
            {
             before(grammarAccess.getBarChartAccess().getColorGridLinesYAxesEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarChartAccess().getColorGridLinesYAxesEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__ColorGridLinesYAxesAssignment_7_1"


    // $ANTLR start "rule__BarChart__BarPercentageAssignment_8_1"
    // InternalMyDsl.g:10409:1: rule__BarChart__BarPercentageAssignment_8_1 : ( ruleEFloat ) ;
    public final void rule__BarChart__BarPercentageAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10413:1: ( ( ruleEFloat ) )
            // InternalMyDsl.g:10414:2: ( ruleEFloat )
            {
            // InternalMyDsl.g:10414:2: ( ruleEFloat )
            // InternalMyDsl.g:10415:3: ruleEFloat
            {
             before(grammarAccess.getBarChartAccess().getBarPercentageEFloatParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getBarChartAccess().getBarPercentageEFloatParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__BarPercentageAssignment_8_1"


    // $ANTLR start "rule__BarChart__DisplayGridLinesXAxesAssignment_9"
    // InternalMyDsl.g:10424:1: rule__BarChart__DisplayGridLinesXAxesAssignment_9 : ( ( 'displayGridLinesXAxes' ) ) ;
    public final void rule__BarChart__DisplayGridLinesXAxesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10428:1: ( ( ( 'displayGridLinesXAxes' ) ) )
            // InternalMyDsl.g:10429:2: ( ( 'displayGridLinesXAxes' ) )
            {
            // InternalMyDsl.g:10429:2: ( ( 'displayGridLinesXAxes' ) )
            // InternalMyDsl.g:10430:3: ( 'displayGridLinesXAxes' )
            {
             before(grammarAccess.getBarChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_9_0()); 
            // InternalMyDsl.g:10431:3: ( 'displayGridLinesXAxes' )
            // InternalMyDsl.g:10432:4: 'displayGridLinesXAxes'
            {
             before(grammarAccess.getBarChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_9_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_9_0()); 

            }

             after(grammarAccess.getBarChartAccess().getDisplayGridLinesXAxesDisplayGridLinesXAxesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__DisplayGridLinesXAxesAssignment_9"


    // $ANTLR start "rule__BarChart__DisplayGridLinesYAxesAssignment_10"
    // InternalMyDsl.g:10443:1: rule__BarChart__DisplayGridLinesYAxesAssignment_10 : ( ( 'displayGridLinesYAxes' ) ) ;
    public final void rule__BarChart__DisplayGridLinesYAxesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10447:1: ( ( ( 'displayGridLinesYAxes' ) ) )
            // InternalMyDsl.g:10448:2: ( ( 'displayGridLinesYAxes' ) )
            {
            // InternalMyDsl.g:10448:2: ( ( 'displayGridLinesYAxes' ) )
            // InternalMyDsl.g:10449:3: ( 'displayGridLinesYAxes' )
            {
             before(grammarAccess.getBarChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_10_0()); 
            // InternalMyDsl.g:10450:3: ( 'displayGridLinesYAxes' )
            // InternalMyDsl.g:10451:4: 'displayGridLinesYAxes'
            {
             before(grammarAccess.getBarChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_10_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_10_0()); 

            }

             after(grammarAccess.getBarChartAccess().getDisplayGridLinesYAxesDisplayGridLinesYAxesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__DisplayGridLinesYAxesAssignment_10"


    // $ANTLR start "rule__BarChart__DataAssignment_14"
    // InternalMyDsl.g:10462:1: rule__BarChart__DataAssignment_14 : ( ruleData ) ;
    public final void rule__BarChart__DataAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10466:1: ( ( ruleData ) )
            // InternalMyDsl.g:10467:2: ( ruleData )
            {
            // InternalMyDsl.g:10467:2: ( ruleData )
            // InternalMyDsl.g:10468:3: ruleData
            {
             before(grammarAccess.getBarChartAccess().getDataDataParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getBarChartAccess().getDataDataParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__DataAssignment_14"


    // $ANTLR start "rule__BarChart__DataAssignment_15_1"
    // InternalMyDsl.g:10477:1: rule__BarChart__DataAssignment_15_1 : ( ruleData ) ;
    public final void rule__BarChart__DataAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10481:1: ( ( ruleData ) )
            // InternalMyDsl.g:10482:2: ( ruleData )
            {
            // InternalMyDsl.g:10482:2: ( ruleData )
            // InternalMyDsl.g:10483:3: ruleData
            {
             before(grammarAccess.getBarChartAccess().getDataDataParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getBarChartAccess().getDataDataParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__DataAssignment_15_1"


    // $ANTLR start "rule__BarChart__LabelsAssignment_20"
    // InternalMyDsl.g:10492:1: rule__BarChart__LabelsAssignment_20 : ( ruleLabel ) ;
    public final void rule__BarChart__LabelsAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10496:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:10497:2: ( ruleLabel )
            {
            // InternalMyDsl.g:10497:2: ( ruleLabel )
            // InternalMyDsl.g:10498:3: ruleLabel
            {
             before(grammarAccess.getBarChartAccess().getLabelsLabelParserRuleCall_20_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getBarChartAccess().getLabelsLabelParserRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__LabelsAssignment_20"


    // $ANTLR start "rule__BarChart__LabelsAssignment_21_1"
    // InternalMyDsl.g:10507:1: rule__BarChart__LabelsAssignment_21_1 : ( ruleLabel ) ;
    public final void rule__BarChart__LabelsAssignment_21_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10511:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:10512:2: ( ruleLabel )
            {
            // InternalMyDsl.g:10512:2: ( ruleLabel )
            // InternalMyDsl.g:10513:3: ruleLabel
            {
             before(grammarAccess.getBarChartAccess().getLabelsLabelParserRuleCall_21_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getBarChartAccess().getLabelsLabelParserRuleCall_21_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__LabelsAssignment_21_1"


    // $ANTLR start "rule__RadarChart__NameAssignment_1"
    // InternalMyDsl.g:10522:1: rule__RadarChart__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RadarChart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10526:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10527:2: ( ruleEString )
            {
            // InternalMyDsl.g:10527:2: ( ruleEString )
            // InternalMyDsl.g:10528:3: ruleEString
            {
             before(grammarAccess.getRadarChartAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRadarChartAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__NameAssignment_1"


    // $ANTLR start "rule__RadarChart__TitleAssignment_2_1"
    // InternalMyDsl.g:10537:1: rule__RadarChart__TitleAssignment_2_1 : ( ruleEString ) ;
    public final void rule__RadarChart__TitleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10541:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10542:2: ( ruleEString )
            {
            // InternalMyDsl.g:10542:2: ( ruleEString )
            // InternalMyDsl.g:10543:3: ruleEString
            {
             before(grammarAccess.getRadarChartAccess().getTitleEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRadarChartAccess().getTitleEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__TitleAssignment_2_1"


    // $ANTLR start "rule__RadarChart__LegendPositionAssignment_3_1"
    // InternalMyDsl.g:10552:1: rule__RadarChart__LegendPositionAssignment_3_1 : ( rulePositionOptions ) ;
    public final void rule__RadarChart__LegendPositionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10556:1: ( ( rulePositionOptions ) )
            // InternalMyDsl.g:10557:2: ( rulePositionOptions )
            {
            // InternalMyDsl.g:10557:2: ( rulePositionOptions )
            // InternalMyDsl.g:10558:3: rulePositionOptions
            {
             before(grammarAccess.getRadarChartAccess().getLegendPositionPositionOptionsEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePositionOptions();

            state._fsp--;

             after(grammarAccess.getRadarChartAccess().getLegendPositionPositionOptionsEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__LegendPositionAssignment_3_1"


    // $ANTLR start "rule__RadarChart__AngleLinesDisplayAssignment_4"
    // InternalMyDsl.g:10567:1: rule__RadarChart__AngleLinesDisplayAssignment_4 : ( ( 'angleLinesDisplay' ) ) ;
    public final void rule__RadarChart__AngleLinesDisplayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10571:1: ( ( ( 'angleLinesDisplay' ) ) )
            // InternalMyDsl.g:10572:2: ( ( 'angleLinesDisplay' ) )
            {
            // InternalMyDsl.g:10572:2: ( ( 'angleLinesDisplay' ) )
            // InternalMyDsl.g:10573:3: ( 'angleLinesDisplay' )
            {
             before(grammarAccess.getRadarChartAccess().getAngleLinesDisplayAngleLinesDisplayKeyword_4_0()); 
            // InternalMyDsl.g:10574:3: ( 'angleLinesDisplay' )
            // InternalMyDsl.g:10575:4: 'angleLinesDisplay'
            {
             before(grammarAccess.getRadarChartAccess().getAngleLinesDisplayAngleLinesDisplayKeyword_4_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getRadarChartAccess().getAngleLinesDisplayAngleLinesDisplayKeyword_4_0()); 

            }

             after(grammarAccess.getRadarChartAccess().getAngleLinesDisplayAngleLinesDisplayKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__AngleLinesDisplayAssignment_4"


    // $ANTLR start "rule__RadarChart__DataAssignment_8"
    // InternalMyDsl.g:10586:1: rule__RadarChart__DataAssignment_8 : ( ruleData ) ;
    public final void rule__RadarChart__DataAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10590:1: ( ( ruleData ) )
            // InternalMyDsl.g:10591:2: ( ruleData )
            {
            // InternalMyDsl.g:10591:2: ( ruleData )
            // InternalMyDsl.g:10592:3: ruleData
            {
             before(grammarAccess.getRadarChartAccess().getDataDataParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getRadarChartAccess().getDataDataParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__DataAssignment_8"


    // $ANTLR start "rule__RadarChart__DataAssignment_9_1"
    // InternalMyDsl.g:10601:1: rule__RadarChart__DataAssignment_9_1 : ( ruleData ) ;
    public final void rule__RadarChart__DataAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10605:1: ( ( ruleData ) )
            // InternalMyDsl.g:10606:2: ( ruleData )
            {
            // InternalMyDsl.g:10606:2: ( ruleData )
            // InternalMyDsl.g:10607:3: ruleData
            {
             before(grammarAccess.getRadarChartAccess().getDataDataParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getRadarChartAccess().getDataDataParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__DataAssignment_9_1"


    // $ANTLR start "rule__RadarChart__LabelsAssignment_14"
    // InternalMyDsl.g:10616:1: rule__RadarChart__LabelsAssignment_14 : ( ruleLabel ) ;
    public final void rule__RadarChart__LabelsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10620:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:10621:2: ( ruleLabel )
            {
            // InternalMyDsl.g:10621:2: ( ruleLabel )
            // InternalMyDsl.g:10622:3: ruleLabel
            {
             before(grammarAccess.getRadarChartAccess().getLabelsLabelParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getRadarChartAccess().getLabelsLabelParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__LabelsAssignment_14"


    // $ANTLR start "rule__RadarChart__LabelsAssignment_15_1"
    // InternalMyDsl.g:10631:1: rule__RadarChart__LabelsAssignment_15_1 : ( ruleLabel ) ;
    public final void rule__RadarChart__LabelsAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10635:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:10636:2: ( ruleLabel )
            {
            // InternalMyDsl.g:10636:2: ( ruleLabel )
            // InternalMyDsl.g:10637:3: ruleLabel
            {
             before(grammarAccess.getRadarChartAccess().getLabelsLabelParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getRadarChartAccess().getLabelsLabelParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadarChart__LabelsAssignment_15_1"


    // $ANTLR start "rule__PieChart__NameAssignment_2"
    // InternalMyDsl.g:10646:1: rule__PieChart__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PieChart__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10650:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10651:2: ( ruleEString )
            {
            // InternalMyDsl.g:10651:2: ( ruleEString )
            // InternalMyDsl.g:10652:3: ruleEString
            {
             before(grammarAccess.getPieChartAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieChartAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__NameAssignment_2"


    // $ANTLR start "rule__PieChart__TitleAssignment_3_1"
    // InternalMyDsl.g:10661:1: rule__PieChart__TitleAssignment_3_1 : ( ruleEString ) ;
    public final void rule__PieChart__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10665:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10666:2: ( ruleEString )
            {
            // InternalMyDsl.g:10666:2: ( ruleEString )
            // InternalMyDsl.g:10667:3: ruleEString
            {
             before(grammarAccess.getPieChartAccess().getTitleEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPieChartAccess().getTitleEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__TitleAssignment_3_1"


    // $ANTLR start "rule__PieChart__LegendPositionAssignment_4_1"
    // InternalMyDsl.g:10676:1: rule__PieChart__LegendPositionAssignment_4_1 : ( rulePositionOptions ) ;
    public final void rule__PieChart__LegendPositionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10680:1: ( ( rulePositionOptions ) )
            // InternalMyDsl.g:10681:2: ( rulePositionOptions )
            {
            // InternalMyDsl.g:10681:2: ( rulePositionOptions )
            // InternalMyDsl.g:10682:3: rulePositionOptions
            {
             before(grammarAccess.getPieChartAccess().getLegendPositionPositionOptionsEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePositionOptions();

            state._fsp--;

             after(grammarAccess.getPieChartAccess().getLegendPositionPositionOptionsEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__LegendPositionAssignment_4_1"


    // $ANTLR start "rule__PieChart__DataAssignment_8"
    // InternalMyDsl.g:10691:1: rule__PieChart__DataAssignment_8 : ( ruleData ) ;
    public final void rule__PieChart__DataAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10695:1: ( ( ruleData ) )
            // InternalMyDsl.g:10696:2: ( ruleData )
            {
            // InternalMyDsl.g:10696:2: ( ruleData )
            // InternalMyDsl.g:10697:3: ruleData
            {
             before(grammarAccess.getPieChartAccess().getDataDataParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getPieChartAccess().getDataDataParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__DataAssignment_8"


    // $ANTLR start "rule__PieChart__DataAssignment_9_1"
    // InternalMyDsl.g:10706:1: rule__PieChart__DataAssignment_9_1 : ( ruleData ) ;
    public final void rule__PieChart__DataAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10710:1: ( ( ruleData ) )
            // InternalMyDsl.g:10711:2: ( ruleData )
            {
            // InternalMyDsl.g:10711:2: ( ruleData )
            // InternalMyDsl.g:10712:3: ruleData
            {
             before(grammarAccess.getPieChartAccess().getDataDataParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getPieChartAccess().getDataDataParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__DataAssignment_9_1"


    // $ANTLR start "rule__PieChart__LabelsAssignment_14"
    // InternalMyDsl.g:10721:1: rule__PieChart__LabelsAssignment_14 : ( ruleLabel ) ;
    public final void rule__PieChart__LabelsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10725:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:10726:2: ( ruleLabel )
            {
            // InternalMyDsl.g:10726:2: ( ruleLabel )
            // InternalMyDsl.g:10727:3: ruleLabel
            {
             before(grammarAccess.getPieChartAccess().getLabelsLabelParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getPieChartAccess().getLabelsLabelParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__LabelsAssignment_14"


    // $ANTLR start "rule__PieChart__LabelsAssignment_15_1"
    // InternalMyDsl.g:10736:1: rule__PieChart__LabelsAssignment_15_1 : ( ruleLabel ) ;
    public final void rule__PieChart__LabelsAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10740:1: ( ( ruleLabel ) )
            // InternalMyDsl.g:10741:2: ( ruleLabel )
            {
            // InternalMyDsl.g:10741:2: ( ruleLabel )
            // InternalMyDsl.g:10742:3: ruleLabel
            {
             before(grammarAccess.getPieChartAccess().getLabelsLabelParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getPieChartAccess().getLabelsLabelParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__LabelsAssignment_15_1"


    // $ANTLR start "rule__Action__NameAssignment_2"
    // InternalMyDsl.g:10751:1: rule__Action__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Action__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10755:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10756:2: ( ruleEString )
            {
            // InternalMyDsl.g:10756:2: ( ruleEString )
            // InternalMyDsl.g:10757:3: ruleEString
            {
             before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_2"


    // $ANTLR start "rule__Action__ColumnTitleAssignment_3_1"
    // InternalMyDsl.g:10766:1: rule__Action__ColumnTitleAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Action__ColumnTitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10770:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10771:2: ( ruleEString )
            {
            // InternalMyDsl.g:10771:2: ( ruleEString )
            // InternalMyDsl.g:10772:3: ruleEString
            {
             before(grammarAccess.getActionAccess().getColumnTitleEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getColumnTitleEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ColumnTitleAssignment_3_1"


    // $ANTLR start "rule__Action__PositionAssignment_4_1"
    // InternalMyDsl.g:10781:1: rule__Action__PositionAssignment_4_1 : ( rulePositionOptions ) ;
    public final void rule__Action__PositionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10785:1: ( ( rulePositionOptions ) )
            // InternalMyDsl.g:10786:2: ( rulePositionOptions )
            {
            // InternalMyDsl.g:10786:2: ( rulePositionOptions )
            // InternalMyDsl.g:10787:3: rulePositionOptions
            {
             before(grammarAccess.getActionAccess().getPositionPositionOptionsEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePositionOptions();

            state._fsp--;

             after(grammarAccess.getActionAccess().getPositionPositionOptionsEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__PositionAssignment_4_1"


    // $ANTLR start "rule__Action__AddAssignment_5"
    // InternalMyDsl.g:10796:1: rule__Action__AddAssignment_5 : ( ( 'add' ) ) ;
    public final void rule__Action__AddAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10800:1: ( ( ( 'add' ) ) )
            // InternalMyDsl.g:10801:2: ( ( 'add' ) )
            {
            // InternalMyDsl.g:10801:2: ( ( 'add' ) )
            // InternalMyDsl.g:10802:3: ( 'add' )
            {
             before(grammarAccess.getActionAccess().getAddAddKeyword_5_0()); 
            // InternalMyDsl.g:10803:3: ( 'add' )
            // InternalMyDsl.g:10804:4: 'add'
            {
             before(grammarAccess.getActionAccess().getAddAddKeyword_5_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getAddAddKeyword_5_0()); 

            }

             after(grammarAccess.getActionAccess().getAddAddKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__AddAssignment_5"


    // $ANTLR start "rule__Action__FilterAssignment_6"
    // InternalMyDsl.g:10815:1: rule__Action__FilterAssignment_6 : ( ( 'filter' ) ) ;
    public final void rule__Action__FilterAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10819:1: ( ( ( 'filter' ) ) )
            // InternalMyDsl.g:10820:2: ( ( 'filter' ) )
            {
            // InternalMyDsl.g:10820:2: ( ( 'filter' ) )
            // InternalMyDsl.g:10821:3: ( 'filter' )
            {
             before(grammarAccess.getActionAccess().getFilterFilterKeyword_6_0()); 
            // InternalMyDsl.g:10822:3: ( 'filter' )
            // InternalMyDsl.g:10823:4: 'filter'
            {
             before(grammarAccess.getActionAccess().getFilterFilterKeyword_6_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getFilterFilterKeyword_6_0()); 

            }

             after(grammarAccess.getActionAccess().getFilterFilterKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__FilterAssignment_6"


    // $ANTLR start "rule__Action__EditAssignment_7"
    // InternalMyDsl.g:10834:1: rule__Action__EditAssignment_7 : ( ( 'edit' ) ) ;
    public final void rule__Action__EditAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10838:1: ( ( ( 'edit' ) ) )
            // InternalMyDsl.g:10839:2: ( ( 'edit' ) )
            {
            // InternalMyDsl.g:10839:2: ( ( 'edit' ) )
            // InternalMyDsl.g:10840:3: ( 'edit' )
            {
             before(grammarAccess.getActionAccess().getEditEditKeyword_7_0()); 
            // InternalMyDsl.g:10841:3: ( 'edit' )
            // InternalMyDsl.g:10842:4: 'edit'
            {
             before(grammarAccess.getActionAccess().getEditEditKeyword_7_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getEditEditKeyword_7_0()); 

            }

             after(grammarAccess.getActionAccess().getEditEditKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__EditAssignment_7"


    // $ANTLR start "rule__Action__DeleteAssignment_8"
    // InternalMyDsl.g:10853:1: rule__Action__DeleteAssignment_8 : ( ( 'delete' ) ) ;
    public final void rule__Action__DeleteAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10857:1: ( ( ( 'delete' ) ) )
            // InternalMyDsl.g:10858:2: ( ( 'delete' ) )
            {
            // InternalMyDsl.g:10858:2: ( ( 'delete' ) )
            // InternalMyDsl.g:10859:3: ( 'delete' )
            {
             before(grammarAccess.getActionAccess().getDeleteDeleteKeyword_8_0()); 
            // InternalMyDsl.g:10860:3: ( 'delete' )
            // InternalMyDsl.g:10861:4: 'delete'
            {
             before(grammarAccess.getActionAccess().getDeleteDeleteKeyword_8_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getDeleteDeleteKeyword_8_0()); 

            }

             after(grammarAccess.getActionAccess().getDeleteDeleteKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__DeleteAssignment_8"


    // $ANTLR start "rule__Column__NameAssignment_2"
    // InternalMyDsl.g:10872:1: rule__Column__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Column__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10876:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10877:2: ( ruleEString )
            {
            // InternalMyDsl.g:10877:2: ( ruleEString )
            // InternalMyDsl.g:10878:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment_2"


    // $ANTLR start "rule__Column__TitleAssignment_3_1"
    // InternalMyDsl.g:10887:1: rule__Column__TitleAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Column__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10891:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10892:2: ( ruleEString )
            {
            // InternalMyDsl.g:10892:2: ( ruleEString )
            // InternalMyDsl.g:10893:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getTitleEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getTitleEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__TitleAssignment_3_1"


    // $ANTLR start "rule__Column__SourceAssignment_4_1"
    // InternalMyDsl.g:10902:1: rule__Column__SourceAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Column__SourceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10906:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:10907:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:10907:2: ( ( ruleEString ) )
            // InternalMyDsl.g:10908:3: ( ruleEString )
            {
             before(grammarAccess.getColumnAccess().getSourceCollectionCrossReference_4_1_0()); 
            // InternalMyDsl.g:10909:3: ( ruleEString )
            // InternalMyDsl.g:10910:4: ruleEString
            {
             before(grammarAccess.getColumnAccess().getSourceCollectionEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getSourceCollectionEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getColumnAccess().getSourceCollectionCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__SourceAssignment_4_1"


    // $ANTLR start "rule__Column__FilterAssignment_5"
    // InternalMyDsl.g:10921:1: rule__Column__FilterAssignment_5 : ( ( 'filter' ) ) ;
    public final void rule__Column__FilterAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10925:1: ( ( ( 'filter' ) ) )
            // InternalMyDsl.g:10926:2: ( ( 'filter' ) )
            {
            // InternalMyDsl.g:10926:2: ( ( 'filter' ) )
            // InternalMyDsl.g:10927:3: ( 'filter' )
            {
             before(grammarAccess.getColumnAccess().getFilterFilterKeyword_5_0()); 
            // InternalMyDsl.g:10928:3: ( 'filter' )
            // InternalMyDsl.g:10929:4: 'filter'
            {
             before(grammarAccess.getColumnAccess().getFilterFilterKeyword_5_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getFilterFilterKeyword_5_0()); 

            }

             after(grammarAccess.getColumnAccess().getFilterFilterKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__FilterAssignment_5"


    // $ANTLR start "rule__Column__EditableAssignment_6"
    // InternalMyDsl.g:10940:1: rule__Column__EditableAssignment_6 : ( ( 'editable' ) ) ;
    public final void rule__Column__EditableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10944:1: ( ( ( 'editable' ) ) )
            // InternalMyDsl.g:10945:2: ( ( 'editable' ) )
            {
            // InternalMyDsl.g:10945:2: ( ( 'editable' ) )
            // InternalMyDsl.g:10946:3: ( 'editable' )
            {
             before(grammarAccess.getColumnAccess().getEditableEditableKeyword_6_0()); 
            // InternalMyDsl.g:10947:3: ( 'editable' )
            // InternalMyDsl.g:10948:4: 'editable'
            {
             before(grammarAccess.getColumnAccess().getEditableEditableKeyword_6_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getEditableEditableKeyword_6_0()); 

            }

             after(grammarAccess.getColumnAccess().getEditableEditableKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__EditableAssignment_6"


    // $ANTLR start "rule__Data__NameAssignment_1"
    // InternalMyDsl.g:10959:1: rule__Data__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Data__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10963:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10964:2: ( ruleEString )
            {
            // InternalMyDsl.g:10964:2: ( ruleEString )
            // InternalMyDsl.g:10965:3: ruleEString
            {
             before(grammarAccess.getDataAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__NameAssignment_1"


    // $ANTLR start "rule__Data__CategoryAssignment_2_1"
    // InternalMyDsl.g:10974:1: rule__Data__CategoryAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Data__CategoryAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10978:1: ( ( ruleEString ) )
            // InternalMyDsl.g:10979:2: ( ruleEString )
            {
            // InternalMyDsl.g:10979:2: ( ruleEString )
            // InternalMyDsl.g:10980:3: ruleEString
            {
             before(grammarAccess.getDataAccess().getCategoryEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataAccess().getCategoryEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__CategoryAssignment_2_1"


    // $ANTLR start "rule__Data__BorderColorAssignment_3_1"
    // InternalMyDsl.g:10989:1: rule__Data__BorderColorAssignment_3_1 : ( ruleColors ) ;
    public final void rule__Data__BorderColorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10993:1: ( ( ruleColors ) )
            // InternalMyDsl.g:10994:2: ( ruleColors )
            {
            // InternalMyDsl.g:10994:2: ( ruleColors )
            // InternalMyDsl.g:10995:3: ruleColors
            {
             before(grammarAccess.getDataAccess().getBorderColorColorsEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getDataAccess().getBorderColorColorsEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__BorderColorAssignment_3_1"


    // $ANTLR start "rule__Data__BackgroundColorAssignment_4_1"
    // InternalMyDsl.g:11004:1: rule__Data__BackgroundColorAssignment_4_1 : ( ruleColors ) ;
    public final void rule__Data__BackgroundColorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11008:1: ( ( ruleColors ) )
            // InternalMyDsl.g:11009:2: ( ruleColors )
            {
            // InternalMyDsl.g:11009:2: ( ruleColors )
            // InternalMyDsl.g:11010:3: ruleColors
            {
             before(grammarAccess.getDataAccess().getBackgroundColorColorsEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getDataAccess().getBackgroundColorColorsEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__BackgroundColorAssignment_4_1"


    // $ANTLR start "rule__Data__BorderDashAssignment_5_1"
    // InternalMyDsl.g:11019:1: rule__Data__BorderDashAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Data__BorderDashAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11023:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:11024:2: ( ruleEInt )
            {
            // InternalMyDsl.g:11024:2: ( ruleEInt )
            // InternalMyDsl.g:11025:3: ruleEInt
            {
             before(grammarAccess.getDataAccess().getBorderDashEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDataAccess().getBorderDashEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__BorderDashAssignment_5_1"


    // $ANTLR start "rule__Data__FillAssignment_6"
    // InternalMyDsl.g:11034:1: rule__Data__FillAssignment_6 : ( ( 'fill' ) ) ;
    public final void rule__Data__FillAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11038:1: ( ( ( 'fill' ) ) )
            // InternalMyDsl.g:11039:2: ( ( 'fill' ) )
            {
            // InternalMyDsl.g:11039:2: ( ( 'fill' ) )
            // InternalMyDsl.g:11040:3: ( 'fill' )
            {
             before(grammarAccess.getDataAccess().getFillFillKeyword_6_0()); 
            // InternalMyDsl.g:11041:3: ( 'fill' )
            // InternalMyDsl.g:11042:4: 'fill'
            {
             before(grammarAccess.getDataAccess().getFillFillKeyword_6_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getFillFillKeyword_6_0()); 

            }

             after(grammarAccess.getDataAccess().getFillFillKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__FillAssignment_6"


    // $ANTLR start "rule__Data__DataAssignment_9"
    // InternalMyDsl.g:11053:1: rule__Data__DataAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Data__DataAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11057:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:11058:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:11058:2: ( ( ruleEString ) )
            // InternalMyDsl.g:11059:3: ( ruleEString )
            {
             before(grammarAccess.getDataAccess().getDataCollectionCrossReference_9_0()); 
            // InternalMyDsl.g:11060:3: ( ruleEString )
            // InternalMyDsl.g:11061:4: ruleEString
            {
             before(grammarAccess.getDataAccess().getDataCollectionEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataAccess().getDataCollectionEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getDataAccess().getDataCollectionCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__DataAssignment_9"


    // $ANTLR start "rule__Data__DataAssignment_10_1"
    // InternalMyDsl.g:11072:1: rule__Data__DataAssignment_10_1 : ( ( ruleEString ) ) ;
    public final void rule__Data__DataAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11076:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:11077:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:11077:2: ( ( ruleEString ) )
            // InternalMyDsl.g:11078:3: ( ruleEString )
            {
             before(grammarAccess.getDataAccess().getDataCollectionCrossReference_10_1_0()); 
            // InternalMyDsl.g:11079:3: ( ruleEString )
            // InternalMyDsl.g:11080:4: ruleEString
            {
             before(grammarAccess.getDataAccess().getDataCollectionEStringParserRuleCall_10_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataAccess().getDataCollectionEStringParserRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getDataAccess().getDataCollectionCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__DataAssignment_10_1"


    // $ANTLR start "rule__Label__NameAssignment_2"
    // InternalMyDsl.g:11091:1: rule__Label__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Label__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11095:1: ( ( ruleEString ) )
            // InternalMyDsl.g:11096:2: ( ruleEString )
            {
            // InternalMyDsl.g:11096:2: ( ruleEString )
            // InternalMyDsl.g:11097:3: ruleEString
            {
             before(grammarAccess.getLabelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLabelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__NameAssignment_2"


    // $ANTLR start "rule__DBServer__NameAssignment_1"
    // InternalMyDsl.g:11106:1: rule__DBServer__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DBServer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11110:1: ( ( ruleEString ) )
            // InternalMyDsl.g:11111:2: ( ruleEString )
            {
            // InternalMyDsl.g:11111:2: ( ruleEString )
            // InternalMyDsl.g:11112:3: ruleEString
            {
             before(grammarAccess.getDBServerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDBServerAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__NameAssignment_1"


    // $ANTLR start "rule__DBServer__SystemManagerAssignment_2_1"
    // InternalMyDsl.g:11121:1: rule__DBServer__SystemManagerAssignment_2_1 : ( ruleDBSystem ) ;
    public final void rule__DBServer__SystemManagerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11125:1: ( ( ruleDBSystem ) )
            // InternalMyDsl.g:11126:2: ( ruleDBSystem )
            {
            // InternalMyDsl.g:11126:2: ( ruleDBSystem )
            // InternalMyDsl.g:11127:3: ruleDBSystem
            {
             before(grammarAccess.getDBServerAccess().getSystemManagerDBSystemEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDBSystem();

            state._fsp--;

             after(grammarAccess.getDBServerAccess().getSystemManagerDBSystemEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__SystemManagerAssignment_2_1"


    // $ANTLR start "rule__DBServer__TokenAssignment_3_1"
    // InternalMyDsl.g:11136:1: rule__DBServer__TokenAssignment_3_1 : ( ruleEString ) ;
    public final void rule__DBServer__TokenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11140:1: ( ( ruleEString ) )
            // InternalMyDsl.g:11141:2: ( ruleEString )
            {
            // InternalMyDsl.g:11141:2: ( ruleEString )
            // InternalMyDsl.g:11142:3: ruleEString
            {
             before(grammarAccess.getDBServerAccess().getTokenEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDBServerAccess().getTokenEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__TokenAssignment_3_1"


    // $ANTLR start "rule__DBServer__PasswordAssignment_4_1"
    // InternalMyDsl.g:11151:1: rule__DBServer__PasswordAssignment_4_1 : ( ruleEString ) ;
    public final void rule__DBServer__PasswordAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11155:1: ( ( ruleEString ) )
            // InternalMyDsl.g:11156:2: ( ruleEString )
            {
            // InternalMyDsl.g:11156:2: ( ruleEString )
            // InternalMyDsl.g:11157:3: ruleEString
            {
             before(grammarAccess.getDBServerAccess().getPasswordEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDBServerAccess().getPasswordEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__PasswordAssignment_4_1"


    // $ANTLR start "rule__DBServer__RelatedCollectionsAssignment_8"
    // InternalMyDsl.g:11166:1: rule__DBServer__RelatedCollectionsAssignment_8 : ( ruleCollection ) ;
    public final void rule__DBServer__RelatedCollectionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11170:1: ( ( ruleCollection ) )
            // InternalMyDsl.g:11171:2: ( ruleCollection )
            {
            // InternalMyDsl.g:11171:2: ( ruleCollection )
            // InternalMyDsl.g:11172:3: ruleCollection
            {
             before(grammarAccess.getDBServerAccess().getRelatedCollectionsCollectionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleCollection();

            state._fsp--;

             after(grammarAccess.getDBServerAccess().getRelatedCollectionsCollectionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__RelatedCollectionsAssignment_8"


    // $ANTLR start "rule__DBServer__RelatedCollectionsAssignment_9_1"
    // InternalMyDsl.g:11181:1: rule__DBServer__RelatedCollectionsAssignment_9_1 : ( ruleCollection ) ;
    public final void rule__DBServer__RelatedCollectionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11185:1: ( ( ruleCollection ) )
            // InternalMyDsl.g:11186:2: ( ruleCollection )
            {
            // InternalMyDsl.g:11186:2: ( ruleCollection )
            // InternalMyDsl.g:11187:3: ruleCollection
            {
             before(grammarAccess.getDBServerAccess().getRelatedCollectionsCollectionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollection();

            state._fsp--;

             after(grammarAccess.getDBServerAccess().getRelatedCollectionsCollectionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBServer__RelatedCollectionsAssignment_9_1"


    // $ANTLR start "rule__Collection__NameAssignment_1"
    // InternalMyDsl.g:11196:1: rule__Collection__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Collection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11200:1: ( ( ruleEString ) )
            // InternalMyDsl.g:11201:2: ( ruleEString )
            {
            // InternalMyDsl.g:11201:2: ( ruleEString )
            // InternalMyDsl.g:11202:3: ruleEString
            {
             before(grammarAccess.getCollectionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCollectionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__NameAssignment_1"


    // $ANTLR start "rule__Collection__DocumentsAssignment_5"
    // InternalMyDsl.g:11211:1: rule__Collection__DocumentsAssignment_5 : ( ruleDocument ) ;
    public final void rule__Collection__DocumentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11215:1: ( ( ruleDocument ) )
            // InternalMyDsl.g:11216:2: ( ruleDocument )
            {
            // InternalMyDsl.g:11216:2: ( ruleDocument )
            // InternalMyDsl.g:11217:3: ruleDocument
            {
             before(grammarAccess.getCollectionAccess().getDocumentsDocumentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getCollectionAccess().getDocumentsDocumentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__DocumentsAssignment_5"


    // $ANTLR start "rule__Collection__DocumentsAssignment_6_1"
    // InternalMyDsl.g:11226:1: rule__Collection__DocumentsAssignment_6_1 : ( ruleDocument ) ;
    public final void rule__Collection__DocumentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11230:1: ( ( ruleDocument ) )
            // InternalMyDsl.g:11231:2: ( ruleDocument )
            {
            // InternalMyDsl.g:11231:2: ( ruleDocument )
            // InternalMyDsl.g:11232:3: ruleDocument
            {
             before(grammarAccess.getCollectionAccess().getDocumentsDocumentParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getCollectionAccess().getDocumentsDocumentParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collection__DocumentsAssignment_6_1"


    // $ANTLR start "rule__Document__NameAssignment_2"
    // InternalMyDsl.g:11241:1: rule__Document__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Document__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:11245:1: ( ( ruleEString ) )
            // InternalMyDsl.g:11246:2: ( ruleEString )
            {
            // InternalMyDsl.g:11246:2: ( ruleEString )
            // InternalMyDsl.g:11247:3: ruleEString
            {
             before(grammarAccess.getDocumentAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__NameAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\37\uffff";
    static final String dfa_2s = "\1\6\1\4\1\uffff\2\60\1\uffff\1\4\1\uffff\2\60\1\45\4\4\3\uffff\15\70";
    static final String dfa_3s = "\1\64\1\100\1\uffff\2\122\1\uffff\1\5\1\uffff\2\125\1\51\4\5\3\uffff\5\125\10\124";
    static final String dfa_4s = "\2\uffff\1\2\2\uffff\1\6\1\uffff\1\1\7\uffff\1\4\1\5\1\3\15\uffff";
    static final String dfa_5s = "\37\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\55\uffff\1\2",
            "\1\3\1\4\72\uffff\1\5",
            "",
            "\1\7\1\6\2\7\35\uffff\2\7",
            "\1\7\1\6\2\7\35\uffff\2\7",
            "",
            "\1\10\1\11",
            "",
            "\1\7\1\uffff\2\7\4\uffff\1\21\1\uffff\1\12\1\13\1\14\1\15\1\16\1\17\21\uffff\2\7\2\21\1\20",
            "\1\7\1\uffff\2\7\4\uffff\1\21\1\uffff\1\12\1\13\1\14\1\15\1\16\1\17\21\uffff\2\7\2\21\1\20",
            "\1\22\1\23\1\24\1\25\1\26",
            "\1\27\1\30",
            "\1\31\1\32",
            "\1\33\1\34",
            "\1\35\1\36",
            "",
            "",
            "",
            "\1\21\2\uffff\1\13\1\14\1\15\1\16\1\17\23\uffff\2\21\1\20",
            "\1\21\2\uffff\1\13\1\14\1\15\1\16\1\17\23\uffff\2\21\1\20",
            "\1\21\2\uffff\1\13\1\14\1\15\1\16\1\17\23\uffff\2\21\1\20",
            "\1\21\2\uffff\1\13\1\14\1\15\1\16\1\17\23\uffff\2\21\1\20",
            "\1\21\2\uffff\1\13\1\14\1\15\1\16\1\17\23\uffff\2\21\1\20",
            "\1\21\3\uffff\1\14\1\15\1\16\1\17\23\uffff\2\21",
            "\1\21\3\uffff\1\14\1\15\1\16\1\17\23\uffff\2\21",
            "\1\21\4\uffff\1\15\1\16\1\17\23\uffff\2\21",
            "\1\21\4\uffff\1\15\1\16\1\17\23\uffff\2\21",
            "\1\21\5\uffff\1\16\1\17\23\uffff\2\21",
            "\1\21\5\uffff\1\16\1\17\23\uffff\2\21",
            "\1\21\6\uffff\1\17\23\uffff\2\21",
            "\1\21\6\uffff\1\17\23\uffff\2\21"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "625:1: rule__Element__Alternatives : ( ( ruleTable ) | ( ruleMenu ) | ( ruleLineChart ) | ( ruleBarChart ) | ( ruleRadarChart ) | ( rulePieChart ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000F000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L,0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00C2000000000400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x7D00000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0xFC00000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0100000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001000L,0x0000000000018000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0400000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0502000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000400L,0x0000000001C40006L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000400L,0x0000000002400008L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000000000000L,0x00000000040003C0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001FFFC00000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000000000C0000L});

}