package com.pixelmaid.dresscode.drawing.math;

import java.util.ArrayList;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Hole;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.seisw.util.geom.Point2D;
import com.seisw.util.geom.Poly ;
import com.seisw.util.geom.PolyDefault ;

public class PolyBoolean{

	public static Drawable condense(Drawable d){
		/*Polygon p = new Polygon();
	
		if(d.isPolygon()){
			d.setAbsolute();
			return d;
		}
		System.out.println("children are polygons = "+d.childrenArePolygons());
		while(!d.childrenArePolygons()){
			for(int i=0;i<d.children.size();i++){
				if(!d.children.get(i).isPolygon()){
					ArrayList<Drawable> orphans = d.children.get(i).removeAllChildren();
					d.addAllChildren(orphans);
					break;
				}
			}
		}*/
		return d;
	}
	
	
	//performs union of two polygons and returns the result
	public static Drawable union(Drawable a, Drawable b){
		
		
		Poly a_Poly =  drawableToBoolean(a);
		Poly b_Poly =  drawableToBoolean(b);
		Drawable a_P =  booleanToDrawable(a_Poly);
		Drawable b_P =   booleanToDrawable(b_Poly);


		//Poly o_Poly = a_Poly.union(b_Poly);

		//System.out.println("oPoly.size="+o_Poly.getNumPoints());

		//return booleanToDrawable(o_Poly);
		
		//a = a.toPolygon();
		//b = b.toPolygon();
		
		a_P = a_P.addToGroup(b_P);
		//System.out.println("a_p="+a_P.numChildren());
		a_P = a_P.removeFromGroup(b_P);
		Manager.canvas.addDrawable("drawable",-1,b_P);
		//System.out.println("a_p2="+a_P.numChildren());

		return a_P;
	}
	
	/*public static Drawable CondenseDrawable(Drawable a){
		
		ArrayList<Drawable> children = a.getChildren();
		for(int i=a.numChildren()-1;i>=0;i--){
			if(children.get(i).numChildren()==0){ //is a polygon
				
			}
			
		}
	}*/

	//performs difference of two polygons and returns the result
	public static Drawable difference(Drawable a, Drawable b) {
		Poly a_Poly =  drawableToBoolean(a);
		Poly b_Poly =  drawableToBoolean(b);
		Poly o_Poly = a_Poly.difference(b_Poly);
		//System.out.println("oPoly.size="+o_Poly.getNumPoints());

		return booleanToDrawable(o_Poly);
	}

	//converts drawable to collection of boolean operation polygons
	private static Poly drawableToBoolean(Drawable d){
		Poly m_Poly = new PolyDefault(); // master level polygon
		d = d.toPolygon();

		if(d.numChildren()==0){
			System.out.println("number of children = 0");
			return polygonToBoolean((Polygon)d);
		}
		else{
			for(int j=0;j<d.children.size();j++){
				Polygon p = (Polygon)d.children.get(j);
				m_Poly.add(polygonToBoolean(p));
			}
			return m_Poly;
		}

	}
	
	//converts single polygon to single boolean operation polygon
	private static Poly polygonToBoolean(Polygon p){
		p.setAbsolute();
		ArrayList<Point> pPoints = p.getPoints();

		//temp polygon to be stored in master polygon
		Poly p_Poly = new PolyDefault();

		//add all polygon points to temp polygon
		for(int i=0;i<pPoints.size();i++)
		{
			p_Poly.add( new Point2D(pPoints.get(i).getX(),pPoints.get(i).getY()) );
		}
		//add all polygon holes to temp polygon
		ArrayList<Hole> holes = p.getHoles();

		for(int i=0;i<holes.size();i++)
		{	
			Poly h_Poly = new PolyDefault();
			h_Poly.setIsHole(true);
			ArrayList<Point> holePoints = holes.get(i).getPoints();
			for(int k=0;k<holePoints.size();k++)
			{
				
				h_Poly.add( new Point2D(holePoints.get(i).getX(),holePoints.get(i).getY()) );
			}
		}
		return p_Poly;
	}
	//converts boolean operation collection of polygons to drawable
	private static Drawable booleanToDrawable(Poly poly){

		Drawable master = new Drawable();
		if(poly.getNumInnerPoly()==1){
			master = booleanToPolygon(poly.getInnerPoly(0));
			System.out.println("PolyBoolean has only one polygon result");

			//master.setRelativeTo(Geom.findCentroid((Polygon)master));
		}
		else{
			ArrayList<Point> origins = new ArrayList<Point>();

			for( int i = 0 ; i < poly.getNumInnerPoly() ; i++ )
			{
				Poly ip = poly.getInnerPoly(i);
				Polygon p = booleanToPolygon(ip);
				System.out.println(p.getPoints().size());
				origins.add(p.getOrigin());
				master.addToGroup(p);
			}
		
		}
		return master;
	}
	
	
	//converts single boolean operation polygon to single polygon

	private static Polygon booleanToPolygon(Poly ip)
	{
		Polygon jp = new Polygon();
		for( int i = 0 ; i < ip.getNumPoints(); i++ )
		{
			jp.addPoint( ip.getX(i), ip.getY(i));
		}
		
		
		
		System.out.println("PolyBoolean has " + ip.getNumInnerPoly()+" holes");
		for( int i = 0 ; i < ip.getNumInnerPoly() ; i++ )
		{
			
			
			Poly ipp = ip.getInnerPoly(i);
			if (ipp.isHole()){
				Hole h = innerPolyToHole(ipp);

				jp.addHole(h);
			}
		}
		//set all points relative to the centroid;
		Point c = Geom.findCentroid(jp);
		jp.setRelativeTo(c) ;

		return jp;
	}

	private static Hole innerPolyToHole(Poly ip )
	{
		Hole jp = new Hole();
		System.out.println("ip.numPoints="+ip.getNumPoints());
		for( int i = 0 ; i < ip.getNumPoints(); i++ )
		{
			jp.addPoint( ip.getX(i), ip.getY(i) );
		}

		return jp;
	}






}