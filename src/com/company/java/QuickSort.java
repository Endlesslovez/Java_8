package com.company.java;

public class QuickSort {

    public static void main(String[] args) {
        System.out.println(sum(3) + sum(5) - sum(15));
        sum35();
    }
/*
*
* toi uu tinh tong cac so chia het cho 3 va 5 nho hon 999
* Tổng số từ 1 -> 999 chia hết cho 3 và 5 có thể tách ra 3 vế:

sum(3) + sum(5) - sum(15) => tổng các số chia hết cho 3 + tổng các số chia hết cho 5 và trừ đi tổng các số chia hết cho 15 ( vì chia hết cho 15 chắc chắn sẽ chia hết cho 3 hoặc 5)

Để tính sum(3) chúng ta thấy các số như sau:

s = { 3 , 6, 9, 12, … , 996, 999} các số trong chuỗi này đều chia hết cho 3

Đặt 3 ra khỏi chuỗi số chúng ta sẽ có
s = 3 {1, 2, 3,…, 333}

Tương tự với chuỗi chia hết cho 5 và 15
5{1, 2, 3,…,199)
15{1, 2, 3, …, 66}

Như vậy chúng ta phải tính tổng của 1 + 2 + 3 +…+ n
Công thức để tính là : n*(n+1)/2
Số cuối cùng của mỗi chuỗi là n = 999/ 3 với chuỗi số chia hết cho 3; n= 999/5 với chuỗi 5; n = 999/15 với chuỗi 15.
*
* */

    public static int sum(int n) {
        int target = 999;
        int p = target / n;
        return n * (p * (p + 1)) / 2;
    }
/*
* cach giai thong thuong
* */
    public static void sum35() {
        int s = 0, i = 0;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                s += i;
            }
            i++;
        }
        System.out.println(s);
    }

}
