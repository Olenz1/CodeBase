package GraphAndSearch;
/*
* Singel source Shortest Path
*   所有边权都是正数
*       朴素Dijkstra    O(n^2)  (稠密图适用）
*       堆优化Dijkstra  O(mlogn) （稠密图为 n^2logn)
*   存在负边
*       Bellman-Ford     O(nm)
*       SPFA         一般：O(m)  最坏：O(nm)       (经过的边数小于k，这种条件不能使用SPFA，建议使用Bellman-Ford）
*/
public class Singel_ShortestPath {
    public static void main(String[] args) {
    }
}
