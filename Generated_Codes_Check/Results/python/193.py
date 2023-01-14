'''

Scoring:
For each test case , you will get 1 point if you answer it correctly .

Time Limit: 1.0 sec(s) for each input file.
Memory Limit: 256 MB
Source Limit: 1024 KB
Marking Scheme: Marks are awarded if any testcase passes
Allowed Languages: Ada, Bash, C, C++, C++14, C#, C++11, Clojure, D, Erlang, F#, Go, Groovy, Haskell, Java, Java 8, JavaScript(Rhino), JavaScript(Node.js), Julia, Kotlin, Lisp, Lisp (SBCL), Lua, Objective-C, OCaml, Octave, Pascal, Perl, PHP, Python, Python 3, R(RScript), Racket, Ruby, Rust, Scala, Swift, Swift-4.1, Visual Basic

'''

def checkfibo(num):
    a=0
    b=1
    if num==0:
        return True
    while (b<=num):
        if num==b:
            return True
        c=a+b
        a=b
        b=c
    return False

for test in range(int(input())):
    if checkfibo(int(input())):
        print("YES")
    else:
        print("NO")