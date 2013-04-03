package com.pixelmaid.dresscode.data;

import java.util.ArrayList;
import java.util.Map;

import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.antlr.types.tree.functions.DrawableNode;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;
//manages all of the current drawables  generated by the user and controls access to them

public class DrawableManager extends NodeEvent implements CustomEventListener {
	
	private ArrayList<Drawable> drawables = new ArrayList<Drawable>();

	
	public void addDrawable(Drawable d) {
		drawables.add(d);
	}
	
	public void swapDrawable(Drawable a, Drawable b){
		int i = drawables.indexOf(a);
		setDrawable(b,i);
	}
	
	public void setDrawable(Drawable a, int i){	
		drawables.set(i, a);	
	}

	public boolean removeDrawable(Drawable d){
		return drawables.remove(d);
	}
	
	public boolean removeDrawableAt(int i){
		return drawables.remove(i)==null?false:true;
	}

	
	public void clearAllDrawables() {
		drawables.clear();

	}
	
	public ArrayList<Drawable> getDrawables(){
		return this.drawables;
	}

	@Override
	public void handleCustomDrawableEvent(Object source, int eventType, Drawable d) {
		//System.out.println("drawable event called");
		switch (eventType){
		case CustomEvent.DRAWABLE_CREATED:
			this.addDrawable(d);
			d.addEventListener(this);
			//System.out.println("drawable created");
			break;
			
		case CustomEvent.REMOVE_DRAWABLE:
			this.removeDrawable(d);
			d.removeEventListener(this);
			//System.out.println("drawable removed");
			//System.out.println("condensing holes");
			break;
		
		case CustomEvent.SHAPE_LOAD_REQUESTED:
			this.drawableEvent(CustomEvent.SHAPE_LOAD_REQUESTED, d);
			break;
		}
		
	}

	@Override
	public void handleCustomEvent(Object source, int eventType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCustomTargetEvent(Object source, int event, double x,
			double y) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
