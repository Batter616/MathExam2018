package MathExam6378.java;

import java.util.Random;
import java.util.Scanner;
public class MathExam6378 {
	public static void Sufa() {
		int result = 0;
		int t = 0;
		int j = 1, a = 0;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入题目数量 适用年级（空格间隔）如：10 2");
		int n = scan.nextInt();
		int grade = scan.nextInt();
		int[] w = new int[n];// num1数组
		int[] h = new int[n];// num2数组
		int[] b = new int[n];// 答案数组
		int[] e = new int[n];// 随机产生数字（把数字转为运算符号）数组
		int[] k = new int[n];// 余数数组

		if (grade == 1) {
			for (int i = 0; i < n; i++) {
				int num1 = rand.nextInt(20);// 0-20随机的数字
				int num2 = rand.nextInt(20);// 0-209随机的数字
				if (num1 > num2) {
				} else {
					num1 = t;
					num1 = num2;
					t = num2;
				}
				w[i] = num1;
				h[i] = num2;
				int operator = rand.nextInt(2);// 0-1 0:加法,1:减法
				e[i] = operator;
				if (operator == 0) {
					result = w[i] + h[i];
					System.out.println("(" + j + ") " + w[i] + " + " + h[i]);
					b[i] = result;
				} else {
					result = w[i] - h[i];
					System.out.println("(" + j + ") " + w[i] + " - " + h[i]);
					b[i] = result;
				}
				j++;
			}
			System.out.println("---------标准答案---------");
			j = 1;
			for (int i = 0; i < n; i++) {
				if (e[i] == 0) {// 做加法运算
					result = w[i] + h[i];
					System.out.println("(" + j + ") " + w[i] + " + " + h[i] + " = " + result);
					b[i] = result;
				} else {// 做减法运算
					result = w[i] - h[i];
					System.out.println("(" + j + ") " + w[i] + " - " + h[i] + " = " + result);
					b[i] = result;
				}
				j++;
			}
		}
		if (grade == 2) {
			for (int i = 0; i < n; i++) {
				int num1 = rand.nextInt(20);// 0-20随机的数字
				int num2 = rand.nextInt(10);// 0-20随机的数字
				if (num1 > num2) {
				} else {
					num1 = t;
					num1 = num2;
					t = num2;
				}
				w[i] = num1;
				h[i] = num2;
				int operator = rand.nextInt(2);// 0-1 0:乘法,1:除法
				e[i] = operator;
				if (operator == 0) {
					result = w[i] * h[i];
					System.out.println("(" + j + ") " + w[i] + " *" + h[i]);
					b[i] = result;
				} else {
					result = w[i] / h[i];
					System.out.println("(" + j + ") " + w[i] + " / " + h[i]);
					b[i] = result;
				}
				j++;
			}
			System.out.println("---------标准答案---------");
			j = 1;
			for (int i = 0; i < n; i++) {
				if (e[i] == 0) {
					result = w[i] * h[i];
					System.out.println("(" + j + ") " + w[i] + " * " + h[i] + " = " + result);
					b[i] = result;
				} else {
					int y;
					result = w[i] / h[i];
					y = w[i] % h[i];
					k[i] = y;
					if (y == 0) {// 余数判断
						System.out.println("(" + j + ") " + w[i] + " / " + h[i] + " = " + result);
					} else {
						System.out.println("(" + j + ") " + w[i] + " / " + h[i] + " = " + result + "..." + k[i]);
					}
					b[i] = result;
				}
				j++;
			}
		} else {
			System.out.println("输入有误，请重新开始");
			System.out.println("请正确输入题目数量 适用年级（空格间隔）如：10 2");
		}
	}

	public static void main(String[] args) {
		Sufa();
	}
}
