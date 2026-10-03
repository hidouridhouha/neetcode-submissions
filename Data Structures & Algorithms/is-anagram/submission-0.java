class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()){
        return false;
    }
    char[] ch=s.toCharArray();
    char[] sh=t.toCharArray();
    Arrays.sort(ch);
    Arrays.sort(sh);
    return Arrays.equals(ch,sh);
    }
}
