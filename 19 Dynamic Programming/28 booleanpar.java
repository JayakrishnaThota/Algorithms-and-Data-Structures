package DynamicProgramming;

public class booleanpar {
    //O(n3) and O(n2)
    public static int booleanpar(char[] symbols, char[] oper){
        int n = symbols.length;
        int[][] T = new int[n][n];
        int[][] F = new int[n][n];
        //Base case
        for(int i=0;i<n;i++){
            if(symbols[i]=='T'){
                T[i][i] = 1;
                F[i][i] = 0;
            }
            if(symbols[i]=='F'){
               T[i][i] = 0;
               F[i][i] = 1;
            }
        }
        for (int gap=1; gap<n; ++gap) {
            for (int i = 0, j = gap; j < n; ++i, ++j) {
                T[i][j] = F[i][j] = 0;
                for (int g = 0; g < gap; g++) {
                    int k = i + g;

                    // Store Total[i][k] and Total[k+1][j]
                    int tik = T[i][k] + F[i][k];
                    int tkj = T[k+1][j] + F[k+1][j];

                    // Follow the recursive formulas according to the current
                    // operator
                    if (oper[k] == '&')
                    {
                        T[i][j] += T[i][k]*T[k+1][j];
                        F[i][j] += (tik*tkj - T[i][k]*T[k+1][j]);
                    }
                    if (oper[k] == '|')
                    {
                        F[i][j] += F[i][k]*F[k+1][j];
                        T[i][j] += (tik*tkj - F[i][k]*F[k+1][j]);
                    }
                    if (oper[k] == '^')
                    {
                        T[i][j] += F[i][k]*T[k+1][j] + T[i][k]*F[k+1][j];
                        F[i][j] += T[i][k]*T[k+1][j] + F[i][k]*F[k+1][j];
                    }
                }
            }
        }
        return T[0][n-1];
    }

    public static void main(String[] args) {
        char[] symbols = {'T','T','F','T'};
        char[] operators = {'|','&','^'};
        System.out.println(booleanpar(symbols, operators));
    }
}
