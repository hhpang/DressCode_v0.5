<<<<<<< HEAD
// $ANTLR 3.5 /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-05-13 15:35:13
=======
// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-04-27 23:50:35
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

  package com.pixelmaid.dresscode.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PogoLexer extends Lexer {
	public static final int EOF=-1;
<<<<<<< HEAD
	public static final int T__135=135;
	public static final int T__136=136;
	public static final int T__137=137;
	public static final int T__138=138;
	public static final int ASSIGNMENT=4;
	public static final int ATan=5;
	public static final int Add=6;
	public static final int And=7;
	public static final int Assert=8;
	public static final int Assign=9;
	public static final int BLOCK=10;
	public static final int Bool=11;
	public static final int CBrace=12;
	public static final int CBracket=13;
	public static final int COLOR_CONSTANT=14;
	public static final int CParen=15;
	public static final int Comma=16;
	public static final int Comment=17;
	public static final int Copy=18;
	public static final int Cosine=19;
	public static final int Curve=20;
	public static final int DOT=21;
	public static final int DOTLOOKUP=22;
	public static final int DOTPROPERTY=23;
	public static final int Def=24;
	public static final int Digit=25;
	public static final int Divide=26;
	public static final int Do=27;
	public static final int Dot=28;
	public static final int DotEnd=29;
	public static final int DotFill=30;
	public static final int DotHeight=31;
	public static final int DotOrigin=32;
	public static final int DotRotation=33;
	public static final int DotStart=34;
	public static final int DotStroke=35;
	public static final int DotWeight=36;
	public static final int DotWidth=37;
	public static final int DotX=38;
	public static final int DotY=39;
	public static final int EXP=40;
	public static final int EXP_LIST=41;
	public static final int Ellipse=42;
	public static final int Else=43;
	public static final int End=44;
	public static final int Equals=45;
	public static final int Excl=46;
	public static final int Expand=47;
	public static final int FUNCTION=48;
	public static final int FUNC_CALL=49;
	public static final int Fill=50;
	public static final int For=51;
	public static final int GT=52;
	public static final int GTEquals=53;
	public static final int GetDistance=54;
	public static final int GetEnd=55;
	public static final int GetFill=56;
	public static final int GetHeight=57;
	public static final int GetOrigin=58;
	public static final int GetRotation=59;
	public static final int GetStart=60;
	public static final int GetStroke=61;
	public static final int GetWidth=62;
	public static final int GetX=63;
	public static final int GetY=64;
	public static final int Group=65;
	public static final int HEIGHT_CONSTANT=66;
	public static final int Hide=67;
	public static final int ID_LIST=68;
	public static final int IF=69;
	public static final int INDEXES=70;
	public static final int Identifier=71;
	public static final int If=72;
	public static final int In=73;
	public static final int Int=74;
	public static final int LAdd=75;
	public static final int LIST=76;
	public static final int LOOKUP=77;
	public static final int LRemove=78;
	public static final int LShape=79;
	public static final int LT=80;
	public static final int LTEquals=81;
	public static final int Line=82;
	public static final int Map=83;
	public static final int Merge=84;
	public static final int MirrorX=85;
	public static final int MirrorY=86;
	public static final int Modulus=87;
	public static final int Move=88;
	public static final int MoveBy=89;
	public static final int Multiply=90;
	public static final int NEGATE=91;
	public static final int NEquals=92;
	public static final int NoFill=93;
	public static final int NoStroke=94;
	public static final int Null=95;
	public static final int Number=96;
	public static final int OBrace=97;
	public static final int OBracket=98;
	public static final int OParen=99;
	public static final int Or=100;
	public static final int PI_CONSTANT=101;
	public static final int Point=102;
	public static final int Polygon=103;
	public static final int Pow=104;
	public static final int Print=105;
	public static final int Println=106;
	public static final int QMark=107;
	public static final int Quad=108;
	public static final int RETURN=109;
	public static final int Random=110;
	public static final int Rect=111;
	public static final int Repeat=112;
	public static final int Return=113;
	public static final int Rotate=114;
	public static final int Round=115;
	public static final int SPECIAL=116;
	public static final int STATEMENTS=117;
	public static final int Scale=118;
	public static final int Shirt=119;
	public static final int ShirtBack=120;
	public static final int Sine=121;
	public static final int Size=122;
	public static final int Space=123;
	public static final int String=124;
	public static final int Stroke=125;
	public static final int Subtract=126;
	public static final int TERNARY=127;
	public static final int Tan=128;
	public static final int To=129;
	public static final int Triangle=130;
	public static final int UNARY_MIN=131;
	public static final int WIDTH_CONSTANT=132;
	public static final int Weight=133;
	public static final int While=134;
=======
	public static final int T__140=140;
	public static final int T__141=141;
	public static final int T__142=142;
	public static final int T__143=143;
	public static final int ADD_CALL=4;
	public static final int AND_CALL=5;
	public static final int ASSIGNMENT=6;
	public static final int ATan=7;
	public static final int Add=8;
	public static final int And=9;
	public static final int Assert=10;
	public static final int Assign=11;
	public static final int BLOCK=12;
	public static final int Bool=13;
	public static final int CBrace=14;
	public static final int CBracket=15;
	public static final int COLOR_CONSTANT=16;
	public static final int CParen=17;
	public static final int Clip=18;
	public static final int Comma=19;
	public static final int Comment=20;
	public static final int Copy=21;
	public static final int Cosine=22;
	public static final int Curve=23;
	public static final int DOT=24;
	public static final int DOTLOOKUP=25;
	public static final int DOTPROPERTY=26;
	public static final int Def=27;
	public static final int Difference=28;
	public static final int Digit=29;
	public static final int Divide=30;
	public static final int Do=31;
	public static final int Dot=32;
	public static final int DotEnd=33;
	public static final int DotFill=34;
	public static final int DotHeight=35;
	public static final int DotOrigin=36;
	public static final int DotRotation=37;
	public static final int DotStart=38;
	public static final int DotStroke=39;
	public static final int DotWeight=40;
	public static final int DotWidth=41;
	public static final int DotX=42;
	public static final int DotY=43;
	public static final int EXP=44;
	public static final int EXP_LIST=45;
	public static final int Ellipse=46;
	public static final int Else=47;
	public static final int End=48;
	public static final int Equals=49;
	public static final int Excl=50;
	public static final int Expand=51;
	public static final int FUNCTION=52;
	public static final int FUNC_CALL=53;
	public static final int Fill=54;
	public static final int For=55;
	public static final int GT=56;
	public static final int GTEquals=57;
	public static final int GetDistance=58;
	public static final int GetEnd=59;
	public static final int GetFill=60;
	public static final int GetHeight=61;
	public static final int GetOrigin=62;
	public static final int GetRotation=63;
	public static final int GetStart=64;
	public static final int GetStroke=65;
	public static final int GetWidth=66;
	public static final int GetX=67;
	public static final int GetY=68;
	public static final int Group=69;
	public static final int HEIGHT_CONSTANT=70;
	public static final int Hide=71;
	public static final int ID_LIST=72;
	public static final int IF=73;
	public static final int INDEXES=74;
	public static final int Identifier=75;
	public static final int If=76;
	public static final int In=77;
	public static final int Int=78;
	public static final int LAdd=79;
	public static final int LIST=80;
	public static final int LOOKUP=81;
	public static final int LRemove=82;
	public static final int LShape=83;
	public static final int LT=84;
	public static final int LTEquals=85;
	public static final int Line=86;
	public static final int Map=87;
	public static final int Merge=88;
	public static final int MirrorX=89;
	public static final int MirrorY=90;
	public static final int Modulus=91;
	public static final int Move=92;
	public static final int MoveBy=93;
	public static final int Multiply=94;
	public static final int NEGATE=95;
	public static final int NEquals=96;
	public static final int NoFill=97;
	public static final int NoStroke=98;
	public static final int Null=99;
	public static final int Number=100;
	public static final int OBrace=101;
	public static final int OBracket=102;
	public static final int OParen=103;
	public static final int Or=104;
	public static final int PI_CONSTANT=105;
	public static final int Point=106;
	public static final int Polygon=107;
	public static final int Pow=108;
	public static final int Print=109;
	public static final int Println=110;
	public static final int QMark=111;
	public static final int Quad=112;
	public static final int RETURN=113;
	public static final int Random=114;
	public static final int Rect=115;
	public static final int Repeat=116;
	public static final int Return=117;
	public static final int Rotate=118;
	public static final int Round=119;
	public static final int SPECIAL=120;
	public static final int STATEMENTS=121;
	public static final int SUB_CALL=122;
	public static final int Scale=123;
	public static final int Sine=124;
	public static final int Size=125;
	public static final int Space=126;
	public static final int String=127;
	public static final int Stroke=128;
	public static final int Subtract=129;
	public static final int TERNARY=130;
	public static final int Tan=131;
	public static final int To=132;
	public static final int Triangle=133;
	public static final int UNARY_MIN=134;
	public static final int Union=135;
	public static final int WIDTH_CONSTANT=136;
	public static final int Weight=137;
	public static final int While=138;
	public static final int Xor=139;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

	int implicitLineJoiningLevel = 0;
	int startPos=-1;


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public PogoLexer() {} 
	public PogoLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public PogoLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g"; }

<<<<<<< HEAD
	// $ANTLR start "T__135"
	public final void mT__135() throws RecognitionException {
		try {
			int _type = T__135;
=======
	// $ANTLR start "T__140"
	public final void mT__140() throws RecognitionException {
		try {
			int _type = T__140;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:10:8: ( '&&' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:10:10: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
<<<<<<< HEAD
	// $ANTLR end "T__135"

	// $ANTLR start "T__136"
	public final void mT__136() throws RecognitionException {
		try {
			int _type = T__136;
=======
	// $ANTLR end "T__140"

	// $ANTLR start "T__141"
	public final void mT__141() throws RecognitionException {
		try {
			int _type = T__141;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:11:8: ( ';' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:11:10: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
<<<<<<< HEAD
	// $ANTLR end "T__136"

	// $ANTLR start "T__137"
	public final void mT__137() throws RecognitionException {
		try {
			int _type = T__137;
=======
	// $ANTLR end "T__141"

	// $ANTLR start "T__142"
	public final void mT__142() throws RecognitionException {
		try {
			int _type = T__142;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:12:8: ( '|' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:12:10: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
<<<<<<< HEAD
	// $ANTLR end "T__137"

	// $ANTLR start "T__138"
	public final void mT__138() throws RecognitionException {
		try {
			int _type = T__138;
=======
	// $ANTLR end "T__142"

	// $ANTLR start "T__143"
	public final void mT__143() throws RecognitionException {
		try {
			int _type = T__143;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:13:8: ( '||' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:13:10: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
<<<<<<< HEAD
	// $ANTLR end "T__138"
=======
	// $ANTLR end "T__143"
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

	// $ANTLR start "Ellipse"
	public final void mEllipse() throws RecognitionException {
		try {
			int _type = Ellipse;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:328:9: ( 'ellipse' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:328:11: 'ellipse'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:334:9: ( 'ellipse' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:334:11: 'ellipse'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("ellipse"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Ellipse"

	// $ANTLR start "Rect"
	public final void mRect() throws RecognitionException {
		try {
			int _type = Rect;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:329:6: ( 'rect' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:329:8: 'rect'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:335:6: ( 'rect' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:335:8: 'rect'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("rect"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Rect"

	// $ANTLR start "Line"
	public final void mLine() throws RecognitionException {
		try {
			int _type = Line;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:330:6: ( 'line' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:330:8: 'line'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:336:6: ( 'line' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:336:8: 'line'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("line"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Line"

	// $ANTLR start "Curve"
	public final void mCurve() throws RecognitionException {
		try {
			int _type = Curve;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:331:7: ( 'curve' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:331:9: 'curve'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:337:7: ( 'curve' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:337:9: 'curve'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("curve"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Curve"

	// $ANTLR start "Quad"
	public final void mQuad() throws RecognitionException {
		try {
			int _type = Quad;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:332:6: ( 'quad' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:332:8: 'quad'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:6: ( 'quad' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:8: 'quad'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("quad"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Quad"

	// $ANTLR start "Point"
	public final void mPoint() throws RecognitionException {
		try {
			int _type = Point;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:333:7: ( 'point' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:333:9: 'point'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:339:7: ( 'point' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:339:9: 'point'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("point"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Point"

	// $ANTLR start "Triangle"
	public final void mTriangle() throws RecognitionException {
		try {
			int _type = Triangle;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:334:9: ( 'triangle' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:334:11: 'triangle'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:340:9: ( 'triangle' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:340:11: 'triangle'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("triangle"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Triangle"

	// $ANTLR start "Polygon"
	public final void mPolygon() throws RecognitionException {
		try {
			int _type = Polygon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:335:9: ( 'poly' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:335:11: 'poly'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:341:9: ( 'poly' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:341:11: 'poly'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("poly"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Polygon"

	// $ANTLR start "LShape"
	public final void mLShape() throws RecognitionException {
		try {
			int _type = LShape;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:336:8: ( 'import' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:336:10: 'import'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:342:8: ( 'import' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:342:10: 'import'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("import"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LShape"

	// $ANTLR start "Shirt"
	public final void mShirt() throws RecognitionException {
		try {
			int _type = Shirt;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:337:7: ( 'shirt' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:337:9: 'shirt'
			{
			match("shirt"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Shirt"

	// $ANTLR start "ShirtBack"
	public final void mShirtBack() throws RecognitionException {
		try {
			int _type = ShirtBack;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:10: ( 'shirtback' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:338:12: 'shirtback'
			{
			match("shirtback"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ShirtBack"

	// $ANTLR start "Cosine"
	public final void mCosine() throws RecognitionException {
		try {
			int _type = Cosine;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:341:8: ( 'cos' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:341:9: 'cos'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:345:8: ( 'cos' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:345:9: 'cos'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("cos"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Cosine"

	// $ANTLR start "Sine"
	public final void mSine() throws RecognitionException {
		try {
			int _type = Sine;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:342:6: ( 'sin' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:342:8: 'sin'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:346:6: ( 'sin' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:346:8: 'sin'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("sin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Sine"

	// $ANTLR start "Tan"
	public final void mTan() throws RecognitionException {
		try {
			int _type = Tan;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:343:6: ( 'tan' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:343:8: 'tan'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:6: ( 'tan' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:8: 'tan'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("tan"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Tan"

	// $ANTLR start "ATan"
	public final void mATan() throws RecognitionException {
		try {
			int _type = ATan;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:344:6: ( 'atan' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:344:8: 'atan'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:348:6: ( 'atan' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:348:8: 'atan'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("atan"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ATan"

	// $ANTLR start "Random"
	public final void mRandom() throws RecognitionException {
		try {
			int _type = Random;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:345:9: ( 'random' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:345:11: 'random'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:349:9: ( 'random' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:349:11: 'random'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("random"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Random"

	// $ANTLR start "Round"
	public final void mRound() throws RecognitionException {
		try {
			int _type = Round;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:346:7: ( 'round' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:346:9: 'round'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:350:7: ( 'round' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:350:9: 'round'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("round"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Round"

	// $ANTLR start "Map"
	public final void mMap() throws RecognitionException {
		try {
			int _type = Map;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:6: ( 'map' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:8: 'map'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:351:6: ( 'map' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:351:8: 'map'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("map"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Map"

	// $ANTLR start "Move"
	public final void mMove() throws RecognitionException {
		try {
			int _type = Move;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:350:6: ( 'move' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:350:8: 'move'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:354:6: ( 'move' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:354:8: 'move'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("move"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Move"

	// $ANTLR start "MoveBy"
	public final void mMoveBy() throws RecognitionException {
		try {
			int _type = MoveBy;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:351:8: ( 'moveBy' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:351:10: 'moveBy'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:355:8: ( 'moveBy' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:355:10: 'moveBy'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("moveBy"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MoveBy"

	// $ANTLR start "Copy"
	public final void mCopy() throws RecognitionException {
		try {
			int _type = Copy;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:352:6: ( 'copy' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:352:8: 'copy'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:356:6: ( 'copy' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:356:8: 'copy'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("copy"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Copy"

	// $ANTLR start "Rotate"
	public final void mRotate() throws RecognitionException {
		try {
			int _type = Rotate;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:353:8: ( 'rotate' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:353:10: 'rotate'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:357:8: ( 'rotate' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:357:10: 'rotate'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("rotate"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Rotate"

	// $ANTLR start "Scale"
	public final void mScale() throws RecognitionException {
		try {
			int _type = Scale;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:354:7: ( 'scale' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:354:9: 'scale'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:358:7: ( 'scale' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:358:9: 'scale'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("scale"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Scale"

	// $ANTLR start "Fill"
	public final void mFill() throws RecognitionException {
		try {
			int _type = Fill;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:355:6: ( 'fill' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:355:8: 'fill'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:359:6: ( 'fill' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:359:8: 'fill'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("fill"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Fill"

	// $ANTLR start "Stroke"
	public final void mStroke() throws RecognitionException {
		try {
			int _type = Stroke;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:356:8: ( 'stroke' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:356:10: 'stroke'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:360:8: ( 'stroke' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:360:10: 'stroke'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("stroke"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Stroke"

	// $ANTLR start "NoFill"
	public final void mNoFill() throws RecognitionException {
		try {
			int _type = NoFill;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:357:8: ( 'noFill' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:357:10: 'noFill'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:361:8: ( 'noFill' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:361:10: 'noFill'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("noFill"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NoFill"

	// $ANTLR start "NoStroke"
	public final void mNoStroke() throws RecognitionException {
		try {
			int _type = NoStroke;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:358:10: ( 'noStroke' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:358:12: 'noStroke'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:362:10: ( 'noStroke' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:362:12: 'noStroke'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("noStroke"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NoStroke"

	// $ANTLR start "Weight"
	public final void mWeight() throws RecognitionException {
		try {
			int _type = Weight;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:359:8: ( 'weight' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:359:10: 'weight'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:363:8: ( 'weight' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:363:10: 'weight'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("weight"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Weight"

	// $ANTLR start "Hide"
	public final void mHide() throws RecognitionException {
		try {
			int _type = Hide;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:360:6: ( 'hide' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:360:8: 'hide'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:364:6: ( 'hide' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:364:8: 'hide'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("hide"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Hide"

	// $ANTLR start "Group"
	public final void mGroup() throws RecognitionException {
		try {
			int _type = Group;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:361:7: ( 'group' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:361:9: 'group'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:365:7: ( 'group' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:365:9: 'group'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("group"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Group"

	// $ANTLR start "Expand"
	public final void mExpand() throws RecognitionException {
		try {
			int _type = Expand;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:362:9: ( 'expand' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:362:11: 'expand'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:366:9: ( 'expand' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:366:11: 'expand'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("expand"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Expand"

	// $ANTLR start "Merge"
	public final void mMerge() throws RecognitionException {
		try {
			int _type = Merge;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:363:7: ( 'merge' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:363:9: 'merge'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:367:7: ( 'merge' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:367:9: 'merge'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("merge"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Merge"

	// $ANTLR start "MirrorX"
	public final void mMirrorX() throws RecognitionException {
		try {
			int _type = MirrorX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:364:9: ( 'mirrorX' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:364:11: 'mirrorX'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:368:9: ( 'mirrorX' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:368:11: 'mirrorX'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("mirrorX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MirrorX"

	// $ANTLR start "MirrorY"
	public final void mMirrorY() throws RecognitionException {
		try {
			int _type = MirrorY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:365:8: ( 'mirrorY' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:365:10: 'mirrorY'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:369:8: ( 'mirrorY' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:369:10: 'mirrorY'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("mirrorY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MirrorY"

	// $ANTLR start "Union"
	public final void mUnion() throws RecognitionException {
		try {
			int _type = Union;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:370:6: ( 'union' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:370:8: 'union'
			{
			match("union"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Union"

	// $ANTLR start "Difference"
	public final void mDifference() throws RecognitionException {
		try {
			int _type = Difference;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:371:11: ( 'diff' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:371:13: 'diff'
			{
			match("diff"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Difference"

	// $ANTLR start "Clip"
	public final void mClip() throws RecognitionException {
		try {
			int _type = Clip;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:372:6: ( 'clip' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:372:8: 'clip'
			{
			match("clip"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Clip"

	// $ANTLR start "Xor"
	public final void mXor() throws RecognitionException {
		try {
			int _type = Xor;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:373:5: ( 'xor' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:373:6: 'xor'
			{
			match("xor"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Xor"

	// $ANTLR start "GetWidth"
	public final void mGetWidth() throws RecognitionException {
		try {
			int _type = GetWidth;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:368:9: ( 'getWidth' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:368:11: 'getWidth'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:376:9: ( 'getWidth' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:376:11: 'getWidth'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("getWidth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetWidth"

	// $ANTLR start "GetHeight"
	public final void mGetHeight() throws RecognitionException {
		try {
			int _type = GetHeight;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:369:10: ( 'getHeight' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:369:12: 'getHeight'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:377:10: ( 'getHeight' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:377:12: 'getHeight'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("getHeight"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetHeight"

	// $ANTLR start "GetX"
	public final void mGetX() throws RecognitionException {
		try {
			int _type = GetX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:370:5: ( 'getX' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:370:7: 'getX'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:378:5: ( 'getX' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:378:7: 'getX'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("getX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetX"

	// $ANTLR start "GetY"
	public final void mGetY() throws RecognitionException {
		try {
			int _type = GetY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:371:5: ( 'getY' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:371:7: 'getY'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:379:5: ( 'getY' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:379:7: 'getY'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("getY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetY"

	// $ANTLR start "GetOrigin"
	public final void mGetOrigin() throws RecognitionException {
		try {
			int _type = GetOrigin;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:372:10: ( 'getOrigin' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:372:12: 'getOrigin'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:380:10: ( 'getOrigin' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:380:12: 'getOrigin'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("getOrigin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetOrigin"

	// $ANTLR start "GetRotation"
	public final void mGetRotation() throws RecognitionException {
		try {
			int _type = GetRotation;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:373:12: ( 'getRotation' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:373:14: 'getRotation'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:381:12: ( 'getRotation' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:381:14: 'getRotation'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("getRotation"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetRotation"

	// $ANTLR start "GetFill"
	public final void mGetFill() throws RecognitionException {
		try {
			int _type = GetFill;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:374:8: ( 'getFill' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:374:10: 'getFill'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:382:8: ( 'getFill' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:382:10: 'getFill'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("getFill"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetFill"

	// $ANTLR start "GetStroke"
	public final void mGetStroke() throws RecognitionException {
		try {
			int _type = GetStroke;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:375:10: ( 'getStroke' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:375:12: 'getStroke'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:383:10: ( 'getStroke' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:383:12: 'getStroke'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("getStroke"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetStroke"

	// $ANTLR start "GetStart"
	public final void mGetStart() throws RecognitionException {
		try {
			int _type = GetStart;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:376:9: ( 'getStart' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:376:11: 'getStart'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:384:9: ( 'getStart' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:384:11: 'getStart'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("getStart"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetStart"

	// $ANTLR start "GetEnd"
	public final void mGetEnd() throws RecognitionException {
		try {
			int _type = GetEnd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:377:7: ( 'getEnd' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:377:9: 'getEnd'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:385:7: ( 'getEnd' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:385:9: 'getEnd'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("getEnd"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetEnd"

	// $ANTLR start "GetDistance"
	public final void mGetDistance() throws RecognitionException {
		try {
			int _type = GetDistance;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:378:12: ( 'dist' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:378:14: 'dist'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:386:12: ( 'dist' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:386:14: 'dist'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("dist"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GetDistance"

	// $ANTLR start "DotX"
	public final void mDotX() throws RecognitionException {
		try {
			int _type = DotX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:385:6: ( '.x' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:385:8: '.x'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:393:6: ( '.x' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:393:8: '.x'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(".x"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotX"

	// $ANTLR start "DotY"
	public final void mDotY() throws RecognitionException {
		try {
			int _type = DotY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:386:7: ( '.y' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:386:9: '.y'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:394:7: ( '.y' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:394:9: '.y'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(".y"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotY"

	// $ANTLR start "DotStart"
	public final void mDotStart() throws RecognitionException {
		try {
			int _type = DotStart;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:387:10: ( '.start' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:387:12: '.start'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:395:10: ( '.start' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:395:12: '.start'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(".start"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotStart"

	// $ANTLR start "DotEnd"
	public final void mDotEnd() throws RecognitionException {
		try {
			int _type = DotEnd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:388:8: ( '.end' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:388:10: '.end'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:396:8: ( '.end' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:396:10: '.end'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(".end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotEnd"

	// $ANTLR start "DotOrigin"
	public final void mDotOrigin() throws RecognitionException {
		try {
			int _type = DotOrigin;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:389:11: ( '.origin' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:389:13: '.origin'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:397:11: ( '.origin' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:397:13: '.origin'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(".origin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotOrigin"

	// $ANTLR start "DotRotation"
	public final void mDotRotation() throws RecognitionException {
		try {
			int _type = DotRotation;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:390:13: ( '.rotation' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:390:15: '.rotation'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:13: ( '.rotation' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:15: '.rotation'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(".rotation"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotRotation"

	// $ANTLR start "DotWidth"
	public final void mDotWidth() throws RecognitionException {
		try {
			int _type = DotWidth;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:391:10: ( '.width' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:391:12: '.width'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:399:10: ( '.width' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:399:12: '.width'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(".width"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotWidth"

	// $ANTLR start "DotHeight"
	public final void mDotHeight() throws RecognitionException {
		try {
			int _type = DotHeight;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:392:11: ( '.height' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:392:13: '.height'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:400:11: ( '.height' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:400:13: '.height'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(".height"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotHeight"

	// $ANTLR start "DotStroke"
	public final void mDotStroke() throws RecognitionException {
		try {
			int _type = DotStroke;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:393:11: ( '.stroke' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:393:13: '.stroke'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:401:11: ( '.stroke' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:401:13: '.stroke'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(".stroke"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotStroke"

	// $ANTLR start "DotFill"
	public final void mDotFill() throws RecognitionException {
		try {
			int _type = DotFill;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:394:9: ( '.fill' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:394:11: '.fill'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:402:9: ( '.fill' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:402:11: '.fill'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(".fill"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotFill"

	// $ANTLR start "DotWeight"
	public final void mDotWeight() throws RecognitionException {
		try {
			int _type = DotWeight;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:395:11: ( '.weight' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:395:13: '.weight'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:403:11: ( '.weight' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:403:13: '.weight'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(".weight"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DotWeight"

	// $ANTLR start "COLOR_CONSTANT"
	public final void mCOLOR_CONSTANT() throws RecognitionException {
		try {
			int _type = COLOR_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:15: ( 'RED' | 'BLUE' | 'GREEN' | 'PURPLE' | 'YELLOW' | 'ORANGE' | 'PINK' | 'BLACK' | 'WHITE' | 'GREY' )
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:15: ( 'RED' | 'BLUE' | 'GREEN' | 'PURPLE' | 'YELLOW' | 'ORANGE' | 'PINK' | 'BLACK' | 'WHITE' | 'GREY' )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int alt1=10;
			switch ( input.LA(1) ) {
			case 'R':
				{
				alt1=1;
				}
				break;
			case 'B':
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='L') ) {
					int LA1_8 = input.LA(3);
					if ( (LA1_8=='U') ) {
						alt1=2;
					}
					else if ( (LA1_8=='A') ) {
						alt1=8;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'G':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='R') ) {
					int LA1_9 = input.LA(3);
					if ( (LA1_9=='E') ) {
						int LA1_14 = input.LA(4);
						if ( (LA1_14=='E') ) {
							alt1=3;
						}
						else if ( (LA1_14=='Y') ) {
							alt1=10;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'P':
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4=='U') ) {
					alt1=4;
				}
				else if ( (LA1_4=='I') ) {
					alt1=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'Y':
				{
				alt1=5;
				}
				break;
			case 'O':
				{
				alt1=6;
				}
				break;
			case 'W':
				{
				alt1=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:17: 'RED'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:17: 'RED'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					match("RED"); 

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:23: 'BLUE'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:23: 'BLUE'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					match("BLUE"); 

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:30: 'GREEN'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:30: 'GREEN'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					match("GREEN"); 

					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:38: 'PURPLE'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:38: 'PURPLE'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					match("PURPLE"); 

					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:47: 'YELLOW'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:47: 'YELLOW'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					match("YELLOW"); 

					}
					break;
				case 6 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:56: 'ORANGE'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:56: 'ORANGE'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					match("ORANGE"); 

					}
					break;
				case 7 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:65: 'PINK'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:65: 'PINK'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					match("PINK"); 

					}
					break;
				case 8 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:72: 'BLACK'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:72: 'BLACK'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					match("BLACK"); 

					}
					break;
				case 9 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:80: 'WHITE'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:80: 'WHITE'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					match("WHITE"); 

					}
					break;
				case 10 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:88: 'GREY'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:88: 'GREY'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					match("GREY"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLOR_CONSTANT"

	// $ANTLR start "WIDTH_CONSTANT"
	public final void mWIDTH_CONSTANT() throws RecognitionException {
		try {
			int _type = WIDTH_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:400:15: ( 'WIDTH' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:400:17: 'WIDTH'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:408:15: ( 'WIDTH' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:408:17: 'WIDTH'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("WIDTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WIDTH_CONSTANT"

	// $ANTLR start "HEIGHT_CONSTANT"
	public final void mHEIGHT_CONSTANT() throws RecognitionException {
		try {
			int _type = HEIGHT_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:401:16: ( 'HEIGHT' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:401:18: 'HEIGHT'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:409:16: ( 'HEIGHT' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:409:18: 'HEIGHT'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("HEIGHT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEIGHT_CONSTANT"

	// $ANTLR start "PI_CONSTANT"
	public final void mPI_CONSTANT() throws RecognitionException {
		try {
			int _type = PI_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:403:12: ( 'PI' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:403:14: 'PI'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:12: ( 'PI' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:14: 'PI'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("PI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PI_CONSTANT"

	// $ANTLR start "LAdd"
	public final void mLAdd() throws RecognitionException {
		try {
			int _type = LAdd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:6: ( 'add' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:8: 'add'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:414:6: ( 'add' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:414:8: 'add'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("add"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LAdd"

	// $ANTLR start "LRemove"
	public final void mLRemove() throws RecognitionException {
		try {
			int _type = LRemove;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:407:9: ( 'remove' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:407:11: 'remove'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:415:9: ( 'remove' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:415:11: 'remove'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("remove"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LRemove"

	// $ANTLR start "Println"
	public final void mPrintln() throws RecognitionException {
		try {
			int _type = Println;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:409:10: ( 'println' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:409:12: 'println'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:417:10: ( 'println' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:417:12: 'println'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("println"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Println"

	// $ANTLR start "Print"
	public final void mPrint() throws RecognitionException {
		try {
			int _type = Print;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:410:10: ( 'print' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:410:12: 'print'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:418:10: ( 'print' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:418:12: 'print'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Print"

	// $ANTLR start "Assert"
	public final void mAssert() throws RecognitionException {
		try {
			int _type = Assert;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:10: ( 'assert' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:12: 'assert'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:419:10: ( 'assert' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:419:12: 'assert'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("assert"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Assert"

	// $ANTLR start "Size"
	public final void mSize() throws RecognitionException {
		try {
			int _type = Size;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:412:10: ( 'size' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:412:12: 'size'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:420:10: ( 'size' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:420:12: 'size'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("size"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Size"

	// $ANTLR start "Def"
	public final void mDef() throws RecognitionException {
		try {
			int _type = Def;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:413:10: ( 'def' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:413:12: 'def'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:421:10: ( 'def' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:421:12: 'def'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("def"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Def"

	// $ANTLR start "If"
	public final void mIf() throws RecognitionException {
		try {
			int _type = If;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:414:10: ( 'if' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:414:12: 'if'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:422:10: ( 'if' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:422:12: 'if'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "If"

	// $ANTLR start "Else"
	public final void mElse() throws RecognitionException {
		try {
			int _type = Else;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:415:10: ( 'else' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:415:12: 'else'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:423:10: ( 'else' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:423:12: 'else'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Else"

	// $ANTLR start "Return"
	public final void mReturn() throws RecognitionException {
		try {
			int _type = Return;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:416:10: ( 'return' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:416:12: 'return'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:424:10: ( 'return' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:424:12: 'return'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Return"

	// $ANTLR start "For"
	public final void mFor() throws RecognitionException {
		try {
			int _type = For;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:417:10: ( 'for' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:417:12: 'for'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:425:10: ( 'for' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:425:12: 'for'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "For"

	// $ANTLR start "Repeat"
	public final void mRepeat() throws RecognitionException {
		try {
			int _type = Repeat;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:418:9: ( 'repeat' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:418:11: 'repeat'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:426:9: ( 'repeat' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:426:11: 'repeat'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("repeat"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Repeat"

	// $ANTLR start "While"
	public final void mWhile() throws RecognitionException {
		try {
			int _type = While;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:419:10: ( 'while' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:419:12: 'while'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:427:10: ( 'while' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:427:12: 'while'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "While"

	// $ANTLR start "To"
	public final void mTo() throws RecognitionException {
		try {
			int _type = To;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:420:10: ( 'to' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:420:12: 'to'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:428:10: ( 'to' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:428:12: 'to'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "To"

	// $ANTLR start "Do"
	public final void mDo() throws RecognitionException {
		try {
			int _type = Do;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:421:10: ( ':' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:421:12: ':'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:429:10: ( ':' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:429:12: ':'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Do"

	// $ANTLR start "End"
	public final void mEnd() throws RecognitionException {
		try {
			int _type = End;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:422:6: ( 'end' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:422:7: 'end'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:430:6: ( 'end' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:430:7: 'end'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "End"

	// $ANTLR start "In"
	public final void mIn() throws RecognitionException {
		try {
			int _type = In;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:423:10: ( 'in' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:423:12: 'in'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:431:10: ( 'in' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:431:12: 'in'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "In"

	// $ANTLR start "Null"
	public final void mNull() throws RecognitionException {
		try {
			int _type = Null;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:424:10: ( 'null' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:424:12: 'null'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:432:10: ( 'null' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:432:12: 'null'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Null"

	// $ANTLR start "Or"
	public final void mOr() throws RecognitionException {
		try {
			int _type = Or;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:426:10: ( 'or' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:426:12: 'or'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:434:10: ( 'or' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:434:12: 'or'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Or"

	// $ANTLR start "And"
	public final void mAnd() throws RecognitionException {
		try {
			int _type = And;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:427:10: ( 'and' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:427:12: 'and'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:435:10: ( 'and' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:435:12: 'and'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "And"

	// $ANTLR start "Equals"
	public final void mEquals() throws RecognitionException {
		try {
			int _type = Equals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:428:10: ( '==' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:428:12: '=='
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:436:10: ( '==' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:436:12: '=='
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Equals"

	// $ANTLR start "NEquals"
	public final void mNEquals() throws RecognitionException {
		try {
			int _type = NEquals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:429:10: ( '!=' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:429:12: '!='
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:437:10: ( '!=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:437:12: '!='
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEquals"

	// $ANTLR start "GTEquals"
	public final void mGTEquals() throws RecognitionException {
		try {
			int _type = GTEquals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:430:10: ( '>=' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:430:12: '>='
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:438:10: ( '>=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:438:12: '>='
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTEquals"

	// $ANTLR start "LTEquals"
	public final void mLTEquals() throws RecognitionException {
		try {
			int _type = LTEquals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:431:10: ( '<=' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:431:12: '<='
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:439:10: ( '<=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:439:12: '<='
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTEquals"

	// $ANTLR start "Pow"
	public final void mPow() throws RecognitionException {
		try {
			int _type = Pow;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:432:10: ( '^' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:432:12: '^'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:440:10: ( '^' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:440:12: '^'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Pow"

	// $ANTLR start "Excl"
	public final void mExcl() throws RecognitionException {
		try {
			int _type = Excl;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:433:10: ( '!' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:433:12: '!'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:441:10: ( '!' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:441:12: '!'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Excl"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:434:10: ( '>' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:434:12: '>'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:442:10: ( '>' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:442:12: '>'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:435:10: ( '<' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:435:12: '<'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:443:10: ( '<' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:443:12: '<'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "Add"
	public final void mAdd() throws RecognitionException {
		try {
			int _type = Add;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:436:10: ( '+' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:436:12: '+'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:444:10: ( '+' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:444:12: '+'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Add"

	// $ANTLR start "Subtract"
	public final void mSubtract() throws RecognitionException {
		try {
			int _type = Subtract;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:437:10: ( '-' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:437:12: '-'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:445:10: ( '-' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:445:12: '-'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Subtract"

	// $ANTLR start "Multiply"
	public final void mMultiply() throws RecognitionException {
		try {
			int _type = Multiply;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:438:10: ( '*' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:438:12: '*'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:446:10: ( '*' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:446:12: '*'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Multiply"

	// $ANTLR start "Divide"
	public final void mDivide() throws RecognitionException {
		try {
			int _type = Divide;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:439:10: ( '/' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:439:12: '/'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:447:10: ( '/' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:447:12: '/'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Divide"

	// $ANTLR start "Modulus"
	public final void mModulus() throws RecognitionException {
		try {
			int _type = Modulus;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:440:10: ( '%' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:440:12: '%'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:448:10: ( '%' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:448:12: '%'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Modulus"

	// $ANTLR start "OBrace"
	public final void mOBrace() throws RecognitionException {
		try {
			int _type = OBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:441:10: ( '{' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:441:12: '{'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:449:10: ( '{' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:449:12: '{'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OBrace"

	// $ANTLR start "CBrace"
	public final void mCBrace() throws RecognitionException {
		try {
			int _type = CBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:442:10: ( '}' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:442:12: '}'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:450:10: ( '}' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:450:12: '}'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CBrace"

	// $ANTLR start "OBracket"
	public final void mOBracket() throws RecognitionException {
		try {
			int _type = OBracket;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:443:10: ( '[' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:443:12: '['
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:451:10: ( '[' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:451:12: '['
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OBracket"

	// $ANTLR start "CBracket"
	public final void mCBracket() throws RecognitionException {
		try {
			int _type = CBracket;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:444:10: ( ']' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:444:12: ']'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:452:10: ( ']' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:452:12: ']'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CBracket"

	// $ANTLR start "OParen"
	public final void mOParen() throws RecognitionException {
		try {
			int _type = OParen;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:445:10: ( '(' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:445:12: '('
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:453:10: ( '(' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:453:12: '('
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OParen"

	// $ANTLR start "CParen"
	public final void mCParen() throws RecognitionException {
		try {
			int _type = CParen;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:446:10: ( ')' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:446:12: ')'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:454:10: ( ')' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:454:12: ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CParen"

	// $ANTLR start "Assign"
	public final void mAssign() throws RecognitionException {
		try {
			int _type = Assign;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:448:10: ( '=' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:448:12: '='
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:456:10: ( '=' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:456:12: '='
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Assign"

	// $ANTLR start "Comma"
	public final void mComma() throws RecognitionException {
		try {
			int _type = Comma;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:449:10: ( ',' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:449:12: ','
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:457:10: ( ',' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:457:12: ','
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comma"

	// $ANTLR start "QMark"
	public final void mQMark() throws RecognitionException {
		try {
			int _type = QMark;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:450:10: ( '?' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:450:12: '?'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:458:10: ( '?' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:458:12: '?'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QMark"

	// $ANTLR start "Dot"
	public final void mDot() throws RecognitionException {
		try {
			int _type = Dot;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:452:5: ( '.' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:452:7: '.'
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:460:5: ( '.' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:460:7: '.'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Dot"

	// $ANTLR start "Bool"
	public final void mBool() throws RecognitionException {
		try {
			int _type = Bool;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:455:3: ( 'true' | 'false' )
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:463:3: ( 'true' | 'false' )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='t') ) {
				alt2=1;
			}
			else if ( (LA2_0=='f') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:455:6: 'true'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:463:6: 'true'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					match("true"); 

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:456:6: 'false'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:464:6: 'false'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Bool"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:460:3: ( Int ( Dot ( Digit )* )? )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:460:6: Int ( Dot ( Digit )* )?
			{
			mInt(); 

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:460:10: ( Dot ( Digit )* )?
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:468:3: ( Int ( Dot ( Digit )* )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:468:6: Int ( Dot ( Digit )* )?
			{
			mInt(); 

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:468:10: ( Dot ( Digit )* )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:460:11: Dot ( Digit )*
					{
					mDot(); 

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:460:15: ( Digit )*
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:468:11: Dot ( Digit )*
					{
					mDot(); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:468:15: ( Digit )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Number"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:464:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:464:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:472:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:472:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:464:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:472:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "String"
	public final void mString() throws RecognitionException {
		try {
			int _type = String;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:471:3: ( '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\'' )
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:479:3: ( '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\'' )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\"') ) {
				alt8=1;
			}
			else if ( (LA8_0=='\'') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:471:6: '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"'
					{
					match('\"'); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:471:11: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )*
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:479:6: '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"'
					{
					match('\"'); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:479:11: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					loop6:
					while (true) {
						int alt6=3;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}
						else if ( (LA6_0=='\\') ) {
							alt6=2;
						}

						switch (alt6) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:471:12: ~ ( '\"' | '\\\\' )
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:479:12: ~ ( '\"' | '\\\\' )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:471:29: '\\\\' ( '\\\\' | '\"' )
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:479:29: '\\\\' ( '\\\\' | '\"' )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							match('\\'); 
							if ( input.LA(1)=='\"'||input.LA(1)=='\\' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					match('\"'); 
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:472:6: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\''
					{
					match('\''); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:472:11: (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )*
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:480:6: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\''
					{
					match('\''); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:480:11: (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					loop7:
					while (true) {
						int alt7=3;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '&')||(LA7_0 >= '(' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}
						else if ( (LA7_0=='\\') ) {
							alt7=2;
						}

						switch (alt7) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:472:12: ~ ( '\\'' | '\\\\' )
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:480:12: ~ ( '\\'' | '\\\\' )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:472:29: '\\\\' ( '\\\\' | '\\'' )
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:480:29: '\\\\' ( '\\\\' | '\\'' )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							match('\\'); 
							if ( input.LA(1)=='\''||input.LA(1)=='\\' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop7;
						}
					}

					match('\''); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;

			  setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "String"

	// $ANTLR start "Comment"
	public final void mComment() throws RecognitionException {
		try {
			int _type = Comment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:476:3: ( '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( . )* '*/' )
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:484:3: ( '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( . )* '*/' )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='/') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='/') ) {
					alt11=1;
				}
				else if ( (LA11_1=='*') ) {
					alt11=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:476:6: '//' (~ ( '\\n' | '\\r' ) )*
					{
					match("//"); 

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:476:11: (~ ( '\\n' | '\\r' ) )*
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:484:6: '//' (~ ( '\\n' | '\\r' ) )*
					{
					match("//"); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:484:11: (~ ( '\\n' | '\\r' ) )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop9;
						}
					}

					skip();
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:477:6: '/*' ( . )* '*/'
					{
					match("/*"); 

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:477:11: ( . )*
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:485:6: '/*' ( . )* '*/'
					{
					match("/*"); 

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:485:11: ( . )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0=='*') ) {
							int LA10_1 = input.LA(2);
							if ( (LA10_1=='/') ) {
								alt10=2;
							}
							else if ( ((LA10_1 >= '\u0000' && LA10_1 <= '.')||(LA10_1 >= '0' && LA10_1 <= '\uFFFF')) ) {
								alt10=1;
							}

						}
						else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ')')||(LA10_0 >= '+' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:477:11: .
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:485:11: .
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							matchAny(); 
							}
							break;

						default :
							break loop10;
						}
					}

					match("*/"); 

					skip();
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comment"

	// $ANTLR start "Space"
	public final void mSpace() throws RecognitionException {
		try {
			int _type = Space;
			int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:481:3: ( ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+ )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:481:5: ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+
			{
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:481:5: ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:489:3: ( ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+ )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:489:5: ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:489:5: ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||(LA12_0 >= '\f' && LA12_0 <= '\r')||LA12_0==' ') ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Space"

	// $ANTLR start "Int"
	public final void mInt() throws RecognitionException {
		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:528:3: ( '1' .. '9' ( Digit )* | '0' )
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:536:3: ( '1' .. '9' ( Digit )* | '0' )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= '1' && LA14_0 <= '9')) ) {
				alt14=1;
			}
			else if ( (LA14_0=='0') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:528:6: '1' .. '9' ( Digit )*
					{
					matchRange('1','9'); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:528:15: ( Digit )*
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:536:6: '1' .. '9' ( Digit )*
					{
					matchRange('1','9'); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:536:15: ( Digit )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop13;
						}
					}

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:529:6: '0'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:537:6: '0'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					match('0'); 
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Int"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:533:3: ( '0' .. '9' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:541:3: ( '0' .. '9' )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	@Override
	public void mTokens() throws RecognitionException {
<<<<<<< HEAD
		// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:8: ( T__135 | T__136 | T__137 | T__138 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | LShape | Shirt | ShirtBack | Cosine | Sine | Tan | ATan | Random | Round | Map | Move | MoveBy | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Group | Expand | Merge | MirrorX | MirrorY | GetWidth | GetHeight | GetX | GetY | GetOrigin | GetRotation | GetFill | GetStroke | GetStart | GetEnd | GetDistance | DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotStroke | DotFill | DotWeight | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | For | Repeat | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | Space )
		int alt15=113;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:10: T__135
				{
				mT__135(); 
=======
		// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:8: ( T__140 | T__141 | T__142 | T__143 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | LShape | Cosine | Sine | Tan | ATan | Random | Round | Map | Move | MoveBy | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Group | Expand | Merge | MirrorX | MirrorY | Union | Difference | Clip | Xor | GetWidth | GetHeight | GetX | GetY | GetOrigin | GetRotation | GetFill | GetStroke | GetStart | GetEnd | GetDistance | DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotStroke | DotFill | DotWeight | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | For | Repeat | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | Space )
		int alt15=115;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:10: T__140
				{
				mT__140(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 2 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:17: T__136
				{
				mT__136(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:17: T__141
				{
				mT__141(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 3 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:24: T__137
				{
				mT__137(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:24: T__142
				{
				mT__142(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 4 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:31: T__138
				{
				mT__138(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:31: T__143
				{
				mT__143(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 5 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:38: Ellipse
				{
				mEllipse(); 

				}
				break;
			case 6 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:46: Rect
				{
				mRect(); 

				}
				break;
			case 7 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:51: Line
				{
				mLine(); 

				}
				break;
			case 8 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:56: Curve
				{
				mCurve(); 

				}
				break;
			case 9 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:62: Quad
				{
				mQuad(); 

				}
				break;
			case 10 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:67: Point
				{
				mPoint(); 

				}
				break;
			case 11 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:73: Triangle
				{
				mTriangle(); 

				}
				break;
			case 12 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:82: Polygon
				{
				mPolygon(); 

				}
				break;
			case 13 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:90: LShape
				{
				mLShape(); 

				}
				break;
			case 14 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:97: Shirt
				{
				mShirt(); 

				}
				break;
			case 15 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:103: ShirtBack
				{
				mShirtBack(); 

				}
				break;
			case 16 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:113: Cosine
				{
				mCosine(); 

				}
				break;
			case 17 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:120: Sine
				{
				mSine(); 

				}
				break;
			case 18 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:125: Tan
				{
				mTan(); 

				}
				break;
			case 19 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:129: ATan
				{
				mATan(); 

				}
				break;
			case 20 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:134: Random
				{
				mRandom(); 

				}
				break;
			case 21 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:141: Round
				{
				mRound(); 

				}
				break;
			case 22 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:147: Map
				{
				mMap(); 

				}
				break;
			case 23 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:151: Move
				{
				mMove(); 

				}
				break;
			case 24 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:156: MoveBy
				{
				mMoveBy(); 

				}
				break;
			case 25 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:163: Copy
				{
				mCopy(); 

				}
				break;
			case 26 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:168: Rotate
				{
				mRotate(); 

				}
				break;
			case 27 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:175: Scale
				{
				mScale(); 

				}
				break;
			case 28 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:181: Fill
				{
				mFill(); 

				}
				break;
			case 29 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:186: Stroke
				{
				mStroke(); 

				}
				break;
			case 30 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:193: NoFill
				{
				mNoFill(); 

				}
				break;
			case 31 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:200: NoStroke
				{
				mNoStroke(); 

				}
				break;
			case 32 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:209: Weight
				{
				mWeight(); 

				}
				break;
			case 33 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:216: Hide
				{
				mHide(); 

				}
				break;
			case 34 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:221: Group
				{
				mGroup(); 

				}
				break;
			case 35 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:227: Expand
				{
				mExpand(); 

				}
				break;
			case 36 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:234: Merge
				{
				mMerge(); 

				}
				break;
			case 37 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:240: MirrorX
				{
				mMirrorX(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:240: Union
				{
				mUnion(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 38 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:248: MirrorY
				{
				mMirrorY(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:246: Difference
				{
				mDifference(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 39 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:256: GetWidth
				{
				mGetWidth(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:257: Clip
				{
				mClip(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 40 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:265: GetHeight
				{
				mGetHeight(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:262: Xor
				{
				mXor(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 41 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:275: GetX
				{
				mGetX(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:266: GetWidth
				{
				mGetWidth(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 42 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:280: GetY
				{
				mGetY(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:275: GetHeight
				{
				mGetHeight(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 43 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:285: GetOrigin
				{
				mGetOrigin(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:285: GetX
				{
				mGetX(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 44 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:295: GetRotation
				{
				mGetRotation(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:290: GetY
				{
				mGetY(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 45 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:307: GetFill
				{
				mGetFill(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:295: GetOrigin
				{
				mGetOrigin(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 46 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:315: GetStroke
				{
				mGetStroke(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:305: GetRotation
				{
				mGetRotation(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 47 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:325: GetStart
				{
				mGetStart(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:317: GetFill
				{
				mGetFill(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 48 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:334: GetEnd
				{
				mGetEnd(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:325: GetStroke
				{
				mGetStroke(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 49 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:341: GetDistance
				{
				mGetDistance(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:335: GetStart
				{
				mGetStart(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 50 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:353: DotX
				{
				mDotX(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:344: GetEnd
				{
				mGetEnd(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 51 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:358: DotY
				{
				mDotY(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:351: GetDistance
				{
				mGetDistance(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 52 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:363: DotStart
				{
				mDotStart(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:363: DotX
				{
				mDotX(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 53 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:372: DotEnd
				{
				mDotEnd(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:368: DotY
				{
				mDotY(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 54 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:379: DotOrigin
				{
				mDotOrigin(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:373: DotStart
				{
				mDotStart(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 55 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:389: DotRotation
				{
				mDotRotation(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:382: DotEnd
				{
				mDotEnd(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 56 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:401: DotWidth
				{
				mDotWidth(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:389: DotOrigin
				{
				mDotOrigin(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 57 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:410: DotHeight
				{
				mDotHeight(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:399: DotRotation
				{
				mDotRotation(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 58 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:420: DotStroke
				{
				mDotStroke(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:411: DotWidth
				{
				mDotWidth(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 59 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:430: DotFill
				{
				mDotFill(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:420: DotHeight
				{
				mDotHeight(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 60 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:438: DotWeight
				{
				mDotWeight(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:430: DotStroke
				{
				mDotStroke(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 61 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:448: COLOR_CONSTANT
				{
				mCOLOR_CONSTANT(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:440: DotFill
				{
				mDotFill(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 62 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:463: WIDTH_CONSTANT
				{
				mWIDTH_CONSTANT(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:448: DotWeight
				{
				mDotWeight(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 63 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:478: HEIGHT_CONSTANT
				{
				mHEIGHT_CONSTANT(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:458: COLOR_CONSTANT
				{
				mCOLOR_CONSTANT(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 64 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:494: PI_CONSTANT
				{
				mPI_CONSTANT(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:473: WIDTH_CONSTANT
				{
				mWIDTH_CONSTANT(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 65 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:506: LAdd
				{
				mLAdd(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:488: HEIGHT_CONSTANT
				{
				mHEIGHT_CONSTANT(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 66 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:511: LRemove
				{
				mLRemove(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:504: PI_CONSTANT
				{
				mPI_CONSTANT(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 67 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:519: Println
				{
				mPrintln(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:516: LAdd
				{
				mLAdd(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 68 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:527: Print
				{
				mPrint(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:521: LRemove
				{
				mLRemove(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 69 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:533: Assert
				{
				mAssert(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:529: Println
				{
				mPrintln(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 70 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:540: Size
				{
				mSize(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:537: Print
				{
				mPrint(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 71 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:545: Def
				{
				mDef(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:543: Assert
				{
				mAssert(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 72 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:549: If
				{
				mIf(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:550: Size
				{
				mSize(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 73 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:552: Else
				{
				mElse(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:555: Def
				{
				mDef(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 74 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:557: Return
				{
				mReturn(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:559: If
				{
				mIf(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 75 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:564: For
				{
				mFor(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:562: Else
				{
				mElse(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 76 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:568: Repeat
				{
				mRepeat(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:567: Return
				{
				mReturn(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 77 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:575: While
				{
				mWhile(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:574: For
				{
				mFor(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 78 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:581: To
				{
				mTo(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:578: Repeat
				{
				mRepeat(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 79 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:584: Do
				{
				mDo(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:585: While
				{
				mWhile(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 80 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:587: End
				{
				mEnd(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:591: To
				{
				mTo(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 81 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:591: In
				{
				mIn(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:594: Do
				{
				mDo(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 82 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:594: Null
				{
				mNull(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:597: End
				{
				mEnd(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 83 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:599: Or
				{
				mOr(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:601: In
				{
				mIn(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 84 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:602: And
				{
				mAnd(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:604: Null
				{
				mNull(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 85 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:606: Equals
				{
				mEquals(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:609: Or
				{
				mOr(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 86 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:613: NEquals
				{
				mNEquals(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:612: And
				{
				mAnd(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 87 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:621: GTEquals
				{
				mGTEquals(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:616: Equals
				{
				mEquals(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 88 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:630: LTEquals
				{
				mLTEquals(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:623: NEquals
				{
				mNEquals(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 89 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:639: Pow
				{
				mPow(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:631: GTEquals
				{
				mGTEquals(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 90 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:643: Excl
				{
				mExcl(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:640: LTEquals
				{
				mLTEquals(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 91 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:648: GT
				{
				mGT(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:649: Pow
				{
				mPow(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 92 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:651: LT
				{
				mLT(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:653: Excl
				{
				mExcl(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 93 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:654: Add
				{
				mAdd(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:658: GT
				{
				mGT(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 94 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:658: Subtract
				{
				mSubtract(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:661: LT
				{
				mLT(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 95 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:667: Multiply
				{
				mMultiply(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:664: Add
				{
				mAdd(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 96 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:676: Divide
				{
				mDivide(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:668: Subtract
				{
				mSubtract(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 97 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:683: Modulus
				{
				mModulus(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:677: Multiply
				{
				mMultiply(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 98 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:691: OBrace
				{
				mOBrace(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:686: Divide
				{
				mDivide(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 99 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:698: CBrace
				{
				mCBrace(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:693: Modulus
				{
				mModulus(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 100 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:705: OBracket
				{
				mOBracket(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:701: OBrace
				{
				mOBrace(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 101 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:714: CBracket
				{
				mCBracket(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:708: CBrace
				{
				mCBrace(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 102 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:723: OParen
				{
				mOParen(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:715: OBracket
				{
				mOBracket(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 103 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:730: CParen
				{
				mCParen(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:724: CBracket
				{
				mCBracket(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 104 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:737: Assign
				{
				mAssign(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:733: OParen
				{
				mOParen(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 105 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:744: Comma
				{
				mComma(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:740: CParen
				{
				mCParen(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 106 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:750: QMark
				{
				mQMark(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:747: Assign
				{
				mAssign(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 107 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:756: Dot
				{
				mDot(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:754: Comma
				{
				mComma(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 108 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:760: Bool
				{
				mBool(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:760: QMark
				{
				mQMark(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 109 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:765: Number
				{
				mNumber(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:766: Dot
				{
				mDot(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 110 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:772: Identifier
				{
				mIdentifier(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:770: Bool
				{
				mBool(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 111 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:783: String
				{
				mString(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:775: Number
				{
				mNumber(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 112 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:790: Comment
				{
				mComment(); 
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:782: Identifier
				{
				mIdentifier(); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

				}
				break;
			case 113 :
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:798: Space
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:793: String
				{
				mString(); 

				}
				break;
			case 114 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:800: Comment
				{
				mComment(); 

				}
				break;
			case 115 :
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:808: Space
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				{
				mSpace(); 

				}
				break;

		}
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
<<<<<<< HEAD
		"\3\uffff\1\67\21\63\1\153\10\63\1\uffff\1\63\1\170\1\172\1\174\1\176\4"+
		"\uffff\1\u0080\17\uffff\16\63\1\u0097\1\63\1\u0099\1\u009a\30\63\12\uffff"+
		"\4\63\1\u00be\5\63\1\u00c4\12\uffff\3\63\1\u00c8\11\63\1\u00d2\7\63\1"+
		"\u00da\1\uffff\1\63\2\uffff\1\63\1\u00dd\4\63\1\u00e2\1\63\1\u00e4\1\u00e5"+
		"\4\63\1\u00ea\12\63\1\u00fd\3\uffff\1\u0100\5\63\1\uffff\5\63\1\uffff"+
		"\1\63\1\u010d\1\63\1\uffff\1\u010f\6\63\1\u0116\1\63\1\uffff\1\u0118\1"+
		"\u0119\1\63\1\u011b\2\63\1\u011e\1\uffff\2\63\1\uffff\1\u0121\2\63\1\u0124"+
		"\1\uffff\1\63\2\uffff\1\u0127\2\63\1\u012a\1\uffff\3\63\1\u012e\2\63\1"+
		"\u0131\3\63\1\u0135\1\u0136\5\63\1\u013c\4\uffff\1\u0100\2\63\1\u0100"+
		"\1\63\1\u0100\6\63\1\uffff\1\63\1\uffff\4\63\1\u014b\1\63\1\uffff\1\u014d"+
		"\2\uffff\1\u014e\1\uffff\1\u0150\1\63\1\uffff\1\63\1\u0154\1\uffff\1\u0155"+
		"\1\63\1\uffff\2\63\1\uffff\1\u0159\1\63\1\uffff\1\u011e\2\63\1\uffff\1"+
		"\63\1\u015e\1\uffff\1\u015f\2\63\2\uffff\5\63\1\uffff\2\u0100\3\63\1\u0100"+
		"\1\u016b\2\63\1\u016e\1\u016f\1\u0170\1\u0171\1\u0172\1\uffff\1\u0173"+
		"\2\uffff\1\63\1\uffff\1\63\1\u0176\1\63\2\uffff\1\u0178\1\u0179\1\u017a"+
		"\1\uffff\1\63\1\u017d\1\63\1\u017f\2\uffff\7\63\1\u0187\3\u0100\1\uffff"+
		"\1\u0188\1\u0189\6\uffff\1\u018a\1\63\1\uffff\1\63\3\uffff\1\u018d\1\u018e"+
		"\1\uffff\1\63\1\uffff\4\63\1\u0194\2\63\4\uffff\1\u0197\1\63\2\uffff\1"+
		"\u0199\1\u019a\3\63\1\uffff\1\63\1\u019f\1\uffff\1\u01a0\2\uffff\1\u01a1"+
		"\1\u01a2\1\63\1\u01a4\4\uffff\1\63\1\uffff\1\u01a6\1\uffff";
	static final String DFA15_eofS =
		"\u01a7\uffff";
	static final String DFA15_minS =
		"\1\11\2\uffff\1\174\1\154\1\141\1\151\1\157\1\165\1\157\1\141\1\146\1"+
		"\143\1\144\2\141\1\157\1\145\1\151\3\145\1\105\1\114\1\122\1\111\1\105"+
		"\1\122\1\110\1\105\1\uffff\1\162\4\75\4\uffff\1\52\17\uffff\1\154\1\160"+
		"\1\144\1\143\1\156\1\164\1\156\1\162\1\160\1\141\3\151\1\156\1\60\1\160"+
		"\2\60\1\151\1\156\1\141\1\162\1\141\1\144\1\163\1\144\1\160\1\166\2\162"+
		"\1\154\1\162\1\154\1\106\1\154\2\151\1\144\1\157\1\164\1\163\1\146\2\uffff"+
		"\1\164\3\uffff\1\145\3\uffff\1\104\1\101\1\105\1\122\1\60\1\114\1\101"+
		"\1\111\1\104\1\111\1\60\12\uffff\1\151\1\145\1\141\1\60\1\164\1\157\1"+
		"\165\1\145\1\144\1\156\1\141\1\145\1\166\1\60\1\171\1\144\1\156\1\171"+
		"\1\156\1\141\1\145\1\60\1\uffff\1\157\2\uffff\1\162\1\60\1\145\1\154\1"+
		"\157\1\156\1\60\1\145\2\60\1\145\1\147\1\162\1\154\1\60\1\163\1\151\1"+
		"\164\1\154\1\147\1\154\1\145\1\165\1\105\1\164\1\60\1\141\2\uffff\1\60"+
		"\1\105\1\103\1\105\1\120\1\113\1\uffff\1\114\1\116\2\124\1\107\1\uffff"+
		"\1\160\1\60\1\156\1\uffff\1\60\1\166\1\162\1\141\1\157\1\144\1\164\1\60"+
		"\1\145\1\uffff\2\60\1\164\1\60\1\164\1\156\1\60\1\uffff\1\162\1\164\1"+
		"\uffff\1\60\1\145\1\153\1\60\1\uffff\1\162\2\uffff\1\60\1\145\1\157\1"+
		"\60\1\uffff\1\145\1\154\1\162\1\60\1\150\1\145\1\60\1\160\1\151\1\145"+
		"\2\60\1\162\1\157\1\151\1\164\1\156\1\60\4\uffff\1\60\1\113\1\116\1\60"+
		"\1\114\1\60\1\117\1\107\1\105\2\110\1\163\1\uffff\1\144\1\uffff\1\145"+
		"\1\156\1\164\1\155\1\60\1\145\1\uffff\1\60\2\uffff\1\60\1\uffff\1\60\1"+
		"\147\1\uffff\1\164\1\60\1\uffff\1\60\1\145\1\uffff\1\164\1\171\1\uffff"+
		"\1\60\1\162\1\uffff\1\60\1\154\1\157\1\uffff\1\164\1\60\1\uffff\1\60\1"+
		"\144\1\151\2\uffff\1\151\1\164\1\154\1\141\1\144\1\uffff\2\60\1\105\1"+
		"\127\1\105\2\60\1\124\1\145\5\60\1\uffff\1\60\2\uffff\1\156\1\uffff\1"+
		"\154\1\60\1\141\2\uffff\3\60\1\uffff\1\130\1\60\1\153\1\60\2\uffff\1\164"+
		"\2\147\1\141\1\154\1\157\1\162\4\60\1\uffff\2\60\6\uffff\1\60\1\145\1"+
		"\uffff\1\143\3\uffff\2\60\1\uffff\1\145\1\uffff\2\150\1\151\1\164\1\60"+
		"\1\153\1\164\4\uffff\1\60\1\153\2\uffff\2\60\1\164\1\156\1\151\1\uffff"+
		"\1\145\1\60\1\uffff\1\60\2\uffff\2\60\1\157\1\60\4\uffff\1\156\1\uffff"+
		"\1\60\1\uffff";
	static final String DFA15_maxS =
		"\1\175\2\uffff\1\174\1\170\1\157\1\151\2\165\2\162\1\156\2\164\2\157\1"+
		"\165\1\150\1\151\1\162\1\151\1\171\1\105\1\114\1\122\1\125\1\105\1\122"+
		"\1\111\1\105\1\uffff\1\162\4\75\4\uffff\1\57\17\uffff\1\163\1\160\1\144"+
		"\1\164\1\156\1\165\1\156\1\162\1\163\1\141\1\154\1\151\1\165\1\156\1\172"+
		"\1\160\2\172\1\151\1\172\1\141\1\162\1\141\1\144\1\163\1\144\1\160\1\166"+
		"\2\162\1\154\1\162\1\154\1\123\1\154\2\151\1\144\1\157\1\164\1\163\1\146"+
		"\2\uffff\1\164\3\uffff\1\151\3\uffff\1\104\1\125\1\105\1\122\1\172\1\114"+
		"\1\101\1\111\1\104\1\111\1\172\12\uffff\1\151\1\145\1\141\1\172\1\164"+
		"\1\157\1\165\1\145\1\144\1\156\1\141\1\145\1\166\1\172\1\171\1\144\1\156"+
		"\1\171\1\156\1\141\1\145\1\172\1\uffff\1\157\2\uffff\1\162\1\172\1\145"+
		"\1\154\1\157\1\156\1\172\1\145\2\172\1\145\1\147\1\162\1\154\1\172\1\163"+
		"\1\151\1\164\1\154\1\147\1\154\1\145\1\165\1\131\1\164\1\172\1\162\2\uffff"+
		"\1\172\1\105\1\103\1\131\1\120\1\113\1\uffff\1\114\1\116\2\124\1\107\1"+
		"\uffff\1\160\1\172\1\156\1\uffff\1\172\1\166\1\162\1\141\1\157\1\144\1"+
		"\164\1\172\1\145\1\uffff\2\172\1\164\1\172\1\164\1\156\1\172\1\uffff\1"+
		"\162\1\164\1\uffff\1\172\1\145\1\153\1\172\1\uffff\1\162\2\uffff\1\172"+
		"\1\145\1\157\1\172\1\uffff\1\145\1\154\1\162\1\172\1\150\1\145\1\172\1"+
		"\160\1\151\1\145\2\172\1\162\1\157\1\151\1\164\1\156\1\172\4\uffff\1\172"+
		"\1\113\1\116\1\172\1\114\1\172\1\117\1\107\1\105\2\110\1\163\1\uffff\1"+
		"\144\1\uffff\1\145\1\156\1\164\1\155\1\172\1\145\1\uffff\1\172\2\uffff"+
		"\1\172\1\uffff\1\172\1\147\1\uffff\1\164\1\172\1\uffff\1\172\1\145\1\uffff"+
		"\1\164\1\171\1\uffff\1\172\1\162\1\uffff\1\172\1\154\1\157\1\uffff\1\164"+
		"\1\172\1\uffff\1\172\1\144\1\151\2\uffff\1\151\1\164\1\154\1\162\1\144"+
		"\1\uffff\2\172\1\105\1\127\1\105\2\172\1\124\1\145\5\172\1\uffff\1\172"+
		"\2\uffff\1\156\1\uffff\1\154\1\172\1\141\2\uffff\3\172\1\uffff\1\131\1"+
		"\172\1\153\1\172\2\uffff\1\164\2\147\1\141\1\154\1\157\1\162\4\172\1\uffff"+
		"\2\172\6\uffff\1\172\1\145\1\uffff\1\143\3\uffff\2\172\1\uffff\1\145\1"+
		"\uffff\2\150\1\151\1\164\1\172\1\153\1\164\4\uffff\1\172\1\153\2\uffff"+
		"\2\172\1\164\1\156\1\151\1\uffff\1\145\1\172\1\uffff\1\172\2\uffff\2\172"+
		"\1\157\1\172\4\uffff\1\156\1\uffff\1\172\1\uffff";
	static final String DFA15_acceptS =
		"\1\uffff\1\1\1\2\33\uffff\1\117\5\uffff\1\131\1\135\1\136\1\137\1\uffff"+
		"\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\151\1\152\1\155\1\156\1\157"+
		"\1\161\1\4\1\3\52\uffff\1\62\1\63\1\uffff\1\65\1\66\1\67\1\uffff\1\71"+
		"\1\73\1\153\13\uffff\1\125\1\150\1\126\1\132\1\127\1\133\1\130\1\134\1"+
		"\160\1\140\26\uffff\1\116\1\uffff\1\110\1\121\33\uffff\1\70\1\74\6\uffff"+
		"\1\100\5\uffff\1\123\3\uffff\1\120\11\uffff\1\20\7\uffff\1\22\2\uffff"+
		"\1\21\4\uffff\1\101\1\uffff\1\124\1\26\4\uffff\1\113\22\uffff\1\107\1"+
		"\64\1\72\1\75\14\uffff\1\111\1\uffff\1\6\6\uffff\1\7\1\uffff\1\31\1\11"+
		"\1\uffff\1\14\2\uffff\1\154\2\uffff\1\106\2\uffff\1\23\2\uffff\1\27\2"+
		"\uffff\1\34\3\uffff\1\122\2\uffff\1\41\3\uffff\1\51\1\52\5\uffff\1\61"+
		"\16\uffff\1\25\1\uffff\1\10\1\12\1\uffff\1\104\3\uffff\1\16\1\33\3\uffff"+
		"\1\44\4\uffff\1\115\1\42\13\uffff\1\76\2\uffff\1\43\1\102\1\112\1\114"+
		"\1\24\1\32\2\uffff\1\15\1\uffff\1\35\1\105\1\30\2\uffff\1\36\1\uffff\1"+
		"\40\7\uffff\1\60\1\77\1\5\1\103\2\uffff\1\45\1\46\5\uffff\1\55\2\uffff"+
		"\1\13\1\uffff\1\37\1\47\4\uffff\1\57\1\17\1\50\1\53\1\uffff\1\56\1\uffff"+
		"\1\54";
	static final String DFA15_specialS =
		"\u01a7\uffff}>";
=======
		"\3\uffff\1\71\23\65\1\157\10\65\1\uffff\1\65\1\174\1\176\1\u0080\1\u0082"+
		"\4\uffff\1\u0084\17\uffff\17\65\1\u009c\1\65\1\u009e\1\u009f\31\65\12"+
		"\uffff\4\65\1\u00c5\5\65\1\u00cb\12\uffff\3\65\1\u00cf\11\65\1\u00d9\10"+
		"\65\1\u00e2\1\uffff\1\65\2\uffff\1\u00e4\4\65\1\u00e9\1\65\1\u00eb\1\u00ec"+
		"\4\65\1\u00f1\14\65\1\u0106\1\u0107\3\uffff\1\u010a\5\65\1\uffff\5\65"+
		"\1\uffff\1\65\1\u0117\1\65\1\uffff\1\u0119\6\65\1\u0120\1\65\1\uffff\1"+
		"\u0122\1\u0123\1\u0124\1\65\1\u0126\2\65\1\u0129\1\uffff\1\65\1\uffff"+
		"\1\u012b\2\65\1\u012e\1\uffff\1\65\2\uffff\1\u0131\2\65\1\u0134\1\uffff"+
		"\3\65\1\u0138\2\65\1\u013b\3\65\1\u013f\1\u0140\6\65\1\u0147\1\u0148\5"+
		"\uffff\1\u010a\2\65\1\u010a\1\65\1\u010a\6\65\1\uffff\1\65\1\uffff\4\65"+
		"\1\u0157\1\65\1\uffff\1\u0159\3\uffff\1\u015a\1\uffff\1\u015c\1\65\1\uffff"+
		"\1\65\1\uffff\1\u015f\1\65\1\uffff\2\65\1\uffff\1\u0163\1\65\1\uffff\1"+
		"\u0129\2\65\1\uffff\1\65\1\u0168\1\uffff\1\u0169\2\65\2\uffff\5\65\1\u0172"+
		"\2\uffff\2\u010a\3\65\1\u010a\1\u0176\2\65\1\u0179\1\u017a\1\u017b\1\u017c"+
		"\1\u017d\1\uffff\1\u017e\2\uffff\1\65\1\uffff\1\65\1\u0181\1\uffff\1\u0182"+
		"\1\u0183\1\u0184\1\uffff\1\65\1\u0187\1\65\1\u0189\2\uffff\7\65\1\u0191"+
		"\1\uffff\3\u010a\1\uffff\1\u0192\1\u0193\6\uffff\1\u0194\1\65\4\uffff"+
		"\1\u0196\1\u0197\1\uffff\1\65\1\uffff\4\65\1\u019d\2\65\4\uffff\1\u01a0"+
		"\2\uffff\1\u01a1\1\u01a2\3\65\1\uffff\1\65\1\u01a7\3\uffff\1\u01a8\1\u01a9"+
		"\1\65\1\u01ab\3\uffff\1\65\1\uffff\1\u01ad\1\uffff";
	static final String DFA15_eofS =
		"\u01ae\uffff";
	static final String DFA15_minS =
		"\1\11\2\uffff\1\174\1\154\1\141\1\151\1\154\1\165\1\157\1\141\1\146\1"+
		"\143\1\144\2\141\1\157\1\145\1\151\1\145\1\156\1\145\1\157\1\145\1\105"+
		"\1\114\1\122\1\111\1\105\1\122\1\110\1\105\1\uffff\1\162\4\75\4\uffff"+
		"\1\52\17\uffff\1\154\1\160\1\144\1\143\1\156\1\164\1\156\1\162\1\160\1"+
		"\151\1\141\3\151\1\156\1\60\1\160\2\60\1\156\1\141\1\162\1\141\1\144\1"+
		"\163\1\144\1\160\1\166\2\162\1\154\1\162\1\154\1\106\1\154\2\151\1\144"+
		"\1\157\1\164\1\151\2\146\1\162\2\uffff\1\164\3\uffff\1\145\3\uffff\1\104"+
		"\1\101\1\105\1\122\1\60\1\114\1\101\1\111\1\104\1\111\1\60\12\uffff\1"+
		"\151\1\145\1\141\1\60\1\164\1\157\1\165\1\145\1\144\1\156\1\141\1\145"+
		"\1\166\1\60\1\171\1\160\1\144\1\156\1\171\1\156\1\141\1\145\1\60\1\uffff"+
		"\1\157\2\uffff\1\60\1\145\1\154\1\157\1\156\1\60\1\145\2\60\1\145\1\147"+
		"\1\162\1\154\1\60\1\163\1\151\1\164\1\154\1\147\1\154\1\145\1\165\1\105"+
		"\1\157\1\146\1\164\2\60\1\141\2\uffff\1\60\1\105\1\103\1\105\1\120\1\113"+
		"\1\uffff\1\114\1\116\2\124\1\107\1\uffff\1\160\1\60\1\156\1\uffff\1\60"+
		"\1\166\1\162\1\141\1\157\1\144\1\164\1\60\1\145\1\uffff\3\60\1\164\1\60"+
		"\1\164\1\156\1\60\1\uffff\1\162\1\uffff\1\60\1\145\1\153\1\60\1\uffff"+
		"\1\162\2\uffff\1\60\1\145\1\157\1\60\1\uffff\1\145\1\154\1\162\1\60\1"+
		"\150\1\145\1\60\1\160\1\151\1\145\2\60\1\162\1\157\1\151\1\164\2\156\2"+
		"\60\5\uffff\1\60\1\113\1\116\1\60\1\114\1\60\1\117\1\107\1\105\2\110\1"+
		"\163\1\uffff\1\144\1\uffff\1\145\1\156\1\164\1\155\1\60\1\145\1\uffff"+
		"\1\60\3\uffff\1\60\1\uffff\1\60\1\147\1\uffff\1\164\1\uffff\1\60\1\145"+
		"\1\uffff\1\164\1\171\1\uffff\1\60\1\162\1\uffff\1\60\1\154\1\157\1\uffff"+
		"\1\164\1\60\1\uffff\1\60\1\144\1\151\2\uffff\1\151\1\164\1\154\1\141\1"+
		"\144\1\60\2\uffff\2\60\1\105\1\127\1\105\2\60\1\124\1\145\5\60\1\uffff"+
		"\1\60\2\uffff\1\156\1\uffff\1\154\1\60\1\uffff\3\60\1\uffff\1\130\1\60"+
		"\1\153\1\60\2\uffff\1\164\2\147\1\141\1\154\1\157\1\162\1\60\1\uffff\3"+
		"\60\1\uffff\2\60\6\uffff\1\60\1\145\4\uffff\2\60\1\uffff\1\145\1\uffff"+
		"\2\150\1\151\1\164\1\60\1\153\1\164\4\uffff\1\60\2\uffff\2\60\1\164\1"+
		"\156\1\151\1\uffff\1\145\1\60\3\uffff\2\60\1\157\1\60\3\uffff\1\156\1"+
		"\uffff\1\60\1\uffff";
	static final String DFA15_maxS =
		"\1\175\2\uffff\1\174\1\170\1\157\1\151\2\165\2\162\1\156\2\164\2\157\1"+
		"\165\1\150\1\151\1\162\1\156\1\151\1\157\1\171\1\105\1\114\1\122\1\125"+
		"\1\105\1\122\1\111\1\105\1\uffff\1\162\4\75\4\uffff\1\57\17\uffff\1\163"+
		"\1\160\1\144\1\164\1\156\1\165\1\156\1\162\1\163\1\151\1\141\1\154\1\151"+
		"\1\165\1\156\1\172\1\160\3\172\1\141\1\162\1\141\1\144\1\163\1\144\1\160"+
		"\1\166\2\162\1\154\1\162\1\154\1\123\1\154\2\151\1\144\1\157\1\164\1\151"+
		"\1\163\1\146\1\162\2\uffff\1\164\3\uffff\1\151\3\uffff\1\104\1\125\1\105"+
		"\1\122\1\172\1\114\1\101\1\111\1\104\1\111\1\172\12\uffff\1\151\1\145"+
		"\1\141\1\172\1\164\1\157\1\165\1\145\1\144\1\156\1\141\1\145\1\166\1\172"+
		"\1\171\1\160\1\144\1\156\1\171\1\156\1\141\1\145\1\172\1\uffff\1\157\2"+
		"\uffff\1\172\1\145\1\154\1\157\1\156\1\172\1\145\2\172\1\145\1\147\1\162"+
		"\1\154\1\172\1\163\1\151\1\164\1\154\1\147\1\154\1\145\1\165\1\131\1\157"+
		"\1\146\1\164\2\172\1\162\2\uffff\1\172\1\105\1\103\1\131\1\120\1\113\1"+
		"\uffff\1\114\1\116\2\124\1\107\1\uffff\1\160\1\172\1\156\1\uffff\1\172"+
		"\1\166\1\162\1\141\1\157\1\144\1\164\1\172\1\145\1\uffff\3\172\1\164\1"+
		"\172\1\164\1\156\1\172\1\uffff\1\162\1\uffff\1\172\1\145\1\153\1\172\1"+
		"\uffff\1\162\2\uffff\1\172\1\145\1\157\1\172\1\uffff\1\145\1\154\1\162"+
		"\1\172\1\150\1\145\1\172\1\160\1\151\1\145\2\172\1\162\1\157\1\151\1\164"+
		"\2\156\2\172\5\uffff\1\172\1\113\1\116\1\172\1\114\1\172\1\117\1\107\1"+
		"\105\2\110\1\163\1\uffff\1\144\1\uffff\1\145\1\156\1\164\1\155\1\172\1"+
		"\145\1\uffff\1\172\3\uffff\1\172\1\uffff\1\172\1\147\1\uffff\1\164\1\uffff"+
		"\1\172\1\145\1\uffff\1\164\1\171\1\uffff\1\172\1\162\1\uffff\1\172\1\154"+
		"\1\157\1\uffff\1\164\1\172\1\uffff\1\172\1\144\1\151\2\uffff\1\151\1\164"+
		"\1\154\1\162\1\144\1\172\2\uffff\2\172\1\105\1\127\1\105\2\172\1\124\1"+
		"\145\5\172\1\uffff\1\172\2\uffff\1\156\1\uffff\1\154\1\172\1\uffff\3\172"+
		"\1\uffff\1\131\1\172\1\153\1\172\2\uffff\1\164\2\147\1\141\1\154\1\157"+
		"\1\162\1\172\1\uffff\3\172\1\uffff\2\172\6\uffff\1\172\1\145\4\uffff\2"+
		"\172\1\uffff\1\145\1\uffff\2\150\1\151\1\164\1\172\1\153\1\164\4\uffff"+
		"\1\172\2\uffff\2\172\1\164\1\156\1\151\1\uffff\1\145\1\172\3\uffff\2\172"+
		"\1\157\1\172\3\uffff\1\156\1\uffff\1\172\1\uffff";
	static final String DFA15_acceptS =
		"\1\uffff\1\1\1\2\35\uffff\1\121\5\uffff\1\133\1\137\1\140\1\141\1\uffff"+
		"\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\153\1\154\1\157\1\160\1\161"+
		"\1\163\1\4\1\3\54\uffff\1\64\1\65\1\uffff\1\67\1\70\1\71\1\uffff\1\73"+
		"\1\75\1\155\13\uffff\1\127\1\152\1\130\1\134\1\131\1\135\1\132\1\136\1"+
		"\162\1\142\27\uffff\1\120\1\uffff\1\112\1\123\35\uffff\1\72\1\76\6\uffff"+
		"\1\102\5\uffff\1\125\3\uffff\1\122\11\uffff\1\16\10\uffff\1\20\1\uffff"+
		"\1\17\4\uffff\1\103\1\uffff\1\126\1\24\4\uffff\1\115\24\uffff\1\111\1"+
		"\50\1\66\1\74\1\77\14\uffff\1\113\1\uffff\1\6\6\uffff\1\7\1\uffff\1\27"+
		"\1\47\1\11\1\uffff\1\14\2\uffff\1\156\1\uffff\1\110\2\uffff\1\21\2\uffff"+
		"\1\25\2\uffff\1\32\3\uffff\1\124\2\uffff\1\37\3\uffff\1\53\1\54\6\uffff"+
		"\1\46\1\63\16\uffff\1\23\1\uffff\1\10\1\12\1\uffff\1\106\2\uffff\1\31"+
		"\3\uffff\1\42\4\uffff\1\117\1\40\10\uffff\1\45\3\uffff\1\100\2\uffff\1"+
		"\41\1\104\1\114\1\116\1\22\1\30\2\uffff\1\15\1\33\1\107\1\26\2\uffff\1"+
		"\34\1\uffff\1\36\7\uffff\1\62\1\101\1\5\1\105\1\uffff\1\43\1\44\5\uffff"+
		"\1\57\2\uffff\1\13\1\35\1\51\4\uffff\1\61\1\52\1\55\1\uffff\1\60\1\uffff"+
		"\1\56";
	static final String DFA15_specialS =
		"\u01ae\uffff}>";
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	static final String[] DFA15_transitionS = {
			"\2\67\1\uffff\2\67\22\uffff\1\67\1\43\1\66\2\uffff\1\53\1\1\1\66\1\60"+
			"\1\61\1\51\1\47\1\62\1\50\1\27\1\52\12\64\1\40\1\2\1\45\1\42\1\44\1\63"+
			"\1\uffff\1\65\1\31\4\65\1\32\1\37\6\65\1\35\1\33\1\65\1\30\4\65\1\36"+
			"\1\65\1\34\1\65\1\56\1\uffff\1\57\1\46\1\65\1\uffff\1\15\1\65\1\7\1\25"+
			"\1\4\1\17\1\23\1\22\1\13\2\65\1\6\1\16\1\20\1\41\1\11\1\10\1\5\1\14\1"+
			"\12\1\24\1\65\1\21\1\26\2\65\1\54\1\3\1\55",
			"",
			"",
<<<<<<< HEAD
			"\1\66",
			"\1\70\1\uffff\1\72\11\uffff\1\71",
			"\1\74\3\uffff\1\73\11\uffff\1\75",
			"\1\76",
			"\1\100\5\uffff\1\77",
			"\1\101",
			"\1\102\2\uffff\1\103",
			"\1\105\15\uffff\1\106\2\uffff\1\104",
			"\1\110\6\uffff\1\107\1\111",
			"\1\114\4\uffff\1\112\1\113\12\uffff\1\115",
			"\1\117\11\uffff\1\121\4\uffff\1\120\1\116",
			"\1\122\3\uffff\1\124\3\uffff\1\125\5\uffff\1\123",
			"\1\130\7\uffff\1\126\5\uffff\1\127",
			"\1\131\5\uffff\1\132",
			"\1\133\2\uffff\1\134",
			"\1\135",
			"\1\137\14\uffff\1\136",
			"\1\141\3\uffff\1\140",
			"\1\145\1\152\1\uffff\1\151\6\uffff\1\146\2\uffff\1\147\1\144\3\uffff"+
			"\1\150\1\142\1\143",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\160\13\uffff\1\157",
			"\1\161",
			"\1\162",
			"\1\163\1\164",
=======
			"\1\70",
			"\1\72\1\uffff\1\74\11\uffff\1\73",
			"\1\76\3\uffff\1\75\11\uffff\1\77",
			"\1\100",
			"\1\103\2\uffff\1\102\5\uffff\1\101",
			"\1\104",
			"\1\105\2\uffff\1\106",
			"\1\110\15\uffff\1\111\2\uffff\1\107",
			"\1\113\6\uffff\1\112\1\114",
			"\1\116\5\uffff\1\115\12\uffff\1\117",
			"\1\121\11\uffff\1\123\4\uffff\1\122\1\120",
			"\1\124\3\uffff\1\126\3\uffff\1\127\5\uffff\1\125",
			"\1\132\7\uffff\1\130\5\uffff\1\131",
			"\1\133\5\uffff\1\134",
			"\1\135\2\uffff\1\136",
			"\1\137",
			"\1\141\14\uffff\1\140",
			"\1\142",
			"\1\144\3\uffff\1\143",
			"\1\145",
			"\1\151\1\156\1\uffff\1\155\6\uffff\1\152\2\uffff\1\153\1\150\3\uffff"+
			"\1\154\1\146\1\147",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\164\13\uffff\1\163",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"\1\165",
			"",
			"\1\166",
<<<<<<< HEAD
			"\1\167",
			"\1\171",
			"\1\173",
			"\1\175",
=======
			"\1\167\1\170",
			"\1\171",
			"",
			"\1\172",
			"\1\173",
			"\1\175",
			"\1\177",
			"\1\u0081",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"",
			"",
			"",
			"",
<<<<<<< HEAD
			"\1\177\4\uffff\1\177",
=======
			"\1\u0083\4\uffff\1\u0083",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
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
			"",
			"",
			"",
<<<<<<< HEAD
			"\1\u0081\6\uffff\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085\11\uffff\1\u0086\2\uffff\1\u0088\3\uffff\1\u0087",
			"\1\u0089",
			"\1\u008b\1\u008a",
			"\1\u008c",
			"\1\u008d",
			"\1\u008f\2\uffff\1\u008e",
			"\1\u0090",
			"\1\u0091\2\uffff\1\u0092",
			"\1\u0093",
			"\1\u0094\13\uffff\1\u0095",
			"\1\u0096",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0098",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u009b",
			"\1\u009c\13\uffff\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
=======
			"\1\u0085\6\uffff\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089\11\uffff\1\u008a\2\uffff\1\u008c\3\uffff\1\u008b",
			"\1\u008d",
			"\1\u008f\1\u008e",
			"\1\u0090",
			"\1\u0091",
			"\1\u0093\2\uffff\1\u0092",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096\2\uffff\1\u0097",
			"\1\u0098",
			"\1\u0099\13\uffff\1\u009a",
			"\1\u009b",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u009d",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00a0\13\uffff\1\u00a1",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
<<<<<<< HEAD
			"\1\u00ab\14\uffff\1\u00ac",
=======
			"\1\u00ab",
			"\1\u00ac",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af\14\uffff\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
<<<<<<< HEAD
			"",
			"",
			"\1\u00b5",
			"",
			"",
			"",
			"\1\u00b7\3\uffff\1\u00b6",
			"",
			"",
			"",
			"\1\u00b8",
			"\1\u00ba\23\uffff\1\u00b9",
			"\1\u00bb",
			"\1\u00bc",
			"\12\63\7\uffff\15\63\1\u00bd\14\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8\14\uffff\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"",
			"",
			"\1\u00bc",
			"",
			"",
			"",
			"\1\u00be\3\uffff\1\u00bd",
			"",
			"",
			"",
			"\1\u00bf",
			"\1\u00c1\23\uffff\1\u00c0",
			"\1\u00c2",
			"\1\u00c3",
			"\12\65\7\uffff\15\65\1\u00c4\14\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
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
<<<<<<< HEAD
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
=======
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"\1\u00d0",
			"\1\u00d1",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
<<<<<<< HEAD
			"\1\u00d9",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u00db",
			"",
			"",
			"\1\u00dc",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
<<<<<<< HEAD
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00e3",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00eb",
			"\1\u00ec",
=======
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u00e3",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00ea",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
<<<<<<< HEAD
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00fb\1\u00f9\1\uffff\1\u00f4\6\uffff\1\u00f7\2\uffff\1\u00f8\1\u00fa"+
			"\3\uffff\1\u00f3\1\u00f5\1\u00f6",
			"\1\u00fc",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00fe\20\uffff\1\u00ff",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103\23\uffff\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"",
			"\1\u010c",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u010e",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u0102\1\u0100\1\uffff\1\u00fb\6\uffff\1\u00fe\2\uffff\1\u00ff\1\u0101"+
			"\3\uffff\1\u00fa\1\u00fc\1\u00fd",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0108\20\uffff\1\u0109",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d\23\uffff\1\u010e",
			"\1\u010f",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"\1\u0110",
			"",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115",
<<<<<<< HEAD
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0117",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u011a",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u011c",
			"\1\u011d",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u011f",
			"\1\u0120",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0122",
			"\1\u0123",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u0125",
			"",
			"",
			"\12\63\7\uffff\1\63\1\u0126\30\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0128",
			"\1\u0129",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u012f",
			"\1\u0130",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u013d",
			"\1\u013e",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u013f",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0140",
=======
			"",
			"\1\u0116",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0118",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0121",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0125",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0127",
			"\1\u0128",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u012a",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u012c",
			"\1\u012d",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u012f",
			"",
			"",
			"\12\65\7\uffff\1\65\1\u0130\30\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0132",
			"\1\u0133",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0139",
			"\1\u013a",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"",
			"\1\u0146",
<<<<<<< HEAD
			"",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u014c",
=======
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"",
			"",
			"",
<<<<<<< HEAD
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u014f\16\63",
			"\1\u0151",
			"",
			"\1\u0152",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\63\1\u0153\30\63",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0149",
			"\1\u014a",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u014b",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"",
			"\1\u0152",
			"",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"\1\u0156",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0158",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
<<<<<<< HEAD
			"\1\u0157",
			"\1\u0158",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u015a",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u015b",
			"\1\u015c",
			"",
			"\1\u015d",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0160",
			"\1\u0161",
			"",
			"",
=======
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u015b\16\65",
			"\1\u015d",
			"",
			"\1\u015e",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0160",
			"",
			"\1\u0161",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"\1\u0162",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0164",
<<<<<<< HEAD
			"\1\u0166\20\uffff\1\u0165",
			"\1\u0167",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u016c",
			"\1\u016d",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0165",
			"\1\u0166",
			"",
			"\1\u0167",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u016a",
			"\1\u016b",
			"",
			"",
<<<<<<< HEAD
			"\1\u0174",
			"",
			"\1\u0175",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0177",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u017b\1\u017c",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u017e",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u0170\20\uffff\1\u016f",
			"\1\u0171",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0177",
			"\1\u0178",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u017f",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"",
			"\1\u0180",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0185\1\u0186",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0188",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c",
			"\1\u018d",
			"\1\u018e",
			"\1\u018f",
			"\1\u0190",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
<<<<<<< HEAD
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u018b",
=======
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"",
			"\1\u018c",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0195",
			"",
			"",
<<<<<<< HEAD
			"\1\u018f",
			"",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0195",
			"\1\u0196",
=======
			"",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0198",
			"",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u019e",
			"\1\u019f",
			"",
<<<<<<< HEAD
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0198",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"",
			"\1\u019e",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
=======
			"",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"",
<<<<<<< HEAD
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u01a3",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"",
			"",
			"\1\u01a5",
=======
			"\1\u01a6",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01aa",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"\1\u01ac",
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
<<<<<<< HEAD
			return "1:1: Tokens : ( T__135 | T__136 | T__137 | T__138 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | LShape | Shirt | ShirtBack | Cosine | Sine | Tan | ATan | Random | Round | Map | Move | MoveBy | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Group | Expand | Merge | MirrorX | MirrorY | GetWidth | GetHeight | GetX | GetY | GetOrigin | GetRotation | GetFill | GetStroke | GetStart | GetEnd | GetDistance | DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotStroke | DotFill | DotWeight | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | For | Repeat | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | Space );";
=======
			return "1:1: Tokens : ( T__140 | T__141 | T__142 | T__143 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | LShape | Cosine | Sine | Tan | ATan | Random | Round | Map | Move | MoveBy | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Group | Expand | Merge | MirrorX | MirrorY | Union | Difference | Clip | Xor | GetWidth | GetHeight | GetX | GetY | GetOrigin | GetRotation | GetFill | GetStroke | GetStart | GetEnd | GetDistance | DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotStroke | DotFill | DotWeight | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | For | Repeat | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | Space );";
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		}
	}

}
