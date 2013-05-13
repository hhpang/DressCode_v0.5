package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.primitive2d.ShirtBack;
import com.pixelmaid.dresscode.events.CustomEvent;

public class ShirtBackNode extends DrawableNode implements DCNode {

	public ShirtBackNode(List<DCNode> ps, int l) {
		super(ps,l);
		System.out.println("shirt back initialized");

	}

	@Override
	public VarType evaluate() {
		System.out.println("shirt eval begun");

		ShirtBack e = new ShirtBack();

		try{
			/*
			if(params.get(0).evaluate().isString()){
				String path = params.get(0).evaluate().asString();
				//e.setPath(path);
				//e.loadShape();
				
				if(params.size()>1){
					if(params.size()==3 && params.get(1).evaluate().isNumber()&& params.get(2).evaluate().isNumber()){
						
						e.moveTo(params.get(1).evaluate().asDouble(),params.get(2).evaluate().asDouble());
					}
				}
			
			}
			else{
				//Window.output.setText("incorrect parameters for ShirtBack call at line:"+line);

				System.err.println("inccorect arguments for ShirtBack at line:"+line);
			}

			*/
			this.drawableEvent(CustomEvent.DRAWABLE_CREATED, e);
			this.drawableEvent(CustomEvent.SHAPE_LOAD_REQUESTED, e);
		}
		catch (ClassCastException err){
			//Window.output.setText("incorrect parameters for ShirtBack call at line:"+line);

			System.err.println("inccorect arguments for ShirtBack at line:"+line);
		}
		System.out.println("shirt eval end");
		return new VarType(e);	
		//throw new RuntimeException("Illegal function call: " + this);
	}


}

