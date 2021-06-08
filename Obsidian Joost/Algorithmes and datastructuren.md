---
tags: 📥️/🗄 
aliases:
  - 
cssclass: 
type: "documentation"
---
# Algorithmes and datastructuren
---
created: 2021-05-04T11:01:49 (UTC +02:00)
tags: [C,C++,Python,Java,HTML,CSS,JavaScript,SQL,PHP,jQuery,XML,DOM,Bootstrap,Tutorials,Articles,Programming,training,learning,quiz,preferences,examples,code]
source: https://www.tutorialspoint.com/data_structures_algorithms/asymptotic_analysis.htm
author: 

---

## Data Structures - Asymptotic Analysis - Tutorialspoint

> ## Excerpt
> Data Structures - Asymptotic Analysis - Asymptotic analysis of an algorithm refers to defining the mathematical boundation/framing of its run-time performance. Using asymptotic analysis, we can very w

___

Asymptotic analysis of an algorithm refers to defining the mathematical boundation/framing of its run-time performance. Using asymptotic analysis, we can very well conclude the best case, average case, and worst case scenario of an algorithm.

Asymptotic analysis is input bound i.e., if there's no input to the algorithm, it is concluded to work in a constant time. Other than the "input" all other factors are considered constant.

Asymptotic analysis refers to computing the running time of any operation in mathematical units of computation. For example, the running time of one operation is computed as _f_(n) and may be for another operation it is computed as _g_(n2). This means the first operation running time will increase linearly with the increase in **n** and the running time of the second operation will increase exponentially when **n** increases. Similarly, the running time of both operations will be nearly the same if **n** is significantly small.

Usually, the time required by an algorithm falls under three types −

-   **Best Case** − Minimum time required for program execution.
    
-   **Average Case** − Average time required for program execution.
    
-   **Worst Case** − Maximum time required for program execution.
    

## Asymptotic Notations

Following are the commonly used asymptotic notations to calculate the running time complexity of an algorithm.

-   Ο Notation
-   Ω Notation
-   θ Notation

### Big Oh Notation, Ο

The notation Ο(n) is the formal way to express the upper bound of an algorithm's running time. It measures the worst case time complexity or the longest amount of time an algorithm can possibly take to complete.

![Big O Notation](https://www.tutorialspoint.com/data_structures_algorithms/images/big_o_notation.jpg)

For example, for a function **_f_(n)**

Ο(_f_(n)) = { _g_(n) : there exists c > 0 and n0 such that _f_(n) ≤ c._g_(n) for all n > n0. }

### Omega Notation, Ω

The notation Ω(n) is the formal way to express the lower bound of an algorithm's running time. It measures the best case time complexity or the best amount of time an algorithm can possibly take to complete.

![Omega Notation](https://www.tutorialspoint.com/data_structures_algorithms/images/omega_notation.jpg)

For example, for a function **_f_(n)**

Ω(_f_(n)) ≥ { _g_(n) : there exists c > 0 and n0 such that _g_(n) ≤ c._f_(n) for all n > n0. }

### Theta Notation, θ

The notation θ(n) is the formal way to express both the lower bound and the upper bound of an algorithm's running time. It is represented as follows −

![Theta Notation](https://www.tutorialspoint.com/data_structures_algorithms/images/theta_notation.jpg)

θ(_f_(n)) = { _g_(n) if and only if _g_(n) =  Ο(_f_(n)) and _g_(n) = Ω(_f_(n)) for all n > n0. }


