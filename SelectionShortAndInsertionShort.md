## Insertion Short
### [22,27,16,2,18,6]

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

Big-O gösterimini yazınız.

Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

1. Average case: Aradığımız sayının ortada olması
2. Worst case: Aradığımız sayının sonda olması
3. Best case: Aradığımız sayının dizinin en başında olması.
## Sonuç
[22,`27,16`,2,18,6] 1

[`22,16`,27,2,18,6] 1

[16,22,`27,2`,18,6] 1

[16,`22,2`,27,18,6] 1

[`16,2`,22,27,18,6] 1

[2,16,22,`27,18`,6] 1

[2,16,`22,18`,27,6] 1

[2,16,18,22,`27,6`] 1

[2,16,18,`22,6`,27] 1

[2,16,`18,6`,22,27] 1

[2,`16,6`,18,22,27] 1

[`2,6,16,18,22,27`]


18 sayısı `average case` kapsamına girer.

Insertion Sort’un time complexity’si :

- Best Case : O(n)
- Worst Case : O(n²)
- Average Case : O(n²)


---

## Selection Short
### [7,3,5,8,2,9,4,15,6]  dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

## Sonuç

[7,3,5,8,`2`,9,4,15,6] n

[2,3 |5,8,7,9,`4`,15,6] n-2

[2,3,4 |8,7,9,`5`,15,6] n-3

[2,3,4,5 |7,9,8,15,`6`] n-4

[2,3,4,5,6 |7,9,8,15] n-5