Bit Masking
-----------------
1. **Decimal to binary conversion**
    * Decimal numbers follow base of 10.
      - 793 = 7`*`10^2 + 9`*`10^1 + 3`*`10^0 = 700+90+3
    * Binary numbers follow base of 2.
      - 13 = 1101 = 1`*`2^3 + 1`*`2^2 + 0`*`2^1 + 1`*`2^0 = 8+4+0+1 = 13
    * Decimal to binary conversion
      - Continuous division method by 2, collecting remainder and printing it in reverse order ie last remainder should be first to be printed
2. **Addition & Subtraction of Binary numbers**
    * Addition : 0+0 =0, 1+0=1, 1+1=10 (1 is used as a carry)
      -                    1101 (13+9 = 22)
                           1001
                          ------
                          10110 (2+4+16 =22)
    * Subtraction : Done using 2's compliment
      - 2's compliment : gives negative of a number in binary form
        a. inverse all the bits (make 1 to 0 and 0 to 1).
        b. add 1 to above
      - Example : 13-5 = 13+(-5)
        - here, negative of 5 would be calculated using 2's compliment and result would be added to 13.
        - 5 = 00...000101 => -5 => 11..111010 => 111.1111010 +0...0000001 => 11.11011
          => 13+(-5) = 000000..0001101 + 11...111011 = 000.001000 = 8
3. **Bitwise operators**

      | a 	| b 	| & 	| \| 	| ^ 	|
      |---	|---	|---	|----	|---	|
      | 0 	| 0 	| 0 	| 0  	| 0 	|
      | 0 	| 1 	| 0 	| 1  	| 1 	|
      | 1 	| 0 	| 0 	| 1  	| 1 	|
      | 1 	| 1 	| 1 	| 1  	| 0 	|
      
    * AND (&) - sets only when both are 1.
    * OR (|) - sets if at least one operand is 1.
    * XOR (^) - sets only if operands are not same.
      1. A ^ A = 0
      2. A ^ 0 = A 
    * NOT (~) - changes each bit to it's opposite (also called 1's compliment)
    * Right Shift (>>) ie a>>b means right shift b number of bits in a. (same as b times running division of a by 2).
    * Left Shift (<<) ie a<<b means left shift b number of bits in a. (same as b times running multiplication of a by 2).
4. **Odd & even numbers checking using bitwise ops**
    * take & of 1 and the given number, if result is 0, it is an even number, if the result is 1, it is an odd number.
5. **Swapping two numbers without using the third variable** can be done using following 3 steps.
    1. a = a ^ b
    2. b = a ^ b
    3. a = a ^ b.
6. **Bit Masking** (Process of manipulation of bits in a byte using bitwise operators)   
    6.1. **Finding ith bit**
      - mask = 1<<i 
      - result  = num & mask 
      - If the result is 0, then ith bit was 0, else if result is non zero means ith bit was 1.
             
    6.2. **Setting ith bit**
      - mask = 1<<i 
      - result = num | mask. 
      - Result will have ith bit set. 
            
    6.3. **Clearing ith bit**
      -  mask = ~(1<<i)
      -  result = num & mask 
        
    6.4. **Counting no. of total bits**
      - no. of bits in a num = log<sub>2</sub> num + 1. 
      
    6.5. **Counting no. of total set bits if totals bits are n**
      - **Non-optimal Sol(0(n))** : Keep on taking & of 1 and num and if result comes to 1, increment the count and update the num by num>>1. Keep on doing the same till num becomes 0. 
             Final value of count will be no. of set bits.  
      - **Optimal Sol** : keep on taking num & (num-1), update the num as earlier result, increment the count till result is non-zero. 
           
    6.6. **Find numbers of bits to change to convert A to B**
      - mask = A ^ B 
      - count no. of set bit in mask by checking running n & (n-1) produces non-zero result.(as explained in above optimal sol) 