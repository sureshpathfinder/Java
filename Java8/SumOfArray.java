import java.util.*;


// The main method must be in a class named "Main".
class SumOfArray {
    public static void main(String[] args) {
        int[] a ={6,-1,-3,4,-2,2,4,6,-12,-7};
        List<List<Integer>> subarray = findSumofZero(a);
        System.out.println("Sub of Array : " + subarray);
    }

//Sum of array 
 
    static List<List<Integer>> findSumofZero(int[] a){
       
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> r = new ArrayList();
        int sum = 0;
 
        map.put(0, new ArrayList<>(Collections.singletonList(-1)));
 
        for(int n=0;n< a.length;n++){
            sum += a[n];
 
            if(map.containsKey(sum)){
                for(int si : map.get(sum)){
                     List<Integer> sarray = new ArrayList<>();
                    for(int j = si+1; j<= n; j++){
                        sarray.add(a[j]);
                    }
                    r.add(sarray);
                }
            }
 
            map.computeIfAbsent(sum, m-> new ArrayList<>()).add(n);
        }
        return r;
    }
}
