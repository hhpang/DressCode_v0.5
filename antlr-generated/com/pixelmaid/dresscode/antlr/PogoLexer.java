// $ANTLR 3.5 /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-05-13 16:26:13

  package com.pixelmaid.dresscode.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PogoLexer extends Lexer {
	public static final int EOF=-1;
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

	// $ANTLR start "T__135"
	public final void mT__135() throws RecognitionException {
		try {
			int _type = T__135;
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
	// $ANTLR end "T__135"

	// $ANTLR start "T__136"
	public final void mT__136() throws RecognitionException {
		try {
			int _type = T__136;
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
	// $ANTLR end "T__136"

	// $ANTLR start "T__137"
	public final void mT__137() throws RecognitionException {
		try {
			int _type = T__137;
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
	// $ANTLR end "T__137"

	// $ANTLR start "T__138"
	public final void mT__138() throws RecognitionException {
		try {
			int _type = T__138;
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
	// $ANTLR end "T__138"

	// $ANTLR start "Ellipse"
	public final void mEllipse() throws RecognitionException {
		try {
			int _type = Ellipse;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:328:9: ( 'ellipse' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:328:11: 'ellipse'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:329:6: ( 'rect' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:329:8: 'rect'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:330:6: ( 'line' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:330:8: 'line'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:331:7: ( 'curve' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:331:9: 'curve'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:332:6: ( 'quad' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:332:8: 'quad'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:333:7: ( 'point' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:333:9: 'point'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:334:9: ( 'triangle' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:334:11: 'triangle'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:335:9: ( 'poly' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:335:11: 'poly'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:336:8: ( 'import' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:336:10: 'import'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:341:8: ( 'cos' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:341:9: 'cos'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:342:6: ( 'sin' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:342:8: 'sin'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:343:6: ( 'tan' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:343:8: 'tan'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:344:6: ( 'atan' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:344:8: 'atan'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:345:9: ( 'random' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:345:11: 'random'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:346:7: ( 'round' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:346:9: 'round'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:6: ( 'map' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:347:8: 'map'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:350:6: ( 'move' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:350:8: 'move'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:351:8: ( 'moveBy' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:351:10: 'moveBy'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:352:6: ( 'copy' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:352:8: 'copy'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:353:8: ( 'rotate' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:353:10: 'rotate'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:354:7: ( 'scale' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:354:9: 'scale'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:355:6: ( 'fill' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:355:8: 'fill'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:356:8: ( 'stroke' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:356:10: 'stroke'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:357:8: ( 'noFill' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:357:10: 'noFill'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:358:10: ( 'noStroke' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:358:12: 'noStroke'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:359:8: ( 'weight' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:359:10: 'weight'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:360:6: ( 'hide' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:360:8: 'hide'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:361:7: ( 'group' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:361:9: 'group'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:362:9: ( 'expand' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:362:11: 'expand'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:363:7: ( 'merge' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:363:9: 'merge'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:364:9: ( 'mirrorX' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:364:11: 'mirrorX'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:365:8: ( 'mirrorY' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:365:10: 'mirrorY'
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

	// $ANTLR start "GetWidth"
	public final void mGetWidth() throws RecognitionException {
		try {
			int _type = GetWidth;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:368:9: ( 'getWidth' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:368:11: 'getWidth'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:369:10: ( 'getHeight' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:369:12: 'getHeight'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:370:5: ( 'getX' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:370:7: 'getX'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:371:5: ( 'getY' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:371:7: 'getY'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:372:10: ( 'getOrigin' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:372:12: 'getOrigin'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:373:12: ( 'getRotation' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:373:14: 'getRotation'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:374:8: ( 'getFill' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:374:10: 'getFill'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:375:10: ( 'getStroke' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:375:12: 'getStroke'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:376:9: ( 'getStart' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:376:11: 'getStart'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:377:7: ( 'getEnd' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:377:9: 'getEnd'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:378:12: ( 'dist' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:378:14: 'dist'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:385:6: ( '.x' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:385:8: '.x'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:386:7: ( '.y' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:386:9: '.y'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:387:10: ( '.start' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:387:12: '.start'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:388:8: ( '.end' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:388:10: '.end'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:389:11: ( '.origin' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:389:13: '.origin'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:390:13: ( '.rotation' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:390:15: '.rotation'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:391:10: ( '.width' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:391:12: '.width'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:392:11: ( '.height' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:392:13: '.height'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:393:11: ( '.stroke' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:393:13: '.stroke'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:394:9: ( '.fill' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:394:11: '.fill'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:395:11: ( '.weight' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:395:13: '.weight'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:15: ( 'RED' | 'BLUE' | 'GREEN' | 'PURPLE' | 'YELLOW' | 'ORANGE' | 'PINK' | 'BLACK' | 'WHITE' | 'GREY' )
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
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:17: 'RED'
					{
					match("RED"); 

					}
					break;
				case 2 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:23: 'BLUE'
					{
					match("BLUE"); 

					}
					break;
				case 3 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:30: 'GREEN'
					{
					match("GREEN"); 

					}
					break;
				case 4 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:38: 'PURPLE'
					{
					match("PURPLE"); 

					}
					break;
				case 5 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:47: 'YELLOW'
					{
					match("YELLOW"); 

					}
					break;
				case 6 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:56: 'ORANGE'
					{
					match("ORANGE"); 

					}
					break;
				case 7 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:65: 'PINK'
					{
					match("PINK"); 

					}
					break;
				case 8 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:72: 'BLACK'
					{
					match("BLACK"); 

					}
					break;
				case 9 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:80: 'WHITE'
					{
					match("WHITE"); 

					}
					break;
				case 10 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:398:88: 'GREY'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:400:15: ( 'WIDTH' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:400:17: 'WIDTH'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:401:16: ( 'HEIGHT' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:401:18: 'HEIGHT'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:403:12: ( 'PI' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:403:14: 'PI'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:6: ( 'add' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:406:8: 'add'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:407:9: ( 'remove' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:407:11: 'remove'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:409:10: ( 'println' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:409:12: 'println'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:410:10: ( 'print' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:410:12: 'print'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:10: ( 'assert' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:411:12: 'assert'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:412:10: ( 'size' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:412:12: 'size'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:413:10: ( 'def' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:413:12: 'def'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:414:10: ( 'if' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:414:12: 'if'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:415:10: ( 'else' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:415:12: 'else'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:416:10: ( 'return' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:416:12: 'return'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:417:10: ( 'for' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:417:12: 'for'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:418:9: ( 'repeat' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:418:11: 'repeat'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:419:10: ( 'while' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:419:12: 'while'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:420:10: ( 'to' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:420:12: 'to'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:421:10: ( ':' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:421:12: ':'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:422:6: ( 'end' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:422:7: 'end'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:423:10: ( 'in' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:423:12: 'in'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:424:10: ( 'null' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:424:12: 'null'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:426:10: ( 'or' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:426:12: 'or'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:427:10: ( 'and' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:427:12: 'and'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:428:10: ( '==' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:428:12: '=='
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:429:10: ( '!=' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:429:12: '!='
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:430:10: ( '>=' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:430:12: '>='
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:431:10: ( '<=' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:431:12: '<='
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:432:10: ( '^' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:432:12: '^'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:433:10: ( '!' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:433:12: '!'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:434:10: ( '>' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:434:12: '>'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:435:10: ( '<' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:435:12: '<'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:436:10: ( '+' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:436:12: '+'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:437:10: ( '-' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:437:12: '-'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:438:10: ( '*' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:438:12: '*'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:439:10: ( '/' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:439:12: '/'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:440:10: ( '%' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:440:12: '%'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:441:10: ( '{' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:441:12: '{'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:442:10: ( '}' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:442:12: '}'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:443:10: ( '[' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:443:12: '['
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:444:10: ( ']' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:444:12: ']'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:445:10: ( '(' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:445:12: '('
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:446:10: ( ')' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:446:12: ')'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:448:10: ( '=' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:448:12: '='
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:449:10: ( ',' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:449:12: ','
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:450:10: ( '?' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:450:12: '?'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:452:5: ( '.' )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:452:7: '.'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:455:3: ( 'true' | 'false' )
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
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:455:6: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:456:6: 'false'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:460:3: ( Int ( Dot ( Digit )* )? )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:460:6: Int ( Dot ( Digit )* )?
			{
			mInt(); 

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:460:10: ( Dot ( Digit )* )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:460:11: Dot ( Digit )*
					{
					mDot(); 

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:460:15: ( Digit )*
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:464:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:464:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:464:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:471:3: ( '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\'' )
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
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:471:6: '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"'
					{
					match('\"'); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:471:11: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )*
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
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:471:12: ~ ( '\"' | '\\\\' )
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
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:471:29: '\\\\' ( '\\\\' | '\"' )
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
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:472:6: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\''
					{
					match('\''); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:472:11: (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )*
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
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:472:12: ~ ( '\\'' | '\\\\' )
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
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:472:29: '\\\\' ( '\\\\' | '\\'' )
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:476:3: ( '//' (~ ( '\\n' | '\\r' ) )* | '/*' ( . )* '*/' )
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
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:476:6: '//' (~ ( '\\n' | '\\r' ) )*
					{
					match("//"); 

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:476:11: (~ ( '\\n' | '\\r' ) )*
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
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:477:6: '/*' ( . )* '*/'
					{
					match("/*"); 

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:477:11: ( . )*
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
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:477:11: .
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:481:3: ( ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+ )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:481:5: ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+
			{
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:481:5: ( ' ' | '\\t' | '\\r' | '\\f' | '\\n' )+
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:528:3: ( '1' .. '9' ( Digit )* | '0' )
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
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:528:6: '1' .. '9' ( Digit )*
					{
					matchRange('1','9'); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:528:15: ( Digit )*
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
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:529:6: '0'
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
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:533:3: ( '0' .. '9' )
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:8: ( T__135 | T__136 | T__137 | T__138 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | LShape | Shirt | ShirtBack | Cosine | Sine | Tan | ATan | Random | Round | Map | Move | MoveBy | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Group | Expand | Merge | MirrorX | MirrorY | GetWidth | GetHeight | GetX | GetY | GetOrigin | GetRotation | GetFill | GetStroke | GetStart | GetEnd | GetDistance | DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotStroke | DotFill | DotWeight | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | For | Repeat | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | Space )
		int alt15=113;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:10: T__135
				{
				mT__135(); 

				}
				break;
			case 2 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:17: T__136
				{
				mT__136(); 

				}
				break;
			case 3 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:24: T__137
				{
				mT__137(); 

				}
				break;
			case 4 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:31: T__138
				{
				mT__138(); 

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
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:240: MirrorX
				{
				mMirrorX(); 

				}
				break;
			case 38 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:248: MirrorY
				{
				mMirrorY(); 

				}
				break;
			case 39 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:256: GetWidth
				{
				mGetWidth(); 

				}
				break;
			case 40 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:265: GetHeight
				{
				mGetHeight(); 

				}
				break;
			case 41 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:275: GetX
				{
				mGetX(); 

				}
				break;
			case 42 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:280: GetY
				{
				mGetY(); 

				}
				break;
			case 43 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:285: GetOrigin
				{
				mGetOrigin(); 

				}
				break;
			case 44 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:295: GetRotation
				{
				mGetRotation(); 

				}
				break;
			case 45 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:307: GetFill
				{
				mGetFill(); 

				}
				break;
			case 46 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:315: GetStroke
				{
				mGetStroke(); 

				}
				break;
			case 47 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:325: GetStart
				{
				mGetStart(); 

				}
				break;
			case 48 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:334: GetEnd
				{
				mGetEnd(); 

				}
				break;
			case 49 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:341: GetDistance
				{
				mGetDistance(); 

				}
				break;
			case 50 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:353: DotX
				{
				mDotX(); 

				}
				break;
			case 51 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:358: DotY
				{
				mDotY(); 

				}
				break;
			case 52 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:363: DotStart
				{
				mDotStart(); 

				}
				break;
			case 53 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:372: DotEnd
				{
				mDotEnd(); 

				}
				break;
			case 54 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:379: DotOrigin
				{
				mDotOrigin(); 

				}
				break;
			case 55 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:389: DotRotation
				{
				mDotRotation(); 

				}
				break;
			case 56 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:401: DotWidth
				{
				mDotWidth(); 

				}
				break;
			case 57 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:410: DotHeight
				{
				mDotHeight(); 

				}
				break;
			case 58 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:420: DotStroke
				{
				mDotStroke(); 

				}
				break;
			case 59 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:430: DotFill
				{
				mDotFill(); 

				}
				break;
			case 60 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:438: DotWeight
				{
				mDotWeight(); 

				}
				break;
			case 61 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:448: COLOR_CONSTANT
				{
				mCOLOR_CONSTANT(); 

				}
				break;
			case 62 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:463: WIDTH_CONSTANT
				{
				mWIDTH_CONSTANT(); 

				}
				break;
			case 63 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:478: HEIGHT_CONSTANT
				{
				mHEIGHT_CONSTANT(); 

				}
				break;
			case 64 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:494: PI_CONSTANT
				{
				mPI_CONSTANT(); 

				}
				break;
			case 65 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:506: LAdd
				{
				mLAdd(); 

				}
				break;
			case 66 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:511: LRemove
				{
				mLRemove(); 

				}
				break;
			case 67 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:519: Println
				{
				mPrintln(); 

				}
				break;
			case 68 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:527: Print
				{
				mPrint(); 

				}
				break;
			case 69 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:533: Assert
				{
				mAssert(); 

				}
				break;
			case 70 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:540: Size
				{
				mSize(); 

				}
				break;
			case 71 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:545: Def
				{
				mDef(); 

				}
				break;
			case 72 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:549: If
				{
				mIf(); 

				}
				break;
			case 73 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:552: Else
				{
				mElse(); 

				}
				break;
			case 74 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:557: Return
				{
				mReturn(); 

				}
				break;
			case 75 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:564: For
				{
				mFor(); 

				}
				break;
			case 76 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:568: Repeat
				{
				mRepeat(); 

				}
				break;
			case 77 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:575: While
				{
				mWhile(); 

				}
				break;
			case 78 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:581: To
				{
				mTo(); 

				}
				break;
			case 79 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:584: Do
				{
				mDo(); 

				}
				break;
			case 80 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:587: End
				{
				mEnd(); 

				}
				break;
			case 81 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:591: In
				{
				mIn(); 

				}
				break;
			case 82 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:594: Null
				{
				mNull(); 

				}
				break;
			case 83 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:599: Or
				{
				mOr(); 

				}
				break;
			case 84 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:602: And
				{
				mAnd(); 

				}
				break;
			case 85 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:606: Equals
				{
				mEquals(); 

				}
				break;
			case 86 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:613: NEquals
				{
				mNEquals(); 

				}
				break;
			case 87 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:621: GTEquals
				{
				mGTEquals(); 

				}
				break;
			case 88 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:630: LTEquals
				{
				mLTEquals(); 

				}
				break;
			case 89 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:639: Pow
				{
				mPow(); 

				}
				break;
			case 90 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:643: Excl
				{
				mExcl(); 

				}
				break;
			case 91 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:648: GT
				{
				mGT(); 

				}
				break;
			case 92 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:651: LT
				{
				mLT(); 

				}
				break;
			case 93 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:654: Add
				{
				mAdd(); 

				}
				break;
			case 94 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:658: Subtract
				{
				mSubtract(); 

				}
				break;
			case 95 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:667: Multiply
				{
				mMultiply(); 

				}
				break;
			case 96 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:676: Divide
				{
				mDivide(); 

				}
				break;
			case 97 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:683: Modulus
				{
				mModulus(); 

				}
				break;
			case 98 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:691: OBrace
				{
				mOBrace(); 

				}
				break;
			case 99 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:698: CBrace
				{
				mCBrace(); 

				}
				break;
			case 100 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:705: OBracket
				{
				mOBracket(); 

				}
				break;
			case 101 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:714: CBracket
				{
				mCBracket(); 

				}
				break;
			case 102 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:723: OParen
				{
				mOParen(); 

				}
				break;
			case 103 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:730: CParen
				{
				mCParen(); 

				}
				break;
			case 104 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:737: Assign
				{
				mAssign(); 

				}
				break;
			case 105 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:744: Comma
				{
				mComma(); 

				}
				break;
			case 106 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:750: QMark
				{
				mQMark(); 

				}
				break;
			case 107 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:756: Dot
				{
				mDot(); 

				}
				break;
			case 108 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:760: Bool
				{
				mBool(); 

				}
				break;
			case 109 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:765: Number
				{
				mNumber(); 

				}
				break;
			case 110 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:772: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 111 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:783: String
				{
				mString(); 

				}
				break;
			case 112 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:790: Comment
				{
				mComment(); 

				}
				break;
			case 113 :
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:1:798: Space
				{
				mSpace(); 

				}
				break;

		}
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
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
	static final String[] DFA15_transitionS = {
			"\2\65\1\uffff\2\65\22\uffff\1\65\1\41\1\64\2\uffff\1\51\1\1\1\64\1\56"+
			"\1\57\1\47\1\45\1\60\1\46\1\25\1\50\12\62\1\36\1\2\1\43\1\40\1\42\1\61"+
			"\1\uffff\1\63\1\27\4\63\1\30\1\35\6\63\1\33\1\31\1\63\1\26\4\63\1\34"+
			"\1\63\1\32\1\63\1\54\1\uffff\1\55\1\44\1\63\1\uffff\1\15\1\63\1\7\1\24"+
			"\1\4\1\17\1\23\1\22\1\13\2\63\1\6\1\16\1\20\1\37\1\11\1\10\1\5\1\14\1"+
			"\12\2\63\1\21\3\63\1\52\1\3\1\53",
			"",
			"",
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
			"\1\165",
			"",
			"\1\166",
			"\1\167",
			"\1\171",
			"\1\173",
			"\1\175",
			"",
			"",
			"",
			"",
			"\1\177\4\uffff\1\177",
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
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab\14\uffff\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
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
			"\1\u00d0",
			"\1\u00d1",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u00db",
			"",
			"",
			"\1\u00dc",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
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
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
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
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115",
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
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"",
			"\1\u0146",
			"",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u014c",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u014f\16\63",
			"\1\u0151",
			"",
			"\1\u0152",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\1\63\1\u0153\30\63",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0156",
			"",
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
			"\1\u0162",
			"\1\u0163",
			"\1\u0164",
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
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
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
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u018b",
			"",
			"\1\u018c",
			"",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u018f",
			"",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0195",
			"\1\u0196",
			"",
			"",
			"",
			"",
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
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u01a3",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"",
			"",
			"\1\u01a5",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
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
			return "1:1: Tokens : ( T__135 | T__136 | T__137 | T__138 | Ellipse | Rect | Line | Curve | Quad | Point | Triangle | Polygon | LShape | Shirt | ShirtBack | Cosine | Sine | Tan | ATan | Random | Round | Map | Move | MoveBy | Copy | Rotate | Scale | Fill | Stroke | NoFill | NoStroke | Weight | Hide | Group | Expand | Merge | MirrorX | MirrorY | GetWidth | GetHeight | GetX | GetY | GetOrigin | GetRotation | GetFill | GetStroke | GetStart | GetEnd | GetDistance | DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotStroke | DotFill | DotWeight | COLOR_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT | PI_CONSTANT | LAdd | LRemove | Println | Print | Assert | Size | Def | If | Else | Return | For | Repeat | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | Assign | Comma | QMark | Dot | Bool | Number | Identifier | String | Comment | Space );";
		}
	}

}
