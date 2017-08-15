package com.jy;

import java.util.Arrays;

public class StraightInsertionSort {

	public static void main(String[] args) {
		DataWrap[] dataWraps = new DataWrap[] { new DataWrap(9, ""), new DataWrap(-16, ""), new DataWrap(21, ""),
				new DataWrap(23, ""), new DataWrap(-30, ""), new DataWrap(-49, ""), new DataWrap(21, ""),
				new DataWrap(30, ""), new DataWrap(13, "") };

		System.out.println("排序前：" + Arrays.toString(dataWraps));

		straightInsertionSort(dataWraps);

		System.out.println("*********************排序结束*********************");

		System.out.println("排序后（从小到大）：" + Arrays.toString(dataWraps));
	}

	/**
	 * 直接插入排序
	 * 
	 * @param dataWraps
	 *            待排序的数组
	 */
	public static void straightInsertionSort(DataWrap[] dataWraps) {
		System.out.println("*********************开始排序*********************");
		int arrayLength = dataWraps.length;
		for (int i = 1; i < arrayLength; i++) {
			// 保存当前比较的值，当整体后移是保证改值不会丢失
			DataWrap temp = dataWraps[i];

			if (dataWraps[i].compareTo(dataWraps[i - 1]) < 0) {
				int j = i - 1;
				// 整体往后移动，直至找到比当前值temp小的值为止
				for (; j >= 0 && dataWraps[j].compareTo(temp) > 0; j--)
					dataWraps[j + 1] = dataWraps[j];
				// 然后将当前值temp插入到适当的位置
				dataWraps[j + 1] = temp;
				// 每一趟后都打印出当前的排序结果
				System.out.println(Arrays.toString(dataWraps));
			}
		}
	}
}
