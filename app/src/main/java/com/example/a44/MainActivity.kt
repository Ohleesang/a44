package com.example.a44

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(sizes: Array<IntArray>): Int {
                var answer: Int = 0
                //지갑 크기를 return
                //가로 길이 중 큰것 x 세로 길이중 큰것 이 best는 아니다.
                //즉 [w,h] 값 중, w>h 가 아닌 경우를 바꾸어서 계산하면 되지않을까?
                var temp = 0

                //w 값이 항상크게!
                for(i in 0..sizes.size-1){
                    if(sizes[i][0]<sizes[i][1]){
                        temp = sizes[i][1]
                        sizes[i][1] = sizes[i][0]
                        sizes[i][0] = temp
                    }
                }
                //가장 큰값 찾기
                var max_a = 0
                var max_b = 0
                for(i in 0 .. sizes.size-1){
                    if(max_a<sizes[i][0]) max_a = sizes[i][0]
                    if(max_b<sizes[i][1]) max_b = sizes[i][1]
                }
                answer = max_a*max_b

                return answer
            }
        }
        val a = Solution()
        a.solution(arrayOf<IntArray>(intArrayOf(60,50),intArrayOf(30,70),intArrayOf(60,30),intArrayOf(80,40)))
        a.solution(arrayOf<IntArray>(intArrayOf(10,7),intArrayOf(12,3),intArrayOf(8,15),intArrayOf(14,7),intArrayOf(5,15)))
        a.solution(arrayOf<IntArray>(intArrayOf(14,4),intArrayOf(19,6),intArrayOf(6,16),intArrayOf(18,7),intArrayOf(7,11)))
    }
}