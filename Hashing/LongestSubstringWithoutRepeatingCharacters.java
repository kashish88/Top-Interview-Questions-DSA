import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String A) {

        HashSet<Character> hashSet = new HashSet<Character>();
        int maxcount=0;
        int start=0;
        for(char c:A.toCharArray()){
            while(hashSet.contains(c)){
                hashSet.remove(A.charAt(start));
                start++;
            }
            hashSet.add(c);
            maxCount = Math.max(maxCount, hashSet.size());
        }
        return maxCount;
    }
}
