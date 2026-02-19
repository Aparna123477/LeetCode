class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result=new ArrayList<>();
        result.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(result.get(result.size() - 1), words[i])) {
                result.add(words[i]);
            }
        }
        return result;}
        static boolean  isAnagram(String a,String b){
            char[] arr1=a.toCharArray();
            char[] arr2=b.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);

        }
    }
