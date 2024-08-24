// This question makes use of adjacency lists - its a list/array of lists where each list contains the all adjacent nodes to the current node. You can iterate over it and apply a particular algorithm like DFS to find CYCLIC dependencies.

package data_structures.Graphs;

import java.util.*;

public class CourseSchedule {

    public static void main(String[] args) {
        int[][] prerequisites = {
                { 0, 1 },
                { 1, 3 },
                { 2, 3 },
                { 3, 1 }
        };
        int numCourses = 4;
        int m = prerequisites.length;
        boolean[] selected = new boolean[numCourses];
        boolean[] helper = new boolean[numCourses];
        boolean result = false;
        List<LinkedList<Integer>> alist = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            alist.add(new LinkedList<>());
        }

        for (int i = 0; i < m; i++) {
            int course = prerequisites[i][0];
            int prereq = prerequisites[i][1];
            alist.get(course).add(prereq);
        }

        for (int i = 0; i < alist.size(); i++) {
            System.out.print(i + " -> ");
            for (Integer p : alist.get(i)) {
                System.out.print(p + " -> ");
            }
            System.out.println();
        }

        for(int i=0; i < numCourses; i++){
            if(selected[i] == false){
                boolean ans = cyclic_dfs(alist, i, selected, helper);
                if(ans) result = false;
            }
        }
        
        result = true;
        System.out.println("Should I take the courses? " + result);

    }


    public static boolean cyclic_dfs(List<LinkedList<Integer>> alist, int i, boolean[] selected, boolean[] helper) {
        selected[i] = true;
        helper[i] = true;
        LinkedList<Integer> neighbour = alist.get(i);

        for(int k=0; k<neighbour.size(); k++){
            int curr = neighbour.get(k);
            if(helper[curr]==true) return true;
            if(selected[curr] == false){
                boolean ans = cyclic_dfs(alist, curr, selected, helper);
                if(ans == true) return true;
            }
        }

        helper[i] = false;
        return false;

    }

}
