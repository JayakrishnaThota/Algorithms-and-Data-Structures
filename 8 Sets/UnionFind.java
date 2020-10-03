  //No Path Compression and Ranking
  class DisjointSet {
    int[] parent;
    int size;
    public DisjointSet(int n) {
        parent = new int[n];
        for(int i=0;i<n;i++) {
            parent[i] = i;
        }
        size = n;
    }

    //O(n)
    public void union(int a, int b) {
        int parentA = find(a);
        int parentB = find(b);
        if(parentA!=parentB) {
            parent[parentA] = parentB;
            size--;
        }
    }

    //O(n)
    public int find(int a) {
        if(a==parent[a]) return a;
        return find(parent[a]);
    }

}


    
  //With path Compression for O(logn) operations
  class DisjointSet {
      int[] parent;
      int size;
      public DisjointSet(int n) {
          parent = new int[n];
          for(int i=0;i<n;i++) {
              parent[i] = i;
          }
          size = n;
      }

      //O(logn)
      public void union(int a, int b) {
          int parentA = find(a);
          int parentB = find(b);
          if(parentA!=parentB) {
              parent[parentA] = parentB;
              size--;
          }
      }

      //O(logn)
      public int find(int a) {
          if(a==parent[a]) return a;
          parent[a] = find(parent[a]);
          return parent[a];
      }

  }
  
  //With PAth compression and union by size for O(1) amortized complexity
  class DisjointSet {
      int[] parent;
      int[] rank;
      int size;
      public DisjointSet(int n) {
          parent = new int[n];
          rank = new int[n];
          for(int i=0;i<n;i++) {
              rank[i] = 1;
              parent[i] = i;
          }
          size = n;
      }

      //O(1) amortized
      public void union(int a, int b) {
          int parentA = find(a);
          int parentB = find(b);
          if(parentA==parentB) return;
          if(rank[parentA]>rank[parentB]) {
              parent[parentB] = parentA;
              rank[parentA]+=rank[parentB];
          }
          else {
              parent[parentA] = parentB;
              rank[parentB]+=rank[parentA];
          }
          size--;
      }

      //O(1) amortized
      public int find(int a) {
          if(a==parent[a]) return a;
          parent[a] = find(parent[a]);
          return parent[a];
      }

  }
