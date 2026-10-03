class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
   Map<String,List<String>> res = new HashMap<>(); 
    for(String s: strs){
        char[] sch=s.toCharArray();
        Arrays.sort(sch);
        String sh= new String(sch);
        res.putIfAbsent(sh, new ArrayList<>());
        res.get(sh).add(s);
    }
    return new ArrayList<>(res.values());
    }
}

