package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Cell {
	public ArrayList<Integer> cellIdx;
	public int slideID;
	public HashMap<ArrayList<Integer>,Cell> childCells;
	public HashSet<Tuple> tuples;
	public double[] cellCenter;

	public Cell(ArrayList<Integer> cellIdx,  double[] cellCenter, int slideID){
		this.cellIdx = cellIdx;
		this.slideID = slideID;
		this.tuples = new HashSet<Tuple>();
		this.cellCenter = cellCenter;
	}

	public int getCard() {
		return this.tuples.size();
	}

	public void addTuple(Tuple t) {
		this.tuples.add(t);
	}
	
}
	
