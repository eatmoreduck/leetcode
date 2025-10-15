import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 将字符串转换为字符数组并排序
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);  // 排序后的字符串作为键

            // 如果键不存在，创建新列表
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            // 添加原始字符串到对应列表
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
//leetcode submit region end(Prohibit modification and deletion)
