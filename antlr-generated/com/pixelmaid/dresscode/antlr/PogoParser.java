<<<<<<< HEAD
// $ANTLR 3.5 /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-05-13 15:35:12
=======
// $ANTLR 3.5 /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g 2013-04-27 23:50:34
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

  package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import java.util.Map;
  import java.util.HashMap;
  import com.pixelmaid.dresscode.data.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PogoParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PogoParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PogoParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PogoParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g"; }


	  public Map<String, FunctionType> functions = new HashMap<String, FunctionType>();
	  public DrawableManager drawableManager;
	  private int widthParam, heightParam;
	  
	  public PogoParser(CommonTokenStream tokens){
	  	super(tokens);

	  }
	  private void defineFunction(String id, Object idList, Object block) {

	    // `idList` is possibly null! Create an empty tree in that case. 
	    CommonTree idListTree = idList == null ? new CommonTree() : (CommonTree)idList;

	    // `block` is never null.
	    CommonTree blockTree = (CommonTree)block;

	    // The function name with the number of parameters after it the unique key
	    String key = id + idListTree.getChildCount();
	    functions.put(key, new FunctionType(id, idListTree, blockTree));
	    System.out.println("defined function:"+id);
	  }


	public static class parse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parse"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:72:1: parse : block EOF -> block ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:75:1: parse : block EOF -> block ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.parse_return parse() throws RecognitionException {
		PogoParser.parse_return retval = new PogoParser.parse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope block1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:73:3: ( block EOF -> block )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:73:6: block EOF
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:76:3: ( block EOF -> block )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:76:6: block EOF
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			pushFollow(FOLLOW_block_in_parse187);
			block1=block();
			state._fsp--;

			stream_block.add(block1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse189);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 76:16: -> block
			{
				adaptor.addChild(root_0, stream_block.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parse"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:76:1: block : ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:79:1: block : ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.block_return block() throws RecognitionException {
		PogoParser.block_return retval = new PogoParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Return5=null;
		Token char_literal7=null;
		ParserRuleReturnScope statement3 =null;
		ParserRuleReturnScope functionDecl4 =null;
		ParserRuleReturnScope expression6 =null;

		Object Return5_tree=null;
		Object char_literal7_tree=null;
<<<<<<< HEAD
		RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
=======
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
		RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:5: ( statement | functionDecl )* ( Return expression ';' )?
			{
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:5: ( statement | functionDecl )*
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:5: ( statement | functionDecl )* ( Return expression ';' )?
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:5: ( statement | functionDecl )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
<<<<<<< HEAD
				if ( (LA1_0==ATan||LA1_0==Assert||(LA1_0 >= Copy && LA1_0 <= Curve)||LA1_0==Ellipse||LA1_0==Expand||(LA1_0 >= Fill && LA1_0 <= For)||(LA1_0 >= GetDistance && LA1_0 <= Group)||LA1_0==Hide||(LA1_0 >= Identifier && LA1_0 <= If)||LA1_0==LAdd||(LA1_0 >= LRemove && LA1_0 <= LShape)||(LA1_0 >= Line && LA1_0 <= MirrorX)||(LA1_0 >= Move && LA1_0 <= MoveBy)||(LA1_0 >= NoFill && LA1_0 <= NoStroke)||(LA1_0 >= Point && LA1_0 <= Polygon)||(LA1_0 >= Print && LA1_0 <= Println)||(LA1_0 >= Random && LA1_0 <= Repeat)||(LA1_0 >= Rotate && LA1_0 <= Round)||(LA1_0 >= Scale && LA1_0 <= Size)||LA1_0==Stroke||LA1_0==Tan||(LA1_0 >= Weight && LA1_0 <= While)||LA1_0==136) ) {
=======
				if ( (LA1_0==ATan||LA1_0==Assert||LA1_0==Clip||(LA1_0 >= Copy && LA1_0 <= Curve)||LA1_0==Difference||LA1_0==Ellipse||LA1_0==Expand||(LA1_0 >= Fill && LA1_0 <= For)||(LA1_0 >= GetDistance && LA1_0 <= Group)||LA1_0==Hide||(LA1_0 >= Identifier && LA1_0 <= If)||LA1_0==LAdd||(LA1_0 >= LRemove && LA1_0 <= LShape)||(LA1_0 >= Line && LA1_0 <= MirrorY)||(LA1_0 >= Move && LA1_0 <= MoveBy)||(LA1_0 >= NoFill && LA1_0 <= NoStroke)||(LA1_0 >= Point && LA1_0 <= Polygon)||(LA1_0 >= Print && LA1_0 <= Println)||(LA1_0 >= Random && LA1_0 <= Repeat)||(LA1_0 >= Rotate && LA1_0 <= Round)||(LA1_0 >= Scale && LA1_0 <= Size)||LA1_0==Stroke||LA1_0==Tan||LA1_0==Union||(LA1_0 >= Weight && LA1_0 <= Xor)||LA1_0==141) ) {
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					alt1=1;
				}
				else if ( (LA1_0==Def) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:6: statement
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:6: statement
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					pushFollow(FOLLOW_statement_in_block207);
					statement3=statement();
					state._fsp--;

					stream_statement.add(statement3.getTree());
					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:18: functionDecl
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:18: functionDecl
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					pushFollow(FOLLOW_functionDecl_in_block211);
					functionDecl4=functionDecl();
					state._fsp--;

					stream_functionDecl.add(functionDecl4.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:33: ( Return expression ';' )?
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:33: ( Return expression ';' )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Return) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:77:34: Return expression ';'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:80:34: Return expression ';'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					Return5=(Token)match(input,Return,FOLLOW_Return_in_block216);  
					stream_Return.add(Return5);

					pushFollow(FOLLOW_expression_in_block218);
					expression6=expression();
					state._fsp--;

					stream_expression.add(expression6.getTree());
<<<<<<< HEAD
					char_literal7=(Token)match(input,136,FOLLOW_136_in_block205);  
					stream_136.add(char_literal7);
=======
					char_literal7=(Token)match(input,141,FOLLOW_141_in_block220);  
					stream_141.add(char_literal7);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;

			}

			// AST REWRITE
			// elements: expression, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 81:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:78:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:78:17: ^( STATEMENTS ( statement )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:78:30: ( statement )*
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:17: ^( STATEMENTS ( statement )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:30: ( statement )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:78:42: ^( RETURN ( expression )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:78:51: ( expression )?
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:42: ^( RETURN ( expression )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:51: ( expression )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_2, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:81:1: statement : ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:1: statement : ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.statement_return statement() throws RecognitionException {
		PogoParser.statement_return retval = new PogoParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal9=null;
		Token char_literal11=null;
		ParserRuleReturnScope assignment8 =null;
		ParserRuleReturnScope functionCall10 =null;
		ParserRuleReturnScope ifStatement12 =null;
		ParserRuleReturnScope forStatement13 =null;
		ParserRuleReturnScope whileStatement14 =null;
		ParserRuleReturnScope repeatStatement15 =null;

		Object char_literal9_tree=null;
		Object char_literal11_tree=null;
<<<<<<< HEAD
		RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
=======
		RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:82:3: ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement )
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:85:3: ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | repeatStatement )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int alt3=6;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1==OParen) ) {
					alt3=2;
				}
				else if ( (LA3_1==Assign||LA3_1==OBracket) ) {
					alt3=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
<<<<<<< HEAD
			case 136:
=======
			case 141:
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				{
				alt3=1;
				}
				break;
			case ATan:
			case Assert:
			case Clip:
			case Copy:
			case Cosine:
			case Curve:
			case Difference:
			case Ellipse:
			case Expand:
			case Fill:
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
			case Group:
			case Hide:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Map:
			case Merge:
			case MirrorX:
			case MirrorY:
			case Move:
			case MoveBy:
			case NoFill:
			case NoStroke:
			case Point:
			case Polygon:
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case Shirt:
			case ShirtBack:
			case Sine:
			case Size:
			case Stroke:
			case Tan:
			case Union:
			case Weight:
			case Xor:
				{
				alt3=2;
				}
				break;
			case If:
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
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:82:6: assignment ';'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:85:6: assignment ';'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					pushFollow(FOLLOW_assignment_in_statement262);
					assignment8=assignment();
					state._fsp--;

					stream_assignment.add(assignment8.getTree());
<<<<<<< HEAD
					char_literal9=(Token)match(input,136,FOLLOW_136_in_statement249);  
					stream_136.add(char_literal9);
=======
					char_literal9=(Token)match(input,141,FOLLOW_141_in_statement264);  
					stream_141.add(char_literal9);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: assignment
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 85:23: -> assignment
					{
						adaptor.addChild(root_0, stream_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:83:6: functionCall ';'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:86:6: functionCall ';'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					pushFollow(FOLLOW_functionCall_in_statement277);
					functionCall10=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall10.getTree());
<<<<<<< HEAD
					char_literal11=(Token)match(input,136,FOLLOW_136_in_statement264);  
					stream_136.add(char_literal11);
=======
					char_literal11=(Token)match(input,141,FOLLOW_141_in_statement279);  
					stream_141.add(char_literal11);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: functionCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 86:24: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:84:6: ifStatement
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:87:6: ifStatement
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement291);
					ifStatement12=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement12.getTree());

					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:85:6: forStatement
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:88:6: forStatement
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement298);
					forStatement13=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement13.getTree());

					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:86:6: whileStatement
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:89:6: whileStatement
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement305);
					whileStatement14=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement14.getTree());

					}
					break;
				case 6 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:87:6: repeatStatement
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:6: repeatStatement
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_repeatStatement_in_statement312);
					repeatStatement15=repeatStatement();
					state._fsp--;

					adaptor.addChild(root_0, repeatStatement15.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:90:1: assignment : ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |);
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:93:1: assignment : ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.assignment_return assignment() throws RecognitionException {
		PogoParser.assignment_return retval = new PogoParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier16=null;
		Token char_literal18=null;
		ParserRuleReturnScope indexes17 =null;
		ParserRuleReturnScope expression19 =null;

		Object Identifier16_tree=null;
		Object char_literal18_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:3: ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |)
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:3: ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) |)
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Identifier) ) {
				alt5=1;
			}
<<<<<<< HEAD
			else if ( (LA5_0==136) ) {
=======
			else if ( (LA5_0==141) ) {
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:6: Identifier ( indexes )? '=' expression
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:6: Identifier ( indexes )? '=' expression
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment326);  
					stream_Identifier.add(Identifier16);

<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:17: ( indexes )?
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:17: ( indexes )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==OBracket) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:17: indexes
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:17: indexes
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							pushFollow(FOLLOW_indexes_in_assignment328);
							indexes17=indexes();
							state._fsp--;

							stream_indexes.add(indexes17.getTree());
							}
							break;

					}

					char_literal18=(Token)match(input,Assign,FOLLOW_Assign_in_assignment331);  
					stream_Assign.add(char_literal18);

					pushFollow(FOLLOW_expression_in_assignment333);
					expression19=expression();
					state._fsp--;

					stream_expression.add(expression19.getTree());
					// AST REWRITE
<<<<<<< HEAD
					// elements: indexes, expression, Identifier
=======
					// elements: expression, Identifier, indexes
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 94:42: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:45: ^( ASSIGNMENT Identifier ( indexes )? expression )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:45: ^( ASSIGNMENT Identifier ( indexes )? expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:91:69: ( indexes )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:94:69: ( indexes )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:93:3: 
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:3: 
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class functionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:95:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall | getCall );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:98:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall | getCall );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.functionCall_return functionCall() throws RecognitionException {
		PogoParser.functionCall_return retval = new PogoParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier20=null;
		Token char_literal21=null;
		Token char_literal23=null;
		Token Println24=null;
		Token char_literal25=null;
		Token char_literal27=null;
		Token Print28=null;
		Token char_literal29=null;
		Token char_literal31=null;
		Token Assert32=null;
		Token char_literal33=null;
		Token char_literal35=null;
		Token Size36=null;
		Token char_literal37=null;
		Token char_literal39=null;
		Token LAdd40=null;
		Token char_literal41=null;
		Token char_literal43=null;
		Token LRemove44=null;
		Token char_literal45=null;
		Token char_literal47=null;
		ParserRuleReturnScope exprList22 =null;
		ParserRuleReturnScope expression26 =null;
		ParserRuleReturnScope expression30 =null;
		ParserRuleReturnScope expression34 =null;
		ParserRuleReturnScope expression38 =null;
		ParserRuleReturnScope exprList42 =null;
		ParserRuleReturnScope exprList46 =null;
		ParserRuleReturnScope primitiveCall48 =null;
		ParserRuleReturnScope transformCall49 =null;
		ParserRuleReturnScope mathCall50 =null;
		ParserRuleReturnScope getCall51 =null;

		Object Identifier20_tree=null;
		Object char_literal21_tree=null;
		Object char_literal23_tree=null;
		Object Println24_tree=null;
		Object char_literal25_tree=null;
		Object char_literal27_tree=null;
		Object Print28_tree=null;
		Object char_literal29_tree=null;
		Object char_literal31_tree=null;
		Object Assert32_tree=null;
		Object char_literal33_tree=null;
		Object char_literal35_tree=null;
		Object Size36_tree=null;
		Object char_literal37_tree=null;
		Object char_literal39_tree=null;
		Object LAdd40_tree=null;
		Object char_literal41_tree=null;
		Object char_literal43_tree=null;
		Object LRemove44_tree=null;
		Object char_literal45_tree=null;
		Object char_literal47_tree=null;
		RewriteRuleTokenStream stream_Println=new RewriteRuleTokenStream(adaptor,"token Println");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_LRemove=new RewriteRuleTokenStream(adaptor,"token LRemove");
		RewriteRuleTokenStream stream_LAdd=new RewriteRuleTokenStream(adaptor,"token LAdd");
		RewriteRuleTokenStream stream_Assert=new RewriteRuleTokenStream(adaptor,"token Assert");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Print=new RewriteRuleTokenStream(adaptor,"token Print");
		RewriteRuleTokenStream stream_Size=new RewriteRuleTokenStream(adaptor,"token Size");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall | getCall )
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) | LAdd '(' ( exprList )? ')' -> ^( FUNC_CALL LAdd ( exprList )? ) | LRemove '(' ( exprList )? ')' -> ^( FUNC_CALL LRemove ( exprList )? ) | primitiveCall | transformCall | mathCall | getCall )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			int alt10=11;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt10=1;
				}
				break;
			case Println:
				{
				alt10=2;
				}
				break;
			case Print:
				{
				alt10=3;
				}
				break;
			case Assert:
				{
				alt10=4;
				}
				break;
			case Size:
				{
				alt10=5;
				}
				break;
			case LAdd:
				{
				alt10=6;
				}
				break;
			case LRemove:
				{
				alt10=7;
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
				alt10=8;
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
				alt10=9;
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
				alt10=10;
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
				alt10=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:6: Identifier '(' ( exprList )? ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:6: Identifier '(' ( exprList )? ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall367);  
					stream_Identifier.add(Identifier20);

					char_literal21=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall369);  
					stream_OParen.add(char_literal21);

<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:21: ( exprList )?
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:21: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ATan||LA6_0==Assert||LA6_0==Bool||LA6_0==COLOR_CONSTANT||LA6_0==Clip||(LA6_0 >= Copy && LA6_0 <= Curve)||LA6_0==Difference||LA6_0==Ellipse||(LA6_0 >= Excl && LA6_0 <= Expand)||LA6_0==Fill||(LA6_0 >= GetDistance && LA6_0 <= Hide)||LA6_0==Identifier||LA6_0==LAdd||(LA6_0 >= LRemove && LA6_0 <= LShape)||(LA6_0 >= Line && LA6_0 <= MirrorY)||(LA6_0 >= Move && LA6_0 <= MoveBy)||(LA6_0 >= NoFill && LA6_0 <= Number)||(LA6_0 >= OBracket && LA6_0 <= OParen)||(LA6_0 >= PI_CONSTANT && LA6_0 <= Polygon)||(LA6_0 >= Print && LA6_0 <= Println)||(LA6_0 >= Random && LA6_0 <= Rect)||(LA6_0 >= Rotate && LA6_0 <= Round)||(LA6_0 >= Scale && LA6_0 <= Size)||(LA6_0 >= String && LA6_0 <= Subtract)||LA6_0==Tan||(LA6_0 >= Union && LA6_0 <= Weight)||LA6_0==Xor) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:21: exprList
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:21: exprList
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							pushFollow(FOLLOW_exprList_in_functionCall371);
							exprList22=exprList();
							state._fsp--;

							stream_exprList.add(exprList22.getTree());
							}
							break;

					}

					char_literal23=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall374);  
					stream_CParen.add(char_literal23);

					// AST REWRITE
					// elements: exprList, Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 99:35: -> ^( FUNC_CALL Identifier ( exprList )? )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:38: ^( FUNC_CALL Identifier ( exprList )? )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:38: ^( FUNC_CALL Identifier ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:96:61: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:61: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:6: Println '(' ( expression )? ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:6: Println '(' ( expression )? ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					Println24=(Token)match(input,Println,FOLLOW_Println_in_functionCall392);  
					stream_Println.add(Println24);

					char_literal25=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall394);  
					stream_OParen.add(char_literal25);

<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:18: ( expression )?
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:18: ( expression )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==ATan||LA7_0==Assert||LA7_0==Bool||LA7_0==COLOR_CONSTANT||LA7_0==Clip||(LA7_0 >= Copy && LA7_0 <= Curve)||LA7_0==Difference||LA7_0==Ellipse||(LA7_0 >= Excl && LA7_0 <= Expand)||LA7_0==Fill||(LA7_0 >= GetDistance && LA7_0 <= Hide)||LA7_0==Identifier||LA7_0==LAdd||(LA7_0 >= LRemove && LA7_0 <= LShape)||(LA7_0 >= Line && LA7_0 <= MirrorY)||(LA7_0 >= Move && LA7_0 <= MoveBy)||(LA7_0 >= NoFill && LA7_0 <= Number)||(LA7_0 >= OBracket && LA7_0 <= OParen)||(LA7_0 >= PI_CONSTANT && LA7_0 <= Polygon)||(LA7_0 >= Print && LA7_0 <= Println)||(LA7_0 >= Random && LA7_0 <= Rect)||(LA7_0 >= Rotate && LA7_0 <= Round)||(LA7_0 >= Scale && LA7_0 <= Size)||(LA7_0 >= String && LA7_0 <= Subtract)||LA7_0==Tan||(LA7_0 >= Union && LA7_0 <= Weight)||LA7_0==Xor) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:18: expression
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:18: expression
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							pushFollow(FOLLOW_expression_in_functionCall396);
							expression26=expression();
							state._fsp--;

							stream_expression.add(expression26.getTree());
							}
							break;

					}

					char_literal27=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall399);  
					stream_CParen.add(char_literal27);

					// AST REWRITE
					// elements: Println, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 100:35: -> ^( FUNC_CALL Println ( expression )? )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:38: ^( FUNC_CALL Println ( expression )? )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:38: ^( FUNC_CALL Println ( expression )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Println.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:97:58: ( expression )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:58: ( expression )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:98:6: Print '(' expression ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:6: Print '(' expression ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					Print28=(Token)match(input,Print,FOLLOW_Print_in_functionCall418);  
					stream_Print.add(Print28);

					char_literal29=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall420);  
					stream_OParen.add(char_literal29);

					pushFollow(FOLLOW_expression_in_functionCall422);
					expression30=expression();
					state._fsp--;

					stream_expression.add(expression30.getTree());
					char_literal31=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall424);  
					stream_CParen.add(char_literal31);

					// AST REWRITE
					// elements: expression, Print
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 101:35: -> ^( FUNC_CALL Print expression )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:98:38: ^( FUNC_CALL Print expression )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:38: ^( FUNC_CALL Print expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Print.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:6: Assert '(' expression ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:6: Assert '(' expression ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					Assert32=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall445);  
					stream_Assert.add(Assert32);

					char_literal33=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall447);  
					stream_OParen.add(char_literal33);

					pushFollow(FOLLOW_expression_in_functionCall449);
					expression34=expression();
					state._fsp--;

					stream_expression.add(expression34.getTree());
					char_literal35=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall451);  
					stream_CParen.add(char_literal35);

					// AST REWRITE
					// elements: Assert, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 102:35: -> ^( FUNC_CALL Assert expression )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:99:38: ^( FUNC_CALL Assert expression )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:38: ^( FUNC_CALL Assert expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Assert.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:6: Size '(' expression ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:6: Size '(' expression ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					Size36=(Token)match(input,Size,FOLLOW_Size_in_functionCall471);  
					stream_Size.add(Size36);

					char_literal37=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall473);  
					stream_OParen.add(char_literal37);

					pushFollow(FOLLOW_expression_in_functionCall475);
					expression38=expression();
					state._fsp--;

					stream_expression.add(expression38.getTree());
					char_literal39=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall477);  
					stream_CParen.add(char_literal39);

					// AST REWRITE
					// elements: expression, Size
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 103:35: -> ^( FUNC_CALL Size expression )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:100:38: ^( FUNC_CALL Size expression )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:38: ^( FUNC_CALL Size expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Size.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:6: LAdd '(' ( exprList )? ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:6: LAdd '(' ( exprList )? ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					LAdd40=(Token)match(input,LAdd,FOLLOW_LAdd_in_functionCall499);  
					stream_LAdd.add(LAdd40);

					char_literal41=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall501);  
					stream_OParen.add(char_literal41);

<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:15: ( exprList )?
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:15: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==ATan||LA8_0==Assert||LA8_0==Bool||LA8_0==COLOR_CONSTANT||LA8_0==Clip||(LA8_0 >= Copy && LA8_0 <= Curve)||LA8_0==Difference||LA8_0==Ellipse||(LA8_0 >= Excl && LA8_0 <= Expand)||LA8_0==Fill||(LA8_0 >= GetDistance && LA8_0 <= Hide)||LA8_0==Identifier||LA8_0==LAdd||(LA8_0 >= LRemove && LA8_0 <= LShape)||(LA8_0 >= Line && LA8_0 <= MirrorY)||(LA8_0 >= Move && LA8_0 <= MoveBy)||(LA8_0 >= NoFill && LA8_0 <= Number)||(LA8_0 >= OBracket && LA8_0 <= OParen)||(LA8_0 >= PI_CONSTANT && LA8_0 <= Polygon)||(LA8_0 >= Print && LA8_0 <= Println)||(LA8_0 >= Random && LA8_0 <= Rect)||(LA8_0 >= Rotate && LA8_0 <= Round)||(LA8_0 >= Scale && LA8_0 <= Size)||(LA8_0 >= String && LA8_0 <= Subtract)||LA8_0==Tan||(LA8_0 >= Union && LA8_0 <= Weight)||LA8_0==Xor) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:15: exprList
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:15: exprList
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							pushFollow(FOLLOW_exprList_in_functionCall503);
							exprList42=exprList();
							state._fsp--;

							stream_exprList.add(exprList42.getTree());
							}
							break;

					}

					char_literal43=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall506);  
					stream_CParen.add(char_literal43);

					// AST REWRITE
					// elements: LAdd, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 104:31: -> ^( FUNC_CALL LAdd ( exprList )? )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:34: ^( FUNC_CALL LAdd ( exprList )? )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:34: ^( FUNC_CALL LAdd ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LAdd.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:101:51: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:51: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:6: LRemove '(' ( exprList )? ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:6: LRemove '(' ( exprList )? ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					LRemove44=(Token)match(input,LRemove,FOLLOW_LRemove_in_functionCall527);  
					stream_LRemove.add(LRemove44);

					char_literal45=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall529);  
					stream_OParen.add(char_literal45);

<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:18: ( exprList )?
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:18: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==ATan||LA9_0==Assert||LA9_0==Bool||LA9_0==COLOR_CONSTANT||LA9_0==Clip||(LA9_0 >= Copy && LA9_0 <= Curve)||LA9_0==Difference||LA9_0==Ellipse||(LA9_0 >= Excl && LA9_0 <= Expand)||LA9_0==Fill||(LA9_0 >= GetDistance && LA9_0 <= Hide)||LA9_0==Identifier||LA9_0==LAdd||(LA9_0 >= LRemove && LA9_0 <= LShape)||(LA9_0 >= Line && LA9_0 <= MirrorY)||(LA9_0 >= Move && LA9_0 <= MoveBy)||(LA9_0 >= NoFill && LA9_0 <= Number)||(LA9_0 >= OBracket && LA9_0 <= OParen)||(LA9_0 >= PI_CONSTANT && LA9_0 <= Polygon)||(LA9_0 >= Print && LA9_0 <= Println)||(LA9_0 >= Random && LA9_0 <= Rect)||(LA9_0 >= Rotate && LA9_0 <= Round)||(LA9_0 >= Scale && LA9_0 <= Size)||(LA9_0 >= String && LA9_0 <= Subtract)||LA9_0==Tan||(LA9_0 >= Union && LA9_0 <= Weight)||LA9_0==Xor) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:18: exprList
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:18: exprList
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							pushFollow(FOLLOW_exprList_in_functionCall531);
							exprList46=exprList();
							state._fsp--;

							stream_exprList.add(exprList46.getTree());
							}
							break;

					}

					char_literal47=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall534);  
					stream_CParen.add(char_literal47);

					// AST REWRITE
					// elements: LRemove, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 105:34: -> ^( FUNC_CALL LRemove ( exprList )? )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:37: ^( FUNC_CALL LRemove ( exprList )? )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:37: ^( FUNC_CALL LRemove ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LRemove.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:102:57: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:57: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:103:6: primitiveCall
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:6: primitiveCall
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primitiveCall_in_functionCall555);
					primitiveCall48=primitiveCall();
					state._fsp--;

					adaptor.addChild(root_0, primitiveCall48.getTree());

					}
					break;
				case 9 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:104:6: transformCall
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:107:6: transformCall
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_transformCall_in_functionCall562);
					transformCall49=transformCall();
					state._fsp--;

					adaptor.addChild(root_0, transformCall49.getTree());

					}
					break;
				case 10 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:105:6: mathCall
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:108:6: mathCall
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_mathCall_in_functionCall569);
					mathCall50=mathCall();
					state._fsp--;

					adaptor.addChild(root_0, mathCall50.getTree());

					}
					break;
				case 11 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:106:5: getCall
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:109:5: getCall
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_getCall_in_functionCall575);
					getCall51=getCall();
					state._fsp--;

					adaptor.addChild(root_0, getCall51.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class primitiveCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primitiveCall"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:110:3: primitiveCall : ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) | Shirt '(' ( exprList )? ')' -> ^( FUNC_CALL Shirt ( exprList )? ) | ShirtBack '(' ( exprList )? ')' -> ^( FUNC_CALL ShirtBack ( exprList )? ) );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:3: primitiveCall : ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.primitiveCall_return primitiveCall() throws RecognitionException {
		PogoParser.primitiveCall_return retval = new PogoParser.primitiveCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Ellipse52=null;
		Token char_literal53=null;
		Token char_literal55=null;
		Token Line56=null;
		Token char_literal57=null;
		Token char_literal59=null;
		Token Rect60=null;
		Token char_literal61=null;
		Token char_literal63=null;
		Token Curve64=null;
		Token char_literal65=null;
		Token char_literal67=null;
		Token Polygon68=null;
		Token char_literal69=null;
		Token char_literal71=null;
		Token LShape72=null;
		Token char_literal73=null;
		Token char_literal75=null;
		Token Point76=null;
		Token char_literal77=null;
		Token char_literal79=null;
		Token Shirt80=null;
		Token char_literal81=null;
		Token char_literal83=null;
		Token ShirtBack84=null;
		Token char_literal85=null;
		Token char_literal87=null;
		ParserRuleReturnScope exprList54 =null;
		ParserRuleReturnScope exprList58 =null;
		ParserRuleReturnScope exprList62 =null;
		ParserRuleReturnScope exprList66 =null;
		ParserRuleReturnScope exprList70 =null;
		ParserRuleReturnScope exprList74 =null;
		ParserRuleReturnScope exprList78 =null;
		ParserRuleReturnScope exprList82 =null;
		ParserRuleReturnScope exprList86 =null;

		Object Ellipse52_tree=null;
		Object char_literal53_tree=null;
		Object char_literal55_tree=null;
		Object Line56_tree=null;
		Object char_literal57_tree=null;
		Object char_literal59_tree=null;
		Object Rect60_tree=null;
		Object char_literal61_tree=null;
		Object char_literal63_tree=null;
		Object Curve64_tree=null;
		Object char_literal65_tree=null;
		Object char_literal67_tree=null;
		Object Polygon68_tree=null;
		Object char_literal69_tree=null;
		Object char_literal71_tree=null;
		Object LShape72_tree=null;
		Object char_literal73_tree=null;
		Object char_literal75_tree=null;
		Object Point76_tree=null;
		Object char_literal77_tree=null;
		Object char_literal79_tree=null;
		Object Shirt80_tree=null;
		Object char_literal81_tree=null;
		Object char_literal83_tree=null;
		Object ShirtBack84_tree=null;
		Object char_literal85_tree=null;
		Object char_literal87_tree=null;
		RewriteRuleTokenStream stream_Polygon=new RewriteRuleTokenStream(adaptor,"token Polygon");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_LShape=new RewriteRuleTokenStream(adaptor,"token LShape");
		RewriteRuleTokenStream stream_Rect=new RewriteRuleTokenStream(adaptor,"token Rect");
		RewriteRuleTokenStream stream_Shirt=new RewriteRuleTokenStream(adaptor,"token Shirt");
		RewriteRuleTokenStream stream_Curve=new RewriteRuleTokenStream(adaptor,"token Curve");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_ShirtBack=new RewriteRuleTokenStream(adaptor,"token ShirtBack");
		RewriteRuleTokenStream stream_Line=new RewriteRuleTokenStream(adaptor,"token Line");
		RewriteRuleTokenStream stream_Ellipse=new RewriteRuleTokenStream(adaptor,"token Ellipse");
		RewriteRuleTokenStream stream_Point=new RewriteRuleTokenStream(adaptor,"token Point");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:4: ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) | Shirt '(' ( exprList )? ')' -> ^( FUNC_CALL Shirt ( exprList )? ) | ShirtBack '(' ( exprList )? ')' -> ^( FUNC_CALL ShirtBack ( exprList )? ) )
			int alt20=9;
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:4: ( Ellipse '(' ( exprList )? ')' -> ^( FUNC_CALL Ellipse ( exprList )? ) | Line '(' ( exprList )? ')' -> ^( FUNC_CALL Line ( exprList )? ) | Rect '(' ( exprList )? ')' -> ^( FUNC_CALL Rect ( exprList )? ) | Curve '(' ( exprList )? ')' -> ^( FUNC_CALL Curve ( exprList )? ) | Polygon '(' ( exprList )? ')' -> ^( FUNC_CALL Polygon ( exprList )? ) | LShape '(' ( exprList )? ')' -> ^( FUNC_CALL LShape ( exprList )? ) | Point '(' ( exprList )? ')' -> ^( FUNC_CALL Point ( exprList )? ) )
			int alt18=7;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			switch ( input.LA(1) ) {
			case Ellipse:
				{
				alt20=1;
				}
				break;
			case Line:
				{
				alt20=2;
				}
				break;
			case Rect:
				{
				alt20=3;
				}
				break;
			case Curve:
				{
				alt20=4;
				}
				break;
			case Polygon:
				{
				alt20=5;
				}
				break;
			case LShape:
				{
				alt20=6;
				}
				break;
			case Point:
				{
				alt20=7;
				}
				break;
			case Shirt:
				{
				alt20=8;
				}
				break;
			case ShirtBack:
				{
				alt20=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:5: Ellipse '(' ( exprList )? ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:5: Ellipse '(' ( exprList )? ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					Ellipse52=(Token)match(input,Ellipse,FOLLOW_Ellipse_in_primitiveCall595);  
					stream_Ellipse.add(Ellipse52);

					char_literal53=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall597);  
					stream_OParen.add(char_literal53);

<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:17: ( exprList )?
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:17: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ATan||LA11_0==Assert||LA11_0==Bool||LA11_0==COLOR_CONSTANT||LA11_0==Clip||(LA11_0 >= Copy && LA11_0 <= Curve)||LA11_0==Difference||LA11_0==Ellipse||(LA11_0 >= Excl && LA11_0 <= Expand)||LA11_0==Fill||(LA11_0 >= GetDistance && LA11_0 <= Hide)||LA11_0==Identifier||LA11_0==LAdd||(LA11_0 >= LRemove && LA11_0 <= LShape)||(LA11_0 >= Line && LA11_0 <= MirrorY)||(LA11_0 >= Move && LA11_0 <= MoveBy)||(LA11_0 >= NoFill && LA11_0 <= Number)||(LA11_0 >= OBracket && LA11_0 <= OParen)||(LA11_0 >= PI_CONSTANT && LA11_0 <= Polygon)||(LA11_0 >= Print && LA11_0 <= Println)||(LA11_0 >= Random && LA11_0 <= Rect)||(LA11_0 >= Rotate && LA11_0 <= Round)||(LA11_0 >= Scale && LA11_0 <= Size)||(LA11_0 >= String && LA11_0 <= Subtract)||LA11_0==Tan||(LA11_0 >= Union && LA11_0 <= Weight)||LA11_0==Xor) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:17: exprList
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:17: exprList
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall599);
							exprList54=exprList();
							state._fsp--;

							stream_exprList.add(exprList54.getTree());
							}
							break;

					}

					char_literal55=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall602);  
					stream_CParen.add(char_literal55);

					// AST REWRITE
					// elements: exprList, Ellipse
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 114:33: -> ^( FUNC_CALL Ellipse ( exprList )? )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:36: ^( FUNC_CALL Ellipse ( exprList )? )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:36: ^( FUNC_CALL Ellipse ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Ellipse.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:111:56: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:56: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:5: Line '(' ( exprList )? ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:5: Line '(' ( exprList )? ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					Line56=(Token)match(input,Line,FOLLOW_Line_in_primitiveCall622);  
					stream_Line.add(Line56);

					char_literal57=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall624);  
					stream_OParen.add(char_literal57);

<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:14: ( exprList )?
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:14: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==ATan||LA12_0==Assert||LA12_0==Bool||LA12_0==COLOR_CONSTANT||LA12_0==Clip||(LA12_0 >= Copy && LA12_0 <= Curve)||LA12_0==Difference||LA12_0==Ellipse||(LA12_0 >= Excl && LA12_0 <= Expand)||LA12_0==Fill||(LA12_0 >= GetDistance && LA12_0 <= Hide)||LA12_0==Identifier||LA12_0==LAdd||(LA12_0 >= LRemove && LA12_0 <= LShape)||(LA12_0 >= Line && LA12_0 <= MirrorY)||(LA12_0 >= Move && LA12_0 <= MoveBy)||(LA12_0 >= NoFill && LA12_0 <= Number)||(LA12_0 >= OBracket && LA12_0 <= OParen)||(LA12_0 >= PI_CONSTANT && LA12_0 <= Polygon)||(LA12_0 >= Print && LA12_0 <= Println)||(LA12_0 >= Random && LA12_0 <= Rect)||(LA12_0 >= Rotate && LA12_0 <= Round)||(LA12_0 >= Scale && LA12_0 <= Size)||(LA12_0 >= String && LA12_0 <= Subtract)||LA12_0==Tan||(LA12_0 >= Union && LA12_0 <= Weight)||LA12_0==Xor) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:14: exprList
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:14: exprList
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall626);
							exprList58=exprList();
							state._fsp--;

							stream_exprList.add(exprList58.getTree());
							}
							break;

					}

					char_literal59=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall629);  
					stream_CParen.add(char_literal59);

					// AST REWRITE
					// elements: Line, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 115:30: -> ^( FUNC_CALL Line ( exprList )? )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:33: ^( FUNC_CALL Line ( exprList )? )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:33: ^( FUNC_CALL Line ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Line.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:112:50: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:50: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:5: Rect '(' ( exprList )? ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:5: Rect '(' ( exprList )? ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					Rect60=(Token)match(input,Rect,FOLLOW_Rect_in_primitiveCall649);  
					stream_Rect.add(Rect60);

					char_literal61=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall651);  
					stream_OParen.add(char_literal61);

<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:14: ( exprList )?
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:14: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ATan||LA13_0==Assert||LA13_0==Bool||LA13_0==COLOR_CONSTANT||LA13_0==Clip||(LA13_0 >= Copy && LA13_0 <= Curve)||LA13_0==Difference||LA13_0==Ellipse||(LA13_0 >= Excl && LA13_0 <= Expand)||LA13_0==Fill||(LA13_0 >= GetDistance && LA13_0 <= Hide)||LA13_0==Identifier||LA13_0==LAdd||(LA13_0 >= LRemove && LA13_0 <= LShape)||(LA13_0 >= Line && LA13_0 <= MirrorY)||(LA13_0 >= Move && LA13_0 <= MoveBy)||(LA13_0 >= NoFill && LA13_0 <= Number)||(LA13_0 >= OBracket && LA13_0 <= OParen)||(LA13_0 >= PI_CONSTANT && LA13_0 <= Polygon)||(LA13_0 >= Print && LA13_0 <= Println)||(LA13_0 >= Random && LA13_0 <= Rect)||(LA13_0 >= Rotate && LA13_0 <= Round)||(LA13_0 >= Scale && LA13_0 <= Size)||(LA13_0 >= String && LA13_0 <= Subtract)||LA13_0==Tan||(LA13_0 >= Union && LA13_0 <= Weight)||LA13_0==Xor) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:14: exprList
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:14: exprList
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall653);
							exprList62=exprList();
							state._fsp--;

							stream_exprList.add(exprList62.getTree());
							}
							break;

					}

					char_literal63=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall656);  
					stream_CParen.add(char_literal63);

					// AST REWRITE
					// elements: Rect, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 116:30: -> ^( FUNC_CALL Rect ( exprList )? )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:33: ^( FUNC_CALL Rect ( exprList )? )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:33: ^( FUNC_CALL Rect ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rect.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:113:50: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:50: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:5: Curve '(' ( exprList )? ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:5: Curve '(' ( exprList )? ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					Curve64=(Token)match(input,Curve,FOLLOW_Curve_in_primitiveCall676);  
					stream_Curve.add(Curve64);

					char_literal65=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall678);  
					stream_OParen.add(char_literal65);

<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:15: ( exprList )?
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:15: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ATan||LA14_0==Assert||LA14_0==Bool||LA14_0==COLOR_CONSTANT||LA14_0==Clip||(LA14_0 >= Copy && LA14_0 <= Curve)||LA14_0==Difference||LA14_0==Ellipse||(LA14_0 >= Excl && LA14_0 <= Expand)||LA14_0==Fill||(LA14_0 >= GetDistance && LA14_0 <= Hide)||LA14_0==Identifier||LA14_0==LAdd||(LA14_0 >= LRemove && LA14_0 <= LShape)||(LA14_0 >= Line && LA14_0 <= MirrorY)||(LA14_0 >= Move && LA14_0 <= MoveBy)||(LA14_0 >= NoFill && LA14_0 <= Number)||(LA14_0 >= OBracket && LA14_0 <= OParen)||(LA14_0 >= PI_CONSTANT && LA14_0 <= Polygon)||(LA14_0 >= Print && LA14_0 <= Println)||(LA14_0 >= Random && LA14_0 <= Rect)||(LA14_0 >= Rotate && LA14_0 <= Round)||(LA14_0 >= Scale && LA14_0 <= Size)||(LA14_0 >= String && LA14_0 <= Subtract)||LA14_0==Tan||(LA14_0 >= Union && LA14_0 <= Weight)||LA14_0==Xor) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:15: exprList
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:15: exprList
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall680);
							exprList66=exprList();
							state._fsp--;

							stream_exprList.add(exprList66.getTree());
							}
							break;

					}

					char_literal67=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall683);  
					stream_CParen.add(char_literal67);

					// AST REWRITE
					// elements: exprList, Curve
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 117:29: -> ^( FUNC_CALL Curve ( exprList )? )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:33: ^( FUNC_CALL Curve ( exprList )? )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:33: ^( FUNC_CALL Curve ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Curve.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:114:51: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:51: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:5: Polygon '(' ( exprList )? ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:5: Polygon '(' ( exprList )? ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					Polygon68=(Token)match(input,Polygon,FOLLOW_Polygon_in_primitiveCall701);  
					stream_Polygon.add(Polygon68);

					char_literal69=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall703);  
					stream_OParen.add(char_literal69);

<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:17: ( exprList )?
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:17: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ATan||LA15_0==Assert||LA15_0==Bool||LA15_0==COLOR_CONSTANT||LA15_0==Clip||(LA15_0 >= Copy && LA15_0 <= Curve)||LA15_0==Difference||LA15_0==Ellipse||(LA15_0 >= Excl && LA15_0 <= Expand)||LA15_0==Fill||(LA15_0 >= GetDistance && LA15_0 <= Hide)||LA15_0==Identifier||LA15_0==LAdd||(LA15_0 >= LRemove && LA15_0 <= LShape)||(LA15_0 >= Line && LA15_0 <= MirrorY)||(LA15_0 >= Move && LA15_0 <= MoveBy)||(LA15_0 >= NoFill && LA15_0 <= Number)||(LA15_0 >= OBracket && LA15_0 <= OParen)||(LA15_0 >= PI_CONSTANT && LA15_0 <= Polygon)||(LA15_0 >= Print && LA15_0 <= Println)||(LA15_0 >= Random && LA15_0 <= Rect)||(LA15_0 >= Rotate && LA15_0 <= Round)||(LA15_0 >= Scale && LA15_0 <= Size)||(LA15_0 >= String && LA15_0 <= Subtract)||LA15_0==Tan||(LA15_0 >= Union && LA15_0 <= Weight)||LA15_0==Xor) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:17: exprList
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:17: exprList
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall705);
							exprList70=exprList();
							state._fsp--;

							stream_exprList.add(exprList70.getTree());
							}
							break;

					}

					char_literal71=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall708);  
					stream_CParen.add(char_literal71);

					// AST REWRITE
					// elements: exprList, Polygon
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 118:31: -> ^( FUNC_CALL Polygon ( exprList )? )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:35: ^( FUNC_CALL Polygon ( exprList )? )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:35: ^( FUNC_CALL Polygon ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Polygon.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:115:55: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:55: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:5: LShape '(' ( exprList )? ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:5: LShape '(' ( exprList )? ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					LShape72=(Token)match(input,LShape,FOLLOW_LShape_in_primitiveCall726);  
					stream_LShape.add(LShape72);

					char_literal73=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall728);  
					stream_OParen.add(char_literal73);

<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:16: ( exprList )?
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:16: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==ATan||LA16_0==Assert||LA16_0==Bool||LA16_0==COLOR_CONSTANT||LA16_0==Clip||(LA16_0 >= Copy && LA16_0 <= Curve)||LA16_0==Difference||LA16_0==Ellipse||(LA16_0 >= Excl && LA16_0 <= Expand)||LA16_0==Fill||(LA16_0 >= GetDistance && LA16_0 <= Hide)||LA16_0==Identifier||LA16_0==LAdd||(LA16_0 >= LRemove && LA16_0 <= LShape)||(LA16_0 >= Line && LA16_0 <= MirrorY)||(LA16_0 >= Move && LA16_0 <= MoveBy)||(LA16_0 >= NoFill && LA16_0 <= Number)||(LA16_0 >= OBracket && LA16_0 <= OParen)||(LA16_0 >= PI_CONSTANT && LA16_0 <= Polygon)||(LA16_0 >= Print && LA16_0 <= Println)||(LA16_0 >= Random && LA16_0 <= Rect)||(LA16_0 >= Rotate && LA16_0 <= Round)||(LA16_0 >= Scale && LA16_0 <= Size)||(LA16_0 >= String && LA16_0 <= Subtract)||LA16_0==Tan||(LA16_0 >= Union && LA16_0 <= Weight)||LA16_0==Xor) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:16: exprList
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:16: exprList
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall730);
							exprList74=exprList();
							state._fsp--;

							stream_exprList.add(exprList74.getTree());
							}
							break;

					}

					char_literal75=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall733);  
					stream_CParen.add(char_literal75);

					// AST REWRITE
					// elements: LShape, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 119:30: -> ^( FUNC_CALL LShape ( exprList )? )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:34: ^( FUNC_CALL LShape ( exprList )? )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:34: ^( FUNC_CALL LShape ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_LShape.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:116:53: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:53: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:6: Point '(' ( exprList )? ')'
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:6: Point '(' ( exprList )? ')'
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					Point76=(Token)match(input,Point,FOLLOW_Point_in_primitiveCall752);  
					stream_Point.add(Point76);

					char_literal77=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall754);  
					stream_OParen.add(char_literal77);

<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:16: ( exprList )?
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:16: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ATan||LA17_0==Assert||LA17_0==Bool||LA17_0==COLOR_CONSTANT||LA17_0==Clip||(LA17_0 >= Copy && LA17_0 <= Curve)||LA17_0==Difference||LA17_0==Ellipse||(LA17_0 >= Excl && LA17_0 <= Expand)||LA17_0==Fill||(LA17_0 >= GetDistance && LA17_0 <= Hide)||LA17_0==Identifier||LA17_0==LAdd||(LA17_0 >= LRemove && LA17_0 <= LShape)||(LA17_0 >= Line && LA17_0 <= MirrorY)||(LA17_0 >= Move && LA17_0 <= MoveBy)||(LA17_0 >= NoFill && LA17_0 <= Number)||(LA17_0 >= OBracket && LA17_0 <= OParen)||(LA17_0 >= PI_CONSTANT && LA17_0 <= Polygon)||(LA17_0 >= Print && LA17_0 <= Println)||(LA17_0 >= Random && LA17_0 <= Rect)||(LA17_0 >= Rotate && LA17_0 <= Round)||(LA17_0 >= Scale && LA17_0 <= Size)||(LA17_0 >= String && LA17_0 <= Subtract)||LA17_0==Tan||(LA17_0 >= Union && LA17_0 <= Weight)||LA17_0==Xor) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:16: exprList
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:16: exprList
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall756);
							exprList78=exprList();
							state._fsp--;

							stream_exprList.add(exprList78.getTree());
							}
							break;

					}

					char_literal79=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall759);  
					stream_CParen.add(char_literal79);

					// AST REWRITE
					// elements: exprList, Point
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 120:30: -> ^( FUNC_CALL Point ( exprList )? )
					{
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:34: ^( FUNC_CALL Point ( exprList )? )
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:34: ^( FUNC_CALL Point ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Point.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:117:52: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:5: Shirt '(' ( exprList )? ')'
					{
					Shirt80=(Token)match(input,Shirt,FOLLOW_Shirt_in_primitiveCall762);  
					stream_Shirt.add(Shirt80);

					char_literal81=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall764);  
					stream_OParen.add(char_literal81);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:15: ( exprList )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==ATan||LA18_0==Assert||LA18_0==Bool||LA18_0==COLOR_CONSTANT||(LA18_0 >= Copy && LA18_0 <= Curve)||LA18_0==Ellipse||(LA18_0 >= Excl && LA18_0 <= Expand)||LA18_0==Fill||(LA18_0 >= GetDistance && LA18_0 <= Hide)||LA18_0==Identifier||LA18_0==LAdd||(LA18_0 >= LRemove && LA18_0 <= LShape)||(LA18_0 >= Line && LA18_0 <= MirrorX)||(LA18_0 >= Move && LA18_0 <= MoveBy)||(LA18_0 >= NoFill && LA18_0 <= Number)||(LA18_0 >= OBracket && LA18_0 <= OParen)||(LA18_0 >= PI_CONSTANT && LA18_0 <= Polygon)||(LA18_0 >= Print && LA18_0 <= Println)||(LA18_0 >= Random && LA18_0 <= Rect)||(LA18_0 >= Rotate && LA18_0 <= Round)||(LA18_0 >= Scale && LA18_0 <= Size)||(LA18_0 >= String && LA18_0 <= Subtract)||LA18_0==Tan||(LA18_0 >= WIDTH_CONSTANT && LA18_0 <= Weight)) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall766);
							exprList82=exprList();
							state._fsp--;

							stream_exprList.add(exprList82.getTree());
							}
							break;

					}

					char_literal83=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall769);  
					stream_CParen.add(char_literal83);

					// AST REWRITE
					// elements: exprList, Shirt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 118:29: -> ^( FUNC_CALL Shirt ( exprList )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:32: ^( FUNC_CALL Shirt ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Shirt.nextNode());
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:118:50: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:5: ShirtBack '(' ( exprList )? ')'
					{
					ShirtBack84=(Token)match(input,ShirtBack,FOLLOW_ShirtBack_in_primitiveCall786);  
					stream_ShirtBack.add(ShirtBack84);

					char_literal85=(Token)match(input,OParen,FOLLOW_OParen_in_primitiveCall788);  
					stream_OParen.add(char_literal85);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:19: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==ATan||LA19_0==Assert||LA19_0==Bool||LA19_0==COLOR_CONSTANT||(LA19_0 >= Copy && LA19_0 <= Curve)||LA19_0==Ellipse||(LA19_0 >= Excl && LA19_0 <= Expand)||LA19_0==Fill||(LA19_0 >= GetDistance && LA19_0 <= Hide)||LA19_0==Identifier||LA19_0==LAdd||(LA19_0 >= LRemove && LA19_0 <= LShape)||(LA19_0 >= Line && LA19_0 <= MirrorX)||(LA19_0 >= Move && LA19_0 <= MoveBy)||(LA19_0 >= NoFill && LA19_0 <= Number)||(LA19_0 >= OBracket && LA19_0 <= OParen)||(LA19_0 >= PI_CONSTANT && LA19_0 <= Polygon)||(LA19_0 >= Print && LA19_0 <= Println)||(LA19_0 >= Random && LA19_0 <= Rect)||(LA19_0 >= Rotate && LA19_0 <= Round)||(LA19_0 >= Scale && LA19_0 <= Size)||(LA19_0 >= String && LA19_0 <= Subtract)||LA19_0==Tan||(LA19_0 >= WIDTH_CONSTANT && LA19_0 <= Weight)) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:19: exprList
							{
							pushFollow(FOLLOW_exprList_in_primitiveCall790);
							exprList86=exprList();
							state._fsp--;

							stream_exprList.add(exprList86.getTree());
							}
							break;

					}

					char_literal87=(Token)match(input,CParen,FOLLOW_CParen_in_primitiveCall793);  
					stream_CParen.add(char_literal87);

					// AST REWRITE
					// elements: exprList, ShirtBack
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 119:33: -> ^( FUNC_CALL ShirtBack ( exprList )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:36: ^( FUNC_CALL ShirtBack ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_ShirtBack.nextNode());
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:119:58: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:120:52: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primitiveCall"


	public static class transformCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "transformCall"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:122:3: transformCall : ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | MoveBy '(' ( exprList )? ')' -> ^( FUNC_CALL MoveBy ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:3: transformCall : ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | MoveBy '(' ( exprList )? ')' -> ^( FUNC_CALL MoveBy ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) | MirrorY '(' expression ')' -> ^( FUNC_CALL MirrorY expression ) | Union '(' ( exprList )? ')' -> ^( FUNC_CALL Union ( exprList )? ) | Difference '(' ( exprList )? ')' -> ^( FUNC_CALL Difference ( exprList )? ) | Clip '(' ( exprList )? ')' -> ^( FUNC_CALL Clip ( exprList )? ) | Xor '(' ( exprList )? ')' -> ^( FUNC_CALL Xor ( exprList )? ) );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.transformCall_return transformCall() throws RecognitionException {
		PogoParser.transformCall_return retval = new PogoParser.transformCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Move88=null;
		Token char_literal89=null;
		Token char_literal91=null;
		Token MoveBy92=null;
		Token char_literal93=null;
		Token char_literal95=null;
		Token Copy96=null;
		Token char_literal97=null;
		Token char_literal99=null;
		Token Rotate100=null;
		Token char_literal101=null;
		Token char_literal103=null;
		Token Fill104=null;
		Token char_literal105=null;
		Token char_literal107=null;
		Token Stroke108=null;
		Token char_literal109=null;
		Token char_literal111=null;
		Token NoFill112=null;
		Token char_literal113=null;
		Token char_literal115=null;
		Token NoStroke116=null;
		Token char_literal117=null;
		Token char_literal119=null;
		Token Weight120=null;
		Token char_literal121=null;
		Token char_literal123=null;
		Token Hide124=null;
		Token char_literal125=null;
		Token char_literal127=null;
		Token Group128=null;
		Token char_literal129=null;
		Token char_literal131=null;
		Token Expand132=null;
		Token char_literal133=null;
		Token char_literal135=null;
		Token Merge136=null;
		Token char_literal137=null;
		Token char_literal139=null;
<<<<<<< HEAD
		Token Scale140=null;
		Token char_literal141=null;
		Token char_literal143=null;
		Token MirrorX144=null;
		Token char_literal145=null;
		Token char_literal147=null;
		ParserRuleReturnScope exprList90 =null;
=======
		Token MirrorY140=null;
		Token char_literal141=null;
		Token char_literal143=null;
		Token Union144=null;
		Token char_literal145=null;
		Token char_literal147=null;
		Token Difference148=null;
		Token char_literal149=null;
		Token char_literal151=null;
		Token Clip152=null;
		Token char_literal153=null;
		Token char_literal155=null;
		Token Xor156=null;
		Token char_literal157=null;
		Token char_literal159=null;
		ParserRuleReturnScope exprList82 =null;
		ParserRuleReturnScope exprList86 =null;
		ParserRuleReturnScope expression90 =null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		ParserRuleReturnScope exprList94 =null;
		ParserRuleReturnScope expression98 =null;
		ParserRuleReturnScope exprList102 =null;
		ParserRuleReturnScope exprList106 =null;
		ParserRuleReturnScope exprList110 =null;
		ParserRuleReturnScope expression114 =null;
		ParserRuleReturnScope expression118 =null;
		ParserRuleReturnScope exprList122 =null;
		ParserRuleReturnScope expression126 =null;
		ParserRuleReturnScope exprList130 =null;
		ParserRuleReturnScope expression134 =null;
		ParserRuleReturnScope expression138 =null;
<<<<<<< HEAD
		ParserRuleReturnScope exprList142 =null;
		ParserRuleReturnScope expression146 =null;
=======
		ParserRuleReturnScope expression142 =null;
		ParserRuleReturnScope exprList146 =null;
		ParserRuleReturnScope exprList150 =null;
		ParserRuleReturnScope exprList154 =null;
		ParserRuleReturnScope exprList158 =null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

		Object Move88_tree=null;
		Object char_literal89_tree=null;
		Object char_literal91_tree=null;
		Object MoveBy92_tree=null;
		Object char_literal93_tree=null;
		Object char_literal95_tree=null;
		Object Copy96_tree=null;
		Object char_literal97_tree=null;
		Object char_literal99_tree=null;
		Object Rotate100_tree=null;
		Object char_literal101_tree=null;
		Object char_literal103_tree=null;
		Object Fill104_tree=null;
		Object char_literal105_tree=null;
		Object char_literal107_tree=null;
		Object Stroke108_tree=null;
		Object char_literal109_tree=null;
		Object char_literal111_tree=null;
		Object NoFill112_tree=null;
		Object char_literal113_tree=null;
		Object char_literal115_tree=null;
		Object NoStroke116_tree=null;
		Object char_literal117_tree=null;
		Object char_literal119_tree=null;
		Object Weight120_tree=null;
		Object char_literal121_tree=null;
		Object char_literal123_tree=null;
		Object Hide124_tree=null;
		Object char_literal125_tree=null;
		Object char_literal127_tree=null;
		Object Group128_tree=null;
		Object char_literal129_tree=null;
		Object char_literal131_tree=null;
		Object Expand132_tree=null;
		Object char_literal133_tree=null;
		Object char_literal135_tree=null;
		Object Merge136_tree=null;
		Object char_literal137_tree=null;
		Object char_literal139_tree=null;
<<<<<<< HEAD
		Object Scale140_tree=null;
		Object char_literal141_tree=null;
		Object char_literal143_tree=null;
		Object MirrorX144_tree=null;
		Object char_literal145_tree=null;
		Object char_literal147_tree=null;
=======
		Object MirrorY140_tree=null;
		Object char_literal141_tree=null;
		Object char_literal143_tree=null;
		Object Union144_tree=null;
		Object char_literal145_tree=null;
		Object char_literal147_tree=null;
		Object Difference148_tree=null;
		Object char_literal149_tree=null;
		Object char_literal151_tree=null;
		Object Clip152_tree=null;
		Object char_literal153_tree=null;
		Object char_literal155_tree=null;
		Object Xor156_tree=null;
		Object char_literal157_tree=null;
		Object char_literal159_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Stroke=new RewriteRuleTokenStream(adaptor,"token Stroke");
		RewriteRuleTokenStream stream_Union=new RewriteRuleTokenStream(adaptor,"token Union");
		RewriteRuleTokenStream stream_NoFill=new RewriteRuleTokenStream(adaptor,"token NoFill");
<<<<<<< HEAD
=======
		RewriteRuleTokenStream stream_Clip=new RewriteRuleTokenStream(adaptor,"token Clip");
		RewriteRuleTokenStream stream_MoveBy=new RewriteRuleTokenStream(adaptor,"token MoveBy");
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_Group=new RewriteRuleTokenStream(adaptor,"token Group");
		RewriteRuleTokenStream stream_MoveBy=new RewriteRuleTokenStream(adaptor,"token MoveBy");
		RewriteRuleTokenStream stream_Copy=new RewriteRuleTokenStream(adaptor,"token Copy");
		RewriteRuleTokenStream stream_MirrorY=new RewriteRuleTokenStream(adaptor,"token MirrorY");
		RewriteRuleTokenStream stream_NoStroke=new RewriteRuleTokenStream(adaptor,"token NoStroke");
		RewriteRuleTokenStream stream_MirrorX=new RewriteRuleTokenStream(adaptor,"token MirrorX");
		RewriteRuleTokenStream stream_Difference=new RewriteRuleTokenStream(adaptor,"token Difference");
		RewriteRuleTokenStream stream_Weight=new RewriteRuleTokenStream(adaptor,"token Weight");
		RewriteRuleTokenStream stream_Hide=new RewriteRuleTokenStream(adaptor,"token Hide");
		RewriteRuleTokenStream stream_Merge=new RewriteRuleTokenStream(adaptor,"token Merge");
		RewriteRuleTokenStream stream_Move=new RewriteRuleTokenStream(adaptor,"token Move");
		RewriteRuleTokenStream stream_Rotate=new RewriteRuleTokenStream(adaptor,"token Rotate");
		RewriteRuleTokenStream stream_Scale=new RewriteRuleTokenStream(adaptor,"token Scale");
		RewriteRuleTokenStream stream_Fill=new RewriteRuleTokenStream(adaptor,"token Fill");
		RewriteRuleTokenStream stream_Xor=new RewriteRuleTokenStream(adaptor,"token Xor");
		RewriteRuleTokenStream stream_Expand=new RewriteRuleTokenStream(adaptor,"token Expand");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:4: ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | MoveBy '(' ( exprList )? ')' -> ^( FUNC_CALL MoveBy ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) )
			int alt29=15;
			switch ( input.LA(1) ) {
			case Move:
				{
				alt29=1;
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:4: ( Move '(' ( exprList )? ')' -> ^( FUNC_CALL Move ( exprList )? ) | MoveBy '(' ( exprList )? ')' -> ^( FUNC_CALL MoveBy ( exprList )? ) | Copy '(' expression ')' -> ^( FUNC_CALL Copy expression ) | Rotate '(' ( exprList )? ')' -> ^( FUNC_CALL Rotate ( exprList )? ) | Fill '(' ( exprList )? ')' -> ^( FUNC_CALL Fill ( exprList )? ) | Stroke '(' ( exprList )? ')' -> ^( FUNC_CALL Stroke ( exprList )? ) | NoFill '(' expression ')' -> ^( FUNC_CALL NoFill expression ) | NoStroke '(' expression ')' -> ^( FUNC_CALL NoStroke expression ) | Weight '(' ( exprList )? ')' -> ^( FUNC_CALL Weight ( exprList )? ) | Hide '(' expression ')' -> ^( FUNC_CALL Hide expression ) | Group '(' ( exprList )? ')' -> ^( FUNC_CALL Group ( exprList )? ) | Expand '(' expression ')' -> ^( FUNC_CALL Expand expression ) | Merge '(' expression ')' -> ^( FUNC_CALL Merge expression ) | Scale '(' ( exprList )? ')' -> ^( FUNC_CALL Scale ( exprList )? ) | MirrorX '(' expression ')' -> ^( FUNC_CALL MirrorX expression ) | MirrorY '(' expression ')' -> ^( FUNC_CALL MirrorY expression ) | Union '(' ( exprList )? ')' -> ^( FUNC_CALL Union ( exprList )? ) | Difference '(' ( exprList )? ')' -> ^( FUNC_CALL Difference ( exprList )? ) | Clip '(' ( exprList )? ')' -> ^( FUNC_CALL Clip ( exprList )? ) | Xor '(' ( exprList )? ')' -> ^( FUNC_CALL Xor ( exprList )? ) )
			int alt31=20;
			switch ( input.LA(1) ) {
			case Move:
				{
				alt31=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case MoveBy:
				{
<<<<<<< HEAD
				alt29=2;
=======
				alt31=2;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Copy:
				{
<<<<<<< HEAD
				alt29=3;
=======
				alt31=3;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Rotate:
				{
<<<<<<< HEAD
				alt29=4;
=======
				alt31=4;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Fill:
				{
<<<<<<< HEAD
				alt29=5;
=======
				alt31=5;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Stroke:
				{
<<<<<<< HEAD
				alt29=6;
=======
				alt31=6;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case NoFill:
				{
<<<<<<< HEAD
				alt29=7;
=======
				alt31=7;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case NoStroke:
				{
<<<<<<< HEAD
				alt29=8;
=======
				alt31=8;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Weight:
				{
<<<<<<< HEAD
				alt29=9;
=======
				alt31=9;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Hide:
				{
<<<<<<< HEAD
				alt29=10;
=======
				alt31=10;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Group:
				{
<<<<<<< HEAD
				alt29=11;
=======
				alt31=11;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Expand:
				{
<<<<<<< HEAD
				alt29=12;
=======
				alt31=12;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Merge:
				{
<<<<<<< HEAD
				alt29=13;
=======
				alt31=13;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Scale:
				{
<<<<<<< HEAD
				alt29=14;
=======
				alt31=14;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case MirrorX:
				{
<<<<<<< HEAD
				alt29=15;
=======
				alt31=15;
				}
				break;
			case MirrorY:
				{
				alt31=16;
				}
				break;
			case Union:
				{
				alt31=17;
				}
				break;
			case Difference:
				{
				alt31=18;
				}
				break;
			case Clip:
				{
				alt31=19;
				}
				break;
			case Xor:
				{
				alt31=20;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			default:
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:6: Move '(' ( exprList )? ')'
					{
					Move88=(Token)match(input,Move,FOLLOW_Move_in_transformCall823);  
					stream_Move.add(Move88);

					char_literal89=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall825);  
					stream_OParen.add(char_literal89);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:15: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==ATan||LA21_0==Assert||LA21_0==Bool||LA21_0==COLOR_CONSTANT||(LA21_0 >= Copy && LA21_0 <= Curve)||LA21_0==Ellipse||(LA21_0 >= Excl && LA21_0 <= Expand)||LA21_0==Fill||(LA21_0 >= GetDistance && LA21_0 <= Hide)||LA21_0==Identifier||LA21_0==LAdd||(LA21_0 >= LRemove && LA21_0 <= LShape)||(LA21_0 >= Line && LA21_0 <= MirrorX)||(LA21_0 >= Move && LA21_0 <= MoveBy)||(LA21_0 >= NoFill && LA21_0 <= Number)||(LA21_0 >= OBracket && LA21_0 <= OParen)||(LA21_0 >= PI_CONSTANT && LA21_0 <= Polygon)||(LA21_0 >= Print && LA21_0 <= Println)||(LA21_0 >= Random && LA21_0 <= Rect)||(LA21_0 >= Rotate && LA21_0 <= Round)||(LA21_0 >= Scale && LA21_0 <= Size)||(LA21_0 >= String && LA21_0 <= Subtract)||LA21_0==Tan||(LA21_0 >= WIDTH_CONSTANT && LA21_0 <= Weight)) ) {
						alt21=1;
=======
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:6: Move '(' ( exprList )? ')'
					{
					Move80=(Token)match(input,Move,FOLLOW_Move_in_transformCall790);  
					stream_Move.add(Move80);

					char_literal81=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall792);  
					stream_OParen.add(char_literal81);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:15: ( exprList )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==ATan||LA19_0==Assert||LA19_0==Bool||LA19_0==COLOR_CONSTANT||LA19_0==Clip||(LA19_0 >= Copy && LA19_0 <= Curve)||LA19_0==Difference||LA19_0==Ellipse||(LA19_0 >= Excl && LA19_0 <= Expand)||LA19_0==Fill||(LA19_0 >= GetDistance && LA19_0 <= Hide)||LA19_0==Identifier||LA19_0==LAdd||(LA19_0 >= LRemove && LA19_0 <= LShape)||(LA19_0 >= Line && LA19_0 <= MirrorY)||(LA19_0 >= Move && LA19_0 <= MoveBy)||(LA19_0 >= NoFill && LA19_0 <= Number)||(LA19_0 >= OBracket && LA19_0 <= OParen)||(LA19_0 >= PI_CONSTANT && LA19_0 <= Polygon)||(LA19_0 >= Print && LA19_0 <= Println)||(LA19_0 >= Random && LA19_0 <= Rect)||(LA19_0 >= Rotate && LA19_0 <= Round)||(LA19_0 >= Scale && LA19_0 <= Size)||(LA19_0 >= String && LA19_0 <= Subtract)||LA19_0==Tan||(LA19_0 >= Union && LA19_0 <= Weight)||LA19_0==Xor) ) {
						alt19=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					switch (alt21) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall827);
							exprList90=exprList();
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall794);
							exprList82=exprList();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							state._fsp--;

							stream_exprList.add(exprList90.getTree());
							}
							break;

					}

<<<<<<< HEAD
					char_literal91=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall830);  
					stream_CParen.add(char_literal91);
=======
					char_literal83=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall797);  
					stream_CParen.add(char_literal83);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: exprList, Move
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 123:29: -> ^( FUNC_CALL Move ( exprList )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:32: ^( FUNC_CALL Move ( exprList )? )
=======
					// 124:29: -> ^( FUNC_CALL Move ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:32: ^( FUNC_CALL Move ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Move.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:123:49: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:49: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:6: MoveBy '(' ( exprList )? ')'
					{
					MoveBy92=(Token)match(input,MoveBy,FOLLOW_MoveBy_in_transformCall848);  
					stream_MoveBy.add(MoveBy92);

					char_literal93=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall850);  
					stream_OParen.add(char_literal93);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:17: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==ATan||LA22_0==Assert||LA22_0==Bool||LA22_0==COLOR_CONSTANT||(LA22_0 >= Copy && LA22_0 <= Curve)||LA22_0==Ellipse||(LA22_0 >= Excl && LA22_0 <= Expand)||LA22_0==Fill||(LA22_0 >= GetDistance && LA22_0 <= Hide)||LA22_0==Identifier||LA22_0==LAdd||(LA22_0 >= LRemove && LA22_0 <= LShape)||(LA22_0 >= Line && LA22_0 <= MirrorX)||(LA22_0 >= Move && LA22_0 <= MoveBy)||(LA22_0 >= NoFill && LA22_0 <= Number)||(LA22_0 >= OBracket && LA22_0 <= OParen)||(LA22_0 >= PI_CONSTANT && LA22_0 <= Polygon)||(LA22_0 >= Print && LA22_0 <= Println)||(LA22_0 >= Random && LA22_0 <= Rect)||(LA22_0 >= Rotate && LA22_0 <= Round)||(LA22_0 >= Scale && LA22_0 <= Size)||(LA22_0 >= String && LA22_0 <= Subtract)||LA22_0==Tan||(LA22_0 >= WIDTH_CONSTANT && LA22_0 <= Weight)) ) {
						alt22=1;
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:6: MoveBy '(' ( exprList )? ')'
					{
					MoveBy84=(Token)match(input,MoveBy,FOLLOW_MoveBy_in_transformCall815);  
					stream_MoveBy.add(MoveBy84);

					char_literal85=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall817);  
					stream_OParen.add(char_literal85);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:17: ( exprList )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==ATan||LA20_0==Assert||LA20_0==Bool||LA20_0==COLOR_CONSTANT||LA20_0==Clip||(LA20_0 >= Copy && LA20_0 <= Curve)||LA20_0==Difference||LA20_0==Ellipse||(LA20_0 >= Excl && LA20_0 <= Expand)||LA20_0==Fill||(LA20_0 >= GetDistance && LA20_0 <= Hide)||LA20_0==Identifier||LA20_0==LAdd||(LA20_0 >= LRemove && LA20_0 <= LShape)||(LA20_0 >= Line && LA20_0 <= MirrorY)||(LA20_0 >= Move && LA20_0 <= MoveBy)||(LA20_0 >= NoFill && LA20_0 <= Number)||(LA20_0 >= OBracket && LA20_0 <= OParen)||(LA20_0 >= PI_CONSTANT && LA20_0 <= Polygon)||(LA20_0 >= Print && LA20_0 <= Println)||(LA20_0 >= Random && LA20_0 <= Rect)||(LA20_0 >= Rotate && LA20_0 <= Round)||(LA20_0 >= Scale && LA20_0 <= Size)||(LA20_0 >= String && LA20_0 <= Subtract)||LA20_0==Tan||(LA20_0 >= Union && LA20_0 <= Weight)||LA20_0==Xor) ) {
						alt20=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					switch (alt22) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall852);
							exprList94=exprList();
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall819);
							exprList86=exprList();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							state._fsp--;

							stream_exprList.add(exprList94.getTree());
							}
							break;

					}

<<<<<<< HEAD
					char_literal95=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall855);  
					stream_CParen.add(char_literal95);
=======
					char_literal87=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall822);  
					stream_CParen.add(char_literal87);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: MoveBy, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 124:31: -> ^( FUNC_CALL MoveBy ( exprList )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:34: ^( FUNC_CALL MoveBy ( exprList )? )
=======
					// 125:31: -> ^( FUNC_CALL MoveBy ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:34: ^( FUNC_CALL MoveBy ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_MoveBy.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:124:53: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:125:53: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:6: Copy '(' expression ')'
					{
					Copy96=(Token)match(input,Copy,FOLLOW_Copy_in_transformCall879);  
					stream_Copy.add(Copy96);

					char_literal97=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall881);  
					stream_OParen.add(char_literal97);

					pushFollow(FOLLOW_expression_in_transformCall883);
					expression98=expression();
					state._fsp--;

					stream_expression.add(expression98.getTree());
					char_literal99=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall885);  
					stream_CParen.add(char_literal99);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:6: Copy '(' expression ')'
					{
					Copy88=(Token)match(input,Copy,FOLLOW_Copy_in_transformCall846);  
					stream_Copy.add(Copy88);

					char_literal89=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall848);  
					stream_OParen.add(char_literal89);

					pushFollow(FOLLOW_expression_in_transformCall850);
					expression90=expression();
					state._fsp--;

					stream_expression.add(expression90.getTree());
					char_literal91=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall852);  
					stream_CParen.add(char_literal91);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: Copy, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 126:30: -> ^( FUNC_CALL Copy expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:126:33: ^( FUNC_CALL Copy expression )
=======
					// 127:30: -> ^( FUNC_CALL Copy expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:33: ^( FUNC_CALL Copy expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Copy.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:6: Rotate '(' ( exprList )? ')'
					{
					Rotate100=(Token)match(input,Rotate,FOLLOW_Rotate_in_transformCall902);  
					stream_Rotate.add(Rotate100);

					char_literal101=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall904);  
					stream_OParen.add(char_literal101);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:17: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ATan||LA23_0==Assert||LA23_0==Bool||LA23_0==COLOR_CONSTANT||(LA23_0 >= Copy && LA23_0 <= Curve)||LA23_0==Ellipse||(LA23_0 >= Excl && LA23_0 <= Expand)||LA23_0==Fill||(LA23_0 >= GetDistance && LA23_0 <= Hide)||LA23_0==Identifier||LA23_0==LAdd||(LA23_0 >= LRemove && LA23_0 <= LShape)||(LA23_0 >= Line && LA23_0 <= MirrorX)||(LA23_0 >= Move && LA23_0 <= MoveBy)||(LA23_0 >= NoFill && LA23_0 <= Number)||(LA23_0 >= OBracket && LA23_0 <= OParen)||(LA23_0 >= PI_CONSTANT && LA23_0 <= Polygon)||(LA23_0 >= Print && LA23_0 <= Println)||(LA23_0 >= Random && LA23_0 <= Rect)||(LA23_0 >= Rotate && LA23_0 <= Round)||(LA23_0 >= Scale && LA23_0 <= Size)||(LA23_0 >= String && LA23_0 <= Subtract)||LA23_0==Tan||(LA23_0 >= WIDTH_CONSTANT && LA23_0 <= Weight)) ) {
						alt23=1;
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:6: Rotate '(' ( exprList )? ')'
					{
					Rotate92=(Token)match(input,Rotate,FOLLOW_Rotate_in_transformCall869);  
					stream_Rotate.add(Rotate92);

					char_literal93=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall871);  
					stream_OParen.add(char_literal93);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:17: ( exprList )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==ATan||LA21_0==Assert||LA21_0==Bool||LA21_0==COLOR_CONSTANT||LA21_0==Clip||(LA21_0 >= Copy && LA21_0 <= Curve)||LA21_0==Difference||LA21_0==Ellipse||(LA21_0 >= Excl && LA21_0 <= Expand)||LA21_0==Fill||(LA21_0 >= GetDistance && LA21_0 <= Hide)||LA21_0==Identifier||LA21_0==LAdd||(LA21_0 >= LRemove && LA21_0 <= LShape)||(LA21_0 >= Line && LA21_0 <= MirrorY)||(LA21_0 >= Move && LA21_0 <= MoveBy)||(LA21_0 >= NoFill && LA21_0 <= Number)||(LA21_0 >= OBracket && LA21_0 <= OParen)||(LA21_0 >= PI_CONSTANT && LA21_0 <= Polygon)||(LA21_0 >= Print && LA21_0 <= Println)||(LA21_0 >= Random && LA21_0 <= Rect)||(LA21_0 >= Rotate && LA21_0 <= Round)||(LA21_0 >= Scale && LA21_0 <= Size)||(LA21_0 >= String && LA21_0 <= Subtract)||LA21_0==Tan||(LA21_0 >= Union && LA21_0 <= Weight)||LA21_0==Xor) ) {
						alt21=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					switch (alt23) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall906);
							exprList102=exprList();
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall873);
							exprList94=exprList();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							state._fsp--;

							stream_exprList.add(exprList102.getTree());
							}
							break;

					}

<<<<<<< HEAD
					char_literal103=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall909);  
					stream_CParen.add(char_literal103);
=======
					char_literal95=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall876);  
					stream_CParen.add(char_literal95);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: exprList, Rotate
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 127:30: -> ^( FUNC_CALL Rotate ( exprList )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:33: ^( FUNC_CALL Rotate ( exprList )? )
=======
					// 128:30: -> ^( FUNC_CALL Rotate ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:33: ^( FUNC_CALL Rotate ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Rotate.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:127:52: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:52: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:6: Fill '(' ( exprList )? ')'
					{
					Fill104=(Token)match(input,Fill,FOLLOW_Fill_in_transformCall926);  
					stream_Fill.add(Fill104);

					char_literal105=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall928);  
					stream_OParen.add(char_literal105);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:15: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ATan||LA24_0==Assert||LA24_0==Bool||LA24_0==COLOR_CONSTANT||(LA24_0 >= Copy && LA24_0 <= Curve)||LA24_0==Ellipse||(LA24_0 >= Excl && LA24_0 <= Expand)||LA24_0==Fill||(LA24_0 >= GetDistance && LA24_0 <= Hide)||LA24_0==Identifier||LA24_0==LAdd||(LA24_0 >= LRemove && LA24_0 <= LShape)||(LA24_0 >= Line && LA24_0 <= MirrorX)||(LA24_0 >= Move && LA24_0 <= MoveBy)||(LA24_0 >= NoFill && LA24_0 <= Number)||(LA24_0 >= OBracket && LA24_0 <= OParen)||(LA24_0 >= PI_CONSTANT && LA24_0 <= Polygon)||(LA24_0 >= Print && LA24_0 <= Println)||(LA24_0 >= Random && LA24_0 <= Rect)||(LA24_0 >= Rotate && LA24_0 <= Round)||(LA24_0 >= Scale && LA24_0 <= Size)||(LA24_0 >= String && LA24_0 <= Subtract)||LA24_0==Tan||(LA24_0 >= WIDTH_CONSTANT && LA24_0 <= Weight)) ) {
						alt24=1;
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:6: Fill '(' ( exprList )? ')'
					{
					Fill96=(Token)match(input,Fill,FOLLOW_Fill_in_transformCall893);  
					stream_Fill.add(Fill96);

					char_literal97=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall895);  
					stream_OParen.add(char_literal97);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:15: ( exprList )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==ATan||LA22_0==Assert||LA22_0==Bool||LA22_0==COLOR_CONSTANT||LA22_0==Clip||(LA22_0 >= Copy && LA22_0 <= Curve)||LA22_0==Difference||LA22_0==Ellipse||(LA22_0 >= Excl && LA22_0 <= Expand)||LA22_0==Fill||(LA22_0 >= GetDistance && LA22_0 <= Hide)||LA22_0==Identifier||LA22_0==LAdd||(LA22_0 >= LRemove && LA22_0 <= LShape)||(LA22_0 >= Line && LA22_0 <= MirrorY)||(LA22_0 >= Move && LA22_0 <= MoveBy)||(LA22_0 >= NoFill && LA22_0 <= Number)||(LA22_0 >= OBracket && LA22_0 <= OParen)||(LA22_0 >= PI_CONSTANT && LA22_0 <= Polygon)||(LA22_0 >= Print && LA22_0 <= Println)||(LA22_0 >= Random && LA22_0 <= Rect)||(LA22_0 >= Rotate && LA22_0 <= Round)||(LA22_0 >= Scale && LA22_0 <= Size)||(LA22_0 >= String && LA22_0 <= Subtract)||LA22_0==Tan||(LA22_0 >= Union && LA22_0 <= Weight)||LA22_0==Xor) ) {
						alt22=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					switch (alt24) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall930);
							exprList106=exprList();
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall897);
							exprList98=exprList();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							state._fsp--;

							stream_exprList.add(exprList106.getTree());
							}
							break;

					}

<<<<<<< HEAD
					char_literal107=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall933);  
					stream_CParen.add(char_literal107);
=======
					char_literal99=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall900);  
					stream_CParen.add(char_literal99);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: exprList, Fill
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 128:28: -> ^( FUNC_CALL Fill ( exprList )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:31: ^( FUNC_CALL Fill ( exprList )? )
=======
					// 129:28: -> ^( FUNC_CALL Fill ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:31: ^( FUNC_CALL Fill ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Fill.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:128:48: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:48: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:6: Stroke '(' ( exprList )? ')'
					{
					Stroke108=(Token)match(input,Stroke,FOLLOW_Stroke_in_transformCall950);  
					stream_Stroke.add(Stroke108);

					char_literal109=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall952);  
					stream_OParen.add(char_literal109);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:17: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ATan||LA25_0==Assert||LA25_0==Bool||LA25_0==COLOR_CONSTANT||(LA25_0 >= Copy && LA25_0 <= Curve)||LA25_0==Ellipse||(LA25_0 >= Excl && LA25_0 <= Expand)||LA25_0==Fill||(LA25_0 >= GetDistance && LA25_0 <= Hide)||LA25_0==Identifier||LA25_0==LAdd||(LA25_0 >= LRemove && LA25_0 <= LShape)||(LA25_0 >= Line && LA25_0 <= MirrorX)||(LA25_0 >= Move && LA25_0 <= MoveBy)||(LA25_0 >= NoFill && LA25_0 <= Number)||(LA25_0 >= OBracket && LA25_0 <= OParen)||(LA25_0 >= PI_CONSTANT && LA25_0 <= Polygon)||(LA25_0 >= Print && LA25_0 <= Println)||(LA25_0 >= Random && LA25_0 <= Rect)||(LA25_0 >= Rotate && LA25_0 <= Round)||(LA25_0 >= Scale && LA25_0 <= Size)||(LA25_0 >= String && LA25_0 <= Subtract)||LA25_0==Tan||(LA25_0 >= WIDTH_CONSTANT && LA25_0 <= Weight)) ) {
						alt25=1;
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:6: Stroke '(' ( exprList )? ')'
					{
					Stroke100=(Token)match(input,Stroke,FOLLOW_Stroke_in_transformCall917);  
					stream_Stroke.add(Stroke100);

					char_literal101=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall919);  
					stream_OParen.add(char_literal101);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:17: ( exprList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ATan||LA23_0==Assert||LA23_0==Bool||LA23_0==COLOR_CONSTANT||LA23_0==Clip||(LA23_0 >= Copy && LA23_0 <= Curve)||LA23_0==Difference||LA23_0==Ellipse||(LA23_0 >= Excl && LA23_0 <= Expand)||LA23_0==Fill||(LA23_0 >= GetDistance && LA23_0 <= Hide)||LA23_0==Identifier||LA23_0==LAdd||(LA23_0 >= LRemove && LA23_0 <= LShape)||(LA23_0 >= Line && LA23_0 <= MirrorY)||(LA23_0 >= Move && LA23_0 <= MoveBy)||(LA23_0 >= NoFill && LA23_0 <= Number)||(LA23_0 >= OBracket && LA23_0 <= OParen)||(LA23_0 >= PI_CONSTANT && LA23_0 <= Polygon)||(LA23_0 >= Print && LA23_0 <= Println)||(LA23_0 >= Random && LA23_0 <= Rect)||(LA23_0 >= Rotate && LA23_0 <= Round)||(LA23_0 >= Scale && LA23_0 <= Size)||(LA23_0 >= String && LA23_0 <= Subtract)||LA23_0==Tan||(LA23_0 >= Union && LA23_0 <= Weight)||LA23_0==Xor) ) {
						alt23=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					switch (alt25) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall954);
							exprList110=exprList();
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall921);
							exprList102=exprList();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							state._fsp--;

							stream_exprList.add(exprList110.getTree());
							}
							break;

					}

<<<<<<< HEAD
					char_literal111=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall957);  
					stream_CParen.add(char_literal111);
=======
					char_literal103=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall924);  
					stream_CParen.add(char_literal103);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: exprList, Stroke
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 129:30: -> ^( FUNC_CALL Stroke ( exprList )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:33: ^( FUNC_CALL Stroke ( exprList )? )
=======
					// 130:30: -> ^( FUNC_CALL Stroke ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:33: ^( FUNC_CALL Stroke ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Stroke.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:129:52: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:52: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:6: NoFill '(' expression ')'
					{
					NoFill112=(Token)match(input,NoFill,FOLLOW_NoFill_in_transformCall974);  
					stream_NoFill.add(NoFill112);

					char_literal113=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall976);  
					stream_OParen.add(char_literal113);

					pushFollow(FOLLOW_expression_in_transformCall978);
					expression114=expression();
					state._fsp--;

					stream_expression.add(expression114.getTree());
					char_literal115=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall980);  
					stream_CParen.add(char_literal115);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:6: NoFill '(' expression ')'
					{
					NoFill104=(Token)match(input,NoFill,FOLLOW_NoFill_in_transformCall941);  
					stream_NoFill.add(NoFill104);

					char_literal105=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall943);  
					stream_OParen.add(char_literal105);

					pushFollow(FOLLOW_expression_in_transformCall945);
					expression106=expression();
					state._fsp--;

					stream_expression.add(expression106.getTree());
					char_literal107=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall947);  
					stream_CParen.add(char_literal107);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: NoFill, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 130:31: -> ^( FUNC_CALL NoFill expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:130:34: ^( FUNC_CALL NoFill expression )
=======
					// 131:31: -> ^( FUNC_CALL NoFill expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:34: ^( FUNC_CALL NoFill expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_NoFill.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:6: NoStroke '(' expression ')'
					{
					NoStroke116=(Token)match(input,NoStroke,FOLLOW_NoStroke_in_transformCall996);  
					stream_NoStroke.add(NoStroke116);

					char_literal117=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall998);  
					stream_OParen.add(char_literal117);

					pushFollow(FOLLOW_expression_in_transformCall1000);
					expression118=expression();
					state._fsp--;

					stream_expression.add(expression118.getTree());
					char_literal119=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1002);  
					stream_CParen.add(char_literal119);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:6: NoStroke '(' expression ')'
					{
					NoStroke108=(Token)match(input,NoStroke,FOLLOW_NoStroke_in_transformCall963);  
					stream_NoStroke.add(NoStroke108);

					char_literal109=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall965);  
					stream_OParen.add(char_literal109);

					pushFollow(FOLLOW_expression_in_transformCall967);
					expression110=expression();
					state._fsp--;

					stream_expression.add(expression110.getTree());
					char_literal111=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall969);  
					stream_CParen.add(char_literal111);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: NoStroke, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 131:33: -> ^( FUNC_CALL NoStroke expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:131:36: ^( FUNC_CALL NoStroke expression )
=======
					// 132:33: -> ^( FUNC_CALL NoStroke expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:36: ^( FUNC_CALL NoStroke expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_NoStroke.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 9 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:6: Weight '(' ( exprList )? ')'
					{
					Weight120=(Token)match(input,Weight,FOLLOW_Weight_in_transformCall1018);  
					stream_Weight.add(Weight120);

					char_literal121=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1020);  
					stream_OParen.add(char_literal121);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:17: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==ATan||LA26_0==Assert||LA26_0==Bool||LA26_0==COLOR_CONSTANT||(LA26_0 >= Copy && LA26_0 <= Curve)||LA26_0==Ellipse||(LA26_0 >= Excl && LA26_0 <= Expand)||LA26_0==Fill||(LA26_0 >= GetDistance && LA26_0 <= Hide)||LA26_0==Identifier||LA26_0==LAdd||(LA26_0 >= LRemove && LA26_0 <= LShape)||(LA26_0 >= Line && LA26_0 <= MirrorX)||(LA26_0 >= Move && LA26_0 <= MoveBy)||(LA26_0 >= NoFill && LA26_0 <= Number)||(LA26_0 >= OBracket && LA26_0 <= OParen)||(LA26_0 >= PI_CONSTANT && LA26_0 <= Polygon)||(LA26_0 >= Print && LA26_0 <= Println)||(LA26_0 >= Random && LA26_0 <= Rect)||(LA26_0 >= Rotate && LA26_0 <= Round)||(LA26_0 >= Scale && LA26_0 <= Size)||(LA26_0 >= String && LA26_0 <= Subtract)||LA26_0==Tan||(LA26_0 >= WIDTH_CONSTANT && LA26_0 <= Weight)) ) {
						alt26=1;
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:6: Weight '(' ( exprList )? ')'
					{
					Weight112=(Token)match(input,Weight,FOLLOW_Weight_in_transformCall985);  
					stream_Weight.add(Weight112);

					char_literal113=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall987);  
					stream_OParen.add(char_literal113);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:17: ( exprList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ATan||LA24_0==Assert||LA24_0==Bool||LA24_0==COLOR_CONSTANT||LA24_0==Clip||(LA24_0 >= Copy && LA24_0 <= Curve)||LA24_0==Difference||LA24_0==Ellipse||(LA24_0 >= Excl && LA24_0 <= Expand)||LA24_0==Fill||(LA24_0 >= GetDistance && LA24_0 <= Hide)||LA24_0==Identifier||LA24_0==LAdd||(LA24_0 >= LRemove && LA24_0 <= LShape)||(LA24_0 >= Line && LA24_0 <= MirrorY)||(LA24_0 >= Move && LA24_0 <= MoveBy)||(LA24_0 >= NoFill && LA24_0 <= Number)||(LA24_0 >= OBracket && LA24_0 <= OParen)||(LA24_0 >= PI_CONSTANT && LA24_0 <= Polygon)||(LA24_0 >= Print && LA24_0 <= Println)||(LA24_0 >= Random && LA24_0 <= Rect)||(LA24_0 >= Rotate && LA24_0 <= Round)||(LA24_0 >= Scale && LA24_0 <= Size)||(LA24_0 >= String && LA24_0 <= Subtract)||LA24_0==Tan||(LA24_0 >= Union && LA24_0 <= Weight)||LA24_0==Xor) ) {
						alt24=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					switch (alt26) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1022);
							exprList122=exprList();
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall989);
							exprList114=exprList();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							state._fsp--;

							stream_exprList.add(exprList122.getTree());
							}
							break;

					}

<<<<<<< HEAD
					char_literal123=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1025);  
					stream_CParen.add(char_literal123);
=======
					char_literal115=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall992);  
					stream_CParen.add(char_literal115);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: exprList, Weight
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 132:30: -> ^( FUNC_CALL Weight ( exprList )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:33: ^( FUNC_CALL Weight ( exprList )? )
=======
					// 133:30: -> ^( FUNC_CALL Weight ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:33: ^( FUNC_CALL Weight ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Weight.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:132:52: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:52: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 10 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:6: Hide '(' expression ')'
					{
					Hide124=(Token)match(input,Hide,FOLLOW_Hide_in_transformCall1042);  
					stream_Hide.add(Hide124);

					char_literal125=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1044);  
					stream_OParen.add(char_literal125);

					pushFollow(FOLLOW_expression_in_transformCall1046);
					expression126=expression();
					state._fsp--;

					stream_expression.add(expression126.getTree());
					char_literal127=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1048);  
					stream_CParen.add(char_literal127);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:6: Hide '(' expression ')'
					{
					Hide116=(Token)match(input,Hide,FOLLOW_Hide_in_transformCall1009);  
					stream_Hide.add(Hide116);

					char_literal117=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1011);  
					stream_OParen.add(char_literal117);

					pushFollow(FOLLOW_expression_in_transformCall1013);
					expression118=expression();
					state._fsp--;

					stream_expression.add(expression118.getTree());
					char_literal119=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1015);  
					stream_CParen.add(char_literal119);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: Hide, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 133:29: -> ^( FUNC_CALL Hide expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:133:32: ^( FUNC_CALL Hide expression )
=======
					// 134:29: -> ^( FUNC_CALL Hide expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:32: ^( FUNC_CALL Hide expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Hide.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 11 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:6: Group '(' ( exprList )? ')'
					{
					Group128=(Token)match(input,Group,FOLLOW_Group_in_transformCall1064);  
					stream_Group.add(Group128);

					char_literal129=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1066);  
					stream_OParen.add(char_literal129);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:16: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==ATan||LA27_0==Assert||LA27_0==Bool||LA27_0==COLOR_CONSTANT||(LA27_0 >= Copy && LA27_0 <= Curve)||LA27_0==Ellipse||(LA27_0 >= Excl && LA27_0 <= Expand)||LA27_0==Fill||(LA27_0 >= GetDistance && LA27_0 <= Hide)||LA27_0==Identifier||LA27_0==LAdd||(LA27_0 >= LRemove && LA27_0 <= LShape)||(LA27_0 >= Line && LA27_0 <= MirrorX)||(LA27_0 >= Move && LA27_0 <= MoveBy)||(LA27_0 >= NoFill && LA27_0 <= Number)||(LA27_0 >= OBracket && LA27_0 <= OParen)||(LA27_0 >= PI_CONSTANT && LA27_0 <= Polygon)||(LA27_0 >= Print && LA27_0 <= Println)||(LA27_0 >= Random && LA27_0 <= Rect)||(LA27_0 >= Rotate && LA27_0 <= Round)||(LA27_0 >= Scale && LA27_0 <= Size)||(LA27_0 >= String && LA27_0 <= Subtract)||LA27_0==Tan||(LA27_0 >= WIDTH_CONSTANT && LA27_0 <= Weight)) ) {
						alt27=1;
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:6: Group '(' ( exprList )? ')'
					{
					Group120=(Token)match(input,Group,FOLLOW_Group_in_transformCall1031);  
					stream_Group.add(Group120);

					char_literal121=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1033);  
					stream_OParen.add(char_literal121);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:16: ( exprList )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ATan||LA25_0==Assert||LA25_0==Bool||LA25_0==COLOR_CONSTANT||LA25_0==Clip||(LA25_0 >= Copy && LA25_0 <= Curve)||LA25_0==Difference||LA25_0==Ellipse||(LA25_0 >= Excl && LA25_0 <= Expand)||LA25_0==Fill||(LA25_0 >= GetDistance && LA25_0 <= Hide)||LA25_0==Identifier||LA25_0==LAdd||(LA25_0 >= LRemove && LA25_0 <= LShape)||(LA25_0 >= Line && LA25_0 <= MirrorY)||(LA25_0 >= Move && LA25_0 <= MoveBy)||(LA25_0 >= NoFill && LA25_0 <= Number)||(LA25_0 >= OBracket && LA25_0 <= OParen)||(LA25_0 >= PI_CONSTANT && LA25_0 <= Polygon)||(LA25_0 >= Print && LA25_0 <= Println)||(LA25_0 >= Random && LA25_0 <= Rect)||(LA25_0 >= Rotate && LA25_0 <= Round)||(LA25_0 >= Scale && LA25_0 <= Size)||(LA25_0 >= String && LA25_0 <= Subtract)||LA25_0==Tan||(LA25_0 >= Union && LA25_0 <= Weight)||LA25_0==Xor) ) {
						alt25=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					switch (alt27) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1068);
							exprList130=exprList();
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1035);
							exprList122=exprList();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							state._fsp--;

							stream_exprList.add(exprList130.getTree());
							}
							break;

					}

<<<<<<< HEAD
					char_literal131=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1071);  
					stream_CParen.add(char_literal131);
=======
					char_literal123=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1038);  
					stream_CParen.add(char_literal123);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: exprList, Group
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 134:29: -> ^( FUNC_CALL Group ( exprList )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:32: ^( FUNC_CALL Group ( exprList )? )
=======
					// 135:29: -> ^( FUNC_CALL Group ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:32: ^( FUNC_CALL Group ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Group.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:134:50: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:50: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 12 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:6: Expand '(' expression ')'
					{
					Expand132=(Token)match(input,Expand,FOLLOW_Expand_in_transformCall1088);  
					stream_Expand.add(Expand132);

					char_literal133=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1090);  
					stream_OParen.add(char_literal133);

					pushFollow(FOLLOW_expression_in_transformCall1092);
					expression134=expression();
					state._fsp--;

					stream_expression.add(expression134.getTree());
					char_literal135=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1094);  
					stream_CParen.add(char_literal135);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:6: Expand '(' expression ')'
					{
					Expand124=(Token)match(input,Expand,FOLLOW_Expand_in_transformCall1055);  
					stream_Expand.add(Expand124);

					char_literal125=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1057);  
					stream_OParen.add(char_literal125);

					pushFollow(FOLLOW_expression_in_transformCall1059);
					expression126=expression();
					state._fsp--;

					stream_expression.add(expression126.getTree());
					char_literal127=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1061);  
					stream_CParen.add(char_literal127);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: Expand, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 135:31: -> ^( FUNC_CALL Expand expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:135:34: ^( FUNC_CALL Expand expression )
=======
					// 136:31: -> ^( FUNC_CALL Expand expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:34: ^( FUNC_CALL Expand expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Expand.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 13 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:6: Merge '(' expression ')'
					{
					Merge136=(Token)match(input,Merge,FOLLOW_Merge_in_transformCall1110);  
					stream_Merge.add(Merge136);

					char_literal137=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1112);  
					stream_OParen.add(char_literal137);

					pushFollow(FOLLOW_expression_in_transformCall1114);
					expression138=expression();
					state._fsp--;

					stream_expression.add(expression138.getTree());
					char_literal139=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1116);  
					stream_CParen.add(char_literal139);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:6: Merge '(' expression ')'
					{
					Merge128=(Token)match(input,Merge,FOLLOW_Merge_in_transformCall1077);  
					stream_Merge.add(Merge128);

					char_literal129=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1079);  
					stream_OParen.add(char_literal129);

					pushFollow(FOLLOW_expression_in_transformCall1081);
					expression130=expression();
					state._fsp--;

					stream_expression.add(expression130.getTree());
					char_literal131=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1083);  
					stream_CParen.add(char_literal131);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: expression, Merge
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 136:30: -> ^( FUNC_CALL Merge expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:136:33: ^( FUNC_CALL Merge expression )
=======
					// 137:30: -> ^( FUNC_CALL Merge expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:33: ^( FUNC_CALL Merge expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Merge.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 14 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:6: Scale '(' ( exprList )? ')'
					{
					Scale140=(Token)match(input,Scale,FOLLOW_Scale_in_transformCall1132);  
					stream_Scale.add(Scale140);

					char_literal141=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1134);  
					stream_OParen.add(char_literal141);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:16: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==ATan||LA28_0==Assert||LA28_0==Bool||LA28_0==COLOR_CONSTANT||(LA28_0 >= Copy && LA28_0 <= Curve)||LA28_0==Ellipse||(LA28_0 >= Excl && LA28_0 <= Expand)||LA28_0==Fill||(LA28_0 >= GetDistance && LA28_0 <= Hide)||LA28_0==Identifier||LA28_0==LAdd||(LA28_0 >= LRemove && LA28_0 <= LShape)||(LA28_0 >= Line && LA28_0 <= MirrorX)||(LA28_0 >= Move && LA28_0 <= MoveBy)||(LA28_0 >= NoFill && LA28_0 <= Number)||(LA28_0 >= OBracket && LA28_0 <= OParen)||(LA28_0 >= PI_CONSTANT && LA28_0 <= Polygon)||(LA28_0 >= Print && LA28_0 <= Println)||(LA28_0 >= Random && LA28_0 <= Rect)||(LA28_0 >= Rotate && LA28_0 <= Round)||(LA28_0 >= Scale && LA28_0 <= Size)||(LA28_0 >= String && LA28_0 <= Subtract)||LA28_0==Tan||(LA28_0 >= WIDTH_CONSTANT && LA28_0 <= Weight)) ) {
						alt28=1;
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:6: Scale '(' ( exprList )? ')'
					{
					Scale132=(Token)match(input,Scale,FOLLOW_Scale_in_transformCall1099);  
					stream_Scale.add(Scale132);

					char_literal133=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1101);  
					stream_OParen.add(char_literal133);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:16: ( exprList )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==ATan||LA26_0==Assert||LA26_0==Bool||LA26_0==COLOR_CONSTANT||LA26_0==Clip||(LA26_0 >= Copy && LA26_0 <= Curve)||LA26_0==Difference||LA26_0==Ellipse||(LA26_0 >= Excl && LA26_0 <= Expand)||LA26_0==Fill||(LA26_0 >= GetDistance && LA26_0 <= Hide)||LA26_0==Identifier||LA26_0==LAdd||(LA26_0 >= LRemove && LA26_0 <= LShape)||(LA26_0 >= Line && LA26_0 <= MirrorY)||(LA26_0 >= Move && LA26_0 <= MoveBy)||(LA26_0 >= NoFill && LA26_0 <= Number)||(LA26_0 >= OBracket && LA26_0 <= OParen)||(LA26_0 >= PI_CONSTANT && LA26_0 <= Polygon)||(LA26_0 >= Print && LA26_0 <= Println)||(LA26_0 >= Random && LA26_0 <= Rect)||(LA26_0 >= Rotate && LA26_0 <= Round)||(LA26_0 >= Scale && LA26_0 <= Size)||(LA26_0 >= String && LA26_0 <= Subtract)||LA26_0==Tan||(LA26_0 >= Union && LA26_0 <= Weight)||LA26_0==Xor) ) {
						alt26=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					switch (alt28) {
						case 1 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1136);
							exprList142=exprList();
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1103);
							exprList134=exprList();
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							state._fsp--;

							stream_exprList.add(exprList142.getTree());
							}
							break;

					}

<<<<<<< HEAD
					char_literal143=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1139);  
					stream_CParen.add(char_literal143);
=======
					char_literal135=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1106);  
					stream_CParen.add(char_literal135);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: exprList, Scale
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 137:29: -> ^( FUNC_CALL Scale ( exprList )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:32: ^( FUNC_CALL Scale ( exprList )? )
=======
					// 138:29: -> ^( FUNC_CALL Scale ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:32: ^( FUNC_CALL Scale ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Scale.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:137:50: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:50: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 15 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:6: MirrorX '(' expression ')'
					{
					MirrorX144=(Token)match(input,MirrorX,FOLLOW_MirrorX_in_transformCall1156);  
					stream_MirrorX.add(MirrorX144);

					char_literal145=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1158);  
					stream_OParen.add(char_literal145);

					pushFollow(FOLLOW_expression_in_transformCall1160);
					expression146=expression();
					state._fsp--;

					stream_expression.add(expression146.getTree());
					char_literal147=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1162);  
					stream_CParen.add(char_literal147);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:6: MirrorX '(' expression ')'
					{
					MirrorX136=(Token)match(input,MirrorX,FOLLOW_MirrorX_in_transformCall1123);  
					stream_MirrorX.add(MirrorX136);

					char_literal137=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1125);  
					stream_OParen.add(char_literal137);

					pushFollow(FOLLOW_expression_in_transformCall1127);
					expression138=expression();
					state._fsp--;

					stream_expression.add(expression138.getTree());
					char_literal139=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1129);  
					stream_CParen.add(char_literal139);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: MirrorX, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 138:32: -> ^( FUNC_CALL MirrorX expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:138:35: ^( FUNC_CALL MirrorX expression )
=======
					// 139:32: -> ^( FUNC_CALL MirrorX expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:139:35: ^( FUNC_CALL MirrorX expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_MirrorX.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 16 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:6: MirrorY '(' expression ')'
					{
					MirrorY140=(Token)match(input,MirrorY,FOLLOW_MirrorY_in_transformCall1145);  
					stream_MirrorY.add(MirrorY140);

					char_literal141=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1147);  
					stream_OParen.add(char_literal141);

					pushFollow(FOLLOW_expression_in_transformCall1149);
					expression142=expression();
					state._fsp--;

					stream_expression.add(expression142.getTree());
					char_literal143=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1151);  
					stream_CParen.add(char_literal143);

					// AST REWRITE
					// elements: expression, MirrorY
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 140:32: -> ^( FUNC_CALL MirrorY expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:140:35: ^( FUNC_CALL MirrorY expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_MirrorY.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 17 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:6: Union '(' ( exprList )? ')'
					{
					Union144=(Token)match(input,Union,FOLLOW_Union_in_transformCall1167);  
					stream_Union.add(Union144);

					char_literal145=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1169);  
					stream_OParen.add(char_literal145);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:16: ( exprList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==ATan||LA27_0==Assert||LA27_0==Bool||LA27_0==COLOR_CONSTANT||LA27_0==Clip||(LA27_0 >= Copy && LA27_0 <= Curve)||LA27_0==Difference||LA27_0==Ellipse||(LA27_0 >= Excl && LA27_0 <= Expand)||LA27_0==Fill||(LA27_0 >= GetDistance && LA27_0 <= Hide)||LA27_0==Identifier||LA27_0==LAdd||(LA27_0 >= LRemove && LA27_0 <= LShape)||(LA27_0 >= Line && LA27_0 <= MirrorY)||(LA27_0 >= Move && LA27_0 <= MoveBy)||(LA27_0 >= NoFill && LA27_0 <= Number)||(LA27_0 >= OBracket && LA27_0 <= OParen)||(LA27_0 >= PI_CONSTANT && LA27_0 <= Polygon)||(LA27_0 >= Print && LA27_0 <= Println)||(LA27_0 >= Random && LA27_0 <= Rect)||(LA27_0 >= Rotate && LA27_0 <= Round)||(LA27_0 >= Scale && LA27_0 <= Size)||(LA27_0 >= String && LA27_0 <= Subtract)||LA27_0==Tan||(LA27_0 >= Union && LA27_0 <= Weight)||LA27_0==Xor) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:16: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1171);
							exprList146=exprList();
							state._fsp--;

							stream_exprList.add(exprList146.getTree());
							}
							break;

					}

					char_literal147=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1174);  
					stream_CParen.add(char_literal147);

					// AST REWRITE
					// elements: exprList, Union
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 141:29: -> ^( FUNC_CALL Union ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:32: ^( FUNC_CALL Union ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Union.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:141:50: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 18 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:6: Difference '(' ( exprList )? ')'
					{
					Difference148=(Token)match(input,Difference,FOLLOW_Difference_in_transformCall1191);  
					stream_Difference.add(Difference148);

					char_literal149=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1193);  
					stream_OParen.add(char_literal149);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:21: ( exprList )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==ATan||LA28_0==Assert||LA28_0==Bool||LA28_0==COLOR_CONSTANT||LA28_0==Clip||(LA28_0 >= Copy && LA28_0 <= Curve)||LA28_0==Difference||LA28_0==Ellipse||(LA28_0 >= Excl && LA28_0 <= Expand)||LA28_0==Fill||(LA28_0 >= GetDistance && LA28_0 <= Hide)||LA28_0==Identifier||LA28_0==LAdd||(LA28_0 >= LRemove && LA28_0 <= LShape)||(LA28_0 >= Line && LA28_0 <= MirrorY)||(LA28_0 >= Move && LA28_0 <= MoveBy)||(LA28_0 >= NoFill && LA28_0 <= Number)||(LA28_0 >= OBracket && LA28_0 <= OParen)||(LA28_0 >= PI_CONSTANT && LA28_0 <= Polygon)||(LA28_0 >= Print && LA28_0 <= Println)||(LA28_0 >= Random && LA28_0 <= Rect)||(LA28_0 >= Rotate && LA28_0 <= Round)||(LA28_0 >= Scale && LA28_0 <= Size)||(LA28_0 >= String && LA28_0 <= Subtract)||LA28_0==Tan||(LA28_0 >= Union && LA28_0 <= Weight)||LA28_0==Xor) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1195);
							exprList150=exprList();
							state._fsp--;

							stream_exprList.add(exprList150.getTree());
							}
							break;

					}

					char_literal151=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1198);  
					stream_CParen.add(char_literal151);

					// AST REWRITE
					// elements: exprList, Difference
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 142:34: -> ^( FUNC_CALL Difference ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:37: ^( FUNC_CALL Difference ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Difference.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:60: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 19 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:6: Clip '(' ( exprList )? ')'
					{
					Clip152=(Token)match(input,Clip,FOLLOW_Clip_in_transformCall1215);  
					stream_Clip.add(Clip152);

					char_literal153=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1217);  
					stream_OParen.add(char_literal153);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:15: ( exprList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==ATan||LA29_0==Assert||LA29_0==Bool||LA29_0==COLOR_CONSTANT||LA29_0==Clip||(LA29_0 >= Copy && LA29_0 <= Curve)||LA29_0==Difference||LA29_0==Ellipse||(LA29_0 >= Excl && LA29_0 <= Expand)||LA29_0==Fill||(LA29_0 >= GetDistance && LA29_0 <= Hide)||LA29_0==Identifier||LA29_0==LAdd||(LA29_0 >= LRemove && LA29_0 <= LShape)||(LA29_0 >= Line && LA29_0 <= MirrorY)||(LA29_0 >= Move && LA29_0 <= MoveBy)||(LA29_0 >= NoFill && LA29_0 <= Number)||(LA29_0 >= OBracket && LA29_0 <= OParen)||(LA29_0 >= PI_CONSTANT && LA29_0 <= Polygon)||(LA29_0 >= Print && LA29_0 <= Println)||(LA29_0 >= Random && LA29_0 <= Rect)||(LA29_0 >= Rotate && LA29_0 <= Round)||(LA29_0 >= Scale && LA29_0 <= Size)||(LA29_0 >= String && LA29_0 <= Subtract)||LA29_0==Tan||(LA29_0 >= Union && LA29_0 <= Weight)||LA29_0==Xor) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:15: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1219);
							exprList154=exprList();
							state._fsp--;

							stream_exprList.add(exprList154.getTree());
							}
							break;

					}

					char_literal155=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1222);  
					stream_CParen.add(char_literal155);

					// AST REWRITE
					// elements: Clip, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 143:28: -> ^( FUNC_CALL Clip ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:31: ^( FUNC_CALL Clip ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Clip.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:48: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 20 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:6: Xor '(' ( exprList )? ')'
					{
					Xor156=(Token)match(input,Xor,FOLLOW_Xor_in_transformCall1239);  
					stream_Xor.add(Xor156);

					char_literal157=(Token)match(input,OParen,FOLLOW_OParen_in_transformCall1241);  
					stream_OParen.add(char_literal157);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:14: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==ATan||LA30_0==Assert||LA30_0==Bool||LA30_0==COLOR_CONSTANT||LA30_0==Clip||(LA30_0 >= Copy && LA30_0 <= Curve)||LA30_0==Difference||LA30_0==Ellipse||(LA30_0 >= Excl && LA30_0 <= Expand)||LA30_0==Fill||(LA30_0 >= GetDistance && LA30_0 <= Hide)||LA30_0==Identifier||LA30_0==LAdd||(LA30_0 >= LRemove && LA30_0 <= LShape)||(LA30_0 >= Line && LA30_0 <= MirrorY)||(LA30_0 >= Move && LA30_0 <= MoveBy)||(LA30_0 >= NoFill && LA30_0 <= Number)||(LA30_0 >= OBracket && LA30_0 <= OParen)||(LA30_0 >= PI_CONSTANT && LA30_0 <= Polygon)||(LA30_0 >= Print && LA30_0 <= Println)||(LA30_0 >= Random && LA30_0 <= Rect)||(LA30_0 >= Rotate && LA30_0 <= Round)||(LA30_0 >= Scale && LA30_0 <= Size)||(LA30_0 >= String && LA30_0 <= Subtract)||LA30_0==Tan||(LA30_0 >= Union && LA30_0 <= Weight)||LA30_0==Xor) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:14: exprList
							{
							pushFollow(FOLLOW_exprList_in_transformCall1243);
							exprList158=exprList();
							state._fsp--;

							stream_exprList.add(exprList158.getTree());
							}
							break;

					}

					char_literal159=(Token)match(input,CParen,FOLLOW_CParen_in_transformCall1246);  
					stream_CParen.add(char_literal159);

					// AST REWRITE
					// elements: exprList, Xor
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 144:27: -> ^( FUNC_CALL Xor ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:30: ^( FUNC_CALL Xor ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Xor.nextNode());
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:46: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "transformCall"


	public static class getCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "getCall"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:142:4: getCall : ( GetWidth '(' expression ')' -> ^( FUNC_CALL GetWidth expression ) | GetHeight '(' expression ')' -> ^( FUNC_CALL GetHeight expression ) | GetX '(' expression ')' -> ^( FUNC_CALL GetX expression ) | GetY '(' expression ')' -> ^( FUNC_CALL GetY expression ) | GetOrigin '(' expression ')' -> ^( FUNC_CALL GetOrigin expression ) | GetRotation '(' expression ')' -> ^( FUNC_CALL GetRotation expression ) | GetFill '(' expression ')' -> ^( FUNC_CALL GetFill expression ) | GetStroke '(' expression ')' -> ^( FUNC_CALL GetStroke expression ) | GetStart '(' expression ')' -> ^( FUNC_CALL GetStart expression ) | GetEnd '(' expression ')' -> ^( FUNC_CALL GetEnd expression ) | GetDistance '(' ( exprList )? ')' -> ^( FUNC_CALL GetDistance ( exprList )? ) );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:4: getCall : ( GetWidth '(' expression ')' -> ^( FUNC_CALL GetWidth expression ) | GetHeight '(' expression ')' -> ^( FUNC_CALL GetHeight expression ) | GetX '(' expression ')' -> ^( FUNC_CALL GetX expression ) | GetY '(' expression ')' -> ^( FUNC_CALL GetY expression ) | GetOrigin '(' expression ')' -> ^( FUNC_CALL GetOrigin expression ) | GetRotation '(' expression ')' -> ^( FUNC_CALL GetRotation expression ) | GetFill '(' expression ')' -> ^( FUNC_CALL GetFill expression ) | GetStroke '(' expression ')' -> ^( FUNC_CALL GetStroke expression ) | GetStart '(' expression ')' -> ^( FUNC_CALL GetStart expression ) | GetEnd '(' expression ')' -> ^( FUNC_CALL GetEnd expression ) | GetDistance '(' ( exprList )? ')' -> ^( FUNC_CALL GetDistance ( exprList )? ) );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.getCall_return getCall() throws RecognitionException {
		PogoParser.getCall_return retval = new PogoParser.getCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token GetWidth148=null;
		Token char_literal149=null;
		Token char_literal151=null;
		Token GetHeight152=null;
		Token char_literal153=null;
		Token char_literal155=null;
		Token GetX156=null;
		Token char_literal157=null;
		Token char_literal159=null;
		Token GetY160=null;
		Token char_literal161=null;
		Token char_literal163=null;
		Token GetOrigin164=null;
		Token char_literal165=null;
		Token char_literal167=null;
		Token GetRotation168=null;
		Token char_literal169=null;
		Token char_literal171=null;
		Token GetFill172=null;
		Token char_literal173=null;
		Token char_literal175=null;
		Token GetStroke176=null;
		Token char_literal177=null;
		Token char_literal179=null;
		Token GetStart180=null;
		Token char_literal181=null;
		Token char_literal183=null;
		Token GetEnd184=null;
		Token char_literal185=null;
		Token char_literal187=null;
		Token GetDistance188=null;
		Token char_literal189=null;
		Token char_literal191=null;
		ParserRuleReturnScope expression150 =null;
		ParserRuleReturnScope expression154 =null;
		ParserRuleReturnScope expression158 =null;
=======
		Token GetWidth160=null;
		Token char_literal161=null;
		Token char_literal163=null;
		Token GetHeight164=null;
		Token char_literal165=null;
		Token char_literal167=null;
		Token GetX168=null;
		Token char_literal169=null;
		Token char_literal171=null;
		Token GetY172=null;
		Token char_literal173=null;
		Token char_literal175=null;
		Token GetOrigin176=null;
		Token char_literal177=null;
		Token char_literal179=null;
		Token GetRotation180=null;
		Token char_literal181=null;
		Token char_literal183=null;
		Token GetFill184=null;
		Token char_literal185=null;
		Token char_literal187=null;
		Token GetStroke188=null;
		Token char_literal189=null;
		Token char_literal191=null;
		Token GetStart192=null;
		Token char_literal193=null;
		Token char_literal195=null;
		Token GetEnd196=null;
		Token char_literal197=null;
		Token char_literal199=null;
		Token GetDistance200=null;
		Token char_literal201=null;
		Token char_literal203=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		ParserRuleReturnScope expression162 =null;
		ParserRuleReturnScope expression166 =null;
		ParserRuleReturnScope expression170 =null;
		ParserRuleReturnScope expression174 =null;
		ParserRuleReturnScope expression178 =null;
		ParserRuleReturnScope expression182 =null;
		ParserRuleReturnScope expression186 =null;
<<<<<<< HEAD
		ParserRuleReturnScope exprList190 =null;

		Object GetWidth148_tree=null;
		Object char_literal149_tree=null;
		Object char_literal151_tree=null;
		Object GetHeight152_tree=null;
		Object char_literal153_tree=null;
		Object char_literal155_tree=null;
		Object GetX156_tree=null;
		Object char_literal157_tree=null;
		Object char_literal159_tree=null;
		Object GetY160_tree=null;
		Object char_literal161_tree=null;
		Object char_literal163_tree=null;
		Object GetOrigin164_tree=null;
		Object char_literal165_tree=null;
		Object char_literal167_tree=null;
		Object GetRotation168_tree=null;
		Object char_literal169_tree=null;
		Object char_literal171_tree=null;
		Object GetFill172_tree=null;
		Object char_literal173_tree=null;
		Object char_literal175_tree=null;
		Object GetStroke176_tree=null;
		Object char_literal177_tree=null;
		Object char_literal179_tree=null;
		Object GetStart180_tree=null;
		Object char_literal181_tree=null;
		Object char_literal183_tree=null;
		Object GetEnd184_tree=null;
		Object char_literal185_tree=null;
		Object char_literal187_tree=null;
		Object GetDistance188_tree=null;
		Object char_literal189_tree=null;
		Object char_literal191_tree=null;
=======
		ParserRuleReturnScope expression190 =null;
		ParserRuleReturnScope expression194 =null;
		ParserRuleReturnScope expression198 =null;
		ParserRuleReturnScope exprList202 =null;

		Object GetWidth160_tree=null;
		Object char_literal161_tree=null;
		Object char_literal163_tree=null;
		Object GetHeight164_tree=null;
		Object char_literal165_tree=null;
		Object char_literal167_tree=null;
		Object GetX168_tree=null;
		Object char_literal169_tree=null;
		Object char_literal171_tree=null;
		Object GetY172_tree=null;
		Object char_literal173_tree=null;
		Object char_literal175_tree=null;
		Object GetOrigin176_tree=null;
		Object char_literal177_tree=null;
		Object char_literal179_tree=null;
		Object GetRotation180_tree=null;
		Object char_literal181_tree=null;
		Object char_literal183_tree=null;
		Object GetFill184_tree=null;
		Object char_literal185_tree=null;
		Object char_literal187_tree=null;
		Object GetStroke188_tree=null;
		Object char_literal189_tree=null;
		Object char_literal191_tree=null;
		Object GetStart192_tree=null;
		Object char_literal193_tree=null;
		Object char_literal195_tree=null;
		Object GetEnd196_tree=null;
		Object char_literal197_tree=null;
		Object char_literal199_tree=null;
		Object GetDistance200_tree=null;
		Object char_literal201_tree=null;
		Object char_literal203_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_GetFill=new RewriteRuleTokenStream(adaptor,"token GetFill");
		RewriteRuleTokenStream stream_GetEnd=new RewriteRuleTokenStream(adaptor,"token GetEnd");
		RewriteRuleTokenStream stream_GetRotation=new RewriteRuleTokenStream(adaptor,"token GetRotation");
		RewriteRuleTokenStream stream_GetStroke=new RewriteRuleTokenStream(adaptor,"token GetStroke");
		RewriteRuleTokenStream stream_GetWidth=new RewriteRuleTokenStream(adaptor,"token GetWidth");
		RewriteRuleTokenStream stream_GetStart=new RewriteRuleTokenStream(adaptor,"token GetStart");
		RewriteRuleTokenStream stream_GetDistance=new RewriteRuleTokenStream(adaptor,"token GetDistance");
		RewriteRuleTokenStream stream_GetX=new RewriteRuleTokenStream(adaptor,"token GetX");
		RewriteRuleTokenStream stream_GetY=new RewriteRuleTokenStream(adaptor,"token GetY");
		RewriteRuleTokenStream stream_GetOrigin=new RewriteRuleTokenStream(adaptor,"token GetOrigin");
		RewriteRuleTokenStream stream_GetHeight=new RewriteRuleTokenStream(adaptor,"token GetHeight");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:3: ( GetWidth '(' expression ')' -> ^( FUNC_CALL GetWidth expression ) | GetHeight '(' expression ')' -> ^( FUNC_CALL GetHeight expression ) | GetX '(' expression ')' -> ^( FUNC_CALL GetX expression ) | GetY '(' expression ')' -> ^( FUNC_CALL GetY expression ) | GetOrigin '(' expression ')' -> ^( FUNC_CALL GetOrigin expression ) | GetRotation '(' expression ')' -> ^( FUNC_CALL GetRotation expression ) | GetFill '(' expression ')' -> ^( FUNC_CALL GetFill expression ) | GetStroke '(' expression ')' -> ^( FUNC_CALL GetStroke expression ) | GetStart '(' expression ')' -> ^( FUNC_CALL GetStart expression ) | GetEnd '(' expression ')' -> ^( FUNC_CALL GetEnd expression ) | GetDistance '(' ( exprList )? ')' -> ^( FUNC_CALL GetDistance ( exprList )? ) )
			int alt31=11;
			switch ( input.LA(1) ) {
			case GetWidth:
				{
				alt31=1;
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:3: ( GetWidth '(' expression ')' -> ^( FUNC_CALL GetWidth expression ) | GetHeight '(' expression ')' -> ^( FUNC_CALL GetHeight expression ) | GetX '(' expression ')' -> ^( FUNC_CALL GetX expression ) | GetY '(' expression ')' -> ^( FUNC_CALL GetY expression ) | GetOrigin '(' expression ')' -> ^( FUNC_CALL GetOrigin expression ) | GetRotation '(' expression ')' -> ^( FUNC_CALL GetRotation expression ) | GetFill '(' expression ')' -> ^( FUNC_CALL GetFill expression ) | GetStroke '(' expression ')' -> ^( FUNC_CALL GetStroke expression ) | GetStart '(' expression ')' -> ^( FUNC_CALL GetStart expression ) | GetEnd '(' expression ')' -> ^( FUNC_CALL GetEnd expression ) | GetDistance '(' ( exprList )? ')' -> ^( FUNC_CALL GetDistance ( exprList )? ) )
			int alt33=11;
			switch ( input.LA(1) ) {
			case GetWidth:
				{
				alt33=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case GetHeight:
				{
<<<<<<< HEAD
				alt31=2;
=======
				alt33=2;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case GetX:
				{
<<<<<<< HEAD
				alt31=3;
=======
				alt33=3;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case GetY:
				{
<<<<<<< HEAD
				alt31=4;
=======
				alt33=4;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case GetOrigin:
				{
<<<<<<< HEAD
				alt31=5;
=======
				alt33=5;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case GetRotation:
				{
<<<<<<< HEAD
				alt31=6;
=======
				alt33=6;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case GetFill:
				{
<<<<<<< HEAD
				alt31=7;
=======
				alt33=7;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case GetStroke:
				{
<<<<<<< HEAD
				alt31=8;
=======
				alt33=8;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case GetStart:
				{
<<<<<<< HEAD
				alt31=9;
=======
				alt33=9;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case GetEnd:
				{
<<<<<<< HEAD
				alt31=10;
=======
				alt33=10;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case GetDistance:
				{
<<<<<<< HEAD
				alt31=11;
=======
				alt33=11;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			default:
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:5: GetWidth '(' expression ')'
					{
					GetWidth148=(Token)match(input,GetWidth,FOLLOW_GetWidth_in_getCall1194);  
					stream_GetWidth.add(GetWidth148);

					char_literal149=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1196);  
					stream_OParen.add(char_literal149);

					pushFollow(FOLLOW_expression_in_getCall1198);
					expression150=expression();
					state._fsp--;

					stream_expression.add(expression150.getTree());
					char_literal151=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1200);  
					stream_CParen.add(char_literal151);
=======
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:5: GetWidth '(' expression ')'
					{
					GetWidth160=(Token)match(input,GetWidth,FOLLOW_GetWidth_in_getCall1280);  
					stream_GetWidth.add(GetWidth160);

					char_literal161=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1282);  
					stream_OParen.add(char_literal161);

					pushFollow(FOLLOW_expression_in_getCall1284);
					expression162=expression();
					state._fsp--;

					stream_expression.add(expression162.getTree());
					char_literal163=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1286);  
					stream_CParen.add(char_literal163);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: expression, GetWidth
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 143:32: -> ^( FUNC_CALL GetWidth expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:143:35: ^( FUNC_CALL GetWidth expression )
=======
					// 149:32: -> ^( FUNC_CALL GetWidth expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:35: ^( FUNC_CALL GetWidth expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetWidth.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:4: GetHeight '(' expression ')'
					{
					GetHeight152=(Token)match(input,GetHeight,FOLLOW_GetHeight_in_getCall1214);  
					stream_GetHeight.add(GetHeight152);

					char_literal153=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1216);  
					stream_OParen.add(char_literal153);

					pushFollow(FOLLOW_expression_in_getCall1218);
					expression154=expression();
					state._fsp--;

					stream_expression.add(expression154.getTree());
					char_literal155=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1220);  
					stream_CParen.add(char_literal155);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:4: GetHeight '(' expression ')'
					{
					GetHeight164=(Token)match(input,GetHeight,FOLLOW_GetHeight_in_getCall1300);  
					stream_GetHeight.add(GetHeight164);

					char_literal165=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1302);  
					stream_OParen.add(char_literal165);

					pushFollow(FOLLOW_expression_in_getCall1304);
					expression166=expression();
					state._fsp--;

					stream_expression.add(expression166.getTree());
					char_literal167=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1306);  
					stream_CParen.add(char_literal167);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: expression, GetHeight
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 144:32: -> ^( FUNC_CALL GetHeight expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:144:35: ^( FUNC_CALL GetHeight expression )
=======
					// 150:32: -> ^( FUNC_CALL GetHeight expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:35: ^( FUNC_CALL GetHeight expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetHeight.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:4: GetX '(' expression ')'
					{
					GetX156=(Token)match(input,GetX,FOLLOW_GetX_in_getCall1234);  
					stream_GetX.add(GetX156);

					char_literal157=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1236);  
					stream_OParen.add(char_literal157);

					pushFollow(FOLLOW_expression_in_getCall1238);
					expression158=expression();
					state._fsp--;

					stream_expression.add(expression158.getTree());
					char_literal159=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1240);  
					stream_CParen.add(char_literal159);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:4: GetX '(' expression ')'
					{
					GetX168=(Token)match(input,GetX,FOLLOW_GetX_in_getCall1320);  
					stream_GetX.add(GetX168);

					char_literal169=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1322);  
					stream_OParen.add(char_literal169);

					pushFollow(FOLLOW_expression_in_getCall1324);
					expression170=expression();
					state._fsp--;

					stream_expression.add(expression170.getTree());
					char_literal171=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1326);  
					stream_CParen.add(char_literal171);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: expression, GetX
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 145:27: -> ^( FUNC_CALL GetX expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:145:30: ^( FUNC_CALL GetX expression )
=======
					// 151:27: -> ^( FUNC_CALL GetX expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:30: ^( FUNC_CALL GetX expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetX.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:4: GetY '(' expression ')'
					{
					GetY160=(Token)match(input,GetY,FOLLOW_GetY_in_getCall1254);  
					stream_GetY.add(GetY160);

					char_literal161=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1256);  
					stream_OParen.add(char_literal161);

					pushFollow(FOLLOW_expression_in_getCall1258);
					expression162=expression();
					state._fsp--;

					stream_expression.add(expression162.getTree());
					char_literal163=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1260);  
					stream_CParen.add(char_literal163);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:4: GetY '(' expression ')'
					{
					GetY172=(Token)match(input,GetY,FOLLOW_GetY_in_getCall1340);  
					stream_GetY.add(GetY172);

					char_literal173=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1342);  
					stream_OParen.add(char_literal173);

					pushFollow(FOLLOW_expression_in_getCall1344);
					expression174=expression();
					state._fsp--;

					stream_expression.add(expression174.getTree());
					char_literal175=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1346);  
					stream_CParen.add(char_literal175);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: GetY, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 146:27: -> ^( FUNC_CALL GetY expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:146:30: ^( FUNC_CALL GetY expression )
=======
					// 152:27: -> ^( FUNC_CALL GetY expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:30: ^( FUNC_CALL GetY expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetY.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:4: GetOrigin '(' expression ')'
					{
					GetOrigin164=(Token)match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1274);  
					stream_GetOrigin.add(GetOrigin164);

					char_literal165=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1276);  
					stream_OParen.add(char_literal165);

					pushFollow(FOLLOW_expression_in_getCall1278);
					expression166=expression();
					state._fsp--;

					stream_expression.add(expression166.getTree());
					char_literal167=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1280);  
					stream_CParen.add(char_literal167);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:153:4: GetOrigin '(' expression ')'
					{
					GetOrigin176=(Token)match(input,GetOrigin,FOLLOW_GetOrigin_in_getCall1360);  
					stream_GetOrigin.add(GetOrigin176);

					char_literal177=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1362);  
					stream_OParen.add(char_literal177);

					pushFollow(FOLLOW_expression_in_getCall1364);
					expression178=expression();
					state._fsp--;

					stream_expression.add(expression178.getTree());
					char_literal179=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1366);  
					stream_CParen.add(char_literal179);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: expression, GetOrigin
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 147:32: -> ^( FUNC_CALL GetOrigin expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:147:35: ^( FUNC_CALL GetOrigin expression )
=======
					// 153:32: -> ^( FUNC_CALL GetOrigin expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:153:35: ^( FUNC_CALL GetOrigin expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetOrigin.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:4: GetRotation '(' expression ')'
					{
					GetRotation168=(Token)match(input,GetRotation,FOLLOW_GetRotation_in_getCall1294);  
					stream_GetRotation.add(GetRotation168);

					char_literal169=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1296);  
					stream_OParen.add(char_literal169);

					pushFollow(FOLLOW_expression_in_getCall1298);
					expression170=expression();
					state._fsp--;

					stream_expression.add(expression170.getTree());
					char_literal171=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1300);  
					stream_CParen.add(char_literal171);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:154:4: GetRotation '(' expression ')'
					{
					GetRotation180=(Token)match(input,GetRotation,FOLLOW_GetRotation_in_getCall1380);  
					stream_GetRotation.add(GetRotation180);

					char_literal181=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1382);  
					stream_OParen.add(char_literal181);

					pushFollow(FOLLOW_expression_in_getCall1384);
					expression182=expression();
					state._fsp--;

					stream_expression.add(expression182.getTree());
					char_literal183=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1386);  
					stream_CParen.add(char_literal183);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: GetRotation, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 148:34: -> ^( FUNC_CALL GetRotation expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:148:37: ^( FUNC_CALL GetRotation expression )
=======
					// 154:34: -> ^( FUNC_CALL GetRotation expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:154:37: ^( FUNC_CALL GetRotation expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetRotation.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:4: GetFill '(' expression ')'
					{
					GetFill172=(Token)match(input,GetFill,FOLLOW_GetFill_in_getCall1314);  
					stream_GetFill.add(GetFill172);

					char_literal173=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1316);  
					stream_OParen.add(char_literal173);

					pushFollow(FOLLOW_expression_in_getCall1318);
					expression174=expression();
					state._fsp--;

					stream_expression.add(expression174.getTree());
					char_literal175=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1320);  
					stream_CParen.add(char_literal175);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:4: GetFill '(' expression ')'
					{
					GetFill184=(Token)match(input,GetFill,FOLLOW_GetFill_in_getCall1400);  
					stream_GetFill.add(GetFill184);

					char_literal185=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1402);  
					stream_OParen.add(char_literal185);

					pushFollow(FOLLOW_expression_in_getCall1404);
					expression186=expression();
					state._fsp--;

					stream_expression.add(expression186.getTree());
					char_literal187=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1406);  
					stream_CParen.add(char_literal187);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: GetFill, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 149:30: -> ^( FUNC_CALL GetFill expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:149:33: ^( FUNC_CALL GetFill expression )
=======
					// 155:30: -> ^( FUNC_CALL GetFill expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:155:33: ^( FUNC_CALL GetFill expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetFill.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:4: GetStroke '(' expression ')'
					{
					GetStroke176=(Token)match(input,GetStroke,FOLLOW_GetStroke_in_getCall1334);  
					stream_GetStroke.add(GetStroke176);

					char_literal177=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1336);  
					stream_OParen.add(char_literal177);

					pushFollow(FOLLOW_expression_in_getCall1338);
					expression178=expression();
					state._fsp--;

					stream_expression.add(expression178.getTree());
					char_literal179=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1340);  
					stream_CParen.add(char_literal179);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:4: GetStroke '(' expression ')'
					{
					GetStroke188=(Token)match(input,GetStroke,FOLLOW_GetStroke_in_getCall1420);  
					stream_GetStroke.add(GetStroke188);

					char_literal189=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1422);  
					stream_OParen.add(char_literal189);

					pushFollow(FOLLOW_expression_in_getCall1424);
					expression190=expression();
					state._fsp--;

					stream_expression.add(expression190.getTree());
					char_literal191=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1426);  
					stream_CParen.add(char_literal191);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: GetStroke, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 150:32: -> ^( FUNC_CALL GetStroke expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:150:35: ^( FUNC_CALL GetStroke expression )
=======
					// 156:32: -> ^( FUNC_CALL GetStroke expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:35: ^( FUNC_CALL GetStroke expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetStroke.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 9 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:4: GetStart '(' expression ')'
					{
					GetStart180=(Token)match(input,GetStart,FOLLOW_GetStart_in_getCall1354);  
					stream_GetStart.add(GetStart180);

					char_literal181=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1356);  
					stream_OParen.add(char_literal181);

					pushFollow(FOLLOW_expression_in_getCall1358);
					expression182=expression();
					state._fsp--;

					stream_expression.add(expression182.getTree());
					char_literal183=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1360);  
					stream_CParen.add(char_literal183);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:4: GetStart '(' expression ')'
					{
					GetStart192=(Token)match(input,GetStart,FOLLOW_GetStart_in_getCall1440);  
					stream_GetStart.add(GetStart192);

					char_literal193=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1442);  
					stream_OParen.add(char_literal193);

					pushFollow(FOLLOW_expression_in_getCall1444);
					expression194=expression();
					state._fsp--;

					stream_expression.add(expression194.getTree());
					char_literal195=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1446);  
					stream_CParen.add(char_literal195);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: expression, GetStart
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 151:31: -> ^( FUNC_CALL GetStart expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:151:34: ^( FUNC_CALL GetStart expression )
=======
					// 157:31: -> ^( FUNC_CALL GetStart expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:34: ^( FUNC_CALL GetStart expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetStart.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 10 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:4: GetEnd '(' expression ')'
					{
					GetEnd184=(Token)match(input,GetEnd,FOLLOW_GetEnd_in_getCall1374);  
					stream_GetEnd.add(GetEnd184);

					char_literal185=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1376);  
					stream_OParen.add(char_literal185);

					pushFollow(FOLLOW_expression_in_getCall1378);
					expression186=expression();
					state._fsp--;

					stream_expression.add(expression186.getTree());
					char_literal187=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1380);  
					stream_CParen.add(char_literal187);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:4: GetEnd '(' expression ')'
					{
					GetEnd196=(Token)match(input,GetEnd,FOLLOW_GetEnd_in_getCall1460);  
					stream_GetEnd.add(GetEnd196);

					char_literal197=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1462);  
					stream_OParen.add(char_literal197);

					pushFollow(FOLLOW_expression_in_getCall1464);
					expression198=expression();
					state._fsp--;

					stream_expression.add(expression198.getTree());
					char_literal199=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1466);  
					stream_CParen.add(char_literal199);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: GetEnd, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 152:29: -> ^( FUNC_CALL GetEnd expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:152:32: ^( FUNC_CALL GetEnd expression )
=======
					// 158:29: -> ^( FUNC_CALL GetEnd expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:32: ^( FUNC_CALL GetEnd expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetEnd.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 11 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:153:5: GetDistance '(' ( exprList )? ')'
					{
					GetDistance188=(Token)match(input,GetDistance,FOLLOW_GetDistance_in_getCall1396);  
					stream_GetDistance.add(GetDistance188);

					char_literal189=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1398);  
					stream_OParen.add(char_literal189);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:153:21: ( exprList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==ATan||LA30_0==Assert||LA30_0==Bool||LA30_0==COLOR_CONSTANT||(LA30_0 >= Copy && LA30_0 <= Curve)||LA30_0==Ellipse||(LA30_0 >= Excl && LA30_0 <= Expand)||LA30_0==Fill||(LA30_0 >= GetDistance && LA30_0 <= Hide)||LA30_0==Identifier||LA30_0==LAdd||(LA30_0 >= LRemove && LA30_0 <= LShape)||(LA30_0 >= Line && LA30_0 <= MirrorX)||(LA30_0 >= Move && LA30_0 <= MoveBy)||(LA30_0 >= NoFill && LA30_0 <= Number)||(LA30_0 >= OBracket && LA30_0 <= OParen)||(LA30_0 >= PI_CONSTANT && LA30_0 <= Polygon)||(LA30_0 >= Print && LA30_0 <= Println)||(LA30_0 >= Random && LA30_0 <= Rect)||(LA30_0 >= Rotate && LA30_0 <= Round)||(LA30_0 >= Scale && LA30_0 <= Size)||(LA30_0 >= String && LA30_0 <= Subtract)||LA30_0==Tan||(LA30_0 >= WIDTH_CONSTANT && LA30_0 <= Weight)) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:153:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1400);
							exprList190=exprList();
							state._fsp--;

							stream_exprList.add(exprList190.getTree());
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:5: GetDistance '(' ( exprList )? ')'
					{
					GetDistance200=(Token)match(input,GetDistance,FOLLOW_GetDistance_in_getCall1482);  
					stream_GetDistance.add(GetDistance200);

					char_literal201=(Token)match(input,OParen,FOLLOW_OParen_in_getCall1484);  
					stream_OParen.add(char_literal201);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:21: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==ATan||LA32_0==Assert||LA32_0==Bool||LA32_0==COLOR_CONSTANT||LA32_0==Clip||(LA32_0 >= Copy && LA32_0 <= Curve)||LA32_0==Difference||LA32_0==Ellipse||(LA32_0 >= Excl && LA32_0 <= Expand)||LA32_0==Fill||(LA32_0 >= GetDistance && LA32_0 <= Hide)||LA32_0==Identifier||LA32_0==LAdd||(LA32_0 >= LRemove && LA32_0 <= LShape)||(LA32_0 >= Line && LA32_0 <= MirrorY)||(LA32_0 >= Move && LA32_0 <= MoveBy)||(LA32_0 >= NoFill && LA32_0 <= Number)||(LA32_0 >= OBracket && LA32_0 <= OParen)||(LA32_0 >= PI_CONSTANT && LA32_0 <= Polygon)||(LA32_0 >= Print && LA32_0 <= Println)||(LA32_0 >= Random && LA32_0 <= Rect)||(LA32_0 >= Rotate && LA32_0 <= Round)||(LA32_0 >= Scale && LA32_0 <= Size)||(LA32_0 >= String && LA32_0 <= Subtract)||LA32_0==Tan||(LA32_0 >= Union && LA32_0 <= Weight)||LA32_0==Xor) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_getCall1486);
							exprList202=exprList();
							state._fsp--;

							stream_exprList.add(exprList202.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							}
							break;

					}

<<<<<<< HEAD
					char_literal191=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1404);  
					stream_CParen.add(char_literal191);
=======
					char_literal203=(Token)match(input,CParen,FOLLOW_CParen_in_getCall1490);  
					stream_CParen.add(char_literal203);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: GetDistance, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 153:35: -> ^( FUNC_CALL GetDistance ( exprList )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:153:38: ^( FUNC_CALL GetDistance ( exprList )? )
=======
					// 159:35: -> ^( FUNC_CALL GetDistance ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:38: ^( FUNC_CALL GetDistance ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_GetDistance.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:153:62: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:62: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "getCall"


	public static class mathCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mathCall"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:156:4: mathCall : ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' expression ')' -> ^( FUNC_CALL ATan expression ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:4: mathCall : ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' expression ')' -> ^( FUNC_CALL ATan expression ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.mathCall_return mathCall() throws RecognitionException {
		PogoParser.mathCall_return retval = new PogoParser.mathCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token Cosine192=null;
		Token char_literal193=null;
		Token char_literal195=null;
		Token Sine196=null;
		Token char_literal197=null;
		Token char_literal199=null;
		Token Tan200=null;
		Token char_literal201=null;
		Token char_literal203=null;
		Token ATan204=null;
		Token char_literal205=null;
		Token char_literal207=null;
		Token Random208=null;
		Token char_literal209=null;
		Token char_literal211=null;
		Token Round212=null;
		Token char_literal213=null;
		Token char_literal215=null;
		Token Map216=null;
		Token char_literal217=null;
		Token char_literal219=null;
		ParserRuleReturnScope expression194 =null;
		ParserRuleReturnScope expression198 =null;
		ParserRuleReturnScope expression202 =null;
		ParserRuleReturnScope expression206 =null;
		ParserRuleReturnScope exprList210 =null;
		ParserRuleReturnScope expression214 =null;
		ParserRuleReturnScope exprList218 =null;

		Object Cosine192_tree=null;
		Object char_literal193_tree=null;
		Object char_literal195_tree=null;
		Object Sine196_tree=null;
		Object char_literal197_tree=null;
		Object char_literal199_tree=null;
		Object Tan200_tree=null;
		Object char_literal201_tree=null;
		Object char_literal203_tree=null;
		Object ATan204_tree=null;
		Object char_literal205_tree=null;
		Object char_literal207_tree=null;
		Object Random208_tree=null;
		Object char_literal209_tree=null;
		Object char_literal211_tree=null;
		Object Round212_tree=null;
		Object char_literal213_tree=null;
		Object char_literal215_tree=null;
		Object Map216_tree=null;
		Object char_literal217_tree=null;
		Object char_literal219_tree=null;
=======
		Token Cosine204=null;
		Token char_literal205=null;
		Token char_literal207=null;
		Token Sine208=null;
		Token char_literal209=null;
		Token char_literal211=null;
		Token Tan212=null;
		Token char_literal213=null;
		Token char_literal215=null;
		Token ATan216=null;
		Token char_literal217=null;
		Token char_literal219=null;
		Token Random220=null;
		Token char_literal221=null;
		Token char_literal223=null;
		Token Round224=null;
		Token char_literal225=null;
		Token char_literal227=null;
		Token Map228=null;
		Token char_literal229=null;
		Token char_literal231=null;
		ParserRuleReturnScope expression206 =null;
		ParserRuleReturnScope expression210 =null;
		ParserRuleReturnScope expression214 =null;
		ParserRuleReturnScope expression218 =null;
		ParserRuleReturnScope exprList222 =null;
		ParserRuleReturnScope expression226 =null;
		ParserRuleReturnScope exprList230 =null;

		Object Cosine204_tree=null;
		Object char_literal205_tree=null;
		Object char_literal207_tree=null;
		Object Sine208_tree=null;
		Object char_literal209_tree=null;
		Object char_literal211_tree=null;
		Object Tan212_tree=null;
		Object char_literal213_tree=null;
		Object char_literal215_tree=null;
		Object ATan216_tree=null;
		Object char_literal217_tree=null;
		Object char_literal219_tree=null;
		Object Random220_tree=null;
		Object char_literal221_tree=null;
		Object char_literal223_tree=null;
		Object Round224_tree=null;
		Object char_literal225_tree=null;
		Object char_literal227_tree=null;
		Object Map228_tree=null;
		Object char_literal229_tree=null;
		Object char_literal231_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_Tan=new RewriteRuleTokenStream(adaptor,"token Tan");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Map=new RewriteRuleTokenStream(adaptor,"token Map");
		RewriteRuleTokenStream stream_Sine=new RewriteRuleTokenStream(adaptor,"token Sine");
		RewriteRuleTokenStream stream_Round=new RewriteRuleTokenStream(adaptor,"token Round");
		RewriteRuleTokenStream stream_Cosine=new RewriteRuleTokenStream(adaptor,"token Cosine");
		RewriteRuleTokenStream stream_Random=new RewriteRuleTokenStream(adaptor,"token Random");
		RewriteRuleTokenStream stream_ATan=new RewriteRuleTokenStream(adaptor,"token ATan");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:5: ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' expression ')' -> ^( FUNC_CALL ATan expression ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) )
			int alt34=7;
			switch ( input.LA(1) ) {
			case Cosine:
				{
				alt34=1;
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:5: ( Cosine '(' expression ')' -> ^( FUNC_CALL Cosine expression ) | Sine '(' expression ')' -> ^( FUNC_CALL Sine expression ) | Tan '(' expression ')' -> ^( FUNC_CALL Tan expression ) | ATan '(' expression ')' -> ^( FUNC_CALL ATan expression ) | Random '(' ( exprList )? ')' -> ^( FUNC_CALL Random ( exprList )? ) | Round '(' expression ')' -> ^( FUNC_CALL Round expression ) | Map '(' ( exprList )? ')' -> ^( FUNC_CALL Map ( exprList )? ) )
			int alt36=7;
			switch ( input.LA(1) ) {
			case Cosine:
				{
				alt36=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Sine:
				{
<<<<<<< HEAD
				alt34=2;
=======
				alt36=2;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Tan:
				{
<<<<<<< HEAD
				alt34=3;
=======
				alt36=3;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case ATan:
				{
<<<<<<< HEAD
				alt34=4;
=======
				alt36=4;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Random:
				{
<<<<<<< HEAD
				alt34=5;
=======
				alt36=5;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Round:
				{
<<<<<<< HEAD
				alt34=6;
=======
				alt36=6;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Map:
				{
<<<<<<< HEAD
				alt34=7;
=======
				alt36=7;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			default:
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:6: Cosine '(' expression ')'
					{
					Cosine192=(Token)match(input,Cosine,FOLLOW_Cosine_in_mathCall1436);  
					stream_Cosine.add(Cosine192);

					char_literal193=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1438);  
					stream_OParen.add(char_literal193);

					pushFollow(FOLLOW_expression_in_mathCall1440);
					expression194=expression();
					state._fsp--;

					stream_expression.add(expression194.getTree());
					char_literal195=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1442);  
					stream_CParen.add(char_literal195);
=======
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:6: Cosine '(' expression ')'
					{
					Cosine204=(Token)match(input,Cosine,FOLLOW_Cosine_in_mathCall1522);  
					stream_Cosine.add(Cosine204);

					char_literal205=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1524);  
					stream_OParen.add(char_literal205);

					pushFollow(FOLLOW_expression_in_mathCall1526);
					expression206=expression();
					state._fsp--;

					stream_expression.add(expression206.getTree());
					char_literal207=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1528);  
					stream_CParen.add(char_literal207);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: Cosine, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 157:34: -> ^( FUNC_CALL Cosine expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:157:37: ^( FUNC_CALL Cosine expression )
=======
					// 163:34: -> ^( FUNC_CALL Cosine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:37: ^( FUNC_CALL Cosine expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Cosine.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:6: Sine '(' expression ')'
					{
					Sine196=(Token)match(input,Sine,FOLLOW_Sine_in_mathCall1461);  
					stream_Sine.add(Sine196);

					char_literal197=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1463);  
					stream_OParen.add(char_literal197);

					pushFollow(FOLLOW_expression_in_mathCall1465);
					expression198=expression();
					state._fsp--;

					stream_expression.add(expression198.getTree());
					char_literal199=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1467);  
					stream_CParen.add(char_literal199);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:6: Sine '(' expression ')'
					{
					Sine208=(Token)match(input,Sine,FOLLOW_Sine_in_mathCall1547);  
					stream_Sine.add(Sine208);

					char_literal209=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1549);  
					stream_OParen.add(char_literal209);

					pushFollow(FOLLOW_expression_in_mathCall1551);
					expression210=expression();
					state._fsp--;

					stream_expression.add(expression210.getTree());
					char_literal211=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1553);  
					stream_CParen.add(char_literal211);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: expression, Sine
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 158:32: -> ^( FUNC_CALL Sine expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:158:35: ^( FUNC_CALL Sine expression )
=======
					// 164:32: -> ^( FUNC_CALL Sine expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:164:35: ^( FUNC_CALL Sine expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Sine.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:6: Tan '(' expression ')'
					{
					Tan200=(Token)match(input,Tan,FOLLOW_Tan_in_mathCall1486);  
					stream_Tan.add(Tan200);

					char_literal201=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1488);  
					stream_OParen.add(char_literal201);

					pushFollow(FOLLOW_expression_in_mathCall1490);
					expression202=expression();
					state._fsp--;

					stream_expression.add(expression202.getTree());
					char_literal203=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1492);  
					stream_CParen.add(char_literal203);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:165:6: Tan '(' expression ')'
					{
					Tan212=(Token)match(input,Tan,FOLLOW_Tan_in_mathCall1572);  
					stream_Tan.add(Tan212);

					char_literal213=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1574);  
					stream_OParen.add(char_literal213);

					pushFollow(FOLLOW_expression_in_mathCall1576);
					expression214=expression();
					state._fsp--;

					stream_expression.add(expression214.getTree());
					char_literal215=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1578);  
					stream_CParen.add(char_literal215);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: expression, Tan
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 159:31: -> ^( FUNC_CALL Tan expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:159:34: ^( FUNC_CALL Tan expression )
=======
					// 165:31: -> ^( FUNC_CALL Tan expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:165:34: ^( FUNC_CALL Tan expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Tan.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:6: ATan '(' expression ')'
					{
					ATan204=(Token)match(input,ATan,FOLLOW_ATan_in_mathCall1511);  
					stream_ATan.add(ATan204);

					char_literal205=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1513);  
					stream_OParen.add(char_literal205);

					pushFollow(FOLLOW_expression_in_mathCall1515);
					expression206=expression();
					state._fsp--;

					stream_expression.add(expression206.getTree());
					char_literal207=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1517);  
					stream_CParen.add(char_literal207);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:166:6: ATan '(' expression ')'
					{
					ATan216=(Token)match(input,ATan,FOLLOW_ATan_in_mathCall1597);  
					stream_ATan.add(ATan216);

					char_literal217=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1599);  
					stream_OParen.add(char_literal217);

					pushFollow(FOLLOW_expression_in_mathCall1601);
					expression218=expression();
					state._fsp--;

					stream_expression.add(expression218.getTree());
					char_literal219=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1603);  
					stream_CParen.add(char_literal219);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: ATan, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 160:32: -> ^( FUNC_CALL ATan expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:160:35: ^( FUNC_CALL ATan expression )
=======
					// 166:32: -> ^( FUNC_CALL ATan expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:166:35: ^( FUNC_CALL ATan expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_ATan.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:6: Random '(' ( exprList )? ')'
					{
					Random208=(Token)match(input,Random,FOLLOW_Random_in_mathCall1536);  
					stream_Random.add(Random208);

					char_literal209=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1538);  
					stream_OParen.add(char_literal209);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:17: ( exprList )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==ATan||LA32_0==Assert||LA32_0==Bool||LA32_0==COLOR_CONSTANT||(LA32_0 >= Copy && LA32_0 <= Curve)||LA32_0==Ellipse||(LA32_0 >= Excl && LA32_0 <= Expand)||LA32_0==Fill||(LA32_0 >= GetDistance && LA32_0 <= Hide)||LA32_0==Identifier||LA32_0==LAdd||(LA32_0 >= LRemove && LA32_0 <= LShape)||(LA32_0 >= Line && LA32_0 <= MirrorX)||(LA32_0 >= Move && LA32_0 <= MoveBy)||(LA32_0 >= NoFill && LA32_0 <= Number)||(LA32_0 >= OBracket && LA32_0 <= OParen)||(LA32_0 >= PI_CONSTANT && LA32_0 <= Polygon)||(LA32_0 >= Print && LA32_0 <= Println)||(LA32_0 >= Random && LA32_0 <= Rect)||(LA32_0 >= Rotate && LA32_0 <= Round)||(LA32_0 >= Scale && LA32_0 <= Size)||(LA32_0 >= String && LA32_0 <= Subtract)||LA32_0==Tan||(LA32_0 >= WIDTH_CONSTANT && LA32_0 <= Weight)) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1540);
							exprList210=exprList();
							state._fsp--;

							stream_exprList.add(exprList210.getTree());
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:6: Random '(' ( exprList )? ')'
					{
					Random220=(Token)match(input,Random,FOLLOW_Random_in_mathCall1622);  
					stream_Random.add(Random220);

					char_literal221=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1624);  
					stream_OParen.add(char_literal221);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:17: ( exprList )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==ATan||LA34_0==Assert||LA34_0==Bool||LA34_0==COLOR_CONSTANT||LA34_0==Clip||(LA34_0 >= Copy && LA34_0 <= Curve)||LA34_0==Difference||LA34_0==Ellipse||(LA34_0 >= Excl && LA34_0 <= Expand)||LA34_0==Fill||(LA34_0 >= GetDistance && LA34_0 <= Hide)||LA34_0==Identifier||LA34_0==LAdd||(LA34_0 >= LRemove && LA34_0 <= LShape)||(LA34_0 >= Line && LA34_0 <= MirrorY)||(LA34_0 >= Move && LA34_0 <= MoveBy)||(LA34_0 >= NoFill && LA34_0 <= Number)||(LA34_0 >= OBracket && LA34_0 <= OParen)||(LA34_0 >= PI_CONSTANT && LA34_0 <= Polygon)||(LA34_0 >= Print && LA34_0 <= Println)||(LA34_0 >= Random && LA34_0 <= Rect)||(LA34_0 >= Rotate && LA34_0 <= Round)||(LA34_0 >= Scale && LA34_0 <= Size)||(LA34_0 >= String && LA34_0 <= Subtract)||LA34_0==Tan||(LA34_0 >= Union && LA34_0 <= Weight)||LA34_0==Xor) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:17: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1626);
							exprList222=exprList();
							state._fsp--;

							stream_exprList.add(exprList222.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							}
							break;

					}

<<<<<<< HEAD
					char_literal211=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1543);  
					stream_CParen.add(char_literal211);
=======
					char_literal223=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1629);  
					stream_CParen.add(char_literal223);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: exprList, Random
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 161:33: -> ^( FUNC_CALL Random ( exprList )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:36: ^( FUNC_CALL Random ( exprList )? )
=======
					// 167:33: -> ^( FUNC_CALL Random ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:36: ^( FUNC_CALL Random ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Random.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:161:55: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:167:55: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:6: Round '(' expression ')'
					{
					Round212=(Token)match(input,Round,FOLLOW_Round_in_mathCall1563);  
					stream_Round.add(Round212);

					char_literal213=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1564);  
					stream_OParen.add(char_literal213);

					pushFollow(FOLLOW_expression_in_mathCall1566);
					expression214=expression();
					state._fsp--;

					stream_expression.add(expression214.getTree());
					char_literal215=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1568);  
					stream_CParen.add(char_literal215);
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:6: Round '(' expression ')'
					{
					Round224=(Token)match(input,Round,FOLLOW_Round_in_mathCall1649);  
					stream_Round.add(Round224);

					char_literal225=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1650);  
					stream_OParen.add(char_literal225);

					pushFollow(FOLLOW_expression_in_mathCall1652);
					expression226=expression();
					state._fsp--;

					stream_expression.add(expression226.getTree());
					char_literal227=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1654);  
					stream_CParen.add(char_literal227);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: Round, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 162:32: -> ^( FUNC_CALL Round expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:162:35: ^( FUNC_CALL Round expression )
=======
					// 168:32: -> ^( FUNC_CALL Round expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:35: ^( FUNC_CALL Round expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Round.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:6: Map '(' ( exprList )? ')'
					{
					Map216=(Token)match(input,Map,FOLLOW_Map_in_mathCall1587);  
					stream_Map.add(Map216);

					char_literal217=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1588);  
					stream_OParen.add(char_literal217);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:13: ( exprList )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==ATan||LA33_0==Assert||LA33_0==Bool||LA33_0==COLOR_CONSTANT||(LA33_0 >= Copy && LA33_0 <= Curve)||LA33_0==Ellipse||(LA33_0 >= Excl && LA33_0 <= Expand)||LA33_0==Fill||(LA33_0 >= GetDistance && LA33_0 <= Hide)||LA33_0==Identifier||LA33_0==LAdd||(LA33_0 >= LRemove && LA33_0 <= LShape)||(LA33_0 >= Line && LA33_0 <= MirrorX)||(LA33_0 >= Move && LA33_0 <= MoveBy)||(LA33_0 >= NoFill && LA33_0 <= Number)||(LA33_0 >= OBracket && LA33_0 <= OParen)||(LA33_0 >= PI_CONSTANT && LA33_0 <= Polygon)||(LA33_0 >= Print && LA33_0 <= Println)||(LA33_0 >= Random && LA33_0 <= Rect)||(LA33_0 >= Rotate && LA33_0 <= Round)||(LA33_0 >= Scale && LA33_0 <= Size)||(LA33_0 >= String && LA33_0 <= Subtract)||LA33_0==Tan||(LA33_0 >= WIDTH_CONSTANT && LA33_0 <= Weight)) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:13: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1590);
							exprList218=exprList();
							state._fsp--;

							stream_exprList.add(exprList218.getTree());
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:6: Map '(' ( exprList )? ')'
					{
					Map228=(Token)match(input,Map,FOLLOW_Map_in_mathCall1673);  
					stream_Map.add(Map228);

					char_literal229=(Token)match(input,OParen,FOLLOW_OParen_in_mathCall1674);  
					stream_OParen.add(char_literal229);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:13: ( exprList )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==ATan||LA35_0==Assert||LA35_0==Bool||LA35_0==COLOR_CONSTANT||LA35_0==Clip||(LA35_0 >= Copy && LA35_0 <= Curve)||LA35_0==Difference||LA35_0==Ellipse||(LA35_0 >= Excl && LA35_0 <= Expand)||LA35_0==Fill||(LA35_0 >= GetDistance && LA35_0 <= Hide)||LA35_0==Identifier||LA35_0==LAdd||(LA35_0 >= LRemove && LA35_0 <= LShape)||(LA35_0 >= Line && LA35_0 <= MirrorY)||(LA35_0 >= Move && LA35_0 <= MoveBy)||(LA35_0 >= NoFill && LA35_0 <= Number)||(LA35_0 >= OBracket && LA35_0 <= OParen)||(LA35_0 >= PI_CONSTANT && LA35_0 <= Polygon)||(LA35_0 >= Print && LA35_0 <= Println)||(LA35_0 >= Random && LA35_0 <= Rect)||(LA35_0 >= Rotate && LA35_0 <= Round)||(LA35_0 >= Scale && LA35_0 <= Size)||(LA35_0 >= String && LA35_0 <= Subtract)||LA35_0==Tan||(LA35_0 >= Union && LA35_0 <= Weight)||LA35_0==Xor) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:13: exprList
							{
							pushFollow(FOLLOW_exprList_in_mathCall1676);
							exprList230=exprList();
							state._fsp--;

							stream_exprList.add(exprList230.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							}
							break;

					}

<<<<<<< HEAD
					char_literal219=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1593);  
					stream_CParen.add(char_literal219);
=======
					char_literal231=(Token)match(input,CParen,FOLLOW_CParen_in_mathCall1679);  
					stream_CParen.add(char_literal231);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					// AST REWRITE
					// elements: exprList, Map
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 163:29: -> ^( FUNC_CALL Map ( exprList )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:32: ^( FUNC_CALL Map ( exprList )? )
=======
					// 169:29: -> ^( FUNC_CALL Map ( exprList )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:32: ^( FUNC_CALL Map ( exprList )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Map.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:163:48: ( exprList )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:48: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mathCall"


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:168:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.ifStatement_return ifStatement() throws RecognitionException {
		PogoParser.ifStatement_return retval = new PogoParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token End223=null;
		ParserRuleReturnScope ifStat220 =null;
		ParserRuleReturnScope elseIfStat221 =null;
		ParserRuleReturnScope elseStat222 =null;

		Object End223_tree=null;
=======
		Token End235=null;
		ParserRuleReturnScope ifStat232 =null;
		ParserRuleReturnScope elseIfStat233 =null;
		ParserRuleReturnScope elseStat234 =null;

		Object End235_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:3: ( ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:6: ifStat ( elseIfStat )* ( elseStat )? End
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement1628);
			ifStat220=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat220.getTree());
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:13: ( elseIfStat )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==Else) ) {
					int LA35_1 = input.LA(2);
					if ( (LA35_1==If) ) {
						alt35=1;
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:3: ( ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:6: ifStat ( elseIfStat )* ( elseStat )? End
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement1714);
			ifStat232=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat232.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:13: ( elseIfStat )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==Else) ) {
					int LA37_1 = input.LA(2);
					if ( (LA37_1==If) ) {
						alt37=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}

				}

<<<<<<< HEAD
				switch (alt35) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1630);
					elseIfStat221=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat221.getTree());
=======
				switch (alt37) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement1716);
					elseIfStat233=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat233.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

				default :
<<<<<<< HEAD
					break loop35;
				}
			}

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:25: ( elseStat )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==Else) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1633);
					elseStat222=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat222.getTree());
=======
					break loop37;
				}
			}

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:25: ( elseStat )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==Else) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement1719);
					elseStat234=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat234.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

			}

<<<<<<< HEAD
			End223=(Token)match(input,End,FOLLOW_End_in_ifStatement1636);  
			stream_End.add(End223);

			// AST REWRITE
			// elements: elseStat, ifStat, elseIfStat
=======
			End235=(Token)match(input,End,FOLLOW_End_in_ifStatement1722);  
			stream_End.add(End235);

			// AST REWRITE
			// elements: elseIfStat, ifStat, elseStat
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
			// 169:39: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:42: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
=======
			// 175:39: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:42: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:54: ( elseIfStat )*
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:54: ( elseIfStat )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

<<<<<<< HEAD
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:169:66: ( elseStat )?
=======
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:175:66: ( elseStat )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				if ( stream_elseStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseStat.nextTree());
				}
				stream_elseStat.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStatement"


	public static class ifStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStat"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:173:1: ifStat : If expression Do block -> ^( EXP expression block ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:179:1: ifStat : If expression Do block -> ^( EXP expression block ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.ifStat_return ifStat() throws RecognitionException {
		PogoParser.ifStat_return retval = new PogoParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token If224=null;
		Token Do226=null;
		ParserRuleReturnScope expression225 =null;
		ParserRuleReturnScope block227 =null;

		Object If224_tree=null;
		Object Do226_tree=null;
=======
		Token If236=null;
		Token Do238=null;
		ParserRuleReturnScope expression237 =null;
		ParserRuleReturnScope block239 =null;

		Object If236_tree=null;
		Object Do238_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:3: ( If expression Do block -> ^( EXP expression block ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:6: If expression Do block
			{
			If224=(Token)match(input,If,FOLLOW_If_in_ifStat1665);  
			stream_If.add(If224);

			pushFollow(FOLLOW_expression_in_ifStat1667);
			expression225=expression();
			state._fsp--;

			stream_expression.add(expression225.getTree());
			Do226=(Token)match(input,Do,FOLLOW_Do_in_ifStat1669);  
			stream_Do.add(Do226);

			pushFollow(FOLLOW_block_in_ifStat1671);
			block227=block();
			state._fsp--;

			stream_block.add(block227.getTree());
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:3: ( If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:6: If expression Do block
			{
			If236=(Token)match(input,If,FOLLOW_If_in_ifStat1751);  
			stream_If.add(If236);

			pushFollow(FOLLOW_expression_in_ifStat1753);
			expression237=expression();
			state._fsp--;

			stream_expression.add(expression237.getTree());
			Do238=(Token)match(input,Do,FOLLOW_Do_in_ifStat1755);  
			stream_Do.add(Do238);

			pushFollow(FOLLOW_block_in_ifStat1757);
			block239=block();
			state._fsp--;

			stream_block.add(block239.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			// AST REWRITE
			// elements: block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
			// 174:29: -> ^( EXP expression block )
			{
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:174:32: ^( EXP expression block )
=======
			// 180:29: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:180:32: ^( EXP expression block )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStat"


	public static class elseIfStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elseIfStat"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:177:1: elseIfStat : Else If expression Do block -> ^( EXP expression block ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:183:1: elseIfStat : Else If expression Do block -> ^( EXP expression block ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.elseIfStat_return elseIfStat() throws RecognitionException {
		PogoParser.elseIfStat_return retval = new PogoParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token Else228=null;
		Token If229=null;
		Token Do231=null;
		ParserRuleReturnScope expression230 =null;
		ParserRuleReturnScope block232 =null;

		Object Else228_tree=null;
		Object If229_tree=null;
		Object Do231_tree=null;
=======
		Token Else240=null;
		Token If241=null;
		Token Do243=null;
		ParserRuleReturnScope expression242 =null;
		ParserRuleReturnScope block244 =null;

		Object Else240_tree=null;
		Object If241_tree=null;
		Object Do243_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:178:3: ( Else If expression Do block -> ^( EXP expression block ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:178:6: Else If expression Do block
			{
			Else228=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat1695);  
			stream_Else.add(Else228);

			If229=(Token)match(input,If,FOLLOW_If_in_elseIfStat1697);  
			stream_If.add(If229);

			pushFollow(FOLLOW_expression_in_elseIfStat1699);
			expression230=expression();
			state._fsp--;

			stream_expression.add(expression230.getTree());
			Do231=(Token)match(input,Do,FOLLOW_Do_in_elseIfStat1701);  
			stream_Do.add(Do231);

			pushFollow(FOLLOW_block_in_elseIfStat1703);
			block232=block();
			state._fsp--;

			stream_block.add(block232.getTree());
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:3: ( Else If expression Do block -> ^( EXP expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:6: Else If expression Do block
			{
			Else240=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat1781);  
			stream_Else.add(Else240);

			If241=(Token)match(input,If,FOLLOW_If_in_elseIfStat1783);  
			stream_If.add(If241);

			pushFollow(FOLLOW_expression_in_elseIfStat1785);
			expression242=expression();
			state._fsp--;

			stream_expression.add(expression242.getTree());
			Do243=(Token)match(input,Do,FOLLOW_Do_in_elseIfStat1787);  
			stream_Do.add(Do243);

			pushFollow(FOLLOW_block_in_elseIfStat1789);
			block244=block();
			state._fsp--;

			stream_block.add(block244.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			// AST REWRITE
			// elements: block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
			// 178:34: -> ^( EXP expression block )
			{
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:178:37: ^( EXP expression block )
=======
			// 184:34: -> ^( EXP expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:184:37: ^( EXP expression block )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseIfStat"


	public static class elseStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elseStat"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:181:1: elseStat : Else Do block -> ^( EXP block ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:187:1: elseStat : Else Do block -> ^( EXP block ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.elseStat_return elseStat() throws RecognitionException {
		PogoParser.elseStat_return retval = new PogoParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token Else233=null;
		Token Do234=null;
		ParserRuleReturnScope block235 =null;

		Object Else233_tree=null;
		Object Do234_tree=null;
=======
		Token Else245=null;
		Token Do246=null;
		ParserRuleReturnScope block247 =null;

		Object Else245_tree=null;
		Object Do246_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:3: ( Else Do block -> ^( EXP block ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:6: Else Do block
			{
			Else233=(Token)match(input,Else,FOLLOW_Else_in_elseStat1727);  
			stream_Else.add(Else233);

			Do234=(Token)match(input,Do,FOLLOW_Do_in_elseStat1729);  
			stream_Do.add(Do234);

			pushFollow(FOLLOW_block_in_elseStat1731);
			block235=block();
			state._fsp--;

			stream_block.add(block235.getTree());
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:188:3: ( Else Do block -> ^( EXP block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:188:6: Else Do block
			{
			Else245=(Token)match(input,Else,FOLLOW_Else_in_elseStat1813);  
			stream_Else.add(Else245);

			Do246=(Token)match(input,Do,FOLLOW_Do_in_elseStat1815);  
			stream_Do.add(Do246);

			pushFollow(FOLLOW_block_in_elseStat1817);
			block247=block();
			state._fsp--;

			stream_block.add(block247.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			// AST REWRITE
			// elements: block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
			// 182:20: -> ^( EXP block )
			{
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:182:23: ^( EXP block )
=======
			// 188:20: -> ^( EXP block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:188:23: ^( EXP block )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseStat"


	public static class functionDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDecl"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:185:1: functionDecl : Def Identifier '(' ( idList )? ')' Do block End ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:191:1: functionDecl : Def Identifier '(' ( idList )? ')' Do block End ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.functionDecl_return functionDecl() throws RecognitionException {
		PogoParser.functionDecl_return retval = new PogoParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token Def236=null;
		Token Identifier237=null;
		Token char_literal238=null;
		Token char_literal240=null;
		Token Do241=null;
		Token End243=null;
		ParserRuleReturnScope idList239 =null;
		ParserRuleReturnScope block242 =null;

		Object Def236_tree=null;
		Object Identifier237_tree=null;
		Object char_literal238_tree=null;
		Object char_literal240_tree=null;
		Object Do241_tree=null;
		Object End243_tree=null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:186:3: ( Def Identifier '(' ( idList )? ')' Do block End )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:186:6: Def Identifier '(' ( idList )? ')' Do block End
=======
		Token Def248=null;
		Token Identifier249=null;
		Token char_literal250=null;
		Token char_literal252=null;
		Token Do253=null;
		Token End255=null;
		ParserRuleReturnScope idList251 =null;
		ParserRuleReturnScope block254 =null;

		Object Def248_tree=null;
		Object Identifier249_tree=null;
		Object char_literal250_tree=null;
		Object char_literal252_tree=null;
		Object Do253_tree=null;
		Object End255_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:192:3: ( Def Identifier '(' ( idList )? ')' Do block End )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:192:6: Def Identifier '(' ( idList )? ')' Do block End
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			Def236=(Token)match(input,Def,FOLLOW_Def_in_functionDecl1753); 
			Def236_tree = (Object)adaptor.create(Def236);
			adaptor.addChild(root_0, Def236_tree);

			Identifier237=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl1755); 
			Identifier237_tree = (Object)adaptor.create(Identifier237);
			adaptor.addChild(root_0, Identifier237_tree);

			char_literal238=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl1757); 
			char_literal238_tree = (Object)adaptor.create(char_literal238);
			adaptor.addChild(root_0, char_literal238_tree);

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:186:25: ( idList )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==Identifier) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:186:25: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl1759);
					idList239=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList239.getTree());
=======
			Def248=(Token)match(input,Def,FOLLOW_Def_in_functionDecl1839); 
			Def248_tree = (Object)adaptor.create(Def248);
			adaptor.addChild(root_0, Def248_tree);

			Identifier249=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl1841); 
			Identifier249_tree = (Object)adaptor.create(Identifier249);
			adaptor.addChild(root_0, Identifier249_tree);

			char_literal250=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl1843); 
			char_literal250_tree = (Object)adaptor.create(char_literal250);
			adaptor.addChild(root_0, char_literal250_tree);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:192:25: ( idList )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==Identifier) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:192:25: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl1845);
					idList251=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList251.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;

			}

<<<<<<< HEAD
			char_literal240=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl1762); 
			char_literal240_tree = (Object)adaptor.create(char_literal240);
			adaptor.addChild(root_0, char_literal240_tree);

			Do241=(Token)match(input,Do,FOLLOW_Do_in_functionDecl1764); 
			Do241_tree = (Object)adaptor.create(Do241);
			adaptor.addChild(root_0, Do241_tree);

			pushFollow(FOLLOW_block_in_functionDecl1766);
			block242=block();
			state._fsp--;

			adaptor.addChild(root_0, block242.getTree());

			End243=(Token)match(input,End,FOLLOW_End_in_functionDecl1768); 
			End243_tree = (Object)adaptor.create(End243);
			adaptor.addChild(root_0, End243_tree);

			defineFunction((Identifier237!=null?Identifier237.getText():null), (idList239!=null?((Object)idList239.getTree()):null), (block242!=null?((Object)block242.getTree()):null));
=======
			char_literal252=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl1848); 
			char_literal252_tree = (Object)adaptor.create(char_literal252);
			adaptor.addChild(root_0, char_literal252_tree);

			Do253=(Token)match(input,Do,FOLLOW_Do_in_functionDecl1850); 
			Do253_tree = (Object)adaptor.create(Do253);
			adaptor.addChild(root_0, Do253_tree);

			pushFollow(FOLLOW_block_in_functionDecl1852);
			block254=block();
			state._fsp--;

			adaptor.addChild(root_0, block254.getTree());

			End255=(Token)match(input,End,FOLLOW_End_in_functionDecl1854); 
			End255_tree = (Object)adaptor.create(End255);
			adaptor.addChild(root_0, End255_tree);

			defineFunction((Identifier249!=null?Identifier249.getText():null), (idList251!=null?((Object)idList251.getTree()):null), (block254!=null?((Object)block254.getTree()):null));
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionDecl"


	public static class forStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forStatement"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:190:1: forStatement : For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:196:1: forStatement : For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.forStatement_return forStatement() throws RecognitionException {
		PogoParser.forStatement_return retval = new PogoParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token For244=null;
		Token Identifier245=null;
		Token char_literal246=null;
		Token Do248=null;
		Token Do250=null;
		Token End252=null;
		ParserRuleReturnScope expression247 =null;
		ParserRuleReturnScope expression249 =null;
		ParserRuleReturnScope block251 =null;

		Object For244_tree=null;
		Object Identifier245_tree=null;
		Object char_literal246_tree=null;
		Object Do248_tree=null;
		Object Do250_tree=null;
		Object End252_tree=null;
=======
		Token For256=null;
		Token Identifier257=null;
		Token char_literal258=null;
		Token Do260=null;
		Token Do262=null;
		Token End264=null;
		ParserRuleReturnScope expression259 =null;
		ParserRuleReturnScope expression261 =null;
		ParserRuleReturnScope block263 =null;

		Object For256_tree=null;
		Object Identifier257_tree=null;
		Object char_literal258_tree=null;
		Object Do260_tree=null;
		Object Do262_tree=null;
		Object End264_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:191:3: ( For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:191:6: For Identifier '=' expression Do expression Do block End
			{
			For244=(Token)match(input,For,FOLLOW_For_in_forStatement1790);  
			stream_For.add(For244);

			Identifier245=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement1792);  
			stream_Identifier.add(Identifier245);

			char_literal246=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement1794);  
			stream_Assign.add(char_literal246);

			pushFollow(FOLLOW_expression_in_forStatement1796);
			expression247=expression();
			state._fsp--;

			stream_expression.add(expression247.getTree());
			Do248=(Token)match(input,Do,FOLLOW_Do_in_forStatement1798);  
			stream_Do.add(Do248);

			pushFollow(FOLLOW_expression_in_forStatement1800);
			expression249=expression();
			state._fsp--;

			stream_expression.add(expression249.getTree());
			Do250=(Token)match(input,Do,FOLLOW_Do_in_forStatement1802);  
			stream_Do.add(Do250);

			pushFollow(FOLLOW_block_in_forStatement1804);
			block251=block();
			state._fsp--;

			stream_block.add(block251.getTree());
			End252=(Token)match(input,End,FOLLOW_End_in_forStatement1806);  
			stream_End.add(End252);
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:197:3: ( For Identifier '=' expression Do expression Do block End -> ^( For Identifier expression expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:197:6: For Identifier '=' expression Do expression Do block End
			{
			For256=(Token)match(input,For,FOLLOW_For_in_forStatement1876);  
			stream_For.add(For256);

			Identifier257=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement1878);  
			stream_Identifier.add(Identifier257);

			char_literal258=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement1880);  
			stream_Assign.add(char_literal258);

			pushFollow(FOLLOW_expression_in_forStatement1882);
			expression259=expression();
			state._fsp--;

			stream_expression.add(expression259.getTree());
			Do260=(Token)match(input,Do,FOLLOW_Do_in_forStatement1884);  
			stream_Do.add(Do260);

			pushFollow(FOLLOW_expression_in_forStatement1886);
			expression261=expression();
			state._fsp--;

			stream_expression.add(expression261.getTree());
			Do262=(Token)match(input,Do,FOLLOW_Do_in_forStatement1888);  
			stream_Do.add(Do262);

			pushFollow(FOLLOW_block_in_forStatement1890);
			block263=block();
			state._fsp--;

			stream_block.add(block263.getTree());
			End264=(Token)match(input,End,FOLLOW_End_in_forStatement1892);  
			stream_End.add(End264);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

			// AST REWRITE
			// elements: For, Identifier, block, expression, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
			// 192:6: -> ^( For Identifier expression expression block )
			{
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:192:9: ^( For Identifier expression expression block )
=======
			// 198:6: -> ^( For Identifier expression expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:198:9: ^( For Identifier expression expression block )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_For.nextNode(), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forStatement"


	public static class repeatStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "repeatStatement"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:195:1: repeatStatement : Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:201:1: repeatStatement : Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.repeatStatement_return repeatStatement() throws RecognitionException {
		PogoParser.repeatStatement_return retval = new PogoParser.repeatStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token Repeat253=null;
		Token Identifier254=null;
		Token char_literal255=null;
		Token Do257=null;
		Token char_literal259=null;
		Token Do261=null;
		Token End263=null;
		ParserRuleReturnScope expression256 =null;
		ParserRuleReturnScope expression258 =null;
		ParserRuleReturnScope expression260 =null;
		ParserRuleReturnScope block262 =null;

		Object Repeat253_tree=null;
		Object Identifier254_tree=null;
		Object char_literal255_tree=null;
		Object Do257_tree=null;
		Object char_literal259_tree=null;
		Object Do261_tree=null;
		Object End263_tree=null;
=======
		Token Repeat265=null;
		Token Identifier266=null;
		Token char_literal267=null;
		Token Do269=null;
		Token char_literal271=null;
		Token Do273=null;
		Token End275=null;
		ParserRuleReturnScope expression268 =null;
		ParserRuleReturnScope expression270 =null;
		ParserRuleReturnScope expression272 =null;
		ParserRuleReturnScope block274 =null;

		Object Repeat265_tree=null;
		Object Identifier266_tree=null;
		Object char_literal267_tree=null;
		Object Do269_tree=null;
		Object char_literal271_tree=null;
		Object Do273_tree=null;
		Object End275_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Repeat=new RewriteRuleTokenStream(adaptor,"token Repeat");
		RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:196:3: ( Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:196:5: Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End
			{
			Repeat253=(Token)match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1839);  
			stream_Repeat.add(Repeat253);

			Identifier254=(Token)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1841);  
			stream_Identifier.add(Identifier254);

			char_literal255=(Token)match(input,Assign,FOLLOW_Assign_in_repeatStatement1843);  
			stream_Assign.add(char_literal255);

			pushFollow(FOLLOW_expression_in_repeatStatement1845);
			expression256=expression();
			state._fsp--;

			stream_expression.add(expression256.getTree());
			Do257=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1847);  
			stream_Do.add(Do257);

			pushFollow(FOLLOW_expression_in_repeatStatement1849);
			expression258=expression();
			state._fsp--;

			stream_expression.add(expression258.getTree());
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:196:52: ( '|' expression )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==137) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:196:53: '|' expression
					{
					char_literal259=(Token)match(input,137,FOLLOW_137_in_repeatStatement1852);  
					stream_137.add(char_literal259);

					pushFollow(FOLLOW_expression_in_repeatStatement1854);
					expression260=expression();
					state._fsp--;

					stream_expression.add(expression260.getTree());
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:3: ( Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End -> ^( Repeat Identifier expression expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:5: Repeat Identifier '=' expression Do expression ( '|' expression )* Do block End
			{
			Repeat265=(Token)match(input,Repeat,FOLLOW_Repeat_in_repeatStatement1925);  
			stream_Repeat.add(Repeat265);

			Identifier266=(Token)match(input,Identifier,FOLLOW_Identifier_in_repeatStatement1927);  
			stream_Identifier.add(Identifier266);

			char_literal267=(Token)match(input,Assign,FOLLOW_Assign_in_repeatStatement1929);  
			stream_Assign.add(char_literal267);

			pushFollow(FOLLOW_expression_in_repeatStatement1931);
			expression268=expression();
			state._fsp--;

			stream_expression.add(expression268.getTree());
			Do269=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1933);  
			stream_Do.add(Do269);

			pushFollow(FOLLOW_expression_in_repeatStatement1935);
			expression270=expression();
			state._fsp--;

			stream_expression.add(expression270.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:52: ( '|' expression )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==142) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:53: '|' expression
					{
					char_literal271=(Token)match(input,142,FOLLOW_142_in_repeatStatement1938);  
					stream_142.add(char_literal271);

					pushFollow(FOLLOW_expression_in_repeatStatement1940);
					expression272=expression();
					state._fsp--;

					stream_expression.add(expression272.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

				default :
<<<<<<< HEAD
					break loop38;
				}
			}

			Do261=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1858);  
			stream_Do.add(Do261);

			pushFollow(FOLLOW_block_in_repeatStatement1860);
			block262=block();
			state._fsp--;

			stream_block.add(block262.getTree());
			End263=(Token)match(input,End,FOLLOW_End_in_repeatStatement1862);  
			stream_End.add(End263);

			// AST REWRITE
			// elements: expression, Repeat, block, expression, Identifier
=======
					break loop40;
				}
			}

			Do273=(Token)match(input,Do,FOLLOW_Do_in_repeatStatement1944);  
			stream_Do.add(Do273);

			pushFollow(FOLLOW_block_in_repeatStatement1946);
			block274=block();
			state._fsp--;

			stream_block.add(block274.getTree());
			End275=(Token)match(input,End,FOLLOW_End_in_repeatStatement1948);  
			stream_End.add(End275);

			// AST REWRITE
			// elements: block, expression, Repeat, expression, Identifier
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
			// 196:83: -> ^( Repeat Identifier expression expression block )
			{
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:196:86: ^( Repeat Identifier expression expression block )
=======
			// 202:83: -> ^( Repeat Identifier expression expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:202:86: ^( Repeat Identifier expression expression block )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_Repeat.nextNode(), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "repeatStatement"


	public static class whileStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:199:1: whileStatement : While expression Do block End -> ^( While expression block ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:205:1: whileStatement : While expression Do block End -> ^( While expression block ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.whileStatement_return whileStatement() throws RecognitionException {
		PogoParser.whileStatement_return retval = new PogoParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token While264=null;
		Token Do266=null;
		Token End268=null;
		ParserRuleReturnScope expression265 =null;
		ParserRuleReturnScope block267 =null;

		Object While264_tree=null;
		Object Do266_tree=null;
		Object End268_tree=null;
=======
		Token While276=null;
		Token Do278=null;
		Token End280=null;
		ParserRuleReturnScope expression277 =null;
		ParserRuleReturnScope block279 =null;

		Object While276_tree=null;
		Object Do278_tree=null;
		Object End280_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:200:3: ( While expression Do block End -> ^( While expression block ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:200:6: While expression Do block End
			{
			While264=(Token)match(input,While,FOLLOW_While_in_whileStatement1890);  
			stream_While.add(While264);

			pushFollow(FOLLOW_expression_in_whileStatement1892);
			expression265=expression();
			state._fsp--;

			stream_expression.add(expression265.getTree());
			Do266=(Token)match(input,Do,FOLLOW_Do_in_whileStatement1894);  
			stream_Do.add(Do266);

			pushFollow(FOLLOW_block_in_whileStatement1896);
			block267=block();
			state._fsp--;

			stream_block.add(block267.getTree());
			End268=(Token)match(input,End,FOLLOW_End_in_whileStatement1898);  
			stream_End.add(End268);

			// AST REWRITE
			// elements: block, While, expression
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:3: ( While expression Do block End -> ^( While expression block ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:6: While expression Do block End
			{
			While276=(Token)match(input,While,FOLLOW_While_in_whileStatement1976);  
			stream_While.add(While276);

			pushFollow(FOLLOW_expression_in_whileStatement1978);
			expression277=expression();
			state._fsp--;

			stream_expression.add(expression277.getTree());
			Do278=(Token)match(input,Do,FOLLOW_Do_in_whileStatement1980);  
			stream_Do.add(Do278);

			pushFollow(FOLLOW_block_in_whileStatement1982);
			block279=block();
			state._fsp--;

			stream_block.add(block279.getTree());
			End280=(Token)match(input,End,FOLLOW_End_in_whileStatement1984);  
			stream_End.add(End280);

			// AST REWRITE
			// elements: While, block, expression
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
			// 200:36: -> ^( While expression block )
			{
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:200:39: ^( While expression block )
=======
			// 206:36: -> ^( While expression block )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:206:39: ^( While expression block )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_While.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileStatement"


	public static class idList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "idList"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:203:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:209:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.idList_return idList() throws RecognitionException {
		PogoParser.idList_return retval = new PogoParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token Identifier269=null;
		Token char_literal270=null;
		Token Identifier271=null;

		Object Identifier269_tree=null;
		Object char_literal270_tree=null;
		Object Identifier271_tree=null;
=======
		Token Identifier281=null;
		Token char_literal282=null;
		Token Identifier283=null;

		Object Identifier281_tree=null;
		Object char_literal282_tree=null;
		Object Identifier283_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:6: Identifier ( ',' Identifier )*
			{
			Identifier269=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList1922);  
			stream_Identifier.add(Identifier269);

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:17: ( ',' Identifier )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==Comma) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:18: ',' Identifier
					{
					char_literal270=(Token)match(input,Comma,FOLLOW_Comma_in_idList1925);  
					stream_Comma.add(char_literal270);

					Identifier271=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList1927);  
					stream_Identifier.add(Identifier271);
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:210:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:210:6: Identifier ( ',' Identifier )*
			{
			Identifier281=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList2008);  
			stream_Identifier.add(Identifier281);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:210:17: ( ',' Identifier )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==Comma) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:210:18: ',' Identifier
					{
					char_literal282=(Token)match(input,Comma,FOLLOW_Comma_in_idList2011);  
					stream_Comma.add(char_literal282);

					Identifier283=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList2013);  
					stream_Identifier.add(Identifier283);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;

				default :
<<<<<<< HEAD
					break loop39;
=======
					break loop41;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
			}

			// AST REWRITE
			// elements: Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
			// 204:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:204:38: ^( ID_LIST ( Identifier )+ )
=======
			// 210:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:210:38: ^( ID_LIST ( Identifier )+ )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID_LIST, "ID_LIST"), root_1);
				if ( !(stream_Identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "idList"


	public static class exprList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprList"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:207:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:213:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.exprList_return exprList() throws RecognitionException {
		PogoParser.exprList_return retval = new PogoParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token char_literal273=null;
		ParserRuleReturnScope expression272 =null;
		ParserRuleReturnScope expression274 =null;

		Object char_literal273_tree=null;
=======
		Token char_literal285=null;
		ParserRuleReturnScope expression284 =null;
		ParserRuleReturnScope expression286 =null;

		Object char_literal285_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList1952);
			expression272=expression();
			state._fsp--;

			stream_expression.add(expression272.getTree());
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:17: ( ',' expression )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==Comma) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:18: ',' expression
					{
					char_literal273=(Token)match(input,Comma,FOLLOW_Comma_in_exprList1955);  
					stream_Comma.add(char_literal273);

					pushFollow(FOLLOW_expression_in_exprList1957);
					expression274=expression();
					state._fsp--;

					stream_expression.add(expression274.getTree());
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:214:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:214:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList2038);
			expression284=expression();
			state._fsp--;

			stream_expression.add(expression284.getTree());
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:214:17: ( ',' expression )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==Comma) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:214:18: ',' expression
					{
					char_literal285=(Token)match(input,Comma,FOLLOW_Comma_in_exprList2041);  
					stream_Comma.add(char_literal285);

					pushFollow(FOLLOW_expression_in_exprList2043);
					expression286=expression();
					state._fsp--;

					stream_expression.add(expression286.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

				default :
<<<<<<< HEAD
					break loop40;
=======
					break loop42;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
			// 208:35: -> ^( EXP_LIST ( expression )+ )
			{
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:208:38: ^( EXP_LIST ( expression )+ )
=======
			// 214:35: -> ^( EXP_LIST ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:214:38: ^( EXP_LIST ( expression )+ )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_LIST, "EXP_LIST"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprList"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:211:1: expression : condExpr ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:217:1: expression : condExpr ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.expression_return expression() throws RecognitionException {
		PogoParser.expression_return retval = new PogoParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		ParserRuleReturnScope condExpr275 =null;


		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:3: ( condExpr )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:212:6: condExpr
=======
		ParserRuleReturnScope condExpr287 =null;


		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:218:3: ( condExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:218:6: condExpr
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			pushFollow(FOLLOW_condExpr_in_expression1982);
			condExpr275=condExpr();
			state._fsp--;

			adaptor.addChild(root_0, condExpr275.getTree());
=======
			pushFollow(FOLLOW_condExpr_in_expression2068);
			condExpr287=condExpr();
			state._fsp--;

			adaptor.addChild(root_0, condExpr287.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class condExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condExpr"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:215:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:221:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.condExpr_return condExpr() throws RecognitionException {
		PogoParser.condExpr_return retval = new PogoParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token char_literal277=null;
		Token char_literal278=null;
		Token In279=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr276 =null;
		ParserRuleReturnScope expression280 =null;

		Object char_literal277_tree=null;
		Object char_literal278_tree=null;
		Object In279_tree=null;
=======
		Token char_literal289=null;
		Token char_literal290=null;
		Token In291=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr288 =null;
		ParserRuleReturnScope expression292 =null;

		Object char_literal289_tree=null;
		Object char_literal290_tree=null;
		Object In291_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:6: ( orExpr -> orExpr )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:216:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr1997);
			orExpr276=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr276.getTree());
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:222:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:222:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:222:6: ( orExpr -> orExpr )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:222:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr2083);
			orExpr288=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr288.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			// AST REWRITE
			// elements: orExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
			// 216:14: -> orExpr
=======
			// 222:14: -> orExpr
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:217:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt41=3;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==QMark) ) {
				alt41=1;
			}
			else if ( (LA41_0==In) ) {
				alt41=2;
			}
			switch (alt41) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:217:8: '?' a= expression ':' b= expression
					{
					char_literal277=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr2012);  
					stream_QMark.add(char_literal277);

					pushFollow(FOLLOW_expression_in_condExpr2016);
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:223:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt43=3;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==QMark) ) {
				alt43=1;
			}
			else if ( (LA43_0==In) ) {
				alt43=2;
			}
			switch (alt43) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:223:8: '?' a= expression ':' b= expression
					{
					char_literal289=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr2098);  
					stream_QMark.add(char_literal289);

					pushFollow(FOLLOW_expression_in_condExpr2102);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
<<<<<<< HEAD
					char_literal278=(Token)match(input,Do,FOLLOW_Do_in_condExpr2018);  
					stream_Do.add(char_literal278);

					pushFollow(FOLLOW_expression_in_condExpr2022);
=======
					char_literal290=(Token)match(input,Do,FOLLOW_Do_in_condExpr2104);  
					stream_Do.add(char_literal290);

					pushFollow(FOLLOW_expression_in_condExpr2108);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					b=expression();
					state._fsp--;

					stream_expression.add(b.getTree());
					// AST REWRITE
<<<<<<< HEAD
					// elements: b, a, orExpr
=======
					// elements: orExpr, a, b
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					// token labels: 
					// rule labels: retval, b, a
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 217:42: -> ^( TERNARY orExpr $a $b)
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:217:45: ^( TERNARY orExpr $a $b)
=======
					// 223:42: -> ^( TERNARY orExpr $a $b)
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:223:45: ^( TERNARY orExpr $a $b)
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERNARY, "TERNARY"), root_1);
						adaptor.addChild(root_1, stream_orExpr.nextTree());
						adaptor.addChild(root_1, stream_a.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:218:8: In expression
					{
					In279=(Token)match(input,In,FOLLOW_In_in_condExpr2045);  
					stream_In.add(In279);

					pushFollow(FOLLOW_expression_in_condExpr2047);
					expression280=expression();
					state._fsp--;

					stream_expression.add(expression280.getTree());
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:8: In expression
					{
					In291=(Token)match(input,In,FOLLOW_In_in_condExpr2131);  
					stream_In.add(In291);

					pushFollow(FOLLOW_expression_in_condExpr2133);
					expression292=expression();
					state._fsp--;

					stream_expression.add(expression292.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					// AST REWRITE
					// elements: In, orExpr, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 218:42: -> ^( In orExpr expression )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:218:45: ^( In orExpr expression )
=======
					// 224:42: -> ^( In orExpr expression )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:224:45: ^( In orExpr expression )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_In.nextNode(), root_1);
						adaptor.addChild(root_1, stream_orExpr.nextTree());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condExpr"


	public static class orExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orExpr"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:222:1: orExpr : andExpr ( '||' ^ andExpr )* ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:228:1: orExpr : andExpr ( '||' ^ andExpr )* ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.orExpr_return orExpr() throws RecognitionException {
		PogoParser.orExpr_return retval = new PogoParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token string_literal282=null;
		ParserRuleReturnScope andExpr281 =null;
		ParserRuleReturnScope andExpr283 =null;

		Object string_literal282_tree=null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:223:3: ( andExpr ( '||' ^ andExpr )* )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:223:6: andExpr ( '||' ^ andExpr )*
=======
		Token string_literal294=null;
		ParserRuleReturnScope andExpr293 =null;
		ParserRuleReturnScope andExpr295 =null;

		Object string_literal294_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:3: ( andExpr ( '||' ^ andExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:6: andExpr ( '||' ^ andExpr )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			pushFollow(FOLLOW_andExpr_in_orExpr2099);
			andExpr281=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr281.getTree());

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:223:14: ( '||' ^ andExpr )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==138) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:223:15: '||' ^ andExpr
					{
					string_literal282=(Token)match(input,138,FOLLOW_138_in_orExpr2102); 
					string_literal282_tree = (Object)adaptor.create(string_literal282);
					root_0 = (Object)adaptor.becomeRoot(string_literal282_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr2105);
					andExpr283=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr283.getTree());
=======
			pushFollow(FOLLOW_andExpr_in_orExpr2185);
			andExpr293=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr293.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:14: ( '||' ^ andExpr )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==143) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:229:15: '||' ^ andExpr
					{
					string_literal294=(Token)match(input,143,FOLLOW_143_in_orExpr2188); 
					string_literal294_tree = (Object)adaptor.create(string_literal294);
					root_0 = (Object)adaptor.becomeRoot(string_literal294_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr2191);
					andExpr295=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr295.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;

				default :
<<<<<<< HEAD
					break loop42;
=======
					break loop44;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:226:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:232:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.andExpr_return andExpr() throws RecognitionException {
		PogoParser.andExpr_return retval = new PogoParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token string_literal285=null;
		ParserRuleReturnScope equExpr284 =null;
		ParserRuleReturnScope equExpr286 =null;

		Object string_literal285_tree=null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:227:3: ( equExpr ( '&&' ^ equExpr )* )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:227:6: equExpr ( '&&' ^ equExpr )*
=======
		Token string_literal297=null;
		ParserRuleReturnScope equExpr296 =null;
		ParserRuleReturnScope equExpr298 =null;

		Object string_literal297_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:3: ( equExpr ( '&&' ^ equExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:6: equExpr ( '&&' ^ equExpr )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			pushFollow(FOLLOW_equExpr_in_andExpr2121);
			equExpr284=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr284.getTree());

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:227:14: ( '&&' ^ equExpr )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==135) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:227:15: '&&' ^ equExpr
					{
					string_literal285=(Token)match(input,135,FOLLOW_135_in_andExpr2124); 
					string_literal285_tree = (Object)adaptor.create(string_literal285);
					root_0 = (Object)adaptor.becomeRoot(string_literal285_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr2127);
					equExpr286=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr286.getTree());
=======
			pushFollow(FOLLOW_equExpr_in_andExpr2207);
			equExpr296=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr296.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:14: ( '&&' ^ equExpr )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==140) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:233:15: '&&' ^ equExpr
					{
					string_literal297=(Token)match(input,140,FOLLOW_140_in_andExpr2210); 
					string_literal297_tree = (Object)adaptor.create(string_literal297);
					root_0 = (Object)adaptor.becomeRoot(string_literal297_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr2213);
					equExpr298=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr298.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;

				default :
<<<<<<< HEAD
					break loop43;
=======
					break loop45;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "andExpr"


	public static class equExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equExpr"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:230:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:236:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.equExpr_return equExpr() throws RecognitionException {
		PogoParser.equExpr_return retval = new PogoParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token set288=null;
		ParserRuleReturnScope relExpr287 =null;
		ParserRuleReturnScope relExpr289 =null;

		Object set288_tree=null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
=======
		Token set300=null;
		ParserRuleReturnScope relExpr299 =null;
		ParserRuleReturnScope relExpr301 =null;

		Object set300_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			pushFollow(FOLLOW_relExpr_in_equExpr2143);
			relExpr287=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr287.getTree());

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==Equals||LA44_0==NEquals) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:231:15: ( '==' | '!=' ) ^ relExpr
					{
					set288=input.LT(1);
					set288=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set288), root_0);
=======
			pushFollow(FOLLOW_relExpr_in_equExpr2229);
			relExpr299=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr299.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==Equals||LA46_0==NEquals) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:237:15: ( '==' | '!=' ) ^ relExpr
					{
					set300=input.LT(1);
					set300=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set300), root_0);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
<<<<<<< HEAD
					pushFollow(FOLLOW_relExpr_in_equExpr2155);
					relExpr289=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr289.getTree());
=======
					pushFollow(FOLLOW_relExpr_in_equExpr2241);
					relExpr301=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr301.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;

				default :
<<<<<<< HEAD
					break loop44;
=======
					break loop46;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equExpr"


	public static class relExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relExpr"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:234:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:240:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.relExpr_return relExpr() throws RecognitionException {
		PogoParser.relExpr_return retval = new PogoParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token set291=null;
		ParserRuleReturnScope addExpr290 =null;
		ParserRuleReturnScope addExpr292 =null;

		Object set291_tree=null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
=======
		Token set303=null;
		ParserRuleReturnScope addExpr302 =null;
		ParserRuleReturnScope addExpr304 =null;

		Object set303_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			pushFollow(FOLLOW_addExpr_in_relExpr2171);
			addExpr290=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr290.getTree());

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( ((LA45_0 >= GT && LA45_0 <= GTEquals)||(LA45_0 >= LT && LA45_0 <= LTEquals)) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:235:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set291=input.LT(1);
					set291=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set291), root_0);
=======
			pushFollow(FOLLOW_addExpr_in_relExpr2257);
			addExpr302=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr302.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( ((LA47_0 >= GT && LA47_0 <= GTEquals)||(LA47_0 >= LT && LA47_0 <= LTEquals)) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:241:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set303=input.LT(1);
					set303=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set303), root_0);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
<<<<<<< HEAD
					pushFollow(FOLLOW_addExpr_in_relExpr2191);
					addExpr292=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr292.getTree());
=======
					pushFollow(FOLLOW_addExpr_in_relExpr2277);
					addExpr304=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr304.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;

				default :
<<<<<<< HEAD
					break loop45;
=======
					break loop47;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relExpr"


	public static class addExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addExpr"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:238:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:244:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.addExpr_return addExpr() throws RecognitionException {
		PogoParser.addExpr_return retval = new PogoParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token set294=null;
		ParserRuleReturnScope mulExpr293 =null;
		ParserRuleReturnScope mulExpr295 =null;

		Object set294_tree=null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
=======
		Token set306=null;
		ParserRuleReturnScope mulExpr305 =null;
		ParserRuleReturnScope mulExpr307 =null;

		Object set306_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:245:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:245:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			pushFollow(FOLLOW_mulExpr_in_addExpr2207);
			mulExpr293=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr293.getTree());

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==Add||LA46_0==Subtract) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:239:15: ( '+' | '-' ) ^ mulExpr
					{
					set294=input.LT(1);
					set294=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set294), root_0);
=======
			pushFollow(FOLLOW_mulExpr_in_addExpr2293);
			mulExpr305=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr305.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:245:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==Add||LA48_0==Subtract) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:245:15: ( '+' | '-' ) ^ mulExpr
					{
					set306=input.LT(1);
					set306=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set306), root_0);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
<<<<<<< HEAD
					pushFollow(FOLLOW_mulExpr_in_addExpr2219);
					mulExpr295=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr295.getTree());
=======
					pushFollow(FOLLOW_mulExpr_in_addExpr2305);
					mulExpr307=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr307.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;

				default :
<<<<<<< HEAD
					break loop46;
=======
					break loop48;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addExpr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:242:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:248:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.mulExpr_return mulExpr() throws RecognitionException {
		PogoParser.mulExpr_return retval = new PogoParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token set297=null;
		ParserRuleReturnScope powExpr296 =null;
		ParserRuleReturnScope powExpr298 =null;

		Object set297_tree=null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
=======
		Token set309=null;
		ParserRuleReturnScope powExpr308 =null;
		ParserRuleReturnScope powExpr310 =null;

		Object set309_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			pushFollow(FOLLOW_powExpr_in_mulExpr2235);
			powExpr296=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr296.getTree());

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==Divide||LA47_0==Modulus||LA47_0==Multiply) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:243:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set297=input.LT(1);
					set297=input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulus||input.LA(1)==Multiply ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set297), root_0);
=======
			pushFollow(FOLLOW_powExpr_in_mulExpr2321);
			powExpr308=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr308.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==Divide||LA49_0==Modulus||LA49_0==Multiply) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:249:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set309=input.LT(1);
					set309=input.LT(1);
					if ( input.LA(1)==Divide||input.LA(1)==Modulus||input.LA(1)==Multiply ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set309), root_0);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
<<<<<<< HEAD
					pushFollow(FOLLOW_powExpr_in_mulExpr2251);
					powExpr298=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr298.getTree());
=======
					pushFollow(FOLLOW_powExpr_in_mulExpr2337);
					powExpr310=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr310.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;

				default :
<<<<<<< HEAD
					break loop47;
=======
					break loop49;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mulExpr"


	public static class powExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "powExpr"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:246:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:252:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.powExpr_return powExpr() throws RecognitionException {
		PogoParser.powExpr_return retval = new PogoParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token char_literal300=null;
		ParserRuleReturnScope unaryExpr299 =null;
		ParserRuleReturnScope unaryExpr301 =null;

		Object char_literal300_tree=null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:6: unaryExpr ( '^' ^ unaryExpr )*
=======
		Token char_literal312=null;
		ParserRuleReturnScope unaryExpr311 =null;
		ParserRuleReturnScope unaryExpr313 =null;

		Object char_literal312_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:6: unaryExpr ( '^' ^ unaryExpr )*
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			pushFollow(FOLLOW_unaryExpr_in_powExpr2267);
			unaryExpr299=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr299.getTree());

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:16: ( '^' ^ unaryExpr )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==Pow) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:247:17: '^' ^ unaryExpr
					{
					char_literal300=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr2270); 
					char_literal300_tree = (Object)adaptor.create(char_literal300);
					root_0 = (Object)adaptor.becomeRoot(char_literal300_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr2273);
					unaryExpr301=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr301.getTree());
=======
			pushFollow(FOLLOW_unaryExpr_in_powExpr2353);
			unaryExpr311=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr311.getTree());

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:16: ( '^' ^ unaryExpr )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==Pow) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:17: '^' ^ unaryExpr
					{
					char_literal312=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr2356); 
					char_literal312_tree = (Object)adaptor.create(char_literal312);
					root_0 = (Object)adaptor.becomeRoot(char_literal312_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr2359);
					unaryExpr313=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr313.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;

				default :
<<<<<<< HEAD
					break loop48;
=======
					break loop50;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "powExpr"


	public static class unaryExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpr"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:250:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:256:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.unaryExpr_return unaryExpr() throws RecognitionException {
		PogoParser.unaryExpr_return retval = new PogoParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token char_literal302=null;
		Token char_literal304=null;
		ParserRuleReturnScope atom303 =null;
		ParserRuleReturnScope atom305 =null;
		ParserRuleReturnScope atom306 =null;

		Object char_literal302_tree=null;
		Object char_literal304_tree=null;
=======
		Token char_literal314=null;
		Token char_literal316=null;
		ParserRuleReturnScope atom315 =null;
		ParserRuleReturnScope atom317 =null;
		ParserRuleReturnScope atom318 =null;

		Object char_literal314_tree=null;
		Object char_literal316_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt49=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt49=1;
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:257:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt51=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt51=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Excl:
				{
<<<<<<< HEAD
				alt49=2;
=======
				alt51=2;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case ATan:
			case Assert:
			case Bool:
			case COLOR_CONSTANT:
			case Clip:
			case Copy:
			case Cosine:
			case Curve:
			case Difference:
			case Ellipse:
			case Expand:
			case Fill:
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
			case Group:
			case HEIGHT_CONSTANT:
			case Hide:
			case Identifier:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Map:
			case Merge:
			case MirrorX:
			case MirrorY:
			case Move:
			case MoveBy:
			case NoFill:
			case NoStroke:
			case Null:
			case Number:
			case OBracket:
			case OParen:
			case PI_CONSTANT:
			case Point:
			case Polygon:
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case Shirt:
			case ShirtBack:
			case Sine:
			case Size:
			case String:
			case Stroke:
			case Tan:
			case Union:
			case WIDTH_CONSTANT:
			case Weight:
			case Xor:
				{
<<<<<<< HEAD
				alt49=3;
=======
				alt51=3;
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
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:6: '-' atom
					{
					char_literal302=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr2291);  
					stream_Subtract.add(char_literal302);

					pushFollow(FOLLOW_atom_in_unaryExpr2293);
					atom303=atom();
					state._fsp--;

					stream_atom.add(atom303.getTree());
=======
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}
			switch (alt51) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:257:6: '-' atom
					{
					char_literal314=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr2377);  
					stream_Subtract.add(char_literal314);

					pushFollow(FOLLOW_atom_in_unaryExpr2379);
					atom315=atom();
					state._fsp--;

					stream_atom.add(atom315.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 251:15: -> ^( UNARY_MIN atom )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:251:18: ^( UNARY_MIN atom )
=======
					// 257:15: -> ^( UNARY_MIN atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:257:18: ^( UNARY_MIN atom )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MIN, "UNARY_MIN"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:252:6: '!' atom
					{
					char_literal304=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr2308);  
					stream_Excl.add(char_literal304);

					pushFollow(FOLLOW_atom_in_unaryExpr2310);
					atom305=atom();
					state._fsp--;

					stream_atom.add(atom305.getTree());
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:258:6: '!' atom
					{
					char_literal316=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr2394);  
					stream_Excl.add(char_literal316);

					pushFollow(FOLLOW_atom_in_unaryExpr2396);
					atom317=atom();
					state._fsp--;

					stream_atom.add(atom317.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 252:15: -> ^( NEGATE atom )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:252:18: ^( NEGATE atom )
=======
					// 258:15: -> ^( NEGATE atom )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:258:18: ^( NEGATE atom )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEGATE, "NEGATE"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:253:6: atom
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:259:6: atom
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					pushFollow(FOLLOW_atom_in_unaryExpr2325);
					atom306=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom306.getTree());
=======
					pushFollow(FOLLOW_atom_in_unaryExpr2411);
					atom318=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom318.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryExpr"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:256:1: atom : ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:262:1: atom : ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.atom_return atom() throws RecognitionException {
		PogoParser.atom_return retval = new PogoParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token Number307=null;
		Token Bool308=null;
		Token Null309=null;
		Token COLOR_CONSTANT311=null;
		Token PI_CONSTANT312=null;
		Token WIDTH_CONSTANT313=null;
		Token HEIGHT_CONSTANT314=null;
		ParserRuleReturnScope lookup310 =null;

		Object Number307_tree=null;
		Object Bool308_tree=null;
		Object Null309_tree=null;
		Object COLOR_CONSTANT311_tree=null;
		Object PI_CONSTANT312_tree=null;
		Object WIDTH_CONSTANT313_tree=null;
		Object HEIGHT_CONSTANT314_tree=null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:257:3: ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt50=8;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt50=1;
=======
		Token Number319=null;
		Token Bool320=null;
		Token Null321=null;
		Token COLOR_CONSTANT323=null;
		Token PI_CONSTANT324=null;
		Token WIDTH_CONSTANT325=null;
		Token HEIGHT_CONSTANT326=null;
		ParserRuleReturnScope lookup322 =null;

		Object Number319_tree=null;
		Object Bool320_tree=null;
		Object Null321_tree=null;
		Object COLOR_CONSTANT323_tree=null;
		Object PI_CONSTANT324_tree=null;
		Object WIDTH_CONSTANT325_tree=null;
		Object HEIGHT_CONSTANT326_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:263:3: ( Number | Bool | Null | lookup | COLOR_CONSTANT | PI_CONSTANT | WIDTH_CONSTANT | HEIGHT_CONSTANT )
			int alt52=8;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt52=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Bool:
				{
<<<<<<< HEAD
				alt50=2;
=======
				alt52=2;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case Null:
				{
<<<<<<< HEAD
				alt50=3;
=======
				alt52=3;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case ATan:
			case Assert:
			case Clip:
			case Copy:
			case Cosine:
			case Curve:
			case Difference:
			case Ellipse:
			case Expand:
			case Fill:
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
			case Group:
			case Hide:
			case Identifier:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Map:
			case Merge:
			case MirrorX:
			case MirrorY:
			case Move:
			case MoveBy:
			case NoFill:
			case NoStroke:
			case OBracket:
			case OParen:
			case Point:
			case Polygon:
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case Shirt:
			case ShirtBack:
			case Sine:
			case Size:
			case String:
			case Stroke:
			case Tan:
			case Union:
			case Weight:
			case Xor:
				{
<<<<<<< HEAD
				alt50=4;
=======
				alt52=4;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case COLOR_CONSTANT:
				{
<<<<<<< HEAD
				alt50=5;
=======
				alt52=5;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case PI_CONSTANT:
				{
<<<<<<< HEAD
				alt50=6;
=======
				alt52=6;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case WIDTH_CONSTANT:
				{
<<<<<<< HEAD
				alt50=7;
=======
				alt52=7;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case HEIGHT_CONSTANT:
				{
<<<<<<< HEAD
				alt50=8;
=======
				alt52=8;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			default:
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}
			switch (alt50) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:257:6: Number
=======
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:263:6: Number
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					Number307=(Token)match(input,Number,FOLLOW_Number_in_atom2339); 
					Number307_tree = (Object)adaptor.create(Number307);
					adaptor.addChild(root_0, Number307_tree);
=======
					Number319=(Token)match(input,Number,FOLLOW_Number_in_atom2425); 
					Number319_tree = (Object)adaptor.create(Number319);
					adaptor.addChild(root_0, Number319_tree);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:258:6: Bool
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:264:6: Bool
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					Bool308=(Token)match(input,Bool,FOLLOW_Bool_in_atom2346); 
					Bool308_tree = (Object)adaptor.create(Bool308);
					adaptor.addChild(root_0, Bool308_tree);
=======
					Bool320=(Token)match(input,Bool,FOLLOW_Bool_in_atom2432); 
					Bool320_tree = (Object)adaptor.create(Bool320);
					adaptor.addChild(root_0, Bool320_tree);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:259:6: Null
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:265:6: Null
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					Null309=(Token)match(input,Null,FOLLOW_Null_in_atom2353); 
					Null309_tree = (Object)adaptor.create(Null309);
					adaptor.addChild(root_0, Null309_tree);
=======
					Null321=(Token)match(input,Null,FOLLOW_Null_in_atom2439); 
					Null321_tree = (Object)adaptor.create(Null321);
					adaptor.addChild(root_0, Null321_tree);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:260:6: lookup
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:266:6: lookup
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					pushFollow(FOLLOW_lookup_in_atom2360);
					lookup310=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup310.getTree());
=======
					pushFollow(FOLLOW_lookup_in_atom2446);
					lookup322=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup322.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:261:5: COLOR_CONSTANT
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:267:5: COLOR_CONSTANT
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					COLOR_CONSTANT311=(Token)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_atom2366); 
					COLOR_CONSTANT311_tree = (Object)adaptor.create(COLOR_CONSTANT311);
					adaptor.addChild(root_0, COLOR_CONSTANT311_tree);
=======
					COLOR_CONSTANT323=(Token)match(input,COLOR_CONSTANT,FOLLOW_COLOR_CONSTANT_in_atom2452); 
					COLOR_CONSTANT323_tree = (Object)adaptor.create(COLOR_CONSTANT323);
					adaptor.addChild(root_0, COLOR_CONSTANT323_tree);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;
				case 6 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:262:5: PI_CONSTANT
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:5: PI_CONSTANT
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					PI_CONSTANT312=(Token)match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_atom2372); 
					PI_CONSTANT312_tree = (Object)adaptor.create(PI_CONSTANT312);
					adaptor.addChild(root_0, PI_CONSTANT312_tree);
=======
					PI_CONSTANT324=(Token)match(input,PI_CONSTANT,FOLLOW_PI_CONSTANT_in_atom2458); 
					PI_CONSTANT324_tree = (Object)adaptor.create(PI_CONSTANT324);
					adaptor.addChild(root_0, PI_CONSTANT324_tree);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;
				case 7 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:263:5: WIDTH_CONSTANT
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:269:5: WIDTH_CONSTANT
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					WIDTH_CONSTANT313=(Token)match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_atom2378); 
					WIDTH_CONSTANT313_tree = (Object)adaptor.create(WIDTH_CONSTANT313);
					adaptor.addChild(root_0, WIDTH_CONSTANT313_tree);
=======
					WIDTH_CONSTANT325=(Token)match(input,WIDTH_CONSTANT,FOLLOW_WIDTH_CONSTANT_in_atom2464); 
					WIDTH_CONSTANT325_tree = (Object)adaptor.create(WIDTH_CONSTANT325);
					adaptor.addChild(root_0, WIDTH_CONSTANT325_tree);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;
				case 8 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:264:5: HEIGHT_CONSTANT
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:270:5: HEIGHT_CONSTANT
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					{
					root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
					HEIGHT_CONSTANT314=(Token)match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_atom2384); 
					HEIGHT_CONSTANT314_tree = (Object)adaptor.create(HEIGHT_CONSTANT314);
					adaptor.addChild(root_0, HEIGHT_CONSTANT314_tree);
=======
					HEIGHT_CONSTANT326=(Token)match(input,HEIGHT_CONSTANT,FOLLOW_HEIGHT_CONSTANT_in_atom2470); 
					HEIGHT_CONSTANT326_tree = (Object)adaptor.create(HEIGHT_CONSTANT326);
					adaptor.addChild(root_0, HEIGHT_CONSTANT326_tree);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:267:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:273:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.list_return list() throws RecognitionException {
		PogoParser.list_return retval = new PogoParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token char_literal315=null;
		Token char_literal317=null;
		ParserRuleReturnScope exprList316 =null;

		Object char_literal315_tree=null;
		Object char_literal317_tree=null;
=======
		Token char_literal327=null;
		Token char_literal329=null;
		ParserRuleReturnScope exprList328 =null;

		Object char_literal327_tree=null;
		Object char_literal329_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:6: '[' ( exprList )? ']'
			{
			char_literal315=(Token)match(input,OBracket,FOLLOW_OBracket_in_list2398);  
			stream_OBracket.add(char_literal315);

			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:10: ( exprList )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==ATan||LA51_0==Assert||LA51_0==Bool||LA51_0==COLOR_CONSTANT||(LA51_0 >= Copy && LA51_0 <= Curve)||LA51_0==Ellipse||(LA51_0 >= Excl && LA51_0 <= Expand)||LA51_0==Fill||(LA51_0 >= GetDistance && LA51_0 <= Hide)||LA51_0==Identifier||LA51_0==LAdd||(LA51_0 >= LRemove && LA51_0 <= LShape)||(LA51_0 >= Line && LA51_0 <= MirrorX)||(LA51_0 >= Move && LA51_0 <= MoveBy)||(LA51_0 >= NoFill && LA51_0 <= Number)||(LA51_0 >= OBracket && LA51_0 <= OParen)||(LA51_0 >= PI_CONSTANT && LA51_0 <= Polygon)||(LA51_0 >= Print && LA51_0 <= Println)||(LA51_0 >= Random && LA51_0 <= Rect)||(LA51_0 >= Rotate && LA51_0 <= Round)||(LA51_0 >= Scale && LA51_0 <= Size)||(LA51_0 >= String && LA51_0 <= Subtract)||LA51_0==Tan||(LA51_0 >= WIDTH_CONSTANT && LA51_0 <= Weight)) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list2400);
					exprList316=exprList();
					state._fsp--;

					stream_exprList.add(exprList316.getTree());
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:6: '[' ( exprList )? ']'
			{
			char_literal327=(Token)match(input,OBracket,FOLLOW_OBracket_in_list2484);  
			stream_OBracket.add(char_literal327);

			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:10: ( exprList )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==ATan||LA53_0==Assert||LA53_0==Bool||LA53_0==COLOR_CONSTANT||LA53_0==Clip||(LA53_0 >= Copy && LA53_0 <= Curve)||LA53_0==Difference||LA53_0==Ellipse||(LA53_0 >= Excl && LA53_0 <= Expand)||LA53_0==Fill||(LA53_0 >= GetDistance && LA53_0 <= Hide)||LA53_0==Identifier||LA53_0==LAdd||(LA53_0 >= LRemove && LA53_0 <= LShape)||(LA53_0 >= Line && LA53_0 <= MirrorY)||(LA53_0 >= Move && LA53_0 <= MoveBy)||(LA53_0 >= NoFill && LA53_0 <= Number)||(LA53_0 >= OBracket && LA53_0 <= OParen)||(LA53_0 >= PI_CONSTANT && LA53_0 <= Polygon)||(LA53_0 >= Print && LA53_0 <= Println)||(LA53_0 >= Random && LA53_0 <= Rect)||(LA53_0 >= Rotate && LA53_0 <= Round)||(LA53_0 >= Scale && LA53_0 <= Size)||(LA53_0 >= String && LA53_0 <= Subtract)||LA53_0==Tan||(LA53_0 >= Union && LA53_0 <= Weight)||LA53_0==Xor) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list2486);
					exprList328=exprList();
					state._fsp--;

					stream_exprList.add(exprList328.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

			}

<<<<<<< HEAD
			char_literal317=(Token)match(input,CBracket,FOLLOW_CBracket_in_list2403);  
			stream_CBracket.add(char_literal317);
=======
			char_literal329=(Token)match(input,CBracket,FOLLOW_CBracket_in_list2489);  
			stream_CBracket.add(char_literal329);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

			// AST REWRITE
			// elements: exprList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
			// 268:24: -> ^( LIST ( exprList )? )
			{
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:268:34: ( exprList )?
=======
			// 274:24: -> ^( LIST ( exprList )? )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:34: ( exprList )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				if ( stream_exprList.hasNext() ) {
					adaptor.addChild(root_1, stream_exprList.nextTree());
				}
				stream_exprList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list"


	public static class lookup_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lookup"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:271:1: lookup : ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:277:1: lookup : ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.lookup_return lookup() throws RecognitionException {
		PogoParser.lookup_return retval = new PogoParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token Identifier323=null;
		Token String326=null;
		Token char_literal328=null;
		Token char_literal330=null;
		ParserRuleReturnScope functionCall318 =null;
		ParserRuleReturnScope indexes319 =null;
		ParserRuleReturnScope dotProperty320 =null;
		ParserRuleReturnScope list321 =null;
		ParserRuleReturnScope indexes322 =null;
		ParserRuleReturnScope indexes324 =null;
		ParserRuleReturnScope dotProperty325 =null;
		ParserRuleReturnScope indexes327 =null;
		ParserRuleReturnScope expression329 =null;
		ParserRuleReturnScope indexes331 =null;

		Object Identifier323_tree=null;
		Object String326_tree=null;
		Object char_literal328_tree=null;
		Object char_literal330_tree=null;
=======
		Token Identifier335=null;
		Token String338=null;
		Token char_literal340=null;
		Token char_literal342=null;
		ParserRuleReturnScope functionCall330 =null;
		ParserRuleReturnScope indexes331 =null;
		ParserRuleReturnScope dotProperty332 =null;
		ParserRuleReturnScope list333 =null;
		ParserRuleReturnScope indexes334 =null;
		ParserRuleReturnScope indexes336 =null;
		ParserRuleReturnScope dotProperty337 =null;
		ParserRuleReturnScope indexes339 =null;
		ParserRuleReturnScope expression341 =null;
		ParserRuleReturnScope indexes343 =null;

		Object Identifier335_tree=null;
		Object String338_tree=null;
		Object char_literal340_tree=null;
		Object char_literal342_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_dotProperty=new RewriteRuleSubtreeStream(adaptor,"rule dotProperty");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:3: ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt59=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA59_1 = input.LA(2);
				if ( (LA59_1==OParen) ) {
					alt59=1;
				}
				else if ( (LA59_1==Add||LA59_1==CBracket||(LA59_1 >= CParen && LA59_1 <= Comma)||(LA59_1 >= Divide && LA59_1 <= Do)||(LA59_1 >= DotEnd && LA59_1 <= DotY)||LA59_1==Equals||(LA59_1 >= GT && LA59_1 <= GTEquals)||LA59_1==In||(LA59_1 >= LT && LA59_1 <= LTEquals)||LA59_1==Modulus||LA59_1==Multiply||LA59_1==NEquals||LA59_1==OBracket||LA59_1==Pow||LA59_1==QMark||LA59_1==Subtract||(LA59_1 >= 135 && LA59_1 <= 138)) ) {
					alt59=3;
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:3: ( functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt61=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA61_1 = input.LA(2);
				if ( (LA61_1==OParen) ) {
					alt61=1;
				}
				else if ( (LA61_1==Add||LA61_1==CBracket||LA61_1==CParen||LA61_1==Comma||(LA61_1 >= Divide && LA61_1 <= Do)||(LA61_1 >= DotEnd && LA61_1 <= DotY)||LA61_1==Equals||(LA61_1 >= GT && LA61_1 <= GTEquals)||LA61_1==In||(LA61_1 >= LT && LA61_1 <= LTEquals)||LA61_1==Modulus||LA61_1==Multiply||LA61_1==NEquals||LA61_1==OBracket||LA61_1==Pow||LA61_1==QMark||LA61_1==Subtract||(LA61_1 >= 140 && LA61_1 <= 143)) ) {
					alt61=3;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
<<<<<<< HEAD
							new NoViableAltException("", 59, 1, input);
=======
							new NoViableAltException("", 61, 1, input);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ATan:
			case Assert:
			case Clip:
			case Copy:
			case Cosine:
			case Curve:
			case Difference:
			case Ellipse:
			case Expand:
			case Fill:
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
			case Group:
			case Hide:
			case LAdd:
			case LRemove:
			case LShape:
			case Line:
			case Map:
			case Merge:
			case MirrorX:
			case MirrorY:
			case Move:
			case MoveBy:
			case NoFill:
			case NoStroke:
			case Point:
			case Polygon:
			case Print:
			case Println:
			case Random:
			case Rect:
			case Rotate:
			case Round:
			case Scale:
			case Shirt:
			case ShirtBack:
			case Sine:
			case Size:
			case Stroke:
			case Tan:
			case Union:
			case Weight:
			case Xor:
				{
<<<<<<< HEAD
				alt59=1;
=======
				alt61=1;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case OBracket:
				{
<<<<<<< HEAD
				alt59=2;
=======
				alt61=2;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case String:
				{
<<<<<<< HEAD
				alt59=4;
=======
				alt61=4;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			case OParen:
				{
<<<<<<< HEAD
				alt59=5;
=======
				alt61=5;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				}
				break;
			default:
				NoViableAltException nvae =
<<<<<<< HEAD
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:6: functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					{
					pushFollow(FOLLOW_functionCall_in_lookup2426);
					functionCall318=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall318.getTree());
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:19: ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==Add||LA53_0==CBracket||(LA53_0 >= CParen && LA53_0 <= Comma)||(LA53_0 >= Divide && LA53_0 <= Do)||LA53_0==Equals||(LA53_0 >= GT && LA53_0 <= GTEquals)||LA53_0==In||(LA53_0 >= LT && LA53_0 <= LTEquals)||LA53_0==Modulus||LA53_0==Multiply||LA53_0==NEquals||LA53_0==OBracket||LA53_0==Pow||LA53_0==QMark||LA53_0==Subtract||(LA53_0 >= 135 && LA53_0 <= 138)) ) {
						alt53=1;
					}
					else if ( ((LA53_0 >= DotEnd && LA53_0 <= DotY)) ) {
						alt53=2;
=======
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}
			switch (alt61) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:6: functionCall ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					{
					pushFollow(FOLLOW_functionCall_in_lookup2512);
					functionCall330=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall330.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:19: ( ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | dotProperty -> ^( DOTPROPERTY functionCall dotProperty ) )
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==Add||LA55_0==CBracket||LA55_0==CParen||LA55_0==Comma||(LA55_0 >= Divide && LA55_0 <= Do)||LA55_0==Equals||(LA55_0 >= GT && LA55_0 <= GTEquals)||LA55_0==In||(LA55_0 >= LT && LA55_0 <= LTEquals)||LA55_0==Modulus||LA55_0==Multiply||LA55_0==NEquals||LA55_0==OBracket||LA55_0==Pow||LA55_0==QMark||LA55_0==Subtract||(LA55_0 >= 140 && LA55_0 <= 143)) ) {
						alt55=1;
					}
					else if ( ((LA55_0 >= DotEnd && LA55_0 <= DotY)) ) {
						alt55=2;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}

					else {
						NoViableAltException nvae =
<<<<<<< HEAD
							new NoViableAltException("", 53, 0, input);
						throw nvae;
					}

					switch (alt53) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:20: ( indexes )?
							{
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:20: ( indexes )?
							int alt52=2;
							int LA52_0 = input.LA(1);
							if ( (LA52_0==OBracket) ) {
								alt52=1;
							}
							switch (alt52) {
								case 1 :
									// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:20: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup2429);
									indexes319=indexes();
									state._fsp--;

									stream_indexes.add(indexes319.getTree());
=======
							new NoViableAltException("", 55, 0, input);
						throw nvae;
					}

					switch (alt55) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:20: ( indexes )?
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:20: ( indexes )?
							int alt54=2;
							int LA54_0 = input.LA(1);
							if ( (LA54_0==OBracket) ) {
								alt54=1;
							}
							switch (alt54) {
								case 1 :
									// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:20: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup2515);
									indexes331=indexes();
									state._fsp--;

									stream_indexes.add(indexes331.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
									}
									break;

							}

							// AST REWRITE
							// elements: indexes, functionCall
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
							// 272:30: -> ^( LOOKUP functionCall ( indexes )? )
							{
								// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:33: ^( LOOKUP functionCall ( indexes )? )
=======
							// 278:30: -> ^( LOOKUP functionCall ( indexes )? )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:33: ^( LOOKUP functionCall ( indexes )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_functionCall.nextTree());
<<<<<<< HEAD
								// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:55: ( indexes )?
=======
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:55: ( indexes )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
								if ( stream_indexes.hasNext() ) {
									adaptor.addChild(root_1, stream_indexes.nextTree());
								}
								stream_indexes.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:67: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup2446);
							dotProperty320=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty320.getTree());
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:67: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup2532);
							dotProperty332=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty332.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							// AST REWRITE
							// elements: functionCall, dotProperty
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
							// 272:80: -> ^( DOTPROPERTY functionCall dotProperty )
							{
								// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:272:83: ^( DOTPROPERTY functionCall dotProperty )
=======
							// 278:80: -> ^( DOTPROPERTY functionCall dotProperty )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:278:83: ^( DOTPROPERTY functionCall dotProperty )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTPROPERTY, "DOTPROPERTY"), root_1);
								adaptor.addChild(root_1, stream_functionCall.nextTree());
								adaptor.addChild(root_1, stream_dotProperty.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 2 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:273:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup2471);
					list321=list();
					state._fsp--;

					stream_list.add(list321.getTree());
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:273:11: ( indexes )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==OBracket) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:273:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2473);
							indexes322=indexes();
							state._fsp--;

							stream_indexes.add(indexes322.getTree());
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:279:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup2557);
					list333=list();
					state._fsp--;

					stream_list.add(list333.getTree());
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:279:11: ( indexes )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==OBracket) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:279:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2559);
							indexes334=indexes();
							state._fsp--;

							stream_indexes.add(indexes334.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 273:34: -> ^( LOOKUP list ( indexes )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:273:37: ^( LOOKUP list ( indexes )? )
=======
					// 279:34: -> ^( LOOKUP list ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:279:37: ^( LOOKUP list ( indexes )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:273:51: ( indexes )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:279:51: ( indexes )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:6: Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					{
					Identifier323=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup2506);  
					stream_Identifier.add(Identifier323);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:17: ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==Add||LA56_0==CBracket||(LA56_0 >= CParen && LA56_0 <= Comma)||(LA56_0 >= Divide && LA56_0 <= Do)||LA56_0==Equals||(LA56_0 >= GT && LA56_0 <= GTEquals)||LA56_0==In||(LA56_0 >= LT && LA56_0 <= LTEquals)||LA56_0==Modulus||LA56_0==Multiply||LA56_0==NEquals||LA56_0==OBracket||LA56_0==Pow||LA56_0==QMark||LA56_0==Subtract||(LA56_0 >= 135 && LA56_0 <= 138)) ) {
						alt56=1;
					}
					else if ( ((LA56_0 >= DotEnd && LA56_0 <= DotY)) ) {
						alt56=2;
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:6: Identifier ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					{
					Identifier335=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup2592);  
					stream_Identifier.add(Identifier335);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:17: ( ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | dotProperty -> ^( DOTPROPERTY Identifier dotProperty ) )
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==Add||LA58_0==CBracket||LA58_0==CParen||LA58_0==Comma||(LA58_0 >= Divide && LA58_0 <= Do)||LA58_0==Equals||(LA58_0 >= GT && LA58_0 <= GTEquals)||LA58_0==In||(LA58_0 >= LT && LA58_0 <= LTEquals)||LA58_0==Modulus||LA58_0==Multiply||LA58_0==NEquals||LA58_0==OBracket||LA58_0==Pow||LA58_0==QMark||LA58_0==Subtract||(LA58_0 >= 140 && LA58_0 <= 143)) ) {
						alt58=1;
					}
					else if ( ((LA58_0 >= DotEnd && LA58_0 <= DotY)) ) {
						alt58=2;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}

					else {
						NoViableAltException nvae =
<<<<<<< HEAD
							new NoViableAltException("", 56, 0, input);
						throw nvae;
					}

					switch (alt56) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:18: ( indexes )?
							{
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:18: ( indexes )?
							int alt55=2;
							int LA55_0 = input.LA(1);
							if ( (LA55_0==OBracket) ) {
								alt55=1;
							}
							switch (alt55) {
								case 1 :
									// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:18: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup2509);
									indexes324=indexes();
									state._fsp--;

									stream_indexes.add(indexes324.getTree());
=======
							new NoViableAltException("", 58, 0, input);
						throw nvae;
					}

					switch (alt58) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:18: ( indexes )?
							{
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:18: ( indexes )?
							int alt57=2;
							int LA57_0 = input.LA(1);
							if ( (LA57_0==OBracket) ) {
								alt57=1;
							}
							switch (alt57) {
								case 1 :
									// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:18: indexes
									{
									pushFollow(FOLLOW_indexes_in_lookup2595);
									indexes336=indexes();
									state._fsp--;

									stream_indexes.add(indexes336.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
									}
									break;

							}

							// AST REWRITE
							// elements: Identifier, indexes
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
							// 274:28: -> ^( LOOKUP Identifier ( indexes )? )
							{
								// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:31: ^( LOOKUP Identifier ( indexes )? )
=======
							// 280:28: -> ^( LOOKUP Identifier ( indexes )? )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:31: ^( LOOKUP Identifier ( indexes )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
<<<<<<< HEAD
								// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:51: ( indexes )?
=======
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:51: ( indexes )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
								if ( stream_indexes.hasNext() ) {
									adaptor.addChild(root_1, stream_indexes.nextTree());
								}
								stream_indexes.reset();

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
<<<<<<< HEAD
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:63: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup2526);
							dotProperty325=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty325.getTree());
=======
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:63: dotProperty
							{
							pushFollow(FOLLOW_dotProperty_in_lookup2612);
							dotProperty337=dotProperty();
							state._fsp--;

							stream_dotProperty.add(dotProperty337.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							// AST REWRITE
							// elements: dotProperty, Identifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
							// 274:76: -> ^( DOTPROPERTY Identifier dotProperty )
							{
								// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:274:79: ^( DOTPROPERTY Identifier dotProperty )
=======
							// 280:76: -> ^( DOTPROPERTY Identifier dotProperty )
							{
								// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:280:79: ^( DOTPROPERTY Identifier dotProperty )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOTPROPERTY, "DOTPROPERTY"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								adaptor.addChild(root_1, stream_dotProperty.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 4 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:275:6: String ( indexes )?
					{
					String326=(Token)match(input,String,FOLLOW_String_in_lookup2546);  
					stream_String.add(String326);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:275:13: ( indexes )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==OBracket) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:275:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2548);
							indexes327=indexes();
							state._fsp--;

							stream_indexes.add(indexes327.getTree());
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:281:6: String ( indexes )?
					{
					String338=(Token)match(input,String,FOLLOW_String_in_lookup2632);  
					stream_String.add(String338);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:281:13: ( indexes )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==OBracket) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:281:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2634);
							indexes339=indexes();
							state._fsp--;

							stream_indexes.add(indexes339.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, String
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 275:34: -> ^( LOOKUP String ( indexes )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:275:37: ^( LOOKUP String ( indexes )? )
=======
					// 281:34: -> ^( LOOKUP String ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:281:37: ^( LOOKUP String ( indexes )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:275:53: ( indexes )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:281:53: ( indexes )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
<<<<<<< HEAD
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:6: '(' expression ')' ( indexes )?
					{
					char_literal328=(Token)match(input,OParen,FOLLOW_OParen_in_lookup2579);  
					stream_OParen.add(char_literal328);

					pushFollow(FOLLOW_expression_in_lookup2581);
					expression329=expression();
					state._fsp--;

					stream_expression.add(expression329.getTree());
					char_literal330=(Token)match(input,CParen,FOLLOW_CParen_in_lookup2583);  
					stream_CParen.add(char_literal330);

					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:25: ( indexes )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==OBracket) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2585);
							indexes331=indexes();
							state._fsp--;

							stream_indexes.add(indexes331.getTree());
=======
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:6: '(' expression ')' ( indexes )?
					{
					char_literal340=(Token)match(input,OParen,FOLLOW_OParen_in_lookup2665);  
					stream_OParen.add(char_literal340);

					pushFollow(FOLLOW_expression_in_lookup2667);
					expression341=expression();
					state._fsp--;

					stream_expression.add(expression341.getTree());
					char_literal342=(Token)match(input,CParen,FOLLOW_CParen_in_lookup2669);  
					stream_CParen.add(char_literal342);

					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:25: ( indexes )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==OBracket) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup2671);
							indexes343=indexes();
							state._fsp--;

							stream_indexes.add(indexes343.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
							}
							break;

					}

					// AST REWRITE
					// elements: expression, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
					// 276:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:37: ^( LOOKUP expression ( indexes )? )
=======
					// 282:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:37: ^( LOOKUP expression ( indexes )? )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
<<<<<<< HEAD
						// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:276:57: ( indexes )?
=======
						// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:282:57: ( indexes )?
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookup"


	public static class indexes_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "indexes"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:283:4: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:289:4: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.indexes_return indexes() throws RecognitionException {
		PogoParser.indexes_return retval = new PogoParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token char_literal332=null;
		Token char_literal334=null;
		ParserRuleReturnScope expression333 =null;

		Object char_literal332_tree=null;
		Object char_literal334_tree=null;
=======
		Token char_literal344=null;
		Token char_literal346=null;
		ParserRuleReturnScope expression345 =null;

		Object char_literal344_tree=null;
		Object char_literal346_tree=null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:284:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:284:6: ( '[' expression ']' )+
			{
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:284:6: ( '[' expression ']' )+
			int cnt60=0;
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==OBracket) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:284:7: '[' expression ']'
					{
					char_literal332=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes2629);  
					stream_OBracket.add(char_literal332);

					pushFollow(FOLLOW_expression_in_indexes2631);
					expression333=expression();
					state._fsp--;

					stream_expression.add(expression333.getTree());
					char_literal334=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes2633);  
					stream_CBracket.add(char_literal334);
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:290:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:290:6: ( '[' expression ']' )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:290:6: ( '[' expression ']' )+
			int cnt62=0;
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==OBracket) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:290:7: '[' expression ']'
					{
					char_literal344=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes2715);  
					stream_OBracket.add(char_literal344);

					pushFollow(FOLLOW_expression_in_indexes2717);
					expression345=expression();
					state._fsp--;

					stream_expression.add(expression345.getTree());
					char_literal346=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes2719);  
					stream_CBracket.add(char_literal346);
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

					}
					break;

				default :
<<<<<<< HEAD
					if ( cnt60 >= 1 ) break loop60;
					EarlyExitException eee = new EarlyExitException(60, input);
					throw eee;
				}
				cnt60++;
=======
					if ( cnt62 >= 1 ) break loop62;
					EarlyExitException eee = new EarlyExitException(62, input);
					throw eee;
				}
				cnt62++;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
			// 284:28: -> ^( INDEXES ( expression )+ )
			{
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:284:31: ^( INDEXES ( expression )+ )
=======
			// 290:28: -> ^( INDEXES ( expression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:290:31: ^( INDEXES ( expression )+ )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEXES, "INDEXES"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indexes"


	public static class dotProperty_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dotProperty"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:287:3: dotProperty : ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) ;
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:293:3: dotProperty : ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) ;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.dotProperty_return dotProperty() throws RecognitionException {
		PogoParser.dotProperty_return retval = new PogoParser.dotProperty_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		ParserRuleReturnScope dotExpression335 =null;
=======
		ParserRuleReturnScope dotExpression347 =null;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de

		RewriteRuleSubtreeStream stream_dotExpression=new RewriteRuleSubtreeStream(adaptor,"rule dotExpression");

		try {
<<<<<<< HEAD
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:288:3: ( ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:288:6: ( dotExpression )+
			{
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:288:6: ( dotExpression )+
			int cnt61=0;
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( ((LA61_0 >= DotEnd && LA61_0 <= DotY)) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:288:7: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2664);
					dotExpression335=dotExpression();
					state._fsp--;

					stream_dotExpression.add(dotExpression335.getTree());
=======
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:294:3: ( ( dotExpression )+ -> ^( DOT ( dotExpression )+ ) )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:294:6: ( dotExpression )+
			{
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:294:6: ( dotExpression )+
			int cnt63=0;
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( ((LA63_0 >= DotEnd && LA63_0 <= DotY)) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:294:7: dotExpression
					{
					pushFollow(FOLLOW_dotExpression_in_dotProperty2750);
					dotExpression347=dotExpression();
					state._fsp--;

					stream_dotExpression.add(dotExpression347.getTree());
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
					}
					break;

				default :
<<<<<<< HEAD
					if ( cnt61 >= 1 ) break loop61;
					EarlyExitException eee = new EarlyExitException(61, input);
					throw eee;
				}
				cnt61++;
=======
					if ( cnt63 >= 1 ) break loop63;
					EarlyExitException eee = new EarlyExitException(63, input);
					throw eee;
				}
				cnt63++;
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			}

			// AST REWRITE
			// elements: dotExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< HEAD
			// 288:23: -> ^( DOT ( dotExpression )+ )
			{
				// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:288:26: ^( DOT ( dotExpression )+ )
=======
			// 294:23: -> ^( DOT ( dotExpression )+ )
			{
				// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:294:26: ^( DOT ( dotExpression )+ )
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOT, "DOT"), root_1);
				if ( !(stream_dotExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_dotExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_dotExpression.nextTree());
				}
				stream_dotExpression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dotProperty"


	public static class dotExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dotExpression"
<<<<<<< HEAD
	// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:292:3: dotExpression : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
=======
	// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:298:3: dotExpression : ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight );
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
	public final PogoParser.dotExpression_return dotExpression() throws RecognitionException {
		PogoParser.dotExpression_return retval = new PogoParser.dotExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< HEAD
		Token set336=null;

		Object set336_tree=null;

		try {
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:293:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			// /Users/Pang/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
=======
		Token set348=null;

		Object set348_tree=null;

		try {
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:299:3: ( DotX | DotY | DotStart | DotEnd | DotOrigin | DotRotation | DotWidth | DotHeight | DotFill | DotStroke | DotWeight )
			// /Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/workspace/DressCode_v0.5/src/com/pixelmaid/dresscode/antlr/Pogo.g:
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
			{
			root_0 = (Object)adaptor.nil();


<<<<<<< HEAD
			set336=input.LT(1);
			if ( (input.LA(1) >= DotEnd && input.LA(1) <= DotY) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set336));
=======
			set348=input.LT(1);
			if ( (input.LA(1) >= DotEnd && input.LA(1) <= DotY) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set348));
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dotExpression"

	// Delegated rules



<<<<<<< HEAD
	public static final BitSet FOLLOW_block_in_parse172 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_parse174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block192 = new BitSet(new long[]{0xFFCC8400011C0122L,0x27CFC6C0633CC98BL,0x0000000000000161L});
	public static final BitSet FOLLOW_functionDecl_in_block196 = new BitSet(new long[]{0xFFCC8400011C0122L,0x27CFC6C0633CC98BL,0x0000000000000161L});
	public static final BitSet FOLLOW_Return_in_block201 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_block203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_136_in_block205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_136_in_statement249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_136_in_statement264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment311 = new BitSet(new long[]{0x0000000000000200L,0x0000000400000000L});
	public static final BitSet FOLLOW_indexes_in_assignment313 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Assign_in_assignment316 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_assignment318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall352 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall354 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_functionCall356 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall377 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall379 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_functionCall381 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall403 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall405 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_functionCall407 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall430 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall432 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_functionCall434 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall456 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall458 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_functionCall460 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAdd_in_functionCall484 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall486 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_functionCall488 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LRemove_in_functionCall512 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall514 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_functionCall516 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionCall519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall580 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall582 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall584 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Line_in_primitiveCall607 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall609 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall611 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall634 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall636 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall638 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall661 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall663 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall665 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall686 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall688 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall690 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall711 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall713 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall715 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Point_in_primitiveCall737 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall739 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall741 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Shirt_in_primitiveCall762 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall764 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall766 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ShirtBack_in_primitiveCall786 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall788 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_primitiveCall790 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Move_in_transformCall823 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall825 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_transformCall827 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall848 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall850 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_transformCall852 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Copy_in_transformCall879 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall881 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_transformCall883 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rotate_in_transformCall902 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall904 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_transformCall906 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Fill_in_transformCall926 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall928 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_transformCall930 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Stroke_in_transformCall950 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall952 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_transformCall954 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoFill_in_transformCall974 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall976 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_transformCall978 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall996 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall998 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_transformCall1000 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Weight_in_transformCall1018 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1020 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_transformCall1022 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hide_in_transformCall1042 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1044 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_transformCall1046 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Group_in_transformCall1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1066 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_transformCall1068 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Expand_in_transformCall1088 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1090 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_transformCall1092 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Merge_in_transformCall1110 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1112 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_transformCall1114 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Scale_in_transformCall1132 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1134 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_transformCall1136 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1158 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_transformCall1160 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1194 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1196 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_getCall1198 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1216 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_getCall1218 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetX_in_getCall1234 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1236 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_getCall1238 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetY_in_getCall1254 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1256 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_getCall1258 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1276 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_getCall1278 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1294 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1296 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_getCall1298 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetFill_in_getCall1314 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1316 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_getCall1318 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1334 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1336 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_getCall1338 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetStart_in_getCall1354 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1356 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_getCall1358 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1374 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1376 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_getCall1378 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1396 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1398 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_getCall1400 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_getCall1404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1436 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1438 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_mathCall1440 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Sine_in_mathCall1461 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1463 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_mathCall1465 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Tan_in_mathCall1486 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1488 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_mathCall1490 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ATan_in_mathCall1511 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1513 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_mathCall1515 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Random_in_mathCall1536 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1538 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_mathCall1540 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Round_in_mathCall1563 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1564 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_mathCall1566 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Map_in_mathCall1587 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1588 = new BitSet(new long[]{0xFFC4C400001CC920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_mathCall1590 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1628 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1630 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1633 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_ifStatement1636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat1665 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_ifStat1667 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_ifStat1669 = new BitSet(new long[]{0xFFCC8400011C0120L,0x27CFC6C0633CC98BL,0x0000000000000161L});
	public static final BitSet FOLLOW_block_in_ifStat1671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_If_in_elseIfStat1697 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_elseIfStat1699 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_elseIfStat1701 = new BitSet(new long[]{0xFFCC8400011C0120L,0x27CFC6C0633CC98BL,0x0000000000000161L});
	public static final BitSet FOLLOW_block_in_elseIfStat1703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat1727 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_elseStat1729 = new BitSet(new long[]{0xFFCC8400011C0120L,0x27CFC6C0633CC98BL,0x0000000000000161L});
	public static final BitSet FOLLOW_block_in_elseStat1731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Def_in_functionDecl1753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl1755 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl1757 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000080L});
	public static final BitSet FOLLOW_idList_in_functionDecl1759 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl1762 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_functionDecl1764 = new BitSet(new long[]{0xFFCC9400011C0120L,0x27CFC6C0633CC98BL,0x0000000000000161L});
	public static final BitSet FOLLOW_block_in_functionDecl1766 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_functionDecl1768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement1790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1792 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Assign_in_forStatement1794 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_forStatement1796 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1798 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_forStatement1800 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1802 = new BitSet(new long[]{0xFFCC9400011C0120L,0x27CFC6C0633CC98BL,0x0000000000000161L});
	public static final BitSet FOLLOW_block_in_forStatement1804 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_forStatement1806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1841 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_Assign_in_repeatStatement1843 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1845 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1847 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1849 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_137_in_repeatStatement1852 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1854 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1858 = new BitSet(new long[]{0xFFCC9400011C0120L,0x27CFC6C0633CC98BL,0x0000000000000161L});
	public static final BitSet FOLLOW_block_in_repeatStatement1860 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_repeatStatement1862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement1890 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_whileStatement1892 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_whileStatement1894 = new BitSet(new long[]{0xFFCC9400011C0120L,0x27CFC6C0633CC98BL,0x0000000000000161L});
	public static final BitSet FOLLOW_block_in_whileStatement1896 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_End_in_whileStatement1898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList1922 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_Comma_in_idList1925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_Identifier_in_idList1927 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_expression_in_exprList1952 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_Comma_in_exprList1955 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_exprList1957 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_condExpr_in_expression1982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr1997 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000200L});
	public static final BitSet FOLLOW_QMark_in_condExpr2012 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_condExpr2016 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Do_in_condExpr2018 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_condExpr2022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr2045 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_condExpr2047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr2099 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_138_in_orExpr2102 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_andExpr_in_orExpr2105 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_equExpr_in_andExpr2121 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_135_in_andExpr2124 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_equExpr_in_andExpr2127 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_relExpr_in_equExpr2143 = new BitSet(new long[]{0x0000200000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_set_in_equExpr2146 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_relExpr_in_equExpr2155 = new BitSet(new long[]{0x0000200000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_addExpr_in_relExpr2171 = new BitSet(new long[]{0x0030000000000002L,0x0000000000030000L});
	public static final BitSet FOLLOW_set_in_relExpr2174 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_addExpr_in_relExpr2191 = new BitSet(new long[]{0x0030000000000002L,0x0000000000030000L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr2207 = new BitSet(new long[]{0x0000000000000042L,0x4000000000000000L});
	public static final BitSet FOLLOW_set_in_addExpr2210 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr2219 = new BitSet(new long[]{0x0000000000000042L,0x4000000000000000L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr2235 = new BitSet(new long[]{0x0000000004000002L,0x0000000004800000L});
	public static final BitSet FOLLOW_set_in_mulExpr2238 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr2251 = new BitSet(new long[]{0x0000000004000002L,0x0000000004800000L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr2267 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_Pow_in_powExpr2270 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr2273 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr2291 = new BitSet(new long[]{0xFFC48400001C4920L,0x37CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr2308 = new BitSet(new long[]{0xFFC48400001C4920L,0x37CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom2339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom2346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom2353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom2360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_atom2366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_atom2372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_atom2378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_atom2384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list2398 = new BitSet(new long[]{0xFFC4C400001C6920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_exprList_in_list2400 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CBracket_in_list2403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_lookup2426 = new BitSet(new long[]{0x000000FFE0000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup2471 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup2506 = new BitSet(new long[]{0x000000FFE0000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup2546 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup2579 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_lookup2581 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CParen_in_lookup2583 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes2629 = new BitSet(new long[]{0xFFC4C400001C4920L,0x77CCC6EDE33CC88FL,0x0000000000000031L});
	public static final BitSet FOLLOW_expression_in_indexes2631 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CBracket_in_indexes2633 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2664 = new BitSet(new long[]{0x000000FFE0000002L});
=======
	public static final BitSet FOLLOW_block_in_parse187 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_parse189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block207 = new BitSet(new long[]{0xFCC8400018E40482L,0x38FC6C0637CC98BFL,0x0000000000002E89L});
	public static final BitSet FOLLOW_functionDecl_in_block211 = new BitSet(new long[]{0xFCC8400018E40482L,0x38FC6C0637CC98BFL,0x0000000000002E89L});
	public static final BitSet FOLLOW_Return_in_block216 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_block218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_141_in_block220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_141_in_statement264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_141_in_statement279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment326 = new BitSet(new long[]{0x0000000000000800L,0x0000004000000000L});
	public static final BitSet FOLLOW_indexes_in_assignment328 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_Assign_in_assignment331 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_assignment333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall367 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall369 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_functionCall371 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall392 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall394 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_functionCall396 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall418 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall420 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_functionCall422 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall445 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall447 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_functionCall449 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall471 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall473 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_functionCall475 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LAdd_in_functionCall499 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall501 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_functionCall503 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LRemove_in_functionCall527 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall529 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_functionCall531 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionCall534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveCall_in_functionCall555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_transformCall_in_functionCall562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mathCall_in_functionCall569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCall_in_functionCall575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ellipse_in_primitiveCall595 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall597 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall599 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Line_in_primitiveCall622 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall624 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall626 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rect_in_primitiveCall649 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall651 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall653 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Curve_in_primitiveCall676 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall678 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall680 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Polygon_in_primitiveCall701 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall703 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall705 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LShape_in_primitiveCall726 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall728 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall730 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Point_in_primitiveCall752 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_primitiveCall754 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_primitiveCall756 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_primitiveCall759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Move_in_transformCall790 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall792 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_transformCall794 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MoveBy_in_transformCall815 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall817 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_transformCall819 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Copy_in_transformCall846 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall848 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_transformCall850 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Rotate_in_transformCall869 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall871 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_transformCall873 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Fill_in_transformCall893 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall895 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_transformCall897 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Stroke_in_transformCall917 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall919 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_transformCall921 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoFill_in_transformCall941 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall943 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_transformCall945 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NoStroke_in_transformCall963 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall965 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_transformCall967 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Weight_in_transformCall985 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall987 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_transformCall989 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hide_in_transformCall1009 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1011 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_transformCall1013 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Group_in_transformCall1031 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1033 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_transformCall1035 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Expand_in_transformCall1055 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1057 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_transformCall1059 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Merge_in_transformCall1077 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1079 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_transformCall1081 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Scale_in_transformCall1099 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1101 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_transformCall1103 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MirrorX_in_transformCall1123 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1125 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_transformCall1127 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MirrorY_in_transformCall1145 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1147 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_transformCall1149 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Union_in_transformCall1167 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1169 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_transformCall1171 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Difference_in_transformCall1191 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1193 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_transformCall1195 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clip_in_transformCall1215 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1217 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_transformCall1219 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Xor_in_transformCall1239 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_transformCall1241 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_transformCall1243 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_transformCall1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetWidth_in_getCall1280 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1282 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_getCall1284 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetHeight_in_getCall1300 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1302 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_getCall1304 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetX_in_getCall1320 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1322 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_getCall1324 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetY_in_getCall1340 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1342 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_getCall1344 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetOrigin_in_getCall1360 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1362 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_getCall1364 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetRotation_in_getCall1380 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1382 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_getCall1384 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetFill_in_getCall1400 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1402 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_getCall1404 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetStroke_in_getCall1420 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1422 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_getCall1424 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetStart_in_getCall1440 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1442 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_getCall1444 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetEnd_in_getCall1460 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1462 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_getCall1464 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GetDistance_in_getCall1482 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_getCall1484 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_getCall1486 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_getCall1490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Cosine_in_mathCall1522 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1524 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_mathCall1526 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Sine_in_mathCall1547 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1549 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_mathCall1551 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Tan_in_mathCall1572 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1574 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_mathCall1576 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ATan_in_mathCall1597 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1599 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_mathCall1601 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Random_in_mathCall1622 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1624 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_mathCall1626 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Round_in_mathCall1649 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1650 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_mathCall1652 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Map_in_mathCall1673 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_mathCall1674 = new BitSet(new long[]{0xFC4C400010E72480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_mathCall1676 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_mathCall1679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement1714 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement1716 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement1719 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_End_in_ifStatement1722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat1751 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_ifStat1753 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_ifStat1755 = new BitSet(new long[]{0xFCC8400018E40480L,0x38FC6C0637CC98BFL,0x0000000000002E89L});
	public static final BitSet FOLLOW_block_in_ifStat1757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat1781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_If_in_elseIfStat1783 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_elseIfStat1785 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_elseIfStat1787 = new BitSet(new long[]{0xFCC8400018E40480L,0x38FC6C0637CC98BFL,0x0000000000002E89L});
	public static final BitSet FOLLOW_block_in_elseIfStat1789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat1813 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_elseStat1815 = new BitSet(new long[]{0xFCC8400018E40480L,0x38FC6C0637CC98BFL,0x0000000000002E89L});
	public static final BitSet FOLLOW_block_in_elseStat1817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Def_in_functionDecl1839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl1841 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl1843 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000800L});
	public static final BitSet FOLLOW_idList_in_functionDecl1845 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl1848 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_functionDecl1850 = new BitSet(new long[]{0xFCC9400018E40480L,0x38FC6C0637CC98BFL,0x0000000000002E89L});
	public static final BitSet FOLLOW_block_in_functionDecl1852 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_End_in_functionDecl1854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_Identifier_in_forStatement1878 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_Assign_in_forStatement1880 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_forStatement1882 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1884 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_forStatement1886 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_forStatement1888 = new BitSet(new long[]{0xFCC9400018E40480L,0x38FC6C0637CC98BFL,0x0000000000002E89L});
	public static final BitSet FOLLOW_block_in_forStatement1890 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_End_in_forStatement1892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Repeat_in_repeatStatement1925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_Identifier_in_repeatStatement1927 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_Assign_in_repeatStatement1929 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1931 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1933 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1935 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_142_in_repeatStatement1938 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_repeatStatement1940 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Do_in_repeatStatement1944 = new BitSet(new long[]{0xFCC9400018E40480L,0x38FC6C0637CC98BFL,0x0000000000002E89L});
	public static final BitSet FOLLOW_block_in_repeatStatement1946 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_End_in_repeatStatement1948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement1976 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_whileStatement1978 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_whileStatement1980 = new BitSet(new long[]{0xFCC9400018E40480L,0x38FC6C0637CC98BFL,0x0000000000002E89L});
	public static final BitSet FOLLOW_block_in_whileStatement1982 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_End_in_whileStatement1984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList2008 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_Comma_in_idList2011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_Identifier_in_idList2013 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_expression_in_exprList2038 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_Comma_in_exprList2041 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_exprList2043 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_condExpr_in_expression2068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr2083 = new BitSet(new long[]{0x0000000000000002L,0x0000800000002000L});
	public static final BitSet FOLLOW_QMark_in_condExpr2098 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_condExpr2102 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Do_in_condExpr2104 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_condExpr2108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr2131 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_condExpr2133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr2185 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_143_in_orExpr2188 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_andExpr_in_orExpr2191 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_equExpr_in_andExpr2207 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_140_in_andExpr2210 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_equExpr_in_andExpr2213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_relExpr_in_equExpr2229 = new BitSet(new long[]{0x0002000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_set_in_equExpr2232 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_relExpr_in_equExpr2241 = new BitSet(new long[]{0x0002000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_addExpr_in_relExpr2257 = new BitSet(new long[]{0x0300000000000002L,0x0000000000300000L});
	public static final BitSet FOLLOW_set_in_relExpr2260 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_addExpr_in_relExpr2277 = new BitSet(new long[]{0x0300000000000002L,0x0000000000300000L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr2293 = new BitSet(new long[]{0x0000000000000102L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_addExpr2296 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_mulExpr_in_addExpr2305 = new BitSet(new long[]{0x0000000000000102L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr2321 = new BitSet(new long[]{0x0000000040000002L,0x0000000048000000L});
	public static final BitSet FOLLOW_set_in_mulExpr2324 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_powExpr_in_mulExpr2337 = new BitSet(new long[]{0x0000000040000002L,0x0000000048000000L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr2353 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_Pow_in_powExpr2356 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr2359 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr2377 = new BitSet(new long[]{0xFC48400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B89L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr2394 = new BitSet(new long[]{0xFC48400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B89L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr2411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom2425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom2432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom2439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom2446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLOR_CONSTANT_in_atom2452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_CONSTANT_in_atom2458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WIDTH_CONSTANT_in_atom2464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEIGHT_CONSTANT_in_atom2470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list2484 = new BitSet(new long[]{0xFC4C400010E5A480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_exprList_in_list2486 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CBracket_in_list2489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_lookup2512 = new BitSet(new long[]{0x00000FFE00000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup2557 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup2592 = new BitSet(new long[]{0x00000FFE00000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotProperty_in_lookup2612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup2632 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup2665 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_lookup2667 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CParen_in_lookup2669 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_indexes_in_lookup2671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes2715 = new BitSet(new long[]{0xFC4C400010E52480L,0xB8CC6EDE37CC88FFL,0x0000000000000B8BL});
	public static final BitSet FOLLOW_expression_in_indexes2717 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CBracket_in_indexes2719 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_dotExpression_in_dotProperty2750 = new BitSet(new long[]{0x00000FFE00000002L});
>>>>>>> 01de5004d4a737f345aaefba95f2d121cc7438de
}
