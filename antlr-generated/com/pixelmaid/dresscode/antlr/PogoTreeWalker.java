<<<<<<< HEAD
// $ANTLR 3.5 /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g 2013-05-13 15:35:10
=======
// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g 2013-04-27 23:50:37
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

 package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.properties.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.transforms.*; 
  import com.pixelmaid.dresscode.data.*;
  
  import java.util.Map;
  import java.util.HashMap;
  import java.util.LinkedList;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PogoTreeWalker extends TreeParser {
	public static final String[] tokenNames = new String[] {
<<<<<<< HEAD
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "ATan", "Add", "And", 
		"Assert", "Assign", "BLOCK", "Bool", "CBrace", "CBracket", "COLOR_CONSTANT", 
		"CParen", "Comma", "Comment", "Copy", "Cosine", "Curve", "DOT", "DOTLOOKUP", 
		"DOTPROPERTY", "Def", "Digit", "Divide", "Do", "Dot", "DotEnd", "DotFill", 
		"DotHeight", "DotOrigin", "DotRotation", "DotStart", "DotStroke", "DotWeight", 
		"DotWidth", "DotX", "DotY", "EXP", "EXP_LIST", "Ellipse", "Else", "End", 
		"Equals", "Excl", "Expand", "FUNCTION", "FUNC_CALL", "Fill", "For", "GT", 
		"GTEquals", "GetDistance", "GetEnd", "GetFill", "GetHeight", "GetOrigin", 
		"GetRotation", "GetStart", "GetStroke", "GetWidth", "GetX", "GetY", "Group", 
		"HEIGHT_CONSTANT", "Hide", "ID_LIST", "IF", "INDEXES", "Identifier", "If", 
		"In", "Int", "LAdd", "LIST", "LOOKUP", "LRemove", "LShape", "LT", "LTEquals", 
		"Line", "Map", "Merge", "MirrorX", "MirrorY", "Modulus", "Move", "MoveBy", 
		"Multiply", "NEGATE", "NEquals", "NoFill", "NoStroke", "Null", "Number", 
		"OBrace", "OBracket", "OParen", "Or", "PI_CONSTANT", "Point", "Polygon", 
		"Pow", "Print", "Println", "QMark", "Quad", "RETURN", "Random", "Rect", 
		"Repeat", "Return", "Rotate", "Round", "SPECIAL", "STATEMENTS", "Scale", 
		"Shirt", "ShirtBack", "Sine", "Size", "Space", "String", "Stroke", "Subtract", 
		"TERNARY", "Tan", "To", "Triangle", "UNARY_MIN", "WIDTH_CONSTANT", "Weight", 
		"While", "'&&'", "';'", "'|'", "'||'"
	};
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
=======
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_CALL", "AND_CALL", "ASSIGNMENT", 
		"ATan", "Add", "And", "Assert", "Assign", "BLOCK", "Bool", "CBrace", "CBracket", 
		"COLOR_CONSTANT", "CParen", "Clip", "Comma", "Comment", "Copy", "Cosine", 
		"Curve", "DOT", "DOTLOOKUP", "DOTPROPERTY", "Def", "Difference", "Digit", 
		"Divide", "Do", "Dot", "DotEnd", "DotFill", "DotHeight", "DotOrigin", 
		"DotRotation", "DotStart", "DotStroke", "DotWeight", "DotWidth", "DotX", 
		"DotY", "EXP", "EXP_LIST", "Ellipse", "Else", "End", "Equals", "Excl", 
		"Expand", "FUNCTION", "FUNC_CALL", "Fill", "For", "GT", "GTEquals", "GetDistance", 
		"GetEnd", "GetFill", "GetHeight", "GetOrigin", "GetRotation", "GetStart", 
		"GetStroke", "GetWidth", "GetX", "GetY", "Group", "HEIGHT_CONSTANT", "Hide", 
		"ID_LIST", "IF", "INDEXES", "Identifier", "If", "In", "Int", "LAdd", "LIST", 
		"LOOKUP", "LRemove", "LShape", "LT", "LTEquals", "Line", "Map", "Merge", 
		"MirrorX", "MirrorY", "Modulus", "Move", "MoveBy", "Multiply", "NEGATE", 
		"NEquals", "NoFill", "NoStroke", "Null", "Number", "OBrace", "OBracket", 
		"OParen", "Or", "PI_CONSTANT", "Point", "Polygon", "Pow", "Print", "Println", 
		"QMark", "Quad", "RETURN", "Random", "Rect", "Repeat", "Return", "Rotate", 
		"Round", "SPECIAL", "STATEMENTS", "SUB_CALL", "Scale", "Sine", "Size", 
		"Space", "String", "Stroke", "Subtract", "TERNARY", "Tan", "To", "Triangle", 
		"UNARY_MIN", "Union", "WIDTH_CONSTANT", "Weight", "While", "Xor", "'&&'", 
		"';'", "'|'", "'||'"
	};
	public static final int EOF=-1;
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

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public PogoTreeWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public PogoTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return PogoTreeWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g"; }


	 
	 double widthParam;
	 double heightParam;
	 DrawableManager drawableManager;
	  Scope currentScope = null;
	  
	  
	  private List<String> errors = new LinkedList<String>();
	    public void displayRecognitionError(String[] tokenNames,
	                                        RecognitionException e) {
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
	        errors.add(hdr + " " + msg);
	    }
	    public List<String> getErrors() {
	        return errors;
	    }
	  public Map<String, FunctionType> functions = null;
	  
	  public PogoTreeWalker(CommonTreeNodeStream nodes, Map<String, FunctionType> fns, DrawableManager dm, double w, double h) {
	    this(nodes, null, fns,dm,w,h);
	   
	  }
	  
	  public PogoTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, FunctionType> fns, DrawableManager dm,double w,double h) {
	    super(nds);
	    currentScope = sc;
	    functions = fns;
	    this.drawableManager = dm;
	    widthParam = w;
	    heightParam = h;
	  }
	  



	// $ANTLR start "walk"
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:61:1: walk returns [BlockNode node] : block ;
	public final BlockNode walk() throws RecognitionException {
		BlockNode node = null;


		BlockNode block1 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:62:3: ( block )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:62:6: block
			{
			pushFollow(FOLLOW_block_in_walk64);
			block1=block();
			state._fsp--;

			node = block1;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "walk"



	// $ANTLR start "block"
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:65:1: block returns [BlockNode node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
	public final BlockNode block() throws RecognitionException {
		BlockNode node = null;


		DCNode statement2 =null;
		DCNode expression3 =null;


			//System.out.println(" new block called");

		  BlockNode bn = new BlockNode();
		  node = bn;
		  Scope local = new Scope(currentScope);
		  currentScope = local;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block95); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block98); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:27: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||LA1_0==FUNC_CALL||LA1_0==For||LA1_0==IF||LA1_0==Repeat||LA1_0==While) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:28: statement
						{
						pushFollow(FOLLOW_statement_in_block101);
						statement2=statement();
						state._fsp--;

						bn.addStatement(statement2);
						}
						break;

					default :
						break loop1;
					}
				}

				match(input, Token.UP, null); 
			}

			match(input,RETURN,FOLLOW_RETURN_in_block109); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:86: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
<<<<<<< HEAD
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==DOTPROPERTY||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pow||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||(LA2_0 >= UNARY_MIN && LA2_0 <= WIDTH_CONSTANT)||LA2_0==135||LA2_0==138) ) {
=======
				if ( (LA2_0==Add||LA2_0==Bool||LA2_0==COLOR_CONSTANT||LA2_0==DOTPROPERTY||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==HEIGHT_CONSTANT||LA2_0==In||LA2_0==LOOKUP||(LA2_0 >= LT && LA2_0 <= LTEquals)||LA2_0==Modulus||(LA2_0 >= Multiply && LA2_0 <= NEquals)||(LA2_0 >= Null && LA2_0 <= Number)||LA2_0==PI_CONSTANT||LA2_0==Pow||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==WIDTH_CONSTANT||LA2_0==140||LA2_0==143) ) {
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:78:87: expression
						{
						pushFollow(FOLLOW_expression_in_block112);
						expression3=expression();
						state._fsp--;

						bn.addReturn(expression3);
						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			}


			  currentScope = currentScope.parent();

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:82:1: statement returns [DCNode node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement[false] );
	public final DCNode statement() throws RecognitionException {
		DCNode node = null;


		DCNode assignment4 =null;
		DCNode functionCall5 =null;
		DCNode ifStatement6 =null;
		DCNode forStatement7 =null;
		DCNode whileStatement8 =null;
		DCNode repeatStatement9 =null;


			//System.out.println(" statement called");

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | repeatStatement[false] )
			int alt3=6;
			switch ( input.LA(1) ) {
			case ASSIGNMENT:
				{
				alt3=1;
				}
				break;
			case FUNC_CALL:
				{
				alt3=2;
				}
				break;
			case IF:
				{
				alt3=3;
				}
				break;
			case For:
				{
				alt3=4;
				}
				break;
			case While:
				{
				alt3=5;
				}
				break;
			case Repeat:
				{
				alt3=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:86:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement141);
					assignment4=assignment();
					state._fsp--;

					node = assignment4; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 2 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:87:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement154);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:88:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement165);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:89:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement177);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:90:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement188);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:91:5: repeatStatement[false]
					{
					pushFollow(FOLLOW_repeatStatement_in_statement196);
					repeatStatement9=repeatStatement(false);
					state._fsp--;

					node = repeatStatement9; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "statement"



	// $ANTLR start "assignment"
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:94:1: assignment returns [DCNode node] : ^( ASSIGNMENT Identifier ( indexes )? expression ) ;
	public final DCNode assignment() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier10=null;
		java.util.List<DCNode> indexes11 =null;
		DCNode expression12 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:3: ( ^( ASSIGNMENT Identifier ( indexes )? expression ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:6: ^( ASSIGNMENT Identifier ( indexes )? expression )
			{
			match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment218); 
			match(input, Token.DOWN, null); 
			Identifier10=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment220); 
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:30: ( indexes )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INDEXES) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:95:30: indexes
					{
					pushFollow(FOLLOW_indexes_in_assignment222);
					indexes11=indexes();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_expression_in_assignment225);
			expression12=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new AssignmentNode((Identifier10!=null?Identifier10.getText():null), indexes11, expression12, currentScope);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "assignment"



	// $ANTLR start "functionCall"
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:99:1: functionCall returns [DCNode node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall | getCall );
	public final DCNode functionCall() throws RecognitionException {
		DCNode node = null;


		CommonTree Identifier13=null;
		CommonTree FUNC_CALL20=null;
		CommonTree FUNC_CALL22=null;
		java.util.List<DCNode> exprList14 =null;
		DCNode expression15 =null;
		DCNode expression16 =null;
		DCNode expression17 =null;
		DCNode expression18 =null;
		java.util.List<DCNode> exprList19 =null;
		java.util.List<DCNode> exprList21 =null;
		DCNode primitiveCall23 =null;
		DCNode transformCall24 =null;
		DCNode mathCall25 =null;
		DCNode getCall26 =null;


			//System.out.println("function called");

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) | ^( FUNC_CALL LAdd ( exprList )? ) | ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall | getCall )
			int alt9=11;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==FUNC_CALL) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt9=1;
						}
						break;
					case Println:
						{
						alt9=2;
						}
						break;
					case Print:
						{
						alt9=3;
						}
						break;
					case Assert:
						{
						alt9=4;
						}
						break;
					case Size:
						{
						alt9=5;
						}
						break;
					case LAdd:
						{
						alt9=6;
						}
						break;
					case LRemove:
						{
						alt9=7;
						}
						break;
					case Curve:
					case Ellipse:
					case LShape:
					case Line:
					case Point:
					case Polygon:
					case Rect:
					case Shirt:
					case ShirtBack:
						{
						alt9=8;
						}
						break;
					case Clip:
					case Copy:
					case Difference:
					case Expand:
					case Fill:
					case Group:
					case Hide:
					case Merge:
					case MirrorX:
					case MirrorY:
					case Move:
					case MoveBy:
					case NoFill:
					case NoStroke:
					case Rotate:
					case Scale:
					case Stroke:
					case Union:
					case Weight:
					case Xor:
						{
						alt9=9;
						}
						break;
					case ATan:
					case Cosine:
					case Map:
					case Random:
					case Round:
					case Sine:
					case Tan:
						{
						alt9=10;
						}
						break;
					case GetDistance:
					case GetEnd:
					case GetFill:
					case GetHeight:
					case GetOrigin:
					case GetRotation:
					case GetStart:
					case GetStroke:
					case GetWidth:
					case GetX:
					case GetY:
						{
						alt9=11;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
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
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall252); 
					match(input, Token.DOWN, null); 
					Identifier13=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall254); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:29: ( exprList )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==EXP_LIST) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:103:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall256);
							exprList14=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FunctionCallNode((Identifier13!=null?Identifier13.getText():null), exprList14, functions, widthParam, heightParam); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 2 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:6: ^( FUNC_CALL Println ( expression )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall268); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall270); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:26: ( expression )?
					int alt6=2;
					int LA6_0 = input.LA(1);
<<<<<<< HEAD
					if ( (LA6_0==Add||LA6_0==Bool||LA6_0==COLOR_CONSTANT||LA6_0==DOTPROPERTY||LA6_0==Divide||LA6_0==Equals||(LA6_0 >= GT && LA6_0 <= GTEquals)||LA6_0==HEIGHT_CONSTANT||LA6_0==In||LA6_0==LOOKUP||(LA6_0 >= LT && LA6_0 <= LTEquals)||LA6_0==Modulus||(LA6_0 >= Multiply && LA6_0 <= NEquals)||(LA6_0 >= Null && LA6_0 <= Number)||LA6_0==PI_CONSTANT||LA6_0==Pow||(LA6_0 >= Subtract && LA6_0 <= TERNARY)||(LA6_0 >= UNARY_MIN && LA6_0 <= WIDTH_CONSTANT)||LA6_0==135||LA6_0==138) ) {
=======
					if ( (LA6_0==Add||LA6_0==Bool||LA6_0==COLOR_CONSTANT||LA6_0==DOTPROPERTY||LA6_0==Divide||LA6_0==Equals||(LA6_0 >= GT && LA6_0 <= GTEquals)||LA6_0==HEIGHT_CONSTANT||LA6_0==In||LA6_0==LOOKUP||(LA6_0 >= LT && LA6_0 <= LTEquals)||LA6_0==Modulus||(LA6_0 >= Multiply && LA6_0 <= NEquals)||(LA6_0 >= Null && LA6_0 <= Number)||LA6_0==PI_CONSTANT||LA6_0==Pow||(LA6_0 >= Subtract && LA6_0 <= TERNARY)||LA6_0==UNARY_MIN||LA6_0==WIDTH_CONSTANT||LA6_0==140||LA6_0==143) ) {
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:104:26: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall272);
							expression15=expression();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PrintlnNode(expression15); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 3 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:105:6: ^( FUNC_CALL Print expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall285); 
					match(input, Token.DOWN, null); 
					match(input,Print,FOLLOW_Print_in_functionCall287); 
					pushFollow(FOLLOW_expression_in_functionCall289);
					expression16=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(expression16); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 4 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:106:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall304); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall306); 
					pushFollow(FOLLOW_expression_in_functionCall308);
					expression17=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AssertNode(expression17); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:107:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall322); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall324); 
					pushFollow(FOLLOW_expression_in_functionCall326);
					expression18=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SizeNode(expression18); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 6 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:6: ^( FUNC_CALL LAdd ( exprList )? )
					{
					FUNC_CALL20=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall342); 
					match(input, Token.DOWN, null); 
					match(input,LAdd,FOLLOW_LAdd_in_functionCall344); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:23: ( exprList )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==EXP_LIST) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:108:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall346);
							exprList19=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LAddNode(exprList19,FUNC_CALL20.getLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 7 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:6: ^( FUNC_CALL LRemove ( exprList )? )
					{
					FUNC_CALL22=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall359); 
					match(input, Token.DOWN, null); 
					match(input,LRemove,FOLLOW_LRemove_in_functionCall361); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:26: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXP_LIST) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:109:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall363);
							exprList21=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LRemoveNode(exprList21,FUNC_CALL22.getLine()); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 8 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:110:6: primitiveCall
					{
					pushFollow(FOLLOW_primitiveCall_in_functionCall374);
					primitiveCall23=primitiveCall();
					state._fsp--;

					node = primitiveCall23; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 9 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:111:6: transformCall
					{
					pushFollow(FOLLOW_transformCall_in_functionCall383);
					transformCall24=transformCall();
					state._fsp--;

					node = transformCall24; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 10 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:112:6: mathCall
					{
					pushFollow(FOLLOW_mathCall_in_functionCall392);
					mathCall25=mathCall();
					state._fsp--;

					node= mathCall25; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 11 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:113:6: getCall
					{
					pushFollow(FOLLOW_getCall_in_functionCall401);
					getCall26=getCall();
					state._fsp--;

					node= getCall26; ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "functionCall"



	// $ANTLR start "primitiveCall"
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:118:3: primitiveCall returns [DCNode node] : ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) | ^( FUNC_CALL Shirt ( exprList )? ) | ^( FUNC_CALL ShirtBack ( exprList )? ) );
	public final DCNode primitiveCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL28=null;
		CommonTree FUNC_CALL30=null;
		CommonTree FUNC_CALL32=null;
		CommonTree FUNC_CALL34=null;
		CommonTree FUNC_CALL36=null;
		CommonTree FUNC_CALL38=null;
		CommonTree FUNC_CALL40=null;
		CommonTree FUNC_CALL42=null;
		CommonTree FUNC_CALL44=null;
		java.util.List<DCNode> exprList27 =null;
		java.util.List<DCNode> exprList29 =null;
		java.util.List<DCNode> exprList31 =null;
		java.util.List<DCNode> exprList33 =null;
		java.util.List<DCNode> exprList35 =null;
		java.util.List<DCNode> exprList37 =null;
		java.util.List<DCNode> exprList39 =null;
		java.util.List<DCNode> exprList41 =null;
		java.util.List<DCNode> exprList43 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:4: ( ^( FUNC_CALL Ellipse ( exprList )? ) | ^( FUNC_CALL Line ( exprList )? ) | ^( FUNC_CALL Rect ( exprList )? ) | ^( FUNC_CALL Curve ( exprList )? ) | ^( FUNC_CALL Polygon ( exprList )? ) | ^( FUNC_CALL LShape ( exprList )? ) | ^( FUNC_CALL Point ( exprList )? ) | ^( FUNC_CALL Shirt ( exprList )? ) | ^( FUNC_CALL ShirtBack ( exprList )? ) )
			int alt19=9;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==FUNC_CALL) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Ellipse:
						{
						alt19=1;
						}
						break;
					case Line:
						{
						alt19=2;
						}
						break;
					case Rect:
						{
						alt19=3;
						}
						break;
					case Curve:
						{
						alt19=4;
						}
						break;
					case Polygon:
						{
						alt19=5;
						}
						break;
					case LShape:
						{
						alt19=6;
						}
						break;
					case Point:
						{
						alt19=7;
						}
						break;
					case Shirt:
						{
						alt19=8;
						}
						break;
					case ShirtBack:
						{
						alt19=9;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 2, input);
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
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:5: ^( FUNC_CALL Ellipse ( exprList )? )
					{
					FUNC_CALL28=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall431); 
					match(input, Token.DOWN, null); 
					match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall433); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:25: ( exprList )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==EXP_LIST) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:119:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall435);
							exprList27=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new EllipseNode(exprList27,FUNC_CALL28.getLine());
					}
					break;
				case 2 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:120:5: ^( FUNC_CALL Line ( exprList )? )
					{
					FUNC_CALL30=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall447); 
					match(input, Token.DOWN, null); 
					match(input,Line,FOLLOW_Line_in_primitiveCall449); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:120:22: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:120:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall451);
							exprList29=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LineNode(exprList29,FUNC_CALL30.getLine());
					}
					break;
				case 3 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:5: ^( FUNC_CALL Rect ( exprList )? )
					{
					FUNC_CALL32=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall464); 
					match(input, Token.DOWN, null); 
					match(input,Rect,FOLLOW_Rect_in_primitiveCall466); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:22: ( exprList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==EXP_LIST) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:121:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall468);
							exprList31=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new RectangleNode(exprList31,FUNC_CALL32.getLine());
					}
					break;
				case 4 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:6: ^( FUNC_CALL Curve ( exprList )? )
					{
					FUNC_CALL34=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall482); 
					match(input, Token.DOWN, null); 
					match(input,Curve,FOLLOW_Curve_in_primitiveCall484); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:24: ( exprList )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EXP_LIST) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:122:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall486);
							exprList33=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new CurveNode(exprList33,FUNC_CALL34.getLine());
					}
					break;
				case 5 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:6: ^( FUNC_CALL Polygon ( exprList )? )
					{
					FUNC_CALL36=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall500); 
					match(input, Token.DOWN, null); 
					match(input,Polygon,FOLLOW_Polygon_in_primitiveCall502); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:26: ( exprList )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EXP_LIST) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:123:26: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall504);
							exprList35=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PolygonNode(exprList35,FUNC_CALL36.getLine());
					}
					break;
				case 6 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:124:6: ^( FUNC_CALL LShape ( exprList )? )
					{
					FUNC_CALL38=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall516); 
					match(input, Token.DOWN, null); 
					match(input,LShape,FOLLOW_LShape_in_primitiveCall518); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:124:25: ( exprList )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==EXP_LIST) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:124:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall520);
							exprList37=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new LShapeNode(exprList37,FUNC_CALL38.getLine());
					}
					break;
				case 7 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:7: ^( FUNC_CALL Point ( exprList )? )
					{
					FUNC_CALL40=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall533); 
					match(input, Token.DOWN, null); 
					match(input,Point,FOLLOW_Point_in_primitiveCall535); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:25: ( exprList )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXP_LIST) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:125:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall537);
							exprList39=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PointNode(exprList39,FUNC_CALL40.getLine());
					}
					break;
				case 8 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:6: ^( FUNC_CALL Shirt ( exprList )? )
					{
					FUNC_CALL42=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall549); 
					match(input, Token.DOWN, null); 
					match(input,Shirt,FOLLOW_Shirt_in_primitiveCall551); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:24: ( exprList )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==EXP_LIST) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:126:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall553);
							exprList41=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ShirtNode(exprList41,FUNC_CALL42.getLine());
					}
					break;
				case 9 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:6: ^( FUNC_CALL ShirtBack ( exprList )? )
					{
					FUNC_CALL44=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_primitiveCall565); 
					match(input, Token.DOWN, null); 
					match(input,ShirtBack,FOLLOW_ShirtBack_in_primitiveCall567); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:28: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==EXP_LIST) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:127:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall569);
							exprList43=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ShirtBackNode(exprList43,FUNC_CALL44.getLine());
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "primitiveCall"



	// $ANTLR start "transformCall"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:130:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:128:3: transformCall returns [DCNode node] : ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final DCNode transformCall() throws RecognitionException {
		DCNode node = null;


		CommonTree FUNC_CALL46=null;
		CommonTree FUNC_CALL48=null;
		CommonTree FUNC_CALL50=null;
		CommonTree FUNC_CALL52=null;
		CommonTree FUNC_CALL54=null;
		CommonTree FUNC_CALL56=null;
		CommonTree FUNC_CALL58=null;
		CommonTree FUNC_CALL60=null;
		CommonTree FUNC_CALL62=null;
		CommonTree FUNC_CALL64=null;
		CommonTree FUNC_CALL66=null;
		CommonTree FUNC_CALL68=null;
		CommonTree FUNC_CALL70=null;
		CommonTree FUNC_CALL72=null;
		CommonTree FUNC_CALL74=null;
<<<<<<< HEAD
		java.util.List<DCNode> exprList45 =null;
=======
		CommonTree FUNC_CALL76=null;
		CommonTree FUNC_CALL78=null;
		CommonTree FUNC_CALL80=null;
		java.util.List<DCNode> exprList41 =null;
		java.util.List<DCNode> exprList43 =null;
		DCNode expression45 =null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		java.util.List<DCNode> exprList47 =null;
		DCNode expression49 =null;
		java.util.List<DCNode> exprList51 =null;
		java.util.List<DCNode> exprList53 =null;
		java.util.List<DCNode> exprList55 =null;
		DCNode expression57 =null;
		DCNode expression59 =null;
		java.util.List<DCNode> exprList61 =null;
		DCNode expression63 =null;
		java.util.List<DCNode> exprList65 =null;
		DCNode expression67 =null;
		DCNode expression69 =null;
<<<<<<< HEAD
		java.util.List<DCNode> exprList71 =null;
		DCNode expression73 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) )
			int alt28=15;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==FUNC_CALL) ) {
				int LA28_1 = input.LA(2);
				if ( (LA28_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Move:
						{
						alt28=1;
=======
		DCNode expression71 =null;
		java.util.List<DCNode> exprList73 =null;
		java.util.List<DCNode> exprList75 =null;
		java.util.List<DCNode> exprList77 =null;
		java.util.List<DCNode> exprList79 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:129:4: ( ^( FUNC_CALL Move ( exprList )? ) | ^( FUNC_CALL MoveBy ( exprList )? ) | ^( FUNC_CALL Copy expression ) | ^( FUNC_CALL Rotate ( exprList )? ) | ^( FUNC_CALL Fill ( exprList )? ) | ^( FUNC_CALL Stroke ( exprList )? ) | ^( FUNC_CALL NoFill expression ) | ^( FUNC_CALL NoStroke expression ) | ^( FUNC_CALL Weight ( exprList )? ) | ^( FUNC_CALL Hide expression ) | ^( FUNC_CALL Group ( exprList )? ) | ^( FUNC_CALL Expand expression ) | ^( FUNC_CALL Merge expression ) | ^( FUNC_CALL Scale ( exprList )? ) | ^( FUNC_CALL MirrorX expression ) | ^( FUNC_CALL MirrorY expression ) | ^( FUNC_CALL Union ( exprList )? ) | ^( FUNC_CALL Difference ( exprList )? ) | ^( FUNC_CALL Clip ( exprList )? ) | ^( FUNC_CALL Xor ( exprList )? ) )
			int alt30=20;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==FUNC_CALL) ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Move:
						{
						alt30=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case MoveBy:
						{
<<<<<<< HEAD
						alt28=2;
=======
						alt30=2;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Copy:
						{
<<<<<<< HEAD
						alt28=3;
=======
						alt30=3;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Rotate:
						{
<<<<<<< HEAD
						alt28=4;
=======
						alt30=4;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Fill:
						{
<<<<<<< HEAD
						alt28=5;
=======
						alt30=5;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Stroke:
						{
<<<<<<< HEAD
						alt28=6;
=======
						alt30=6;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case NoFill:
						{
<<<<<<< HEAD
						alt28=7;
=======
						alt30=7;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case NoStroke:
						{
<<<<<<< HEAD
						alt28=8;
=======
						alt30=8;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Weight:
						{
<<<<<<< HEAD
						alt28=9;
=======
						alt30=9;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Hide:
						{
<<<<<<< HEAD
						alt28=10;
=======
						alt30=10;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Group:
						{
<<<<<<< HEAD
						alt28=11;
=======
						alt30=11;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Expand:
						{
<<<<<<< HEAD
						alt28=12;
=======
						alt30=12;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Merge:
						{
<<<<<<< HEAD
						alt28=13;
=======
						alt30=13;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Scale:
						{
<<<<<<< HEAD
						alt28=14;
=======
						alt30=14;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case MirrorX:
						{
<<<<<<< HEAD
						alt28=15;
=======
						alt30=15;
						}
						break;
					case MirrorY:
						{
						alt30=16;
						}
						break;
					case Union:
						{
						alt30=17;
						}
						break;
					case Difference:
						{
						alt30=18;
						}
						break;
					case Clip:
						{
						alt30=19;
						}
						break;
					case Xor:
						{
						alt30=20;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
<<<<<<< HEAD
								new NoViableAltException("", 28, 2, input);
=======
								new NoViableAltException("", 30, 2, input);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
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
<<<<<<< HEAD
							new NoViableAltException("", 28, 1, input);
=======
							new NoViableAltException("", 30, 1, input);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
=======
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:5: ^( FUNC_CALL Move ( exprList )? )
					{
					FUNC_CALL46=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall596); 
					match(input, Token.DOWN, null); 
					match(input,Move,FOLLOW_Move_in_transformCall598); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:22: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==EXP_LIST) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:131:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall600);
							exprList45=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveNode(exprList45,FUNC_CALL46.getLine());
					}
					break;
				case 2 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:6: ^( FUNC_CALL MoveBy ( exprList )? )
					{
					FUNC_CALL48=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall614); 
					match(input, Token.DOWN, null); 
					match(input,MoveBy,FOLLOW_MoveBy_in_transformCall616); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:25: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==EXP_LIST) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:132:25: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall618);
							exprList47=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new MoveByNode(exprList47,FUNC_CALL48.getLine());
					}
					break;
				case 3 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:133:5: ^( FUNC_CALL Copy expression )
					{
					FUNC_CALL50=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall631); 
					match(input, Token.DOWN, null); 
					match(input,Copy,FOLLOW_Copy_in_transformCall633); 
					pushFollow(FOLLOW_expression_in_transformCall635);
					expression49=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new CopyNode(expression49,FUNC_CALL50.getLine());
					}
					break;
				case 4 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:5: ^( FUNC_CALL Rotate ( exprList )? )
					{
					FUNC_CALL52=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall646); 
					match(input, Token.DOWN, null); 
					match(input,Rotate,FOLLOW_Rotate_in_transformCall648); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:24: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EXP_LIST) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:134:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall650);
							exprList51=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new RotateNode(exprList51,FUNC_CALL52.getLine());
=======
					node = new RotateNode(exprList47,currentScope,FUNC_CALL48.getLine());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;
				case 5 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:5: ^( FUNC_CALL Fill ( exprList )? )
					{
					FUNC_CALL54=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall661); 
					match(input, Token.DOWN, null); 
					match(input,Fill,FOLLOW_Fill_in_transformCall663); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:22: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==EXP_LIST) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:135:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall665);
							exprList53=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new FillNode(exprList53,FUNC_CALL54.getLine());
					}
					break;
				case 6 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:5: ^( FUNC_CALL Stroke ( exprList )? )
					{
					FUNC_CALL56=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall678); 
					match(input, Token.DOWN, null); 
					match(input,Stroke,FOLLOW_Stroke_in_transformCall680); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:24: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==EXP_LIST) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:136:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall682);
							exprList55=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new StrokeNode(exprList55,FUNC_CALL56.getLine());
					}
					break;
				case 7 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:137:5: ^( FUNC_CALL NoFill expression )
					{
					FUNC_CALL58=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall693); 
					match(input, Token.DOWN, null); 
					match(input,NoFill,FOLLOW_NoFill_in_transformCall695); 
					pushFollow(FOLLOW_expression_in_transformCall697);
					expression57=expression();
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new NoFillNode(expression57,FUNC_CALL58.getLine());
=======
					node = new NoFillNode(expression53 ,FUNC_CALL54.getLine());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;
				case 8 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:138:5: ^( FUNC_CALL NoStroke expression )
					{
					FUNC_CALL60=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall707); 
					match(input, Token.DOWN, null); 
					match(input,NoStroke,FOLLOW_NoStroke_in_transformCall709); 
					pushFollow(FOLLOW_expression_in_transformCall711);
					expression59=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NoStrokeNode(expression59,FUNC_CALL60.getLine());
					}
					break;
				case 9 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:5: ^( FUNC_CALL Weight ( exprList )? )
					{
					FUNC_CALL62=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall721); 
					match(input, Token.DOWN, null); 
					match(input,Weight,FOLLOW_Weight_in_transformCall723); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:24: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==EXP_LIST) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:139:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall725);
							exprList61=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new WeightNode(exprList61,FUNC_CALL62.getLine());
					}
					break;
				case 10 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:140:5: ^( FUNC_CALL Hide expression )
					{
					FUNC_CALL64=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall736); 
					match(input, Token.DOWN, null); 
					match(input,Hide,FOLLOW_Hide_in_transformCall738); 
					pushFollow(FOLLOW_expression_in_transformCall740);
					expression63=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new HideNode(expression63,FUNC_CALL64.getLine());
					}
					break;
				case 11 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:5: ^( FUNC_CALL Group ( exprList )? )
					{
					FUNC_CALL66=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall750); 
					match(input, Token.DOWN, null); 
					match(input,Group,FOLLOW_Group_in_transformCall752); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:23: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==EXP_LIST) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall754);
							exprList65=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new GroupNode(exprList65,FUNC_CALL66.getLine());
					}
					break;
				case 12 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:5: ^( FUNC_CALL Expand expression )
					{
					FUNC_CALL68=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall765); 
					match(input, Token.DOWN, null); 
					match(input,Expand,FOLLOW_Expand_in_transformCall767); 
					pushFollow(FOLLOW_expression_in_transformCall769);
					expression67=expression();
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new ExpandNode(expression67,FUNC_CALL68.getLine());
					}
					break;
				case 13 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:143:6: ^( FUNC_CALL Merge expression )
					{
					FUNC_CALL70=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall779); 
					match(input, Token.DOWN, null); 
					match(input,Merge,FOLLOW_Merge_in_transformCall781); 
					pushFollow(FOLLOW_expression_in_transformCall783);
					expression69=expression();
=======
					node = new ExpandNode(expression63, currentScope, FUNC_CALL64.getLine());
					}
					break;
				case 13 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:141:5: ^( FUNC_CALL Merge expression )
					{
					FUNC_CALL66=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall746); 
					match(input, Token.DOWN, null); 
					match(input,Merge,FOLLOW_Merge_in_transformCall748); 
					pushFollow(FOLLOW_expression_in_transformCall750);
					expression65=expression();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new MergeNode(expression69,FUNC_CALL70.getLine());
					}
					break;
				case 14 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:6: ^( FUNC_CALL Scale ( exprList )? )
					{
					FUNC_CALL72=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall793); 
					match(input, Token.DOWN, null); 
					match(input,Scale,FOLLOW_Scale_in_transformCall795); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:24: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==EXP_LIST) ) {
						alt27=1;
=======
					node = new MergeNode(expression65,currentScope,FUNC_CALL66.getLine());
					}
					break;
				case 14 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:5: ^( FUNC_CALL Scale ( exprList )? )
					{
					FUNC_CALL68=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall759); 
					match(input, Token.DOWN, null); 
					match(input,Scale,FOLLOW_Scale_in_transformCall761); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:23: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==EXP_LIST) ) {
						alt25=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					switch (alt27) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall797);
							exprList71=exprList();
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:142:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall763);
							exprList67=exprList();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ScaleNode(exprList71,FUNC_CALL72.getLine());
					}
					break;
				case 15 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:6: ^( FUNC_CALL MirrorX expression )
					{
					FUNC_CALL74=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall808); 
					match(input, Token.DOWN, null); 
					match(input,MirrorX,FOLLOW_MirrorX_in_transformCall810); 
					pushFollow(FOLLOW_expression_in_transformCall812);
					expression73=expression();
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:143:5: ^( FUNC_CALL MirrorX expression )
					{
					FUNC_CALL70=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall773); 
					match(input, Token.DOWN, null); 
					match(input,MirrorX,FOLLOW_MirrorX_in_transformCall775); 
					pushFollow(FOLLOW_expression_in_transformCall777);
					expression69=expression();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorXNode(expression73,FUNC_CALL74.getLine());
					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:144:5: ^( FUNC_CALL MirrorY expression )
					{
					FUNC_CALL72=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall786); 
					match(input, Token.DOWN, null); 
					match(input,MirrorY,FOLLOW_MirrorY_in_transformCall788); 
					pushFollow(FOLLOW_expression_in_transformCall790);
					expression71=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MirrorYNode(expression71,FUNC_CALL72.getLine());
					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:5: ^( FUNC_CALL Union ( exprList )? )
					{
					FUNC_CALL74=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall799); 
					match(input, Token.DOWN, null); 
					match(input,Union,FOLLOW_Union_in_transformCall801); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:23: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==EXP_LIST) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:145:23: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall803);
							exprList73=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new UnionNode(exprList73, currentScope, FUNC_CALL74.getLine());
					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:146:5: ^( FUNC_CALL Difference ( exprList )? )
					{
					FUNC_CALL76=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall813); 
					match(input, Token.DOWN, null); 
					match(input,Difference,FOLLOW_Difference_in_transformCall815); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:146:28: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==EXP_LIST) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:146:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall817);
							exprList75=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new DifferenceNode(exprList75, currentScope, FUNC_CALL76.getLine());
					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:5: ^( FUNC_CALL Clip ( exprList )? )
					{
					FUNC_CALL78=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall827); 
					match(input, Token.DOWN, null); 
					match(input,Clip,FOLLOW_Clip_in_transformCall829); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:22: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==EXP_LIST) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:147:22: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall831);
							exprList77=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new ClipNode(exprList77, currentScope, FUNC_CALL78.getLine());
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:148:5: ^( FUNC_CALL Xor ( exprList )? )
					{
					FUNC_CALL80=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_transformCall841); 
					match(input, Token.DOWN, null); 
					match(input,Xor,FOLLOW_Xor_in_transformCall843); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:148:21: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==EXP_LIST) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:148:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall845);
							exprList79=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new XorNode(exprList79, currentScope, FUNC_CALL80.getLine());
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "transformCall"



	// $ANTLR start "mathCall"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:148:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan expression ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:151:4: mathCall returns [DCNode node] : ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan expression ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final DCNode mathCall() throws RecognitionException {
		DCNode node = null;


<<<<<<< HEAD
		CommonTree FUNC_CALL76=null;
		CommonTree FUNC_CALL78=null;
		CommonTree FUNC_CALL80=null;
=======
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		CommonTree FUNC_CALL82=null;
		CommonTree FUNC_CALL84=null;
		CommonTree FUNC_CALL86=null;
		CommonTree FUNC_CALL88=null;
<<<<<<< HEAD
		DCNode expression75 =null;
		DCNode expression77 =null;
		DCNode expression79 =null;
		DCNode expression81 =null;
		java.util.List<DCNode> exprList83 =null;
		DCNode expression85 =null;
		java.util.List<DCNode> exprList87 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan expression ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) )
			int alt31=7;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==FUNC_CALL) ) {
				int LA31_1 = input.LA(2);
				if ( (LA31_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Cosine:
						{
						alt31=1;
=======
		CommonTree FUNC_CALL90=null;
		CommonTree FUNC_CALL92=null;
		CommonTree FUNC_CALL94=null;
		DCNode expression81 =null;
		DCNode expression83 =null;
		DCNode expression85 =null;
		DCNode expression87 =null;
		java.util.List<DCNode> exprList89 =null;
		DCNode expression91 =null;
		java.util.List<DCNode> exprList93 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:152:4: ( ^( FUNC_CALL Cosine expression ) | ^( FUNC_CALL Sine expression ) | ^( FUNC_CALL Tan expression ) | ^( FUNC_CALL ATan expression ) | ^( FUNC_CALL Random ( exprList )? ) | ^( FUNC_CALL Round expression ) | ^( FUNC_CALL Map ( exprList )? ) )
			int alt33=7;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==FUNC_CALL) ) {
				int LA33_1 = input.LA(2);
				if ( (LA33_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Cosine:
						{
						alt33=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Sine:
						{
<<<<<<< HEAD
						alt31=2;
=======
						alt33=2;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Tan:
						{
<<<<<<< HEAD
						alt31=3;
=======
						alt33=3;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case ATan:
						{
<<<<<<< HEAD
						alt31=4;
=======
						alt33=4;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Random:
						{
<<<<<<< HEAD
						alt31=5;
=======
						alt33=5;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Round:
						{
<<<<<<< HEAD
						alt31=6;
=======
						alt33=6;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Map:
						{
<<<<<<< HEAD
						alt31=7;
=======
						alt33=7;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
<<<<<<< HEAD
								new NoViableAltException("", 31, 2, input);
=======
								new NoViableAltException("", 33, 2, input);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
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
<<<<<<< HEAD
							new NoViableAltException("", 31, 1, input);
=======
							new NoViableAltException("", 33, 1, input);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:149:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL76=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall839); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall841); 
					pushFollow(FOLLOW_expression_in_mathCall843);
					expression75=expression();
=======
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:152:5: ^( FUNC_CALL Cosine expression )
					{
					FUNC_CALL82=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall873); 
					match(input, Token.DOWN, null); 
					match(input,Cosine,FOLLOW_Cosine_in_mathCall875); 
					pushFollow(FOLLOW_expression_in_mathCall877);
					expression81=expression();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new CosineNode(expression75,FUNC_CALL76.getLine());
					}
					break;
				case 2 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:150:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL78=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall853); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall855); 
					pushFollow(FOLLOW_expression_in_mathCall857);
					expression77=expression();
=======
					node = new CosineNode(expression81,FUNC_CALL82.getLine());
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:153:5: ^( FUNC_CALL Sine expression )
					{
					FUNC_CALL84=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall887); 
					match(input, Token.DOWN, null); 
					match(input,Sine,FOLLOW_Sine_in_mathCall889); 
					pushFollow(FOLLOW_expression_in_mathCall891);
					expression83=expression();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new SineNode(expression77,FUNC_CALL78.getLine());
					}
					break;
				case 3 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:151:5: ^( FUNC_CALL Tan expression )
					{
					FUNC_CALL80=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall867); 
					match(input, Token.DOWN, null); 
					match(input,Tan,FOLLOW_Tan_in_mathCall869); 
					pushFollow(FOLLOW_expression_in_mathCall871);
					expression79=expression();
=======
					node = new SineNode(expression83,FUNC_CALL84.getLine());
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:154:5: ^( FUNC_CALL Tan expression )
					{
					FUNC_CALL86=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall901); 
					match(input, Token.DOWN, null); 
					match(input,Tan,FOLLOW_Tan_in_mathCall903); 
					pushFollow(FOLLOW_expression_in_mathCall905);
					expression85=expression();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new TanNode(expression79,FUNC_CALL80.getLine());
					}
					break;
				case 4 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:152:5: ^( FUNC_CALL ATan expression )
					{
					FUNC_CALL82=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall881); 
					match(input, Token.DOWN, null); 
					match(input,ATan,FOLLOW_ATan_in_mathCall883); 
					pushFollow(FOLLOW_expression_in_mathCall885);
					expression81=expression();
=======
					node = new TanNode(expression85,FUNC_CALL86.getLine());
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:5: ^( FUNC_CALL ATan expression )
					{
					FUNC_CALL88=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall915); 
					match(input, Token.DOWN, null); 
					match(input,ATan,FOLLOW_ATan_in_mathCall917); 
					pushFollow(FOLLOW_expression_in_mathCall919);
					expression87=expression();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new ATanNode(expression81,FUNC_CALL82.getLine());
					}
					break;
				case 5 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:154:5: ^( FUNC_CALL Random ( exprList )? )
					{
					FUNC_CALL84=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall899); 
					match(input, Token.DOWN, null); 
					match(input,Random,FOLLOW_Random_in_mathCall901); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:154:24: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==EXP_LIST) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:154:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall903);
							exprList83=exprList();
=======
					node = new ATanNode(expression87,FUNC_CALL88.getLine());
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:5: ^( FUNC_CALL Random ( exprList )? )
					{
					FUNC_CALL90=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall933); 
					match(input, Token.DOWN, null); 
					match(input,Random,FOLLOW_Random_in_mathCall935); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:24: ( exprList )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==EXP_LIST) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:157:24: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall937);
							exprList89=exprList();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new RandomNode(exprList83,FUNC_CALL84.getLine());
					}
					break;
				case 6 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:155:5: ^( FUNC_CALL Round expression )
					{
					FUNC_CALL86=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall914); 
					match(input, Token.DOWN, null); 
					match(input,Round,FOLLOW_Round_in_mathCall916); 
					pushFollow(FOLLOW_expression_in_mathCall918);
					expression85=expression();
=======
					node = new RandomNode(exprList89,FUNC_CALL90.getLine());
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:158:5: ^( FUNC_CALL Round expression )
					{
					FUNC_CALL92=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall948); 
					match(input, Token.DOWN, null); 
					match(input,Round,FOLLOW_Round_in_mathCall950); 
					pushFollow(FOLLOW_expression_in_mathCall952);
					expression91=expression();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new RoundNode(expression85,FUNC_CALL86.getLine());
					}
					break;
				case 7 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:5: ^( FUNC_CALL Map ( exprList )? )
					{
					FUNC_CALL88=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall928); 
					match(input, Token.DOWN, null); 
					match(input,Map,FOLLOW_Map_in_mathCall930); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:21: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==EXP_LIST) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:156:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall932);
							exprList87=exprList();
=======
					node = new RoundNode(expression91,FUNC_CALL92.getLine());
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:159:5: ^( FUNC_CALL Map ( exprList )? )
					{
					FUNC_CALL94=(CommonTree)match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_mathCall962); 
					match(input, Token.DOWN, null); 
					match(input,Map,FOLLOW_Map_in_mathCall964); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:159:21: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==EXP_LIST) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:159:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall966);
							exprList93=exprList();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new MapNode(exprList87,FUNC_CALL88.getLine());
=======
					node = new MapNode(exprList93,FUNC_CALL94.getLine());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "mathCall"



	// $ANTLR start "getCall"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:161:4: getCall returns [DCNode node] : ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:164:4: getCall returns [DCNode node] : ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final DCNode getCall() throws RecognitionException {
		DCNode node = null;


<<<<<<< HEAD
		DCNode expression89 =null;
		DCNode expression90 =null;
		DCNode expression91 =null;
		DCNode expression92 =null;
		DCNode expression93 =null;
		DCNode expression94 =null;
		java.util.List<DCNode> exprList95 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:3: ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) )
			int alt33=11;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==FUNC_CALL) ) {
				int LA33_1 = input.LA(2);
				if ( (LA33_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case GetWidth:
						{
						alt33=1;
=======
		DCNode expression95 =null;
		DCNode expression96 =null;
		DCNode expression97 =null;
		DCNode expression98 =null;
		DCNode expression99 =null;
		DCNode expression100 =null;
		java.util.List<DCNode> exprList101 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:165:3: ( ^( FUNC_CALL GetWidth expression ) | ^( FUNC_CALL GetHeight expression ) | ^( FUNC_CALL GetX expression ) | ^( FUNC_CALL GetY expression ) | ^( FUNC_CALL GetOrigin expression ) | ^( FUNC_CALL GetRotation expression ) | ^( FUNC_CALL GetFill expression ) | ^( FUNC_CALL GetStroke expression ) | ^( FUNC_CALL GetStart expression ) | ^( FUNC_CALL GetEnd expression ) | ^( FUNC_CALL GetDistance ( exprList )? ) )
			int alt35=11;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==FUNC_CALL) ) {
				int LA35_1 = input.LA(2);
				if ( (LA35_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case GetWidth:
						{
						alt35=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case GetHeight:
						{
<<<<<<< HEAD
						alt33=2;
=======
						alt35=2;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case GetX:
						{
<<<<<<< HEAD
						alt33=3;
=======
						alt35=3;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case GetY:
						{
<<<<<<< HEAD
						alt33=4;
=======
						alt35=4;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case GetOrigin:
						{
<<<<<<< HEAD
						alt33=5;
=======
						alt35=5;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case GetRotation:
						{
<<<<<<< HEAD
						alt33=6;
=======
						alt35=6;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case GetFill:
						{
<<<<<<< HEAD
						alt33=7;
=======
						alt35=7;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case GetStroke:
						{
<<<<<<< HEAD
						alt33=8;
=======
						alt35=8;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case GetStart:
						{
<<<<<<< HEAD
						alt33=9;
=======
						alt35=9;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case GetEnd:
						{
<<<<<<< HEAD
						alt33=10;
=======
						alt35=10;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case GetDistance:
						{
<<<<<<< HEAD
						alt33=11;
=======
						alt35=11;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
<<<<<<< HEAD
								new NoViableAltException("", 33, 2, input);
=======
								new NoViableAltException("", 35, 2, input);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
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
<<<<<<< HEAD
							new NoViableAltException("", 33, 1, input);
=======
							new NoViableAltException("", 35, 1, input);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:162:5: ^( FUNC_CALL GetWidth expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall969); 
					match(input, Token.DOWN, null); 
					match(input,GetWidth,FOLLOW_GetWidth_in_getCall971); 
					pushFollow(FOLLOW_expression_in_getCall973);
					expression89=expression();
=======
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:165:5: ^( FUNC_CALL GetWidth expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1003); 
					match(input, Token.DOWN, null); 
					match(input,GetWidth,FOLLOW_GetWidth_in_getCall1005); 
					pushFollow(FOLLOW_expression_in_getCall1007);
					expression95=expression();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new GetWidthNode(expression89);
					}
					break;
				case 2 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:163:5: ^( FUNC_CALL GetHeight expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall983); 
					match(input, Token.DOWN, null); 
					match(input,GetHeight,FOLLOW_GetHeight_in_getCall985); 
					pushFollow(FOLLOW_expression_in_getCall987);
					expression90=expression();
=======
					node = new GetWidthNode(expression95);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:166:5: ^( FUNC_CALL GetHeight expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1017); 
					match(input, Token.DOWN, null); 
					match(input,GetHeight,FOLLOW_GetHeight_in_getCall1019); 
					pushFollow(FOLLOW_expression_in_getCall1021);
					expression96=expression();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new GetHeightNode(expression90);
					}
					break;
				case 3 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:164:5: ^( FUNC_CALL GetX expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall996); 
					match(input, Token.DOWN, null); 
					match(input,GetX,FOLLOW_GetX_in_getCall998); 
					pushFollow(FOLLOW_expression_in_getCall1000);
					expression91=expression();
=======
					node = new GetHeightNode(expression96);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:5: ^( FUNC_CALL GetX expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1030); 
					match(input, Token.DOWN, null); 
					match(input,GetX,FOLLOW_GetX_in_getCall1032); 
					pushFollow(FOLLOW_expression_in_getCall1034);
					expression97=expression();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new GetXNode(expression91);
					}
					break;
				case 4 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:165:5: ^( FUNC_CALL GetY expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1009); 
					match(input, Token.DOWN, null); 
					match(input,GetY,FOLLOW_GetY_in_getCall1011); 
					pushFollow(FOLLOW_expression_in_getCall1013);
					expression92=expression();
=======
					node = new GetXNode(expression97);
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:168:5: ^( FUNC_CALL GetY expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1043); 
					match(input, Token.DOWN, null); 
					match(input,GetY,FOLLOW_GetY_in_getCall1045); 
					pushFollow(FOLLOW_expression_in_getCall1047);
					expression98=expression();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new GetYNode(expression92);
					}
					break;
				case 5 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:166:5: ^( FUNC_CALL GetOrigin expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1022); 
					match(input, Token.DOWN, null); 
					match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1024); 
					pushFollow(FOLLOW_expression_in_getCall1026);
					expression93=expression();
=======
					node = new GetYNode(expression98);
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:169:5: ^( FUNC_CALL GetOrigin expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1056); 
					match(input, Token.DOWN, null); 
					match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1058); 
					pushFollow(FOLLOW_expression_in_getCall1060);
					expression99=expression();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new GetOriginNode(expression93);
					}
					break;
				case 6 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:167:5: ^( FUNC_CALL GetRotation expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1035); 
					match(input, Token.DOWN, null); 
					match(input,GetRotation,FOLLOW_GetRotation_in_getCall1037); 
					pushFollow(FOLLOW_expression_in_getCall1039);
					expression94=expression();
=======
					node = new GetOriginNode(expression99);
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:170:5: ^( FUNC_CALL GetRotation expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1069); 
					match(input, Token.DOWN, null); 
					match(input,GetRotation,FOLLOW_GetRotation_in_getCall1071); 
					pushFollow(FOLLOW_expression_in_getCall1073);
					expression100=expression();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new GetRotationNode(expression94);
					}
					break;
				case 7 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:168:5: ^( FUNC_CALL GetFill expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1048); 
					match(input, Token.DOWN, null); 
					match(input,GetFill,FOLLOW_GetFill_in_getCall1050); 
					pushFollow(FOLLOW_expression_in_getCall1052);
=======
					node = new GetRotationNode(expression100);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:171:5: ^( FUNC_CALL GetFill expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1082); 
					match(input, Token.DOWN, null); 
					match(input,GetFill,FOLLOW_GetFill_in_getCall1084); 
					pushFollow(FOLLOW_expression_in_getCall1086);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:169:5: ^( FUNC_CALL GetStroke expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1060); 
					match(input, Token.DOWN, null); 
					match(input,GetStroke,FOLLOW_GetStroke_in_getCall1062); 
					pushFollow(FOLLOW_expression_in_getCall1064);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:5: ^( FUNC_CALL GetStroke expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1094); 
					match(input, Token.DOWN, null); 
					match(input,GetStroke,FOLLOW_GetStroke_in_getCall1096); 
					pushFollow(FOLLOW_expression_in_getCall1098);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:170:5: ^( FUNC_CALL GetStart expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1072); 
					match(input, Token.DOWN, null); 
					match(input,GetStart,FOLLOW_GetStart_in_getCall1074); 
					pushFollow(FOLLOW_expression_in_getCall1076);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:173:5: ^( FUNC_CALL GetStart expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1106); 
					match(input, Token.DOWN, null); 
					match(input,GetStart,FOLLOW_GetStart_in_getCall1108); 
					pushFollow(FOLLOW_expression_in_getCall1110);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:171:4: ^( FUNC_CALL GetEnd expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1083); 
					match(input, Token.DOWN, null); 
					match(input,GetEnd,FOLLOW_GetEnd_in_getCall1085); 
					pushFollow(FOLLOW_expression_in_getCall1087);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:174:4: ^( FUNC_CALL GetEnd expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1117); 
					match(input, Token.DOWN, null); 
					match(input,GetEnd,FOLLOW_GetEnd_in_getCall1119); 
					pushFollow(FOLLOW_expression_in_getCall1121);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:4: ^( FUNC_CALL GetDistance ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1095); 
					match(input, Token.DOWN, null); 
					match(input,GetDistance,FOLLOW_GetDistance_in_getCall1097); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:28: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==EXP_LIST) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:172:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1099);
							exprList95=exprList();
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:175:4: ^( FUNC_CALL GetDistance ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_getCall1129); 
					match(input, Token.DOWN, null); 
					match(input,GetDistance,FOLLOW_GetDistance_in_getCall1131); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:175:28: ( exprList )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==EXP_LIST) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:175:28: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1133);
							exprList101=exprList();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new DistanceNode(exprList95);
=======
					node = new DistanceNode(exprList101);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "getCall"



	// $ANTLR start "ifStatement"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:176:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:1: ifStatement returns [DCNode node] : ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final DCNode ifStatement() throws RecognitionException {
		DCNode node = null;


		IfNode ifNode = new IfNode();
		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement1136); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement1138);
			ifStat(ifNode);
			state._fsp--;

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:26: ( elseIfStat[ifNode] )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==EXP) ) {
					int LA34_1 = input.LA(2);
					if ( (LA34_1==DOWN) ) {
						int LA34_3 = input.LA(3);
						if ( (LA34_3==Add||LA34_3==Bool||LA34_3==COLOR_CONSTANT||LA34_3==DOTPROPERTY||LA34_3==Divide||LA34_3==Equals||(LA34_3 >= GT && LA34_3 <= GTEquals)||LA34_3==HEIGHT_CONSTANT||LA34_3==In||LA34_3==LOOKUP||(LA34_3 >= LT && LA34_3 <= LTEquals)||LA34_3==Modulus||(LA34_3 >= Multiply && LA34_3 <= NEquals)||(LA34_3 >= Null && LA34_3 <= Number)||LA34_3==PI_CONSTANT||LA34_3==Pow||(LA34_3 >= Subtract && LA34_3 <= TERNARY)||(LA34_3 >= UNARY_MIN && LA34_3 <= WIDTH_CONSTANT)||LA34_3==135||LA34_3==138) ) {
							alt34=1;
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:3: ( ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:6: ^( IF ifStat[ifNode] ( elseIfStat[ifNode] )* ( elseStat[ifNode] )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement1170); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_ifStat_in_ifStatement1172);
			ifStat(ifNode);
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:26: ( elseIfStat[ifNode] )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==EXP) ) {
					int LA36_1 = input.LA(2);
					if ( (LA36_1==DOWN) ) {
						int LA36_3 = input.LA(3);
						if ( (LA36_3==Add||LA36_3==Bool||LA36_3==COLOR_CONSTANT||LA36_3==DOTPROPERTY||LA36_3==Divide||LA36_3==Equals||(LA36_3 >= GT && LA36_3 <= GTEquals)||LA36_3==HEIGHT_CONSTANT||LA36_3==In||LA36_3==LOOKUP||(LA36_3 >= LT && LA36_3 <= LTEquals)||LA36_3==Modulus||(LA36_3 >= Multiply && LA36_3 <= NEquals)||(LA36_3 >= Null && LA36_3 <= Number)||LA36_3==PI_CONSTANT||LA36_3==Pow||(LA36_3 >= Subtract && LA36_3 <= TERNARY)||LA36_3==UNARY_MIN||LA36_3==WIDTH_CONSTANT||LA36_3==140||LA36_3==143) ) {
							alt36=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}

					}

				}

<<<<<<< HEAD
				switch (alt34) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1142);
=======
				switch (alt36) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:27: elseIfStat[ifNode]
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1176);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					elseIfStat(ifNode);
					state._fsp--;

					}
					break;

				default :
<<<<<<< HEAD
					break loop34;
				}
			}

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:48: ( elseStat[ifNode] )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==EXP) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:179:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1148);
=======
					break loop36;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:48: ( elseStat[ifNode] )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==EXP) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:49: elseStat[ifNode]
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1182);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					elseStat(ifNode);
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			}

			node = ifNode;
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "ifStat"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:182:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression96 =null;
		BlockNode block97 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:3: ( ^( EXP expression block ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:183:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat1168); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat1170);
			expression96=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat1172);
			block97=block();
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:185:1: ifStat[IfNode parent] : ^( EXP expression block ) ;
	public final void ifStat(IfNode parent) throws RecognitionException {
		DCNode expression102 =null;
		BlockNode block103 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_ifStat1202); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStat1204);
			expression102=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_ifStat1206);
			block103=block();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			state._fsp--;

			match(input, Token.UP, null); 

<<<<<<< HEAD
			parent.addChoice(expression96, block97);
=======
			parent.addChoice(expression102, block103);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifStat"



	// $ANTLR start "elseIfStat"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:186:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression98 =null;
		BlockNode block99 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:187:3: ( ^( EXP expression block ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:187:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat1191); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat1193);
			expression98=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat1195);
			block99=block();
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:189:1: elseIfStat[IfNode parent] : ^( EXP expression block ) ;
	public final void elseIfStat(IfNode parent) throws RecognitionException {
		DCNode expression104 =null;
		BlockNode block105 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:190:3: ( ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:190:6: ^( EXP expression block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseIfStat1225); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_elseIfStat1227);
			expression104=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_elseIfStat1229);
			block105=block();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			state._fsp--;

			match(input, Token.UP, null); 

<<<<<<< HEAD
			parent.addChoice(expression98, block99);
=======
			parent.addChoice(expression104, block105);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "elseIfStat"



	// $ANTLR start "elseStat"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:190:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block100 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:191:3: ( ^( EXP block ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:191:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat1214); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat1216);
			block100=block();
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:193:1: elseStat[IfNode parent] : ^( EXP block ) ;
	public final void elseStat(IfNode parent) throws RecognitionException {
		BlockNode block106 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:3: ( ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:6: ^( EXP block )
			{
			match(input,EXP,FOLLOW_EXP_in_elseStat1248); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_block_in_elseStat1250);
			block106=block();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			state._fsp--;

			match(input, Token.UP, null); 

<<<<<<< HEAD
			parent.addChoice(new AtomNode(true), block100);
=======
			parent.addChoice(new AtomNode(true), block106);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "elseStat"



	// $ANTLR start "forStatement"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:194:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:197:1: forStatement returns [DCNode node] : ^( For Identifier a= expression b= expression block ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final DCNode forStatement() throws RecognitionException {
		DCNode node = null;


<<<<<<< HEAD
		CommonTree Identifier101=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block102 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:195:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:195:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement1241); 
			match(input, Token.DOWN, null); 
			Identifier101=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement1243); 
			pushFollow(FOLLOW_expression_in_forStatement1247);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement1251);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement1253);
			block102=block();
=======
		CommonTree Identifier107=null;
		DCNode a =null;
		DCNode b =null;
		BlockNode block108 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:198:3: ( ^( For Identifier a= expression b= expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:198:6: ^( For Identifier a= expression b= expression block )
			{
			match(input,For,FOLLOW_For_in_forStatement1275); 
			match(input, Token.DOWN, null); 
			Identifier107=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forStatement1277); 
			pushFollow(FOLLOW_expression_in_forStatement1281);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement1285);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement1287);
			block108=block();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			state._fsp--;

			match(input, Token.UP, null); 

<<<<<<< HEAD
			node = new ForStatementNode((Identifier101!=null?Identifier101.getText():null), a, b, block102, currentScope);
=======
			node = new ForStatementNode((Identifier107!=null?Identifier107.getText():null), a, b, block108, currentScope);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "forStatement"



	// $ANTLR start "repeatStatement"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:198:1: repeatStatement[boolean lookup] returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:201:1: repeatStatement[boolean lookup] returns [DCNode node] : ^( Repeat Identifier a= expression b= expression (c= expression )? block ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final DCNode repeatStatement(boolean lookup) throws RecognitionException {
		DCNode node = null;


<<<<<<< HEAD
		CommonTree Identifier103=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block104 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:199:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:199:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1277); 
			match(input, Token.DOWN, null); 
			Identifier103=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1279); 
			pushFollow(FOLLOW_expression_in_repeatStatement1283);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement1287);
			b=expression();
			state._fsp--;

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:199:51: (c= expression )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==Add||LA36_0==Bool||LA36_0==COLOR_CONSTANT||LA36_0==DOTPROPERTY||LA36_0==Divide||LA36_0==Equals||(LA36_0 >= GT && LA36_0 <= GTEquals)||LA36_0==HEIGHT_CONSTANT||LA36_0==In||LA36_0==LOOKUP||(LA36_0 >= LT && LA36_0 <= LTEquals)||LA36_0==Modulus||(LA36_0 >= Multiply && LA36_0 <= NEquals)||(LA36_0 >= Null && LA36_0 <= Number)||LA36_0==PI_CONSTANT||LA36_0==Pow||(LA36_0 >= Subtract && LA36_0 <= TERNARY)||(LA36_0 >= UNARY_MIN && LA36_0 <= WIDTH_CONSTANT)||LA36_0==135||LA36_0==138) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:199:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement1292);
=======
		CommonTree Identifier109=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		BlockNode block110 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:202:3: ( ^( Repeat Identifier a= expression b= expression (c= expression )? block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:202:5: ^( Repeat Identifier a= expression b= expression (c= expression )? block )
			{
			match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1311); 
			match(input, Token.DOWN, null); 
			Identifier109=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1313); 
			pushFollow(FOLLOW_expression_in_repeatStatement1317);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_repeatStatement1321);
			b=expression();
			state._fsp--;

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:202:51: (c= expression )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==Add||LA38_0==Bool||LA38_0==COLOR_CONSTANT||LA38_0==DOTPROPERTY||LA38_0==Divide||LA38_0==Equals||(LA38_0 >= GT && LA38_0 <= GTEquals)||LA38_0==HEIGHT_CONSTANT||LA38_0==In||LA38_0==LOOKUP||(LA38_0 >= LT && LA38_0 <= LTEquals)||LA38_0==Modulus||(LA38_0 >= Multiply && LA38_0 <= NEquals)||(LA38_0 >= Null && LA38_0 <= Number)||LA38_0==PI_CONSTANT||LA38_0==Pow||(LA38_0 >= Subtract && LA38_0 <= TERNARY)||LA38_0==UNARY_MIN||LA38_0==WIDTH_CONSTANT||LA38_0==140||LA38_0==143) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:202:52: c= expression
					{
					pushFollow(FOLLOW_expression_in_repeatStatement1326);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					c=expression();
					state._fsp--;

					}
					break;

			}

<<<<<<< HEAD
			pushFollow(FOLLOW_block_in_repeatStatement1296);
			block104=block();
=======
			pushFollow(FOLLOW_block_in_repeatStatement1330);
			block110=block();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			state._fsp--;

			match(input, Token.UP, null); 

<<<<<<< HEAD
			node = new RepeatStatementNode((Identifier103!=null?Identifier103.getText():null), a, b, c, block104, currentScope, lookup);
=======
			node = new RepeatStatementNode((Identifier109!=null?Identifier109.getText():null), a, b, c, block110, currentScope, lookup);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "repeatStatement"



	// $ANTLR start "whileStatement"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:203:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:206:1: whileStatement returns [DCNode node] : ^( While expression block ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final DCNode whileStatement() throws RecognitionException {
		DCNode node = null;


<<<<<<< HEAD
		DCNode expression105 =null;
		BlockNode block106 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:204:3: ( ^( While expression block ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:204:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement1319); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement1321);
			expression105=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement1323);
			block106=block();
=======
		DCNode expression111 =null;
		BlockNode block112 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:3: ( ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement1353); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement1355);
			expression111=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement1357);
			block112=block();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			state._fsp--;

			match(input, Token.UP, null); 

<<<<<<< HEAD
			node = new WhileStatementNode(expression105, block106);
=======
			node = new WhileStatementNode(expression111, block112);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "whileStatement"



	// $ANTLR start "idList"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:207:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:210:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


<<<<<<< HEAD
		CommonTree Identifier107=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList1350); 
			match(input, Token.DOWN, null); 
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:16: ( Identifier )+
			int cnt37=0;
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==Identifier) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:209:17: Identifier
					{
					Identifier107=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList1353); 
					i.add((Identifier107!=null?Identifier107.getText():null));
=======
		CommonTree Identifier113=null;

		i = new java.util.ArrayList<String>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:212:3: ( ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:212:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList1384); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:212:16: ( Identifier )+
			int cnt39=0;
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==Identifier) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:212:17: Identifier
					{
					Identifier113=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_idList1387); 
					i.add((Identifier113!=null?Identifier113.getText():null));
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

				default :
<<<<<<< HEAD
					if ( cnt37 >= 1 ) break loop37;
					EarlyExitException eee = new EarlyExitException(37, input);
					throw eee;
				}
				cnt37++;
=======
					if ( cnt39 >= 1 ) break loop39;
					EarlyExitException eee = new EarlyExitException(39, input);
					throw eee;
				}
				cnt39++;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return i;
	}
	// $ANTLR end "idList"



	// $ANTLR start "exprList"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:212:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:215:1: exprList returns [java.util.List<DCNode> e] : ^( EXP_LIST ( expression )+ ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final java.util.List<DCNode> exprList() throws RecognitionException {
		java.util.List<DCNode> e = null;


<<<<<<< HEAD
		DCNode expression108 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList1383); 
			match(input, Token.DOWN, null); 
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:17: ( expression )+
			int cnt38=0;
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==Add||LA38_0==Bool||LA38_0==COLOR_CONSTANT||LA38_0==DOTPROPERTY||LA38_0==Divide||LA38_0==Equals||(LA38_0 >= GT && LA38_0 <= GTEquals)||LA38_0==HEIGHT_CONSTANT||LA38_0==In||LA38_0==LOOKUP||(LA38_0 >= LT && LA38_0 <= LTEquals)||LA38_0==Modulus||(LA38_0 >= Multiply && LA38_0 <= NEquals)||(LA38_0 >= Null && LA38_0 <= Number)||LA38_0==PI_CONSTANT||LA38_0==Pow||(LA38_0 >= Subtract && LA38_0 <= TERNARY)||(LA38_0 >= UNARY_MIN && LA38_0 <= WIDTH_CONSTANT)||LA38_0==135||LA38_0==138) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:214:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList1386);
					expression108=expression();
					state._fsp--;

					e.add(expression108);
=======
		DCNode expression114 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:217:3: ( ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:217:6: ^( EXP_LIST ( expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList1417); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:217:17: ( expression )+
			int cnt40=0;
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==Add||LA40_0==Bool||LA40_0==COLOR_CONSTANT||LA40_0==DOTPROPERTY||LA40_0==Divide||LA40_0==Equals||(LA40_0 >= GT && LA40_0 <= GTEquals)||LA40_0==HEIGHT_CONSTANT||LA40_0==In||LA40_0==LOOKUP||(LA40_0 >= LT && LA40_0 <= LTEquals)||LA40_0==Modulus||(LA40_0 >= Multiply && LA40_0 <= NEquals)||(LA40_0 >= Null && LA40_0 <= Number)||LA40_0==PI_CONSTANT||LA40_0==Pow||(LA40_0 >= Subtract && LA40_0 <= TERNARY)||LA40_0==UNARY_MIN||LA40_0==WIDTH_CONSTANT||LA40_0==140||LA40_0==143) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:217:18: expression
					{
					pushFollow(FOLLOW_expression_in_exprList1420);
					expression114=expression();
					state._fsp--;

					e.add(expression114);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

				default :
<<<<<<< HEAD
					if ( cnt38 >= 1 ) break loop38;
					EarlyExitException eee = new EarlyExitException(38, input);
					throw eee;
				}
				cnt38++;
=======
					if ( cnt40 >= 1 ) break loop40;
					EarlyExitException eee = new EarlyExitException(40, input);
					throw eee;
				}
				cnt40++;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "exprList"



	// $ANTLR start "expression"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:218:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:221:1: expression returns [DCNode node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final DCNode expression() throws RecognitionException {
		DCNode node = null;


<<<<<<< HEAD
		CommonTree Number109=null;
		CommonTree Bool110=null;
		CommonTree COLOR_CONSTANT112=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup111 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt39=26;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt39=1;
=======
		CommonTree Number115=null;
		CommonTree Bool116=null;
		CommonTree COLOR_CONSTANT118=null;
		DCNode a =null;
		DCNode b =null;
		DCNode c =null;
		DCNode lookup117 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:222:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( In a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt41=26;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt41=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case In:
				{
<<<<<<< HEAD
				alt39=2;
				}
				break;
			case 138:
				{
				alt39=3;
				}
				break;
			case 135:
				{
				alt39=4;
=======
				alt41=2;
				}
				break;
			case 143:
				{
				alt41=3;
				}
				break;
			case 140:
				{
				alt41=4;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Equals:
				{
<<<<<<< HEAD
				alt39=5;
=======
				alt41=5;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case NEquals:
				{
<<<<<<< HEAD
				alt39=6;
=======
				alt41=6;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case GTEquals:
				{
<<<<<<< HEAD
				alt39=7;
=======
				alt41=7;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case LTEquals:
				{
<<<<<<< HEAD
				alt39=8;
=======
				alt41=8;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case GT:
				{
<<<<<<< HEAD
				alt39=9;
=======
				alt41=9;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case LT:
				{
<<<<<<< HEAD
				alt39=10;
=======
				alt41=10;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Add:
				{
<<<<<<< HEAD
				alt39=11;
=======
				alt41=11;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Subtract:
				{
<<<<<<< HEAD
				alt39=12;
=======
				alt41=12;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Multiply:
				{
<<<<<<< HEAD
				alt39=13;
=======
				alt41=13;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Divide:
				{
<<<<<<< HEAD
				alt39=14;
=======
				alt41=14;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Modulus:
				{
<<<<<<< HEAD
				alt39=15;
=======
				alt41=15;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Pow:
				{
<<<<<<< HEAD
				alt39=16;
=======
				alt41=16;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case UNARY_MIN:
				{
<<<<<<< HEAD
				alt39=17;
=======
				alt41=17;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case NEGATE:
				{
<<<<<<< HEAD
				alt39=18;
=======
				alt41=18;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Number:
				{
<<<<<<< HEAD
				alt39=19;
=======
				alt41=19;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Bool:
				{
<<<<<<< HEAD
				alt39=20;
=======
				alt41=20;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Null:
				{
<<<<<<< HEAD
				alt39=21;
=======
				alt41=21;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case DOTPROPERTY:
			case LOOKUP:
				{
<<<<<<< HEAD
				alt39=22;
=======
				alt41=22;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case COLOR_CONSTANT:
				{
<<<<<<< HEAD
				alt39=23;
=======
				alt41=23;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case PI_CONSTANT:
				{
<<<<<<< HEAD
				alt39=24;
=======
				alt41=24;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case WIDTH_CONSTANT:
				{
<<<<<<< HEAD
				alt39=25;
=======
				alt41=25;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case HEIGHT_CONSTANT:
				{
<<<<<<< HEAD
				alt39=26;
=======
				alt41=26;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			default:
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:219:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression1411); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1415);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1419);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1423);
=======
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:222:6: ^( TERNARY a= expression b= expression c= expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression1445); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1449);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1453);
					b=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1457);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					c=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new TernaryNode(a, b, c); 
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:220:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression1434); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1438);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1442);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:6: ^( In a= expression b= expression )
					{
					match(input,In,FOLLOW_In_in_expression1468); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1472);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1476);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new InNode(a, b);
					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:221:6: ^( '||' a= expression b= expression )
					{
					match(input,138,FOLLOW_138_in_expression1471); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1475);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1479);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:224:6: ^( '||' a= expression b= expression )
					{
					match(input,143,FOLLOW_143_in_expression1505); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1509);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1513);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:222:6: ^( '&&' a= expression b= expression )
					{
					match(input,135,FOLLOW_135_in_expression1506); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1510);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1514);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:225:6: ^( '&&' a= expression b= expression )
					{
					match(input,140,FOLLOW_140_in_expression1540); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1544);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1548);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:223:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression1541); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1545);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1549);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:226:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression1575); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1579);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1583);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:224:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression1576); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1580);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1584);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:227:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression1610); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1614);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1618);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:225:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression1611); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1615);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1619);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:228:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression1645); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1649);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1653);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTEqualsNode(a, b);
					}
					break;
				case 8 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:226:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression1646); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1650);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1654);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:229:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression1680); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1684);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1688);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTEqualsNode(a, b);
					}
					break;
				case 9 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:227:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression1681); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1685);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1689);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:230:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression1715); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1719);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1723);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GTNode(a, b);
					}
					break;
				case 10 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:228:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression1717); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1721);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1725);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:231:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression1751); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1755);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1759);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LTNode(a, b);
					}
					break;
				case 11 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:229:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression1753); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1757);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1761);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:232:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression1787); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1791);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1795);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 12 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:230:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression1789); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1793);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1797);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:233:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression1823); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1827);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1831);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b); ((NodeEvent)node).addEventListener(drawableManager);
					}
					break;
				case 13 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:231:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression1825); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1829);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1833);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression1859); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1863);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1867);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MulNode(a, b);
					}
					break;
				case 14 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:232:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression1861); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1865);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1869);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:235:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression1895); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1899);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1903);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivNode(a, b);
					}
					break;
				case 15 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:233:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression1897); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1901);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1905);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:236:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression1931); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1935);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1939);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:234:6: ^( '^' a= expression b= expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression1933); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1937);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1941);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:237:6: ^( '^' a= expression b= expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression1967); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1971);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1975);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowNode(a, b);
					}
					break;
				case 17 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:235:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression1969); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1973);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression2003); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2007);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UnaryMinusNode(a);
					}
					break;
				case 18 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:236:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression2008); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2012);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:239:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression2042); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression2046);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NegateNode(a);
					}
					break;
				case 19 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:237:6: Number
					{
					Number109=(CommonTree)match(input,Number,FOLLOW_Number_in_expression2049); 
					node = new AtomNode(Double.parseDouble((Number109!=null?Number109.getText():null)));
					}
					break;
				case 20 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:238:6: Bool
					{
					Bool110=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression2101); 
					node = new AtomNode(Boolean.parseBoolean((Bool110!=null?Bool110.getText():null)));
					}
					break;
				case 21 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:239:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression2155); 
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:240:6: Number
					{
					Number115=(CommonTree)match(input,Number,FOLLOW_Number_in_expression2083); 
					node = new AtomNode(Double.parseDouble((Number115!=null?Number115.getText():null)));
					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:241:6: Bool
					{
					Bool116=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression2135); 
					node = new AtomNode(Boolean.parseBoolean((Bool116!=null?Bool116.getText():null)));
					}
					break;
				case 21 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression2189); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					node = new AtomNode(null);
					}
					break;
				case 22 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:240:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression2209);
					lookup111=lookup();
					state._fsp--;

					node = lookup111;
					}
					break;
				case 23 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:241:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT112=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression2261); 
					node = new AtomNode((COLOR_CONSTANT112!=null?COLOR_CONSTANT112.getText():null));
					}
					break;
				case 24 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:242:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression2280); 
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:243:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression2243);
					lookup117=lookup();
					state._fsp--;

					node = lookup117;
					}
					break;
				case 23 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:244:6: COLOR_CONSTANT
					{
					COLOR_CONSTANT118=(CommonTree)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_expression2295); 
					node = new AtomNode((COLOR_CONSTANT118!=null?COLOR_CONSTANT118.getText():null));
					}
					break;
				case 24 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:245:5: PI_CONSTANT
					{
					match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_expression2314); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					node = new AtomNode(Math.PI);
					}
					break;
				case 25 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:243:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression2326); 
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:246:4: WIDTH_CONSTANT
					{
					match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_expression2360); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					node = new AtomNode(widthParam);
					}
					break;
				case 26 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:244:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression2371); 
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:247:4: HEIGHT_CONSTANT
					{
					match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_expression2405); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					node = new AtomNode(heightParam);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "expression"



	// $ANTLR start "list"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:247:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:250:1: list returns [DCNode node] : ^( LIST ( exprList )? ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final DCNode list() throws RecognitionException {
		DCNode node = null;


<<<<<<< HEAD
		java.util.List<DCNode> exprList113 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:248:3: ( ^( LIST ( exprList )? ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:248:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list2430); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:248:13: ( exprList )?
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==EXP_LIST) ) {
					alt40=1;
				}
				switch (alt40) {
					case 1 :
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:248:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list2432);
						exprList113=exprList();
=======
		java.util.List<DCNode> exprList119 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:251:3: ( ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:251:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list2464); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:251:13: ( exprList )?
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==EXP_LIST) ) {
					alt42=1;
				}
				switch (alt42) {
					case 1 :
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:251:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list2466);
						exprList119=exprList();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

<<<<<<< HEAD
			node = new ListNode(exprList113);
=======
			node = new ListNode(exprList119);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "list"



	// $ANTLR start "lookup"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:253:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:256:1: lookup returns [DCNode node] : ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final DCNode lookup() throws RecognitionException {
		DCNode node = null;


<<<<<<< HEAD
		CommonTree Identifier116=null;
		CommonTree Identifier121=null;
		CommonTree String122=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall114 =null;
		java.util.List<PropertyNode> dotProperty115 =null;
		java.util.List<PropertyNode> dotProperty117 =null;
		DCNode functionCall118 =null;
		DCNode list119 =null;
		DCNode expression120 =null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:254:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
			int alt46=7;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==DOTPROPERTY) ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==DOWN) ) {
					int LA46_3 = input.LA(3);
					if ( (LA46_3==Identifier) ) {
						alt46=2;
					}
					else if ( (LA46_3==FUNC_CALL) ) {
						alt46=1;
=======
		CommonTree Identifier122=null;
		CommonTree Identifier127=null;
		CommonTree String128=null;
		java.util.List<DCNode> i =null;
		DCNode functionCall120 =null;
		java.util.List<PropertyNode> dotProperty121 =null;
		java.util.List<PropertyNode> dotProperty123 =null;
		DCNode functionCall124 =null;
		DCNode list125 =null;
		DCNode expression126 =null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:257:3: ( ^( DOTPROPERTY functionCall dotProperty ) | ^( DOTPROPERTY Identifier dotProperty ) | ^( LOOKUP functionCall (i= indexes )? ) | ^( LOOKUP list (i= indexes )? ) | ^( LOOKUP expression (i= indexes )? ) | ^( LOOKUP Identifier (i= indexes )? ) | ^( LOOKUP String (i= indexes )? ) )
			int alt48=7;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==DOTPROPERTY) ) {
				int LA48_1 = input.LA(2);
				if ( (LA48_1==DOWN) ) {
					int LA48_3 = input.LA(3);
					if ( (LA48_3==Identifier) ) {
						alt48=2;
					}
					else if ( (LA48_3==FUNC_CALL) ) {
						alt48=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
<<<<<<< HEAD
								new NoViableAltException("", 46, 3, input);
=======
								new NoViableAltException("", 48, 3, input);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
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
<<<<<<< HEAD
							new NoViableAltException("", 46, 1, input);
=======
							new NoViableAltException("", 48, 1, input);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
<<<<<<< HEAD
			else if ( (LA46_0==LOOKUP) ) {
				int LA46_2 = input.LA(2);
				if ( (LA46_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt46=6;
=======
			else if ( (LA48_0==LOOKUP) ) {
				int LA48_2 = input.LA(2);
				if ( (LA48_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt48=6;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case String:
						{
<<<<<<< HEAD
						alt46=7;
=======
						alt48=7;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case FUNC_CALL:
						{
<<<<<<< HEAD
						alt46=3;
=======
						alt48=3;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case LIST:
						{
<<<<<<< HEAD
						alt46=4;
=======
						alt48=4;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					case Add:
					case Bool:
					case COLOR_CONSTANT:
					case DOTPROPERTY:
					case Divide:
					case Equals:
					case GT:
					case GTEquals:
					case HEIGHT_CONSTANT:
					case In:
					case LOOKUP:
					case LT:
					case LTEquals:
					case Modulus:
					case Multiply:
					case NEGATE:
					case NEquals:
					case Null:
					case Number:
					case PI_CONSTANT:
					case Pow:
					case Subtract:
					case TERNARY:
					case UNARY_MIN:
					case WIDTH_CONSTANT:
<<<<<<< HEAD
					case 135:
					case 138:
						{
						alt46=5;
=======
					case 140:
					case 143:
						{
						alt48=5;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
<<<<<<< HEAD
								new NoViableAltException("", 46, 4, input);
=======
								new NoViableAltException("", 48, 4, input);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
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
<<<<<<< HEAD
							new NoViableAltException("", 46, 2, input);
=======
							new NoViableAltException("", 48, 2, input);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:254:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2455); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2457);
					functionCall114=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup2459);
					dotProperty115=dotProperty();
=======
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:257:4: ^( DOTPROPERTY functionCall dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2489); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2491);
					functionCall120=functionCall();
					state._fsp--;

					pushFollow(FOLLOW_dotProperty_in_lookup2493);
					dotProperty121=dotProperty();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new DotPropertyNode(functionCall114, dotProperty115);
					}
					break;
				case 2 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:255:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2467); 
					match(input, Token.DOWN, null); 
					Identifier116=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2469); 
					pushFollow(FOLLOW_dotProperty_in_lookup2471);
					dotProperty117=dotProperty();
=======
					node = new DotPropertyNode(functionCall120, dotProperty121);
					}
					break;
				case 2 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:258:4: ^( DOTPROPERTY Identifier dotProperty )
					{
					match(input,DOTPROPERTY,FOLLOW_DOTPROPERTY_in_lookup2501); 
					match(input, Token.DOWN, null); 
					Identifier122=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2503); 
					pushFollow(FOLLOW_dotProperty_in_lookup2505);
					dotProperty123=dotProperty();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					state._fsp--;

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = new DotPropertyNode(new IdentifierNode((Identifier116!=null?Identifier116.getText():null), currentScope), dotProperty117);
					}
					break;
				case 3 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:261:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2495); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2497);
					functionCall118=functionCall();
					state._fsp--;

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:261:28: (i= indexes )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==INDEXES) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:261:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2501);
=======
					node = new DotPropertyNode(new IdentifierNode((Identifier122!=null?Identifier122.getText():null), currentScope), dotProperty123);
					}
					break;
				case 3 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:264:5: ^( LOOKUP functionCall (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2529); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup2531);
					functionCall124=functionCall();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:264:28: (i= indexes )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==INDEXES) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:264:28: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2535);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = i != null ? new LookupNode(functionCall118, i) : functionCall118;
					}
					break;
				case 4 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:262:6: ^( LOOKUP list (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2513); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup2515);
					list119=list();
					state._fsp--;

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:262:21: (i= indexes )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==INDEXES) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:262:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2519);
=======
					node = i != null ? new LookupNode(functionCall124, i) : functionCall124;
					}
					break;
				case 4 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:265:6: ^( LOOKUP list (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2547); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup2549);
					list125=list();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:265:21: (i= indexes )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==INDEXES) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:265:21: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2553);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = i != null ? new LookupNode(list119, i) : list119;
					}
					break;
				case 5 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:263:6: ^( LOOKUP expression (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2539); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup2541);
					expression120=expression();
					state._fsp--;

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:263:27: (i= indexes )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==INDEXES) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:263:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2545);
=======
					node = i != null ? new LookupNode(list125, i) : list125;
					}
					break;
				case 5 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:266:6: ^( LOOKUP expression (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2573); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup2575);
					expression126=expression();
					state._fsp--;

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:266:27: (i= indexes )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==INDEXES) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:266:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2579);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = i != null ? new LookupNode(expression120, i) : expression120;
					}
					break;
				case 6 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:264:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2559); 
					match(input, Token.DOWN, null); 
					Identifier121=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2561); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:264:27: (i= indexes )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==INDEXES) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:264:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2565);
=======
					node = i != null ? new LookupNode(expression126, i) : expression126;
					}
					break;
				case 6 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:267:6: ^( LOOKUP Identifier (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2593); 
					match(input, Token.DOWN, null); 
					Identifier127=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup2595); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:267:27: (i= indexes )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==INDEXES) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:267:27: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2599);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = i != null ? new LookupNode(new IdentifierNode((Identifier121!=null?Identifier121.getText():null), currentScope), i) : new IdentifierNode((Identifier121!=null?Identifier121.getText():null), currentScope);
					}
					break;
				case 7 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:265:6: ^( LOOKUP String (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2579); 
					match(input, Token.DOWN, null); 
					String122=(CommonTree)match(input,String,FOLLOW_String_in_lookup2581); 
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:265:23: (i= indexes )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==INDEXES) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:265:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2585);
=======
					node = i != null ? new LookupNode(new IdentifierNode((Identifier127!=null?Identifier127.getText():null), currentScope), i) : new IdentifierNode((Identifier127!=null?Identifier127.getText():null), currentScope);
					}
					break;
				case 7 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:268:6: ^( LOOKUP String (i= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup2613); 
					match(input, Token.DOWN, null); 
					String128=(CommonTree)match(input,String,FOLLOW_String_in_lookup2615); 
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:268:23: (i= indexes )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==INDEXES) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:268:23: i= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2619);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							i=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

<<<<<<< HEAD
					node = i != null ? new LookupNode(new AtomNode((String122!=null?String122.getText():null)), i) : new AtomNode((String122!=null?String122.getText():null));
=======
					node = i != null ? new LookupNode(new AtomNode((String128!=null?String128.getText():null)), i) : new AtomNode((String128!=null?String128.getText():null));
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "lookup"



	// $ANTLR start "indexes"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:275:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:278:1: indexes returns [java.util.List<DCNode> e] : ^( INDEXES ( expression )+ ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final java.util.List<DCNode> indexes() throws RecognitionException {
		java.util.List<DCNode> e = null;


<<<<<<< HEAD
		DCNode expression123 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:277:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:277:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes2635); 
			match(input, Token.DOWN, null); 
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:277:16: ( expression )+
			int cnt47=0;
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==Add||LA47_0==Bool||LA47_0==COLOR_CONSTANT||LA47_0==DOTPROPERTY||LA47_0==Divide||LA47_0==Equals||(LA47_0 >= GT && LA47_0 <= GTEquals)||LA47_0==HEIGHT_CONSTANT||LA47_0==In||LA47_0==LOOKUP||(LA47_0 >= LT && LA47_0 <= LTEquals)||LA47_0==Modulus||(LA47_0 >= Multiply && LA47_0 <= NEquals)||(LA47_0 >= Null && LA47_0 <= Number)||LA47_0==PI_CONSTANT||LA47_0==Pow||(LA47_0 >= Subtract && LA47_0 <= TERNARY)||(LA47_0 >= UNARY_MIN && LA47_0 <= WIDTH_CONSTANT)||LA47_0==135||LA47_0==138) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:277:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes2638);
					expression123=expression();
					state._fsp--;

					e.add(expression123);
=======
		DCNode expression129 =null;

		e = new java.util.ArrayList<DCNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:280:3: ( ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:280:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes2669); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:280:16: ( expression )+
			int cnt49=0;
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==Add||LA49_0==Bool||LA49_0==COLOR_CONSTANT||LA49_0==DOTPROPERTY||LA49_0==Divide||LA49_0==Equals||(LA49_0 >= GT && LA49_0 <= GTEquals)||LA49_0==HEIGHT_CONSTANT||LA49_0==In||LA49_0==LOOKUP||(LA49_0 >= LT && LA49_0 <= LTEquals)||LA49_0==Modulus||(LA49_0 >= Multiply && LA49_0 <= NEquals)||(LA49_0 >= Null && LA49_0 <= Number)||LA49_0==PI_CONSTANT||LA49_0==Pow||(LA49_0 >= Subtract && LA49_0 <= TERNARY)||LA49_0==UNARY_MIN||LA49_0==WIDTH_CONSTANT||LA49_0==140||LA49_0==143) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:280:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes2672);
					expression129=expression();
					state._fsp--;

					e.add(expression129);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

				default :
<<<<<<< HEAD
					if ( cnt47 >= 1 ) break loop47;
					EarlyExitException eee = new EarlyExitException(47, input);
					throw eee;
				}
				cnt47++;
=======
					if ( cnt49 >= 1 ) break loop49;
					EarlyExitException eee = new EarlyExitException(49, input);
					throw eee;
				}
				cnt49++;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "indexes"



	// $ANTLR start "dotProperty"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:282:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:285:2: dotProperty returns [java.util.List<PropertyNode> e] : ^( DOT ( dotExpression )+ ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final java.util.List<PropertyNode> dotProperty() throws RecognitionException {
		java.util.List<PropertyNode> e = null;


<<<<<<< HEAD
		PropertyNode dotExpression124 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:284:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:284:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty2676); 
			match(input, Token.DOWN, null); 
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:284:12: ( dotExpression )+
			int cnt48=0;
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( ((LA48_0 >= DotEnd && LA48_0 <= DotY)) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:284:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2679);
					dotExpression124=dotExpression();
					state._fsp--;

					e.add(dotExpression124);
=======
		PropertyNode dotExpression130 =null;

		e = new java.util.ArrayList<PropertyNode>();
		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:3: ( ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:6: ^( DOT ( dotExpression )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_dotProperty2710); 
			match(input, Token.DOWN, null); 
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:12: ( dotExpression )+
			int cnt50=0;
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( ((LA50_0 >= DotEnd && LA50_0 <= DotY)) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:13: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2713);
					dotExpression130=dotExpression();
					state._fsp--;

					e.add(dotExpression130);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

				default :
<<<<<<< HEAD
					if ( cnt48 >= 1 ) break loop48;
					EarlyExitException eee = new EarlyExitException(48, input);
					throw eee;
				}
				cnt48++;
=======
					if ( cnt50 >= 1 ) break loop50;
					EarlyExitException eee = new EarlyExitException(50, input);
					throw eee;
				}
				cnt50++;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "dotProperty"



	// $ANTLR start "dotExpression"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:287:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:290:3: dotExpression returns [PropertyNode node] : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PropertyNode dotExpression() throws RecognitionException {
		PropertyNode node = null;


		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:288:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			int alt49=11;
			switch ( input.LA(1) ) {
			case DotX:
				{
				alt49=1;
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:291:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			int alt51=11;
			switch ( input.LA(1) ) {
			case DotX:
				{
				alt51=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case DotY:
				{
<<<<<<< HEAD
				alt49=2;
=======
				alt51=2;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case DotStart:
				{
<<<<<<< HEAD
				alt49=3;
=======
				alt51=3;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case DotEnd:
				{
<<<<<<< HEAD
				alt49=4;
=======
				alt51=4;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case DotOrigin:
				{
<<<<<<< HEAD
				alt49=5;
=======
				alt51=5;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case DotRotation:
				{
<<<<<<< HEAD
				alt49=6;
=======
				alt51=6;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case DotWidth:
				{
<<<<<<< HEAD
				alt49=7;
=======
				alt51=7;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case DotHeight:
				{
<<<<<<< HEAD
				alt49=8;
=======
				alt51=8;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case DotFill:
				{
<<<<<<< HEAD
				alt49=9;
=======
				alt51=9;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case DotStroke:
				{
<<<<<<< HEAD
				alt49=10;
=======
				alt51=10;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case DotWeight:
				{
<<<<<<< HEAD
				alt49=11;
=======
				alt51=11;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			default:
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:288:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression2707); 
=======
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}
			switch (alt51) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:291:5: DotX
					{
					match(input,DotX,FOLLOW_DotX_in_dotExpression2741); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					node = new XPropertyNode();
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:289:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression2715); 
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:292:5: DotY
					{
					match(input,DotY,FOLLOW_DotY_in_dotExpression2749); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					node = new YPropertyNode();
					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:290:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression2723); 
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:293:5: DotStart
					{
					match(input,DotStart,FOLLOW_DotStart_in_dotExpression2757); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					node = new StartPropertyNode();
					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:291:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression2731); 
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:294:5: DotEnd
					{
					match(input,DotEnd,FOLLOW_DotEnd_in_dotExpression2765); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					node = new EndPropertyNode();
					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:292:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression2739); 
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:295:5: DotOrigin
					{
					match(input,DotOrigin,FOLLOW_DotOrigin_in_dotExpression2773); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					node = new OriginPropertyNode();
					}
					break;
				case 6 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:293:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression2747); 
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:296:5: DotRotation
					{
					match(input,DotRotation,FOLLOW_DotRotation_in_dotExpression2781); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					node = new RotationPropertyNode();
					}
					break;
				case 7 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:294:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression2755); 
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:297:5: DotWidth
					{
					match(input,DotWidth,FOLLOW_DotWidth_in_dotExpression2789); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					node = new WidthPropertyNode();
					}
					break;
				case 8 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:295:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression2763); 
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:298:5: DotHeight
					{
					match(input,DotHeight,FOLLOW_DotHeight_in_dotExpression2797); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					node = new HeightPropertyNode();
					}
					break;
				case 9 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:296:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression2771); 
					}
					break;
				case 10 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:297:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression2778); 
					}
					break;
				case 11 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:298:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression2785); 
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:299:5: DotFill
					{
					match(input,DotFill,FOLLOW_DotFill_in_dotExpression2805); 
					}
					break;
				case 10 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:300:5: DotStroke
					{
					match(input,DotStroke,FOLLOW_DotStroke_in_dotExpression2812); 
					}
					break;
				case 11 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/PogoTreeWalker.g:301:5: DotWeight
					{
					match(input,DotWeight,FOLLOW_DotWeight_in_dotExpression2819); 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "dotExpression"

	// Delegated rules



	public static final BitSet FOLLOW_block_in_walk64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block95 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STATEMENTS_in_block98 = new BitSet(new long[]{0x0000000000000004L});
<<<<<<< HEAD
	public static final BitSet FOLLOW_statement_in_block101 = new BitSet(new long[]{0x000A000000000018L,0x0001000000000020L,0x0000000000000040L});
=======
	public static final BitSet FOLLOW_statement_in_block101 = new BitSet(new long[]{0x00A0000000000048L,0x0010000000000200L,0x0000000000000400L});
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public static final BitSet FOLLOW_RETURN_in_block109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment218 = new BitSet(new long[]{0x0000000000000004L});
<<<<<<< HEAD
	public static final BitSet FOLLOW_Identifier_in_assignment220 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832244L,0x0000000000000498L});
	public static final BitSet FOLLOW_indexes_in_assignment222 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
=======
	public static final BitSet FOLLOW_Identifier_in_assignment220 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322440L,0x0000000000009146L});
	public static final BitSet FOLLOW_indexes_in_assignment222 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public static final BitSet FOLLOW_expression_in_assignment225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall252 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall254 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall256 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall268 = new BitSet(new long[]{0x0000000000000004L});
<<<<<<< HEAD
	public static final BitSet FOLLOW_Println_in_functionCall270 = new BitSet(new long[]{0x0030200004804848L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_functionCall272 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall285 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall287 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_functionCall289 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall304 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall306 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_functionCall308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall322 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall324 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
=======
	public static final BitSet FOLLOW_Println_in_functionCall270 = new BitSet(new long[]{0x0302000044012108L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_functionCall272 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall285 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall287 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_functionCall289 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall304 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall306 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_functionCall308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall322 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall324 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public static final BitSet FOLLOW_expression_in_functionCall326 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall342 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LAdd_in_functionCall344 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall346 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall359 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LRemove_in_functionCall361 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_functionCall363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall431 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall433 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall435 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Line_in_primitiveCall449 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall451 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall466 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall468 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall482 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall484 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall486 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall502 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall504 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall516 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall518 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall520 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall533 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Point_in_primitiveCall535 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall537 = new BitSet(new long[]{0x0000000000000008L});
<<<<<<< HEAD
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall549 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Shirt_in_primitiveCall551 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall553 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_primitiveCall565 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ShirtBack_in_primitiveCall567 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall569 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall596 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall598 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall600 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall614 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall616 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall618 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall631 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall633 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_transformCall635 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall646 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall648 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall650 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall661 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall663 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall665 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall678 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall680 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall682 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall693 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall695 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_transformCall697 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall707 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall709 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_transformCall711 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall723 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall725 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall736 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall738 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_transformCall740 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall750 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall752 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall754 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall765 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall767 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_transformCall769 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall779 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall781 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_transformCall783 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall793 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Scale_in_transformCall795 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall797 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall808 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall810 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_transformCall812 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall839 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall841 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_mathCall843 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall853 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall855 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_mathCall857 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall867 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Tan_in_mathCall869 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_mathCall871 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall881 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ATan_in_mathCall883 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_mathCall885 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall899 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Random_in_mathCall901 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall903 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall914 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Round_in_mathCall916 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_mathCall918 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall928 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Map_in_mathCall930 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall932 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall969 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetWidth_in_getCall971 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_getCall973 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall983 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetHeight_in_getCall985 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_getCall987 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall996 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetX_in_getCall998 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_getCall1000 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1009 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetY_in_getCall1011 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_getCall1013 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1022 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1024 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_getCall1026 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1035 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1037 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_getCall1039 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1048 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetFill_in_getCall1050 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_getCall1052 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1060 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1062 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_getCall1064 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1072 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStart_in_getCall1074 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_getCall1076 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1083 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1085 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_getCall1087 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1095 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1097 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1099 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement1136 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1138 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1142 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1148 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat1168 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat1170 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_ifStat1172 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat1191 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat1193 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_elseIfStat1195 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat1214 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat1216 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement1241 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1243 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_forStatement1247 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_forStatement1251 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_forStatement1253 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1277 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1279 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1283 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1287 = new BitSet(new long[]{0x0030200004804C40L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1292 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_repeatStatement1296 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement1319 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement1321 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_whileStatement1323 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList1350 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList1353 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000080L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList1383 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList1386 = new BitSet(new long[]{0x0030200004804848L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_TERNARY_in_expression1411 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1415 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1419 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1423 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression1434 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1438 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1442 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_138_in_expression1471 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1475 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1479 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_135_in_expression1506 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1510 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1514 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression1541 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1545 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1549 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression1576 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1580 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1584 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression1611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1615 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1619 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression1646 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1650 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1654 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression1681 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1685 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1689 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression1717 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1721 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1725 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression1753 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1757 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1761 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression1789 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1793 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1797 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression1825 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1829 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1833 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression1861 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1865 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1869 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression1897 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1901 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1905 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression1933 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1937 = new BitSet(new long[]{0x0030200004804840L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_expression_in_expression1941 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression1969 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1973 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression2008 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2012 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression2049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression2101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression2155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression2209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression2261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression2280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression2326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression2371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list2430 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list2432 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2455 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2457 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2459 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2467 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2469 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2471 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2495 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2497 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000040L});
	public static final BitSet FOLLOW_indexes_in_lookup2501 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2513 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup2515 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000040L});
	public static final BitSet FOLLOW_indexes_in_lookup2519 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2539 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup2541 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000040L});
	public static final BitSet FOLLOW_indexes_in_lookup2545 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2559 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2561 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000040L});
	public static final BitSet FOLLOW_indexes_in_lookup2565 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2579 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup2581 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000040L});
	public static final BitSet FOLLOW_indexes_in_lookup2585 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes2635 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes2638 = new BitSet(new long[]{0x0030200004804848L,0xC00001219C832204L,0x0000000000000498L});
	public static final BitSet FOLLOW_DOT_in_dotProperty2676 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2679 = new BitSet(new long[]{0x000000FFE0000008L});
	public static final BitSet FOLLOW_DotX_in_dotExpression2707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression2715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression2723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression2731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression2739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression2747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression2755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression2763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression2771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression2778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression2785 = new BitSet(new long[]{0x0000000000000002L});
=======
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall564 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Move_in_transformCall566 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall568 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall582 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall584 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall586 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall599 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Copy_in_transformCall601 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_transformCall603 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall614 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Rotate_in_transformCall616 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall618 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall629 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Fill_in_transformCall631 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall633 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall646 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Stroke_in_transformCall648 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall650 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall661 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoFill_in_transformCall663 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_transformCall665 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall675 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall677 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_transformCall679 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall689 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Weight_in_transformCall691 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall693 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall704 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Hide_in_transformCall706 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_transformCall708 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall718 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Group_in_transformCall720 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall722 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall733 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Expand_in_transformCall735 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_transformCall737 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall746 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Merge_in_transformCall748 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_transformCall750 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall759 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Scale_in_transformCall761 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall763 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall773 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall775 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_transformCall777 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall786 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall788 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_transformCall790 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall799 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Union_in_transformCall801 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall803 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall813 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Difference_in_transformCall815 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall817 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall827 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Clip_in_transformCall829 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall831 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_transformCall841 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Xor_in_transformCall843 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_transformCall845 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall873 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cosine_in_mathCall875 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_mathCall877 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall887 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Sine_in_mathCall889 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_mathCall891 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall901 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Tan_in_mathCall903 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_mathCall905 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall915 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ATan_in_mathCall917 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_mathCall919 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall933 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Random_in_mathCall935 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall937 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall948 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Round_in_mathCall950 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_mathCall952 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_mathCall962 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Map_in_mathCall964 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_mathCall966 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1003 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1005 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_getCall1007 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1017 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1019 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_getCall1021 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1030 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetX_in_getCall1032 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_getCall1034 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1043 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetY_in_getCall1045 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_getCall1047 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1056 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1058 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_getCall1060 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1069 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1071 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_getCall1073 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1082 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetFill_in_getCall1084 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_getCall1086 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1094 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1096 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_getCall1098 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1106 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetStart_in_getCall1108 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_getCall1110 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1117 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1119 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_getCall1121 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_getCall1129 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1131 = new BitSet(new long[]{0x0000200000000008L});
	public static final BitSet FOLLOW_exprList_in_getCall1133 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement1170 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1172 = new BitSet(new long[]{0x0000100000000008L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1176 = new BitSet(new long[]{0x0000100000000008L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1182 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStat1202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStat1204 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_ifStat1206 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseIfStat1225 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_elseIfStat1227 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_elseIfStat1229 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_elseStat1248 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elseStat1250 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement1275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1277 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_forStatement1281 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_forStatement1285 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_forStatement1287 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1311 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1313 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1317 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1321 = new BitSet(new long[]{0x0302000044013100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1326 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_repeatStatement1330 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileStatement1353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement1355 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_whileStatement1357 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList1384 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList1387 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000800L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList1417 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList1420 = new BitSet(new long[]{0x0302000044012108L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_TERNARY_in_expression1445 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1449 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1453 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1457 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression1468 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1472 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1476 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_143_in_expression1505 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1509 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1513 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_140_in_expression1540 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1544 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1548 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression1575 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1579 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1583 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression1610 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1614 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1618 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression1645 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1649 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1653 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression1680 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1684 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1688 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression1715 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1719 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1723 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression1751 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1755 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1759 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression1787 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1791 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1795 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression1823 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1827 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1831 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression1859 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1863 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1867 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression1895 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1899 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1903 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression1931 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1935 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1939 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression1967 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1971 = new BitSet(new long[]{0x0302000044012100L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_expression_in_expression1975 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression2003 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2007 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression2042 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2046 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression2083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression2135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression2189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression2243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_expression2295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_expression2314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_expression2360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_expression2405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_list2464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list2466 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2489 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2491 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2493 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTPROPERTY_in_lookup2501 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2503 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2505 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2529 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup2531 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_indexes_in_lookup2535 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2547 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup2549 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_indexes_in_lookup2553 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2573 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup2575 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_indexes_in_lookup2579 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2593 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup2595 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_indexes_in_lookup2599 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup2613 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup2615 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_indexes_in_lookup2619 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes2669 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes2672 = new BitSet(new long[]{0x0302000044012108L,0x00001219C8322040L,0x0000000000009146L});
	public static final BitSet FOLLOW_DOT_in_dotProperty2710 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2713 = new BitSet(new long[]{0x00000FFE00000008L});
	public static final BitSet FOLLOW_DotX_in_dotExpression2741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotY_in_dotExpression2749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStart_in_dotExpression2757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotEnd_in_dotExpression2765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotOrigin_in_dotExpression2773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotRotation_in_dotExpression2781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWidth_in_dotExpression2789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotHeight_in_dotExpression2797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotFill_in_dotExpression2805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotStroke_in_dotExpression2812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DotWeight_in_dotExpression2819 = new BitSet(new long[]{0x0000000000000002L});
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
}
