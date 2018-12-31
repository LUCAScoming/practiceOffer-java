package offer;


/*题目描述

        请实现一个函数，将一个字符串中的每个空格替换成“%20”。
        例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
        解题思路：

        很简单，从后往前遍历就对了。*/
public class ReplaceBlankSpaceString {
    public String replaceBlank(StringBuffer str) {
        StringBuffer stringBuffer = new StringBuffer();
        int len = str.length() - 1;
        for (int i = len ;i>0;i--){//注意这个范围
            if (str.charAt(i)==' '){
                stringBuffer.append("02%");
            }else{
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.reverse().toString();//reverse(),是将内容反转。
    }

}
