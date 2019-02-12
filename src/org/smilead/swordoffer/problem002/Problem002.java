package org.smilead.swordoffer.problem002;
/**
 * 时间限制：1秒 空间限制：32768K 热度指数：789374
本题知识点： 字符串
 算法知识视频讲解
题目描述
请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author smile
 *
 */
public class Problem002 {
	public String replaceSpace(StringBuffer str) {
		String source = str.toString();
		String strArray = source.replace(" ","%20");
		return strArray;
    }
}
