// $ANTLR 2.7.6 (2005-12-22): "labelExpr.g" -> "LabelExpressionParser.java"$

  package hudson.model.labels;
  import hudson.model.Label;

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

public class LabelExpressionParser extends antlr.LLkParser       implements LabelExpressionParserTokenTypes
 {

protected LabelExpressionParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public LabelExpressionParser(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected LabelExpressionParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public LabelExpressionParser(TokenStream lexer) {
  this(lexer,1);
}

public LabelExpressionParser(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final Label  expr() throws RecognitionException, TokenStreamException {
		Label l;
		
		
		l=term1();
		match(Token.EOF_TYPE);
		return l;
	}
	
	public final Label  term1() throws RecognitionException, TokenStreamException {
		Label l;
		
		Label r;
		
		l=term2();
		{
		_loop4:
		do {
			if ((LA(1)==IFF)) {
				match(IFF);
				r=term2();
				l=l.iff(r);
			}
			else {
				break _loop4;
			}
			
		} while (true);
		}
		return l;
	}
	
	public final Label  term2() throws RecognitionException, TokenStreamException {
		Label l;
		
		Label r;
		
		l=term3();
		{
		switch ( LA(1)) {
		case IMPLIES:
		{
			match(IMPLIES);
			r=term3();
			l=l.implies(r);
			break;
		}
		case EOF:
		case IFF:
		case RPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		return l;
	}
	
	public final Label  term3() throws RecognitionException, TokenStreamException {
		Label l;
		
		Label r;
		
		l=term4();
		{
		_loop9:
		do {
			if ((LA(1)==OR)) {
				match(OR);
				r=term4();
				l=l.or(r);
			}
			else {
				break _loop9;
			}
			
		} while (true);
		}
		return l;
	}
	
	public final Label  term4() throws RecognitionException, TokenStreamException {
		Label l;
		
		Label r;
		
		l=term5();
		{
		_loop12:
		do {
			if ((LA(1)==AND)) {
				match(AND);
				r=term5();
				l=l.and(r);
			}
			else {
				break _loop12;
			}
			
		} while (true);
		}
		return l;
	}
	
	public final Label  term5() throws RecognitionException, TokenStreamException {
		Label l;
		
		Label x;
		
		switch ( LA(1)) {
		case LPAREN:
		case ATOM:
		case STRINGLITERAL:
		{
			l=term6();
			break;
		}
		case NOT:
		{
			match(NOT);
			x=term6();
			l=x.not();
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return l;
	}
	
	public final Label  term6() throws RecognitionException, TokenStreamException {
		Label l;
		
		Token  a = null;
		Token  s = null;
		
		switch ( LA(1)) {
		case LPAREN:
		{
			match(LPAREN);
			l=term1();
			match(RPAREN);
			l=l.paren();
			break;
		}
		case ATOM:
		{
			a = LT(1);
			match(ATOM);
			l=LabelAtom.get(a.getText());
			break;
		}
		case STRINGLITERAL:
		{
			s = LT(1);
			match(STRINGLITERAL);
			l=LabelAtom.get(hudson.util.QuotedStringTokenizer.unquote(s.getText()));
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return l;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"IFF",
		"IMPLIES",
		"OR",
		"AND",
		"NOT",
		"LPAREN",
		"RPAREN",
		"ATOM",
		"STRINGLITERAL",
		"IDENTIFIER_PART",
		"WS"
	};
	
	
	}
