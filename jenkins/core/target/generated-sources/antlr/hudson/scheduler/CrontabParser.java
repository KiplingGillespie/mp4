// $ANTLR 2.7.6 (2005-12-22): "crontab.g" -> "CrontabParser.java"$

  package hudson.scheduler;

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

public class CrontabParser extends BaseParser       implements CrontabParserTokenTypes
 {

protected CrontabParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public CrontabParser(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected CrontabParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public CrontabParser(TokenStream lexer) {
  this(lexer,1);
}

public CrontabParser(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final void startRule(
		CronTab table
	) throws RecognitionException, TokenStreamException, ANTLRException {
		
		
		long m,h,d,mnth,dow;
		
		
		switch ( LA(1)) {
		case 16:
		case LITERAL_H:
		case TOKEN:
		{
			m=expr(0);
			match(WS);
			h=expr(1);
			match(WS);
			d=expr(2);
			match(WS);
			mnth=expr(3);
			match(WS);
			dow=expr(4);
			match(Token.EOF_TYPE);
			if ( inputState.guessing==0 ) {
				
				table.bits[0]=m;
				table.bits[1]=h;
				table.bits[2]=d;
				table.bits[3]=mnth;
				table.dayOfWeek=(int)dow;
				
			}
			break;
		}
		case AT:
		{
			{
			match(AT);
			{
			switch ( LA(1)) {
			case LITERAL_yearly:
			{
				match(LITERAL_yearly);
				if ( inputState.guessing==0 ) {
					
					table.set("H H H H *",getHashForTokens());
					
				}
				break;
			}
			case LITERAL_annually:
			{
				match(LITERAL_annually);
				if ( inputState.guessing==0 ) {
					
					table.set("H H H H *",getHashForTokens());
					
				}
				break;
			}
			case LITERAL_monthly:
			{
				match(LITERAL_monthly);
				if ( inputState.guessing==0 ) {
					
					table.set("H H H * *",getHashForTokens());
					
				}
				break;
			}
			case LITERAL_weekly:
			{
				match(LITERAL_weekly);
				if ( inputState.guessing==0 ) {
					
					table.set("H H * * H",getHashForTokens());
					
				}
				break;
			}
			case LITERAL_daily:
			{
				match(LITERAL_daily);
				if ( inputState.guessing==0 ) {
					
					table.set("H H * * *",getHashForTokens());
					
				}
				break;
			}
			case LITERAL_midnight:
			{
				match(LITERAL_midnight);
				if ( inputState.guessing==0 ) {
					
					table.set("H H(0-2) * * *",getHashForTokens());
					
				}
				break;
			}
			case LITERAL_hourly:
			{
				match(LITERAL_hourly);
				if ( inputState.guessing==0 ) {
					
					table.set("H * * * *",getHashForTokens());
					
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			}
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
	}
	
	public final long  expr(
		int field
	) throws RecognitionException, TokenStreamException, ANTLRException {
		long bits=0;
		
		
		long lhs,rhs=0;
		
		
		lhs=term(field);
		{
		switch ( LA(1)) {
		case 13:
		{
			match(13);
			rhs=expr(field);
			break;
		}
		case EOF:
		case WS:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		if ( inputState.guessing==0 ) {
			
			bits = lhs|rhs;
			
		}
		return bits;
	}
	
	public final long  term(
		int field
	) throws RecognitionException, TokenStreamException, ANTLRException {
		long bits=0;
		
		
		int d=NO_STEP,s,e,t;
		
		
		boolean synPredMatched8 = false;
		if (((LA(1)==TOKEN))) {
			int _m8 = mark();
			synPredMatched8 = true;
			inputState.guessing++;
			try {
				{
				token();
				match(14);
				}
			}
			catch (RecognitionException pe) {
				synPredMatched8 = false;
			}
			rewind(_m8);
inputState.guessing--;
		}
		if ( synPredMatched8 ) {
			s=token();
			match(14);
			e=token();
			{
			switch ( LA(1)) {
			case 15:
			{
				match(15);
				d=token();
				break;
			}
			case EOF:
			case WS:
			case 13:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if ( inputState.guessing==0 ) {
				
				bits = doRange(s,e,d,field);
				
			}
		}
		else if ((LA(1)==TOKEN)) {
			t=token();
			if ( inputState.guessing==0 ) {
				
				rangeCheck(t,field);
				bits = 1L<<t;
				
			}
		}
		else if ((LA(1)==16)) {
			match(16);
			{
			switch ( LA(1)) {
			case 15:
			{
				match(15);
				d=token();
				break;
			}
			case EOF:
			case WS:
			case 13:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if ( inputState.guessing==0 ) {
				
				bits = doRange(d,field);
				
			}
		}
		else {
			boolean synPredMatched12 = false;
			if (((LA(1)==LITERAL_H))) {
				int _m12 = mark();
				synPredMatched12 = true;
				inputState.guessing++;
				try {
					{
					match(LITERAL_H);
					match(18);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched12 = false;
				}
				rewind(_m12);
inputState.guessing--;
			}
			if ( synPredMatched12 ) {
				match(LITERAL_H);
				match(18);
				s=token();
				match(14);
				e=token();
				match(19);
				{
				switch ( LA(1)) {
				case 15:
				{
					match(15);
					d=token();
					break;
				}
				case EOF:
				case WS:
				case 13:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				if ( inputState.guessing==0 ) {
					
					bits = doHash(s,e,d,field);
					
				}
			}
			else if ((LA(1)==LITERAL_H)) {
				match(LITERAL_H);
				{
				switch ( LA(1)) {
				case 15:
				{
					match(15);
					d=token();
					break;
				}
				case EOF:
				case WS:
				case 13:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				if ( inputState.guessing==0 ) {
					
					bits = doHash(d,field);
					
				}
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			return bits;
		}
		
	public final int  token() throws RecognitionException, TokenStreamException {
		int value=0;
		
		Token  t = null;
		
		t = LT(1);
		match(TOKEN);
		if ( inputState.guessing==0 ) {
			
			value = Integer.parseInt(t.getText());
			
		}
		return value;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"space",
		"AT",
		"\"yearly\"",
		"\"annually\"",
		"\"monthly\"",
		"\"weekly\"",
		"\"daily\"",
		"\"midnight\"",
		"\"hourly\"",
		"\",\"",
		"\"-\"",
		"\"/\"",
		"\"*\"",
		"\"H\"",
		"\"(\"",
		"\")\"",
		"a number",
		"MINUS",
		"STAR",
		"DIV",
		"OR",
		"H",
		"LPAREN",
		"RPAREN",
		"YEARLY",
		"ANNUALLY",
		"MONTHLY",
		"WEEKLY",
		"DAILY",
		"MIDNIGHT",
		"HOURLY"
	};
	
	
	}
