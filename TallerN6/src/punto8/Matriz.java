package punto8;

public class Matriz {
	  private int columns;
	  private int rows;
	  private int[][] matriz;

	  Matriz(int rows, int columns) {
	    setRows(rows);
	    setColumns(columns);
	    setMatriz(new int[rows][columns]);
	  }

	  public String toString() {
	    String result = "";

	    for (int[] row : getMatriz()) {
	      for (int element : row) {
	        result += "(" + element + ")";
	      }
	      // System.out.println(row + "|" + getMatriz()[getMatriz().length - 1]);
	      if(row != getMatriz()[getMatriz().length - 1]) {
	        result += "\n";
	      }
	    }

	    return result;
	  }

	  public boolean setElement(int row, int column, int value) {
	    if (row < 0 || row >= getRows() || column < 0 || column >= getColumns())
	      return false;
	    else {
	      matriz[row][column] = value;
	      return true;
	    }
	  }

	  public int getElement(int row, int column) {
	    if (row < 0 || row >= getRows() || column < 0 || column >= getColumns())
	      return -1;
	    else
	      return matriz[row][column];
	  }

	  public int[][] getMatriz() {
	    return matriz;
	  }

	  public boolean setMatriz(int[][] matriz) {
	    if (matriz == null)
	      return false;
	    else {
	      this.matriz = matriz;
	      return true;
	    }
	  }

	  public int getColumns() {
	    return columns;
	  }

	  public void setColumns(int columns) {
	    this.columns = columns;
	  }

	  public int getRows() {
	    return rows;
	  }

	  public void setRows(int rows) {
	    this.rows = rows;
	  }
	}