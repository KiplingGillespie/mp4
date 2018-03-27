// $ANTLR 2.7.6 (2005-12-22): "crontab.g" -> "CrontabParser.java"$

  package hudson.scheduler;

public interface CrontabParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int WS = 4;
	int AT = 5;
	int LITERAL_yearly = 6;
	int LITERAL_annually = 7;
	int LITERAL_monthly = 8;
	int LITERAL_weekly = 9;
	int LITERAL_daily = 10;
	int LITERAL_midnight = 11;
	int LITERAL_hourly = 12;
	// "," = 13
	// "-" = 14
	// "/" = 15
	// "*" = 16
	int LITERAL_H = 17;
	// "(" = 18
	// ")" = 19
	int TOKEN = 20;
	int MINUS = 21;
	int STAR = 22;
	int DIV = 23;
	int OR = 24;
	int H = 25;
	int LPAREN = 26;
	int RPAREN = 27;
	int YEARLY = 28;
	int ANNUALLY = 29;
	int MONTHLY = 30;
	int WEEKLY = 31;
	int DAILY = 32;
	int MIDNIGHT = 33;
	int HOURLY = 34;
}
