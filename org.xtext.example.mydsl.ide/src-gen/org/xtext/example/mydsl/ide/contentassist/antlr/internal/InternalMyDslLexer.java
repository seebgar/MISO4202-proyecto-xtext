package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
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
    public static final int RULE_INT=13;
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
    public static final int RULE_SEMICOLON=12;
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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'E' )
            // InternalMyDsl.g:11:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'e' )
            // InternalMyDsl.g:12:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'MONGODB' )
            // InternalMyDsl.g:13:9: 'MONGODB'
            {
            match("MONGODB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'REDIS' )
            // InternalMyDsl.g:14:9: 'REDIS'
            {
            match("REDIS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'white' )
            // InternalMyDsl.g:15:9: 'white'
            {
            match("white"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( 'blue' )
            // InternalMyDsl.g:16:9: 'blue'
            {
            match("blue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( 'red' )
            // InternalMyDsl.g:17:9: 'red'
            {
            match("red"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'green' )
            // InternalMyDsl.g:18:9: 'green'
            {
            match("green"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'gray' )
            // InternalMyDsl.g:19:9: 'gray'
            {
            match("gray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'yellow' )
            // InternalMyDsl.g:20:9: 'yellow'
            {
            match("yellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'black' )
            // InternalMyDsl.g:21:9: 'black'
            {
            match("black"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( 'cyan' )
            // InternalMyDsl.g:22:9: 'cyan'
            {
            match("cyan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( 'magenta' )
            // InternalMyDsl.g:23:9: 'magenta'
            {
            match("magenta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( 'silver' )
            // InternalMyDsl.g:24:9: 'silver'
            {
            match("silver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( 'maroon' )
            // InternalMyDsl.g:25:9: 'maroon'
            {
            match("maroon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( 'olive' )
            // InternalMyDsl.g:26:9: 'olive'
            {
            match("olive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( 'purple' )
            // InternalMyDsl.g:27:9: 'purple'
            {
            match("purple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( 'teal' )
            // InternalMyDsl.g:28:9: 'teal'
            {
            match("teal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( 'navy' )
            // InternalMyDsl.g:29:9: 'navy'
            {
            match("navy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( 'left' )
            // InternalMyDsl.g:30:9: 'left'
            {
            match("left"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( 'right' )
            // InternalMyDsl.g:31:9: 'right'
            {
            match("right"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( 'center' )
            // InternalMyDsl.g:32:9: 'center'
            {
            match("center"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( 'top' )
            // InternalMyDsl.g:33:9: 'top'
            {
            match("top"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'bottom' )
            // InternalMyDsl.g:34:9: 'bottom'
            {
            match("bottom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'Company' )
            // InternalMyDsl.g:35:9: 'Company'
            {
            match("Company"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'dashboards' )
            // InternalMyDsl.g:36:9: 'dashboards'
            {
            match("dashboards"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'DBServers' )
            // InternalMyDsl.g:37:9: 'DBServers'
            {
            match("DBServers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'nit' )
            // InternalMyDsl.g:38:9: 'nit'
            {
            match("nit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'name' )
            // InternalMyDsl.g:39:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( 'panels' )
            // InternalMyDsl.g:40:9: 'panels'
            {
            match("panels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:7: ( 'elements' )
            // InternalMyDsl.g:41:9: 'elements'
            {
            match("elements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:42:7: ( 'columns' )
            // InternalMyDsl.g:42:9: 'columns'
            {
            match("columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:43:7: ( 'title' )
            // InternalMyDsl.g:43:9: 'title'
            {
            match("title"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:44:7: ( 'registersPerPage' )
            // InternalMyDsl.g:44:9: 'registersPerPage'
            {
            match("registersPerPage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:45:7: ( 'actions' )
            // InternalMyDsl.g:45:9: 'actions'
            {
            match("actions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:46:7: ( 'options' )
            // InternalMyDsl.g:46:9: 'options'
            {
            match("options"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:47:7: ( 'icon' )
            // InternalMyDsl.g:47:9: 'icon'
            {
            match("icon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:48:7: ( 'urlComponent' )
            // InternalMyDsl.g:48:9: 'urlComponent'
            {
            match("urlComponent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:49:7: ( 'data' )
            // InternalMyDsl.g:49:9: 'data'
            {
            match("data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:50:7: ( 'labels' )
            // InternalMyDsl.g:50:9: 'labels'
            {
            match("labels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:51:7: ( 'legendPosition' )
            // InternalMyDsl.g:51:9: 'legendPosition'
            {
            match("legendPosition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:52:7: ( 'labelStringXAxes' )
            // InternalMyDsl.g:52:9: 'labelStringXAxes'
            {
            match("labelStringXAxes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:53:7: ( 'colorGridLinesXAxes' )
            // InternalMyDsl.g:53:9: 'colorGridLinesXAxes'
            {
            match("colorGridLinesXAxes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:54:7: ( 'labelStringYAxes' )
            // InternalMyDsl.g:54:9: 'labelStringYAxes'
            {
            match("labelStringYAxes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:55:7: ( 'colorGridLinesYAxes' )
            // InternalMyDsl.g:55:9: 'colorGridLinesYAxes'
            {
            match("colorGridLinesYAxes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:56:7: ( 'barPercentage' )
            // InternalMyDsl.g:56:9: 'barPercentage'
            {
            match("barPercentage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:57:7: ( 'PIECHART' )
            // InternalMyDsl.g:57:9: 'PIECHART'
            {
            match("PIECHART"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:58:7: ( 'columnTitle' )
            // InternalMyDsl.g:58:9: 'columnTitle'
            {
            match("columnTitle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:59:7: ( 'position' )
            // InternalMyDsl.g:59:9: 'position'
            {
            match("position"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:60:7: ( 'source' )
            // InternalMyDsl.g:60:9: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:61:7: ( 'category' )
            // InternalMyDsl.g:61:9: 'category'
            {
            match("category"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:62:7: ( 'borderColor' )
            // InternalMyDsl.g:62:9: 'borderColor'
            {
            match("borderColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:63:7: ( 'backgroundColor' )
            // InternalMyDsl.g:63:9: 'backgroundColor'
            {
            match("backgroundColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:64:7: ( 'borderDash' )
            // InternalMyDsl.g:64:9: 'borderDash'
            {
            match("borderDash"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:65:7: ( 'relatedCollections' )
            // InternalMyDsl.g:65:9: 'relatedCollections'
            {
            match("relatedCollections"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:66:7: ( 'systemManager' )
            // InternalMyDsl.g:66:9: 'systemManager'
            {
            match("systemManager"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:67:7: ( 'token' )
            // InternalMyDsl.g:67:9: 'token'
            {
            match("token"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:68:7: ( 'password' )
            // InternalMyDsl.g:68:9: 'password'
            {
            match("password"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:69:7: ( 'documents' )
            // InternalMyDsl.g:69:9: 'documents'
            {
            match("documents"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:70:7: ( 'attributes' )
            // InternalMyDsl.g:70:9: 'attributes'
            {
            match("attributes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:71:7: ( 'type' )
            // InternalMyDsl.g:71:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:72:7: ( '-' )
            // InternalMyDsl.g:72:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:73:7: ( '.' )
            // InternalMyDsl.g:73:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:74:7: ( 'search' )
            // InternalMyDsl.g:74:9: 'search'
            {
            match("search"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:75:7: ( 'add' )
            // InternalMyDsl.g:75:9: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:76:7: ( 'displayGridLinesXAxes' )
            // InternalMyDsl.g:76:9: 'displayGridLinesXAxes'
            {
            match("displayGridLinesXAxes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:77:7: ( 'displayGridLinesYAxes' )
            // InternalMyDsl.g:77:9: 'displayGridLinesYAxes'
            {
            match("displayGridLinesYAxes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:78:7: ( 'angleLinesDisplay' )
            // InternalMyDsl.g:78:9: 'angleLinesDisplay'
            {
            match("angleLinesDisplay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:79:7: ( 'filter' )
            // InternalMyDsl.g:79:9: 'filter'
            {
            match("filter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:80:7: ( 'edit' )
            // InternalMyDsl.g:80:9: 'edit'
            {
            match("edit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:81:7: ( 'delete' )
            // InternalMyDsl.g:81:9: 'delete'
            {
            match("delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:82:7: ( 'editable' )
            // InternalMyDsl.g:82:9: 'editable'
            {
            match("editable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:83:7: ( 'fill' )
            // InternalMyDsl.g:83:9: 'fill'
            {
            match("fill"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15796:13: ( '=' )
            // InternalMyDsl.g:15796:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15798:16: ( ';' )
            // InternalMyDsl.g:15798:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_LIST_START"
    public final void mRULE_LIST_START() throws RecognitionException {
        try {
            int _type = RULE_LIST_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15800:17: ( '[' )
            // InternalMyDsl.g:15800:19: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LIST_START"

    // $ANTLR start "RULE_LIST_END"
    public final void mRULE_LIST_END() throws RecognitionException {
        try {
            int _type = RULE_LIST_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15802:15: ( ']' )
            // InternalMyDsl.g:15802:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LIST_END"

    // $ANTLR start "RULE_COMA"
    public final void mRULE_COMA() throws RecognitionException {
        try {
            int _type = RULE_COMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15804:11: ( ',' )
            // InternalMyDsl.g:15804:13: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMA"

    // $ANTLR start "RULE_OBJECT_START"
    public final void mRULE_OBJECT_START() throws RecognitionException {
        try {
            int _type = RULE_OBJECT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15806:19: ( '{' )
            // InternalMyDsl.g:15806:21: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OBJECT_START"

    // $ANTLR start "RULE_OBJECT_END"
    public final void mRULE_OBJECT_END() throws RecognitionException {
        try {
            int _type = RULE_OBJECT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15808:17: ( '}' )
            // InternalMyDsl.g:15808:19: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OBJECT_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15810:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:15810:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:15810:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:15810:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:15810:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15812:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:15812:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:15812:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:15812:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15814:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:15814:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:15814:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:15814:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:15814:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:15814:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:15814:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:15814:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:15814:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:15814:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:15814:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15816:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:15816:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:15816:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:15816:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15818:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:15818:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:15818:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:15818:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:15818:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:15818:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:15818:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:15818:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15820:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:15820:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:15820:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15822:16: ( . )
            // InternalMyDsl.g:15822:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | RULE_EQUALS | RULE_SEMICOLON | RULE_LIST_START | RULE_LIST_END | RULE_COMA | RULE_OBJECT_START | RULE_OBJECT_END | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=87;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalMyDsl.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:244: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:250: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:256: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:262: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:268: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:274: T__62
                {
                mT__62(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:280: T__63
                {
                mT__63(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:286: T__64
                {
                mT__64(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:292: T__65
                {
                mT__65(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:298: T__66
                {
                mT__66(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:304: T__67
                {
                mT__67(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:310: T__68
                {
                mT__68(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:316: T__69
                {
                mT__69(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:322: T__70
                {
                mT__70(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:328: T__71
                {
                mT__71(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:334: T__72
                {
                mT__72(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:340: T__73
                {
                mT__73(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:346: T__74
                {
                mT__74(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:352: T__75
                {
                mT__75(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:358: T__76
                {
                mT__76(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:364: T__77
                {
                mT__77(); 

                }
                break;
            case 61 :
                // InternalMyDsl.g:1:370: T__78
                {
                mT__78(); 

                }
                break;
            case 62 :
                // InternalMyDsl.g:1:376: T__79
                {
                mT__79(); 

                }
                break;
            case 63 :
                // InternalMyDsl.g:1:382: T__80
                {
                mT__80(); 

                }
                break;
            case 64 :
                // InternalMyDsl.g:1:388: T__81
                {
                mT__81(); 

                }
                break;
            case 65 :
                // InternalMyDsl.g:1:394: T__82
                {
                mT__82(); 

                }
                break;
            case 66 :
                // InternalMyDsl.g:1:400: T__83
                {
                mT__83(); 

                }
                break;
            case 67 :
                // InternalMyDsl.g:1:406: T__84
                {
                mT__84(); 

                }
                break;
            case 68 :
                // InternalMyDsl.g:1:412: T__85
                {
                mT__85(); 

                }
                break;
            case 69 :
                // InternalMyDsl.g:1:418: T__86
                {
                mT__86(); 

                }
                break;
            case 70 :
                // InternalMyDsl.g:1:424: T__87
                {
                mT__87(); 

                }
                break;
            case 71 :
                // InternalMyDsl.g:1:430: T__88
                {
                mT__88(); 

                }
                break;
            case 72 :
                // InternalMyDsl.g:1:436: T__89
                {
                mT__89(); 

                }
                break;
            case 73 :
                // InternalMyDsl.g:1:442: T__90
                {
                mT__90(); 

                }
                break;
            case 74 :
                // InternalMyDsl.g:1:448: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 75 :
                // InternalMyDsl.g:1:460: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 76 :
                // InternalMyDsl.g:1:475: RULE_LIST_START
                {
                mRULE_LIST_START(); 

                }
                break;
            case 77 :
                // InternalMyDsl.g:1:491: RULE_LIST_END
                {
                mRULE_LIST_END(); 

                }
                break;
            case 78 :
                // InternalMyDsl.g:1:505: RULE_COMA
                {
                mRULE_COMA(); 

                }
                break;
            case 79 :
                // InternalMyDsl.g:1:515: RULE_OBJECT_START
                {
                mRULE_OBJECT_START(); 

                }
                break;
            case 80 :
                // InternalMyDsl.g:1:533: RULE_OBJECT_END
                {
                mRULE_OBJECT_END(); 

                }
                break;
            case 81 :
                // InternalMyDsl.g:1:549: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 82 :
                // InternalMyDsl.g:1:557: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 83 :
                // InternalMyDsl.g:1:566: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 84 :
                // InternalMyDsl.g:1:578: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 85 :
                // InternalMyDsl.g:1:594: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 86 :
                // InternalMyDsl.g:1:610: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 87 :
                // InternalMyDsl.g:1:618: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\53\1\57\26\54\2\uffff\1\54\7\uffff\1\52\2\uffff\3\52\4\uffff\2\54\1\uffff\55\54\2\uffff\1\54\14\uffff\13\54\1\u00b3\27\54\1\u00cc\5\54\1\u00d2\14\54\1\u00df\6\54\1\u00e8\3\54\1\u00ec\5\54\1\uffff\4\54\1\u00f6\1\54\1\u00f8\20\54\1\u0109\1\uffff\2\54\1\u010c\1\u010d\1\u010e\1\uffff\1\u010f\4\54\1\u0114\6\54\1\uffff\1\54\1\u011c\3\54\1\u0120\2\54\1\uffff\1\54\1\u0124\1\u0125\1\uffff\1\u0126\6\54\1\u012d\1\u012e\1\uffff\1\54\1\uffff\12\54\1\u013a\5\54\1\uffff\1\u0140\1\u0141\4\uffff\4\54\1\uffff\7\54\1\uffff\3\54\1\uffff\3\54\3\uffff\1\u0154\5\54\2\uffff\1\u015b\1\u015c\4\54\1\u0162\1\u0163\1\u0164\1\54\1\u0166\1\uffff\1\54\1\u0168\1\u0169\2\54\2\uffff\1\54\1\u016d\5\54\1\u0173\6\54\1\u017a\2\54\1\u017d\1\uffff\6\54\2\uffff\1\u0184\3\54\1\u0188\3\uffff\1\54\1\uffff\1\u018a\2\uffff\3\54\1\uffff\1\54\1\u018f\3\54\1\uffff\1\54\1\u0194\4\54\1\uffff\1\u0199\1\u019a\1\uffff\6\54\1\uffff\2\54\1\u01a3\1\uffff\1\54\1\uffff\1\u01a5\1\u01a6\2\54\1\uffff\4\54\1\uffff\3\54\1\u01b0\2\uffff\10\54\1\uffff\1\54\2\uffff\3\54\1\u01bd\1\54\1\u01bf\3\54\1\uffff\1\54\1\u01c4\11\54\1\u01ce\1\uffff\1\54\1\uffff\1\u01d0\2\54\1\u01d3\1\uffff\4\54\1\u01d8\4\54\1\uffff\1\54\1\uffff\2\54\1\uffff\4\54\1\uffff\7\54\1\u01ec\1\u01ed\4\54\1\u01f2\5\54\2\uffff\4\54\1\uffff\1\u01fd\4\54\1\u0202\4\54\1\uffff\4\54\1\uffff\1\u020b\3\54\1\u020f\1\u0210\2\54\1\uffff\3\54\2\uffff\2\54\1\u0219\1\u021a\4\54\2\uffff\1\u021f\1\u0220\2\54\2\uffff\2\54\1\u0225\1\u0226\2\uffff";
    static final String DFA12_eofS =
        "\u0227\uffff";
    static final String DFA12_minS =
        "\1\0\2\60\1\117\1\105\1\150\1\141\1\145\1\162\1\145\2\141\1\145\1\154\1\141\1\145\2\141\1\157\1\141\1\102\2\143\1\162\1\111\2\uffff\1\151\7\uffff\1\101\2\uffff\2\0\1\52\4\uffff\1\145\1\151\1\uffff\1\116\1\104\1\151\1\141\1\162\1\143\1\144\1\147\1\141\1\154\1\141\1\156\1\154\1\164\1\147\1\154\1\165\1\163\1\141\1\151\1\164\1\162\1\156\1\163\1\141\1\153\1\164\1\160\1\155\1\164\1\146\1\142\1\155\1\163\1\143\1\163\1\154\1\123\2\164\1\144\1\147\1\157\1\154\1\105\2\uffff\1\154\14\uffff\1\155\1\164\1\107\1\111\1\164\1\145\1\143\1\164\1\144\1\120\1\153\1\60\1\151\1\141\1\150\1\145\1\171\1\154\1\156\1\164\1\157\2\145\1\157\1\166\1\162\1\164\1\162\1\166\1\151\1\160\1\145\1\163\1\151\1\154\1\60\1\145\1\154\1\145\1\171\1\145\1\60\1\164\2\145\1\160\1\150\1\141\1\165\1\160\2\145\1\151\1\162\1\60\1\154\1\156\2\103\1\154\1\145\1\60\1\117\1\123\1\145\1\60\1\153\1\157\2\145\1\147\1\uffff\1\163\2\164\1\156\1\60\1\157\1\60\1\145\1\155\1\162\1\147\1\156\1\157\1\145\1\143\1\145\1\143\1\145\1\157\2\154\1\167\1\164\1\60\1\uffff\1\156\1\145\3\60\1\uffff\1\60\1\156\1\154\1\141\1\142\1\60\1\155\1\154\1\164\1\162\1\157\1\151\1\uffff\1\145\1\60\1\157\1\110\1\145\1\60\1\156\1\142\1\uffff\1\104\2\60\1\uffff\1\60\1\155\3\162\1\164\1\145\2\60\1\uffff\1\167\1\uffff\1\162\1\156\1\107\1\157\1\164\1\156\1\162\1\145\1\155\1\150\1\60\1\156\1\145\1\163\1\157\1\151\1\uffff\2\60\4\uffff\1\144\1\123\1\156\1\157\1\uffff\1\145\1\141\1\145\1\166\1\156\1\142\1\114\1\uffff\1\155\1\101\1\162\1\uffff\1\164\1\154\1\102\3\uffff\1\60\1\103\1\143\1\157\1\145\1\144\2\uffff\2\60\1\124\2\162\1\141\3\60\1\115\1\60\1\uffff\1\163\2\60\1\162\1\157\2\uffff\1\120\1\60\1\164\1\171\1\141\1\156\1\171\1\60\1\145\1\163\1\165\1\151\1\160\1\122\1\60\1\163\1\145\1\60\1\uffff\1\157\1\141\1\145\1\165\1\162\1\103\2\uffff\1\60\2\151\1\171\1\60\3\uffff\1\141\1\uffff\1\60\2\uffff\1\144\1\156\1\157\1\uffff\1\162\1\60\1\162\1\164\1\107\1\uffff\1\162\1\60\1\164\1\156\1\157\1\124\1\uffff\2\60\1\uffff\1\154\1\163\2\156\1\163\1\157\1\uffff\1\164\1\144\1\60\1\uffff\1\156\1\uffff\2\60\1\163\1\151\1\uffff\1\144\1\163\1\162\1\163\1\uffff\2\145\1\156\1\60\2\uffff\1\157\1\150\1\164\1\144\1\120\2\154\1\114\1\uffff\1\141\2\uffff\1\151\1\156\1\163\1\60\1\151\1\60\2\163\1\145\1\uffff\1\162\1\60\1\141\1\103\1\145\1\154\1\145\1\151\1\147\1\164\1\147\1\60\1\uffff\1\144\1\uffff\1\60\1\104\1\156\1\60\1\uffff\1\147\1\157\1\162\1\145\1\60\1\156\1\145\1\151\1\130\1\uffff\1\114\1\uffff\1\151\1\164\1\uffff\1\145\1\154\1\120\1\143\1\uffff\1\145\1\162\1\157\2\101\1\151\1\163\2\60\1\157\1\141\1\164\1\163\1\60\1\156\2\170\1\156\1\160\2\uffff\1\162\1\147\1\151\1\130\1\uffff\1\60\3\145\1\154\1\60\1\145\1\157\2\101\1\uffff\3\163\1\141\1\uffff\1\60\1\156\2\170\2\60\1\130\1\171\1\uffff\1\163\2\145\2\uffff\2\101\2\60\2\163\2\170\2\uffff\2\60\2\145\2\uffff\2\163\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\172\1\117\1\105\1\150\1\157\1\151\1\162\1\145\1\171\1\141\1\171\1\160\1\165\1\171\1\151\1\145\2\157\1\102\1\164\1\143\1\162\1\111\2\uffff\1\151\7\uffff\1\172\2\uffff\2\uffff\1\57\4\uffff\1\145\1\151\1\uffff\1\116\1\104\1\151\1\165\1\164\1\162\1\154\1\147\1\145\1\154\1\141\1\156\1\154\1\164\1\162\1\154\1\165\1\163\1\141\1\151\1\164\1\162\2\163\1\141\1\160\1\164\1\160\1\166\1\164\1\147\1\142\1\155\1\164\1\143\1\163\1\154\1\123\2\164\1\144\1\147\1\157\1\154\1\105\2\uffff\1\154\14\uffff\1\155\1\164\1\107\1\111\1\164\1\145\1\143\1\164\1\144\1\120\1\153\1\172\1\151\1\141\1\150\1\145\1\171\1\154\1\156\1\164\1\165\2\145\1\157\1\166\1\162\1\164\1\162\1\166\1\151\1\160\1\145\1\163\1\151\1\154\1\172\1\145\1\154\1\145\1\171\1\145\1\172\1\164\2\145\1\160\1\150\1\141\1\165\1\160\2\145\1\151\1\162\1\172\1\154\1\156\2\103\1\164\1\145\1\172\1\117\1\123\1\145\1\172\1\153\1\157\2\145\1\147\1\uffff\1\163\2\164\1\156\1\172\1\157\1\172\1\145\1\155\1\162\1\147\1\156\1\157\1\145\1\143\1\145\1\143\1\145\1\157\2\154\1\167\1\164\1\172\1\uffff\1\156\1\145\3\172\1\uffff\1\172\1\156\1\154\1\141\1\142\1\172\1\155\1\154\1\164\1\162\1\157\1\151\1\uffff\1\145\1\172\1\157\1\110\1\145\1\172\1\156\1\142\1\uffff\1\104\2\172\1\uffff\1\172\1\155\3\162\1\164\1\145\2\172\1\uffff\1\167\1\uffff\1\162\1\156\1\107\1\157\1\164\1\156\1\162\1\145\1\155\1\150\1\172\1\156\1\145\1\163\1\157\1\151\1\uffff\2\172\4\uffff\1\144\1\163\1\156\1\157\1\uffff\1\145\1\141\1\145\1\166\1\156\1\142\1\114\1\uffff\1\155\1\101\1\162\1\uffff\1\164\1\154\1\102\3\uffff\1\172\1\104\1\143\1\157\1\145\1\144\2\uffff\2\172\1\163\2\162\1\141\3\172\1\115\1\172\1\uffff\1\163\2\172\1\162\1\157\2\uffff\1\120\1\172\1\164\1\171\1\141\1\156\1\171\1\172\1\145\1\163\1\165\1\151\1\160\1\122\1\172\1\163\1\145\1\172\1\uffff\1\157\1\141\1\145\1\165\1\162\1\103\2\uffff\1\172\2\151\1\171\1\172\3\uffff\1\141\1\uffff\1\172\2\uffff\1\144\1\156\1\157\1\uffff\1\162\1\172\1\162\1\164\1\107\1\uffff\1\162\1\172\1\164\1\156\1\157\1\124\1\uffff\2\172\1\uffff\1\154\1\163\2\156\1\163\1\157\1\uffff\1\164\1\144\1\172\1\uffff\1\156\1\uffff\2\172\1\163\1\151\1\uffff\1\144\1\163\1\162\1\163\1\uffff\2\145\1\156\1\172\2\uffff\1\157\1\150\1\164\1\144\1\120\2\154\1\114\1\uffff\1\141\2\uffff\1\151\1\156\1\163\1\172\1\151\1\172\2\163\1\145\1\uffff\1\162\1\172\1\141\1\103\1\145\1\154\1\145\1\151\1\147\1\164\1\147\1\172\1\uffff\1\144\1\uffff\1\172\1\104\1\156\1\172\1\uffff\1\147\1\157\1\162\1\145\1\172\1\156\1\145\1\151\1\131\1\uffff\1\114\1\uffff\1\151\1\164\1\uffff\1\145\1\154\1\120\1\143\1\uffff\1\145\1\162\1\157\2\101\1\151\1\163\2\172\1\157\1\141\1\164\1\163\1\172\1\156\2\170\1\156\1\160\2\uffff\1\162\1\147\1\151\1\131\1\uffff\1\172\3\145\1\154\1\172\1\145\1\157\2\101\1\uffff\3\163\1\141\1\uffff\1\172\1\156\2\170\2\172\1\131\1\171\1\uffff\1\163\2\145\2\uffff\2\101\2\172\2\163\2\170\2\uffff\2\172\2\145\2\uffff\2\163\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\31\uffff\1\76\1\77\1\uffff\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\uffff\1\121\1\122\3\uffff\1\126\1\127\1\1\1\121\2\uffff\1\2\55\uffff\1\76\1\77\1\uffff\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\122\1\123\1\124\1\125\1\126\107\uffff\1\7\30\uffff\1\27\5\uffff\1\34\14\uffff\1\101\10\uffff\1\106\3\uffff\1\6\11\uffff\1\11\1\uffff\1\14\20\uffff\1\22\2\uffff\1\75\1\23\1\35\1\24\4\uffff\1\47\7\uffff\1\45\3\uffff\1\111\3\uffff\1\4\1\5\1\13\6\uffff\1\25\1\10\13\uffff\1\20\5\uffff\1\71\1\41\22\uffff\1\30\6\uffff\1\12\1\26\5\uffff\1\17\1\16\1\62\1\uffff\1\100\1\uffff\1\21\1\36\3\uffff\1\50\5\uffff\1\107\6\uffff\1\105\2\uffff\1\3\6\uffff\1\40\3\uffff\1\15\1\uffff\1\44\4\uffff\1\31\4\uffff\1\43\4\uffff\1\37\1\110\10\uffff\1\63\1\uffff\1\72\1\61\11\uffff\1\57\14\uffff\1\73\1\uffff\1\33\4\uffff\1\66\11\uffff\1\32\1\uffff\1\74\2\uffff\1\64\4\uffff\1\60\23\uffff\1\46\1\56\4\uffff\1\70\12\uffff\1\51\4\uffff\1\65\10\uffff\1\42\3\uffff\1\52\1\54\10\uffff\1\104\1\67\4\uffff\1\53\1\55\4\uffff\1\102\1\103";
    static final String DFA12_specialS =
        "\1\2\45\uffff\1\0\1\1\u01ff\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\52\1\46\4\52\1\47\4\52\1\40\1\31\1\32\1\50\12\45\1\52\1\35\1\52\1\34\3\52\2\44\1\22\1\24\1\1\7\44\1\3\2\44\1\30\1\44\1\4\10\44\1\36\1\52\1\37\1\43\1\44\1\52\1\25\1\6\1\12\1\23\1\2\1\33\1\10\1\44\1\26\2\44\1\21\1\13\1\20\1\15\1\16\1\44\1\7\1\14\1\17\1\27\1\44\1\5\1\44\1\11\1\44\1\41\1\52\1\42\uff82\52",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\3\54\1\56\7\54\1\55\16\54",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\65\12\uffff\1\63\2\uffff\1\64",
            "\1\66\3\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\75\3\uffff\1\73\11\uffff\1\74\11\uffff\1\72",
            "\1\76",
            "\1\102\3\uffff\1\77\5\uffff\1\100\11\uffff\1\101",
            "\1\103\3\uffff\1\104",
            "\1\106\15\uffff\1\107\5\uffff\1\105",
            "\1\110\3\uffff\1\112\5\uffff\1\111\11\uffff\1\113",
            "\1\114\7\uffff\1\115",
            "\1\117\3\uffff\1\116",
            "\1\120",
            "\1\121\3\uffff\1\124\3\uffff\1\123\5\uffff\1\122",
            "\1\125",
            "\1\126\1\130\11\uffff\1\131\5\uffff\1\127",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "\1\137",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\0\150",
            "\0\150",
            "\1\151\4\uffff\1\152",
            "",
            "",
            "",
            "",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\162\23\uffff\1\161",
            "\1\164\1\uffff\1\163",
            "\1\166\16\uffff\1\165",
            "\1\167\2\uffff\1\170\4\uffff\1\171",
            "\1\172",
            "\1\174\3\uffff\1\173",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\12\uffff\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b\4\uffff\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u0090\4\uffff\1\u008f",
            "\1\u0091",
            "\1\u0092",
            "\1\u0094\10\uffff\1\u0093",
            "\1\u0095",
            "\1\u0096\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "\1\u00a7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bd\5\uffff\1\u00bc",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e5\7\uffff\1\u00e4",
            "\1\u00e6",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\u00e7\31\54",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00f7",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u010a",
            "\1\u010b",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "\1\u011b",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0121",
            "\1\u0122",
            "",
            "\1\u0123",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "\1\u0142",
            "\1\u0144\37\uffff\1\u0143",
            "\1\u0145",
            "\1\u0146",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0155\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u015e\36\uffff\1\u015d",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0165",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u0167",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u016a",
            "\1\u016b",
            "",
            "",
            "\1\u016c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u017b",
            "\1\u017c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "\1\u0189",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "",
            "\1\u018e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "",
            "\1\u0193",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "",
            "\1\u01a1",
            "\1\u01a2",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u01a4",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01a7",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "\1\u01b9",
            "",
            "",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01be",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "",
            "\1\u01c3",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u01cf",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01d1",
            "\1\u01d2",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc\1\u01dd",
            "",
            "\1\u01de",
            "",
            "\1\u01df",
            "\1\u01e0",
            "",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "",
            "",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb\1\u01fc",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0211\1\u0212",
            "\1\u0213",
            "",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "",
            "",
            "\1\u0217",
            "\1\u0218",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0221",
            "\1\u0222",
            "",
            "",
            "\1\u0223",
            "\1\u0224",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | RULE_EQUALS | RULE_SEMICOLON | RULE_LIST_START | RULE_LIST_END | RULE_COMA | RULE_OBJECT_START | RULE_OBJECT_END | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_38 = input.LA(1);

                        s = -1;
                        if ( ((LA12_38>='\u0000' && LA12_38<='\uFFFF')) ) {s = 104;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_39 = input.LA(1);

                        s = -1;
                        if ( ((LA12_39>='\u0000' && LA12_39<='\uFFFF')) ) {s = 104;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='E') ) {s = 1;}

                        else if ( (LA12_0=='e') ) {s = 2;}

                        else if ( (LA12_0=='M') ) {s = 3;}

                        else if ( (LA12_0=='R') ) {s = 4;}

                        else if ( (LA12_0=='w') ) {s = 5;}

                        else if ( (LA12_0=='b') ) {s = 6;}

                        else if ( (LA12_0=='r') ) {s = 7;}

                        else if ( (LA12_0=='g') ) {s = 8;}

                        else if ( (LA12_0=='y') ) {s = 9;}

                        else if ( (LA12_0=='c') ) {s = 10;}

                        else if ( (LA12_0=='m') ) {s = 11;}

                        else if ( (LA12_0=='s') ) {s = 12;}

                        else if ( (LA12_0=='o') ) {s = 13;}

                        else if ( (LA12_0=='p') ) {s = 14;}

                        else if ( (LA12_0=='t') ) {s = 15;}

                        else if ( (LA12_0=='n') ) {s = 16;}

                        else if ( (LA12_0=='l') ) {s = 17;}

                        else if ( (LA12_0=='C') ) {s = 18;}

                        else if ( (LA12_0=='d') ) {s = 19;}

                        else if ( (LA12_0=='D') ) {s = 20;}

                        else if ( (LA12_0=='a') ) {s = 21;}

                        else if ( (LA12_0=='i') ) {s = 22;}

                        else if ( (LA12_0=='u') ) {s = 23;}

                        else if ( (LA12_0=='P') ) {s = 24;}

                        else if ( (LA12_0=='-') ) {s = 25;}

                        else if ( (LA12_0=='.') ) {s = 26;}

                        else if ( (LA12_0=='f') ) {s = 27;}

                        else if ( (LA12_0=='=') ) {s = 28;}

                        else if ( (LA12_0==';') ) {s = 29;}

                        else if ( (LA12_0=='[') ) {s = 30;}

                        else if ( (LA12_0==']') ) {s = 31;}

                        else if ( (LA12_0==',') ) {s = 32;}

                        else if ( (LA12_0=='{') ) {s = 33;}

                        else if ( (LA12_0=='}') ) {s = 34;}

                        else if ( (LA12_0=='^') ) {s = 35;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='F' && LA12_0<='L')||(LA12_0>='N' && LA12_0<='O')||LA12_0=='Q'||(LA12_0>='S' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='k')||LA12_0=='q'||LA12_0=='v'||LA12_0=='x'||LA12_0=='z') ) {s = 36;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 37;}

                        else if ( (LA12_0=='\"') ) {s = 38;}

                        else if ( (LA12_0=='\'') ) {s = 39;}

                        else if ( (LA12_0=='/') ) {s = 40;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 41;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0==':'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}