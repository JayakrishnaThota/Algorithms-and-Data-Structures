public class GridSearcher {
final static int[] dirx = {-1, -1, -1, 0, 0, 1, 1, 1};
final static int[] diry = {-1, 0, 1, -1, 1, -1, 0, 1 };
static char[][] grid;
public GridSearcher(char[][] grid) {
    this.grid = grid;
}

public static boolean allowed(int r, int c){
	if(r>=0 && r<grid.length && c>=0 && c<grid[0].length)
		return true;
	else
		return false;
}
public static boolean searchGrid(int row, int column, String pattern,  boolean[][] visited, int index){
	visited[row][column] = true;
	index++;
	if(index>=pattern.length())
		return true;
	for(int dir = 0; dir<dirx.length;dir++){
		int r = row + dirx[dir];
		int c = column + diry[dir];
		if(!allowed(r,c) || (visited[r][c]))
			continue;
		if(grid[r][c] == pattern.charAt(index)){
			if(searchGrid(r,c,pattern,visited, index))
				return true;
		}
	}
	 visited[row][column] = false;

     return false;
}
public static boolean find(String needle){
	boolean[][] visited = new boolean[grid.length][grid[0].length];
	for (int i=0; i < grid.length; i++){
        for (int j=0; j < grid[0].length; j++) {
            if (grid[i][j] == needle.charAt(0) && searchGrid(i, j, needle, visited, 0)) {
                return true;
            }
        }
    }

    return false;
}

public static void main(String[] args) {
    char[][] grid
        = { { 'A', 'C', 'P', 'R', 'C' },
            { 'X', 'S', 'O', 'P', 'C' },
            { 'V', 'O', 'V', 'N', 'I' },
            { 'W', 'G', 'F', 'M', 'N' },
            { 'Q', 'A', 'T', 'I', 'T' } };
    GridSearcher searcher = new GridSearcher(grid);

    String [] needles = {"MICROSOFT", "ZZZ", "Oa"};
    for (String needle : needles) {
        if (searcher.find(needle)) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present" );
        }
    }
}
}
